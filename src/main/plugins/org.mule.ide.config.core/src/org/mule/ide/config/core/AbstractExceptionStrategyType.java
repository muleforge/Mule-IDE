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
 * A representation of the model object '<em><b>Abstract Exception Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractExceptionStrategyType#getCommitTransaction <em>Commit Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractExceptionStrategyType#getRollbackTransaction <em>Rollback Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractExceptionStrategyType#isEnableNotifications <em>Enable Notifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractExceptionStrategyType()
 * @model extendedMetaData="name='abstractExceptionStrategyType' kind='elementOnly'"
 * @generated
 */
public interface AbstractExceptionStrategyType extends EObject {

	/**
	 * Returns the value of the '<em><b>Commit Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines when a current transaction gets rolled-back depending on the name of the
	 *                         exception caught. Users can set a comma delimited list of wildcard patterns that wil be matched
	 *                         angainst the fully qualified classname of the current exception. Patterns defined for this
	 *                         element will leave the current transaction (if any) untouched and llow it to be committed.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commit Transaction</em>' containment reference.
	 * @see #setCommitTransaction(ExceptionPatternType)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractExceptionStrategyType_CommitTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commit-transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionPatternType getCommitTransaction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#getCommitTransaction <em>Commit Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Transaction</em>' containment reference.
	 * @see #getCommitTransaction()
	 * @generated
	 */
	void setCommitTransaction(ExceptionPatternType value);

	/**
	 * Returns the value of the '<em><b>Rollback Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines when a current transaction gets rolled-back depending on the name of the
	 *                         exception caught. Users can set a comma delimited list of wildcard patterns that wil be matched
	 *                         angainst the fully qualified classname of the current exception. Patterns defined for this
	 *                         element will rollback the current transaction (if any).
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rollback Transaction</em>' containment reference.
	 * @see #setRollbackTransaction(ExceptionPatternType)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractExceptionStrategyType_RollbackTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollback-transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionPatternType getRollbackTransaction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#getRollbackTransaction <em>Rollback Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback Transaction</em>' containment reference.
	 * @see #getRollbackTransaction()
	 * @generated
	 */
	void setRollbackTransaction(ExceptionPatternType value);

	/**
	 * Returns the value of the '<em><b>Enable Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether ExceptionNotifications wil be fired from this strategy when an
	 *                     exception occurs.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Notifications</em>' attribute.
	 * @see #isSetEnableNotifications()
	 * @see #unsetEnableNotifications()
	 * @see #setEnableNotifications(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractExceptionStrategyType_EnableNotifications()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='enableNotifications'"
	 * @generated
	 */
	boolean isEnableNotifications();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#isEnableNotifications <em>Enable Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Notifications</em>' attribute.
	 * @see #isSetEnableNotifications()
	 * @see #unsetEnableNotifications()
	 * @see #isEnableNotifications()
	 * @generated
	 */
	void setEnableNotifications(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#isEnableNotifications <em>Enable Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableNotifications()
	 * @see #isEnableNotifications()
	 * @see #setEnableNotifications(boolean)
	 * @generated
	 */
	void unsetEnableNotifications();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#isEnableNotifications <em>Enable Notifications</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Notifications</em>' attribute is set.
	 * @see #unsetEnableNotifications()
	 * @see #isEnableNotifications()
	 * @see #setEnableNotifications(boolean)
	 * @generated
	 */
	boolean isSetEnableNotifications();
} // AbstractExceptionStrategyType
