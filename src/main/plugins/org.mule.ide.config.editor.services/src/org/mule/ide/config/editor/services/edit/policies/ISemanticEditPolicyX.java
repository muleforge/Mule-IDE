package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

public interface ISemanticEditPolicyX {

	/**
	 * Provides public access to the getCreateCommand
	 * of a policy extender.
	 * 
	 * @param req
	 * @return
	 */
	Command getCreateCommandX(CreateElementRequest req);
	
}
