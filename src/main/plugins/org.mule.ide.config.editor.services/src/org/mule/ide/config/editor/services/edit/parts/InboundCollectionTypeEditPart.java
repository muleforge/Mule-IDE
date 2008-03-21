package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.mule.ide.config.editor.services.edit.policies.CoreTextSelectionEditPolicy;
import org.mule.ide.config.editor.services.edit.policies.InboundCollectionTypeItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class InboundCollectionTypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2012;

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
	public InboundCollectionTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy() {
					public Command getCommand(Request request) {
						if (understandsRequest(request)) {
							if (request instanceof CreateViewAndElementRequest) {
								CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
										.getViewAndElementDescriptor()
										.getCreateElementRequestAdapter();
								IElementType type = (IElementType) adapter
										.getAdapter(IElementType.class);
								if (type == CoreElementTypes.InboundEndpointType_2013) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.SelectiveConsumerRouterType_2014) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.FilteredInboundRouterType_2015) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.FilteredInboundRouterType_2016) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.FilteredInboundRouterType_2017) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.WireTapRouterType_2018) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.SelectiveConsumerRouterType_2019) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.MessageChunkingAggregatorRouterType_2020) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.SelectiveConsumerRouterType_2021) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.CustomCorrelationAggregatorRouterType_2022) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == CoreElementTypes.CustomInboundRouterType_2023) {
									EditPart compartmentEditPart = getChildBySemanticHint(CoreVisualIDRegistry
											.getType(InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
							}
							return super.getCommand(request);
						}
						return null;
					}
				});

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InboundCollectionTypeItemSemanticEditPolicy());
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
						return new CoreTextSelectionEditPolicy();
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
		CollectionFigure figure = new CollectionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CollectionFigure getPrimaryShape() {
		return (CollectionFigure) primaryShape;
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
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
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
	public class CollectionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public CollectionFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(1);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			this.setOutlineXOR(true);
			this.setLineWidth(0);
			this.setForegroundColor(ColorConstants.black);

			this.setFont(THIS_FONT);

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

	}

	/**
	 * @generated
	 */
	static final Font THIS_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.ITALIC);

}
