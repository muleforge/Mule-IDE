package org.mule.ide.config.editor.services.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.parts.*;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationAggregatorRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeOUTBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.editor.services.view.factories.*;
import org.mule.ide.config.editor.services.view.factories.BridgeComponentTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.BridgeComponentTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.ChainingOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.ChainingOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.ChunkingInboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.ChunkingInboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.ChunkingRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.ChunkingRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.CorrelationAggregatorRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.CorrelationAggregatorRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.CorrelationResequencerRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.CorrelationResequencerRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomExceptionStrategyTypeClassViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomExceptionStrategyTypeENDPOINTSViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomExceptionStrategyTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomExceptionStrategyTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomInboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomInboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.CustomOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultComponentTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultComponentTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultConnectorExceptionStrategyTypeENDPOINTSViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultConnectorExceptionStrategyTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultConnectorExceptionStrategyTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultModelTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultServiceExceptionStrategyTypeENDPOINTSViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultServiceExceptionStrategyTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.DefaultServiceExceptionStrategyTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.EchoComponentTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.EchoComponentTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.EndpointSelectorRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.EndpointSelectorRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.ExceptionOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.ExceptionOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.FilteringOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.FilteringOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.ForwardingRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.ForwardingRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.IdempotentReceiverRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.IdempotentReceiverTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.IdempotentSecureRecieverRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.IdempotentSecureRecieverRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.InboundEndpointServiceItemTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.InboundEndpointServiceItemTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.InboundRouterCollectionTypeINBOUNDENDPOINTSViewFactory;
import org.mule.ide.config.editor.services.view.factories.InboundRouterCollectionTypeINBOUNDROUTERSViewFactory;
import org.mule.ide.config.editor.services.view.factories.InboundRouterCollectionTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.LogComponentTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.LogComponentTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.MessageSplitterOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.MessageSplitterOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.MulticastingOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.MulticastingOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.NoArgsCallWrapperTypeClassViewFactory;
import org.mule.ide.config.editor.services.view.factories.NoArgsCallWrapperTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.NoArgsCallWrapperTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.NullComponentTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.NullComponentTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.OutboundEndpointTypeNameViewFactory;
import org.mule.ide.config.editor.services.view.factories.OutboundEndpointTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.OutboundRouterCollectionTypeOUTBOUNDROUTERSViewFactory;
import org.mule.ide.config.editor.services.view.factories.OutboundRouterCollectionTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.PassThroughComponentTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.PassThroughComponentTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.PassThroughInboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.PassThroughInboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.PassThroughOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.PassThroughOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.PojoComponentTypeClassViewFactory;
import org.mule.ide.config.editor.services.view.factories.PojoComponentTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.PojoComponentTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeCOMPONENTViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeEXCEPTIONViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeINBOUNDViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeNameViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeOUTBOUNDViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.SelectiveConsumerRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.SelectiveConsumerRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.StaticRecipientListRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.StaticRecipientListRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.TemplateEndpointOutboundRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.TemplateEndpointOutboundRouterTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.WireTapRouterTypeLabelViewFactory;
import org.mule.ide.config.editor.services.view.factories.WireTapRouterTypeViewFactory;

/**
 * @generated
 */
