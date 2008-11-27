package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;

/**
 * customization
 */
public class DefaultConnectorExceptionStrategyTypeCreateCommand extends
		CoreElementCreateCommand {

	/**
	 * @generated
	 */
	public DefaultConnectorExceptionStrategyTypeCreateCommand(
			CreateElementRequest req) {
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
		if (container.getAbstractExceptionStrategy() != null) {
			return false;
		}
		return true;
	}

	@Override
	protected EReference getContainmentReference() {
		return CorePackage.eINSTANCE
				.getDocumentRoot_DefaultConnectorExceptionStrategy();
	}
}
