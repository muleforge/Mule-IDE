package org.mule.ide.config.axis.editor.services.navigator;

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
import org.mule.ide.config.axis.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.axis.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.axis.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.axis.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.axis.editor.services.part.AxisEditorPlugin;
import org.mule.ide.config.axis.editor.services.part.AxisVisualIDRegistry;
import org.mule.ide.config.axis.editor.services.providers.AxisElementTypes;
import org.mule.ide.config.axis.editor.services.providers.AxisParserProvider;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.InboundCollectionType;

/**
 * @generated
 */
public class AxisNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		AxisEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		AxisEditorPlugin
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
		if (element instanceof AxisNavigatorItem
				&& !isOwnView(((AxisNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof AxisNavigatorGroup) {
			AxisNavigatorGroup group = (AxisNavigatorGroup) element;
			return AxisEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof AxisNavigatorItem) {
			AxisNavigatorItem navigatorItem = (AxisNavigatorItem) element;
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
		switch (AxisVisualIDRegistry.getVisualID(view)) {
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/axis/2.0?InboundEndpointType", AxisElementTypes.InboundEndpointType_2002); //$NON-NLS-1$
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/axis/2.0?OutboundEndpointType", AxisElementTypes.OutboundEndpointType_2004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AxisEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& AxisElementTypes.isKnownElementType(elementType)) {
			image = AxisElementTypes.getImage(elementType);
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
		if (element instanceof AxisNavigatorGroup) {
			AxisNavigatorGroup group = (AxisNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof AxisNavigatorItem) {
			AxisNavigatorItem navigatorItem = (AxisNavigatorItem) element;
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
		switch (AxisVisualIDRegistry.getVisualID(view)) {
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2002Text(view);
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return getOutboundEndpointType_2004Text(view);
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
			AxisEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInboundCollectionType_2001Text(View view) {
		InboundCollectionType domainModelElement = (InboundCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMatchAll());
		} else {
			AxisEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInboundEndpointType_2002Text(View view) {

		IAdaptable hintAdapter = new AxisParserProvider.HintAdapter(
				AxisElementTypes.InboundEndpointType_2002,
				(view.getElement() != null ? view.getElement() : view),
				AxisVisualIDRegistry
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
	private String getExceptionStrategyType_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutboundEndpointType_2004Text(View view) {
		IAdaptable hintAdapter = new AxisParserProvider.HintAdapter(
				AxisElementTypes.OutboundEndpointType_2004,
				(view.getElement() != null ? view.getElement() : view),
				AxisVisualIDRegistry
						.getType(OutboundEndpointTypeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			AxisEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003); //$NON-NLS-1$
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
		return AxisVisualIDRegistry.MODEL_ID.equals(AxisVisualIDRegistry
				.getModelID(view));
	}

}
