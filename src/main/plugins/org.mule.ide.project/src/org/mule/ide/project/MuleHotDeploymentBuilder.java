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

import java.util.Map;
import java.util.UUID;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.mule.ide.project.internal.util.Move;
import org.mule.ide.project.internal.util.zip.ExportProjectToZip;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleHotDeploymentBuilder extends IncrementalProjectBuilder
{
    private static final String BUILDER_ID = ".MuleHotDeploymentBuilder";
    public static final String FULL_BUILDER_ID = MuleProjectPlugin.PLUGIN_ID + BUILDER_ID;

    @Override
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException
    {
        MuleIdeProject project = getMuleIdeProject();
        if (project == null)
        {
            return null;
        }

        if (project.shouldRunHotDeploymentBuilder() == false)
        {
            return null;
        }

        if (project.hasCompileErrors())
        {
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

        // do not copy the project into the apps folder if it doesn't have a config file yet. Mule's
        // hot deployment builder will only fail with exceptions
        if (project.getPreferences().getConfigFile() == null)
        {
            return;
        }

        // export the zip using a temporary file to avoid Mule picking it up while the zip
        // is being packed
        IPath temporaryZipFile = calculateTemporaryApplicationZipName(project);

        new ExportProjectToZip(project).run(temporaryZipFile, monitor);

        // move the file onto its final name. This should be an atomic operation.
        monitor.beginTask("Activating Mule application zip", 1);
        IPath finalZipFile = calculateApplicationZipName(project);
        new Move(temporaryZipFile, finalZipFile).execute(monitor);
        monitor.done();

        // TODO remove MuleZipPackager
//        MuleZipPackager packager = new MuleZipPackager(project, null);
//        packager.exportToFile(temporaryZipFile, monitor);
//
    }

    private IPath calculateTemporaryApplicationZipName(MuleIdeProject project)
    {
        // do not use a .zip suffix here to avoid Mule picking up the zip file as it's being
        // assembled
        String zipFileName = String.format("%1s-%2s.tmp", project.getPreferences().getHotDeploymentName(),
            UUID.randomUUID().toString());
        return fileInApplicationDirectory(zipFileName, project);
    }

    private IPath calculateApplicationZipName(MuleIdeProject project)
    {
        String zipFileName = project.getPreferences().getHotDeploymentName() + ".zip";
        return fileInApplicationDirectory(zipFileName, project);
    }

    private IPath fileInApplicationDirectory(String fileName, MuleIdeProject project)
    {
        IMuleRuntime runtime = project.getMuleRuntime();
        IPath appDirectoryPath = new Path(runtime.getApplicationDirectory().getAbsolutePath());
        return appDirectoryPath.append(fileName);
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
