/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime.samples;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecf.core.ContainerFactory;
import org.eclipse.ecf.core.IContainer;
import org.eclipse.ecf.filetransfer.IFileTransferListener;
import org.eclipse.ecf.filetransfer.IRetrieveFileTransferContainerAdapter;
import org.eclipse.ecf.filetransfer.identity.FileIDFactory;
import org.eclipse.ecf.filetransfer.identity.IFileID;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.wizards.datatransfer.IImportStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.internal.runtime.ProjectPreferences;
import org.mule.ide.project.internal.util.UrlUtils;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleSampleProject;

public class MuleSampleProject implements IMuleSampleProject
{
    private static final String DEFAULT_MULE_CONFIG_FILE = "src/main/app/mule-config.xml";

    private String artifactId;
    private String name;
    private String description;
    private File sampleFolder;
    private Collection<IMuleBundle> additionalLibraries;
    private Collection<URL> urlsToDownload;

    public MuleSampleProject(String artifactId, String name, String description, File sampleFolder)
    {
        super();
        this.artifactId = artifactId;
        this.name = name;
        this.description = description;
        this.sampleFolder = sampleFolder;
        this.urlsToDownload = new HashSet<URL>();
        this.additionalLibraries = new HashSet<IMuleBundle>();
    }

    public void copyIntoProject(IJavaProject project, IProgressMonitor progressMonitor)
        throws CoreException
    {
        copyFilesIntoProject(project, progressMonitor);
        updateSourceFolders(project, progressMonitor);
        downloadAdditionalLibraries(project, progressMonitor);
        generateProjectPreferencesFile(project, progressMonitor);
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

    public void addLibraryDownloadedFrom(URL downloadUrl)
    {
        urlsToDownload.add(downloadUrl);
    }

    private void downloadAdditionalLibraries(IJavaProject javaProject, IProgressMonitor progressMonitor)
        throws CoreException
    {
        if (urlsToDownload.isEmpty() == false)
        {
            MuleIdeProject project = new MuleIdeProject(javaProject);
            File libFolder = createLibrariesFolder(project);

            for (URL downloadUrl : urlsToDownload)
            {
                File libFile = downloadLibrary(downloadUrl, libFolder);
                project.addToClasspath(libFile, progressMonitor);
            }
        }
    }

    private File createLibrariesFolder(MuleIdeProject project) throws CoreException
    {
        File projectPath = project.getFilesystemPath();

        File libFolder = new File(projectPath, "lib");
        if (libFolder.exists() == false)
        {
            if (libFolder.mkdirs() == false)
            {
                Status error = new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID,
                    "Error creating lib folder in project " + projectPath.getAbsolutePath());
                throw new CoreException(error);
            }
        }

        return libFolder;
    }

    private File downloadLibrary(URL libUrl, File libFolder) throws CoreException
    {
        String filename = UrlUtils.filename(libUrl);
        File libFile = new File(libFolder, filename);

        downloadUrlToFile(libUrl, libFile);
        return libFile;
    }

    private void downloadUrlToFile(URL url, File destinationFile) throws CoreException
    {
        // see http://www.eclipse.org/ecf/documentation.php
        IContainer container = ContainerFactory.getDefault().createContainer("ecf.base");

        IRetrieveFileTransferContainerAdapter fileTransferContainer = (IRetrieveFileTransferContainerAdapter) container.getAdapter(IRetrieveFileTransferContainerAdapter.class);
        if (fileTransferContainer != null)
        {
            // Create listener for receiving/responding to asynchronous file transfer events
            IFileTransferListener listener = new DownloadListener(destinationFile);
            // Identify file to retrieve and create ID
            IFileID remoteFileID = FileIDFactory.getDefault().createFileID(
                fileTransferContainer.getRetrieveNamespace(), url);
            // Actually make request to start retrieval. The listener provided will
            // then be notified asynchronously as file transfer events occur
            fileTransferContainer.sendRetrieveRequest(remoteFileID, listener, null);
        }
    }

    private void generateProjectPreferencesFile(IJavaProject javaProject, IProgressMonitor progressMonitor)
    {
        MuleIdeProject project = new MuleIdeProject(javaProject);
        ProjectPreferences preferences = project.getPreferences();
        if (preferences.getConfigFile() == null)
        {
            IResource configResource = javaProject.getProject().findMember(DEFAULT_MULE_CONFIG_FILE);
            if (configResource != null)
            {
                IPath configPath = configResource.getProjectRelativePath();
                preferences.setConfigFile(configPath);
                project.storePreferences();
            }
        }
    }

    @Override
    public String toString()
    {
        StringBuilder buf = new StringBuilder(64);
        buf.append("<MuleSampleProject@");
        buf.append(System.identityHashCode(this));
        buf.append(" ");
        buf.append(getName());
        buf.append(">");
        return buf.toString();
    }

    public Collection<IMuleBundle> getAdditionalLibraries()
    {
        return additionalLibraries;
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
