package org.mule.ide.config.core;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * A provider of of global element types that
 * can be added to a mule element.
 *  
 * For now, each "mule namespace" EPackage
 * should implement this interface to expose types 
 * that are derived from core abstract base types
 * and have a element definition.
 * 
 * It is anticipated that this provider will eventually
 * become part of an extension point which supports associating 
 * configuration wizard pages with each type.  When
 * this is implemented, we can remove the interface from
 * the EPackages.
 */
public interface IGlobalElementTypeProvider {
	
	List<IGlobalElementType> getConnectorTypes();
	List<IGlobalElementType> getEndpointTypes();
	List<IGlobalElementType> getFilterTypes();
	List<IGlobalElementType> getTransformerTypes();

	interface IGlobalElementType {
		/**
		 * The EClass for this element.
		 * 
		 * @return
		 */
		EClass getEClass();
		/**
		 * The DocumentRoot EReference for this element.
		 * Currently this is needed to add elements to a 
		 * substitution group FeatureMap.
		 * 
		 * @return
		 */
		EReference getDocumentRootReference();
		/**
		 * Create an instance of the type with the given name.
		 * Caller will add the new element to a mule element.
		 * 
		 * @param name
		 * @return
		 */
		EObject create(String name);
	}
	
}
