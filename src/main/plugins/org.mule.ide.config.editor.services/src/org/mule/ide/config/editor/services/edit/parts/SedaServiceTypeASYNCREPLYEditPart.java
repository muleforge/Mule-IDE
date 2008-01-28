package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.policies.SedaServiceTypeASYNCREPLYCanonicalEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.SedaServiceTypeASYNCREPLYItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.Messages;

/**
 * customization
 *  - subclass CustomListCompartmentEditPart
 */
public class SedaServiceTypeASYNCREPLYEditPart extends
		CustomListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5004;

	/**
	 * @generated
	 */
	public SedaServiceTypeASYNCREPLYEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.SedaServiceTypeASYNCREPLYEditPart_title;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SedaServiceTypeASYNCREPLYItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SedaServiceTypeASYNCREPLYCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

	@Override
	public String getToolTip() {
		// TODO Auto-generated method stub
		return null;
	}

}
