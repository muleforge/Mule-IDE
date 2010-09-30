/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project;

import java.io.File;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.mule.ide.project.internal.runtime.MuleApplication;
import org.mule.ide.project.internal.util.Copy;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleHotDeploymentBuilder extends IncrementalProjectBuilder
{
    private static final String BUILDER_ID = ".MuleHotDeploymentBuilder";
    public static final String FULL_BUILDER_ID = MuleProjectPlugin.PLUGIN_ID + BUILDER_ID;
    
    @Override
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException
    {
        MuleIdeProject muleProject = getMuleIdeProject();
        if (muleProject.getMuleRuntime().getVersion().startsWith("3") == false)
        {
            // hot deployment builder is only active for Mule 3 projects
            return null;
        }
        
        if ((kind == FULL_BUILD) || (kind == CLEAN_BUILD))
        {
            fullBuild(monitor);
        }
        else if ((kind == INCREMENTAL_BUILD) || (kind == AUTO_BUILD))
        {
            incrementalBuild(monitor);
        }
        
        return null;
    }
        
    private void fullBuild(IProgressMonitor monitor) throws CoreException
    {
        MuleIdeProject project = getMuleIdeProject();
        IMuleRuntime runtime = project.getMuleRuntime();
        MuleApplication app = new MuleApplication(runtime, project.getName());
        
        copyOutputFolders(project, app, monitor);
        copyMuleXml(project, app, monitor);
        
        app.touchConfigFile();
    }
    
    private void copyOutputFolders(MuleIdeProject project, MuleApplication app, IProgressMonitor monitor) throws CoreException
    {
        for (IPath outputFolder : project.getBuildOutputFolders())
        {
            File absolutePathOfOutputFolder = detectAbsolutePath(outputFolder);
            new Copy(absolutePathOfOutputFolder, app.getClassesFolder()).execute(monitor);
        }
    }

    private void copyMuleXml(MuleIdeProject project, MuleApplication app, IProgressMonitor monitor) throws CoreException
    {
        File projectRoot = project.getFilesystemPath();
        File sourceFile = new File(projectRoot, "mule-config.xml");
        if (sourceFile.exists())
        {
            File destFile = new File(app.getFolder(), "mule-config.xml");
            new Copy(sourceFile, destFile).execute(monitor);
        }
    }

    private File detectAbsolutePath(IPath path)
    {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IResource resource = root.findMember(path);
        return resource.getRawLocation().toFile();
    }

    private void incrementalBuild(IProgressMonitor monitor) throws CoreException
    {
        fullBuild(monitor);
    }
    
    private MuleIdeProject getMuleIdeProject()
    {
        IJavaProject javaProject = JavaCore.create(getProject());
        return new MuleIdeProject(javaProject);
    }
}