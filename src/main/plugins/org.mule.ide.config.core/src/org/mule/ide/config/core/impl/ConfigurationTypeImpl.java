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

import org.mule.ide.config.core.ConfigurationType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ThreadingProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#getDefaultThreadingProfile <em>Default Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#isDefaultRemoteSync <em>Default Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationTypeImpl extends EObjectImpl implements ConfigurationType {
	/**
	 * The cached value of the '{@link #getDefaultThreadingProfile() <em>Default Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultThreadingProfile()
	 * @generated
	 * @ordered
	 */
	protected ThreadingProfileType defaultThreadingProfile;

	/**
	 * The cached value of the '{@link #getDefaultDispatcherThreadingProfile() <em>Default Dispatcher Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDispatcherThreadingProfile()
	 * @generated
	 * @ordered
	 */
	protected ThreadingProfileType defaultDispatcherThreadingProfile;

	/**
	 * The cached value of the '{@link #getDefaultReceiverThreadingProfile() <em>Default Receiver Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReceiverThreadingProfile()
	 * @generated
	 * @ordered
	 */
	protected ThreadingProfileType defaultReceiverThreadingProfile;

	/**
	 * The cached value of the '{@link #getDefaultComponentThreadingProfile() <em>Default Component Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultComponentThreadingProfile()
	 * @generated
	 * @ordered
	 */
	protected ThreadingProfileType defaultComponentThreadingProfile;

	/**
	 * The default value of the '{@link #isDefaultRemoteSync() <em>Default Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultRemoteSync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_REMOTE_SYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultRemoteSync() <em>Default Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultRemoteSync()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultRemoteSync = DEFAULT_REMOTE_SYNC_EDEFAULT;

	/**
	 * This is true if the Default Remote Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultRemoteSyncESet;

	/**
	 * The default value of the '{@link #isDefaultSynchronousEndpoints() <em>Default Synchronous Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultSynchronousEndpoints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_SYNCHRONOUS_ENDPOINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultSynchronousEndpoints() <em>Default Synchronous Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultSynchronousEndpoints()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultSynchronousEndpoints = DEFAULT_SYNCHRONOUS_ENDPOINTS_EDEFAULT;

	/**
	 * This is true if the Default Synchronous Endpoints attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultSynchronousEndpointsESet;

	/**
	 * The default value of the '{@link #getDefaultSynchronousEventTimeout() <em>Default Synchronous Event Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSynchronousEventTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT = "3000";

	/**
	 * The cached value of the '{@link #getDefaultSynchronousEventTimeout() <em>Default Synchronous Event Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSynchronousEventTimeout()
	 * @generated
	 * @ordered
	 */
	protected String defaultSynchronousEventTimeout = DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Default Synchronous Event Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultSynchronousEventTimeoutESet;

	/**
	 * The default value of the '{@link #getDefaultTransactionTimeout() <em>Default Transaction Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTransactionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT = "5000";

	/**
	 * The cached value of the '{@link #getDefaultTransactionTimeout() <em>Default Transaction Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTransactionTimeout()
	 * @generated
	 * @ordered
	 */
	protected String defaultTransactionTimeout = DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Default Transaction Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultTransactionTimeoutESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType getDefaultThreadingProfile() {
		return defaultThreadingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultThreadingProfile(ThreadingProfileType newDefaultThreadingProfile, NotificationChain msgs) {
		ThreadingProfileType oldDefaultThreadingProfile = defaultThreadingProfile;
		defaultThreadingProfile = newDefaultThreadingProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE, oldDefaultThreadingProfile, newDefaultThreadingProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultThreadingProfile(ThreadingProfileType newDefaultThreadingProfile) {
		if (newDefaultThreadingProfile != defaultThreadingProfile) {
			NotificationChain msgs = null;
			if (defaultThreadingProfile != null)
				msgs = ((InternalEObject)defaultThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE, null, msgs);
			if (newDefaultThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultThreadingProfile(newDefaultThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE, newDefaultThreadingProfile, newDefaultThreadingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType getDefaultDispatcherThreadingProfile() {
		return defaultDispatcherThreadingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultDispatcherThreadingProfile(ThreadingProfileType newDefaultDispatcherThreadingProfile, NotificationChain msgs) {
		ThreadingProfileType oldDefaultDispatcherThreadingProfile = defaultDispatcherThreadingProfile;
		defaultDispatcherThreadingProfile = newDefaultDispatcherThreadingProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, oldDefaultDispatcherThreadingProfile, newDefaultDispatcherThreadingProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDispatcherThreadingProfile(ThreadingProfileType newDefaultDispatcherThreadingProfile) {
		if (newDefaultDispatcherThreadingProfile != defaultDispatcherThreadingProfile) {
			NotificationChain msgs = null;
			if (defaultDispatcherThreadingProfile != null)
				msgs = ((InternalEObject)defaultDispatcherThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, null, msgs);
			if (newDefaultDispatcherThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultDispatcherThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultDispatcherThreadingProfile(newDefaultDispatcherThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, newDefaultDispatcherThreadingProfile, newDefaultDispatcherThreadingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType getDefaultReceiverThreadingProfile() {
		return defaultReceiverThreadingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultReceiverThreadingProfile(ThreadingProfileType newDefaultReceiverThreadingProfile, NotificationChain msgs) {
		ThreadingProfileType oldDefaultReceiverThreadingProfile = defaultReceiverThreadingProfile;
		defaultReceiverThreadingProfile = newDefaultReceiverThreadingProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, oldDefaultReceiverThreadingProfile, newDefaultReceiverThreadingProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultReceiverThreadingProfile(ThreadingProfileType newDefaultReceiverThreadingProfile) {
		if (newDefaultReceiverThreadingProfile != defaultReceiverThreadingProfile) {
			NotificationChain msgs = null;
			if (defaultReceiverThreadingProfile != null)
				msgs = ((InternalEObject)defaultReceiverThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, null, msgs);
			if (newDefaultReceiverThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultReceiverThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultReceiverThreadingProfile(newDefaultReceiverThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, newDefaultReceiverThreadingProfile, newDefaultReceiverThreadingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType getDefaultComponentThreadingProfile() {
		return defaultComponentThreadingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultComponentThreadingProfile(ThreadingProfileType newDefaultComponentThreadingProfile, NotificationChain msgs) {
		ThreadingProfileType oldDefaultComponentThreadingProfile = defaultComponentThreadingProfile;
		defaultComponentThreadingProfile = newDefaultComponentThreadingProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, oldDefaultComponentThreadingProfile, newDefaultComponentThreadingProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultComponentThreadingProfile(ThreadingProfileType newDefaultComponentThreadingProfile) {
		if (newDefaultComponentThreadingProfile != defaultComponentThreadingProfile) {
			NotificationChain msgs = null;
			if (defaultComponentThreadingProfile != null)
				msgs = ((InternalEObject)defaultComponentThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, null, msgs);
			if (newDefaultComponentThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultComponentThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultComponentThreadingProfile(newDefaultComponentThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, newDefaultComponentThreadingProfile, newDefaultComponentThreadingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultRemoteSync() {
		return defaultRemoteSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRemoteSync(boolean newDefaultRemoteSync) {
		boolean oldDefaultRemoteSync = defaultRemoteSync;
		defaultRemoteSync = newDefaultRemoteSync;
		boolean oldDefaultRemoteSyncESet = defaultRemoteSyncESet;
		defaultRemoteSyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_REMOTE_SYNC, oldDefaultRemoteSync, defaultRemoteSync, !oldDefaultRemoteSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultRemoteSync() {
		boolean oldDefaultRemoteSync = defaultRemoteSync;
		boolean oldDefaultRemoteSyncESet = defaultRemoteSyncESet;
		defaultRemoteSync = DEFAULT_REMOTE_SYNC_EDEFAULT;
		defaultRemoteSyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONFIGURATION_TYPE__DEFAULT_REMOTE_SYNC, oldDefaultRemoteSync, DEFAULT_REMOTE_SYNC_EDEFAULT, oldDefaultRemoteSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultRemoteSync() {
		return defaultRemoteSyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultSynchronousEndpoints() {
		return defaultSynchronousEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSynchronousEndpoints(boolean newDefaultSynchronousEndpoints) {
		boolean oldDefaultSynchronousEndpoints = defaultSynchronousEndpoints;
		defaultSynchronousEndpoints = newDefaultSynchronousEndpoints;
		boolean oldDefaultSynchronousEndpointsESet = defaultSynchronousEndpointsESet;
		defaultSynchronousEndpointsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS, oldDefaultSynchronousEndpoints, defaultSynchronousEndpoints, !oldDefaultSynchronousEndpointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultSynchronousEndpoints() {
		boolean oldDefaultSynchronousEndpoints = defaultSynchronousEndpoints;
		boolean oldDefaultSynchronousEndpointsESet = defaultSynchronousEndpointsESet;
		defaultSynchronousEndpoints = DEFAULT_SYNCHRONOUS_ENDPOINTS_EDEFAULT;
		defaultSynchronousEndpointsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS, oldDefaultSynchronousEndpoints, DEFAULT_SYNCHRONOUS_ENDPOINTS_EDEFAULT, oldDefaultSynchronousEndpointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultSynchronousEndpoints() {
		return defaultSynchronousEndpointsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSynchronousEventTimeout() {
		return defaultSynchronousEventTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSynchronousEventTimeout(String newDefaultSynchronousEventTimeout) {
		String oldDefaultSynchronousEventTimeout = defaultSynchronousEventTimeout;
		defaultSynchronousEventTimeout = newDefaultSynchronousEventTimeout;
		boolean oldDefaultSynchronousEventTimeoutESet = defaultSynchronousEventTimeoutESet;
		defaultSynchronousEventTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT, oldDefaultSynchronousEventTimeout, defaultSynchronousEventTimeout, !oldDefaultSynchronousEventTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultSynchronousEventTimeout() {
		String oldDefaultSynchronousEventTimeout = defaultSynchronousEventTimeout;
		boolean oldDefaultSynchronousEventTimeoutESet = defaultSynchronousEventTimeoutESet;
		defaultSynchronousEventTimeout = DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT;
		defaultSynchronousEventTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT, oldDefaultSynchronousEventTimeout, DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT, oldDefaultSynchronousEventTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultSynchronousEventTimeout() {
		return defaultSynchronousEventTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultTransactionTimeout() {
		return defaultTransactionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTransactionTimeout(String newDefaultTransactionTimeout) {
		String oldDefaultTransactionTimeout = defaultTransactionTimeout;
		defaultTransactionTimeout = newDefaultTransactionTimeout;
		boolean oldDefaultTransactionTimeoutESet = defaultTransactionTimeoutESet;
		defaultTransactionTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONFIGURATION_TYPE__DEFAULT_TRANSACTION_TIMEOUT, oldDefaultTransactionTimeout, defaultTransactionTimeout, !oldDefaultTransactionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultTransactionTimeout() {
		String oldDefaultTransactionTimeout = defaultTransactionTimeout;
		boolean oldDefaultTransactionTimeoutESet = defaultTransactionTimeoutESet;
		defaultTransactionTimeout = DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT;
		defaultTransactionTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONFIGURATION_TYPE__DEFAULT_TRANSACTION_TIMEOUT, oldDefaultTransactionTimeout, DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT, oldDefaultTransactionTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultTransactionTimeout() {
		return defaultTransactionTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE:
				return basicSetDefaultThreadingProfile(null, msgs);
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				return basicSetDefaultDispatcherThreadingProfile(null, msgs);
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				return basicSetDefaultReceiverThreadingProfile(null, msgs);
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				return basicSetDefaultComponentThreadingProfile(null, msgs);
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
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE:
				return getDefaultThreadingProfile();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				return getDefaultDispatcherThreadingProfile();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				return getDefaultReceiverThreadingProfile();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				return getDefaultComponentThreadingProfile();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_REMOTE_SYNC:
				return isDefaultRemoteSync() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				return isDefaultSynchronousEndpoints() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				return getDefaultSynchronousEventTimeout();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				return getDefaultTransactionTimeout();
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
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE:
				setDefaultThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				setDefaultDispatcherThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				setDefaultReceiverThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				setDefaultComponentThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_REMOTE_SYNC:
				setDefaultRemoteSync(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				setDefaultSynchronousEndpoints(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				setDefaultSynchronousEventTimeout((String)newValue);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				setDefaultTransactionTimeout((String)newValue);
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
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE:
				setDefaultThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				setDefaultDispatcherThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				setDefaultReceiverThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				setDefaultComponentThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_REMOTE_SYNC:
				unsetDefaultRemoteSync();
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				unsetDefaultSynchronousEndpoints();
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				unsetDefaultSynchronousEventTimeout();
				return;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				unsetDefaultTransactionTimeout();
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
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE:
				return defaultThreadingProfile != null;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				return defaultDispatcherThreadingProfile != null;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				return defaultReceiverThreadingProfile != null;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				return defaultComponentThreadingProfile != null;
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_REMOTE_SYNC:
				return isSetDefaultRemoteSync();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				return isSetDefaultSynchronousEndpoints();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				return isSetDefaultSynchronousEventTimeout();
			case CorePackage.CONFIGURATION_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				return isSetDefaultTransactionTimeout();
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
		result.append(" (defaultRemoteSync: ");
		if (defaultRemoteSyncESet) result.append(defaultRemoteSync); else result.append("<unset>");
		result.append(", defaultSynchronousEndpoints: ");
		if (defaultSynchronousEndpointsESet) result.append(defaultSynchronousEndpoints); else result.append("<unset>");
		result.append(", defaultSynchronousEventTimeout: ");
		if (defaultSynchronousEventTimeoutESet) result.append(defaultSynchronousEventTimeout); else result.append("<unset>");
		result.append(", defaultTransactionTimeout: ");
		if (defaultTransactionTimeoutESet) result.append(defaultTransactionTimeout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConfigurationTypeImpl
