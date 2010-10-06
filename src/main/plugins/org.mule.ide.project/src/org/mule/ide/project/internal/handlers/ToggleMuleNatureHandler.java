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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectNature;

public class ToggleMuleNatureHandler extends AbstractMuleHandler
{
    @Override
    protected Object execute(MuleIdeProject project) throws ExecutionException
    {
        toggleMuleNature(project);
        return null;
    }

    private void toggleMuleNature(MuleIdeProject project) throws ExecutionException
    {
        try
        {
            project.toggleNature(MuleProjectNature.NATURE_ID, null);
        }
        catch (CoreException ce)
        {
            throw new ExecutionException("Exception while toggling the Mule nature", ce);
        }
    }
}
