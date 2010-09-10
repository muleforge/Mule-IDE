/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.wizards.datatransfer.IImportStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.runtime.IMuleSampleProject;

public class MuleSampleProject implements IMuleSampleProject
{
    private String artifactId;
    protected IMuleRuntime runtime;
    private String name;
    private String description;
    protected File sampleFolder;

    public MuleSampleProject(String artifactId, IMuleRuntime runtime, String name, String description, File sampleFolder)
    {
        super();
        this.artifactId = artifactId;
        this.runtime = runtime;
        this.name = name;
        this.description = description;
        this.sampleFolder = sampleFolder;
    }

    public void copyIntoProject(IJavaProject project, IProgressMonitor progressMonitor)
        throws CoreException
    {
        copyFilesIntoProject(project, progressMonitor);
        updateSourceFolders(project, progressMonitor);
    }

    private void copyFilesIntoProject(IJavaProject javaProject, IProgressMonitor progressMonitor)
        throws CoreException
    {
        ImportOperation operation = createImportOperation(javaProject);
        run(operation, progressMonitor);
    }

    private ImportOperation createImportOperation(IJavaProject javaProject) throws CoreException
    {
        IPath destinationPath = javaProject.getCorrespondingResource().getFullPath();

        IImportStructureProvider filter = new ExampleFilesFilter(artifactId);
        ImportOperation operation = new ImportOperation(destinationPath, sampleFolder,
            filter, null);

        operation.setCreateContainerStructure(false);
        operation.setOverwriteResources(true);

        return operation;
    }

    private void run(ImportOperation operation, IProgressMonitor progressMonitor)
    {
        try
        {
            operation.run(progressMonitor);
        }
        catch (InvocationTargetException ite)
        {
            MuleProjectPlugin.getInstance().logError("Error while copying files to new project", ite);
        }
        catch (InterruptedException ie)
        {
            MuleProjectPlugin.getInstance().logError("Interrupted while copying files to new project", ie);
        }
    }

    protected void updateSourceFolders(IJavaProject javaProject, IProgressMonitor progressMonitor)
    {
        try
        {
            SampleSourcePathCollector collector = new SampleSourcePathCollector(sampleFolder);
            List<IPath> sourceFolders = collector.collectValidSourceFolders();

            MuleIdeProject project = new MuleIdeProject(javaProject);
            project.setSourceFolders(sourceFolders, progressMonitor);
        }
        catch (JavaModelException jme)
        {
            MuleProjectPlugin.getInstance().logError("Error while setting new classpath", jme);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder buf = new StringBuilder(64);
        buf.append("<MuleSampleProject@");
        buf.append(System.identityHashCode(this));
        buf.append(" ");
        buf.append(this.getName());
        buf.append(">");
        return buf.toString();
    }

    public Collection<IMuleBundle> getAdditionalLibraries()
    {
        return Collections.emptyList();
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public File getDirectory()
    {
        return sampleFolder;
    }
}
