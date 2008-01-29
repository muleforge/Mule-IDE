package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.OutboundEndpointTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class DefaultConnectorExceptionStrategyTypeENDPOINTSItemSemanticEditPolicy
		extends CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.OutboundEndpointType_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getExceptionStrategyType_AbstractOutboundEndpoint());
			}
			return getGEFWrapper(new OutboundEndpointTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}