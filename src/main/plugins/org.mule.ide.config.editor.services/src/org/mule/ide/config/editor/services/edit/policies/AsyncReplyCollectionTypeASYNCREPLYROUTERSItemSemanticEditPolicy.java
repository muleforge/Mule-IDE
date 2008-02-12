package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.AsyncReplyInboundEndpointServiceItemTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.AsyncReplyRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.CustomAsyncReplyRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class AsyncReplyCollectionTypeASYNCREPLYROUTERSItemSemanticEditPolicy
		extends CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.InboundEndpointType_2025 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getAsyncReplyCollectionType_AbstractInboundEndpoint());
			}
			return getGEFWrapper(new AsyncReplyInboundEndpointServiceItemTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.AsyncReplyRouterType_2026 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getAsyncReplyCollectionType_AbstractAsyncReplyRouter());
			}
			return getGEFWrapper(new AsyncReplyRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.CustomAsyncReplyRouterType_2027 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getAsyncReplyCollectionType_AbstractAsyncReplyRouter());
			}
			return getGEFWrapper(new CustomAsyncReplyRouterTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
