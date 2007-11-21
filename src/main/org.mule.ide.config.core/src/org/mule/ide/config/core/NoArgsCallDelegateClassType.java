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
 * A representation of the model object '<em><b>No Args Call Delegate Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateClass <em>Delegate Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateMethod <em>Delegate Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallDelegateClassType()
 * @model extendedMetaData="name='noArgsCallDelegateClassType' kind='empty'"
 * @generated
 */
public interface NoArgsCallDelegateClassType extends EObject {
	/**
	 * Returns the value of the '<em><b>Delegate Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Class</em>' attribute.
	 * @see #setDelegateClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallDelegateClassType_DelegateClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='delegateClass'"
	 * @generated
	 */
	String getDelegateClass();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateClass <em>Delegate Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Class</em>' attribute.
	 * @see #getDelegateClass()
	 * @generated
	 */
	void setDelegateClass(String value);

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
	 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallDelegateClassType_DelegateMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='delegateMethod'"
	 * @generated
	 */
	String getDelegateMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateMethod <em>Delegate Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Method</em>' attribute.
	 * @see #getDelegateMethod()
	 * @generated
	 */
	void setDelegateMethod(String value);

} // NoArgsCallDelegateClassType
