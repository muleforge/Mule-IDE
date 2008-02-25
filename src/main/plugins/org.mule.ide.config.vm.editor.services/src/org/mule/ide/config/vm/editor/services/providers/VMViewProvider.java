package org.mule.ide.config.vm.editor.services.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.vm.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundCollectionTypeOUTBOUNDROUTERSEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry;
import org.mule.ide.config.vm.editor.services.view.factories.DefaultModelTypeViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.InboundCollectionTypeINBOUNDROUTERSViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.InboundCollectionTypeViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.InboundEndpointServiceItemEndpointNameViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.InboundEndpointServiceItemTypeLabelViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.InboundEndpointServiceItemTypeViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.OutboundCollectionTypeOUTBOUNDROUTERSViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.OutboundCollectionTypeViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.SedaServiceTypeCOMPONENTViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.SedaServiceTypeEXCEPTIONViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.SedaServiceTypeNameViewFactory;
import org.mule.ide.config.vm.editor.services.view.factories.SedaServiceTypeViewFactory;

/**
 * @generated
 */
public class VMViewProvider extends AbstractViewProvider {

	/**
	 * customization
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
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
			visualID = VMVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = VMVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!VMElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != VMVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!DefaultModelTypeEditPart.MODEL_ID
						.equals(VMVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case SedaServiceTypeEditPart.VISUAL_ID:
				case InboundCollectionTypeEditPart.VISUAL_ID:
				case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				case OutboundCollectionTypeEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != VMVisualIDRegistry.getNodeVisualID(
									containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case SedaServiceTypeNameEditPart.VISUAL_ID:
				case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
				case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
					if (SedaServiceTypeEditPart.VISUAL_ID != VMVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
					if (InboundCollectionTypeEditPart.VISUAL_ID != VMVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
				case InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
					if (InboundEndpointServiceItemTypeEditPart.VISUAL_ID != VMVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
					if (OutboundCollectionTypeEditPart.VISUAL_ID != VMVisualIDRegistry
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
				|| !VMVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return SedaServiceTypeViewFactory.class;
		case SedaServiceTypeNameEditPart.VISUAL_ID:
			return SedaServiceTypeNameViewFactory.class;
		case InboundCollectionTypeEditPart.VISUAL_ID:
			return InboundCollectionTypeViewFactory.class;
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			return InboundEndpointServiceItemTypeViewFactory.class;
		case InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
			return InboundEndpointServiceItemTypeLabelViewFactory.class;
		case InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
			return InboundEndpointServiceItemEndpointNameViewFactory.class;
		case OutboundCollectionTypeEditPart.VISUAL_ID:
			return OutboundCollectionTypeViewFactory.class;
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			return SedaServiceTypeCOMPONENTViewFactory.class;
		case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
			return SedaServiceTypeEXCEPTIONViewFactory.class;
		case InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			return InboundCollectionTypeINBOUNDROUTERSViewFactory.class;
		case OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID:
			return OutboundCollectionTypeOUTBOUNDROUTERSViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!VMElementTypes.isKnownElementType(elementType)
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
		int visualID = VMVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != VMVisualIDRegistry
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
