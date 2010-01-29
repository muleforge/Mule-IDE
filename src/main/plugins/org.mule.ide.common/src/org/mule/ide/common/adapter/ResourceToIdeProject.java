/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.common.adapter;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.mule.ide.common.IdeProject;

public class ResourceToIdeProject implements IAdapterFactory {
    
    @SuppressWarnings("unchecked")
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if ((adaptableObject instanceof IResource) && (adapterType == IdeProject.class)) {
            IResource resource = (IResource)adaptableObject;
            return adaptResourceToProject(resource);
        }
        return null;
    }

    private Object adaptResourceToProject(IResource resource) {
        IProject project = resource.getProject();
        IJavaProject javaProject = JavaCore.create(project);
        return new IdeProject(javaProject);
    }

    public Class<?>[] getAdapterList() {
        return new Class[] { IdeProject.class };
    }
}
