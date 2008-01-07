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
 * A representation of the model object '<em><b>Custom Outbound Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.CustomOutboundRouterType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.CustomOutboundRouterType#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getCustomOutboundRouterType()
 * @model extendedMetaData="name='customOutboundRouterType' kind='elementOnly'"
 * @generated
 */
public interface CustomOutboundRouterType extends FilteringOutboundRouterType {
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
	 * @see org.mule.ide.config.core.CorePackage#getCustomOutboundRouterType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='http://www.springframework.org/schema/beans'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getCustomOutboundRouterType_Class()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass" required="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.CustomOutboundRouterType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

} // CustomOutboundRouterType
