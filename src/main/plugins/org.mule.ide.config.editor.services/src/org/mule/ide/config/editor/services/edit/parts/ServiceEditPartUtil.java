package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

public class ServiceEditPartUtil {
	
	public static void configureServiceItemFigure(NodeFigure figure, String typeLabelText) {
		//((DefaultSizeNodeFigure) figure).setDefaultSize(mapMode.DPtoLP(40), mapMode.DPtoLP(10));
		IFigure childFigure = (IFigure) figure.getChildren().get(0);
		WrapLabel typeLabel = (WrapLabel) childFigure.getChildren().get(0);
		typeLabel.setText(typeLabelText);
	}

}
