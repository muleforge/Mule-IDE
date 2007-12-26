package org.mule.ide.config.editor.services.part;

import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CorrelationRouterType;
import org.mule.ide.config.core.DefaultComponentType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.ExceptionStrategyType;
import org.mule.ide.config.core.FilteredInboundRouterType;
import org.mule.ide.config.core.InboundRouterCollectionType;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationAggregatorRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeRESPONSEENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ResponseRouterCollectionTypeRESPONSEROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeOUTBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeRESPONSEEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeLabelEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeLabelEditPart;
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
		case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getExceptionStrategyType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints
							.defautServiceExceptionStrategyConstraint(
									(ExceptionStrategyType) domainElement)
							.booleanValue()) {
				return DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getExceptionStrategyType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints
							.defautConnectorExceptionStrategyConstraint(
									(ExceptionStrategyType) domainElement)
							.booleanValue()) {
				return DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getCustomExceptionStrategyType()
					.isSuperTypeOf(domainElement.eClass())) {
				return CustomExceptionStrategyTypeEditPart.VISUAL_ID;
			}
			break;
		case SedaServiceTypeINBOUNDEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getInboundRouterCollectionType()
					.isSuperTypeOf(domainElement.eClass())) {
				return InboundRouterCollectionTypeEditPart.VISUAL_ID;
			}
			break;
		case SedaServiceTypeRESPONSEEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getResponseRouterCollectionType()
					.isSuperTypeOf(domainElement.eClass())) {
				return ResponseRouterCollectionTypeEditPart.VISUAL_ID;
			}
			break;
		case SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getOutboundRouterCollectionType()
					.isSuperTypeOf(domainElement.eClass())) {
				return OutboundRouterCollectionTypeEditPart.VISUAL_ID;
			}
			break;
		case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getOutboundEndpointType().isSuperTypeOf(
					domainElement.eClass())) {
				return OutboundEndpointTypeEditPart.VISUAL_ID;
			}
			break;
		case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getOutboundEndpointType().isSuperTypeOf(
					domainElement.eClass())) {
				return OutboundEndpointTypeEditPart.VISUAL_ID;
			}
			break;
		case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getOutboundEndpointType().isSuperTypeOf(
					domainElement.eClass())) {
				return OutboundEndpointTypeEditPart.VISUAL_ID;
			}
			break;
		case InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getInboundEndpointType().isSuperTypeOf(
					domainElement.eClass())) {
				return InboundEndpointServiceItemTypeEditPart.VISUAL_ID;
			}
			break;
		case InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			if (CorePackage.eINSTANCE.getForwardingRouterType().isSuperTypeOf(
					domainElement.eClass())) {
				return ForwardingRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getFilteredInboundRouterType()
					.isSuperTypeOf(domainElement.eClass())
					&& JavaConstraints
							.idempotentSecureReceiverRouterConstraint(
									(FilteredInboundRouterType) domainElement)
							.booleanValue()) {
				return IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getFilteredInboundRouterType()
					.isSuperTypeOf(domainElement.eClass())
					&& JavaConstraints.inboundPassThroughRouterConstraint(
							(FilteredInboundRouterType) domainElement)
							.booleanValue()) {
				return PassThroughInboundRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getIdempotentReceiverType()
					.isSuperTypeOf(domainElement.eClass())) {
				return IdempotentReceiverTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getWireTapRouterType().isSuperTypeOf(
					domainElement.eClass())) {
				return WireTapRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getSelectiveConsumerRouterType()
					.isSuperTypeOf(domainElement.eClass())) {
				return SelectiveConsumerRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getCorrelationRouterType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints
							.messageChunkingAggregatorRouterConstraint(
									(CorrelationRouterType) domainElement)
							.booleanValue()) {
				return ChunkingInboundRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getCorrelationRouterType().isSuperTypeOf(
					domainElement.eClass())
					&& JavaConstraints.correlationResequencerRouterConstraint(
							(CorrelationRouterType) domainElement)
							.booleanValue()) {
				return CorrelationResequencerRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getCorrelationAggregatorRouterType()
					.isSuperTypeOf(domainElement.eClass())) {
				return CorrelationAggregatorRouterTypeEditPart.VISUAL_ID;
			}
			if (CorePackage.eINSTANCE.getCustomInboundRouterType()
					.isSuperTypeOf(domainElement.eClass())) {
				return CustomInboundRouterTypeEditPart.VISUAL_ID;
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
			if (SedaServiceTypeINBOUNDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SedaServiceTypeRESPONSEEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID == nodeVisualID) {
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
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
			if (DefaultServiceExceptionStrategyTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			if (OutboundEndpointTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
			if (DefaultConnectorExceptionStrategyTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
			if (CustomExceptionStrategyTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomExceptionStrategyTypeClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InboundRouterCollectionTypeEditPart.VISUAL_ID:
			if (InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
			if (InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForwardingRouterTypeEditPart.VISUAL_ID:
			if (ForwardingRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
			if (IdempotentSecureRecieverRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
			if (PassThroughInboundRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IdempotentReceiverTypeEditPart.VISUAL_ID:
			if (IdempotentReceiverRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WireTapRouterTypeEditPart.VISUAL_ID:
			if (WireTapRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
			if (SelectiveConsumerRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
			if (ChunkingInboundRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
			if (CorrelationResequencerRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
			if (CorrelationAggregatorRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
			if (CustomInboundRouterTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
			if (ResponseRouterCollectionTypeRESPONSEENDPOINTSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResponseRouterCollectionTypeRESPONSEROUTERSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
			if (OutboundRouterCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID == nodeVisualID) {
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
		case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
			if (DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomExceptionStrategyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SedaServiceTypeINBOUNDEditPart.VISUAL_ID:
			if (InboundRouterCollectionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SedaServiceTypeRESPONSEEditPart.VISUAL_ID:
			if (ResponseRouterCollectionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID:
			if (OutboundRouterCollectionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			if (OutboundEndpointTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			if (OutboundEndpointTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID:
			if (OutboundEndpointTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InboundRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
			if (InboundEndpointServiceItemTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			if (ForwardingRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PassThroughInboundRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IdempotentReceiverTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WireTapRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectiveConsumerRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChunkingInboundRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CorrelationResequencerRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CorrelationAggregatorRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomInboundRouterTypeEditPart.VISUAL_ID == nodeVisualID) {
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
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean defaultComponentConstraint(
				DefaultComponentType self) {
			return false;
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
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
		 *   - implement constraint for differentiating elements of the same type
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
		 *   - implement constraint for differentiating elements of the same type
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
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean nullComponentConstraint(
				DefaultComponentType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractComponentGroup();
			// Since I know there can only be zero or one component in the container...
			DefaultComponentType component = (DefaultComponentType) map.get(
					CorePackage.eINSTANCE.getDocumentRoot_NullComponent(),
					false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean passThroughComponentConstraint(
				DefaultComponentType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractComponentGroup();
			// Since I know there can only be zero or one component in the container...
			DefaultComponentType component = (DefaultComponentType) map.get(
					CorePackage.eINSTANCE
							.getDocumentRoot_PassThroughComponent(), false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean defautServiceExceptionStrategyConstraint(
				ExceptionStrategyType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractExceptionStrategyGroup();
			// Since I know there can only be zero or one in the container...
			ExceptionStrategyType component = (ExceptionStrategyType) map.get(
					CorePackage.eINSTANCE
							.getDocumentRoot_DefaultServiceExceptionStrategy(),
					false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean defautConnectorExceptionStrategyConstraint(
				ExceptionStrategyType self) {
			BaseServiceType container = (BaseServiceType) self.eContainer();
			FeatureMap map = container.getAbstractExceptionStrategyGroup();
			// Since I know there can only be zero or one in the container...
			ExceptionStrategyType component = (ExceptionStrategyType) map
					.get(
							CorePackage.eINSTANCE
									.getDocumentRoot_DefaultConnectorExceptionStrategy(),
							false);
			return self.equals(component);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean idempotentSecureReceiverRouterConstraint(
				FilteredInboundRouterType self) {
			InboundRouterCollectionType container = (InboundRouterCollectionType) self
					.eContainer();
			FeatureMap map = container.getAbstractInboundRouterGroup();
			List<FilteredInboundRouterType> routers = map
					.list(CorePackage.eINSTANCE
							.getDocumentRoot_IdempotentSecureHashReceiverRouter());
			return routers.contains(self);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean inboundPassThroughRouterConstraint(
				FilteredInboundRouterType self) {
			InboundRouterCollectionType container = (InboundRouterCollectionType) self
					.eContainer();
			FeatureMap map = container.getAbstractInboundRouterGroup();
			List<FilteredInboundRouterType> routers = map
					.list(CorePackage.eINSTANCE
							.getDocumentRoot_InboundPassThroughRouter());
			return routers.contains(self);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean messageChunkingAggregatorRouterConstraint(
				CorrelationRouterType self) {
			InboundRouterCollectionType container = (InboundRouterCollectionType) self
					.eContainer();
			FeatureMap map = container.getAbstractInboundRouterGroup();
			List<CorrelationRouterType> routers = map
					.list(CorePackage.eINSTANCE
							.getDocumentRoot_MessageChunkingAggregatorRouter());
			return routers.contains(self);
		}

		/**
		 * customization
		 *   - implement constraint for differentiating elements of the same type
		 */
		private static java.lang.Boolean correlationResequencerRouterConstraint(
				CorrelationRouterType self) {
			InboundRouterCollectionType container = (InboundRouterCollectionType) self
					.eContainer();
			FeatureMap map = container.getAbstractInboundRouterGroup();
			List<CorrelationRouterType> routers = map
					.list(CorePackage.eINSTANCE
							.getDocumentRoot_CorrelationResequencerRouter());
			return routers.contains(self);
		}

	}

}
