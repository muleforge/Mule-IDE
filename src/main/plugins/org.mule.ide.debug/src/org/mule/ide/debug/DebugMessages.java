/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.debug;

import org.eclipse.osgi.util.NLS;

public class DebugMessages extends NLS
{
    static
    {
        NLS.initializeMessages("messages", DebugMessages.class); //$NON-NLS-1$
    }

    private DebugMessages()
    {
        super();
    }

    public static String MuleLaunchConfig_errorNoProject;
    public static String MuleLaunchConfig_errorProjectDoesNotExist;
    public static String MuleLaunchConfig_errorEmptyConfigSet;
    public static String MuleLaunchConfig_errorNoRuntime;
}
