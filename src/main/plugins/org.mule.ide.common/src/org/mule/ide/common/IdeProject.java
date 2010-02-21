/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.common;

import java.io.File;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

/**
 * This is a wrapper to an {@link IJavaProject} that implements additional utility
 * methods useful for working with a project.
 */
public class IdeProject
{
    private IJavaProject javaProject = null;

    public IdeProject(IJavaProject javaProject)
    {
        super();
        this.javaProject = javaProject;
    }

    /**
     * Search this project's raw classpath and return <code>true</code> if an
     * {@link IClasspathEntry} was found that had <code>pathElement</code> as its
     * first element.
     */
    public boolean hasClasspathContainerWithFirstPathElement(String pathElement) throws JavaModelException
    {
        IClasspathEntry[] classpath = javaProject.getRawClasspath();
        for (int i = 0; i < classpath.length; i++)
        {
            String firstSegment = classpath[i].getPath().segment(0);
            if (firstSegment.equals(pathElement))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Searches the raw classpath and returns the {@link IClasspathEntry} that has
     * <code>segment</code> as first element. If <code>segment</code> was not found
     * in any classpath entry, this method returns <code>null</code>.
     */
    public IClasspathEntry findClasspathEntryWithFirstPathSegment(String segment) throws JavaModelException
    {
        IClasspathEntry[] classpath = javaProject.getRawClasspath();
        IPath searchPath = new Path(segment);

        for (IClasspathEntry entry : classpath)
        {
            IPath entryPath = entry.getPath();
            if (entryPath.matchingFirstSegments(searchPath) == 1)
            {
                return entry;
            }
        }

        return null;
    }

    public void toggleNature(String natureId) throws CoreException
    {
        if (hasNature(natureId))
        {
            removeNature(natureId);
        }
        else
        {
            addNature(natureId);
        }
    }

    public boolean hasNature(String natureId) throws CoreException
    {
        return javaProject.getProject().hasNature(natureId);
    }

    public void removeNature(String natureId) throws CoreException
    {
        IProject project = javaProject.getProject();
        IProjectDescription description = project.getDescription();

        String[] newNatures = (String[]) ArrayUtils.removeElement(description.getNatureIds(), natureId);

        description.setNatureIds(newNatures);
        project.setDescription(description, new NullProgressMonitor());
    }

    private void addNature(String natureId) throws CoreException
    {
        IProject project = javaProject.getProject();
        IProjectDescription description = project.getDescription();

        String[] newNatures = (String[]) ArrayUtils.add(description.getNatureIds(), natureId);

        description.setNatureIds(newNatures);
        project.setDescription(description, new NullProgressMonitor());
    }

    public IJavaProject getJavaProject()
    {
        return javaProject;
    }

    public String getName()
    {
        return javaProject.getProject().getName();
    }

    public IPath getPath()
    {
        return javaProject.getPath();
    }

    /**
     * A common use pattern with this class is to have a subclass that represents an
     * invalid project e.g. when the selection in the IDE could not be adapted to an
     * IdeProject instance. Subclasses can override this method to flag their
     * validity. This implementation simply returns <code>true</code>.
     */
    public boolean isValid()
    {
        return true;
    }

    /**
     * @return The absolute path of this project in the file system.
     */
    public File getFilesystemPath()
    {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IResource resource = root.findMember(getPath());
        return new File(resource.getLocationURI()).getAbsoluteFile();
    }

    /**
     * @return The {@link File} object that represents the <code>pom.xml</code> in this project
     * or <code>null</code> if this project does not have a POM.
     */
    public File getPomFile()
    {
        File projectPath = getFilesystemPath();
        File pomFile = new File(projectPath, "pom.xml");
        if (pomFile.exists())
        {
            return pomFile;
        }
        return null;
    }
}
