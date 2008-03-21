/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 A factory which will be used by Mule to create new instances of this object
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractObjectFactoryType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractObjectFactoryType#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractObjectFactoryType()
 * @model extendedMetaData="name='abstractObjectFactoryType' kind='elementOnly'"
 * @generated
 */
public interface AbstractObjectFactoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Set a Mule property.
	 *                         This is a name/value pair that can be set on components, services, etc,
	 *                         and which provide a generic way of configuring the system.
	 *                         In Mule v2 you typically shouldn't need to use a generic property like
	 *                         this, since almost all functionality is exposed via dedicated elements.
	 *                         However, it can be useful in configuring obscure or overlooked options
	 *                         and in configuring transports from the generic endpoint elements.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractObjectFactoryType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeyValueType> getProperty();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Set Mule properties.
	 *                 These are name/value pairs that can be set on components, services, etc,
	 *                 and which provide a generic way of configuring the system.
	 *                 In Mule v2 you typically shouldn't need to use generic properties like
	 *                 this, since almost all functionality is exposed via dedicated elements.
	 *                 However, they can be useful in configuring obscure or overlooked options
	 *                 and in configuring transports from the generic endpoint elements.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractObjectFactoryType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractObjectFactoryType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(MapType value);

} // AbstractObjectFactoryType
