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
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.DefaultServiceType;
import org.mule.ide.config.core.InboundRouterCollectionType;
import org.mule.ide.config.core.OutboundRouterCollectionType;
import org.mule.ide.config.core.PojoComponentType;
import org.mule.ide.config.core.ResponseRouterCollectionType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramEditorPlugin;
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
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?InboundRouterCollectionType", CoreElementTypes.InboundRouterCollectionType_2001); //$NON-NLS-1$
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?InboundEndpointType", CoreElementTypes.InboundEndpointType_2002); //$NON-NLS-1$
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?WireTapRouterType", CoreElementTypes.WireTapRouterType_2003); //$NON-NLS-1$
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ResponseRouterCollectionType", CoreElementTypes.ResponseRouterCollectionType_2004); //$NON-NLS-1$
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundRouterCollectionType", CoreElementTypes.OutboundRouterCollectionType_2005); //$NON-NLS-1$
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?PojoComponentType", CoreElementTypes.PojoComponentType_2006); //$NON-NLS-1$
		case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?NoArgsCallWrapperType", CoreElementTypes.NoArgsCallWrapperType_2007); //$NON-NLS-1$
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2008); //$NON-NLS-1$
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2009); //$NON-NLS-1$
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2010); //$NON-NLS-1$
		case LogComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2011); //$NON-NLS-1$
		case NullComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2012); //$NON-NLS-1$
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?DefaultComponentType", CoreElementTypes.DefaultComponentType_2013); //$NON-NLS-1$
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ExceptionStrategyType", CoreElementTypes.ExceptionStrategyType_2014); //$NON-NLS-1$
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundEndpointType", CoreElementTypes.OutboundEndpointType_2015); //$NON-NLS-1$
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ExceptionStrategyType", CoreElementTypes.ExceptionStrategyType_2016); //$NON-NLS-1$
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?CustomExceptionStrategyType", CoreElementTypes.CustomExceptionStrategyType_2017); //$NON-NLS-1$
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
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getInboundRouterCollectionType_2001Text(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2002Text(view);
		case WireTapRouterTypeEditPart.VISUAL_ID:
			return getWireTapRouterType_2003Text(view);
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return getResponseRouterCollectionType_2004Text(view);
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2005Text(view);
		case PojoComponentTypeEditPart.VISUAL_ID:
			return getPojoComponentType_2006Text(view);
		case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
			return getNoArgsCallWrapperType_2007Text(view);
		case DefaultComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2008Text(view);
		case BridgeComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2009Text(view);
		case EchoComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2010Text(view);
		case LogComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2011Text(view);
		case NullComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2012Text(view);
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			return getDefaultComponentType_2013Text(view);
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2014Text(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2015Text(view);
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			return getExceptionStrategyType_2016Text(view);
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			return getCustomExceptionStrategyType_2017Text(view);
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
					"Parser was not found for label " + 4018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInboundRouterCollectionType_2001Text(View view) {
		InboundRouterCollectionType domainModelElement = (InboundRouterCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMatchAll());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInboundEndpointType_2002Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.InboundEndpointType_2002,
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
	private String getWireTapRouterType_2003Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.WireTapRouterType_2003,
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
	private String getResponseRouterCollectionType_2004Text(View view) {
		ResponseRouterCollectionType domainModelElement = (ResponseRouterCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTimeout());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutboundRouterCollectionType_2005Text(View view) {
		OutboundRouterCollectionType domainModelElement = (OutboundRouterCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMatchAll());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPojoComponentType_2006Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.PojoComponentType_2006,
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
	private String getNoArgsCallWrapperType_2007Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.NoArgsCallWrapperType_2007,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(NoArgsCallWrapperTypeLabelEditPart.VISUAL_ID));
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
	private String getDefaultComponentType_2008Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2008,
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
	private String getDefaultComponentType_2009Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2009,
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
	private String getDefaultComponentType_2010Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2010,
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
	private String getDefaultComponentType_2011Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2011,
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
	private String getDefaultComponentType_2012Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2012,
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
	private String getDefaultComponentType_2013Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.DefaultComponentType_2013,
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
	private String getExceptionStrategyType_2014Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.ExceptionStrategyType_2014,
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
	private String getOutboundEndpointType_2015Text(View view) {
		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.OutboundEndpointType_2015,
				(view.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry
						.getType(OutboundEndpointTypeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			ServicesEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getExceptionStrategyType_2016Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.ExceptionStrategyType_2016,
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
	private String getCustomExceptionStrategyType_2017Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.CustomExceptionStrategyType_2017,
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
