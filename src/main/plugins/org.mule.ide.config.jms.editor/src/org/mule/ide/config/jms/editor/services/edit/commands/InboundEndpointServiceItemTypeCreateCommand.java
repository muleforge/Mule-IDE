package org.mule.ide.config.jms.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.editor.services.edit.commands.CoreElementCreateCommand;

/**
 * @generated
 */
public class InboundEndpointServiceItemTypeCreateCommand extends
		CoreElementCreateCommand {

	/**
	 * @generated
	 */
	public InboundEndpointServiceItemTypeCreateCommand(CreateElementRequest req) {
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
		return JMSPackage.eINSTANCE.getDocumentRoot_InboundEndpoint();
	}
}
