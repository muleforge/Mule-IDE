package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.editor.services.edit.policies.AsyncReplyCollectionTypeINBOUNDENDPOINTSCanonicalEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.AsyncReplyCollectionTypeINBOUNDENDPOINTSItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.Messages;

/**
 * customization
 *  - subclass CustomNonCollapsibleCompartmentEditPart
 */
public class AsyncReplyCollectionTypeINBOUNDENDPOINTSEditPart extends
		CustomNonCollapsibleCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5010;

	/**
	 * @generated
	 */
	public AsyncReplyCollectionTypeINBOUNDENDPOINTSEditPart(View view) {
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
		return Messages.AsyncReplyCollectionTypeINBOUNDENDPOINTSEditPart_title;
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
				new AsyncReplyCollectionTypeINBOUNDENDPOINTSItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new AsyncReplyCollectionTypeINBOUNDENDPOINTSCanonicalEditPolicy());
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
		if (notification.getNotifier() instanceof AsyncReplyCollectionType) {
			((CustomListCompartmentEditPart) (getParent().getParent()))
					.updateFace();
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	public String getToolTip() {
		return Messages.InboundEndpointsCompartment_tooltip;
	}

}
