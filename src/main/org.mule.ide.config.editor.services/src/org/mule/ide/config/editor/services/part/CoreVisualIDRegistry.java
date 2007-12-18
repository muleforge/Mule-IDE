package org.mule.ide.config.editor.services.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DefaultComponentType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeOUTBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeRESPONSEEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WrapLabelEditPart;
import org.mule.ide.config.editor.services.expressions.CoreAbstractExpression;

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
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getPojoComponentType().isSuperTypeOf(
					domainElement.eClass())) {
				return PojoComponentTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getNoArgsCallWrapperType().isSuperTypeOf(
					domainElement.eClass())) {
				return NoArgsCallWrapperTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getDefaultComponentType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints.defaultComponentConstraint(
							(DefaultComponentType) domainElement)
							.booleanValue()) {
				return DefaultComponentTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getDefaultComponentType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints.bridgeComponentConstraint(
							(DefaultComponentType) domainElement)
							.booleanValue()) {
				return BridgeComponentTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getDefaultComponentType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints.echoComponentConstraint(
							(DefaultComponentType) domainElement)
							.booleanValue()) {
				return EchoComponentTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getDefaultComponentType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints.logComponentConstraint(
							(DefaultComponentType) domainElement)
							.booleanValue()) {
				return LogComponentTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getDefaultComponentType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints.nullComponentConstraint(
							(DefaultComponentType) domainElement)
							.booleanValue()) {
				return NullComponentTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getDefaultComponentType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints.passThroughComponentConstraint(
							(DefaultComponentType) domainElement)
							.booleanValue()) {
				return PassThroughComponentTypeEditPart.VISUAL_ID;
			}
			break;
		case InboundRouterCollectionTypeINBOUNDEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getWireTapRouterType().isSuperTypeOf(
					domainElement.eClass())) {
				return WireTapRouterTypeEditPart.VISUAL_ID;
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
			if (SedaServiceTypeCOMPONENTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID == nodeVisualID) {
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
			if (InboundRouterCollectionTypeINBOUNDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WireTapRouterTypeEditPart.VISUAL_ID:
			if (WrapLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			if (OutboundRouterCollectionTypeOUTBOUNDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			if (ResponseRouterCollectionTypeRESPONSEEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PojoComponentTypeEditPart.VISUAL_ID:
			if (PojoComponentTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PojoComponentTypeClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NoArgsCallWrapperTypeEditPart.VISUAL_ID:
			if (NoArgsCallWrapperTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NoArgsCallWrapperTypeClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DefaultComponentTypeEditPart.VISUAL_ID:
			if (DefaultComponentTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BridgeComponentTypeEditPart.VISUAL_ID:
			if (BridgeComponentTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EchoComponentTypeEditPart.VISUAL_ID:
			if (EchoComponentTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogComponentTypeEditPart.VISUAL_ID:
			if (LogComponentTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullComponentTypeEditPart.VISUAL_ID:
			if (NullComponentTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PassThroughComponentTypeEditPart.VISUAL_ID:
			if (PassThroughComponentTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
			if (PojoComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NoArgsCallWrapperTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BridgeComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EchoComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PassThroughComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InboundRouterCollectionTypeINBOUNDEditPart.VISUAL_ID:
			if (WireTapRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
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

	/**
	 * @generated
	 */
	private static class JavaConstraints {

		/**
		 * customization
		 *   - implement constraint for differentiating DefaultComponentType elements
		 */
		private static java.lang.Boolean defaultComponentConstraint(
				DefaultComponentType self) {
			return false;
		}

		/**
		 * customization
		 *   - implement constraint for differentiating DefaultComponentType elements
		 */
		private static java.lang.Boolean bridgeComponentConstraint(
				DefaultComponentType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractComponentGroup();
			// Since I know there can only be zero or one component in the container...
			DefaultComponentType component = (DefaultComponentType) map.get(
					CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent(),
					false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating DefaultComponentType elements
		 */
		private static java.lang.Boolean echoComponentConstraint(
				DefaultComponentType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractComponentGroup();
			// Since I know there can only be zero or one component in the container...
			DefaultComponentType component = (DefaultComponentType) map.get(
					CorePackage.eINSTANCE.getDocumentRoot_EchoComponent(),
					false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating DefaultComponentType elements
		 */
		private static java.lang.Boolean logComponentConstraint(
				DefaultComponentType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractComponentGroup();
			// Since I know there can only be zero or one component in the container...
			DefaultComponentType component = (DefaultComponentType) map
					.get(CorePackage.eINSTANCE.getDocumentRoot_LogComponent(),
							false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating DefaultComponentType elements
		 */
		private static java.lang.Boolean nullComponentConstraint(
				DefaultComponentType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractComponentGroup();
			// Since I know there can only be zero or one component in the container...
			DefaultComponentType component = (DefaultComponentType) map
					.get(CorePackage.eINSTANCE.getDocumentRoot_NullComponent(),
							false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating DefaultComponentType elements
		 */
		private static java.lang.Boolean passThroughComponentConstraint(
				DefaultComponentType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractComponentGroup();
			// Since I know there can only be zero or one component in the container...
			DefaultComponentType component = (DefaultComponentType) map
					.get(CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent(),
							false);
			return self.equals(component);
		}

	}

}
