package org.mule.ide.debug.ui;

import org.eclipse.osgi.util.NLS;

public class DebugUIMessages extends NLS {

	static {
		NLS.initializeMessages("messages", DebugUIMessages.class); //$NON-NLS-1$
	}

	private DebugUIMessages() {
	}

	public static String MuleLaunch_MainTab_name;
	public static String MuleLaunch_MainTab_ConfigGroup;
	
	public static String MuleLaunch_Shortcut_errorTitle;
	public static String MuleLaunch_Shortcut_selectLaunchConfigTitle;
	public static String MuleLaunch_Shortcut_selectLaunchConfigMsg;
	public static String MuleLaunch_Shortcut_errorNoProject;
	public static String MuleLaunch_Shortcut_errorSameProject;
}
