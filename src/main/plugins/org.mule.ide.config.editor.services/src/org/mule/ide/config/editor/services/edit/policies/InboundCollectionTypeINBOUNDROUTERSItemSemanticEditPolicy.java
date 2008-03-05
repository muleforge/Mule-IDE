package org.mule.ide.config.editor.services.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.ChunkingInboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CorrelationResequencerRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CustomCorrelationAggregatorRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CustomInboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.ForwardingRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.IdempotentReceiverRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.IdempotentSecureRecieverRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.InboundEndpointServiceItemTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.PassThroughInboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.SelectiveConsumerRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.WireTapRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class InboundCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

	List<Extension> extensions = new ArrayList<Extension>();

	public void addExtension(Extension extension) {
		extensions.add(extension);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.InboundEndpointType_2013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundEndpoint());
			}
			return getGEFWrapper(new InboundEndpointServiceItemTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.ForwardingRouterType_2014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new ForwardingRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.FilteredInboundRouterType_2015 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new IdempotentSecureRecieverRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.FilteredInboundRouterType_2016 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new PassThroughInboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.IdempotentReceiverRouterType_2017 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new IdempotentReceiverRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.WireTapRouterType_2018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new WireTapRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.SelectiveConsumerRouterType_2019 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new SelectiveConsumerRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.MessageChunkingAggregatorRouterType_2020 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new ChunkingInboundRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.SelectiveConsumerRouterType_2021 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new CorrelationResequencerRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.CustomCorrelationAggregatorRouterType_2022 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new CustomCorrelationAggregatorRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.CustomInboundRouterType_2023 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundRouter());
			}
			return getGEFWrapper(new CustomInboundRouterTypeCreateCommand(req));
		}
		for (Extension extension : extensions) {
			Command cmd = extension.getCreateCommandX(req);
			if (cmd != null) {
				return cmd;
			}
		}
		return super.getCreateCommand(req);
	}

	public interface Extension {
		Command getCreateCommandX(CreateElementRequest req);
	}
}
