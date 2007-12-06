package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.internal.util.Util;
import org.eclipse.gmf.runtime.emf.core.resources.IResourceHelper;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

public abstract class SubstitutionElementCreateCommand extends CreateElementCommand {

	public SubstitutionElementCreateCommand(CreateElementRequest req) {
		super(req);
	}
	
	/**
	 * Override to do special handling needed for adding a member
	 * of a substitution group.
	 */
	protected EObject doDefaultElementCreation() {
		EClass eClass = getElementType().getEClass();

		EObject container = getElementToEdit();
		
		assert(container != null);  // should we just return null?

		EObject element = null;

		IResourceHelper helper = Util.getHelper(container.eResource());

		if (helper != null) {

			element = helper.create(eClass);

		} else {
			element = eClass.getEPackage().getEFactoryInstance().create(eClass);
		}

		addSubstitutionElementReference(container, element);

		return element;
	}
	
	//FeatureMap map = ((AbstractModelType) container)
	//		.getAbstractServiceGroup();
	//map.add(CorePackage.eINSTANCE.getDocumentRoot_Service(), element);
	protected abstract void addSubstitutionElementReference(EObject container, EObject element);
	
}
