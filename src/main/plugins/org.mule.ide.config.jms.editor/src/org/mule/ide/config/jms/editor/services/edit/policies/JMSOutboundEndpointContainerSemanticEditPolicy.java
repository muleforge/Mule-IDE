package org.mule.ide.config.jms.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.jms.editor.services.edit.commands.OutboundEndpointTypeCreateCommand;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.policies.ISemanticEditPolicyX;
import org.mule.ide.config.jms.editor.services.providers.JMSElementTypes;

/**
 * @generated
 */
public class JMSOutboundEndpointContainerSemanticEditPolicy extends
		JMSBaseItemSemanticEditPolicy implements ISemanticEditPolicyX {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (JMSElementTypes.OutboundEndpointType_2004 == req.getElementType()) {
			return getGEFWrapper(new OutboundEndpointTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	public Command getCreateCommandX(CreateElementRequest req) {
		return getCreateCommand(req);
	}

}
