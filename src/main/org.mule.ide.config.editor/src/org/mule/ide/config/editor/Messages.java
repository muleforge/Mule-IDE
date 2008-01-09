package org.mule.ide.config.editor;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	static {
		NLS.initializeMessages("messages", Messages.class); //$NON-NLS-1$
	}

	private Messages() {
	}

	public static String InitialConfigFile_MuleNS;
	
	public static String NewFileWizard_Title;
	public static String NewFileWizard_FilePageTitle;
	public static String NewFileWizard_FilePageDescription;
	public static String NewFileWizard_DefaultFileName;
	public static String NewFileWizard_ExtensionError;
	public static String NewFileWizard_Error;
	public static String NewFileWizard_OpenEditorError;
	public static String NewDiagramFile_CreateDiagramFile;
	public static String NewDiagramFile_InitDiagramCommand;
	public static String NewDiagramFile_IncorrectRootError;
}
