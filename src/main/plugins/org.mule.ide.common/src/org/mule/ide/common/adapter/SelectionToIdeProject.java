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
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.mule.ide.common.IdeProject;

public class SelectionToIdeProject implements IAdapterFactory
{
    @SuppressWarnings("unchecked")
    public Object getAdapter(Object adaptableObject, Class adapterType)
    {
        if ((adaptableObject instanceof ISelection) && (adapterType == IdeProject.class))
        {
            ISelection selection = (ISelection) adaptableObject;
            return adaptSelectionToProject(selection);
        }
        return null;
    }

    private Object adaptSelectionToProject(ISelection selection)
    {
        if (selection.isEmpty())
        {
            return null;
        }

        if (selection instanceof IStructuredSelection)
        {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            return adaptStructuredSelectionToProject(structuredSelection);
        }

        return null;
    }

    private Object adaptStructuredSelectionToProject(IStructuredSelection structuredSelection)
    {
        Object firstElement = structuredSelection.getFirstElement();

        // now that we have determined the first element from the selection, let
        // other adapters
        // handle the conversion to IJavaProject There should be some registered by
        // this plugin.
        IAdapterManager adapterManager = Platform.getAdapterManager();
        return adapterManager.getAdapter(firstElement, IdeProject.class);
    }

    public Class<?>[] getAdapterList()
    {
        return new Class[]{IdeProject.class};
    }
}
