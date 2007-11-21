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
import org.mule.ide.config.core.PoolExhaustedActionType;
import org.mule.ide.config.core.ThreadingProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threading Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#isDoThreading <em>Do Threading</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#getMaxBufferSize <em>Max Buffer Size</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#getMaxThreadsActive <em>Max Threads Active</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#getMaxThreadsIdle <em>Max Threads Idle</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#getPoolExhaustedAction <em>Pool Exhausted Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#getThreadTTL <em>Thread TTL</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl#getThreadWaitTimeout <em>Thread Wait Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadingProfileTypeImpl extends AbstractComponentThreadingProfileTypeImpl implements ThreadingProfileType {
	/**
	 * The default value of the '{@link #isDoThreading() <em>Do Threading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoThreading()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DO_THREADING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDoThreading() <em>Do Threading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoThreading()
	 * @generated
	 * @ordered
	 */
	protected boolean doThreading = DO_THREADING_EDEFAULT;

	/**
	 * This is true if the Do Threading attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doThreadingESet;

	/**
	 * The default value of the '{@link #getMaxBufferSize() <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_BUFFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBufferSize() <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBufferSize()
	 * @generated
	 * @ordered
	 */
	protected String maxBufferSize = MAX_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxThreadsActive() <em>Max Threads Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsActive()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_THREADS_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxThreadsActive() <em>Max Threads Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsActive()
	 * @generated
	 * @ordered
	 */
	protected String maxThreadsActive = MAX_THREADS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxThreadsIdle() <em>Max Threads Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsIdle()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_THREADS_IDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxThreadsIdle() <em>Max Threads Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsIdle()
	 * @generated
	 * @ordered
	 */
	protected String maxThreadsIdle = MAX_THREADS_IDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolExhaustedAction() <em>Pool Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolExhaustedAction()
	 * @generated
	 * @ordered
	 */
	protected static final PoolExhaustedActionType POOL_EXHAUSTED_ACTION_EDEFAULT = PoolExhaustedActionType.WAIT;

	/**
	 * The cached value of the '{@link #getPoolExhaustedAction() <em>Pool Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolExhaustedAction()
	 * @generated
	 * @ordered
	 */
	protected PoolExhaustedActionType poolExhaustedAction = POOL_EXHAUSTED_ACTION_EDEFAULT;

	/**
	 * This is true if the Pool Exhausted Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean poolExhaustedActionESet;

	/**
	 * The default value of the '{@link #getThreadTTL() <em>Thread TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadTTL()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_TTL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadTTL() <em>Thread TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadTTL()
	 * @generated
	 * @ordered
	 */
	protected String threadTTL = THREAD_TTL_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadWaitTimeout() <em>Thread Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadWaitTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_WAIT_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadWaitTimeout() <em>Thread Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadWaitTimeout()
	 * @generated
	 * @ordered
	 */
	protected String threadWaitTimeout = THREAD_WAIT_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadingProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getThreadingProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDoThreading() {
		return doThreading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoThreading(boolean newDoThreading) {
		boolean oldDoThreading = doThreading;
		doThreading = newDoThreading;
		boolean oldDoThreadingESet = doThreadingESet;
		doThreadingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__DO_THREADING, oldDoThreading, doThreading, !oldDoThreadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDoThreading() {
		boolean oldDoThreading = doThreading;
		boolean oldDoThreadingESet = doThreadingESet;
		doThreading = DO_THREADING_EDEFAULT;
		doThreadingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.THREADING_PROFILE_TYPE__DO_THREADING, oldDoThreading, DO_THREADING_EDEFAULT, oldDoThreadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDoThreading() {
		return doThreadingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxBufferSize() {
		return maxBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBufferSize(String newMaxBufferSize) {
		String oldMaxBufferSize = maxBufferSize;
		maxBufferSize = newMaxBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE, oldMaxBufferSize, maxBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxThreadsActive() {
		return maxThreadsActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxThreadsActive(String newMaxThreadsActive) {
		String oldMaxThreadsActive = maxThreadsActive;
		maxThreadsActive = newMaxThreadsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE, oldMaxThreadsActive, maxThreadsActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxThreadsIdle() {
		return maxThreadsIdle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxThreadsIdle(String newMaxThreadsIdle) {
		String oldMaxThreadsIdle = maxThreadsIdle;
		maxThreadsIdle = newMaxThreadsIdle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE, oldMaxThreadsIdle, maxThreadsIdle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolExhaustedActionType getPoolExhaustedAction() {
		return poolExhaustedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoolExhaustedAction(PoolExhaustedActionType newPoolExhaustedAction) {
		PoolExhaustedActionType oldPoolExhaustedAction = poolExhaustedAction;
		poolExhaustedAction = newPoolExhaustedAction == null ? POOL_EXHAUSTED_ACTION_EDEFAULT : newPoolExhaustedAction;
		boolean oldPoolExhaustedActionESet = poolExhaustedActionESet;
		poolExhaustedActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION, oldPoolExhaustedAction, poolExhaustedAction, !oldPoolExhaustedActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPoolExhaustedAction() {
		PoolExhaustedActionType oldPoolExhaustedAction = poolExhaustedAction;
		boolean oldPoolExhaustedActionESet = poolExhaustedActionESet;
		poolExhaustedAction = POOL_EXHAUSTED_ACTION_EDEFAULT;
		poolExhaustedActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION, oldPoolExhaustedAction, POOL_EXHAUSTED_ACTION_EDEFAULT, oldPoolExhaustedActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPoolExhaustedAction() {
		return poolExhaustedActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreadTTL() {
		return threadTTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadTTL(String newThreadTTL) {
		String oldThreadTTL = threadTTL;
		threadTTL = newThreadTTL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL, oldThreadTTL, threadTTL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreadWaitTimeout() {
		return threadWaitTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadWaitTimeout(String newThreadWaitTimeout) {
		String oldThreadWaitTimeout = threadWaitTimeout;
		threadWaitTimeout = newThreadWaitTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT, oldThreadWaitTimeout, threadWaitTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.THREADING_PROFILE_TYPE__DO_THREADING:
				return isDoThreading() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE:
				return getMaxBufferSize();
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				return getMaxThreadsActive();
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				return getMaxThreadsIdle();
			case CorePackage.THREADING_PROFILE_TYPE__NAME:
				return getName();
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				return getPoolExhaustedAction();
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				return getThreadTTL();
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				return getThreadWaitTimeout();
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
			case CorePackage.THREADING_PROFILE_TYPE__DO_THREADING:
				setDoThreading(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE:
				setMaxBufferSize((String)newValue);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				setMaxThreadsActive((String)newValue);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				setMaxThreadsIdle((String)newValue);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				setPoolExhaustedAction((PoolExhaustedActionType)newValue);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				setThreadTTL((String)newValue);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				setThreadWaitTimeout((String)newValue);
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
			case CorePackage.THREADING_PROFILE_TYPE__DO_THREADING:
				unsetDoThreading();
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE:
				setMaxBufferSize(MAX_BUFFER_SIZE_EDEFAULT);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				setMaxThreadsActive(MAX_THREADS_ACTIVE_EDEFAULT);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				setMaxThreadsIdle(MAX_THREADS_IDLE_EDEFAULT);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				unsetPoolExhaustedAction();
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				setThreadTTL(THREAD_TTL_EDEFAULT);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				setThreadWaitTimeout(THREAD_WAIT_TIMEOUT_EDEFAULT);
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
			case CorePackage.THREADING_PROFILE_TYPE__DO_THREADING:
				return isSetDoThreading();
			case CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE:
				return MAX_BUFFER_SIZE_EDEFAULT == null ? maxBufferSize != null : !MAX_BUFFER_SIZE_EDEFAULT.equals(maxBufferSize);
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				return MAX_THREADS_ACTIVE_EDEFAULT == null ? maxThreadsActive != null : !MAX_THREADS_ACTIVE_EDEFAULT.equals(maxThreadsActive);
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				return MAX_THREADS_IDLE_EDEFAULT == null ? maxThreadsIdle != null : !MAX_THREADS_IDLE_EDEFAULT.equals(maxThreadsIdle);
			case CorePackage.THREADING_PROFILE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				return isSetPoolExhaustedAction();
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				return THREAD_TTL_EDEFAULT == null ? threadTTL != null : !THREAD_TTL_EDEFAULT.equals(threadTTL);
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				return THREAD_WAIT_TIMEOUT_EDEFAULT == null ? threadWaitTimeout != null : !THREAD_WAIT_TIMEOUT_EDEFAULT.equals(threadWaitTimeout);
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
		result.append(" (doThreading: ");
		if (doThreadingESet) result.append(doThreading); else result.append("<unset>");
		result.append(", maxBufferSize: ");
		result.append(maxBufferSize);
		result.append(", maxThreadsActive: ");
		result.append(maxThreadsActive);
		result.append(", maxThreadsIdle: ");
		result.append(maxThreadsIdle);
		result.append(", name: ");
		result.append(name);
		result.append(", poolExhaustedAction: ");
		if (poolExhaustedActionESet) result.append(poolExhaustedAction); else result.append("<unset>");
		result.append(", threadTTL: ");
		result.append(threadTTL);
		result.append(", threadWaitTimeout: ");
		result.append(threadWaitTimeout);
		result.append(')');
		return result.toString();
	}

} //ThreadingProfileTypeImpl
