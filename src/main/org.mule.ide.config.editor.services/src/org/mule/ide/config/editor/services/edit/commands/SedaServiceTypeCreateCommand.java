package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.emf.core.internal.util.Util;
import org.eclipse.gmf.runtime.emf.core.resources.IResourceHelper;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.CorePackage;

/**
 * @generated
 */
public class SedaServiceTypeCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public SedaServiceTypeCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * Override to do special handling needed for adding a member
	 * of a substitution group.
	 */
	protected EObject doDefaultElementCreation() {
		EClass eClass = getElementType().getEClass();

		EObject element = getElementToEdit();

		if (element != null)
			return createSubstitutionElement(element, eClass);

		return null;	
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
		return CorePackage.eINSTANCE.getAbstractModelType();
	}
	
	private EObject createSubstitutionElement(EObject container, EClass eClass) {

		EObject result = null;

		IResourceHelper helper = Util.getHelper(container.eResource());
		
		if (helper != null) {

			result = helper.create(eClass);

		} else {
			result = eClass.getEPackage().getEFactoryInstance().create(eClass);
		}
		
		FeatureMap map = ((AbstractModelType) container).getAbstractServiceGroup();
		map.add(CorePackage.eINSTANCE.getDocumentRoot_Service(), result);
		
		return result;
	}
}
