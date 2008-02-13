package org.mule.ide.config.editor.services.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.editor.services.edit.policies.AsyncReplyCollectionTypeASYNCREPLYROUTERSCanonicalEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.AsyncReplyCollectionTypeASYNCREPLYROUTERSItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.Messages;

/**
 * customization
 *  - subclass CustomListCompartmentEditPart
 */
public class AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart extends
		CustomListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5007;

	/**
	 * @generated
	 */
	public AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart(View view) {
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
		return Messages.AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart_title;
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
				new AsyncReplyCollectionTypeASYNCREPLYROUTERSItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new AsyncReplyCollectionTypeASYNCREPLYROUTERSCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

	@Override
	//TODO  Probably should figure out how to use the GMF Style mechanism instead of overriding.
	protected List getSortedChildren() {
		EList allChildren;
        Object model = getModel();
        if(model!=null && model instanceof View){
        	allChildren = ((View)model).getVisibleChildren();
        } else {
        	return Collections.EMPTY_LIST;
        }
		
		List<View> sorted = new ArrayList<View>(allChildren.size());
		int i = 0;
		for (int j = 0; j < allChildren.size(); j++) {
			View view = (View) allChildren.get(j);
			if (view.getElement() instanceof AbstractInboundEndpointType) {
				sorted.add(i++, view);
			} else {
				sorted.add(view);
			}
		}
		return sorted;
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof AsyncReplyCollectionType) {
			updateFace(getFigure());
		}
		super.handleNotificationEvent(notification);
	}

	@Override
	protected void updateFace(IFigure figure) {
		AsyncReplyCollectionType collection = (AsyncReplyCollectionType) ((Node) getModel())
				.getElement();
		if (collection == null
				|| (collection.getAbstractAsyncReplyRouter().isEmpty() && collection
						.getAbstractInboundEndpoint().isEmpty())) {
			setCompartmentEmpty(figure);
		} else {
			setCompartmentNonEmpty(figure);
		}
	}

	@Override
	public String getToolTip() {
		return Messages.AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart_tooltip;
	}

}
