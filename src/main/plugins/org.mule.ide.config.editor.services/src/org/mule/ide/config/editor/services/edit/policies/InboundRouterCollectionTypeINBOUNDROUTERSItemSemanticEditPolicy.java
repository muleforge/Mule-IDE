package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.ChunkingInboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CorrelationAggregatorRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CorrelationResequencerRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CustomInboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.ForwardingRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.IdempotentReceiverTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.IdempotentSecureRecieverRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.PassThroughInboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.SelectiveConsumerRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.WireTapRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class InboundRouterCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy
		extends CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.ForwardingRouterType_2015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new ForwardingRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.FilteredInboundRouterType_2016 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new IdempotentSecureRecieverRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.FilteredInboundRouterType_2017 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new PassThroughInboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.IdempotentReceiverType_2018 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new IdempotentReceiverTypeCreateCommand(req));
		}
		if (CoreElementTypes.WireTapRouterType_2019 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new WireTapRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.SelectiveConsumerRouterType_2020 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new SelectiveConsumerRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.CorrelationRouterType_2021 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new ChunkingInboundRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.CorrelationRouterType_2022 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new CorrelationResequencerRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.CorrelationAggregatorRouterType_2023 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new CorrelationAggregatorRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.CustomInboundRouterType_2024 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getInboundRouterCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new CustomInboundRouterTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}