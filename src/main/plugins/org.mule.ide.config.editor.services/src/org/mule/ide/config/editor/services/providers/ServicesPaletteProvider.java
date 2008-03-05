package org.mule.ide.config.editor.services.providers;

import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.ui.IEditorPart;
import org.mule.ide.config.editor.services.part.CoreDiagramEditor;

public abstract class ServicesPaletteProvider 
	extends AbstractProvider
	implements IServicesPaletteProvider {

    protected ServicesPaletteProvider() {
    	super();
    }
    
    public void contributeToPalette(IEditorPart editor, Object content,
			PaletteRoot root, Map predefinedEntries) {
    	if (editor instanceof CoreDiagramEditor) {
			((CoreDiagramEditor) editor).registerPaletteProvider(this);
		}
	}

	public void setContributions(IConfigurationElement configElement) {
	}

	public boolean provides(IOperation operation) {
		// we're never asked
		return false;
	}
}
