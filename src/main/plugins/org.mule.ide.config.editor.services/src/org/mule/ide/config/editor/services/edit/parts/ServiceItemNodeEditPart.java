package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.policies.CoreServiceItemSelectionEditPolicy;

public abstract class ServiceItemNodeEditPart extends ShapeNodeEditPart {

	public ServiceItemNodeEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, getPrimaryDragEditPolicy());
	}

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new CoreServiceItemSelectionEditPolicy();
	}
}
