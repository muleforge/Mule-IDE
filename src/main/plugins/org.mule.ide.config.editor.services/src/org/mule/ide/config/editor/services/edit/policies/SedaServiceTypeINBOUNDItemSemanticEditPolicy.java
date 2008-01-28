package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.InboundRouterCollectionTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class SedaServiceTypeINBOUNDItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.InboundRouterCollectionType_2013 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_InboundRouter());
			}
			return getGEFWrapper(new InboundRouterCollectionTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
