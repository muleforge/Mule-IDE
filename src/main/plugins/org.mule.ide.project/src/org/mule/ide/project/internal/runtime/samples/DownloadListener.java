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
import java.io.IOException;

import org.eclipse.ecf.filetransfer.IFileTransferListener;
import org.eclipse.ecf.filetransfer.events.IFileTransferEvent;
import org.eclipse.ecf.filetransfer.events.IIncomingFileTransferReceiveStartEvent;

class DownloadListener implements IFileTransferListener
{
    private File destinationFile;

    public DownloadListener(File file)
    {
        super();
        destinationFile = file;
    }

    public void handleTransferEvent(IFileTransferEvent event)
    {
        // If incoming receive start event, respond by specifying local file to save to
        if (event instanceof IIncomingFileTransferReceiveStartEvent)
        {
            IIncomingFileTransferReceiveStartEvent incomingFiletransferEvent =
                (IIncomingFileTransferReceiveStartEvent) event;
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