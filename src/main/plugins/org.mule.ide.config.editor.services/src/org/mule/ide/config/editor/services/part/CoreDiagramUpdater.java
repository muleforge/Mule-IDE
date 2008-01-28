package org.mule.ide.config.editor.services.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AbstractAsyncReplyRouterType;
import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractInboundRouterType;
import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.AbstractOutboundRouterType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.AsyncReplyRouterCollectionType;
import org.mule.ide.config.core.ChunkingRouterType;
import org.mule.ide.config.core.CustomExceptionStrategyType;
import org.mule.ide.config.core.CustomOutboundRouterType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.EndpointSelectorRouterType;
import org.mule.ide.config.core.ExceptionStrategyType;
import org.mule.ide.config.core.FilteringOutboundRouterType;
import org.mule.ide.config.core.InboundRouterCollectionType;
import org.mule.ide.config.core.MessageSplitterOutboundRouterType;
import org.mule.ide.config.core.OutboundRouterCollectionType;
import org.mule.ide.config.core.OutboundRouterType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.core.StaticRecipientListRouterType;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterCollectionTypeASYNCREPLYROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterCollectionTypeINBOUNDENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeEditPart;
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
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeASYNCREPLYEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeOUTBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;

/**
 * @generated
 */
public class CoreDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			return getSedaServiceTypeCOMPONENT_5001SemanticChildren(view);
		case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
			return getSedaServiceTypeEXCEPTION_5002SemanticChildren(view);
		case SedaServiceTypeINBOUNDEditPart.VISUAL_ID:
			return getSedaServiceTypeINBOUND_5003SemanticChildren(view);
		case SedaServiceTypeASYNCREPLYEditPart.VISUAL_ID:
			return getSedaServiceTypeASYNCREPLY_5004SemanticChildren(view);
		case SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID:
			return getSedaServiceTypeOUTBOUND_5005SemanticChildren(view);
		case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getExceptionStrategyTypeENDPOINTS_5006SemanticChildren(view);
		case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getExceptionStrategyTypeENDPOINTS_5007SemanticChildren(view);
		case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getCustomExceptionStrategyTypeENDPOINTS_5008SemanticChildren(view);
		case InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
			return getInboundRouterCollectionTypeINBOUNDENDPOINTS_5009SemanticChildren(view);
		case InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			return getInboundRouterCollectionTypeINBOUNDROUTERS_5010SemanticChildren(view);
		case AsyncReplyRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
			return getAsyncReplyRouterCollectionTypeINBOUNDENDPOINTS_5011SemanticChildren(view);
		case AsyncReplyRouterCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
			return getAsyncReplyRouterCollectionTypeASYNCREPLYROUTERS_5012SemanticChildren(view);
		case OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
			return getOutboundRouterCollectionTypeOUTBOUNDROUTERS_5013SemanticChildren(view);
		case PassThroughOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getOutboundRouterTypeENDPOINTS_5014SemanticChildren(view);
		case FilteringOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5015SemanticChildren(view);
		case ChainingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5016SemanticChildren(view);
		case ExceptionOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5017SemanticChildren(view);
		case MulticastingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5018SemanticChildren(view);
		case TemplateEndpointOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getFilteringOutboundRouterTypeENDPOINTS_5019SemanticChildren(view);
		case EndpointSelectorRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getEndpointSelectorRouterTypeENDPOINTS_5020SemanticChildren(view);
		case MessageSplitterOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterTypeENDPOINTS_5021SemanticChildren(view);
		case ChunkingRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getChunkingRouterTypeENDPOINTS_5022SemanticChildren(view);
		case StaticRecipientListRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getStaticRecipientListRouterTypeENDPOINTS_5023SemanticChildren(view);
		case CustomOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID:
			return getCustomOutboundRouterTypeENDPOINTS_5024SemanticChildren(view);
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getDefaultModelType_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
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
			if (visualID == PojoComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == NoArgsCallComponentTypeEditPart.VISUAL_ID) {
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
			if (visualID == PassThroughComponentTypeEditPart.VISUAL_ID) {
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
	public static List getSedaServiceTypeINBOUND_5003SemanticChildren(View view) {
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
			InboundRouterCollectionType childElement = modelElement
					.getInboundRouter();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InboundRouterCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceTypeASYNCREPLY_5004SemanticChildren(
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
			AsyncReplyRouterCollectionType childElement = modelElement
					.getAsyncReplyRouter();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AsyncReplyRouterCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceTypeOUTBOUND_5005SemanticChildren(View view) {
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
			OutboundRouterCollectionType childElement = modelElement
					.getOutboundRouter();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyTypeENDPOINTS_5006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ExceptionStrategyType modelElement = (ExceptionStrategyType) containerView
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
	public static List getExceptionStrategyTypeENDPOINTS_5007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ExceptionStrategyType modelElement = (ExceptionStrategyType) containerView
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
	public static List getCustomExceptionStrategyTypeENDPOINTS_5008SemanticChildren(
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
	public static List getInboundRouterCollectionTypeINBOUNDENDPOINTS_5009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		InboundRouterCollectionType modelElement = (InboundRouterCollectionType) containerView
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInboundRouterCollectionTypeINBOUNDROUTERS_5010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		InboundRouterCollectionType modelElement = (InboundRouterCollectionType) containerView
				.getElement();
		List result = new LinkedList();
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
			if (visualID == IdempotentReceiverTypeEditPart.VISUAL_ID) {
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
			if (visualID == CorrelationAggregatorRouterTypeEditPart.VISUAL_ID) {
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
	public static List getAsyncReplyRouterCollectionTypeINBOUNDENDPOINTS_5011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AsyncReplyRouterCollectionType modelElement = (AsyncReplyRouterCollectionType) containerView
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterCollectionTypeASYNCREPLYROUTERS_5012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AsyncReplyRouterCollectionType modelElement = (AsyncReplyRouterCollectionType) containerView
				.getElement();
		List result = new LinkedList();
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
	public static List getOutboundRouterCollectionTypeOUTBOUNDROUTERS_5013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OutboundRouterCollectionType modelElement = (OutboundRouterCollectionType) containerView
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
	public static List getOutboundRouterTypeENDPOINTS_5014SemanticChildren(
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
	public static List getFilteringOutboundRouterTypeENDPOINTS_5015SemanticChildren(
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
	public static List getFilteringOutboundRouterTypeENDPOINTS_5016SemanticChildren(
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
	public static List getFilteringOutboundRouterTypeENDPOINTS_5017SemanticChildren(
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
	public static List getFilteringOutboundRouterTypeENDPOINTS_5018SemanticChildren(
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
	public static List getFilteringOutboundRouterTypeENDPOINTS_5019SemanticChildren(
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
	public static List getEndpointSelectorRouterTypeENDPOINTS_5020SemanticChildren(
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
	public static List getMessageSplitterOutboundRouterTypeENDPOINTS_5021SemanticChildren(
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
	public static List getChunkingRouterTypeENDPOINTS_5022SemanticChildren(
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
	public static List getStaticRecipientListRouterTypeENDPOINTS_5023SemanticChildren(
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
	public static List getCustomOutboundRouterTypeENDPOINTS_5024SemanticChildren(
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
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2001ContainedLinks(view);
		case NoArgsCallComponentTypeEditPart.VISUAL_ID:
			return getNoArgsCallComponentType_2002ContainedLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2003ContainedLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2004ContainedLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2005ContainedLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2006ContainedLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2007ContainedLinks(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2008ContainedLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2009ContainedLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2010ContainedLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2011ContainedLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2012ContainedLinks(view);
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getInboundRouterCollectionType_2013ContainedLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2014ContainedLinks(view);
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getForwardingRouterType_2015ContainedLinks(view);
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2016ContainedLinks(view);
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2017ContainedLinks(view);
		case IdempotentReceiverTypeEditPart.VISUAL_ID:
			return getIdempotentReceiverType_2018ContainedLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2019ContainedLinks(view);
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2020ContainedLinks(view);
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getCorrelationRouterType_2021ContainedLinks(view);
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getCorrelationRouterType_2022ContainedLinks(view);
		case CorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getCorrelationAggregatorRouterType_2023ContainedLinks(view);
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getCustomInboundRouterType_2024ContainedLinks(view);
		case AsyncReplyRouterCollectionTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterCollectionType_2025ContainedLinks(view);
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2026ContainedLinks(view);
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterType_2027ContainedLinks(view);
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterType_2028ContainedLinks(view);
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2029ContainedLinks(view);
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getOutboundRouterType_2030ContainedLinks(view);
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2031ContainedLinks(view);
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2032ContainedLinks(view);
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2033ContainedLinks(view);
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2034ContainedLinks(view);
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2035ContainedLinks(view);
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2036ContainedLinks(view);
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getEndpointSelectorRouterType_2037ContainedLinks(view);
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterType_2038ContainedLinks(view);
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getChunkingRouterType_2039ContainedLinks(view);
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getStaticRecipientListRouterType_2040ContainedLinks(view);
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getCustomOutboundRouterType_2041ContainedLinks(view);
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
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2001IncomingLinks(view);
		case NoArgsCallComponentTypeEditPart.VISUAL_ID:
			return getNoArgsCallComponentType_2002IncomingLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2003IncomingLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2004IncomingLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2005IncomingLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2006IncomingLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2007IncomingLinks(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2008IncomingLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2009IncomingLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2010IncomingLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2011IncomingLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2012IncomingLinks(view);
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getInboundRouterCollectionType_2013IncomingLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2014IncomingLinks(view);
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getForwardingRouterType_2015IncomingLinks(view);
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2016IncomingLinks(view);
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2017IncomingLinks(view);
		case IdempotentReceiverTypeEditPart.VISUAL_ID:
			return getIdempotentReceiverType_2018IncomingLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2019IncomingLinks(view);
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2020IncomingLinks(view);
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getCorrelationRouterType_2021IncomingLinks(view);
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getCorrelationRouterType_2022IncomingLinks(view);
		case CorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getCorrelationAggregatorRouterType_2023IncomingLinks(view);
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getCustomInboundRouterType_2024IncomingLinks(view);
		case AsyncReplyRouterCollectionTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterCollectionType_2025IncomingLinks(view);
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2026IncomingLinks(view);
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterType_2027IncomingLinks(view);
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterType_2028IncomingLinks(view);
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2029IncomingLinks(view);
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getOutboundRouterType_2030IncomingLinks(view);
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2031IncomingLinks(view);
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2032IncomingLinks(view);
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2033IncomingLinks(view);
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2034IncomingLinks(view);
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2035IncomingLinks(view);
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2036IncomingLinks(view);
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getEndpointSelectorRouterType_2037IncomingLinks(view);
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterType_2038IncomingLinks(view);
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getChunkingRouterType_2039IncomingLinks(view);
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getStaticRecipientListRouterType_2040IncomingLinks(view);
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getCustomOutboundRouterType_2041IncomingLinks(view);
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
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2001OutgoingLinks(view);
		case NoArgsCallComponentTypeEditPart.VISUAL_ID:
			return getNoArgsCallComponentType_2002OutgoingLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2003OutgoingLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2004OutgoingLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2005OutgoingLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2006OutgoingLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2007OutgoingLinks(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2008OutgoingLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2009OutgoingLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2010OutgoingLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2011OutgoingLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2012OutgoingLinks(view);
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getInboundRouterCollectionType_2013OutgoingLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2014OutgoingLinks(view);
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getForwardingRouterType_2015OutgoingLinks(view);
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2016OutgoingLinks(view);
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2017OutgoingLinks(view);
		case IdempotentReceiverTypeEditPart.VISUAL_ID:
			return getIdempotentReceiverType_2018OutgoingLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2019OutgoingLinks(view);
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2020OutgoingLinks(view);
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getCorrelationRouterType_2021OutgoingLinks(view);
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getCorrelationRouterType_2022OutgoingLinks(view);
		case CorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getCorrelationAggregatorRouterType_2023OutgoingLinks(view);
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getCustomInboundRouterType_2024OutgoingLinks(view);
		case AsyncReplyRouterCollectionTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterCollectionType_2025OutgoingLinks(view);
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2026OutgoingLinks(view);
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterType_2027OutgoingLinks(view);
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterType_2028OutgoingLinks(view);
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2029OutgoingLinks(view);
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getOutboundRouterType_2030OutgoingLinks(view);
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2031OutgoingLinks(view);
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2032OutgoingLinks(view);
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2033OutgoingLinks(view);
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2034OutgoingLinks(view);
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2035OutgoingLinks(view);
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2036OutgoingLinks(view);
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getEndpointSelectorRouterType_2037OutgoingLinks(view);
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterType_2038OutgoingLinks(view);
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getChunkingRouterType_2039OutgoingLinks(view);
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getStaticRecipientListRouterType_2040OutgoingLinks(view);
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getCustomOutboundRouterType_2041OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultModelType_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
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
	public static List getPojoComponentType_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNoArgsCallComponentType_2002ContainedLinks(View view) {
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
	public static List getDefaultComponentType_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2012ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundRouterCollectionType_2013ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForwardingRouterType_2015ContainedLinks(View view) {
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
	public static List getIdempotentReceiverType_2018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2020ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationRouterType_2021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationRouterType_2022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationAggregatorRouterType_2023ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomInboundRouterType_2024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterCollectionType_2025ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterType_2027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomAsyncReplyRouterType_2028ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterCollectionType_2029ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterType_2030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2031ContainedLinks(View view) {
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
	public static List getFilteringOutboundRouterType_2036ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointSelectorRouterType_2037ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageSplitterOutboundRouterType_2038ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChunkingRouterType_2039ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStaticRecipientListRouterType_2040ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomOutboundRouterType_2041ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceType_1001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPojoComponentType_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNoArgsCallComponentType_2002IncomingLinks(View view) {
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
	public static List getDefaultComponentType_2007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2012IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundRouterCollectionType_2013IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForwardingRouterType_2015IncomingLinks(View view) {
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
	public static List getIdempotentReceiverType_2018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2019IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2020IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationRouterType_2021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationRouterType_2022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationAggregatorRouterType_2023IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomInboundRouterType_2024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterCollectionType_2025IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2026IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterType_2027IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomAsyncReplyRouterType_2028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterCollectionType_2029IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterType_2030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2031IncomingLinks(View view) {
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
	public static List getFilteringOutboundRouterType_2036IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointSelectorRouterType_2037IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageSplitterOutboundRouterType_2038IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChunkingRouterType_2039IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStaticRecipientListRouterType_2040IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomOutboundRouterType_2041IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSedaServiceType_1001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPojoComponentType_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNoArgsCallComponentType_2002OutgoingLinks(View view) {
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
	public static List getDefaultComponentType_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2012OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundRouterCollectionType_2013OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForwardingRouterType_2015OutgoingLinks(View view) {
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
	public static List getIdempotentReceiverType_2018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSelectiveConsumerRouterType_2020OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationRouterType_2021OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationRouterType_2022OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCorrelationAggregatorRouterType_2023OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomInboundRouterType_2024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterCollectionType_2025OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAsyncReplyRouterType_2027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomAsyncReplyRouterType_2028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterCollectionType_2029OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterType_2030OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2031OutgoingLinks(View view) {
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
	public static List getFilteringOutboundRouterType_2036OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEndpointSelectorRouterType_2037OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessageSplitterOutboundRouterType_2038OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChunkingRouterType_2039OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStaticRecipientListRouterType_2040OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomOutboundRouterType_2041OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
