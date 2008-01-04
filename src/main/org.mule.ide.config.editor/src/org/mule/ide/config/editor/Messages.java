package org.mule.ide.config.editor;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	static {
		NLS.initializeMessages("messages", Messages.class); //$NON-NLS-1$
	}

	private Messages() {
	}

	public static String InitialConfigFile_MuleNS;
	
	public static String NewDiagramFile_CreateDiagramFile;
	
	public static String NewDiagramFile_InitDiagramCommand;
	
	public static String NewDiagramFile_IncorrectRootError;
}
