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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class SampleSourcePathCollector
{
    private File sampleFolder;
    private List<IPath> sourcePaths;

    public SampleSourcePathCollector(File sampleFolder)
    {
        super();
        this.sampleFolder = sampleFolder;
        sourcePaths = new ArrayList<IPath>();
    }

    public List<IPath> collectValidSourceFolders()
    {
        addDirectory("src/main/java");
        addDirectory("src/main/resources");
        addDirectory("src/main/app");
        addDirectory("src/test/java");
        addDirectory("src/test/resources");
        addDirectory("conf");

        return sourcePaths;
    }

    private void addDirectory(String folderName)
    {
        File folder = new File(sampleFolder, folderName);
        if (folder.exists() && folder.isDirectory())
        {
            IPath path = new Path(folderName);
            sourcePaths.add(path);
        }
    }
}
