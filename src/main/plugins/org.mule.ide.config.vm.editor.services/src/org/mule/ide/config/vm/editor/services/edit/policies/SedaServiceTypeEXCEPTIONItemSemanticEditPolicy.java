package org.mule.ide.config.vm.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.vm.editor.services.edit.commands.ExceptionStrategyTypeCreateCommand;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;

/**
 * @generated
 */
public class SedaServiceTypeEXCEPTIONItemSemanticEditPolicy extends
		VMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (VMElementTypes.ExceptionStrategyType_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractExceptionStrategy());
			}
			return getGEFWrapper(new ExceptionStrategyTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
