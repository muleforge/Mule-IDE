package org.mule.ide.config.editor.services.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.mule.ide.config.editor.services.part.CoreDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(CoreDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
