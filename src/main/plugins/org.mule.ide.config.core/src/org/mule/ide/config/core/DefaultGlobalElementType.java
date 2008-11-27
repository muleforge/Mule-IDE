package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.mule.ide.config.core.IGlobalElementTypeProvider.IGlobalElementType;

public class DefaultGlobalElementType implements IGlobalElementType {
	
	private EClass eClass;
	private EReference eRef;
	private String label;

	public DefaultGlobalElementType(EClass eClass, EReference eRef) {
		this.eClass = eClass;
		this.eRef = eRef;
	}
	
	public EObject create(String name) {
		EObject result = eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (name != null && name.length() > 0) {
			if (result instanceof AbstractConnectorType) {
				((AbstractConnectorType) result).setName(name);
			} else if (result instanceof AbstractGlobalEndpointType) {
				((AbstractGlobalEndpointType) result).setName(name);
			} else if (result instanceof AbstractFilterType) {
				((AbstractFilterType) result).setName(name);
			} else if (result instanceof AbstractTransformerType) {
				((AbstractTransformerType) result).setName(name);
			}
		}
		return result;
	}

	public EReference getDocumentRootReference() {
		return eRef;
	}

	public EClass getEClass() {
		return eClass;
	}

}
