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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.JavaProject;
import org.mule.ide.project.MuleIdeProject;

/**
 * Collects all the files for packaging a project into an {@link ApplicationBOM} instance.
 */
public class Collector
{
    private MuleIdeProject project;
    private ApplicationBOM billOfMaterial;

    public Collector(MuleIdeProject project)
    {
        super();
        this.project = project;
        initAppStructure();
    }

    private void initAppStructure()
    {
        billOfMaterial = new ApplicationBOM();
        billOfMaterial.setAbsolutePathToProject(project.getFilesystemPath());
    }

    public ApplicationBOM collect() throws CoreException
    {
        addOutputFolders();
        addOtherFilesInProject();
        addJarFiles();
        addConfigFiles();

        return billOfMaterial;
    }

    private void addOutputFolders() throws CoreException
    {
        List<IPath> outputFolders = project.getBuildOutputFolders();
        for (IPath outputPath : outputFolders)
        {
            addBuildOutputPath(outputPath);
        }
    }

    private void addBuildOutputPath(IPath outputPath) throws CoreException
    {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IResource resource = root.findMember(outputPath);
        if (resource instanceof IFolder)
        {
            addBuildOutputFolder((IFolder)resource);
        }
    }

    private void addBuildOutputFolder(IFolder folder) throws CoreException
    {
        for (IResource outputResource : folder.members())
        {
            if (outputResource instanceof IFile)
            {
                addBuildOutputFile(outputResource);
            }
            else
            {
                addBuildOutputFolder((IFolder)outputResource);
            }
        }
    }

    private void addBuildOutputFile(IResource outputResource)
    {
        // TODO filter out the main config file, deployment descriptor etc.

        // the full filesystem path is required to add this resource to the zip file
        File absoluteFile = absoluteFile(outputResource);
        billOfMaterial.addToClasses(absoluteFile);
    }

    private void addOtherFilesInProject() throws CoreException
    {
        for (IResource resource : project.members())
        {
            if (shouldExport(resource))
            {
                addResource(resource);
            }
        }
    }

    private void addResource(IResource resource) throws CoreException
    {
        if (resource instanceof IFolder)
        {
            addFolder((IFolder)resource);
        }
        else
        {
            addFileFromResource(resource);
        }
    }

    private void addFolder(IFolder folder) throws CoreException
    {
        if (isSourcePath(folder))
        {
            return;
        }

        for (IResource resource : folder.members())
        {
            addResource(resource);
        }
    }

    private boolean isSourcePath(IFolder folder) throws JavaModelException
    {
        Set<IPath> sourcePaths = project.getSourceFolderPaths();
        if (sourcePaths.contains(folder.getFullPath()))
        {
            return true;
        }
        return false;
    }

    private void addFileFromResource(IResource resource)
    {
        File file = absoluteFile(resource);
        billOfMaterial.addToToplevelFiles(file);
    }

    private boolean shouldExport(IResource resource) throws JavaModelException
    {
        String resourceName = resource.getName();

        // ignore .project file
        if (resourceName.equals(IProjectDescription.DESCRIPTION_FILE_NAME))
        {
            return false;
        }

        // ignore .classpath file
        if (resourceName.equals(JavaProject.CLASSPATH_FILENAME))
        {
            return false;
        }

        // ignore .muleide file
        if (resourceName.equals(MuleIdeProject.PREFERENCES_FILENAME))
        {
            return false;
        }

        // ignore .mule folder
        if (isMuleWorkFolder(resource))
        {
            return false;
        }

        if (isBuildOutputFolder(resource))
        {
            return false;
        }

        return true;
    }

    private boolean isMuleWorkFolder(IResource resource)
    {
        boolean isFolder = (resource instanceof IFolder);
        boolean nameMatch = resource.getName().equals(".mule");
        return isFolder && nameMatch;
    }

    private boolean isBuildOutputFolder(IResource resource) throws JavaModelException
    {
        List<IPath> outputPaths = project.getBuildOutputFolders();
        return outputPaths.contains(resource.getFullPath());
    }

    private void addJarFiles() throws JavaModelException
    {
        Set<IClasspathEntry> unresolvedClasspathEntries = new HashSet<IClasspathEntry>();
        for (IClasspathEntry entry : project.getRawClasspath())
        {
            if (entry.getEntryKind() == IClasspathEntry.CPE_LIBRARY)
            {
                File file = entry.getPath().toFile();
                billOfMaterial.addToLibraries(file);
            }
            else if (entry.getEntryKind() == IClasspathEntry.CPE_VARIABLE)
            {
                unresolvedClasspathEntries.add(entry);
            }
        }

        resolveAndAdd(unresolvedClasspathEntries);
    }

    private void resolveAndAdd(Set<IClasspathEntry> unresolvedClasspathEntries) throws JavaModelException
    {
        IClasspathEntry[] resolvedClasspath = project.getResolvedClasspath(false);

        for (IClasspathEntry unresolvedEntry : unresolvedClasspathEntries)
        {
            IPath pathWithoutVariable = unresolvedEntry.getPath().removeFirstSegments(1);
            String unresolvedOSPath = pathWithoutVariable.toOSString();

            for (IClasspathEntry resolvedEntry : resolvedClasspath)
            {
                String resolvedOSPath = resolvedEntry.getPath().toOSString();
                if (resolvedOSPath.contains(unresolvedOSPath))
                {
                    File file = resolvedEntry.getPath().toFile();
                    billOfMaterial.addToLibraries(file);
                }
            }
        }
    }

    // TODO consider more than one config file
    private void addConfigFiles()
    {
        IResource configFile = project.getPreferences().getConfigFile();
        File absoluteFile = absoluteFile(configFile);
        billOfMaterial.addToConfigFiles(absoluteFile);
    }

    private File absoluteFile(IResource resource)
    {
        return new File(resource.getLocationURI()).getAbsoluteFile();
    }
}
