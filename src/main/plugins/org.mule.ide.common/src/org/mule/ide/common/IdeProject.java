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
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
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

    public void toggleNature(String natureId, IProgressMonitor progressMonitor) throws CoreException
    {
        if (hasNature(natureId))
        {
            removeNature(natureId, progressMonitor);
        }
        else
        {
            addNature(natureId, progressMonitor);
        }
    }

    public boolean hasNature(String natureId) throws CoreException
    {
        return javaProject.getProject().hasNature(natureId);
    }

    public void removeNature(String natureId, IProgressMonitor progressMonitor) throws CoreException
    {
        IProject project = javaProject.getProject();
        IProjectDescription description = project.getDescription();

        String[] newNatures = (String[]) ArrayUtils.removeElement(description.getNatureIds(), natureId);

        description.setNatureIds(newNatures);
        project.setDescription(description, progressMonitor);
    }

    private void addNature(String natureId, IProgressMonitor progressMonitor) throws CoreException
    {
        IProject project = javaProject.getProject();
        IProjectDescription description = project.getDescription();

        String[] newNatures = (String[]) ArrayUtils.add(description.getNatureIds(), natureId);

        description.setNatureIds(newNatures);
        project.setDescription(description, progressMonitor);
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

    public IClasspathEntry[] getRawClasspath() throws JavaModelException
    {
        return javaProject.getRawClasspath();
    }

    public void setRawClasspath(IClasspathEntry[] newClasspath, IProgressMonitor monitor) throws JavaModelException
    {
        javaProject.setRawClasspath(newClasspath, monitor);
    }

    public void setRawClasspath(List<IClasspathEntry> newClasspath, IProgressMonitor monitor) throws JavaModelException
    {
        IClasspathEntry[] entries = new IClasspathEntry[newClasspath.size()];
        entries = newClasspath.toArray(entries);
        setRawClasspath(entries, monitor);
    }

    public List<IPath> getBuildOutputFolders() throws JavaModelException
    {
        List<IPath> outputFolders = new ArrayList<IPath>();

        // add the project's output location (this one is used if no output location is configured
        // separately for each source folder)
        outputFolders.add(javaProject.getOutputLocation());

        for (IClasspathEntry classpathEntry : getRawClasspath())
        {
            if (classpathEntry.getEntryKind() == IClasspathEntry.CPE_SOURCE)
            {
                IPath outputLocation = classpathEntry.getOutputLocation();
                if (outputLocation != null)
                {
                    outputFolders.add(outputLocation);
                }
            }
        }

        return outputFolders;
    }

    public void setSourceFolders(List<IPath> sourcePaths, IProgressMonitor progressMonitor)
        throws JavaModelException
    {
        List<IClasspathEntry> sourceFolders = createSourceFolders(sourcePaths);
        List<IClasspathEntry> otherClasspathEntries = getClasspathEntriesWithoutSourceFolders();

        IClasspathEntry[] mergedClasspath = mergeClasspathEntries(sourceFolders, otherClasspathEntries);

        javaProject.setRawClasspath(mergedClasspath, null);
    }

    protected List<IClasspathEntry> createSourceFolders(List<IPath> sourcePaths)
    {
        List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
        IPath projectPath = javaProject.getProject().getFullPath();

        for (IPath path : sourcePaths)
        {
            IClasspathEntry classpathEntry = JavaCore.newSourceEntry(projectPath.append(path));
            entries.add(classpathEntry);
        }

        return entries;
    }

    private List<IClasspathEntry> getClasspathEntriesWithoutSourceFolders() throws JavaModelException
    {
        List<IClasspathEntry> filtered = new ArrayList<IClasspathEntry>();
        IClasspathEntry[] classpath = getRawClasspath();

        for (IClasspathEntry entry : classpath)
        {
            if (entry.getEntryKind() != IClasspathEntry.CPE_SOURCE)
            {
                filtered.add(entry);
            }
        }

        return filtered;
    }

    private IClasspathEntry[] mergeClasspathEntries(List<IClasspathEntry> sourceFolders,
        List<IClasspathEntry> otherClasspathEntries)
    {
        List<IClasspathEntry> merged = new ArrayList<IClasspathEntry>();
        merged.addAll(sourceFolders);
        merged.addAll(otherClasspathEntries);
        return merged.toArray(new IClasspathEntry[merged.size()]);
    }

    public void addToClasspath(File jarFile, IProgressMonitor progressMonitor) throws JavaModelException
    {
        IPath path = new Path(jarFile.getAbsolutePath());
        IClasspathEntry newLibraryEntry = JavaCore.newLibraryEntry(path, null, null);

        IClasspathEntry[] oldClasspath = getRawClasspath();
        IClasspathEntry[] newClasspath = (IClasspathEntry[])ArrayUtils.add(oldClasspath, newLibraryEntry);
        setRawClasspath(newClasspath, progressMonitor);
    }

    public boolean hasBuilder(String builderId) throws CoreException
    {
        IProjectDescription projectDescription = javaProject.getProject().getDescription();
        ICommand[] builderCommands = projectDescription.getBuildSpec();
        for (int i = 0; i < builderCommands.length; i++)
        {
            if (builderCommands[i].getBuilderName().equals(builderId))
            {
                return true;
            }
        }

        return false;
    }

    public void addBuilder(String builderId, IProgressMonitor progressMonitor) throws CoreException
    {
        IProject project = javaProject.getProject();
        if (project.isOpen() == false)
        {
            return;
        }

        if (hasBuilder(builderId))
        {
            return;
        }

        IProjectDescription projectDescription = project.getDescription();

        ICommand newBuilder = projectDescription.newCommand();
        newBuilder.setBuilderName(builderId);

        ICommand[] buildCommands = projectDescription.getBuildSpec();
        ICommand[] newBuildCommands = (ICommand[])ArrayUtils.add(buildCommands, newBuilder);
        projectDescription.setBuildSpec(newBuildCommands);
        project.setDescription(projectDescription, progressMonitor);
    }

    public void removeBuilder(String builderId, IProgressMonitor progressMonitor) throws CoreException
    {
        IProject project = javaProject.getProject();
        if (project.isOpen() == false)
        {
            return;
        }

        if (hasBuilder(builderId) == false)
        {
            return;
        }

        IProjectDescription projectDescription = project.getDescription();
        List<ICommand> updatedBuilders = new ArrayList<ICommand>();
        for (ICommand builder : projectDescription.getBuildSpec())
        {
            if (builder.getBuilderName().equals(builderId) == false)
            {
                updatedBuilders.add(builder);
            }
        }

        ICommand[] newBuildSpec = new ICommand[updatedBuilders.size()];
        newBuildSpec = updatedBuilders.toArray(newBuildSpec);
        projectDescription.setBuildSpec(newBuildSpec);
        project.setDescription(projectDescription, progressMonitor);
    }
}
