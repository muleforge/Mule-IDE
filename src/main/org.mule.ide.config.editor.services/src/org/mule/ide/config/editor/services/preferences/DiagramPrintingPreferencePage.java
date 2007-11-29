package org.mule.ide.config.editor.services.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;
import org.mule.ide.config.editor.services.part.CoreDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	 * @generated
	 */
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(CoreDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
