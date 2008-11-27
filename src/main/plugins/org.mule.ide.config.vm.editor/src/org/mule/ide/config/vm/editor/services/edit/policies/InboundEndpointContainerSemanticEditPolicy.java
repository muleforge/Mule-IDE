package org.mule.ide.config.vm.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.policies.ISemanticEditPolicyX;
import org.mule.ide.config.vm.editor.services.edit.commands.InboundEndpointServiceItemTypeCreateCommand;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;

/**
 * 
 */
public class InboundEndpointContainerSemanticEditPolicy extends
		VMBaseItemSemanticEditPolicy
		implements ISemanticEditPolicyX {

	/**
	 * 
	 */
	public Command getCreateCommandX(CreateElementRequest req) {
		return getCreateCommand(req);
	}

	/**
	 * 
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (VMElementTypes.InboundEndpointType_2002 == req.getElementType()) {
			return getGEFWrapper(new InboundEndpointServiceItemTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
