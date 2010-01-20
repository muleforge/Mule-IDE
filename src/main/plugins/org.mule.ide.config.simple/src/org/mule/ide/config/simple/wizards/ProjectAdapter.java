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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.mule.ide.project.MuleProjectPlugin;

public class ProjectAdapter {

    private IJavaProject javaProject;

    public static ProjectAdapter with(IStructuredSelection selection) {
        Object firstObject = selection.getFirstElement();
        if (firstObject instanceof IResource) {
            return new ProjectAdapter((IResource)firstObject);
        }
        else if (firstObject instanceof IJavaElement) {
            return new ProjectAdapter((IJavaElement)firstObject);
        }
        
        return new InvalidProjectAdapter();
    }

    public ProjectAdapter(IResource resource) {
        super();
        
        IProject project = resource.getProject();
        javaProject = JavaCore.create(project);
    }

    public ProjectAdapter(IJavaElement javaElement) {
        super();
        
        javaProject = javaElement.getJavaProject();
    }
    
    /**
     * This ctor only exists to help our inner helper class. Do not make public.
     */
    private ProjectAdapter() {
        super();
        javaProject = null;
    }

    public boolean isMuleProject() {
        try {
            return searchForMuleClasspathContainer();
        }
        catch (JavaModelException e) {
            return false;
        }
    }

    private boolean searchForMuleClasspathContainer() throws JavaModelException {
        IClasspathEntry[] classpath = javaProject.getRawClasspath();
        for (int i = 0; i < classpath.length; i++) {
            String firstSegment = classpath[i].getPath().segment(0);
            if (firstSegment.equals(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER)) {
                return true;
            }
        }
        return false;
    }


    public String getName() {
        return javaProject.getProject().getName();
    }
    
    private static class InvalidProjectAdapter extends ProjectAdapter {
        public InvalidProjectAdapter() {
            super();
        }

        @Override
        public String getName() {
            return "Cannot determine project from selection";
        }

        @Override
        public boolean isMuleProject() {
            return false;
        }
    }
}
