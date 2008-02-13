package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.NestedResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public abstract class CustomListCompartmentEditPart extends ListCompartmentEditPart {

	// Background color to display when compartment is empty.
	static final Color EMPTY_BACKGROUND = new Color(null, 240, 240, 240);
	static final Color EMPTY_FONT = new Color(null, 96, 96, 96);
	
	public CustomListCompartmentEditPart(EObject model) {
		super(model);
		
		// Add support for automatically expanding the compartment
		// on child add events.
		model.eAdapters().add(new AdapterImpl() {
			  public void notifyChanged(Notification msg) {
				  if (expandOnNotification(msg)) {
					  Display.getDefault().asyncExec(new Runnable(){
						  public void run(){
							  View view  = getNotationView();
							  DrawerStyle style = (DrawerStyle) view.getStyle(NotationPackage.eINSTANCE.getDrawerStyle());
							  if (style != null && style.isCollapsed()) {
								  ChangePropertyValueRequest request = new ChangePropertyValueRequest(
										  DiagramUIMessages.PropertyDescriptorFactory_CollapseCompartment,
										  Properties.ID_COLLAPSED, false);
									  Command command = getCommand(request);
									  if (command.canExecute()) {
										  executeCommand(command);
									  }
							  }
						  }
					  });
				  }
			  }
		});
	}
	
	protected boolean expandOnNotification(Notification msg) {
		if (msg.getEventType() == Notification.ADD
				|| msg.getEventType() == Notification.ADD_MANY) {
			return true;
		}
		return false;
	}
	
	public abstract String getToolTip();

	/**
	 * Subclasses can set figure to opaque when compartment is empty in order
	 * to display the default empty compartment background color.
	 * 
	 * Called during initialization.
	 * 
	 * @param figure
	 * @param o
	 */
	protected void updateFace(IFigure figure) {
		// no-op
	}
	
	/**
	 * Subclasses can set figure to opaque when compartment is empty in order
	 * to display the default empty compartment background color.
	 * 
	 * May be called in response to child model changes.
	 */
	public void updateFace() {
		updateFace(getFigure());
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
		layout.setSpacing(1);
		rcf.getContentPane().setLayoutManager(layout);
		
		rcf.setToolTip(getToolTip());

		rcf.setBorder(new CompoundBorder(new OneLineBorder(ColorConstants.black), new MarginBorder(0,1,0,1)));
		rcf.setBackgroundColor(EMPTY_BACKGROUND);
		updateFace(rcf);

		return rcf;
	}

	protected void setCompartmentEmpty(IFigure figure) {
		if (figure.isOpaque()) return;
		figure.setOpaque(true);
		((ResizableCompartmentFigure) figure).getTextPane().setForegroundColor(EMPTY_FONT);		
	}
	
	protected void setCompartmentNonEmpty(IFigure figure) {
		if (! figure.isOpaque()) return;
		figure.setOpaque(false);	
		((ResizableCompartmentFigure) figure).getTextPane().setForegroundColor(ColorConstants.black);		
	}
}
