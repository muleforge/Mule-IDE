/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DefineNotificationType;
import org.mule.ide.config.core.DisableNotificationType;
import org.mule.ide.config.core.NotificationListenerType;
import org.mule.ide.config.core.NotificationManagerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Manager Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getDisableNotification <em>Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getNotificationListener <em>Notification Listener</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#isDynamic <em>Dynamic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationManagerTypeImpl extends EObjectImpl implements NotificationManagerType {
	/**
	 * The cached value of the '{@link #getNotification() <em>Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<DefineNotificationType> notification;

	/**
	 * The cached value of the '{@link #getDisableNotification() <em>Disable Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<DisableNotificationType> disableNotification;

	/**
	 * The cached value of the '{@link #getNotificationListener() <em>Notification Listener</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationListener()
	 * @generated
	 * @ordered
	 */
	protected EList<NotificationListenerType> notificationListener;

	/**
	 * The default value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamic = DYNAMIC_EDEFAULT;

	/**
	 * This is true if the Dynamic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationManagerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNotificationManagerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefineNotificationType> getNotification() {
		if (notification == null) {
			notification = new EObjectContainmentEList<DefineNotificationType>(DefineNotificationType.class, this, CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION);
		}
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisableNotificationType> getDisableNotification() {
		if (disableNotification == null) {
			disableNotification = new EObjectContainmentEList<DisableNotificationType>(DisableNotificationType.class, this, CorePackage.NOTIFICATION_MANAGER_TYPE__DISABLE_NOTIFICATION);
		}
		return disableNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotificationListenerType> getNotificationListener() {
		if (notificationListener == null) {
			notificationListener = new EObjectContainmentEList<NotificationListenerType>(NotificationListenerType.class, this, CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER);
		}
		return notificationListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamic() {
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamic(boolean newDynamic) {
		boolean oldDynamic = dynamic;
		dynamic = newDynamic;
		boolean oldDynamicESet = dynamicESet;
		dynamicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NOTIFICATION_MANAGER_TYPE__DYNAMIC, oldDynamic, dynamic, !oldDynamicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamic() {
		boolean oldDynamic = dynamic;
		boolean oldDynamicESet = dynamicESet;
		dynamic = DYNAMIC_EDEFAULT;
		dynamicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.NOTIFICATION_MANAGER_TYPE__DYNAMIC, oldDynamic, DYNAMIC_EDEFAULT, oldDynamicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamic() {
		return dynamicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION:
				return ((InternalEList<?>)getNotification()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DISABLE_NOTIFICATION:
				return ((InternalEList<?>)getDisableNotification()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER:
				return ((InternalEList<?>)getNotificationListener()).basicRemove(otherEnd, msgs);
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION:
				return getNotification();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DISABLE_NOTIFICATION:
				return getDisableNotification();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER:
				return getNotificationListener();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DYNAMIC:
				return isDynamic() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION:
				getNotification().clear();
				getNotification().addAll((Collection<? extends DefineNotificationType>)newValue);
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DISABLE_NOTIFICATION:
				getDisableNotification().clear();
				getDisableNotification().addAll((Collection<? extends DisableNotificationType>)newValue);
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER:
				getNotificationListener().clear();
				getNotificationListener().addAll((Collection<? extends NotificationListenerType>)newValue);
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DYNAMIC:
				setDynamic(((Boolean)newValue).booleanValue());
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION:
				getNotification().clear();
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DISABLE_NOTIFICATION:
				getDisableNotification().clear();
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER:
				getNotificationListener().clear();
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DYNAMIC:
				unsetDynamic();
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION:
				return notification != null && !notification.isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DISABLE_NOTIFICATION:
				return disableNotification != null && !disableNotification.isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER:
				return notificationListener != null && !notificationListener.isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__DYNAMIC:
				return isSetDynamic();
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
		result.append(" (dynamic: ");
		if (dynamicESet) result.append(dynamic); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NotificationManagerTypeImpl
