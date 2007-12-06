package org.mule.ide.config.editor.services.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DefaultModelType;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CoreVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = ServicesEditorPlugin.getInstance()
			.getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DefaultModelTypeEditPart.MODEL_ID.equals(view.getType())) {
				return DefaultModelTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.mule.ide.config.editor.services.part.CoreVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ServicesEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CorePackage.eINSTANCE.getDefaultModelType().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((DefaultModelType) domainElement)) {
			return DefaultModelTypeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.mule.ide.config.editor.services.part.CoreVisualIDRegistry
				.getModelID(containerView);
		if (!DefaultModelTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DefaultModelTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.mule.ide.config.editor.services.part.CoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DefaultModelTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getInboundRouterCollectionType()
					.isSuperTypeOf(domainElement.eClass())) {
				return InboundRouterCollectionTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getOutboundRouterCollectionType()
					.isSuperTypeOf(domainElement.eClass())) {
				return OutboundRouterCollectionTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getResponseRouterCollectionType()
					.isSuperTypeOf(domainElement.eClass())) {
				return ResponseRouterCollectionTypeEditPart.VISUAL_ID;
			}
			break;
		case DefaultModelTypeEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getSedaServiceType().isSuperTypeOf(
					domainElement.eClass())) {
				return SedaServiceTypeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.mule.ide.config.editor.services.part.CoreVisualIDRegistry
				.getModelID(containerView);
		if (!DefaultModelTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DefaultModelTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.mule.ide.config.editor.services.part.CoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DefaultModelTypeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SedaServiceTypeEditPart.VISUAL_ID:
			if (SedaServiceTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SedaServiceTypeINBOUNDROUTERSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SedaServiceTypeCOMPONENTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InboundRouterCollectionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutboundRouterCollectionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResponseRouterCollectionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			if (WrapLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			if (WrapLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			if (WrapLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DefaultModelTypeEditPart.VISUAL_ID:
			if (SedaServiceTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(DefaultModelType element) {
		return true;
	}

}
