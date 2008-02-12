package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.CorePackage;

/**
 * customization
 *   - subclass SubstitutionElementCreateCommand
 */
public class AsyncReplyInboundEndpointServiceItemTypeCreateCommand extends
		SubstitutionElementCreateCommand {

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
	protected void addSubstitutionElementReference(EObject container,
			EObject element) {
		FeatureMap map = ((AsyncReplyCollectionType) container)
				.getAbstractInboundEndpointGroup();
		map.add(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint(),
				element);
	}
}
