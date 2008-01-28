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
import org.mule.ide.config.core.RetryConnectionStrategyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retry Connection Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.RetryConnectionStrategyTypeImpl#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.RetryConnectionStrategyTypeImpl#getRetryFrequency <em>Retry Frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RetryConnectionStrategyTypeImpl extends ConnectionStrategyTypeImpl implements RetryConnectionStrategyType {
	/**
	 * The default value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected int retryCount = RETRY_COUNT_EDEFAULT;

	/**
	 * This is true if the Retry Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retryCountESet;

	/**
	 * The default value of the '{@link #getRetryFrequency() <em>Retry Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final long RETRY_FREQUENCY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRetryFrequency() <em>Retry Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryFrequency()
	 * @generated
	 * @ordered
	 */
	protected long retryFrequency = RETRY_FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Retry Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retryFrequencyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetryConnectionStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRetryConnectionStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryCount() {
		return retryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryCount(int newRetryCount) {
		int oldRetryCount = retryCount;
		retryCount = newRetryCount;
		boolean oldRetryCountESet = retryCountESet;
		retryCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_COUNT, oldRetryCount, retryCount, !oldRetryCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRetryCount() {
		int oldRetryCount = retryCount;
		boolean oldRetryCountESet = retryCountESet;
		retryCount = RETRY_COUNT_EDEFAULT;
		retryCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_COUNT, oldRetryCount, RETRY_COUNT_EDEFAULT, oldRetryCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRetryCount() {
		return retryCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRetryFrequency() {
		return retryFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryFrequency(long newRetryFrequency) {
		long oldRetryFrequency = retryFrequency;
		retryFrequency = newRetryFrequency;
		boolean oldRetryFrequencyESet = retryFrequencyESet;
		retryFrequencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_FREQUENCY, oldRetryFrequency, retryFrequency, !oldRetryFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRetryFrequency() {
		long oldRetryFrequency = retryFrequency;
		boolean oldRetryFrequencyESet = retryFrequencyESet;
		retryFrequency = RETRY_FREQUENCY_EDEFAULT;
		retryFrequencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_FREQUENCY, oldRetryFrequency, RETRY_FREQUENCY_EDEFAULT, oldRetryFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRetryFrequency() {
		return retryFrequencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_COUNT:
				return new Integer(getRetryCount());
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_FREQUENCY:
				return new Long(getRetryFrequency());
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
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_COUNT:
				setRetryCount(((Integer)newValue).intValue());
				return;
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_FREQUENCY:
				setRetryFrequency(((Long)newValue).longValue());
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
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_COUNT:
				unsetRetryCount();
				return;
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_FREQUENCY:
				unsetRetryFrequency();
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
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_COUNT:
				return isSetRetryCount();
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE__RETRY_FREQUENCY:
				return isSetRetryFrequency();
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
		result.append(" (retryCount: ");
		if (retryCountESet) result.append(retryCount); else result.append("<unset>");
		result.append(", retryFrequency: ");
		if (retryFrequencyESet) result.append(retryFrequency); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RetryConnectionStrategyTypeImpl
