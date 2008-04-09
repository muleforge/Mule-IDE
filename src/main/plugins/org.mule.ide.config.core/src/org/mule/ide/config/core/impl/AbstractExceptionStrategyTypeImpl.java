/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ExceptionPatternType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Exception Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractExceptionStrategyTypeImpl#getCommitTransaction <em>Commit Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractExceptionStrategyTypeImpl#getRollbackTransaction <em>Rollback Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractExceptionStrategyTypeImpl#isEnableNotifications <em>Enable Notifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractExceptionStrategyTypeImpl extends EObjectImpl implements AbstractExceptionStrategyType {
	/**
	 * The cached value of the '{@link #getCommitTransaction() <em>Commit Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitTransaction()
	 * @generated
	 * @ordered
	 */
	protected ExceptionPatternType commitTransaction;
	/**
	 * The cached value of the '{@link #getRollbackTransaction() <em>Rollback Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollbackTransaction()
	 * @generated
	 * @ordered
	 */
	protected ExceptionPatternType rollbackTransaction;
	/**
	 * The default value of the '{@link #isEnableNotifications() <em>Enable Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableNotifications()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_NOTIFICATIONS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnableNotifications() <em>Enable Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableNotifications()
	 * @generated
	 * @ordered
	 */
	protected boolean enableNotifications = ENABLE_NOTIFICATIONS_EDEFAULT;
	/**
	 * This is true if the Enable Notifications attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableNotificationsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExceptionStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAbstractExceptionStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionPatternType getCommitTransaction() {
		return commitTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitTransaction(ExceptionPatternType newCommitTransaction, NotificationChain msgs) {
		ExceptionPatternType oldCommitTransaction = commitTransaction;
		commitTransaction = newCommitTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION, oldCommitTransaction, newCommitTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitTransaction(ExceptionPatternType newCommitTransaction) {
		if (newCommitTransaction != commitTransaction) {
			NotificationChain msgs = null;
			if (commitTransaction != null)
				msgs = ((InternalEObject)commitTransaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION, null, msgs);
			if (newCommitTransaction != null)
				msgs = ((InternalEObject)newCommitTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION, null, msgs);
			msgs = basicSetCommitTransaction(newCommitTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION, newCommitTransaction, newCommitTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionPatternType getRollbackTransaction() {
		return rollbackTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollbackTransaction(ExceptionPatternType newRollbackTransaction, NotificationChain msgs) {
		ExceptionPatternType oldRollbackTransaction = rollbackTransaction;
		rollbackTransaction = newRollbackTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION, oldRollbackTransaction, newRollbackTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollbackTransaction(ExceptionPatternType newRollbackTransaction) {
		if (newRollbackTransaction != rollbackTransaction) {
			NotificationChain msgs = null;
			if (rollbackTransaction != null)
				msgs = ((InternalEObject)rollbackTransaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION, null, msgs);
			if (newRollbackTransaction != null)
				msgs = ((InternalEObject)newRollbackTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION, null, msgs);
			msgs = basicSetRollbackTransaction(newRollbackTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION, newRollbackTransaction, newRollbackTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableNotifications() {
		return enableNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableNotifications(boolean newEnableNotifications) {
		boolean oldEnableNotifications = enableNotifications;
		enableNotifications = newEnableNotifications;
		boolean oldEnableNotificationsESet = enableNotificationsESet;
		enableNotificationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS, oldEnableNotifications, enableNotifications, !oldEnableNotificationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableNotifications() {
		boolean oldEnableNotifications = enableNotifications;
		boolean oldEnableNotificationsESet = enableNotificationsESet;
		enableNotifications = ENABLE_NOTIFICATIONS_EDEFAULT;
		enableNotificationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS, oldEnableNotifications, ENABLE_NOTIFICATIONS_EDEFAULT, oldEnableNotificationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableNotifications() {
		return enableNotificationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION:
				return basicSetCommitTransaction(null, msgs);
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION:
				return basicSetRollbackTransaction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION:
				return getCommitTransaction();
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION:
				return getRollbackTransaction();
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS:
				return isEnableNotifications() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION:
				setCommitTransaction((ExceptionPatternType)newValue);
				return;
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION:
				setRollbackTransaction((ExceptionPatternType)newValue);
				return;
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS:
				setEnableNotifications(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION:
				setCommitTransaction((ExceptionPatternType)null);
				return;
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION:
				setRollbackTransaction((ExceptionPatternType)null);
				return;
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS:
				unsetEnableNotifications();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION:
				return commitTransaction != null;
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION:
				return rollbackTransaction != null;
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS:
				return isSetEnableNotifications();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enableNotifications: ");
		if (enableNotificationsESet) result.append(enableNotifications); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AbstractExceptionStrategyTypeImpl
