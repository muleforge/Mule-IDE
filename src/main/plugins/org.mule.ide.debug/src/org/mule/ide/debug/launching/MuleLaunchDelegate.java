/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.debug.launching;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.mule.ide.debug.DebugMessages;
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleLaunchDelegate extends JavaLaunchDelegate
{
    private static final String MULE_HOME_ARG = "-Dmule.home"; //$NON-NLS-1$

    private IMuleRuntime getMuleRuntime(ILaunchConfiguration configuration) throws CoreException
    {
        IMuleRuntime runtime = null;

        String runtimeId = configuration.getAttribute(IMuleLaunchConstants.ATTR_MULE_RUNTIME_ID,
            (String) null);
        if (runtimeId == null)
        {
            runtime = getRuntimeFromJavaProject(configuration);
            // TODO save the id of the runtime (which does not yet exist) to the
            // launch config
        }
        else
        {
            runtime = MulePreferences.getMuleRuntime(runtimeId);
        }
        if (runtime == null)
        {
            abort(DebugMessages.MuleLaunchConfig_errorNoRuntime, null, 0);
        }

        return runtime;
    }

    private IMuleRuntime getRuntimeFromJavaProject(ILaunchConfiguration configuration) throws CoreException
    {
        IJavaProject javaProject = getJavaProject(configuration);
        IClasspathEntry[] classpath = javaProject.getRawClasspath();
        for (IClasspathEntry classpathEntry : classpath)
        {
            IPath path = classpathEntry.getPath();
            if (path.segment(0).equals(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER))
            {
                IMuleRuntime runtime = MulePreferences.getDefaultMuleRuntime();
                if (path.segmentCount() > 2)
                {
                    String runtimeName = path.segment(2);
                    runtime = MulePreferences.getMuleRuntime(runtimeName);
                }
                return runtime;
            }
        }
        return null;
    }

    @Override
    public String getVMArguments(ILaunchConfiguration configuration) throws CoreException
    {
        String args = super.getVMArguments(configuration);
        StringBuffer newArgs = new StringBuffer();

        if (StringUtils.isNotBlank(args))
        {
            newArgs.append(args);
        }

        if (StringUtils.contains(args, MULE_HOME_ARG) == false)
        {
            IMuleRuntime runtime = getMuleRuntime(configuration);

            if (newArgs.length() > 0)
            {
                newArgs.append(" ");
            }
            newArgs.append(MULE_HOME_ARG);
            newArgs.append("=");
            newArgs.append(runtime.getDirectory().getAbsolutePath());
        }

        // Allow the launched config to see where our workspace is and that we are
        // launched from the IDE
        newArgs.append(" -Dosgi.dev=true");
        newArgs.append(" -Dosgi.instance.area=");
        newArgs.append(ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toString());

        return newArgs.toString();
    }

    @Override
    public String[] getClasspath(ILaunchConfiguration configuration) throws CoreException
    {
        IMuleRuntime runtime = getMuleRuntime(configuration);

        String[] classpath = super.getClasspath(configuration);
        if (classpath == null)
        {
            classpath = new String[0];
        }

        String muleHomeString = runtime.getDirectory().getAbsolutePath();

        String[] newClasspath = new String[classpath.length + 2];
        newClasspath[0] = muleHomeString + File.separatorChar + "conf"; // log4j
                                                                        // configuration
        newClasspath[1] = muleHomeString + File.separatorChar + "lib" + File.separatorChar + "boot"
                          + File.separatorChar + "commons-cli-1.0.jar"; // log4j
                                                                        // configuration
        System.arraycopy(classpath, 0, newClasspath, 2, classpath.length);

        return newClasspath;
    }

    /**
     * VM Arguments : -Dmule.home=C:\dev\mule\mule-2.0.0 Classpath :
     * MULE_HOME\lib\boot\commons-cli-1.0.jar
     * MULE_HOME\lib\boot\mule-module-boot-2.0.0.jar ? MULE_HOME\conf
     */
    @Override
    public String getProgramArguments(ILaunchConfiguration configuration) throws CoreException
    {
        // Build the argument string.
        StringBuffer buffer = new StringBuffer();
        buffer.append(super.getProgramArguments(configuration));

        // Load the attributes from the launch configuration.
        String projectName = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
            (String) null);
        if (projectName == null || projectName.length() == 0)
        {
            abort(DebugMessages.MuleLaunchConfig_errorNoProject, null, 0);
        }
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
        if (!project.exists())
        {
            abort(DebugMessages.MuleLaunchConfig_errorProjectDoesNotExist, null, 0);
        }

        List<IFile> configFiles = getConfigurationFiles(configuration);
        if (configFiles.size() == 0)
        {
            abort(DebugMessages.MuleLaunchConfig_errorEmptyConfigSet, null, 0);
        }

        buffer.append(" -config \"");
        for (int i = 0; i < configFiles.size(); i++)
        {
            IFile configFile = configFiles.get(i);
            if (i > 0)
            {
                buffer.append(",");
            }
            buffer.append(configFile.getLocationURI().getPath());
        }
        buffer.append("\"");

        return buffer.toString();
    }

    @Override
    public String getMainTypeName(ILaunchConfiguration configuration) throws CoreException
    {
        return configuration.getAttribute(IMuleLaunchConstants.ATTR_MULE_EXEC_CLASS,
            IMuleLaunchConstants.DEFAULT_MULE_EXEC_CLASS);
    }

    public static void setConfigurationFiles(ILaunchConfigurationWorkingCopy configuration,
                                             List<IFile> configList)
    {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < configList.size(); i++)
        {
            IFile file = configList.get(i);
            if (i > 0)
            {
                buf.append(',');
            }
            buf.append(file.getProjectRelativePath().toPortableString());
        }
        configuration.setAttribute(IMuleLaunchConstants.ATTR_MULE_CONFIG_SET, buf.toString());
    }

    public static List<IFile> getConfigurationFiles(ILaunchConfiguration configuration) throws CoreException
    {
        String projectName = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
            (String) null);
        if (projectName == null || projectName.length() == 0)
        {
            return Collections.emptyList();
        }
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
        if (!project.exists())
        {
            return Collections.emptyList();
        }
        String configSet = configuration.getAttribute(IMuleLaunchConstants.ATTR_MULE_CONFIG_SET,
            (String) null);
        if (configSet == null || configSet.length() == 0)
        {
            return Collections.emptyList();
        }

        String[] relPathStrings = configSet.split(",");
        ArrayList<IFile> files = new ArrayList<IFile>(relPathStrings.length);
        for (String relPathString : relPathStrings)
        {
            IPath relPath = Path.fromPortableString(relPathString);
            IFile configFile = project.getFile(relPath);
            files.add(configFile);
        }
        return files;
    }
}
