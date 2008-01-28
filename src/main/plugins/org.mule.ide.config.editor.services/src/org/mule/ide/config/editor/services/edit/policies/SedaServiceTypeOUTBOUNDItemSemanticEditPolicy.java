package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.OutboundRouterCollectionTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class SedaServiceTypeOUTBOUNDItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.OutboundRouterCollectionType_2029 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_OutboundRouter());
			}
			return getGEFWrapper(new OutboundRouterCollectionTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
