package org.mule.ide.config.editor.services.edit.commands;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.gmf.runtime.emf.core.internal.util.Util;
import org.eclipse.gmf.runtime.emf.core.resources.IResourceHelper;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.CorePackage;

/**
 * @generated
 */
public class DefaultServiceTypeCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public DefaultServiceTypeCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 *
	 */
	protected EObject doDefaultElementCreation() {
		EClass eClass = getElementType().getEClass();

		EObject element = getElementToEdit();

		if (element != null)
			return create(element, eClass);

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
	
	
	private EObject create(EObject container, EClass eClass) {

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
