package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.ResponseEndpointServiceItemTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class ResponseRouterCollectionTypeRESPONSEENDPOINTSItemSemanticEditPolicy
		extends CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.ResponseEndpointType_2026 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getResponseRouterCollectionType_AbstractResponseEndpoint());
			}
			return getGEFWrapper(new ResponseEndpointServiceItemTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
