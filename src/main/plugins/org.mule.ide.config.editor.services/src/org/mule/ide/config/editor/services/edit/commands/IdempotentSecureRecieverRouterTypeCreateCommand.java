package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundCollectionType;

/**
 * customization
 *   - subclass SubstitutionElementCreateCommand
 */
public class IdempotentSecureRecieverRouterTypeCreateCommand extends
		SubstitutionElementCreateCommand {

	/**
	 * @generated
	 */
	public IdempotentSecureRecieverRouterTypeCreateCommand(
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
		return CorePackage.eINSTANCE.getInboundCollectionType();
	}

	@Override
	protected void addSubstitutionElementReference(EObject container,
			EObject element) {
		FeatureMap map = ((InboundCollectionType) container)
				.getAbstractInboundRouterGroup();
		map.add(CorePackage.eINSTANCE
				.getDocumentRoot_IdempotentSecureHashReceiverRouter(), element);
	}
}
