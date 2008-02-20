/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soap Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.SoapMethodType#getSoapParameter <em>Soap Parameter</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.SoapMethodType#getSoapReturn <em>Soap Return</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.SoapMethodType#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.axis.AxisPackage#getSoapMethodType()
 * @model extendedMetaData="name='soap-method_._type' kind='elementOnly'"
 * @generated
 */
public interface SoapMethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Soap Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.axis.SoapParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Parameter</em>' containment reference list.
	 * @see org.mule.ide.config.axis.AxisPackage#getSoapMethodType_SoapParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='soap-parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SoapParameterType> getSoapParameter();

	/**
	 * Returns the value of the '<em><b>Soap Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Return</em>' containment reference.
	 * @see #setSoapReturn(SoapReturnType)
	 * @see org.mule.ide.config.axis.AxisPackage#getSoapMethodType_SoapReturn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='soap-return' namespace='##targetNamespace'"
	 * @generated
	 */
	SoapReturnType getSoapReturn();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.SoapMethodType#getSoapReturn <em>Soap Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap Return</em>' containment reference.
	 * @see #getSoapReturn()
	 * @generated
	 */
	void setSoapReturn(SoapReturnType value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getSoapMethodType_Method()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.SoapMethodType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // SoapMethodType
