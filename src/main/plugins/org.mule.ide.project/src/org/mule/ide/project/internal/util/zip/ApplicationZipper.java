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

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.ui.jarpackager.JarPackageData;

public class ApplicationZipper
{
    private static final IPath CLASSES_FOLDER = new Path("classes");
    private static final IPath LIB_FOLDER = new Path("lib");

    private ApplicationBOM billOfMaterial;
    private IProgressMonitor progressMonitor;
    private MuleJarWriter jarWriter;

    public ApplicationZipper(ApplicationBOM bom, IProgressMonitor monitor)
    {
        super();
        this.billOfMaterial = bom;
        this.progressMonitor = monitor;
    }

    public void writeZipFile() throws CoreException
    {
        openJarWriter();
        addClasses();
        addLibraries();
        addOtherFiles();
        addConfigFiles();
        closeJarWriter();
    }

    private void openJarWriter() throws CoreException
    {
        JarPackageData data = createJarPackageData();
        jarWriter = new MuleJarWriter(data, null);
    }

    /**
     * We add files to the JarWriter manually so this JarPackageData is only needed to make
     * the JarWriter behave correctly
     */
    private JarPackageData createJarPackageData()
    {
        JarPackageData data = new JarPackageData();

        // this must be false or JarWriter will barf
        data.setIncludeDirectoryEntries(false);

        data.setJarLocation(billOfMaterial.getOutputPath());
        data.setOverwrite(false);
        data.setBuildIfNeeded(true);
        data.setUsesManifest(false);

        // JarWriter insists on having elements
        data.setElements(new Object[] { "ignoreme" });

        return data;
    }

    private void addClasses() throws CoreException
    {
        for (File file : billOfMaterial.getClasses())
        {
            IPath projectRelativePath = billOfMaterial.projectRelativePath(file);

            // the project relative path still has the output folder in it ...
            // TODO what if the output folder is more than one directory deep?
            projectRelativePath = projectRelativePath.removeFirstSegments(1);

            IPath destinationPath = CLASSES_FOLDER.append(projectRelativePath);
            jarWriter.write(file, destinationPath);

            progressMonitor.worked(1);
        }
    }

    private void addOtherFiles() throws CoreException
    {
        for (File file : billOfMaterial.getToplevelFiles())
        {
            IPath projectRelativePath = billOfMaterial.projectRelativePath(file);
            jarWriter.write(file, projectRelativePath);

            progressMonitor.worked(1);
        }
    }

    private void addLibraries() throws CoreException
    {
        for (File file : billOfMaterial.getLibraries())
        {
            IPath destinationPath = LIB_FOLDER.append(file.getName());
            jarWriter.write(file, destinationPath);

            progressMonitor.worked(1);
        }
    }

    private void addConfigFiles() throws CoreException
    {
        for (File file : billOfMaterial.getConfigFiles())
        {
            IPath destinationPath = new Path(file.getName());
            jarWriter.write(file, destinationPath);

            progressMonitor.worked(1);
        }
    }

    private void closeJarWriter() throws CoreException
    {
        jarWriter.close();
    }
}
