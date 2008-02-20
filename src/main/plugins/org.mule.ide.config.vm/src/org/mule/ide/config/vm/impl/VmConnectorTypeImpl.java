/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.vm.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.QueueProfileType;

import org.mule.ide.config.core.impl.ConnectorTypeImpl;

import org.mule.ide.config.vm.VMPackage;
import org.mule.ide.config.vm.VmConnectorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vm Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.vm.impl.VmConnectorTypeImpl#getQueueProfile <em>Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.vm.impl.VmConnectorTypeImpl#isQueueEvents <em>Queue Events</em>}</li>
 *   <li>{@link org.mule.ide.config.vm.impl.VmConnectorTypeImpl#getQueueTimeout <em>Queue Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VmConnectorTypeImpl extends ConnectorTypeImpl implements VmConnectorType {
	/**
	 * The cached value of the '{@link #getQueueProfile() <em>Queue Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueProfile()
	 * @generated
	 * @ordered
	 */
	protected QueueProfileType queueProfile;

	/**
	 * The default value of the '{@link #isQueueEvents() <em>Queue Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQueueEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUEUE_EVENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQueueEvents() <em>Queue Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQueueEvents()
	 * @generated
	 * @ordered
	 */
	protected boolean queueEvents = QUEUE_EVENTS_EDEFAULT;

	/**
	 * This is true if the Queue Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueEventsESet;

	/**
	 * The default value of the '{@link #getQueueTimeout() <em>Queue Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUEUE_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueTimeout() <em>Queue Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueTimeout()
	 * @generated
	 * @ordered
	 */
	protected BigInteger queueTimeout = QUEUE_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VMPackage.Literals.VM_CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueProfileType getQueueProfile() {
		return queueProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueueProfile(QueueProfileType newQueueProfile, NotificationChain msgs) {
		QueueProfileType oldQueueProfile = queueProfile;
		queueProfile = newQueueProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE, oldQueueProfile, newQueueProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueProfile(QueueProfileType newQueueProfile) {
		if (newQueueProfile != queueProfile) {
			NotificationChain msgs = null;
			if (queueProfile != null)
				msgs = ((InternalEObject)queueProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE, null, msgs);
			if (newQueueProfile != null)
				msgs = ((InternalEObject)newQueueProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE, null, msgs);
			msgs = basicSetQueueProfile(newQueueProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE, newQueueProfile, newQueueProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQueueEvents() {
		return queueEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueEvents(boolean newQueueEvents) {
		boolean oldQueueEvents = queueEvents;
		queueEvents = newQueueEvents;
		boolean oldQueueEventsESet = queueEventsESet;
		queueEventsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.VM_CONNECTOR_TYPE__QUEUE_EVENTS, oldQueueEvents, queueEvents, !oldQueueEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueueEvents() {
		boolean oldQueueEvents = queueEvents;
		boolean oldQueueEventsESet = queueEventsESet;
		queueEvents = QUEUE_EVENTS_EDEFAULT;
		queueEventsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VMPackage.VM_CONNECTOR_TYPE__QUEUE_EVENTS, oldQueueEvents, QUEUE_EVENTS_EDEFAULT, oldQueueEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueueEvents() {
		return queueEventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getQueueTimeout() {
		return queueTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueTimeout(BigInteger newQueueTimeout) {
		BigInteger oldQueueTimeout = queueTimeout;
		queueTimeout = newQueueTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VMPackage.VM_CONNECTOR_TYPE__QUEUE_TIMEOUT, oldQueueTimeout, queueTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE:
				return basicSetQueueProfile(null, msgs);
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
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE:
				return getQueueProfile();
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_EVENTS:
				return isQueueEvents() ? Boolean.TRUE : Boolean.FALSE;
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_TIMEOUT:
				return getQueueTimeout();
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
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE:
				setQueueProfile((QueueProfileType)newValue);
				return;
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_EVENTS:
				setQueueEvents(((Boolean)newValue).booleanValue());
				return;
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_TIMEOUT:
				setQueueTimeout((BigInteger)newValue);
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
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE:
				setQueueProfile((QueueProfileType)null);
				return;
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_EVENTS:
				unsetQueueEvents();
				return;
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_TIMEOUT:
				setQueueTimeout(QUEUE_TIMEOUT_EDEFAULT);
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
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_PROFILE:
				return queueProfile != null;
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_EVENTS:
				return isSetQueueEvents();
			case VMPackage.VM_CONNECTOR_TYPE__QUEUE_TIMEOUT:
				return QUEUE_TIMEOUT_EDEFAULT == null ? queueTimeout != null : !QUEUE_TIMEOUT_EDEFAULT.equals(queueTimeout);
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
		result.append(" (queueEvents: ");
		if (queueEventsESet) result.append(queueEvents); else result.append("<unset>");
		result.append(", queueTimeout: ");
		result.append(queueTimeout);
		result.append(')');
		return result.toString();
	}

} //VmConnectorTypeImpl
