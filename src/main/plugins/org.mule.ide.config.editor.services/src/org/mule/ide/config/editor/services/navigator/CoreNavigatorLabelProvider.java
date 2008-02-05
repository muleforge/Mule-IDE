package org.mule.ide.config.editor.services.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.DefaultServiceType;
import org.mule.ide.config.core.InboundCollectionType;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.core.PojoComponentType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ConnectionEditPart;
import org.mule.ide.config.editor.services.edit.parts.ConnectionEndpointEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
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
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.editor.services.part.ServicesEditorPlugin;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;
import org.mule.ide.config.editor.services.providers.CoreParserProvider;

/**
 * @generated
 */
public class CoreNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ServicesEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ServicesEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CoreNavigatorItem
				&& !isOwnView(((CoreNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CoreNavigatorGroup) {
			CoreNavigatorGroup group = (CoreNavigatorGroup) element;
			return ServicesEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof CoreNavigatorItem) {
			CoreNavigatorItem navigatorItem = (CoreNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.mulesource.org/schema/mule/core/2.0?DefaultModelType", CoreElementTypes.DefaultModelType_79); //$NON-NLS-1$
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.mulesource.org/schema/mule/core/2.0?SedaServiceType", CoreElementTypes.SedaServiceType_1001); //$NON-NLS-1$
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?PojoComponentType", CoreElementTypes.PojoComponentType_2001); //$NON-NLS-1$
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2002); //$NON-NLS-1$
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2003); //$NON-NLS-1$
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2004); //$NON-NLS-1$
		case LogComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2005); //$NON-NLS-1$
		case NullComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2006); //$NON-NLS-1$
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2007); //$NON-NLS-1$
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ExceptionStrategyType", CoreElementTypes.ExceptionStrategyType_2008); //$NON-NLS-1$
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundEndpointType", CoreElementTypes.OutboundEndpointType_2009); //$NON-NLS-1$
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ExceptionStrategyType", CoreElementTypes.ExceptionStrategyType_2010); //$NON-NLS-1$
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?CustomExceptionStrategyType", CoreElementTypes.CustomExceptionStrategyType_2011); //$NON-NLS-1$
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?InboundCollectionType", CoreElementTypes.InboundCollectionType_2012); //$NON-NLS-1$
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?InboundEndpointType", CoreElementTypes.InboundEndpointType_2013); //$NON-NLS-1$
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ForwardingRouterType", CoreElementTypes.ForwardingRouterType_2014); //$NON-NLS-1$
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?FilteredInboundRouterType", CoreElementTypes.FilteredInboundRouterType_2015); //$NON-NLS-1$
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?FilteredInboundRouterType", CoreElementTypes.FilteredInboundRouterType_2016); //$NON-NLS-1$
		case IdempotentReceiverRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?IdempotentReceiverRouterType", CoreElementTypes.IdempotentReceiverRouterType_2017); //$NON-NLS-1$
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?WireTapRouterType", CoreElementTypes.WireTapRouterType_2018); //$NON-NLS-1$
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?SelectiveConsumerRouterType", CoreElementTypes.SelectiveConsumerRouterType_2019); //$NON-NLS-1$
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?MessageChunkingAggregatorRouterType", CoreElementTypes.MessageChunkingAggregatorRouterType_2020); //$NON-NLS-1$
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?SelectiveConsumerRouterType", CoreElementTypes.SelectiveConsumerRouterType_2021); //$NON-NLS-1$
		case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?CustomCorrelationAggregatorRouterType", CoreElementTypes.CustomCorrelationAggregatorRouterType_2022); //$NON-NLS-1$
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?CustomInboundRouterType", CoreElementTypes.CustomInboundRouterType_2023); //$NON-NLS-1$
		case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?AsyncReplyCollectionType", CoreElementTypes.AsyncReplyCollectionType_2024); //$NON-NLS-1$
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?InboundEndpointType", CoreElementTypes.InboundEndpointType_2025); //$NON-NLS-1$
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?AsyncReplyRouterType", CoreElementTypes.AsyncReplyRouterType_2026); //$NON-NLS-1$
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?CustomAsyncReplyRouterType", CoreElementTypes.CustomAsyncReplyRouterType_2027); //$NON-NLS-1$
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundCollectionType", CoreElementTypes.OutboundCollectionType_2028); //$NON-NLS-1$
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundRouterType", CoreElementTypes.OutboundRouterType_2029); //$NON-NLS-1$
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundEndpointType", CoreElementTypes.OutboundEndpointType_2030); //$NON-NLS-1$
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?FilteringOutboundRouterType", CoreElementTypes.FilteringOutboundRouterType_2031); //$NON-NLS-1$
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?FilteringOutboundRouterType", CoreElementTypes.FilteringOutboundRouterType_2032); //$NON-NLS-1$
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?FilteringOutboundRouterType", CoreElementTypes.FilteringOutboundRouterType_2033); //$NON-NLS-1$
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?FilteringOutboundRouterType", CoreElementTypes.FilteringOutboundRouterType_2034); //$NON-NLS-1$
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?FilteringOutboundRouterType", CoreElementTypes.FilteringOutboundRouterType_2035); //$NON-NLS-1$
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?EndpointSelectorRouterType", CoreElementTypes.EndpointSelectorRouterType_2036); //$NON-NLS-1$
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?MessageSplitterOutboundRouterType", CoreElementTypes.MessageSplitterOutboundRouterType_2037); //$NON-NLS-1$
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ChunkingRouterType", CoreElementTypes.ChunkingRouterType_2038); //$NON-NLS-1$
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?StaticRecipientListRouterType", CoreElementTypes.StaticRecipientListRouterType_2039); //$NON-NLS-1$
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?CustomOutboundRouterType", CoreElementTypes.CustomOutboundRouterType_2040); //$NON-NLS-1$
		case ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.mulesource.org/schema/mule/core/2.0?Connection", CoreElementTypes.Connection_3001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ServicesEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CoreElementTypes.isKnownElementType(elementType)) {
			image = CoreElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CoreNavigatorGroup) {
			CoreNavigatorGroup group = (CoreNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CoreNavigatorItem) {
			CoreNavigatorItem navigatorItem = (CoreNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getDefaultModelType_79Text(view);
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001Text(view);
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2001Text(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2002Text(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2003Text(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2004Text(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2005Text(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2006Text(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2007Text(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2008Text(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2009Text(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2010Text(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2011Text(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2012Text(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2013Text(view);
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			return getForwardingRouterType_2014Text(view);
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2015Text(view);
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			return getFilteredInboundRouterType_2016Text(view);
		case IdempotentReceiverRouterTypeEditPart.VISUAL_ID:
			return getIdempotentReceiverRouterType_2017Text(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2018Text(view);
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2019Text(view);
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			return getMessageChunkingAggregatorRouterType_2020Text(view);
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			return getSelectiveConsumerRouterType_2021Text(view);
		case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			return getCustomCorrelationAggregatorRouterType_2022Text(view);
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			return getCustomInboundRouterType_2023Text(view);
		case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
			return getAsyncReplyCollectionType_2024Text(view);
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2025Text(view);
		case AsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getAsyncReplyRouterType_2026Text(view);
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterType_2027Text(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2028Text(view);
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
			return getOutboundRouterType_2029Text(view);
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2030Text(view);
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2031Text(view);
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2032Text(view);
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2033Text(view);
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2034Text(view);
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
			return getFilteringOutboundRouterType_2035Text(view);
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
			return getEndpointSelectorRouterType_2036Text(view);
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
			return getMessageSplitterOutboundRouterType_2037Text(view);
		case ChunkingRouterTypeEditPart.VISUAL_ID:
			return getChunkingRouterType_2038Text(view);
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
			return getStaticRecipientListRouterType_2039Text(view);
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return getCustomOutboundRouterType_2040Text(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDefaultModelType_79Text(View view) {
		DefaultModelType domainModelElement = (DefaultModelType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSedaServiceType_1001Text(View view) {
		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.SedaServiceType_1001,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(SedaServiceTypeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPojoComponentType_2001Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.PojoComponentType_2001,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(PojoComponentTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDefaultComponentType_2002Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2002,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(DefaultComponentTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDefaultComponentType_2003Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2003,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(BridgeComponentTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDefaultComponentType_2004Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2004,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(EchoComponentTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDefaultComponentType_2005Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2005,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(LogComponentTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDefaultComponentType_2006Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2006,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(NullComponentTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDefaultComponentType_2007Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2007,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(PassThroughComponentTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getExceptionStrategyType_2008Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.ExceptionStrategyType_2008,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(DefaultServiceExceptionStrategyTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOutboundEndpointType_2009Text(View view) {
		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.OutboundEndpointType_2009,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(OutboundEndpointTypeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getExceptionStrategyType_2010Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.ExceptionStrategyType_2010,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(DefaultConnectorExceptionStrategyTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCustomExceptionStrategyType_2011Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.CustomExceptionStrategyType_2011,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(CustomExceptionStrategyTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInboundCollectionType_2012Text(View view) {
		InboundCollectionType domainModelElement = (InboundCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMatchAll());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInboundEndpointType_2013Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.InboundEndpointType_2013,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getForwardingRouterType_2014Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.ForwardingRouterType_2014,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(ForwardingRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFilteredInboundRouterType_2015Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.FilteredInboundRouterType_2015,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(IdempotentSecureRecieverRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFilteredInboundRouterType_2016Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.FilteredInboundRouterType_2016,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(PassThroughInboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getIdempotentReceiverRouterType_2017Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.IdempotentReceiverRouterType_2017,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(IdempotentReceiverRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getWireTapRouterType_2018Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.WireTapRouterType_2018,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(WireTapRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSelectiveConsumerRouterType_2019Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.SelectiveConsumerRouterType_2019,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(SelectiveConsumerRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMessageChunkingAggregatorRouterType_2020Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.MessageChunkingAggregatorRouterType_2020,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(ChunkingInboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSelectiveConsumerRouterType_2021Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.SelectiveConsumerRouterType_2021,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(CorrelationResequencerRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCustomCorrelationAggregatorRouterType_2022Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.CustomCorrelationAggregatorRouterType_2022,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(CustomCorrelationAggregatorRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCustomInboundRouterType_2023Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.CustomInboundRouterType_2023,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(CustomInboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAsyncReplyCollectionType_2024Text(View view) {
		AsyncReplyCollectionType domainModelElement = (AsyncReplyCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTimeout());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInboundEndpointType_2025Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.InboundEndpointType_2025,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(AsyncReplyInboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAsyncReplyRouterType_2026Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.AsyncReplyRouterType_2026,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(AsyncReplyRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCustomAsyncReplyRouterType_2027Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.CustomAsyncReplyRouterType_2027,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(CustomAsyncReplyRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOutboundCollectionType_2028Text(View view) {
		OutboundCollectionType domainModelElement = (OutboundCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMatchAll());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutboundRouterType_2029Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.OutboundRouterType_2029,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(PassThroughOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOutboundEndpointType_2030Text(View view) {
		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.OutboundEndpointType_2030,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(OutboundRouterOutboundEndpointTypeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFilteringOutboundRouterType_2031Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.FilteringOutboundRouterType_2031,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(FilteringOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFilteringOutboundRouterType_2032Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.FilteringOutboundRouterType_2032,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(ChainingOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFilteringOutboundRouterType_2033Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.FilteringOutboundRouterType_2033,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(ExceptionOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFilteringOutboundRouterType_2034Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.FilteringOutboundRouterType_2034,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(MulticastingOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFilteringOutboundRouterType_2035Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.FilteringOutboundRouterType_2035,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(TemplateEndpointOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getEndpointSelectorRouterType_2036Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.EndpointSelectorRouterType_2036,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(EndpointSelectorRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getMessageSplitterOutboundRouterType_2037Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.MessageSplitterOutboundRouterType_2037,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(MessageSplitterOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getChunkingRouterType_2038Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.ChunkingRouterType_2038,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(ChunkingRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getStaticRecipientListRouterType_2039Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.StaticRecipientListRouterType_2039,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(StaticRecipientListRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCustomOutboundRouterType_2040Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.CustomOutboundRouterType_2040,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(CustomOutboundRouterTypeLabelEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);
		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getConnection_3001Text(View view) {
		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.Connection_3001,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(ConnectionEndpointEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DefaultModelTypeEditPart.MODEL_ID.equals(CoreVisualIDRegistry
				.getModelID(view));
	}

}
