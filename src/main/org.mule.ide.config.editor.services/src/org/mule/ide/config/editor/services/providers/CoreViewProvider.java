package org.mule.ide.config.editor.services.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.WrapLabel2EditPart;
import org.mule.ide.config.editor.services.edit.parts.WrapLabel3EditPart;
import org.mule.ide.config.editor.services.edit.parts.WrapLabelEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.editor.services.view.factories.DefaultModelTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.InboundRouterCollectionTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.OutboundRouterCollectionTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.ResponseRouterCollectionTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeCOMPONENTViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeINBOUNDROUTERSViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeNameViewFactory;
import org.mule.ide.config.editor.services.view.factories.SedaServiceTypeViewFactory;
import org.mule.ide.config.editor.services.view.factories.WrapLabel2ViewFactory;
import org.mule.ide.config.editor.services.view.factories.WrapLabel3ViewFactory;
import org.mule.ide.config.editor.services.view.factories.WrapLabelViewFactory;

/**
 * @generated
 */
public class CoreViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (DefaultModelTypeEditPart.MODEL_ID.equals(diagramKind)
				&& CoreVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return DefaultModelTypeViewFactory.class;
		}
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
			visualID = CoreVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = CoreVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!CoreElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != CoreVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!DefaultModelTypeEditPart.MODEL_ID
						.equals(CoreVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case SedaServiceTypeEditPart.VISUAL_ID:
				case InboundRouterCollectionTypeEditPart.VISUAL_ID:
				case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
				case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != CoreVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case SedaServiceTypeNameEditPart.VISUAL_ID:
				case SedaServiceTypeINBOUNDROUTERSEditPart.VISUAL_ID:
				case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
					if (SedaServiceTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrapLabelEditPart.VISUAL_ID:
					if (InboundRouterCollectionTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrapLabel2EditPart.VISUAL_ID:
					if (OutboundRouterCollectionTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrapLabel3EditPart.VISUAL_ID:
					if (ResponseRouterCollectionTypeEditPart.VISUAL_ID != CoreVisualIDRegistry
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
				|| !CoreVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			return SedaServiceTypeViewFactory.class;
		case SedaServiceTypeNameEditPart.VISUAL_ID:
			return SedaServiceTypeNameViewFactory.class;
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			return InboundRouterCollectionTypeViewFactory.class;
		case WrapLabelEditPart.VISUAL_ID:
			return WrapLabelViewFactory.class;
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			return OutboundRouterCollectionTypeViewFactory.class;
		case WrapLabel2EditPart.VISUAL_ID:
			return WrapLabel2ViewFactory.class;
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			return ResponseRouterCollectionTypeViewFactory.class;
		case WrapLabel3EditPart.VISUAL_ID:
			return WrapLabel3ViewFactory.class;
		case SedaServiceTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			return SedaServiceTypeINBOUNDROUTERSViewFactory.class;
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			return SedaServiceTypeCOMPONENTViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!CoreElementTypes.isKnownElementType(elementType)
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
		int visualID = CoreVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != CoreVisualIDRegistry
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
