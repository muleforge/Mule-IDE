/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.QueueProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.QueueProfileTypeImpl#getMaxOutstandingMessages <em>Max Outstanding Messages</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.QueueProfileTypeImpl#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueueProfileTypeImpl extends AbstractQueueProfileTypeImpl implements QueueProfileType {
	/**
	 * The default value of the '{@link #getMaxOutstandingMessages() <em>Max Outstanding Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutstandingMessages()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_OUTSTANDING_MESSAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxOutstandingMessages() <em>Max Outstanding Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutstandingMessages()
	 * @generated
	 * @ordered
	 */
	protected int maxOutstandingMessages = MAX_OUTSTANDING_MESSAGES_EDEFAULT;

	/**
	 * This is true if the Max Outstanding Messages attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxOutstandingMessagesESet;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * This is true if the Persistent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getQueueProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxOutstandingMessages() {
		return maxOutstandingMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOutstandingMessages(int newMaxOutstandingMessages) {
		int oldMaxOutstandingMessages = maxOutstandingMessages;
		maxOutstandingMessages = newMaxOutstandingMessages;
		boolean oldMaxOutstandingMessagesESet = maxOutstandingMessagesESet;
		maxOutstandingMessagesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUEUE_PROFILE_TYPE__MAX_OUTSTANDING_MESSAGES, oldMaxOutstandingMessages, maxOutstandingMessages, !oldMaxOutstandingMessagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxOutstandingMessages() {
		int oldMaxOutstandingMessages = maxOutstandingMessages;
		boolean oldMaxOutstandingMessagesESet = maxOutstandingMessagesESet;
		maxOutstandingMessages = MAX_OUTSTANDING_MESSAGES_EDEFAULT;
		maxOutstandingMessagesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.QUEUE_PROFILE_TYPE__MAX_OUTSTANDING_MESSAGES, oldMaxOutstandingMessages, MAX_OUTSTANDING_MESSAGES_EDEFAULT, oldMaxOutstandingMessagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxOutstandingMessages() {
		return maxOutstandingMessagesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		boolean oldPersistentESet = persistentESet;
		persistentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUEUE_PROFILE_TYPE__PERSISTENT, oldPersistent, persistent, !oldPersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistent() {
		boolean oldPersistent = persistent;
		boolean oldPersistentESet = persistentESet;
		persistent = PERSISTENT_EDEFAULT;
		persistentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.QUEUE_PROFILE_TYPE__PERSISTENT, oldPersistent, PERSISTENT_EDEFAULT, oldPersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistent() {
		return persistentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.QUEUE_PROFILE_TYPE__MAX_OUTSTANDING_MESSAGES:
				return new Integer(getMaxOutstandingMessages());
			case CorePackage.QUEUE_PROFILE_TYPE__PERSISTENT:
				return isPersistent() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.QUEUE_PROFILE_TYPE__MAX_OUTSTANDING_MESSAGES:
				setMaxOutstandingMessages(((Integer)newValue).intValue());
				return;
			case CorePackage.QUEUE_PROFILE_TYPE__PERSISTENT:
				setPersistent(((Boolean)newValue).booleanValue());
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
			case CorePackage.QUEUE_PROFILE_TYPE__MAX_OUTSTANDING_MESSAGES:
				unsetMaxOutstandingMessages();
				return;
			case CorePackage.QUEUE_PROFILE_TYPE__PERSISTENT:
				unsetPersistent();
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
			case CorePackage.QUEUE_PROFILE_TYPE__MAX_OUTSTANDING_MESSAGES:
				return isSetMaxOutstandingMessages();
			case CorePackage.QUEUE_PROFILE_TYPE__PERSISTENT:
				return isSetPersistent();
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
		result.append(" (maxOutstandingMessages: ");
		if (maxOutstandingMessagesESet) result.append(maxOutstandingMessages); else result.append("<unset>");
		result.append(", persistent: ");
		if (persistentESet) result.append(persistent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueueProfileTypeImpl
