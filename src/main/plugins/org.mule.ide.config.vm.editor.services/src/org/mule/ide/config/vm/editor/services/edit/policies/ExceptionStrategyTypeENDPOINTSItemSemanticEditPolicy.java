package org.mule.ide.config.vm.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.policies.ISemanticEditPolicyX;
import org.mule.ide.config.vm.editor.services.edit.commands.OutboundEndpointTypeCreateCommand;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;

/**
 * @generated
 */
public class ExceptionStrategyTypeENDPOINTSItemSemanticEditPolicy extends
		VMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (VMElementTypes.OutboundEndpointType_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getExceptionStrategyType_AbstractOutboundEndpoint());
			}
			return getGEFWrapper(new OutboundEndpointTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
