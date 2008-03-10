package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.CorePackage;

/**
 * customization
 *   - subclass CoreElementCreateCommand
 */
public class AsyncReplyInboundEndpointServiceItemTypeCreateCommand extends
		CoreElementCreateCommand {

	/**
	 * @generated
	 */
	public AsyncReplyInboundEndpointServiceItemTypeCreateCommand(
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
		return CorePackage.eINSTANCE.getAsyncReplyCollectionType();
	}

	@Override
	protected EReference getContainmentReference() {
		return CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint();
	}
}
