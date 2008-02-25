package org.mule.ide.config.vm.editor.services.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.InboundCollectionType;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.vm.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeEditPart;

/**
 * @generated
 */
public class VMDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (VMVisualIDRegistry.getVisualID(view)) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001SemanticChildren(view);
		case InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			return getInboundCollectionTypeINBOUNDROUTERS_5003SemanticChildren(view);
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
			int visualID = VMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InboundCollectionTypeEditPart.VISUAL_ID) {
				result.add(new VMNodeDescriptor(childElement, visualID));
			}
		}
		{
			OutboundCollectionType childElement = modelElement.getOutbound();
			int visualID = VMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutboundCollectionTypeEditPart.VISUAL_ID) {
				result.add(new VMNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInboundCollectionTypeINBOUNDROUTERS_5003SemanticChildren(
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
			int visualID = VMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InboundEndpointServiceItemTypeEditPart.VISUAL_ID) {
				result.add(new VMNodeDescriptor(childElement, visualID));
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
			int visualID = VMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SedaServiceTypeEditPart.VISUAL_ID) {
				result.add(new VMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (VMVisualIDRegistry.getVisualID(view)) {
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getDefaultModelType_79ContainedLinks(view);
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001ContainedLinks(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2001ContainedLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2002ContainedLinks(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (VMVisualIDRegistry.getVisualID(view)) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001IncomingLinks(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2001IncomingLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2002IncomingLinks(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (VMVisualIDRegistry.getVisualID(view)) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001OutgoingLinks(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2001OutgoingLinks(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2002OutgoingLinks(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2003OutgoingLinks(view);
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
	public static List getInboundCollectionType_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundCollectionType_2003ContainedLinks(View view) {
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
	public static List getInboundCollectionType_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundCollectionType_2003IncomingLinks(View view) {
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
	public static List getInboundCollectionType_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInboundEndpointType_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutboundCollectionType_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