public class CoreViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (DefaultModelTypeEditPart.MODEL_ID.equals(diagramKind)
				&& CoreVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return DefaultModelTypeViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = CoreVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = CoreVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!CoreElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != CoreVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!DefaultModelTypeEditPart.MODEL_ID
						.equals(CoreVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case SedaServiceTypeEditPart.VISUAL_ID:
				case PojoComponentTypeEditPart.VISUAL_ID:
				case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
				case DefaultComponentTypeEditPart.VISUAL_ID:
				case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
				case OutboundEndpointTypeEditPart.VISUAL_ID:
				case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
				case InboundRouterCollectionTypeEditPart.VISUAL_ID:
				case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				case ForwardingRouterTypeEditPart.VISUAL_ID:
				case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
				case IdempotentReceiverTypeEditPart.VISUAL_ID:
				case WireTapRouterTypeEditPart.VISUAL_ID:
				case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
				case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
				case CorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
				case CustomInboundRouterTypeEditPart.VISUAL_ID:
				case AsyncReplyRouterCollectionTypeEditPart.VISUAL_ID:
				case AsyncReplyRouterTypeEditPart.VISUAL_ID:
				case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
				case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
				case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
				case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
				case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
				case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
				case ChunkingRouterTypeEditPart.VISUAL_ID:
				case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
				case CustomOutboundRouterTypeEditPart.VISUAL_ID:
				case BridgeComponentTypeEditPart.VISUAL_ID:
				case EchoComponentTypeEditPart.VISUAL_ID:
				case LogComponentTypeEditPart.VISUAL_ID:
				case NullComponentTypeEditPart.VISUAL_ID:
				case PassThroughComponentTypeEditPart.VISUAL_ID:
				case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
				case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
				case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
				case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
				case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
				case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
				case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != CoreVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case SedaServiceTypeNameEditPart.VISUAL_ID:
				case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
				case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
				case SedaServiceTypeINBOUNDEditPart.VISUAL_ID:
				case SedaServiceTypeASYNCREPLYEditPart.VISUAL_ID:
				case SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID:
					if (SedaServiceTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PojoComponentTypeLabelEditPart.VISUAL_ID:
				case PojoComponentTypeClassEditPart.VISUAL_ID:
					if (PojoComponentTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NoArgsCallWrapperTypeLabelEditPart.VISUAL_ID:
				case NoArgsCallWrapperTypeClassEditPart.VISUAL_ID:
					if (NoArgsCallWrapperTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DefaultComponentTypeLabelEditPart.VISUAL_ID:
					if (DefaultComponentTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BridgeComponentTypeLabelEditPart.VISUAL_ID:
					if (BridgeComponentTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EchoComponentTypeLabelEditPart.VISUAL_ID:
					if (EchoComponentTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LogComponentTypeLabelEditPart.VISUAL_ID:
					if (LogComponentTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NullComponentTypeLabelEditPart.VISUAL_ID:
					if (NullComponentTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PassThroughComponentTypeLabelEditPart.VISUAL_ID:
					if (PassThroughComponentTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DefaultServiceExceptionStrategyTypeLabelEditPart.VISUAL_ID:
				case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
					if (DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutboundEndpointTypeNameEditPart.VISUAL_ID:
					if (OutboundEndpointTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DefaultConnectorExceptionStrategyTypeLabelEditPart.VISUAL_ID:
				case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
					if (DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CustomExceptionStrategyTypeLabelEditPart.VISUAL_ID:
				case CustomExceptionStrategyTypeClassEditPart.VISUAL_ID:
				case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
					if (CustomExceptionStrategyTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
				case InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
					if (InboundRouterCollectionTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
					if (InboundEndpointServiceItemTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ForwardingRouterTypeLabelEditPart.VISUAL_ID:
					if (ForwardingRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IdempotentSecureRecieverRouterTypeLabelEditPart.VISUAL_ID:
					if (IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PassThroughInboundRouterTypeLabelEditPart.VISUAL_ID:
					if (PassThroughInboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IdempotentReceiverRouterTypeLabelEditPart.VISUAL_ID:
					if (IdempotentReceiverTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WireTapRouterTypeLabelEditPart.VISUAL_ID:
					if (WireTapRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SelectiveConsumerRouterTypeLabelEditPart.VISUAL_ID:
					if (SelectiveConsumerRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ChunkingInboundRouterTypeLabelEditPart.VISUAL_ID:
					if (ChunkingInboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CorrelationResequencerRouterTypeLabelEditPart.VISUAL_ID:
					if (CorrelationResequencerRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CorrelationAggregatorRouterTypeLabelEditPart.VISUAL_ID:
				case CorrelationAggregatorRouterTypeClassEditPart.VISUAL_ID:
					if (CorrelationAggregatorRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CustomInboundRouterTypeLabelEditPart.VISUAL_ID:
				case CustomInboundRouterTypeClassEditPart.VISUAL_ID:
					if (CustomInboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AsyncReplyRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
				case AsyncReplyRouterCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
					if (AsyncReplyRouterCollectionTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AsyncReplyInboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
					if (AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AsyncReplyRouterTypeLabelEditPart.VISUAL_ID:
					if (AsyncReplyRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CustomAsyncReplyRouterTypeLabelEditPart.VISUAL_ID:
				case CustomAsyncReplyRouterTypeClassEditPart.VISUAL_ID:
					if (CustomAsyncReplyRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
					if (OutboundRouterCollectionTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PassThroughOutboundRouterTypeLabelEditPart.VISUAL_ID:
					if (PassThroughOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FilteringOutboundRouterTypeLabelEditPart.VISUAL_ID:
					if (FilteringOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ChainingOutboundRouterTypeLabelEditPart.VISUAL_ID:
					if (ChainingOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExceptionOutboundRouterTypeLabelEditPart.VISUAL_ID:
					if (ExceptionOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MulticastingOutboundRouterTypeLabelEditPart.VISUAL_ID:
					if (MulticastingOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TemplateEndpointOutboundRouterTypeLabelEditPart.VISUAL_ID:
					if (TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EndpointSelectorRouterTypeLabelEditPart.VISUAL_ID:
					if (EndpointSelectorRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MessageSplitterOutboundRouterTypeLabelEditPart.VISUAL_ID:
					if (MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ChunkingRouterTypeLabelEditPart.VISUAL_ID:
					if (ChunkingRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StaticRecipientListRouterTypeLabelEditPart.VISUAL_ID:
					if (StaticRecipientListRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CustomOutboundRouterTypeLabelEditPart.VISUAL_ID:
				case CustomOutboundRouterTypeClassEditPart.VISUAL_ID:
					if (CustomOutboundRouterTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !CoreVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return SedaServiceTypeViewFactory.class;
		case SedaServiceTypeNameEditPart.VISUAL_ID:
			return SedaServiceTypeNameViewFactory.class;
		case PojoComponentTypeEditPart.VISUAL_ID:
			return PojoComponentTypeViewFactory.class;
		case PojoComponentTypeLabelEditPart.VISUAL_ID:
			return PojoComponentTypeLabelViewFactory.class;
		case PojoComponentTypeClassEditPart.VISUAL_ID:
			return PojoComponentTypeClassViewFactory.class;
		case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
			return NoArgsCallWrapperTypeViewFactory.class;
		case NoArgsCallWrapperTypeLabelEditPart.VISUAL_ID:
			return NoArgsCallWrapperTypeLabelViewFactory.class;
		case NoArgsCallWrapperTypeClassEditPart.VISUAL_ID:
			return NoArgsCallWrapperTypeClassViewFactory.class;
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return DefaultComponentTypeViewFactory.class;
		case DefaultComponentTypeLabelEditPart.VISUAL_ID:
			return DefaultComponentTypeLabelViewFactory.class;
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return BridgeComponentTypeViewFactory.class;
		case BridgeComponentTypeLabelEditPart.VISUAL_ID:
			return BridgeComponentTypeLabelViewFactory.class;
		case EchoComponentTypeEditPart.VISUAL_ID:
			return EchoComponentTypeViewFactory.class;
		case EchoComponentTypeLabelEditPart.VISUAL_ID:
			return EchoComponentTypeLabelViewFactory.class;
		case LogComponentTypeEditPart.VISUAL_ID:
			return LogComponentTypeViewFactory.class;
		case LogComponentTypeLabelEditPart.VISUAL_ID:
			return LogComponentTypeLabelViewFactory.class;
		case NullComponentTypeEditPart.VISUAL_ID:
			return NullComponentTypeViewFactory.class;
		case NullComponentTypeLabelEditPart.VISUAL_ID:
			return NullComponentTypeLabelViewFactory.class;
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return PassThroughComponentTypeViewFactory.class;
		case PassThroughComponentTypeLabelEditPart.VISUAL_ID:
			return PassThroughComponentTypeLabelViewFactory.class;
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return DefaultServiceExceptionStrategyTypeViewFactory.class;
		case DefaultServiceExceptionStrategyTypeLabelEditPart.VISUAL_ID:
			return DefaultServiceExceptionStrategyTypeLabelViewFactory.class;
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return OutboundEndpointTypeViewFactory.class;
		case OutboundEndpointTypeNameEditPart.VISUAL_ID:
			return OutboundEndpointTypeNameViewFactory.class;
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return DefaultConnectorExceptionStrategyTypeViewFactory.class;
		case DefaultConnectorExceptionStrategyTypeLabelEditPart.VISUAL_ID:
			return DefaultConnectorExceptionStrategyTypeLabelViewFactory.class;
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return CustomExceptionStrategyTypeViewFactory.class;
		case CustomExceptionStrategyTypeLabelEditPart.VISUAL_ID:
			return CustomExceptionStrategyTypeLabelViewFactory.class;
		case CustomExceptionStrategyTypeClassEditPart.VISUAL_ID:
			return CustomExceptionStrategyTypeClassViewFactory.class;
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return InboundRouterCollectionTypeViewFactory.class;
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return InboundEndpointServiceItemTypeViewFactory.class;
		case InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
			return InboundEndpointServiceItemTypeLabelViewFactory.class;
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return ForwardingRouterTypeViewFactory.class;
		case ForwardingRouterTypeLabelEditPart.VISUAL_ID:
			return ForwardingRouterTypeLabelViewFactory.class;
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return IdempotentSecureRecieverRouterTypeViewFactory.class;
		case IdempotentSecureRecieverRouterTypeLabelEditPart.VISUAL_ID:
			return IdempotentSecureRecieverRouterTypeLabelViewFactory.class;
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return PassThroughInboundRouterTypeViewFactory.class;
		case PassThroughInboundRouterTypeLabelEditPart.VISUAL_ID:
			return PassThroughInboundRouterTypeLabelViewFactory.class;
		case IdempotentReceiverTypeEditPart.VISUAL_ID:
			return IdempotentReceiverTypeViewFactory.class;
		case IdempotentReceiverRouterTypeLabelEditPart.VISUAL_ID:
			return IdempotentReceiverRouterTypeLabelViewFactory.class;
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return WireTapRouterTypeViewFactory.class;
		case WireTapRouterTypeLabelEditPart.VISUAL_ID:
			return WireTapRouterTypeLabelViewFactory.class;
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return SelectiveConsumerRouterTypeViewFactory.class;
		case SelectiveConsumerRouterTypeLabelEditPart.VISUAL_ID:
			return SelectiveConsumerRouterTypeLabelViewFactory.class;
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return ChunkingInboundRouterTypeViewFactory.class;
		case ChunkingInboundRouterTypeLabelEditPart.VISUAL_ID:
			return ChunkingInboundRouterTypeLabelViewFactory.class;
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return CorrelationResequencerRouterTypeViewFactory.class;
		case CorrelationResequencerRouterTypeLabelEditPart.VISUAL_ID:
			return CorrelationResequencerRouterTypeLabelViewFactory.class;
		case CorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return CorrelationAggregatorRouterTypeViewFactory.class;
		case CorrelationAggregatorRouterTypeLabelEditPart.VISUAL_ID:
			return CorrelationAggregatorRouterTypeLabelViewFactory.class;
		case CorrelationAggregatorRouterTypeClassEditPart.VISUAL_ID:
			return CorrelationAggregatorRouterTypeClassViewFactory.class;
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return CustomInboundRouterTypeViewFactory.class;
		case CustomInboundRouterTypeLabelEditPart.VISUAL_ID:
			return CustomInboundRouterTypeLabelViewFactory.class;
		case CustomInboundRouterTypeClassEditPart.VISUAL_ID:
			return CustomInboundRouterTypeClassViewFactory.class;
		case AsyncReplyRouterCollectionTypeEditPart.VISUAL_ID:
			return AsyncReplyRouterCollectionTypeViewFactory.class;
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return AsyncReplyInboundEndpointServiceItemTypeViewFactory.class;
		case AsyncReplyInboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
			return AsyncReplyInboundEndpointServiceItemTypeLabelViewFactory.class;
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return AsyncReplyRouterTypeViewFactory.class;
		case AsyncReplyRouterTypeLabelEditPart.VISUAL_ID:
			return AsyncReplyRouterTypeLabelViewFactory.class;
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return CustomAsyncReplyRouterTypeViewFactory.class;
		case CustomAsyncReplyRouterTypeLabelEditPart.VISUAL_ID:
			return CustomAsyncReplyRouterTypeLabelViewFactory.class;
		case CustomAsyncReplyRouterTypeClassEditPart.VISUAL_ID:
			return CustomAsyncReplyRouterTypeClassViewFactory.class;
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return OutboundRouterCollectionTypeViewFactory.class;
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return PassThroughOutboundRouterTypeViewFactory.class;
		case PassThroughOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return PassThroughOutboundRouterTypeLabelViewFactory.class;
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return FilteringOutboundRouterTypeViewFactory.class;
		case FilteringOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return FilteringOutboundRouterTypeLabelViewFactory.class;
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return ChainingOutboundRouterTypeViewFactory.class;
		case ChainingOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return ChainingOutboundRouterTypeLabelViewFactory.class;
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return ExceptionOutboundRouterTypeViewFactory.class;
		case ExceptionOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return ExceptionOutboundRouterTypeLabelViewFactory.class;
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return MulticastingOutboundRouterTypeViewFactory.class;
		case MulticastingOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return MulticastingOutboundRouterTypeLabelViewFactory.class;
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return TemplateEndpointOutboundRouterTypeViewFactory.class;
		case TemplateEndpointOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return TemplateEndpointOutboundRouterTypeLabelViewFactory.class;
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return EndpointSelectorRouterTypeViewFactory.class;
		case EndpointSelectorRouterTypeLabelEditPart.VISUAL_ID:
			return EndpointSelectorRouterTypeLabelViewFactory.class;
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return MessageSplitterOutboundRouterTypeViewFactory.class;
		case MessageSplitterOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return MessageSplitterOutboundRouterTypeLabelViewFactory.class;
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return ChunkingRouterTypeViewFactory.class;
		case ChunkingRouterTypeLabelEditPart.VISUAL_ID:
			return ChunkingRouterTypeLabelViewFactory.class;
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return StaticRecipientListRouterTypeViewFactory.class;
		case StaticRecipientListRouterTypeLabelEditPart.VISUAL_ID:
			return StaticRecipientListRouterTypeLabelViewFactory.class;
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return CustomOutboundRouterTypeViewFactory.class;
		case CustomOutboundRouterTypeLabelEditPart.VISUAL_ID:
			return CustomOutboundRouterTypeLabelViewFactory.class;
		case CustomOutboundRouterTypeClassEditPart.VISUAL_ID:
			return CustomOutboundRouterTypeClassViewFactory.class;
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			return SedaServiceTypeCOMPONENTViewFactory.class;
		case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
			return SedaServiceTypeEXCEPTIONViewFactory.class;
		case SedaServiceTypeINBOUNDEditPart.VISUAL_ID:
			return SedaServiceTypeINBOUNDViewFactory.class;
		case SedaServiceTypeASYNCREPLYEditPart.VISUAL_ID:
			return SedaServiceTypeASYNCREPLYViewFactory.class;
		case SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID:
			return SedaServiceTypeOUTBOUNDViewFactory.class;
		case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return DefaultServiceExceptionStrategyTypeENDPOINTSViewFactory.class;
		case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return DefaultConnectorExceptionStrategyTypeENDPOINTSViewFactory.class;
		case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return CustomExceptionStrategyTypeENDPOINTSViewFactory.class;
		case InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
			return InboundRouterCollectionTypeINBOUNDENDPOINTSViewFactory.class;
		case InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			return InboundRouterCollectionTypeINBOUNDROUTERSViewFactory.class;
		case AsyncReplyRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
			return AsyncReplyRouterCollectionTypeINBOUNDENDPOINTSViewFactory.class;
		case AsyncReplyRouterCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
			return AsyncReplyRouterCollectionTypeASYNCREPLYROUTERSViewFactory.class;
		case OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
			return OutboundRouterCollectionTypeOUTBOUNDROUTERSViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!CoreElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = CoreVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != CoreVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
