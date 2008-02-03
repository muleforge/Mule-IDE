/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.Connection#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link org.mule.ide.config.core.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see org.mule.ide.config.core.CorePackage#getConnection_Endpoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.Connection#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SedaServiceType)
	 * @see org.mule.ide.config.core.CorePackage#getConnection_Source()
	 * @model transient="true"
	 * @generated
	 */
	SedaServiceType getSource();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SedaServiceType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SedaServiceType)
	 * @see org.mule.ide.config.core.CorePackage#getConnection_Target()
	 * @model transient="true"
	 * @generated
	 */
	SedaServiceType getTarget();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SedaServiceType value);

} // Connection
