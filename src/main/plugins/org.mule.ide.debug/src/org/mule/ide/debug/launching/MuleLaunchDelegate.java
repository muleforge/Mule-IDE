/**
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * MULE_LICENSE.txt file.
 */

package org.mule.ide.debug.launching;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.mule.ide.debug.DebugMessages;
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleLaunchDelegate extends JavaLaunchDelegate {
	
	private static final String MULE_HOME_ARG = "-Dmule.home";  //$NON-NLS-1$
	
	
	private IMuleRuntime getMuleRuntime(ILaunchConfiguration configuration) throws CoreException {
		IMuleRuntime runtime = null;

		String runtimeId = configuration.getAttribute(
				IMuleLaunchConstants.ATTR_MULE_RUNTIME_ID, (String) null);
		if (runtimeId == null) {
			runtime = MulePreferences.getDefaultMuleRuntime();
		} else {
			runtime = MulePreferences.getMuleRuntime(runtimeId);			
		}
		if (runtime == null) {
			abort(DebugMessages.MuleLaunchConfig_errorNoRuntime, null, 0);			
		}
		
		return runtime;
	}
	
	public String getVMArguments(ILaunchConfiguration configuration) throws CoreException {
		IMuleRuntime runtime = getMuleRuntime(configuration);

		StringBuffer newArgs = new StringBuffer();
		
		String args = super.getVMArguments(configuration);
		int muleHome = -1;
		if (args != null && args.length() > 0) {
			newArgs = new StringBuffer(args);
			muleHome = args.indexOf(MULE_HOME_ARG);
			newArgs.append(" "); //$NON-NLS-1$
		} else {
			newArgs = new StringBuffer();
		}
		if (muleHome < 0) {
			newArgs.append(MULE_HOME_ARG); //$NON-NLS-1$				
			newArgs.append("="); //$NON-NLS-1$
			newArgs.append(runtime.getDirectory().getAbsolutePath());
		}

		
		return newArgs.toString();
	}

	public String[] getClasspath(ILaunchConfiguration configuration)
			throws CoreException {
		IMuleRuntime runtime = getMuleRuntime(configuration);

		String[] classpath = super.getClasspath(configuration);
		if (classpath == null) {
			classpath = new String[0];
		}
		
		String muleHomeString = runtime.getDirectory().getAbsolutePath();
		
		String[] newClasspath = new String[classpath.length+2];
		newClasspath[0] = muleHomeString+File.separatorChar+"conf";  // log4j configuration
		newClasspath[1] = muleHomeString+File.separatorChar+"lib"+File.separatorChar+"boot"+File.separatorChar+"commons-cli-1.0.jar";  // log4j configuration
		System.arraycopy(classpath, 0, newClasspath, 2, classpath.length);
				
		return newClasspath;
	}

	/**
	 * 
	 * VM Arguments : -Dmule.home=C:\dev\mule\mule-2.0.0
	 * 
	 * Classpath : MULE_HOME\lib\boot\commons-cli-1.0.jar
	 *             MULE_HOME\lib\boot\mule-module-boot-2.0.0.jar ?
	 *             MULE_HOME\conf
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#getProgramArguments(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public String getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
		// Build the argument string.
		StringBuffer buffer = new StringBuffer();
		buffer.append(super.getProgramArguments(configuration));
			
		// Load the attributes from the launch configuration.
		String projectName = configuration.getAttribute(
				IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, (String) null);
		if (projectName == null || projectName.length() == 0) {
			abort(DebugMessages.MuleLaunchConfig_errorNoProject, null, 0);
		}
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!project.exists()) {
			abort(DebugMessages.MuleLaunchConfig_errorProjectDoesNotExist, null, 0);
		}
		
		List<IFile> configFiles = getConfigurationFiles(configuration);
		if (configFiles.size() == 0) {
			abort(DebugMessages.MuleLaunchConfig_errorEmptyConfigSet, null, 0);
		}

		buffer.append(" -config \"");
		for (int i=0;i<configFiles.size();i++) {
			IFile configFile = configFiles.get(i);
			if (i > 0) {
				buffer.append(",");
			}
			buffer.append(configFile.getLocationURI().getPath());
		}
		buffer.append("\"");
		
		return buffer.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#getMainTypeName(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public String getMainTypeName(ILaunchConfiguration configuration) throws CoreException {
		return configuration.getAttribute(IMuleLaunchConstants.ATTR_MULE_EXEC_CLASS,
				IMuleLaunchConstants.DEFAULT_MULE_EXEC_CLASS);
	}
	
	public static void setConfigurationFiles(ILaunchConfigurationWorkingCopy configuration, List<IFile> configList) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i<configList.size(); i++) {
			IFile file = configList.get(i);
			if (i>0) {
				buf.append(',');
			}
			buf.append(file.getProjectRelativePath().toPortableString());
		}
		configuration.setAttribute(IMuleLaunchConstants.ATTR_MULE_CONFIG_SET, buf.toString());
	}
	
	public static List<IFile> getConfigurationFiles(ILaunchConfiguration configuration) throws CoreException {
		String projectName = configuration.getAttribute(
				IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, (String) null);
		if (projectName == null || projectName.length() == 0) {
			return Collections.emptyList();
		}
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!project.exists()) {
			return Collections.emptyList();
		}
		String configSet = configuration.getAttribute(
				IMuleLaunchConstants.ATTR_MULE_CONFIG_SET, (String) null);
		if (configSet == null || configSet.length() == 0) {
			return Collections.emptyList();
		}
		
		String[] relPathStrings = configSet.split(",");
		ArrayList<IFile> files = new ArrayList<IFile>(relPathStrings.length);
		for (String relPathString : relPathStrings) {
			IPath relPath = Path.fromPortableString(relPathString);
			IFile configFile = project.getFile(relPath);
			files.add(configFile);
		}
		return files;
	}
}