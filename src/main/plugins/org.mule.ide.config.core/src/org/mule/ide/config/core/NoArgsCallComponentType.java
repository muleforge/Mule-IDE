/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Args Call Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.NoArgsCallComponentType#getDelegateClass <em>Delegate Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NoArgsCallComponentType#getDelegateInstance <em>Delegate Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallComponentType()
 * @model extendedMetaData="name='noArgsCallComponentType' kind='elementOnly'"
 * @generated
 */
public interface NoArgsCallComponentType extends DefaultComponentType {
	/**
	 * Returns the value of the '<em><b>Delegate Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Class</em>' containment reference.
	 * @see #setDelegateClass(NoArgsCallDelegateClassType)
	 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallComponentType_DelegateClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='delegateClass' namespace='##targetNamespace'"
	 * @generated
	 */
	NoArgsCallDelegateClassType getDelegateClass();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NoArgsCallComponentType#getDelegateClass <em>Delegate Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Class</em>' containment reference.
	 * @see #getDelegateClass()
	 * @generated
	 */
	void setDelegateClass(NoArgsCallDelegateClassType value);

	/**
	 * Returns the value of the '<em><b>Delegate Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Instance</em>' containment reference.
	 * @see #setDelegateInstance(NoArgsCallDelegateInstanceType)
	 * @see org.mule.ide.config.core.CorePackage#getNoArgsCallComponentType_DelegateInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='delegateInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	NoArgsCallDelegateInstanceType getDelegateInstance();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NoArgsCallComponentType#getDelegateInstance <em>Delegate Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Instance</em>' containment reference.
	 * @see #getDelegateInstance()
	 * @generated
	 */
	void setDelegateInstance(NoArgsCallDelegateInstanceType value);

} // NoArgsCallComponentType
