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

import org.mule.ide.project.MuleIdeProject;

public class InvalidMuleIdeProject extends MuleIdeProject
{
    public InvalidMuleIdeProject()
    {
        super(null);
    }

    @Override
    public String getName()
    {
        return "Invalid project";
    }

    @Override
    public boolean isMuleProject()
    {
        return false;
    }

    @Override
    public boolean isValid()
    {
        return false;
    }
}
