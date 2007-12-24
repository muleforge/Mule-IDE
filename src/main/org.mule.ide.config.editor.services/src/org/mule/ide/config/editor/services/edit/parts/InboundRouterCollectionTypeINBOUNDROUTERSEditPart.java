package org.mule.ide.config.editor.services.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.handles.CompartmentCollapseHandle;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.policies.InboundRouterCollectionTypeINBOUNDROUTERSCanonicalEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.InboundRouterCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.Messages;

/**
 * customization
 *  - subclass CustomNonCollapsibleCompartmentEditPart
 */
public class InboundRouterCollectionTypeINBOUNDROUTERSEditPart extends
		CustomNonCollapsibleCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5007;

	/**
	 * @generated
	 */
	public InboundRouterCollectionTypeINBOUNDROUTERSEditPart(View view) {
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
		return Messages.InboundRouterCollectionTypeINBOUNDROUTERSEditPart_title;
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
				new InboundRouterCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new InboundRouterCollectionTypeINBOUNDROUTERSCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
