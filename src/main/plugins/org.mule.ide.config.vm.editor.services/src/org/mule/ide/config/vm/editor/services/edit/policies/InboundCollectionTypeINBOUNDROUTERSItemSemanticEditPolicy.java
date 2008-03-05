package org.mule.ide.config.vm.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.vm.editor.services.edit.commands.InboundEndpointServiceItemTypeCreateCommand;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;

/**
 * customization
 */
public class InboundCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy extends
		VMBaseItemSemanticEditPolicy
		implements
		org.mule.ide.config.editor.services.edit.policies.InboundCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy.Extension {

	public Command getCreateCommandX(CreateElementRequest req) {
		return getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (VMElementTypes.InboundEndpointType_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getInboundCollectionType_AbstractInboundEndpoint());
			}
			return getGEFWrapper(new InboundEndpointServiceItemTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}