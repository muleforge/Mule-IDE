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
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;

public class WebappSampleProject extends MuleSampleProject
{
    public WebappSampleProject(MuleRuntime runtime, String name, String description, File dir)
    {
        super(runtime, name, description, dir);
    }

    @Override
    public void copyIntoProject(IJavaProject project, IProgressMonitor progressMonitor)
        throws CoreException
    {
        super.copyIntoProject(project, progressMonitor);

        // copy the test-data directory
        // File testDataDir = new File(root, "src/main/webapp");
        // copyIntoProject(testDataDir, project.getProject());
    }

    @Override
    protected List<File> getSourceDirectories()
    {
        List<File> sourceDirs = super.getSourceDirectories();

        File webappSource = new File(sampleFolder, "src/main/webapp");
        sourceDirs.add(webappSource);

        return sourceDirs;
    }
}
