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
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.internal.ui.packageview.ClassPathContainer;
import org.mule.ide.common.IdeProject;

/**
 * This adapter is somewhat questiontable as it uses internal JDT API. It's useful
 * nevertheless and the client code using it should be prepared that adapting fails.
 * So if this adapter goes away in future versions the client code should not break.
 */
public class ClassPathContainerToIdeProject implements IAdapterFactory
{
    @SuppressWarnings("unchecked")
    public Object getAdapter(Object adaptableObject, Class adapterType)
    {
        if ((adaptableObject instanceof ClassPathContainer) && (adapterType == IdeProject.class))
        {
            ClassPathContainer container = (ClassPathContainer) adaptableObject;
            return adaptContainerToProject(container);
        }
        return null;
    }

    private Object adaptContainerToProject(ClassPathContainer container)
    {
        IJavaProject javaProject = container.getJavaProject();
        return new IdeProject(javaProject);
    }

    public Class<?>[] getAdapterList()
    {
        return new Class[]{IdeProject.class};
    }
}
