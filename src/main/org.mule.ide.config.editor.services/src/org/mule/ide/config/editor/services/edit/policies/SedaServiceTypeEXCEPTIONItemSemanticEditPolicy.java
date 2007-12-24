package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.CustomExceptionStrategyTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.DefaultConnectorExceptionStrategyTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.DefaultServiceExceptionStrategyTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class SedaServiceTypeEXCEPTIONItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.ExceptionStrategyType_2014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractExceptionStrategy());
			}
			return getGEFWrapper(new DefaultServiceExceptionStrategyTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.ExceptionStrategyType_2016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractExceptionStrategy());
			}
			return getGEFWrapper(new DefaultConnectorExceptionStrategyTypeCreateCommand(
					req));
		}
		if (CoreElementTypes.CustomExceptionStrategyType_2017 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractExceptionStrategy());
			}
			return getGEFWrapper(new CustomExceptionStrategyTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
