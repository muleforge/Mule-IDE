package org.mule.ide.config.editor.services.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.NestedResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

public abstract class CustomNonCollapsibleCompartmentEditPart extends CustomListCompartmentEditPart {

	public CustomNonCollapsibleCompartmentEditPart(EObject model) {
		super(model);
	}

	/**
	 * override to hide the compartment collapse handle
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new CustomResizableCompartmentEditPolicy());
	}

	private class CustomResizableCompartmentEditPolicy extends ResizableCompartmentEditPolicy {
		
		protected List createCollapseHandles() {
			IGraphicalEditPart part = (IGraphicalEditPart) getHost();

			List collapseHandles = new ArrayList();
			//collapseHandles.add(new CompartmentCollapseHandle(part));
			return collapseHandles;
		}
	}


	/**
	 * override to hide the top border line, turn off scrolling, and 
	 * remove the side margins.
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		result.setBorder(null);
		result.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
		result.getScrollPane().getContents().setBorder(null);
		return result;
	}
}
