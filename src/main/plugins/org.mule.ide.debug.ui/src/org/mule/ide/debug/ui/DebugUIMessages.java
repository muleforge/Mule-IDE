/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.debug.ui;

import org.eclipse.osgi.util.NLS;

public class DebugUIMessages extends NLS
{
    static
    {
        NLS.initializeMessages("messages", DebugUIMessages.class); //$NON-NLS-1$
    }

    private DebugUIMessages()
    {
        super();
    }

    public static String MuleLaunch_MainTab_name;
    public static String MuleLaunch_MainTab_ConfigGroup;

    public static String MuleLaunch_Shortcut_errorTitle;
    public static String MuleLaunch_Shortcut_selectLaunchConfigTitle;
    public static String MuleLaunch_Shortcut_selectLaunchConfigMsg;
    public static String MuleLaunch_Shortcut_errorNoProject;
    public static String MuleLaunch_Shortcut_errorSameProject;
}
