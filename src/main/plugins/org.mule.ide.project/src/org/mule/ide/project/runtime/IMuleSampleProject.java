/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime;

import java.io.File;
import java.util.Collection;
import java.util.Comparator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;

public interface IMuleSampleProject
{
    public static final Comparator<IMuleSampleProject> CompareByName = new Comparator<IMuleSampleProject>()
    {
        public int compare(IMuleSampleProject p1, IMuleSampleProject p2)
        {
            return p1.getName().compareTo(p2.getName());
        }
    };

    String getName();

    String getDescription();

    File getDirectory();

    void copyIntoProject(IJavaProject project, IProgressMonitor monitor) throws CoreException;

    /**
     * @return The additional libraries that are downloaded as part of creating this
     *         sample project. Always returns a {@link Collection}, never
     *         <code>null</code>.
     */
    Collection<IMuleBundle> getAdditionalLibraries();
}
