package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.NestedResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

public abstract class CustomListCompartmentEditPart extends ListCompartmentEditPart {

	public CustomListCompartmentEditPart(EObject model) {
		super(model);
	}

	public IFigure createFigure() {
		ResizableCompartmentFigure rcf;
		if (getParent() == getTopGraphicEditPart()){
			rcf = (ResizableCompartmentFigure) super.createFigure();
		} else {
			rcf = new NestedResizableCompartmentFigure(getMapMode());
		}
		
		ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setStretchMajorAxis(true);
			layout.setStretchMinorAxis(true);
			layout.setMinorAlignment(ConstrainedToolbarLayout.ALIGN_TOPLEFT);
			rcf.getContentPane().setLayoutManager(layout);
		
		
		return rcf;
	}

}
