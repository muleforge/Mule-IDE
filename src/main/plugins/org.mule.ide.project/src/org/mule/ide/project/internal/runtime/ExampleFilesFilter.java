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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.IImportStructureProvider;

public class ExampleFilesFilter implements IImportStructureProvider
{
    private static final Set<String> ExcludedFiles;

    private boolean didFilterToplevelChildren = false;
    private String artifactId;
    private String exampleName;

    static
    {
        ExcludedFiles = new HashSet<String>();
        ExcludedFiles.add("build.xml");
        ExcludedFiles.add("osgi.properties");
        ExcludedFiles.add("pom.xml");
        ExcludedFiles.add("README.txt");
    }

    public ExampleFilesFilter(String artifactId)
    {
        super();
        this.artifactId = artifactId;

        this.exampleName = artifactId;
        int dashIndex = artifactId.lastIndexOf('-');
        if (dashIndex > -1)
        {
            this.exampleName = artifactId.substring(dashIndex + 1);
        }
    }

    public List<?> getChildren(Object element)
    {
        List<File> children = getChildFiles(element);
        if (didFilterToplevelChildren == false)
        {
            didFilterToplevelChildren = true;
            return filter(children);
        }

        return children;
    }

    @SuppressWarnings("unchecked")
    private List<File> getChildFiles(Object element)
    {
        return FileSystemStructureProvider.INSTANCE.getChildren(element);
    }

    private List<File> filter(List<File> children)
    {
        List<File> filteredFiles = new ArrayList<File>();
        for (File element : children)
        {
            if (shouldIncludeFile(element))
            {
                filteredFiles.add(element);
            }
        }
        return filteredFiles;
    }

    private boolean shouldIncludeFile(File file)
    {
        if (ExcludedFiles.contains(file.getName()))
        {
            return false;
        }

        if (isPrebuiltApplicationZip(file))
        {
            return false;
        }

        if (isLaunchScript(file))
        {
            return false;
        }

        return true;
    }

    /**
     *  Mule 2.x bundles launch scripts with the examples. These scripts are named exactly like
     *  the last part of the artifactId, optionally with the '.bat' suffix.
     */
    private boolean isLaunchScript(File file)
    {
        String filename = file.getName();
        if (filename.equals(exampleName) && file.isFile())
        {
            // TODO check if executable, look at first two chars in file, maybe (#!)
            return true;
        }
        else if (filename.startsWith(exampleName) && filename.endsWith(".bat"))
        {
            return true;
        }

        return false;
    }

    /**
     * Mule 3.x bundles each example pre-built as a zip. The naming scheme used there is
     * ${artifactId}-${version}.zip
     */
    private boolean isPrebuiltApplicationZip(File file)
    {
        String filename = file.getName();
        if (filename.startsWith(artifactId) && filename.endsWith(".zip"))
        {
            return true;
        }
        return false;
    }

    public InputStream getContents(Object element)
    {
        return FileSystemStructureProvider.INSTANCE.getContents(element);
    }

    public String getFullPath(Object element)
    {
        return FileSystemStructureProvider.INSTANCE.getFullPath(element);
    }

    public String getLabel(Object element)
    {
        return FileSystemStructureProvider.INSTANCE.getLabel(element);
    }

    public boolean isFolder(Object element)
    {
        return FileSystemStructureProvider.INSTANCE.isFolder(element);
    }
}
