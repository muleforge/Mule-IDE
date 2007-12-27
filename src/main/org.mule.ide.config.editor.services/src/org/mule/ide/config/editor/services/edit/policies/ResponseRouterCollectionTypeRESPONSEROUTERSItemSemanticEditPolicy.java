package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.CustomResponseRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.ResponseRouterTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class ResponseRouterCollectionTypeRESPONSEROUTERSItemSemanticEditPolicy
		extends CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.ResponseRouterType_2027 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getResponseRouterCollectionType_AbstractResponseRouter());
			}
			return getGEFWrapper(new ResponseRouterTypeCreateCommand(req));
		}
		if (CoreElementTypes.CustomResponseRouterType_2028 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(CorePackage.eINSTANCE
								.getResponseRouterCollectionType_AbstractResponseRouter());
			}
			return getGEFWrapper(new CustomResponseRouterTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
