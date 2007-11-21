/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.spring.PropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mule Admin Agent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MuleAdminAgentType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleAdminAgentType#getServerUri <em>Server Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getMuleAdminAgentType()
 * @model extendedMetaData="name='muleAdminAgentType' kind='elementOnly'"
 * @generated
 */
public interface MuleAdminAgentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
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
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see org.mule.ide.config.core.CorePackage#getMuleAdminAgentType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='http://www.springframework.org/schema/beans'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleAdminAgentType#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Uri</em>' attribute.
	 * @see #setServerUri(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleAdminAgentType_ServerUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serverUri'"
	 * @generated
	 */
	String getServerUri();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleAdminAgentType#getServerUri <em>Server Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Uri</em>' attribute.
	 * @see #getServerUri()
	 * @generated
	 */
	void setServerUri(String value);

} // MuleAdminAgentType
