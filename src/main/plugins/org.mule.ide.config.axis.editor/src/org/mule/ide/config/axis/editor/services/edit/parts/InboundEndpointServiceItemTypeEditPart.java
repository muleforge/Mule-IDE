package org.mule.ide.config.axis.editor.services.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.mule.ide.config.axis.editor.services.edit.policies.AxisTextSelectionEditPolicy;
import org.mule.ide.config.axis.editor.services.edit.policies.InboundEndpointServiceItemTypeItemSemanticEditPolicy;
import org.mule.ide.config.axis.editor.services.part.AxisVisualIDRegistry;
import org.mule.ide.config.axis.editor.services.part.Messages;
import org.mule.ide.config.editor.services.edit.parts.ServiceEditPartUtil;
import org.mule.ide.config.editor.services.edit.parts.ServiceItemNodeEditPart;

/**
 * customization
 */
public class InboundEndpointServiceItemTypeEditPart extends ServiceItemNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public InboundEndpointServiceItemTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InboundEndpointServiceItemTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new AxisTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		EndpointServiceItemFigure figure = new EndpointServiceItemFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public EndpointServiceItemFigure getPrimaryShape() {
		return (EndpointServiceItemFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InboundEndpointServiceItemTypeLabelEditPart) {
			((InboundEndpointServiceItemTypeLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEndpointServiceItemTypeLabelFigure());
			return true;
		}
		if (childEditPart instanceof InboundEndpointServiceItemEndpointNameEditPart) {
			((InboundEndpointServiceItemEndpointNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEndpointServiceItemEndpointNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(10));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * customization
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		ServiceEditPartUtil.configureServiceItemFigure(figure,
				Messages.InboundEndpointServiceItemTypeLabel);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(AxisVisualIDRegistry
				.getType(InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class EndpointServiceItemFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrapLabel fFigureEndpointServiceItemTypeLabelFigure;
		/**
		 * @generated
		 */
		private WrapLabel fFigureEndpointServiceItemEndpointNameFigure;

		/**
		 * @generated
		 */
		public EndpointServiceItemFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEndpointServiceItemTypeLabelFigure = new WrapLabel();
			fFigureEndpointServiceItemTypeLabelFigure.setText("");
			fFigureEndpointServiceItemTypeLabelFigure
					.setForegroundColor(ColorConstants.gray);

			fFigureEndpointServiceItemTypeLabelFigure
					.setFont(FFIGUREENDPOINTSERVICEITEMTYPELABELFIGURE_FONT);

			this.add(fFigureEndpointServiceItemTypeLabelFigure);

			fFigureEndpointServiceItemEndpointNameFigure = new WrapLabel();
			fFigureEndpointServiceItemEndpointNameFigure.setText("");

			fFigureEndpointServiceItemEndpointNameFigure
					.setFont(FFIGUREENDPOINTSERVICEITEMENDPOINTNAMEFIGURE_FONT);

			fFigureEndpointServiceItemEndpointNameFigure
					.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
							getMapMode().DPtoLP(15), getMapMode().DPtoLP(0),
							getMapMode().DPtoLP(0)));

			this.add(fFigureEndpointServiceItemEndpointNameFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureEndpointServiceItemTypeLabelFigure() {
			return fFigureEndpointServiceItemTypeLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureEndpointServiceItemEndpointNameFigure() {
			return fFigureEndpointServiceItemEndpointNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 250, 250, 190);

	/**
	 * @generated
	 */
	static final Font FFIGUREENDPOINTSERVICEITEMTYPELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font FFIGUREENDPOINTSERVICEITEMENDPOINTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.NORMAL);

}