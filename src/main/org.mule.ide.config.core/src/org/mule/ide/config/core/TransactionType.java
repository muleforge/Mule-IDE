/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.TransactionType#getAbstractTransactionFactoryGroup <em>Abstract Transaction Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TransactionType#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TransactionType#getTransactionFactory <em>Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TransactionType#getAction <em>Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TransactionType#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTransactionType()
 * @model extendedMetaData="name='transactionType' kind='elementOnly'"
 * @generated
 */
public interface TransactionType extends AbstractTransactionType {
	/**
	 * Returns the value of the '<em><b>Abstract Transaction Factory Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Factory Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Factory Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getTransactionType_AbstractTransactionFactoryGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-transaction-factory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractTransactionFactoryGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Factory</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getTransactionType_AbstractTransactionFactory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction-factory' namespace='##targetNamespace' group='abstract-transaction-factory:group'"
	 * @generated
	 */
	AbstractTransactionFactoryType getAbstractTransactionFactory();

	/**
	 * Returns the value of the '<em><b>Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Factory</em>' containment reference.
	 * @see #setTransactionFactory(TransactionRefFactoryType)
	 * @see org.mule.ide.config.core.CorePackage#getTransactionType_TransactionFactory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transaction-factory' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionRefFactoryType getTransactionFactory();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TransactionType#getTransactionFactory <em>Transaction Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Factory</em>' containment reference.
	 * @see #getTransactionFactory()
	 * @generated
	 */
	void setTransactionFactory(TransactionRefFactoryType value);

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
	 * @see org.mule.ide.config.core.CorePackage#getTransactionType_Action()
	 * @model default="NONE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='action'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TransactionType#getAction <em>Action</em>}' attribute.
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
	 * Unsets the value of the '{@link org.mule.ide.config.core.TransactionType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(ActionType)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.TransactionType#getAction <em>Action</em>}' attribute is set.
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
	 * @see org.mule.ide.config.core.CorePackage#getTransactionType_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TransactionType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

} // TransactionType
