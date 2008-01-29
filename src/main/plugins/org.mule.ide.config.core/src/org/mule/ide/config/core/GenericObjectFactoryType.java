/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType()
 * @model extendedMetaData="name='genericObjectFactoryType' kind='elementOnly'"
 * @generated
 */
public interface GenericObjectFactoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Object Factory Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Object Factory Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Factory Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_AbstractObjectFactoryGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='abstract-object-factory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractObjectFactoryGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Object Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Factory</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_AbstractObjectFactory()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-object-factory' namespace='##targetNamespace' group='abstract-object-factory:group'"
	 * @generated
	 */
	AbstractObjectFactoryType getAbstractObjectFactory();

} // GenericObjectFactoryType
