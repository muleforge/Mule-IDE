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
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * ApplicationBOM collects a list of files that are packed into a Mule application zip. Files are
 * stored in three buckets:
 * <ul>
 * <li>files that go to the <tt>classes</tt> folder</li>
 * <li>files that go to the <tt>lib</tt> folder</li>
 * <li>configuration files</li>
 * <li>all other files</li>
 * </ul>
 */
public class ApplicationBOM
{
    private final Set<File> filesInClassesFolder;
    private final Set<File> filesInLibFolder;
    private final Set<File> toplevelFiles;
    private Set<File> configFiles;
    private IPath outputFile;
    private IPath absolutePathToProject;

    public ApplicationBOM()
    {
        super();
        filesInClassesFolder = new HashSet<File>();
        filesInLibFolder = new HashSet<File>();
        toplevelFiles = new HashSet<File>();
        configFiles = new HashSet<File>();
    }

    public int fileCount()
    {
        return filesInClassesFolder.size() + filesInLibFolder.size()
            + configFiles.size() + toplevelFiles.size();
    }

    public IPath getOutputPath()
    {
        return outputFile;
    }

    public void setOutputPath(IPath path)
    {
        outputFile = path;
    }

    public Set<File> getClasses()
    {
        return filesInClassesFolder;
    }

    public void addToClasses(File file)
    {
        filesInClassesFolder.add(file);
    }

    public Set<File> getToplevelFiles()
    {
        return toplevelFiles;
    }

    public void addToToplevelFiles(File file)
    {
        toplevelFiles.add(file);
    }

    public Set<File> getLibraries()
    {
        return filesInLibFolder;
    }

    public void addToLibraries(File file)
    {
        filesInLibFolder.add(file);
    }

    public Set<File> getConfigFiles()
    {
        return configFiles;
    }

    public void addToConfigFiles(File file)
    {
        configFiles.add(file);
    }

    public void setAbsolutePathToProject(File path)
    {
        absolutePathToProject = new Path(path.getAbsolutePath());
    }

    public IPath projectRelativePath(File file)
    {
        IPath filePath = new Path(file.getAbsolutePath());
        int segmentsToRemove = filePath.matchingFirstSegments(absolutePathToProject);
        return filePath.removeFirstSegments(segmentsToRemove);
    }
}
