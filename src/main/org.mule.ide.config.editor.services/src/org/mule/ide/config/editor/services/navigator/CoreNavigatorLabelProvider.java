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
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.WrapLabel2EditPart;
import org.mule.ide.config.editor.services.edit.parts.WrapLabel3EditPart;
import org.mule.ide.config.editor.services.edit.parts.WrapLabelEditPart;
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
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?OutboundRouterCollectionType", CoreElementTypes.OutboundRouterCollectionType_2002); //$NON-NLS-1$
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mulesource.org/schema/mule/core/2.0?ResponseRouterCollectionType", CoreElementTypes.ResponseRouterCollectionType_2003); //$NON-NLS-1$
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
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return getOutboundRouterCollectionType_2002Text(view);
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return getResponseRouterCollectionType_2003Text(view);
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
					"Parser was not found for label " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInboundRouterCollectionType_2001Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.InboundRouterCollectionType_2001, (view
						.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry.getType(WrapLabelEditPart.VISUAL_ID));
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
	private String getOutboundRouterCollectionType_2002Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.OutboundRouterCollectionType_2002, (view
						.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry.getType(WrapLabel2EditPart.VISUAL_ID));
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
	private String getResponseRouterCollectionType_2003Text(View view) {

		IAdaptable hintAdapter = new CoreParserProvider.HintAdapter(
				CoreElementTypes.ResponseRouterCollectionType_2003, (view
						.getElement() != null ? view.getElement() : view),
				CoreVisualIDRegistry.getType(WrapLabel3EditPart.VISUAL_ID));
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
