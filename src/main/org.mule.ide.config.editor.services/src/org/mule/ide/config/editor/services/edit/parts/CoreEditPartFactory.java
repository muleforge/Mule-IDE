package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class CoreEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CoreVisualIDRegistry.getVisualID(view)) {

			case DefaultModelTypeEditPart.VISUAL_ID:
				return new DefaultModelTypeEditPart(view);

			case SedaServiceTypeEditPart.VISUAL_ID:
				return new SedaServiceTypeEditPart(view);

			case SedaServiceTypeNameEditPart.VISUAL_ID:
				return new SedaServiceTypeNameEditPart(view);

			case PojoComponentTypeEditPart.VISUAL_ID:
				return new PojoComponentTypeEditPart(view);

			case PojoComponentTypeLabelEditPart.VISUAL_ID:
				return new PojoComponentTypeLabelEditPart(view);

			case PojoComponentTypeClassEditPart.VISUAL_ID:
				return new PojoComponentTypeClassEditPart(view);

			case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
				return new NoArgsCallWrapperTypeEditPart(view);

			case NoArgsCallWrapperTypeLabelEditPart.VISUAL_ID:
				return new NoArgsCallWrapperTypeLabelEditPart(view);

			case NoArgsCallWrapperTypeClassEditPart.VISUAL_ID:
				return new NoArgsCallWrapperTypeClassEditPart(view);

			case DefaultComponentTypeEditPart.VISUAL_ID:
				return new DefaultComponentTypeEditPart(view);

			case DefaultComponentTypeLabelEditPart.VISUAL_ID:
				return new DefaultComponentTypeLabelEditPart(view);

			case BridgeComponentTypeEditPart.VISUAL_ID:
				return new BridgeComponentTypeEditPart(view);

			case BridgeComponentTypeLabelEditPart.VISUAL_ID:
				return new BridgeComponentTypeLabelEditPart(view);

			case EchoComponentTypeEditPart.VISUAL_ID:
				return new EchoComponentTypeEditPart(view);

			case EchoComponentTypeLabelEditPart.VISUAL_ID:
				return new EchoComponentTypeLabelEditPart(view);

			case LogComponentTypeEditPart.VISUAL_ID:
				return new LogComponentTypeEditPart(view);

			case LogComponentTypeLabelEditPart.VISUAL_ID:
				return new LogComponentTypeLabelEditPart(view);

			case NullComponentTypeEditPart.VISUAL_ID:
				return new NullComponentTypeEditPart(view);

			case NullComponentTypeLabelEditPart.VISUAL_ID:
				return new NullComponentTypeLabelEditPart(view);

			case PassThroughComponentTypeEditPart.VISUAL_ID:
				return new PassThroughComponentTypeEditPart(view);

			case PassThroughComponentTypeLabelEditPart.VISUAL_ID:
				return new PassThroughComponentTypeLabelEditPart(view);

			case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
				return new DefaultServiceExceptionStrategyTypeEditPart(view);

			case DefaultServiceExceptionStrategyTypeLabelEditPart.VISUAL_ID:
				return new DefaultServiceExceptionStrategyTypeLabelEditPart(
						view);

			case OutboundEndpointTypeEditPart.VISUAL_ID:
				return new OutboundEndpointTypeEditPart(view);

			case OutboundEndpointTypeNameEditPart.VISUAL_ID:
				return new OutboundEndpointTypeNameEditPart(view);

			case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
				return new DefaultConnectorExceptionStrategyTypeEditPart(view);

			case DefaultConnectorExceptionStrategyTypeLabelEditPart.VISUAL_ID:
				return new DefaultConnectorExceptionStrategyTypeLabelEditPart(
						view);

			case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
				return new CustomExceptionStrategyTypeEditPart(view);

			case CustomExceptionStrategyTypeLabelEditPart.VISUAL_ID:
				return new CustomExceptionStrategyTypeLabelEditPart(view);

			case CustomExceptionStrategyTypeClassEditPart.VISUAL_ID:
				return new CustomExceptionStrategyTypeClassEditPart(view);

			case InboundRouterCollectionTypeEditPart.VISUAL_ID:
				return new InboundRouterCollectionTypeEditPart(view);

			case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				return new InboundEndpointServiceItemTypeEditPart(view);

			case InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
				return new InboundEndpointServiceItemTypeLabelEditPart(view);

			case ForwardingRouterTypeEditPart.VISUAL_ID:
				return new ForwardingRouterTypeEditPart(view);

			case ForwardingRouterTypeLabelEditPart.VISUAL_ID:
				return new ForwardingRouterTypeLabelEditPart(view);

			case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
				return new IdempotentSecureRecieverRouterTypeEditPart(view);

			case IdempotentSecureRecieverRouterTypeLabelEditPart.VISUAL_ID:
				return new IdempotentSecureRecieverRouterTypeLabelEditPart(view);

			case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
				return new PassThroughInboundRouterTypeEditPart(view);

			case PassThroughInboundRouterTypeLabelEditPart.VISUAL_ID:
				return new PassThroughInboundRouterTypeLabelEditPart(view);

			case IdempotentReceiverTypeEditPart.VISUAL_ID:
				return new IdempotentReceiverTypeEditPart(view);

			case IdempotentReceiverRouterTypeLabelEditPart.VISUAL_ID:
				return new IdempotentReceiverRouterTypeLabelEditPart(view);

			case WireTapRouterTypeEditPart.VISUAL_ID:
				return new WireTapRouterTypeEditPart(view);

			case WireTapRouterTypeLabelEditPart.VISUAL_ID:
				return new WireTapRouterTypeLabelEditPart(view);

			case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
				return new SelectiveConsumerRouterTypeEditPart(view);

			case SelectiveConsumerRouterTypeLabelEditPart.VISUAL_ID:
				return new SelectiveConsumerRouterTypeLabelEditPart(view);

			case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
				return new ChunkingInboundRouterTypeEditPart(view);

			case ChunkingInboundRouterTypeLabelEditPart.VISUAL_ID:
				return new ChunkingInboundRouterTypeLabelEditPart(view);

			case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
				return new CorrelationResequencerRouterTypeEditPart(view);

			case CorrelationResequencerRouterTypeLabelEditPart.VISUAL_ID:
				return new CorrelationResequencerRouterTypeLabelEditPart(view);

			case CorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
				return new CorrelationAggregatorRouterTypeEditPart(view);

			case CorrelationAggregatorRouterTypeLabelEditPart.VISUAL_ID:
				return new CorrelationAggregatorRouterTypeLabelEditPart(view);

			case CustomInboundRouterTypeEditPart.VISUAL_ID:
				return new CustomInboundRouterTypeEditPart(view);

			case CustomInboundRouterTypeLabelEditPart.VISUAL_ID:
				return new CustomInboundRouterTypeLabelEditPart(view);

			case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
				return new ResponseRouterCollectionTypeEditPart(view);

			case ResponseEndpointServiceItemTypeEditPart.VISUAL_ID:
				return new ResponseEndpointServiceItemTypeEditPart(view);

			case ResponseEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
				return new ResponseEndpointServiceItemTypeLabelEditPart(view);

			case ResponseRouterTypeEditPart.VISUAL_ID:
				return new ResponseRouterTypeEditPart(view);

			case ResponseRouterTypeLabelEditPart.VISUAL_ID:
				return new ResponseRouterTypeLabelEditPart(view);

			case CustomResponseRouterTypeEditPart.VISUAL_ID:
				return new CustomResponseRouterTypeEditPart(view);

			case CustomResponseRouterTypeLabelEditPart.VISUAL_ID:
				return new CustomResponseRouterTypeLabelEditPart(view);

			case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
				return new OutboundRouterCollectionTypeEditPart(view);

			case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
				return new SedaServiceTypeCOMPONENTEditPart(view);

			case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
				return new SedaServiceTypeEXCEPTIONEditPart(view);

			case SedaServiceTypeINBOUNDEditPart.VISUAL_ID:
				return new SedaServiceTypeINBOUNDEditPart(view);

			case SedaServiceTypeRESPONSEEditPart.VISUAL_ID:
				return new SedaServiceTypeRESPONSEEditPart(view);

			case SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID:
				return new SedaServiceTypeOUTBOUNDEditPart(view);

			case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
				return new DefaultServiceExceptionStrategyTypeENDPOINTSEditPart(
						view);

			case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
				return new DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart(
						view);

			case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
				return new CustomExceptionStrategyTypeENDPOINTSEditPart(view);

			case InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
				return new InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart(
						view);

			case InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
				return new InboundRouterCollectionTypeINBOUNDROUTERSEditPart(
						view);

			case ResponseRouterCollectionTypeRESPONSEENDPOINTSEditPart.VISUAL_ID:
				return new ResponseRouterCollectionTypeRESPONSEENDPOINTSEditPart(
						view);

			case ResponseRouterCollectionTypeRESPONSEROUTERSEditPart.VISUAL_ID:
				return new ResponseRouterCollectionTypeRESPONSEROUTERSEditPart(
						view);

			case OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
				return new OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart(
						view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapped()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}

	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
