package org.mule.ide.config.axis.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.axis.editor.services.edit.commands.OutboundEndpointTypeCreateCommand;
import org.mule.ide.config.axis.editor.services.providers.AxisElementTypes;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.policies.ISemanticEditPolicyX;

/**
 * @generated
 */
public class AxisOutboundEndpointContainerSemanticEditPolicy extends
		AxisBaseItemSemanticEditPolicy implements ISemanticEditPolicyX {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AxisElementTypes.OutboundEndpointType_2004 == req.getElementType()) {
			return getGEFWrapper(new OutboundEndpointTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	public Command getCreateCommandX(CreateElementRequest req) {
		return getCreateCommand(req);
	}

}
