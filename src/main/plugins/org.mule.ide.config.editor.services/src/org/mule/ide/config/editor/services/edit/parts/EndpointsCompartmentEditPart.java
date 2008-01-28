package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;

public abstract class EndpointsCompartmentEditPart extends CustomListCompartmentEditPart {

	public EndpointsCompartmentEditPart(EObject model) {
		super(model);
	}

	/**
	 * customization
	 *  - configure border
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		//result.setBorder(null);
		// left inset of 10 will line up with a 15 inset of label above.
		result.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode()
				.DPtoLP(10), getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
		return result;
	}
}
