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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectNature;
import org.mule.ide.project.MuleProjectPlugin;

public class ToggleMuleNatureHandler extends AbstractHandler
{
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        MuleIdeProject project = findProject(event);
        if (project.isValid() == false)
        {
            return null;
        }

        toggleMuleNature(project);

        return null;
    }

    private void toggleMuleNature(MuleIdeProject project) throws ExecutionException
    {
        try
        {
            project.toggleNature(MuleProjectNature.FULL_NATURE_ID, null);
        }
        catch (CoreException ce)
        {
            throw new ExecutionException("Exception while toggling the Mule nature", ce);
        }
    }

    private MuleIdeProject findProject(ExecutionEvent event) throws ExecutionException
    {
        ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
        return MuleProjectPlugin.getInstance().getProjectFactory().create(selection);
    }
}
