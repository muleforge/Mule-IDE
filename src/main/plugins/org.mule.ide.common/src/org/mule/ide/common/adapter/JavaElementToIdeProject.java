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

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.mule.ide.common.IdeProject;

public class JavaElementToIdeProject implements IAdapterFactory
{
    @SuppressWarnings("unchecked")
    public Object getAdapter(Object adaptableObject, Class adapterType)
    {
        if ((adaptableObject instanceof IJavaElement) && (adapterType == IdeProject.class))
        {
            IJavaElement javaElement = (IJavaElement) adaptableObject;
            return adaptJavaElementToProject(javaElement);
        }
        return null;
    }

    private Object adaptJavaElementToProject(IJavaElement javaElement)
    {
        IJavaProject javaProject = javaElement.getJavaProject();
        return new IdeProject(javaProject);
    }

    public Class<?>[] getAdapterList()
    {
        return new Class[]{IdeProject.class};
    }
}
