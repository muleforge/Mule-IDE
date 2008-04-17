package org.mule.ide.debug;

import org.eclipse.osgi.util.NLS;

public class DebugMessages extends NLS {

	static {
		NLS.initializeMessages("messages", DebugMessages.class); //$NON-NLS-1$
	}

	private DebugMessages() {
	}

	public static String MuleLaunchConfig_errorNoProject;
	public static String MuleLaunchConfig_errorProjectDoesNotExist;
	public static String MuleLaunchConfig_errorEmptyConfigSet;
	public static String MuleLaunchConfig_errorNoRuntime;
}
