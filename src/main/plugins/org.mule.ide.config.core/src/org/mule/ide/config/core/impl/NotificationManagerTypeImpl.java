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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractDefineNotificationType;
import org.mule.ide.config.core.AbstractDisableNotificationType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.NotificationListenerType;
import org.mule.ide.config.core.NotificationManagerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Manager Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getAbstractDefineNotificationGroup <em>Abstract Define Notification Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getAbstractDefineNotification <em>Abstract Define Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getAbstractDisableNotificationGroup <em>Abstract Disable Notification Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getAbstractDisableNotification <em>Abstract Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#getNotificationListener <em>Notification Listener</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl#isDynamic <em>Dynamic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationManagerTypeImpl extends EObjectImpl implements NotificationManagerType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The cached value of the '{@link #getGroup2() <em>Group2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup2()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group2;

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
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractDefineNotificationGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getNotificationManagerType_AbstractDefineNotificationGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDefineNotificationType> getAbstractDefineNotification() {
		return getAbstractDefineNotificationGroup().list(CorePackage.eINSTANCE.getNotificationManagerType_AbstractDefineNotification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractDisableNotificationGroup() {
		return (FeatureMap)getGroup1().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getNotificationManagerType_AbstractDisableNotificationGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDisableNotificationType> getAbstractDisableNotification() {
		return getAbstractDisableNotificationGroup().list(CorePackage.eINSTANCE.getNotificationManagerType_AbstractDisableNotification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup2() {
		if (group2 == null) {
			group2 = new BasicFeatureMap(this, CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP2);
		}
		return group2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotificationListenerType> getNotificationListener() {
		return getGroup2().list(CorePackage.eINSTANCE.getNotificationManagerType_NotificationListener());
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION_GROUP:
				return ((InternalEList<?>)getAbstractDefineNotificationGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION:
				return ((InternalEList<?>)getAbstractDefineNotification()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION_GROUP:
				return ((InternalEList<?>)getAbstractDisableNotificationGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION:
				return ((InternalEList<?>)getAbstractDisableNotification()).basicRemove(otherEnd, msgs);
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP2:
				return ((InternalEList<?>)getGroup2()).basicRemove(otherEnd, msgs);
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION_GROUP:
				if (coreType) return getAbstractDefineNotificationGroup();
				return ((FeatureMap.Internal)getAbstractDefineNotificationGroup()).getWrapper();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION:
				return getAbstractDefineNotification();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION_GROUP:
				if (coreType) return getAbstractDisableNotificationGroup();
				return ((FeatureMap.Internal)getAbstractDisableNotificationGroup()).getWrapper();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION:
				return getAbstractDisableNotification();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP2:
				if (coreType) return getGroup2();
				return ((FeatureMap.Internal)getGroup2()).getWrapper();
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION_GROUP:
				((FeatureMap.Internal)getAbstractDefineNotificationGroup()).set(newValue);
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION_GROUP:
				((FeatureMap.Internal)getAbstractDisableNotificationGroup()).set(newValue);
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP2:
				((FeatureMap.Internal)getGroup2()).set(newValue);
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION_GROUP:
				getAbstractDefineNotificationGroup().clear();
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION_GROUP:
				getAbstractDisableNotificationGroup().clear();
				return;
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP2:
				getGroup2().clear();
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
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION_GROUP:
				return !getAbstractDefineNotificationGroup().isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DEFINE_NOTIFICATION:
				return !getAbstractDefineNotification().isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION_GROUP:
				return !getAbstractDisableNotificationGroup().isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__ABSTRACT_DISABLE_NOTIFICATION:
				return !getAbstractDisableNotification().isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__GROUP2:
				return group2 != null && !group2.isEmpty();
			case CorePackage.NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER:
				return !getNotificationListener().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", group1: ");
		result.append(group1);
		result.append(", group2: ");
		result.append(group2);
		result.append(", dynamic: ");
		if (dynamicESet) result.append(dynamic); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NotificationManagerTypeImpl
