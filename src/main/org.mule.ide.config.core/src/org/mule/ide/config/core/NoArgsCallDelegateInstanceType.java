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
 * A representation of the model object '<em><b>No Args Call Delegate Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateInstanceRef <em>Delegate Instance Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateMethod <em>Delegate Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallDelegateInstanceType()
 * @model extendedMetaData="name='noArgsCallDelegateInstanceType' kind='empty'"
 * @generated
 */
public interface NoArgsCallDelegateInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Delegate Instance Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Instance Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Instance Ref</em>' attribute.
	 * @see #setDelegateInstanceRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallDelegateInstanceType_DelegateInstanceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='delegateInstance-ref'"
	 * @generated
	 */
	String getDelegateInstanceRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateInstanceRef <em>Delegate Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Instance Ref</em>' attribute.
	 * @see #getDelegateInstanceRef()
	 * @generated
	 */
	void setDelegateInstanceRef(String value);

	/**
	 * Returns the value of the '<em><b>Delegate Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Method</em>' attribute.
	 * @see #setDelegateMethod(String)
	 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallDelegateInstanceType_DelegateMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='delegateMethod'"
	 * @generated
	 */
	String getDelegateMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateMethod <em>Delegate Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Method</em>' attribute.
	 * @see #getDelegateMethod()
	 * @generated
	 */
	void setDelegateMethod(String value);

} // NoArgsCallDelegateInstanceType
