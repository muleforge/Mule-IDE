/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractComponentThreadingProfileType;
import org.mule.ide.config.core.AbstractQueueProfileType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.SedaServiceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seda Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.SedaServiceTypeImpl#getAbstractComponentThreadingProfileGroup <em>Abstract Component Threading Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SedaServiceTypeImpl#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SedaServiceTypeImpl#getAbstractQueueProfileGroup <em>Abstract Queue Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SedaServiceTypeImpl#getAbstractQueueProfile <em>Abstract Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SedaServiceTypeImpl#getQueueTimeout <em>Queue Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SedaServiceTypeImpl extends BaseServiceTypeImpl implements SedaServiceType {
	/**
	 * The cached value of the '{@link #getAbstractComponentThreadingProfileGroup() <em>Abstract Component Threading Profile Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractComponentThreadingProfileGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractComponentThreadingProfileGroup;

	/**
	 * The cached value of the '{@link #getAbstractQueueProfileGroup() <em>Abstract Queue Profile Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractQueueProfileGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractQueueProfileGroup;

	/**
	 * The default value of the '{@link #getQueueTimeout() <em>Queue Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueueTimeout() <em>Queue Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueTimeout()
	 * @generated
	 * @ordered
	 */
	protected int queueTimeout = QUEUE_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Queue Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueTimeoutESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SedaServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSedaServiceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractComponentThreadingProfileGroup() {
		if (abstractComponentThreadingProfileGroup == null) {
			abstractComponentThreadingProfileGroup = new BasicFeatureMap(this, CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP);
		}
		return abstractComponentThreadingProfileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentThreadingProfileType getAbstractComponentThreadingProfile() {
		return (AbstractComponentThreadingProfileType)getAbstractComponentThreadingProfileGroup().get(CorePackage.eINSTANCE.getSedaServiceType_AbstractComponentThreadingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractComponentThreadingProfile(AbstractComponentThreadingProfileType newAbstractComponentThreadingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractComponentThreadingProfileGroup()).basicAdd(CorePackage.eINSTANCE.getSedaServiceType_AbstractComponentThreadingProfile(), newAbstractComponentThreadingProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractQueueProfileGroup() {
		if (abstractQueueProfileGroup == null) {
			abstractQueueProfileGroup = new BasicFeatureMap(this, CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP);
		}
		return abstractQueueProfileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractQueueProfileType getAbstractQueueProfile() {
		return (AbstractQueueProfileType)getAbstractQueueProfileGroup().get(CorePackage.eINSTANCE.getSedaServiceType_AbstractQueueProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractQueueProfile(AbstractQueueProfileType newAbstractQueueProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractQueueProfileGroup()).basicAdd(CorePackage.eINSTANCE.getSedaServiceType_AbstractQueueProfile(), newAbstractQueueProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueTimeout() {
		return queueTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueTimeout(int newQueueTimeout) {
		int oldQueueTimeout = queueTimeout;
		queueTimeout = newQueueTimeout;
		boolean oldQueueTimeoutESet = queueTimeoutESet;
		queueTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SEDA_SERVICE_TYPE__QUEUE_TIMEOUT, oldQueueTimeout, queueTimeout, !oldQueueTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueueTimeout() {
		int oldQueueTimeout = queueTimeout;
		boolean oldQueueTimeoutESet = queueTimeoutESet;
		queueTimeout = QUEUE_TIMEOUT_EDEFAULT;
		queueTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.SEDA_SERVICE_TYPE__QUEUE_TIMEOUT, oldQueueTimeout, QUEUE_TIMEOUT_EDEFAULT, oldQueueTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueueTimeout() {
		return queueTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP:
				return ((InternalEList<?>)getAbstractComponentThreadingProfileGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE:
				return basicSetAbstractComponentThreadingProfile(null, msgs);
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				return ((InternalEList<?>)getAbstractQueueProfileGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE:
				return basicSetAbstractQueueProfile(null, msgs);
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
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP:
				if (coreType) return getAbstractComponentThreadingProfileGroup();
				return ((FeatureMap.Internal)getAbstractComponentThreadingProfileGroup()).getWrapper();
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE:
				return getAbstractComponentThreadingProfile();
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				if (coreType) return getAbstractQueueProfileGroup();
				return ((FeatureMap.Internal)getAbstractQueueProfileGroup()).getWrapper();
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE:
				return getAbstractQueueProfile();
			case CorePackage.SEDA_SERVICE_TYPE__QUEUE_TIMEOUT:
				return new Integer(getQueueTimeout());
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
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP:
				((FeatureMap.Internal)getAbstractComponentThreadingProfileGroup()).set(newValue);
				return;
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				((FeatureMap.Internal)getAbstractQueueProfileGroup()).set(newValue);
				return;
			case CorePackage.SEDA_SERVICE_TYPE__QUEUE_TIMEOUT:
				setQueueTimeout(((Integer)newValue).intValue());
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
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP:
				getAbstractComponentThreadingProfileGroup().clear();
				return;
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				getAbstractQueueProfileGroup().clear();
				return;
			case CorePackage.SEDA_SERVICE_TYPE__QUEUE_TIMEOUT:
				unsetQueueTimeout();
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
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP:
				return abstractComponentThreadingProfileGroup != null && !abstractComponentThreadingProfileGroup.isEmpty();
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE:
				return getAbstractComponentThreadingProfile() != null;
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				return abstractQueueProfileGroup != null && !abstractQueueProfileGroup.isEmpty();
			case CorePackage.SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE:
				return getAbstractQueueProfile() != null;
			case CorePackage.SEDA_SERVICE_TYPE__QUEUE_TIMEOUT:
				return isSetQueueTimeout();
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
		result.append(" (abstractComponentThreadingProfileGroup: ");
		result.append(abstractComponentThreadingProfileGroup);
		result.append(", abstractQueueProfileGroup: ");
		result.append(abstractQueueProfileGroup);
		result.append(", queueTimeout: ");
		if (queueTimeoutESet) result.append(queueTimeout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SedaServiceTypeImpl
