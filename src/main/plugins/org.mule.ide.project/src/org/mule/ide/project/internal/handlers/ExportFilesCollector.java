/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.handlers;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.JavaProject;
import org.mule.ide.project.MuleIdeProject;

public class ExportFilesCollector
{
    private MuleIdeProject project;
    private Set<Object> resourcesToExport;

    public ExportFilesCollector(MuleIdeProject project)
    {
        super();
        this.project = project;
        this.resourcesToExport = new HashSet<Object>();
    }

    public Set<Object> allFilesToExport() throws CoreException
    {
        addJavaResources();
        addOtherProjectResources();
        return resourcesToExport;
    }

    private void addJavaResources() throws JavaModelException
    {
        resourcesToExport.addAll(project.getPackageFragmentRootsContainingSourceFiles());
    }

    private void addOtherProjectResources() throws CoreException
    {
        IJavaProject javaProject = project.getJavaProject();
        for (IResource resource : javaProject.getProject().members())
        {
            if (shouldExport(resource))
            {
                resourcesToExport.add(resource);
            }
        }
    }

    private boolean shouldExport(IResource resource) throws JavaModelException
    {
        String resourceName = resource.getName();
        IJavaProject javaProject = project.getJavaProject();

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

        // ignore bin folder
        if (resource.getFullPath().equals(javaProject.getOutputLocation()))
        {
            return false;
        }

        return true;
    }
}
