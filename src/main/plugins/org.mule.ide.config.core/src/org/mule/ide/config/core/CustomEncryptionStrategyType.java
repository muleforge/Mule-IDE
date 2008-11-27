/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.mule.ide.config.spring.PropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Encryption Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.CustomEncryptionStrategyType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.CustomEncryptionStrategyType#getStrategyRef <em>Strategy Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getCustomEncryptionStrategyType()
 * @model extendedMetaData="name='customEncryptionStrategyType' kind='elementOnly'"
 * @generated
 */
public interface CustomEncryptionStrategyType extends EncryptionStrategyType {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Bean definitions can have zero or more properties.
	 * 	Property elements correspond to JavaBean setter methods exposed
	 * 	by the bean classes. Spring supports primitives, references to other
	 * 	beans in the same or related factories, lists, maps and properties.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getCustomEncryptionStrategyType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='http://www.springframework.org/schema/beans'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             A reference to the encryption strategy (which may be a Spring bean that
	 *                             implements the EncryptionStrategy interface).
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Ref</em>' attribute.
	 * @see #setStrategyRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getCustomEncryptionStrategyType_StrategyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='strategy-ref'"
	 * @generated
	 */
	String getStrategyRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.CustomEncryptionStrategyType#getStrategyRef <em>Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Ref</em>' attribute.
	 * @see #getStrategyRef()
	 * @generated
	 */
	void setStrategyRef(String value);

} // CustomEncryptionStrategyType
