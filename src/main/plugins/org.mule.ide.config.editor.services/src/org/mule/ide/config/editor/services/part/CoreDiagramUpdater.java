package org.mule.ide.config.editor.services.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AbstractAsyncReplyRouterType;
import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractInboundRouterType;
import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.AbstractOutboundRouterType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.ChunkingRouterType;
import org.mule.ide.config.core.Connection;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomExceptionStrategyType;
import org.mule.ide.config.core.CustomOutboundRouterType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.EndpointExceptionStrategyType;
import org.mule.ide.config.core.EndpointSelectorRouterType;
import org.mule.ide.config.core.FilteringOutboundRouterType;
import org.mule.ide.config.core.InboundCollectionType;
import org.mule.ide.config.core.MessageSplitterOutboundRouterType;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.core.OutboundRouterType;
import org.mule.ide.config.core.SedaModelType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.core.StaticRecipientListRouterType;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ConnectionEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.JavaComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeOUTBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PooledJavaComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class CoreDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001SemanticChildren(view);
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			return getSedaServiceTypeCOMPONENT_5001SemanticChildren(view);
		case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
			return getSedaServiceTypeEXCEPTION_5002SemanticChildren(view);
		case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyTypeENDPOINTS_5003SemanticChildren(view);
		case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyTypeENDPOINTS_5004SemanticChildren(view);
		case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getCustomExceptionStrategyTypeENDPOINTS_5005SemanticChildren(view);
		case InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			return getInboundCollectionTypeINBOUNDROUTERS_5006SemanticChildren(view);
		case AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
			return getAsyncReplyCollectionTypeASYNCREPLYROUTERS_5007SemanticChildren(view);
		case OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
			return getOutboundCollectionTypeOUTBOUNDROUTERS_5008SemanticChildren(view);
		case PassThroughOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getOutboundRouterTypeENDPOINTS_5009SemanticChildren(view);
		case FilteringOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5010SemanticChildren(view);
		case ChainingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5011SemanticChildren(view);
		case ExceptionOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5012SemanticChildren(view);
		case MulticastingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5013SemanticChildren(view);
		case TemplateEndpointOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5014SemanticChildren(view);
		case EndpointSelectorRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getEndpointSelectorRouterTypeENDPOINTS_5015SemanticChildren(view);
		case MessageSplitterOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterTypeENDPOINTS_5016SemanticChildren(view);
		case ChunkingRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getChunkingRouterTypeENDPOINTS_5017SemanticChildren(view);
		case StaticRecipientListRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getStaticRecipientListRouterTypeENDPOINTS_5018SemanticChildren(view);
		case CustomOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getCustomOutboundRouterTypeENDPOINTS_5019SemanticChildren(view);
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getDefaultModelType_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceType_1001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SedaServiceType modelElement = (SedaServiceType) view.getElement();
		List result = new LinkedList();
		{
			InboundCollectionType childElement = modelElement.getInbound();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InboundCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		{
			AsyncReplyCollectionType childElement = modelElement
					.getAsyncReply();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AsyncReplyCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		{
			OutboundCollectionType childElement = modelElement.getOutbound();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceTypeCOMPONENT_5001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SedaServiceType modelElement = (SedaServiceType) containerView
				.getElement();
		List result = new LinkedList();
		{
			AbstractComponentType childElement = modelElement
					.getAbstractComponent();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JavaComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == DefaultComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == BridgeComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == EchoComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == LogComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == NullComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == PooledJavaComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceTypeEXCEPTION_5002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SedaServiceType modelElement = (SedaServiceType) containerView
				.getElement();
		List result = new LinkedList();
		{
			AbstractExceptionStrategyType childElement = modelElement
					.getAbstractExceptionStrategy();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == CustomExceptionStrategyTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyTypeENDPOINTS_5003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EndpointExceptionStrategyType modelElement = (EndpointExceptionStrategyType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyTypeENDPOINTS_5004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EndpointExceptionStrategyType modelElement = (EndpointExceptionStrategyType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyTypeENDPOINTS_5005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CustomExceptionStrategyType modelElement = (CustomExceptionStrategyType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInboundCollectionTypeINBOUNDROUTERS_5006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		InboundCollectionType modelElement = (InboundCollectionType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractInboundEndpoint().iterator(); it
				.hasNext();) {
			AbstractInboundEndpointType childElement = (AbstractInboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InboundEndpointServiceItemTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getAbstractInboundRouter().iterator(); it
				.hasNext();) {
			AbstractInboundRouterType childElement = (AbstractInboundRouterType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ForwardingRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PassThroughInboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IdempotentReceiverRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WireTapRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectiveConsumerRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChunkingInboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CorrelationResequencerRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomInboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyCollectionTypeASYNCREPLYROUTERS_5007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AsyncReplyCollectionType modelElement = (AsyncReplyCollectionType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractInboundEndpoint().iterator(); it
				.hasNext();) {
			AbstractInboundEndpointType childElement = (AbstractInboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getAbstractAsyncReplyRouter()
				.iterator(); it.hasNext();) {
			AbstractAsyncReplyRouterType childElement = (AbstractAsyncReplyRouterType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AsyncReplyRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomAsyncReplyRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutboundCollectionTypeOUTBOUNDROUTERS_5008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OutboundCollectionType modelElement = (OutboundCollectionType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundRouter().iterator(); it
				.hasNext();) {
			AbstractOutboundRouterType childElement = (AbstractOutboundRouterType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PassThroughOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilteringOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChainingOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExceptionOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MulticastingOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndpointSelectorRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChunkingRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StaticRecipientListRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomOutboundRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterTypeENDPOINTS_5009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OutboundRouterType modelElement = (OutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterTypeENDPOINTS_5010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilteringOutboundRouterType modelElement = (FilteringOutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterTypeENDPOINTS_5011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilteringOutboundRouterType modelElement = (FilteringOutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterTypeENDPOINTS_5012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilteringOutboundRouterType modelElement = (FilteringOutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterTypeENDPOINTS_5013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilteringOutboundRouterType modelElement = (FilteringOutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterTypeENDPOINTS_5014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilteringOutboundRouterType modelElement = (FilteringOutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEndpointSelectorRouterTypeENDPOINTS_5015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EndpointSelectorRouterType modelElement = (EndpointSelectorRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessageSplitterOutboundRouterTypeENDPOINTS_5016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MessageSplitterOutboundRouterType modelElement = (MessageSplitterOutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChunkingRouterTypeENDPOINTS_5017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ChunkingRouterType modelElement = (ChunkingRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStaticRecipientListRouterTypeENDPOINTS_5018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		StaticRecipientListRouterType modelElement = (StaticRecipientListRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCustomOutboundRouterTypeENDPOINTS_5019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CustomOutboundRouterType modelElement = (CustomOutboundRouterType) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractOutboundEndpoint()
				.iterator(); it.hasNext();) {
			AbstractOutboundEndpointType childElement = (AbstractOutboundEndpointType) it
					.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDefaultModelType_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DefaultModelType modelElement = (DefaultModelType) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAbstractService().iterator(); it
				.hasNext();) {
			AbstractServiceType childElement = (AbstractServiceType) it.next();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SedaServiceTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getDefaultModelType_79ContainedLinks(view);
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001ContainedLinks(view);
		case JavaComponentTypeEditPart.VISUAL_ID:
			return getDefaultJavaComponentType_2001ContainedLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2002ContainedLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2003ContainedLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2004ContainedLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2005ContainedLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2006ContainedLinks(view);
		case PooledJavaComponentTypeEditPart.VISUAL_ID:
			return getPooledJavaComponentType_2007ContainedLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyType_2008ContainedLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2009ContainedLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyType_2010ContainedLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2011ContainedLinks(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2012ContainedLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2013ContainedLinks(view);
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2014ContainedLinks(view);
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2015ContainedLinks(view);
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2016ContainedLinks(view);
		case IdempotentReceiverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2017ContainedLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2018ContainedLinks(view);
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2019ContainedLinks(view);
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getMessageChunkingAggregatorRouterType_2020ContainedLinks(view);
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2021ContainedLinks(view);
		case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getCustomCorrelationAggregatorRouterType_2022ContainedLinks(view);
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getCustomInboundRouterType_2023ContainedLinks(view);
		case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
			return getAsyncReplyCollectionType_2024ContainedLinks(view);
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2025ContainedLinks(view);
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterType_2026ContainedLinks(view);
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterType_2027ContainedLinks(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2028ContainedLinks(view);
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getOutboundRouterType_2029ContainedLinks(view);
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2030ContainedLinks(view);
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2031ContainedLinks(view);
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2032ContainedLinks(view);
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2033ContainedLinks(view);
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2034ContainedLinks(view);
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2035ContainedLinks(view);
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getEndpointSelectorRouterType_2036ContainedLinks(view);
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterType_2037ContainedLinks(view);
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getChunkingRouterType_2038ContainedLinks(view);
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getStaticRecipientListRouterType_2039ContainedLinks(view);
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getCustomOutboundRouterType_2040ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_3001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001IncomingLinks(view);
		case JavaComponentTypeEditPart.VISUAL_ID:
			return getDefaultJavaComponentType_2001IncomingLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2002IncomingLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2003IncomingLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2004IncomingLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2005IncomingLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2006IncomingLinks(view);
		case PooledJavaComponentTypeEditPart.VISUAL_ID:
			return getPooledJavaComponentType_2007IncomingLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyType_2008IncomingLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2009IncomingLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyType_2010IncomingLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2011IncomingLinks(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2012IncomingLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2013IncomingLinks(view);
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2014IncomingLinks(view);
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2015IncomingLinks(view);
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2016IncomingLinks(view);
		case IdempotentReceiverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2017IncomingLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2018IncomingLinks(view);
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2019IncomingLinks(view);
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getMessageChunkingAggregatorRouterType_2020IncomingLinks(view);
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2021IncomingLinks(view);
		case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getCustomCorrelationAggregatorRouterType_2022IncomingLinks(view);
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getCustomInboundRouterType_2023IncomingLinks(view);
		case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
			return getAsyncReplyCollectionType_2024IncomingLinks(view);
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2025IncomingLinks(view);
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterType_2026IncomingLinks(view);
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterType_2027IncomingLinks(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2028IncomingLinks(view);
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getOutboundRouterType_2029IncomingLinks(view);
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2030IncomingLinks(view);
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2031IncomingLinks(view);
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2032IncomingLinks(view);
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2033IncomingLinks(view);
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2034IncomingLinks(view);
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2035IncomingLinks(view);
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getEndpointSelectorRouterType_2036IncomingLinks(view);
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterType_2037IncomingLinks(view);
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getChunkingRouterType_2038IncomingLinks(view);
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getStaticRecipientListRouterType_2039IncomingLinks(view);
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getCustomOutboundRouterType_2040IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_3001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001OutgoingLinks(view);
		case JavaComponentTypeEditPart.VISUAL_ID:
			return getDefaultJavaComponentType_2001OutgoingLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2002OutgoingLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2003OutgoingLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2004OutgoingLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2005OutgoingLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2006OutgoingLinks(view);
		case PooledJavaComponentTypeEditPart.VISUAL_ID:
			return getPooledJavaComponentType_2007OutgoingLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyType_2008OutgoingLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2009OutgoingLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getEndpointExceptionStrategyType_2010OutgoingLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2011OutgoingLinks(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2012OutgoingLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2013OutgoingLinks(view);
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2014OutgoingLinks(view);
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2015OutgoingLinks(view);
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2016OutgoingLinks(view);
		case IdempotentReceiverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2017OutgoingLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2018OutgoingLinks(view);
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2019OutgoingLinks(view);
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getMessageChunkingAggregatorRouterType_2020OutgoingLinks(view);
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2021OutgoingLinks(view);
		case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getCustomCorrelationAggregatorRouterType_2022OutgoingLinks(view);
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getCustomInboundRouterType_2023OutgoingLinks(view);
		case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
			return getAsyncReplyCollectionType_2024OutgoingLinks(view);
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2025OutgoingLinks(view);
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterType_2026OutgoingLinks(view);
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterType_2027OutgoingLinks(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2028OutgoingLinks(view);
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getOutboundRouterType_2029OutgoingLinks(view);
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2030OutgoingLinks(view);
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2031OutgoingLinks(view);
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2032OutgoingLinks(view);
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2033OutgoingLinks(view);
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2034OutgoingLinks(view);
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2035OutgoingLinks(view);
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getEndpointSelectorRouterType_2036OutgoingLinks(view);
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterType_2037OutgoingLinks(view);
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getChunkingRouterType_2038OutgoingLinks(view);
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getStaticRecipientListRouterType_2039OutgoingLinks(view);
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getCustomOutboundRouterType_2040OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_3001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultModelType_79ContainedLinks(View view) {
		DefaultModelType modelElement = (DefaultModelType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Connection_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceType_1001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultJavaComponentType_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPooledJavaComponentType_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyType_2008ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyType_2010ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2011ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundCollectionType_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2014ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2019ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageChunkingAggregatorRouterType_2020ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2021ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomCorrelationAggregatorRouterType_2022ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomInboundRouterType_2023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyCollectionType_2024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2025ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterType_2026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomAsyncReplyRouterType_2027ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundCollectionType_2028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterType_2029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2031ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2032ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2033ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2034ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2035ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointSelectorRouterType_2036ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageSplitterOutboundRouterType_2037ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChunkingRouterType_2038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStaticRecipientListRouterType_2039ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomOutboundRouterType_2040ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConnection_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceType_1001IncomingLinks(View view) {
		SedaServiceType modelElement = (SedaServiceType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_3001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDefaultJavaComponentType_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPooledJavaComponentType_2007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyType_2008IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyType_2010IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2011IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundCollectionType_2012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2014IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2019IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageChunkingAggregatorRouterType_2020IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2021IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomCorrelationAggregatorRouterType_2022IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomInboundRouterType_2023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyCollectionType_2024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2025IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterType_2026IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomAsyncReplyRouterType_2027IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundCollectionType_2028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterType_2029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2031IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2032IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2033IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2034IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2035IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointSelectorRouterType_2036IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageSplitterOutboundRouterType_2037IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChunkingRouterType_2038IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStaticRecipientListRouterType_2039IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomOutboundRouterType_2040IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConnection_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceType_1001OutgoingLinks(View view) {
		SedaServiceType modelElement = (SedaServiceType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Connection_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDefaultJavaComponentType_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPooledJavaComponentType_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyType_2008OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointExceptionStrategyType_2010OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2011OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundCollectionType_2012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2014OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteredInboundRouterType_2017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2019OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageChunkingAggregatorRouterType_2020OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2021OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomCorrelationAggregatorRouterType_2022OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomInboundRouterType_2023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyCollectionType_2024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2025OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterType_2026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomAsyncReplyRouterType_2027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundCollectionType_2028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterType_2029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2030OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2031OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2032OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2033OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2034OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilteringOutboundRouterType_2035OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointSelectorRouterType_2036OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageSplitterOutboundRouterType_2037OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChunkingRouterType_2038OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStaticRecipientListRouterType_2039OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomOutboundRouterType_2040OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConnection_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Connection_3001(
			SedaModelType container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getConnections().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != CoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SedaServiceType dst = link.getTarget();
			SedaServiceType src = link.getSource();
			result.add(new CoreLinkDescriptor(src, dst, link,
					CoreElementTypes.Connection_3001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Connection_3001(
			SedaServiceType target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != CorePackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Connection) {
				continue;
			}
			Connection link = (Connection) setting.getEObject();
			if (ConnectionEditPart.VISUAL_ID != CoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SedaServiceType src = link.getSource();
			result.add(new CoreLinkDescriptor(src, target, link,
					CoreElementTypes.Connection_3001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Connection_3001(
			SedaServiceType source) {
		SedaModelType container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SedaModelType) {
				container = (SedaModelType) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getConnections().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != CoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SedaServiceType dst = link.getTarget();
			SedaServiceType src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CoreLinkDescriptor(src, dst, link,
					CoreElementTypes.Connection_3001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

}
