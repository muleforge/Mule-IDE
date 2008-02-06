package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.editor.services.edit.policies.OutboundCollectionTypeOUTBOUNDROUTERSCanonicalEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.OutboundCollectionTypeOUTBOUNDROUTERSItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.Messages;

/**
 * customization
 *  - subclass CustomNonCollapsibleCompartmentEditPart
 */
public class OutboundCollectionTypeOUTBOUNDROUTERSEditPart extends
		CustomNonCollapsibleCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5013;

	/**
	 * @generated
	 */
	public OutboundCollectionTypeOUTBOUNDROUTERSEditPart(View view) {
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
		return Messages.OutboundCollectionTypeOUTBOUNDROUTERSEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OutboundCollectionTypeOUTBOUNDROUTERSItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new OutboundCollectionTypeOUTBOUNDROUTERSCanonicalEditPolicy());
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof OutboundCollectionType) {
			((CustomListCompartmentEditPart) (getParent().getParent())).updateFace();
		}
		super.handleNotificationEvent(notification);
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
		return Messages.OutboundCollectionTypeOUTBOUNDROUTERSEditPart_tooltip;
	}

}
