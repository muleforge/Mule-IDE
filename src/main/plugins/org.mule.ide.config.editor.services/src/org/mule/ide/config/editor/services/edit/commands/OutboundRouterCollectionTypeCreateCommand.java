package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;

/**
 * @generated
 */
public class OutboundRouterCollectionTypeCreateCommand extends
		CreateElementCommand {

	/**
	 * @generated
	 */
	public OutboundRouterCollectionTypeCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return CorePackage.eINSTANCE.getBaseServiceType();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		BaseServiceType container = (BaseServiceType) getElementToEdit();
		if (container.getOutbound() != null) {
			return false;
		}
		return true;
	}
}
