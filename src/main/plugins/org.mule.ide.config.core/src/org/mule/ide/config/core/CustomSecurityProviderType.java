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
 * A representation of the model object '<em><b>Custom Security Provider Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.CustomSecurityProviderType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.CustomSecurityProviderType#getProviderRef <em>Provider Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getCustomSecurityProviderType()
 * @model extendedMetaData="name='customSecurityProviderType' kind='elementOnly'"
 * @generated
 */
public interface CustomSecurityProviderType extends SecurityProviderType {
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
	 * @see org.mule.ide.config.core.CorePackage#getCustomSecurityProviderType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='http://www.springframework.org/schema/beans'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Provider Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The name of the security provider to use.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Ref</em>' attribute.
	 * @see #setProviderRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getCustomSecurityProviderType_ProviderRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='provider-ref'"
	 * @generated
	 */
	String getProviderRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.CustomSecurityProviderType#getProviderRef <em>Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Ref</em>' attribute.
	 * @see #getProviderRef()
	 * @generated
	 */
	void setProviderRef(String value);

} // CustomSecurityProviderType
