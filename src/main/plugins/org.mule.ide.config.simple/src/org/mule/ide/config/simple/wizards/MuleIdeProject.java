/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.config.simple.wizards;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.mule.ide.common.IdeProject;
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleIdeProject extends IdeProject
{
    /**
     * This constructor is used by {@link IdeProjectFactory}
     */
    public MuleIdeProject(IJavaProject project)
    {
        super(project);
    }

    public boolean isMuleProject()
    {
        try
        {
            return hasClasspathContainerWithFirstPathElement(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER);
        }
        catch (JavaModelException jme)
        {
            return false;
        }
    }

    public IMuleRuntime getMuleRuntime()
    {
        try
        {
            IClasspathEntry entry = findClasspathEntryWithFirstPathSegment(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER);
            IPath entryPath = entry.getPath();
            if (entryPath.segmentCount() == 2)
            {
                // this is the default Mule Runtime
                return MulePreferences.getDefaultMuleRuntime();
            }
            else
            {
                // this is the Mule library, extract the version from it
                String muleRuntimePath = entryPath.lastSegment();
                return MulePreferences.getMuleRuntime(muleRuntimePath);
            }
        }
        catch (JavaModelException jme)
        {
            // TODO: better error handling in the code calling this method
            throw new IllegalStateException(jme);
        }
    }
}
