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
 * A representation of the model object '<em><b>Abstract Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractTransactionType#getAction <em>Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractTransactionType#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractTransactionType()
 * @model extendedMetaData="name='abstractTransactionType' kind='empty'"
 * @generated
 */
public interface AbstractTransactionType extends EObject {

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.mule.ide.config.core.ActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(ActionType)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractTransactionType_Action()
	 * @model default="NONE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='action'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractTransactionType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.mule.ide.config.core.ActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AbstractTransactionType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(ActionType)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AbstractTransactionType#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(ActionType)
	 * @generated
	 */
	boolean isSetAction();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractTransactionType_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractTransactionType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);
} // AbstractTransactionType
