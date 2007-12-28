package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.ChainingOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.ChunkingRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CustomOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.EndpointSelectorRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.ExceptionOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.FilteringOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.MessageSplitterOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.MulticastingOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.PassThroughOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.StaticRecipientListRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.TemplateEndpointOutboundRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class OutboundRouterCollectionTypeOUTBOUNDROUTERSItemSemanticEditPolicy
		extends CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.OutboundRouterType_2030 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new PassThroughOutboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.FilteringOutboundRouterType_2031 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new FilteringOutboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.FilteringOutboundRouterType_2032 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new ChainingOutboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.FilteringOutboundRouterType_2033 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new ExceptionOutboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.FilteringOutboundRouterType_2034 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new MulticastingOutboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.FilteringOutboundRouterType_2035 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new TemplateEndpointOutboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.EndpointSelectorRouterType_2036 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new EndpointSelectorRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.MessageSplitterOutboundRouterType_2037 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new MessageSplitterOutboundRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.ChunkingRouterType_2038 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new ChunkingRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.StaticRecipientListRouterType_2039 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new StaticRecipientListRouterTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.CustomOutboundRouterType_2040 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getOutboundRouterCollectionType_AbstractOutboundRouter());
			}
			return getGEFWrapper(new CustomOutboundRouterTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
