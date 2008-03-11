package org.mule.ide.config.vm.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.CoreElementCreateCommand;
import org.mule.ide.config.vm.VMPackage;

/**
 * customization
 */
public class OutboundEndpointTypeCreateCommand extends CoreElementCreateCommand {

	/**
	 * @generated
	 */
	public OutboundEndpointTypeCreateCommand(CreateElementRequest req) {
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
	 * customization
	 */
	protected EClass getEClassToEdit() {
		return super.getEClassToEdit();
	}

	@Override
	protected EReference getContainmentReference() {
		return VMPackage.eINSTANCE.getDocumentRoot_OutboundEndpoint();
	}
}
