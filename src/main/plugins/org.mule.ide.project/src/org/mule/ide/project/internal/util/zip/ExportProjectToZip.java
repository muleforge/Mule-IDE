/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.util.zip;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.mule.ide.project.MuleIdeProject;

public class ExportProjectToZip
{
    private MuleIdeProject project;
    private ApplicationBOM billOfMaterial;

    public ExportProjectToZip(MuleIdeProject project)
    {
        super();
        this.project = project;
    }

    public void run(IPath zipFile, IProgressMonitor monitor) throws CoreException
    {
        billOfMaterial = collectFilesToExport(monitor);
        billOfMaterial.setOutputPath(zipFile);

        writeZipFile(monitor);
    }

    private ApplicationBOM collectFilesToExport(IProgressMonitor monitor) throws CoreException
    {
        SubProgressMonitor collectMonitor = new SubProgressMonitor(monitor, 1);
        collectMonitor.beginTask("Collecting files for Mule application zip", 1);

        ApplicationBOM appStructure = new Collector(project).collect();

        collectMonitor.done();
        return appStructure;
    }

    private void writeZipFile(IProgressMonitor monitor) throws CoreException
    {
        int fileCount = billOfMaterial.fileCount();
        SubProgressMonitor zipMonitor = new SubProgressMonitor(monitor, fileCount);
        zipMonitor.beginTask("Writing Mule application zip", fileCount);

        new ApplicationZipper(billOfMaterial, zipMonitor).writeZipFile();

        zipMonitor.done();
    }
}
