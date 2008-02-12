package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.editor.services.edit.policies.OutboundCollectionTypeOUTBOUNDROUTERSCanonicalEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.OutboundCollectionTypeOUTBOUNDROUTERSItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.Messages;

/**
 * customization
 *  - subclass CustomListCompartmentEditPart
 */
public class OutboundCollectionTypeOUTBOUNDROUTERSEditPart extends
		CustomListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5012;

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
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
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

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof OutboundCollectionType) {
			updateFace(getFigure());
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void updateFace(IFigure figure) {
		OutboundCollectionType collection = (OutboundCollectionType) ((Node) getModel())
				.getElement();
		if (collection == null
				|| collection.getAbstractOutboundRouter().isEmpty()) {
			setCompartmentEmpty(figure);
		} else {
			setCompartmentNonEmpty(figure);
		}
	}

	@Override
	public String getToolTip() {
		// TODO Auto-generated method stub
		return null;
	}
}
