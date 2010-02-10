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
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecf.core.ContainerFactory;
import org.eclipse.ecf.core.IContainer;
import org.eclipse.ecf.filetransfer.IFileTransferListener;
import org.eclipse.ecf.filetransfer.IRetrieveFileTransferContainerAdapter;
import org.eclipse.ecf.filetransfer.events.IFileTransferEvent;
import org.eclipse.ecf.filetransfer.events.IIncomingFileTransferReceiveStartEvent;
import org.eclipse.ecf.filetransfer.identity.FileIDFactory;
import org.eclipse.ecf.filetransfer.identity.IFileID;
import org.eclipse.jdt.core.IJavaProject;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;

public class ErrorhandlerSampleProject extends MuleSampleProject
{
    // keep this in sync with the errorhandler's dependencies
    private static final String ACTIVEMQ_JAR = "activemq-core-4.1.0-incubator.jar";
    private static final String ACTIVEMQ_URL = "http://people.apache.org/repo/m2-incubating-repository/org/apache/activemq/activemq-core/4.1.0-incubator/"
                                               + ACTIVEMQ_JAR;
    private static final String ACTIVEMQ_PATH = IMuleRuntime.USER_LIB_DIRECTORY + "/" + ACTIVEMQ_JAR;

    private static final String CONCURRENT_JAR = "concurrent-1.3.4.jar";
    private static final String CONCURRENT_URL = "http://repo1.maven.org/maven2/concurrent/concurrent/1.3.4/"
                                                 + CONCURRENT_JAR;
    private static final String CONCURRENT_PATH = IMuleRuntime.USER_LIB_DIRECTORY + "/" + CONCURRENT_JAR;

    private Collection<IMuleBundle> additionalLibraries;

    public ErrorhandlerSampleProject(IMuleRuntime runtime, String name, String description, File root)
    {
        super(runtime, name, description, root);
        additionalLibraries = new HashSet<IMuleBundle>();
    }

    @Override
    public void copyIntoProject(IJavaProject project) throws CoreException
    {
        super.copyIntoProject(project);

        // copy the test-data directory
        File testDataDir = new File(root, "test-data");
        copyIntoProject(testDataDir, project.getProject());
    }

    @Override
    protected void finishCopying() throws CoreException
    {
        downloadDependenciesIfNecessary();
    }

    private void downloadDependenciesIfNecessary() throws CoreException
    {
        File activemqJar = new File(runtime.getDirectory(), ACTIVEMQ_PATH);
        if (activemqJar.exists() == false)
        {
            downloadJarToFile(ACTIVEMQ_URL, activemqJar);
        }

        File concurrentJar = new File(runtime.getDirectory(), CONCURRENT_PATH);
        if (concurrentJar.exists() == false)
        {
            downloadJarToFile(CONCURRENT_URL, concurrentJar);
        }
    }

    private void downloadJarToFile(String url, final File destinationFile) throws CoreException
    {
        IMuleBundle jar = new JarBundle(runtime, destinationFile);
        additionalLibraries.add(jar);

        downloadUrlToFile(url, destinationFile);
    }

    private void downloadUrlToFile(String url, final File destinationFile) throws CoreException
    {
        // see http://www.eclipse.org/ecf/documentation.php
        IContainer container = ContainerFactory.getDefault().createContainer("ecf.base");

        IRetrieveFileTransferContainerAdapter fileTransferContainer = (IRetrieveFileTransferContainerAdapter) container.getAdapter(IRetrieveFileTransferContainerAdapter.class);
        if (fileTransferContainer != null)
        {
            // Create listener for receiving/responding to asynchronous file transfer
            // events
            IFileTransferListener listener = new DownloadListener(destinationFile);
            // Identify file to retrieve and create ID
            IFileID remoteFileID = FileIDFactory.getDefault().createFileID(
                fileTransferContainer.getRetrieveNamespace(), url);
            // Actually make request to start retrieval. The listener provided will
            // then be notified asynchronously
            // as file transfer events occur
            fileTransferContainer.sendRetrieveRequest(remoteFileID, listener, null);
        }
    }

    @Override
    public Collection<IMuleBundle> getAdditionalLibraries()
    {
        return additionalLibraries;
    }

    private static class DownloadListener implements IFileTransferListener
    {
        private File destinationFile;

        public DownloadListener(File file)
        {
            super();
            destinationFile = file;
        }

        public void handleTransferEvent(IFileTransferEvent event)
        {
            // If incoming receive start event, respond by specifying local file to
            // save to
            if (event instanceof IIncomingFileTransferReceiveStartEvent)
            {
                IIncomingFileTransferReceiveStartEvent incomingFiletransferEvent = (IIncomingFileTransferReceiveStartEvent) event;
                try
                {
                    // the file will be overwritten silently
                    incomingFiletransferEvent.receive(destinationFile);
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
