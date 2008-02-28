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
	
	public static String ConfigEditorFormPage_TitleMessage;
	public static String ConfigEditorFormPage_TitleDetails;
	
	public static String TableSection_ItemCount;
	public static String TableSection_Add;
	public static String TableSection_Remove;
	public static String TableSection_Up;
	public static String TableSection_Down;
	public static String TableSection_SortAlpha;
	
	public static String DescriptionSection_Title;
	public static String DescriptionSection_Desc;
	
	public static String NamespacesSection_Title;
	public static String NamespacesSection_Desc;
	
	public static String EndpointsSection_Title;
	public static String EndpointsSection_Desc;
	
	public static String ConnectorsSection_Title;
	public static String ConnectorsSection_Desc;
	
	public static String FiltersSection_Title;
	public static String FiltersSection_Desc;
	
	public static String SpringBeansSection_Title;
	public static String SpringBeansSection_Desc;
	
	public static String TransformersSection_Title;
	public static String TransformersSection_Desc;
	
	public static String OverviewPage_TabName;
	public static String OverviewPage_Title;
}
