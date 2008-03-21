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

			case JavaComponentTypeEditPart.VISUAL_ID:
				return new JavaComponentTypeEditPart(view);

			case JavaComponentTypeLabelEditPart.VISUAL_ID:
				return new JavaComponentTypeLabelEditPart(view);

			case JavaComponentTypeClassEditPart.VISUAL_ID:
				return new JavaComponentTypeClassEditPart(view);

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

			case PooledJavaComponentTypeEditPart.VISUAL_ID:
				return new PooledJavaComponentTypeEditPart(view);

			case PooledJavaComponentTypeLabelEditPart.VISUAL_ID:
				return new PooledJavaComponentTypeLabelEditPart(view);

			case PooledJavaComponentTypeClassEditPart.VISUAL_ID:
				return new PooledJavaComponentTypeClassEditPart(view);

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

			case InboundCollectionTypeEditPart.VISUAL_ID:
				return new InboundCollectionTypeEditPart(view);

			case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				return new InboundEndpointServiceItemTypeEditPart(view);

			case InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
				return new InboundEndpointServiceItemTypeLabelEditPart(view);

			case InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
				return new InboundEndpointServiceItemEndpointNameEditPart(view);

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

			case IdempotentReceiverRouterTypeEditPart.VISUAL_ID:
				return new IdempotentReceiverRouterTypeEditPart(view);

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

			case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
				return new CustomCorrelationAggregatorRouterTypeEditPart(view);

			case CustomCorrelationAggregatorRouterTypeLabelEditPart.VISUAL_ID:
				return new CustomCorrelationAggregatorRouterTypeLabelEditPart(
						view);

			case CustomCorrelationAggregatorRouterTypeClassEditPart.VISUAL_ID:
				return new CustomCorrelationAggregatorRouterTypeClassEditPart(
						view);

			case CustomInboundRouterTypeEditPart.VISUAL_ID:
				return new CustomInboundRouterTypeEditPart(view);

			case CustomInboundRouterTypeLabelEditPart.VISUAL_ID:
				return new CustomInboundRouterTypeLabelEditPart(view);

			case CustomInboundRouterTypeClassEditPart.VISUAL_ID:
				return new CustomInboundRouterTypeClassEditPart(view);

			case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
				return new AsyncReplyCollectionTypeEditPart(view);

			case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				return new AsyncReplyInboundEndpointServiceItemTypeEditPart(
						view);

			case AsyncReplyInboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
				return new AsyncReplyInboundEndpointServiceItemTypeLabelEditPart(
						view);

			case AsyncReplyInboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
				return new AsyncReplyInboundEndpointServiceItemEndpointNameEditPart(
						view);

			case AsyncReplyRouterTypeEditPart.VISUAL_ID:
				return new AsyncReplyRouterTypeEditPart(view);

			case AsyncReplyRouterTypeLabelEditPart.VISUAL_ID:
				return new AsyncReplyRouterTypeLabelEditPart(view);

			case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
				return new CustomAsyncReplyRouterTypeEditPart(view);

			case CustomAsyncReplyRouterTypeLabelEditPart.VISUAL_ID:
				return new CustomAsyncReplyRouterTypeLabelEditPart(view);

			case CustomAsyncReplyRouterTypeClassEditPart.VISUAL_ID:
				return new CustomAsyncReplyRouterTypeClassEditPart(view);

			case OutboundCollectionTypeEditPart.VISUAL_ID:
				return new OutboundCollectionTypeEditPart(view);

			case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
				return new PassThroughOutboundRouterTypeEditPart(view);

			case PassThroughOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new PassThroughOutboundRouterTypeLabelEditPart(view);

			case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
				return new OutboundRouterOutboundEndpointTypeEditPart(view);

			case OutboundRouterOutboundEndpointTypeNameEditPart.VISUAL_ID:
				return new OutboundRouterOutboundEndpointTypeNameEditPart(view);

			case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
				return new FilteringOutboundRouterTypeEditPart(view);

			case FilteringOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new FilteringOutboundRouterTypeLabelEditPart(view);

			case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
				return new ChainingOutboundRouterTypeEditPart(view);

			case ChainingOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new ChainingOutboundRouterTypeLabelEditPart(view);

			case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
				return new ExceptionOutboundRouterTypeEditPart(view);

			case ExceptionOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new ExceptionOutboundRouterTypeLabelEditPart(view);

			case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
				return new MulticastingOutboundRouterTypeEditPart(view);

			case MulticastingOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new MulticastingOutboundRouterTypeLabelEditPart(view);

			case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
				return new TemplateEndpointOutboundRouterTypeEditPart(view);

			case TemplateEndpointOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new TemplateEndpointOutboundRouterTypeLabelEditPart(view);

			case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
				return new EndpointSelectorRouterTypeEditPart(view);

			case EndpointSelectorRouterTypeLabelEditPart.VISUAL_ID:
				return new EndpointSelectorRouterTypeLabelEditPart(view);

			case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
				return new MessageSplitterOutboundRouterTypeEditPart(view);

			case MessageSplitterOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new MessageSplitterOutboundRouterTypeLabelEditPart(view);

			case ChunkingRouterTypeEditPart.VISUAL_ID:
				return new ChunkingRouterTypeEditPart(view);

			case ChunkingRouterTypeLabelEditPart.VISUAL_ID:
				return new ChunkingRouterTypeLabelEditPart(view);

			case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
				return new StaticRecipientListRouterTypeEditPart(view);

			case StaticRecipientListRouterTypeLabelEditPart.VISUAL_ID:
				return new StaticRecipientListRouterTypeLabelEditPart(view);

			case CustomOutboundRouterTypeEditPart.VISUAL_ID:
				return new CustomOutboundRouterTypeEditPart(view);

			case CustomOutboundRouterTypeLabelEditPart.VISUAL_ID:
				return new CustomOutboundRouterTypeLabelEditPart(view);

			case CustomOutboundRouterTypeClassEditPart.VISUAL_ID:
				return new CustomOutboundRouterTypeClassEditPart(view);

			case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
				return new SedaServiceTypeCOMPONENTEditPart(view);

			case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
				return new SedaServiceTypeEXCEPTIONEditPart(view);

			case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
				return new DefaultServiceExceptionStrategyTypeENDPOINTSEditPart(
						view);

			case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
				return new DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart(
						view);

			case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
				return new CustomExceptionStrategyTypeENDPOINTSEditPart(view);

			case InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
				return new InboundCollectionTypeINBOUNDROUTERSEditPart(view);

			case AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
				return new AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart(
						view);

			case OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
				return new OutboundCollectionTypeOUTBOUNDROUTERSEditPart(view);

			case PassThroughOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new PassThroughOutboundRouterTypeENDPOINTSEditPart(view);

			case FilteringOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new FilteringOutboundRouterTypeENDPOINTSEditPart(view);

			case ChainingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new ChainingOutboundRouterTypeENDPOINTSEditPart(view);

			case ExceptionOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new ExceptionOutboundRouterTypeENDPOINTSEditPart(view);

			case MulticastingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new MulticastingOutboundRouterTypeENDPOINTSEditPart(view);

			case TemplateEndpointOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new TemplateEndpointOutboundRouterTypeENDPOINTSEditPart(
						view);

			case EndpointSelectorRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new EndpointSelectorRouterTypeENDPOINTSEditPart(view);

			case MessageSplitterOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new MessageSplitterOutboundRouterTypeENDPOINTSEditPart(
						view);

			case ChunkingRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new ChunkingRouterTypeENDPOINTSEditPart(view);

			case StaticRecipientListRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new StaticRecipientListRouterTypeENDPOINTSEditPart(view);

			case CustomOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
				return new CustomOutboundRouterTypeENDPOINTSEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			case ConnectionEndpointEditPart.VISUAL_ID:
				return new ConnectionEndpointEditPart(view);
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
