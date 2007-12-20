package org.mule.ide.config.editor.services.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.AbstractInboundRouterType;
import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.CustomExceptionStrategyType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.ExceptionStrategyType;
import org.mule.ide.config.core.InboundRouterCollectionType;
import org.mule.ide.config.core.OutboundRouterCollectionType;
import org.mule.ide.config.core.ResponseRouterCollectionType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
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
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001SemanticChildren(view);
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			return getSedaServiceTypeCOMPONENT_5001SemanticChildren(view);
		case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
			return getSedaServiceTypeEXCEPTION_5002SemanticChildren(view);
		case InboundRouterCollectionTypeINBOUNDEditPart.VISUAL_ID:
			return getInboundRouterCollectionTypeINBOUND_5003SemanticChildren(view);
		case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getExceptionStrategyTypeENDPOINTS_5006SemanticChildren(view);
		case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getExceptionStrategyTypeENDPOINTS_5007SemanticChildren(view);
		case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			return getCustomExceptionStrategyTypeENDPOINTS_5008SemanticChildren(view);
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
			InboundRouterCollectionType childElement = modelElement
					.getInboundRouter();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InboundRouterCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		{
			OutboundRouterCollectionType childElement = modelElement
					.getOutboundRouter();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundRouterCollectionTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
		}
		{
			ResponseRouterCollectionType childElement = modelElement
					.getResponseRouter();
			int visualID = CoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResponseRouterCollectionTypeEditPart.VISUAL_ID) {
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
			if (visualID == PojoComponentTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
			}
			if (visualID == NoArgsCallWrapperTypeEditPart.VISUAL_ID) {
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
	public static List getInboundRouterCollectionTypeINBOUND_5003SemanticChildren(
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
			if (visualID == WireTapRouterTypeEditPart.VISUAL_ID) {
				result.add(new CoreNodeDescriptor(childElement, visualID));
				continue;
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
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getInboundRouterCollectionType_2001ContainedLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2002ContainedLinks(view);
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2003ContainedLinks(view);
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return getResponseRouterCollectionType_2004ContainedLinks(view);
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2005ContainedLinks(view);
		case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
			return getNoArgsCallWrapperType_2006ContainedLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2007ContainedLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2008ContainedLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2009ContainedLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2010ContainedLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2011ContainedLinks(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2012ContainedLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2013ContainedLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2014ContainedLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2015ContainedLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2016ContainedLinks(view);
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
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getInboundRouterCollectionType_2001IncomingLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2002IncomingLinks(view);
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2003IncomingLinks(view);
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return getResponseRouterCollectionType_2004IncomingLinks(view);
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2005IncomingLinks(view);
		case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
			return getNoArgsCallWrapperType_2006IncomingLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2007IncomingLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2008IncomingLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2009IncomingLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2010IncomingLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2011IncomingLinks(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2012IncomingLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2013IncomingLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2014IncomingLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2015IncomingLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2016IncomingLinks(view);
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
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getInboundRouterCollectionType_2001OutgoingLinks(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2002OutgoingLinks(view);
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2003OutgoingLinks(view);
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return getResponseRouterCollectionType_2004OutgoingLinks(view);
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2005OutgoingLinks(view);
		case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
			return getNoArgsCallWrapperType_2006OutgoingLinks(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2007OutgoingLinks(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2008OutgoingLinks(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2009OutgoingLinks(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2010OutgoingLinks(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2011OutgoingLinks(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2012OutgoingLinks(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2013OutgoingLinks(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2014OutgoingLinks(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2015OutgoingLinks(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2016OutgoingLinks(view);
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
	public static List getInboundRouterCollectionType_2001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterCollectionType_2003ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResponseRouterCollectionType_2004ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPojoComponentType_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNoArgsCallWrapperType_2006ContainedLinks(View view) {
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
	public static List getDefaultComponentType_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2016ContainedLinks(
			View view) {
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
	public static List getInboundRouterCollectionType_2001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterCollectionType_2003IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResponseRouterCollectionType_2004IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPojoComponentType_2005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNoArgsCallWrapperType_2006IncomingLinks(View view) {
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
	public static List getDefaultComponentType_2009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2016IncomingLinks(
			View view) {
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
	public static List getInboundRouterCollectionType_2001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getWireTapRouterType_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundRouterCollectionType_2003OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResponseRouterCollectionType_2004OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPojoComponentType_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNoArgsCallWrapperType_2006OutgoingLinks(View view) {
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
	public static List getDefaultComponentType_2009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDefaultComponentType_2012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundEndpointType_2014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionStrategyType_2015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomExceptionStrategyType_2016OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

}
