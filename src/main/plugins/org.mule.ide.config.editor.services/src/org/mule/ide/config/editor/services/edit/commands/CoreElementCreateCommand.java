package org.mule.ide.config.editor.services.edit.commands;

import java.io.ObjectInputStream.GetField;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.emf.core.internal.util.Util;
import org.eclipse.gmf.runtime.emf.core.resources.IResourceHelper;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

public abstract class CoreElementCreateCommand extends CreateElementCommand {

	public CoreElementCreateCommand(CreateElementRequest req) {
		super(req);
	}
	
	/**
	 * Gets a FeatureMap in the container for this element
	 * if there is one.
	 * 
	 * @return
	 */
	protected FeatureMap getContainmentFeatureMap() {
		EReference containmentFeature = ((CreateElementRequest) getRequest()).getContainmentFeature();
		if (containmentFeature != null) {
			EStructuralFeature featureMapAttrib;
			featureMapAttrib = ExtendedMetaData.INSTANCE.getGroup(containmentFeature);
			if (featureMapAttrib != null) {
				EObject container = getElementToEdit();
				if (container != null) {
					Object o = container.eGet(featureMapAttrib);
					if (o != null && o instanceof FeatureMap) {
						return (FeatureMap) o;
					}
				}
			}
		}
		return null;
	}

	private EClass containerEClass = null;
	
	/**
	 * Need to cache to avoid infinite recursion.
	 * 
	 */
	protected EClass getEClassToEdit() {
		if (containerEClass == null) {
			containerEClass = super.getEClassToEdit();
		}
		return containerEClass;
	}
	
	/**
	 * Override to do special handling needed for adding a member
	 * of a substitution group.
	 */
	protected EObject doDefaultElementCreation() {
		FeatureMap map = getContainmentFeatureMap();
		if (map != null) {
			return doSubstitutionElementCreation(map);
		} else {
			return super.doDefaultElementCreation();
		}
	}
	
	protected EObject doSubstitutionElementCreation(FeatureMap map) {
		EClass eClass = getElementType().getEClass();
		EObject container = getElementToEdit();
		IResourceHelper helper = Util.getHelper(container.eResource());
		EObject element;
		if (helper != null) {
			element = helper.create(eClass);
		} else {
			element = eClass.getEPackage().getEFactoryInstance().create(eClass);
		}
		map.add(getContainmentReference(), element);
		return element;
	}
	
	protected abstract EReference getContainmentReference();
}
