/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class MuleProjectNature implements IProjectNature
{
    public static final String NATURE_ID = "nature";
    public static final String FULL_NATURE_ID = MuleProjectPlugin.PLUGIN_ID + "." + NATURE_ID;

    private IProject project;

    public void configure() throws CoreException
    {
        MuleIdeProject muleProject = getMuleIdeProject();
        muleProject.addBuilder(MuleHotDeploymentBuilder.FULL_BUILDER_ID, null);
    }

    public void deconfigure() throws CoreException
    {
        MuleIdeProject muleProject = getMuleIdeProject();
        muleProject.removeBuilder(MuleHotDeploymentBuilder.FULL_BUILDER_ID, null);
    }

    public IProject getProject()
    {
        return project;
    }

    public void setProject(IProject project)
    {
        this.project = project;
    }
    
    private MuleIdeProject getMuleIdeProject()
    {
        IJavaProject javaProject = JavaCore.create(project);
        return new MuleIdeProject(javaProject);
    }
}
