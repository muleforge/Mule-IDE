package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.notation.View;

/**
 *  Superclass to use for read-only label edit parts.
 *  This is an alternative to installing customized edit policies, which
 *  is what should be done if subclassing is not an option.
 *
 */
public class ReadOnlyLabelCompartmentEditPart extends CompartmentEditPart {

	public ReadOnlyLabelCompartmentEditPart(View view) {
		super(view);
	}
	
	@Override
	public boolean isSelectable() {
		return false;
	}
}
