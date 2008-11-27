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
import org.mule.ide.config.core.ExhaustedActionType;
import org.mule.ide.config.core.InitialisationPolicyType;
import org.mule.ide.config.core.PoolingProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pooling Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.PoolingProfileTypeImpl#getExhaustedAction <em>Exhausted Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PoolingProfileTypeImpl#getInitialisationPolicy <em>Initialisation Policy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PoolingProfileTypeImpl#getMaxActive <em>Max Active</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PoolingProfileTypeImpl#getMaxIdle <em>Max Idle</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PoolingProfileTypeImpl#getMaxWait <em>Max Wait</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoolingProfileTypeImpl extends AbstractPoolingProfileTypeImpl implements PoolingProfileType {
	/**
	 * The default value of the '{@link #getExhaustedAction() <em>Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExhaustedAction()
	 * @generated
	 * @ordered
	 */
	protected static final ExhaustedActionType EXHAUSTED_ACTION_EDEFAULT = ExhaustedActionType.WHENEXHAUSTEDGROW;

	/**
	 * The cached value of the '{@link #getExhaustedAction() <em>Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExhaustedAction()
	 * @generated
	 * @ordered
	 */
	protected ExhaustedActionType exhaustedAction = EXHAUSTED_ACTION_EDEFAULT;

	/**
	 * This is true if the Exhausted Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exhaustedActionESet;

	/**
	 * The default value of the '{@link #getInitialisationPolicy() <em>Initialisation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialisationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final InitialisationPolicyType INITIALISATION_POLICY_EDEFAULT = InitialisationPolicyType.INITIALISENONE;

	/**
	 * The cached value of the '{@link #getInitialisationPolicy() <em>Initialisation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialisationPolicy()
	 * @generated
	 * @ordered
	 */
	protected InitialisationPolicyType initialisationPolicy = INITIALISATION_POLICY_EDEFAULT;

	/**
	 * This is true if the Initialisation Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialisationPolicyESet;

	/**
	 * The default value of the '{@link #getMaxActive() <em>Max Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActive()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxActive() <em>Max Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActive()
	 * @generated
	 * @ordered
	 */
	protected String maxActive = MAX_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxIdle() <em>Max Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdle()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_IDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxIdle() <em>Max Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdle()
	 * @generated
	 * @ordered
	 */
	protected String maxIdle = MAX_IDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWait() <em>Max Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWait()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_WAIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxWait() <em>Max Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWait()
	 * @generated
	 * @ordered
	 */
	protected String maxWait = MAX_WAIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolingProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPoolingProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustedActionType getExhaustedAction() {
		return exhaustedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExhaustedAction(ExhaustedActionType newExhaustedAction) {
		ExhaustedActionType oldExhaustedAction = exhaustedAction;
		exhaustedAction = newExhaustedAction == null ? EXHAUSTED_ACTION_EDEFAULT : newExhaustedAction;
		boolean oldExhaustedActionESet = exhaustedActionESet;
		exhaustedActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POOLING_PROFILE_TYPE__EXHAUSTED_ACTION, oldExhaustedAction, exhaustedAction, !oldExhaustedActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExhaustedAction() {
		ExhaustedActionType oldExhaustedAction = exhaustedAction;
		boolean oldExhaustedActionESet = exhaustedActionESet;
		exhaustedAction = EXHAUSTED_ACTION_EDEFAULT;
		exhaustedActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.POOLING_PROFILE_TYPE__EXHAUSTED_ACTION, oldExhaustedAction, EXHAUSTED_ACTION_EDEFAULT, oldExhaustedActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExhaustedAction() {
		return exhaustedActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialisationPolicyType getInitialisationPolicy() {
		return initialisationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialisationPolicy(InitialisationPolicyType newInitialisationPolicy) {
		InitialisationPolicyType oldInitialisationPolicy = initialisationPolicy;
		initialisationPolicy = newInitialisationPolicy == null ? INITIALISATION_POLICY_EDEFAULT : newInitialisationPolicy;
		boolean oldInitialisationPolicyESet = initialisationPolicyESet;
		initialisationPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POOLING_PROFILE_TYPE__INITIALISATION_POLICY, oldInitialisationPolicy, initialisationPolicy, !oldInitialisationPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialisationPolicy() {
		InitialisationPolicyType oldInitialisationPolicy = initialisationPolicy;
		boolean oldInitialisationPolicyESet = initialisationPolicyESet;
		initialisationPolicy = INITIALISATION_POLICY_EDEFAULT;
		initialisationPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.POOLING_PROFILE_TYPE__INITIALISATION_POLICY, oldInitialisationPolicy, INITIALISATION_POLICY_EDEFAULT, oldInitialisationPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialisationPolicy() {
		return initialisationPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxActive() {
		return maxActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxActive(String newMaxActive) {
		String oldMaxActive = maxActive;
		maxActive = newMaxActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POOLING_PROFILE_TYPE__MAX_ACTIVE, oldMaxActive, maxActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxIdle() {
		return maxIdle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIdle(String newMaxIdle) {
		String oldMaxIdle = maxIdle;
		maxIdle = newMaxIdle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POOLING_PROFILE_TYPE__MAX_IDLE, oldMaxIdle, maxIdle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxWait() {
		return maxWait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWait(String newMaxWait) {
		String oldMaxWait = maxWait;
		maxWait = newMaxWait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POOLING_PROFILE_TYPE__MAX_WAIT, oldMaxWait, maxWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.POOLING_PROFILE_TYPE__EXHAUSTED_ACTION:
				return getExhaustedAction();
			case CorePackage.POOLING_PROFILE_TYPE__INITIALISATION_POLICY:
				return getInitialisationPolicy();
			case CorePackage.POOLING_PROFILE_TYPE__MAX_ACTIVE:
				return getMaxActive();
			case CorePackage.POOLING_PROFILE_TYPE__MAX_IDLE:
				return getMaxIdle();
			case CorePackage.POOLING_PROFILE_TYPE__MAX_WAIT:
				return getMaxWait();
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
			case CorePackage.POOLING_PROFILE_TYPE__EXHAUSTED_ACTION:
				setExhaustedAction((ExhaustedActionType)newValue);
				return;
			case CorePackage.POOLING_PROFILE_TYPE__INITIALISATION_POLICY:
				setInitialisationPolicy((InitialisationPolicyType)newValue);
				return;
			case CorePackage.POOLING_PROFILE_TYPE__MAX_ACTIVE:
				setMaxActive((String)newValue);
				return;
			case CorePackage.POOLING_PROFILE_TYPE__MAX_IDLE:
				setMaxIdle((String)newValue);
				return;
			case CorePackage.POOLING_PROFILE_TYPE__MAX_WAIT:
				setMaxWait((String)newValue);
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
			case CorePackage.POOLING_PROFILE_TYPE__EXHAUSTED_ACTION:
				unsetExhaustedAction();
				return;
			case CorePackage.POOLING_PROFILE_TYPE__INITIALISATION_POLICY:
				unsetInitialisationPolicy();
				return;
			case CorePackage.POOLING_PROFILE_TYPE__MAX_ACTIVE:
				setMaxActive(MAX_ACTIVE_EDEFAULT);
				return;
			case CorePackage.POOLING_PROFILE_TYPE__MAX_IDLE:
				setMaxIdle(MAX_IDLE_EDEFAULT);
				return;
			case CorePackage.POOLING_PROFILE_TYPE__MAX_WAIT:
				setMaxWait(MAX_WAIT_EDEFAULT);
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
			case CorePackage.POOLING_PROFILE_TYPE__EXHAUSTED_ACTION:
				return isSetExhaustedAction();
			case CorePackage.POOLING_PROFILE_TYPE__INITIALISATION_POLICY:
				return isSetInitialisationPolicy();
			case CorePackage.POOLING_PROFILE_TYPE__MAX_ACTIVE:
				return MAX_ACTIVE_EDEFAULT == null ? maxActive != null : !MAX_ACTIVE_EDEFAULT.equals(maxActive);
			case CorePackage.POOLING_PROFILE_TYPE__MAX_IDLE:
				return MAX_IDLE_EDEFAULT == null ? maxIdle != null : !MAX_IDLE_EDEFAULT.equals(maxIdle);
			case CorePackage.POOLING_PROFILE_TYPE__MAX_WAIT:
				return MAX_WAIT_EDEFAULT == null ? maxWait != null : !MAX_WAIT_EDEFAULT.equals(maxWait);
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
		result.append(" (exhaustedAction: ");
		if (exhaustedActionESet) result.append(exhaustedAction); else result.append("<unset>");
		result.append(", initialisationPolicy: ");
		if (initialisationPolicyESet) result.append(initialisationPolicy); else result.append("<unset>");
		result.append(", maxActive: ");
		result.append(maxActive);
		result.append(", maxIdle: ");
		result.append(maxIdle);
		result.append(", maxWait: ");
		result.append(maxWait);
		result.append(')');
		return result.toString();
	}

} //PoolingProfileTypeImpl
