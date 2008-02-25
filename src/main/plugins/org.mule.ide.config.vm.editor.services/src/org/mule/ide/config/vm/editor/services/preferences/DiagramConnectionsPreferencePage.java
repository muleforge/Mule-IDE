package org.mule.ide.config.vm.editor.services.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.mule.ide.config.vm.editor.services.part.VMDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(VMDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
