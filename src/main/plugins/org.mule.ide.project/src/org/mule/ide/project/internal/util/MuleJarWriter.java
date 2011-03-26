/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Proxy;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.internal.ui.jarpackagerfat.JarWriter4;
import org.eclipse.jdt.ui.jarpackager.JarPackageData;
import org.eclipse.jdt.ui.jarpackager.JarWriter3;
import org.eclipse.swt.widgets.Shell;
import org.mule.ide.project.MuleProjectPlugin;

/**
 * <p>
 * JarWriter4's main value is that it provides a <code>write</code> method that
 * allows to store {@link File} objects. The implementation of that method, however,
 * explicitly checks that creating the directory structure when adding files is
 * turned off.
 * </p>
 * <p>
 * Mule cannot handle zip files that do not contain the intermediate directories,
 * though. {@link JarWriter3} has everything we need for creating the intermediate
 * directories, however it insists on working with {@link IResource} objects and not
 * with {@link File} objects. The <code>addDirectories</code> method (that creates
 * those intermediate directories) uses only very little of the {@link IResource}
 * API, though. So we're using JDK {@link Proxy} instances to adapt a {@link File} to
 * an {@link IResource}.
 * </p>
 */
public class MuleJarWriter extends JarWriter4
{
    public MuleJarWriter(JarPackageData jarPackage, Shell parent) throws CoreException
    {
        super(jarPackage, parent);
    }

    @Override
    public void write(File file, IPath destinationPath) throws CoreException
    {
        addDirectoryEntries(file, destinationPath);
        super.write(file, destinationPath);
    }

    private void addDirectoryEntries(File file, IPath destinationPath) throws CoreException
    {
        try
        {
            IResource proxy = FileResourceInvocationHandler.createResourceProxy(file);
            addDirectories(proxy, destinationPath);
        }
        catch (IOException iox)
        {
            IStatus status = new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "Error while adding directories", iox);
            throw new CoreException(status);
        }
    }
}
