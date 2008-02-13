package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.editor.services.edit.policies.SedaServiceTypeCOMPONENTCanonicalEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.SedaServiceTypeCOMPONENTItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.Messages;

/**
 *
 */
public class SedaServiceTypeCOMPONENTEditPart extends
		CustomListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5001;

	/**
	 * @generated
	 */
	public SedaServiceTypeCOMPONENTEditPart(View view) {
		super(view);
	}

	@Override
	public boolean isSelectable() {
		return false;
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
		return Messages.SedaServiceTypeCOMPONENTEditPart_title;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SedaServiceTypeCOMPONENTItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SedaServiceTypeCOMPONENTCanonicalEditPolicy());
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
		if (notification.getNotifier() instanceof BaseServiceType) {
			updateFace(getFigure());
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void updateFace(IFigure figure) {
		BaseServiceType service = (BaseServiceType) ((Node) getModel())
				.getElement();
		if (service.getAbstractComponent() == null) {
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
