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

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.ui.jarpackager.PlainJarBuilder;
import org.mule.ide.project.MuleIdeProject;

class ClassesPrefixJarBuilder extends PlainJarBuilder
{
    private IResource configFile;
    private MuleIdeProject project;

    public ClassesPrefixJarBuilder(MuleIdeProject project)
    {
        super();
        configFile = project.getPreferences().getConfigFile();
        this.project = project;
    }

    /**
     * Mule's deployment format mandates that all class files and resources reside in the
     * <em>classes</em> folder. Put all files there except for the mule-config.xml.
     */
    @Override
    public void writeFile(IFile file, IPath destinationPath) throws CoreException
    {
        if (shouldAddClassesPrefix(file))
        {
            destinationPath = new Path("classes").append(destinationPath);
        }

        super.writeFile(file, destinationPath);
    }

    private boolean shouldAddClassesPrefix(IFile file) throws CoreException
    {
        if (isConfigFile(file))
        {
            return false;
        }

        if (isClassFile(file))
        {
            return true;
        }

        if (isLocatedInProjectSourceFolder(file))
        {
            return true;
        }

        return false;
    }

    private boolean isConfigFile(IFile file)
    {
        return file.equals(configFile);
    }

    private boolean isClassFile(IFile file)
    {
        return file.getName().endsWith(".class");
    }

    private boolean isLocatedInProjectSourceFolder(IFile file) throws CoreException
    {
        IPath resourcePath = file.getFullPath();

        Set<IPath> sourceFolders = project.getSourceFolderPaths();
        for (IPath sourceFolderPath : sourceFolders)
        {
            if (sourceFolderPath.isPrefixOf(resourcePath))
            {
                return true;
            }
        }

        return false;
    }
}
