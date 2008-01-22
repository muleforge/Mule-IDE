package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;

/**
 * customization
 *   - subclass SubstitutionElementCreateCommand
 */
public class NoArgsCallComponentTypeCreateCommand extends
		SubstitutionElementCreateCommand {

	/**
	 * @generated
	 */
	public NoArgsCallComponentTypeCreateCommand(CreateElementRequest req) {
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
		if (container.getAbstractComponent() != null) {
			return false;
		}
		return true;
	}

	@Override
	protected void addSubstitutionElementReference(EObject container,
			EObject element) {
		FeatureMap map = ((BaseServiceType) container)
				.getAbstractComponentGroup();
		map.add(CorePackage.eINSTANCE.getDocumentRoot_NoArgsCallComponent(),
				element);
	}
}