/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soap Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.SoapServiceType#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.axis.AxisPackage#getSoapServiceType()
 * @model extendedMetaData="name='soap-service_._type' kind='empty'"
 * @generated
 */
public interface SoapServiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getSoapServiceType_Interface()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='interface'"
	 * @generated
	 */
	String getInterface();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.SoapServiceType#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(String value);

} // SoapServiceType
