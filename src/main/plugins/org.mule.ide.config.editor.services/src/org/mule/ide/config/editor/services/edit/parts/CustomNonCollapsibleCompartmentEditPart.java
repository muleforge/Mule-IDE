package org.mule.ide.config.editor.services.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.swt.graphics.Color;

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
	 * override to customize border, turn off scrolling, and 
	 * remove the side margins.
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		//result.setBorder(null);
        result.setBorder(new CustomOneLineBorder(ColorConstants.lightGray));
		result.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
		result.getScrollPane().getContents().setBorder(null);
		// creates space between contained figures
		// TODO investigate moving the spacing settings to gmfgraph
		((ConstrainedToolbarLayout) result.getContentPane().getLayoutManager()).setSpacing(1);
		return result;
	}
	
	private class CustomOneLineBorder extends OneLineBorder {
		
		public CustomOneLineBorder(Color color) {
			super(color);
		}
		
		// creates space between top line border and first contained figure
		public Insets getInsets(IFigure figure) {
			return new Insets(getWidth()+1, 0, 0, 0);
		}
		
		// OneLineBorder currently isn't respecting color setting
		public void paint(IFigure figure, Graphics graphics, Insets insets) {
			if (getColor() != null)
				graphics.setForegroundColor(getColor());
			super.paint(figure, graphics, insets);
		}
	}
}
