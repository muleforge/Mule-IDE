package org.mule.ide.config.vm.editor.services.navigator;

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
import org.mule.ide.config.core.InboundCollectionType;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.vm.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.vm.editor.services.part.VMDiagramEditorPlugin;
import org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;
import org.mule.ide.config.vm.editor.services.providers.VMParserProvider;

/**
 * @generated
 */
public class VMNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		VMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		VMDiagramEditorPlugin
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
		if (element instanceof VMNavigatorItem
				&& !isOwnView(((VMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof VMNavigatorGroup) {
			VMNavigatorGroup group = (VMNavigatorGroup) element;
			return VMDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof VMNavigatorItem) {
			VMNavigatorItem navigatorItem = (VMNavigatorItem) element;
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
		switch (VMVisualIDRegistry.getVisualID(view)) {
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.mulesource.org/schema/mule/core/2.0?DefaultModelType", VMElementTypes.DefaultModelType_79); //$NON-NLS-1$
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.mulesource.org/schema/mule/core/2.0?SedaServiceType", VMElementTypes.SedaServiceType_1001); //$NON-NLS-1$
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?InboundCollectionType", VMElementTypes.InboundCollectionType_2001); //$NON-NLS-1$
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/vm/2.0?InboundEndpointType", VMElementTypes.InboundEndpointType_2002); //$NON-NLS-1$
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundCollectionType", VMElementTypes.OutboundCollectionType_2003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = VMDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& VMElementTypes.isKnownElementType(elementType)) {
			image = VMElementTypes.getImage(elementType);
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
		if (element instanceof VMNavigatorGroup) {
			VMNavigatorGroup group = (VMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof VMNavigatorItem) {
			VMNavigatorItem navigatorItem = (VMNavigatorItem) element;
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
		switch (VMVisualIDRegistry.getVisualID(view)) {
		case DefaultModelTypeEditPart.VISUAL_ID:
			return getDefaultModelType_79Text(view);
		case SedaServiceTypeEditPart.VISUAL_ID:
			return getSedaServiceType_1001Text(view);
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return getInboundCollectionType_2001Text(view);
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return getInboundEndpointType_2002Text(view);
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return getOutboundCollectionType_2003Text(view);
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
			VMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSedaServiceType_1001Text(View view) {
		IAdaptable hintAdapter = new VMParserProvider.HintAdapter(
				VMElementTypes.SedaServiceType_1001,
				(view.getElement() != null ? view.getElement() : view),
				VMVisualIDRegistry
						.getType(SedaServiceTypeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			VMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003); //$NON-NLS-1$
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
			VMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInboundEndpointType_2002Text(View view) {

		IAdaptable hintAdapter = new VMParserProvider.HintAdapter(
				VMElementTypes.InboundEndpointType_2002,
				(view.getElement() != null ? view.getElement() : view),
				VMVisualIDRegistry
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
	private String getOutboundCollectionType_2003Text(View view) {
		OutboundCollectionType domainModelElement = (OutboundCollectionType) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isMatchAll());
		} else {
			VMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
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
		return DefaultModelTypeEditPart.MODEL_ID.equals(VMVisualIDRegistry
				.getModelID(view));
	}

}
