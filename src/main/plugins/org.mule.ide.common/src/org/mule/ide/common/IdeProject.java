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

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

/**
 * This is a wrapper to an {@link IJavaProject} that implements additional utility methods useful
 * for working with a project.
 */
public class IdeProject {
    private IJavaProject javaProject = null;

    public IdeProject(IJavaProject javaProject) {
        super();
        this.javaProject  = javaProject;
    }
    
    /**
     * Search this project's raw classpath and return <code>true</code> if an {@link IClasspathEntry}
     * was found that had <code>pathElement</code> as its first element.
     */
    public boolean hasClasspathContainerWithFirstPathElement(String pathElement) throws JavaModelException {
        IClasspathEntry[] classpath = javaProject.getRawClasspath();
        for (int i = 0; i < classpath.length; i++) {
            String firstSegment = classpath[i].getPath().segment(0);
            if (firstSegment.equals(pathElement)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Searches the raw classpath and returns the {@link IClasspathEntry} that has <code>segment</code>
     * as first element. If <code>segment</code> was not found in any classpath entry, this method
     * returns <code>null</code>.
     */
    public IClasspathEntry findClasspathEntryWithFirstPathSegment(String segment) throws JavaModelException {
        IClasspathEntry[] classpath = javaProject.getRawClasspath();
        IPath searchPath = new Path(segment);
        
        for (IClasspathEntry entry : classpath) {
            IPath entryPath = entry.getPath();
            if (entryPath.matchingFirstSegments(searchPath) == 1) {
                return entry;
            }
        }
        
        return null;
    }

    public IJavaProject getJavaProject() {
        return javaProject;
    }

    public String getName() {
        return javaProject.getProject().getName();
    }

    public IPath getPath() {
        return javaProject.getPath();
    }        
}
