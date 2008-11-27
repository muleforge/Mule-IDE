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
	protected static final int MAX_BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxBufferSize() <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int maxBufferSize = MAX_BUFFER_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Buffer Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxBufferSizeESet;

	/**
	 * The default value of the '{@link #getMaxThreadsActive() <em>Max Threads Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsActive()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_THREADS_ACTIVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxThreadsActive() <em>Max Threads Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsActive()
	 * @generated
	 * @ordered
	 */
	protected int maxThreadsActive = MAX_THREADS_ACTIVE_EDEFAULT;

	/**
	 * This is true if the Max Threads Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxThreadsActiveESet;

	/**
	 * The default value of the '{@link #getMaxThreadsIdle() <em>Max Threads Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsIdle()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_THREADS_IDLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxThreadsIdle() <em>Max Threads Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadsIdle()
	 * @generated
	 * @ordered
	 */
	protected int maxThreadsIdle = MAX_THREADS_IDLE_EDEFAULT;

	/**
	 * This is true if the Max Threads Idle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxThreadsIdleESet;

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
	protected static final int THREAD_TTL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreadTTL() <em>Thread TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadTTL()
	 * @generated
	 * @ordered
	 */
	protected int threadTTL = THREAD_TTL_EDEFAULT;

	/**
	 * This is true if the Thread TTL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean threadTTLESet;

	/**
	 * The default value of the '{@link #getThreadWaitTimeout() <em>Thread Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadWaitTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int THREAD_WAIT_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreadWaitTimeout() <em>Thread Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadWaitTimeout()
	 * @generated
	 * @ordered
	 */
	protected int threadWaitTimeout = THREAD_WAIT_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Thread Wait Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean threadWaitTimeoutESet;

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
	public int getMaxBufferSize() {
		return maxBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBufferSize(int newMaxBufferSize) {
		int oldMaxBufferSize = maxBufferSize;
		maxBufferSize = newMaxBufferSize;
		boolean oldMaxBufferSizeESet = maxBufferSizeESet;
		maxBufferSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE, oldMaxBufferSize, maxBufferSize, !oldMaxBufferSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxBufferSize() {
		int oldMaxBufferSize = maxBufferSize;
		boolean oldMaxBufferSizeESet = maxBufferSizeESet;
		maxBufferSize = MAX_BUFFER_SIZE_EDEFAULT;
		maxBufferSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE, oldMaxBufferSize, MAX_BUFFER_SIZE_EDEFAULT, oldMaxBufferSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxBufferSize() {
		return maxBufferSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxThreadsActive() {
		return maxThreadsActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxThreadsActive(int newMaxThreadsActive) {
		int oldMaxThreadsActive = maxThreadsActive;
		maxThreadsActive = newMaxThreadsActive;
		boolean oldMaxThreadsActiveESet = maxThreadsActiveESet;
		maxThreadsActiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE, oldMaxThreadsActive, maxThreadsActive, !oldMaxThreadsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxThreadsActive() {
		int oldMaxThreadsActive = maxThreadsActive;
		boolean oldMaxThreadsActiveESet = maxThreadsActiveESet;
		maxThreadsActive = MAX_THREADS_ACTIVE_EDEFAULT;
		maxThreadsActiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE, oldMaxThreadsActive, MAX_THREADS_ACTIVE_EDEFAULT, oldMaxThreadsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxThreadsActive() {
		return maxThreadsActiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxThreadsIdle() {
		return maxThreadsIdle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxThreadsIdle(int newMaxThreadsIdle) {
		int oldMaxThreadsIdle = maxThreadsIdle;
		maxThreadsIdle = newMaxThreadsIdle;
		boolean oldMaxThreadsIdleESet = maxThreadsIdleESet;
		maxThreadsIdleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE, oldMaxThreadsIdle, maxThreadsIdle, !oldMaxThreadsIdleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxThreadsIdle() {
		int oldMaxThreadsIdle = maxThreadsIdle;
		boolean oldMaxThreadsIdleESet = maxThreadsIdleESet;
		maxThreadsIdle = MAX_THREADS_IDLE_EDEFAULT;
		maxThreadsIdleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE, oldMaxThreadsIdle, MAX_THREADS_IDLE_EDEFAULT, oldMaxThreadsIdleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxThreadsIdle() {
		return maxThreadsIdleESet;
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
	public int getThreadTTL() {
		return threadTTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadTTL(int newThreadTTL) {
		int oldThreadTTL = threadTTL;
		threadTTL = newThreadTTL;
		boolean oldThreadTTLESet = threadTTLESet;
		threadTTLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL, oldThreadTTL, threadTTL, !oldThreadTTLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThreadTTL() {
		int oldThreadTTL = threadTTL;
		boolean oldThreadTTLESet = threadTTLESet;
		threadTTL = THREAD_TTL_EDEFAULT;
		threadTTLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL, oldThreadTTL, THREAD_TTL_EDEFAULT, oldThreadTTLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThreadTTL() {
		return threadTTLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreadWaitTimeout() {
		return threadWaitTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadWaitTimeout(int newThreadWaitTimeout) {
		int oldThreadWaitTimeout = threadWaitTimeout;
		threadWaitTimeout = newThreadWaitTimeout;
		boolean oldThreadWaitTimeoutESet = threadWaitTimeoutESet;
		threadWaitTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT, oldThreadWaitTimeout, threadWaitTimeout, !oldThreadWaitTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThreadWaitTimeout() {
		int oldThreadWaitTimeout = threadWaitTimeout;
		boolean oldThreadWaitTimeoutESet = threadWaitTimeoutESet;
		threadWaitTimeout = THREAD_WAIT_TIMEOUT_EDEFAULT;
		threadWaitTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT, oldThreadWaitTimeout, THREAD_WAIT_TIMEOUT_EDEFAULT, oldThreadWaitTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThreadWaitTimeout() {
		return threadWaitTimeoutESet;
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
				return new Integer(getMaxBufferSize());
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				return new Integer(getMaxThreadsActive());
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				return new Integer(getMaxThreadsIdle());
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				return getPoolExhaustedAction();
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				return new Integer(getThreadTTL());
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				return new Integer(getThreadWaitTimeout());
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
				setMaxBufferSize(((Integer)newValue).intValue());
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				setMaxThreadsActive(((Integer)newValue).intValue());
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				setMaxThreadsIdle(((Integer)newValue).intValue());
				return;
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				setPoolExhaustedAction((PoolExhaustedActionType)newValue);
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				setThreadTTL(((Integer)newValue).intValue());
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				setThreadWaitTimeout(((Integer)newValue).intValue());
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
				unsetMaxBufferSize();
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				unsetMaxThreadsActive();
				return;
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				unsetMaxThreadsIdle();
				return;
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				unsetPoolExhaustedAction();
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				unsetThreadTTL();
				return;
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				unsetThreadWaitTimeout();
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
				return isSetMaxBufferSize();
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
				return isSetMaxThreadsActive();
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
				return isSetMaxThreadsIdle();
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
				return isSetPoolExhaustedAction();
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
				return isSetThreadTTL();
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
				return isSetThreadWaitTimeout();
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
		if (maxBufferSizeESet) result.append(maxBufferSize); else result.append("<unset>");
		result.append(", maxThreadsActive: ");
		if (maxThreadsActiveESet) result.append(maxThreadsActive); else result.append("<unset>");
		result.append(", maxThreadsIdle: ");
		if (maxThreadsIdleESet) result.append(maxThreadsIdle); else result.append("<unset>");
		result.append(", poolExhaustedAction: ");
		if (poolExhaustedActionESet) result.append(poolExhaustedAction); else result.append("<unset>");
		result.append(", threadTTL: ");
		if (threadTTLESet) result.append(threadTTL); else result.append("<unset>");
		result.append(", threadWaitTimeout: ");
		if (threadWaitTimeoutESet) result.append(threadWaitTimeout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ThreadingProfileTypeImpl
