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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractStorageType;
import org.mule.ide.config.core.ConnectionStrategyType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MuleManagementContextType;
import org.mule.ide.config.core.ThreadingProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mule Management Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultThreadingProfile <em>Default Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getAbstractStorageGroup <em>Abstract Storage Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getAbstractStorage <em>Abstract Storage</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultConnectionStrategy <em>Default Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getClusterId <em>Cluster Id</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultEncoding <em>Default Encoding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#isDefaultRemoteSync <em>Default Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getServerId <em>Server Id</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl#getWorkingDirectory <em>Working Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MuleManagementContextTypeImpl extends EObjectImpl implements MuleManagementContextType {
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
	 * The cached value of the '{@link #getAbstractStorageGroup() <em>Abstract Storage Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractStorageGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractStorageGroup;

	/**
	 * The cached value of the '{@link #getDefaultConnectionStrategy() <em>Default Connection Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConnectionStrategy()
	 * @generated
	 * @ordered
	 */
	protected ConnectionStrategyType defaultConnectionStrategy;

	/**
	 * The default value of the '{@link #getClusterId() <em>Cluster Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterId() <em>Cluster Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterId()
	 * @generated
	 * @ordered
	 */
	protected String clusterId = CLUSTER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultEncoding() <em>Default Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultEncoding() <em>Default Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultEncoding()
	 * @generated
	 * @ordered
	 */
	protected String defaultEncoding = DEFAULT_ENCODING_EDEFAULT;

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
	protected static final String DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT = null;

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
	 * The default value of the '{@link #getDefaultTransactionTimeout() <em>Default Transaction Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTransactionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT = null;

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
	 * The default value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainId() <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainId()
	 * @generated
	 * @ordered
	 */
	protected String domainId = DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected String serverId = SERVER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIRECTORY_EDEFAULT = "./.mule";

	/**
	 * The cached value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected String workingDirectory = WORKING_DIRECTORY_EDEFAULT;

	/**
	 * This is true if the Working Directory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workingDirectoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MuleManagementContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getMuleManagementContextType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE, oldDefaultThreadingProfile, newDefaultThreadingProfile);
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
				msgs = ((InternalEObject)defaultThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE, null, msgs);
			if (newDefaultThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultThreadingProfile(newDefaultThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE, newDefaultThreadingProfile, newDefaultThreadingProfile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, oldDefaultDispatcherThreadingProfile, newDefaultDispatcherThreadingProfile);
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
				msgs = ((InternalEObject)defaultDispatcherThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, null, msgs);
			if (newDefaultDispatcherThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultDispatcherThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultDispatcherThreadingProfile(newDefaultDispatcherThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE, newDefaultDispatcherThreadingProfile, newDefaultDispatcherThreadingProfile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, oldDefaultReceiverThreadingProfile, newDefaultReceiverThreadingProfile);
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
				msgs = ((InternalEObject)defaultReceiverThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, null, msgs);
			if (newDefaultReceiverThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultReceiverThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultReceiverThreadingProfile(newDefaultReceiverThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE, newDefaultReceiverThreadingProfile, newDefaultReceiverThreadingProfile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, oldDefaultComponentThreadingProfile, newDefaultComponentThreadingProfile);
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
				msgs = ((InternalEObject)defaultComponentThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, null, msgs);
			if (newDefaultComponentThreadingProfile != null)
				msgs = ((InternalEObject)newDefaultComponentThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, null, msgs);
			msgs = basicSetDefaultComponentThreadingProfile(newDefaultComponentThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE, newDefaultComponentThreadingProfile, newDefaultComponentThreadingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractStorageGroup() {
		if (abstractStorageGroup == null) {
			abstractStorageGroup = new BasicFeatureMap(this, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP);
		}
		return abstractStorageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStorageType getAbstractStorage() {
		return (AbstractStorageType)getAbstractStorageGroup().get(CorePackage.eINSTANCE.getMuleManagementContextType_AbstractStorage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractStorage(AbstractStorageType newAbstractStorage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractStorageGroup()).basicAdd(CorePackage.eINSTANCE.getMuleManagementContextType_AbstractStorage(), newAbstractStorage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionStrategyType getDefaultConnectionStrategy() {
		return defaultConnectionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultConnectionStrategy(ConnectionStrategyType newDefaultConnectionStrategy, NotificationChain msgs) {
		ConnectionStrategyType oldDefaultConnectionStrategy = defaultConnectionStrategy;
		defaultConnectionStrategy = newDefaultConnectionStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY, oldDefaultConnectionStrategy, newDefaultConnectionStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultConnectionStrategy(ConnectionStrategyType newDefaultConnectionStrategy) {
		if (newDefaultConnectionStrategy != defaultConnectionStrategy) {
			NotificationChain msgs = null;
			if (defaultConnectionStrategy != null)
				msgs = ((InternalEObject)defaultConnectionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY, null, msgs);
			if (newDefaultConnectionStrategy != null)
				msgs = ((InternalEObject)newDefaultConnectionStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY, null, msgs);
			msgs = basicSetDefaultConnectionStrategy(newDefaultConnectionStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY, newDefaultConnectionStrategy, newDefaultConnectionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClusterId() {
		return clusterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterId(String newClusterId) {
		String oldClusterId = clusterId;
		clusterId = newClusterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__CLUSTER_ID, oldClusterId, clusterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultEncoding() {
		return defaultEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultEncoding(String newDefaultEncoding) {
		String oldDefaultEncoding = defaultEncoding;
		defaultEncoding = newDefaultEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_ENCODING, oldDefaultEncoding, defaultEncoding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC, oldDefaultRemoteSync, defaultRemoteSync, !oldDefaultRemoteSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC, oldDefaultRemoteSync, DEFAULT_REMOTE_SYNC_EDEFAULT, oldDefaultRemoteSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS, oldDefaultSynchronousEndpoints, defaultSynchronousEndpoints, !oldDefaultSynchronousEndpointsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS, oldDefaultSynchronousEndpoints, DEFAULT_SYNCHRONOUS_ENDPOINTS_EDEFAULT, oldDefaultSynchronousEndpointsESet));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT, oldDefaultSynchronousEventTimeout, defaultSynchronousEventTimeout));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_TRANSACTION_TIMEOUT, oldDefaultTransactionTimeout, defaultTransactionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainId() {
		return domainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainId(String newDomainId) {
		String oldDomainId = domainId;
		domainId = newDomainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DOMAIN_ID, oldDomainId, domainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerId() {
		return serverId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerId(String newServerId) {
		String oldServerId = serverId;
		serverId = newServerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__SERVER_ID, oldServerId, serverId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingDirectory(String newWorkingDirectory) {
		String oldWorkingDirectory = workingDirectory;
		workingDirectory = newWorkingDirectory;
		boolean oldWorkingDirectoryESet = workingDirectoryESet;
		workingDirectoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY, oldWorkingDirectory, workingDirectory, !oldWorkingDirectoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkingDirectory() {
		String oldWorkingDirectory = workingDirectory;
		boolean oldWorkingDirectoryESet = workingDirectoryESet;
		workingDirectory = WORKING_DIRECTORY_EDEFAULT;
		workingDirectoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY, oldWorkingDirectory, WORKING_DIRECTORY_EDEFAULT, oldWorkingDirectoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkingDirectory() {
		return workingDirectoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE:
				return basicSetDefaultThreadingProfile(null, msgs);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				return basicSetDefaultDispatcherThreadingProfile(null, msgs);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				return basicSetDefaultReceiverThreadingProfile(null, msgs);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				return basicSetDefaultComponentThreadingProfile(null, msgs);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP:
				return ((InternalEList<?>)getAbstractStorageGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE:
				return basicSetAbstractStorage(null, msgs);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY:
				return basicSetDefaultConnectionStrategy(null, msgs);
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
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE:
				return getDefaultThreadingProfile();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				return getDefaultDispatcherThreadingProfile();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				return getDefaultReceiverThreadingProfile();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				return getDefaultComponentThreadingProfile();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP:
				if (coreType) return getAbstractStorageGroup();
				return ((FeatureMap.Internal)getAbstractStorageGroup()).getWrapper();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE:
				return getAbstractStorage();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY:
				return getDefaultConnectionStrategy();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__CLUSTER_ID:
				return getClusterId();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_ENCODING:
				return getDefaultEncoding();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC:
				return isDefaultRemoteSync() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				return isDefaultSynchronousEndpoints() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				return getDefaultSynchronousEventTimeout();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				return getDefaultTransactionTimeout();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DOMAIN_ID:
				return getDomainId();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__SERVER_ID:
				return getServerId();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY:
				return getWorkingDirectory();
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
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE:
				setDefaultThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				setDefaultDispatcherThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				setDefaultReceiverThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				setDefaultComponentThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP:
				((FeatureMap.Internal)getAbstractStorageGroup()).set(newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY:
				setDefaultConnectionStrategy((ConnectionStrategyType)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__CLUSTER_ID:
				setClusterId((String)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_ENCODING:
				setDefaultEncoding((String)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC:
				setDefaultRemoteSync(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				setDefaultSynchronousEndpoints(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				setDefaultSynchronousEventTimeout((String)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				setDefaultTransactionTimeout((String)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DOMAIN_ID:
				setDomainId((String)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__SERVER_ID:
				setServerId((String)newValue);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY:
				setWorkingDirectory((String)newValue);
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
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE:
				setDefaultThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				setDefaultDispatcherThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				setDefaultReceiverThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				setDefaultComponentThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP:
				getAbstractStorageGroup().clear();
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY:
				setDefaultConnectionStrategy((ConnectionStrategyType)null);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__CLUSTER_ID:
				setClusterId(CLUSTER_ID_EDEFAULT);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_ENCODING:
				setDefaultEncoding(DEFAULT_ENCODING_EDEFAULT);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC:
				unsetDefaultRemoteSync();
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				unsetDefaultSynchronousEndpoints();
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				setDefaultSynchronousEventTimeout(DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				setDefaultTransactionTimeout(DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DOMAIN_ID:
				setDomainId(DOMAIN_ID_EDEFAULT);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__SERVER_ID:
				setServerId(SERVER_ID_EDEFAULT);
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY:
				unsetWorkingDirectory();
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
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE:
				return defaultThreadingProfile != null;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
				return defaultDispatcherThreadingProfile != null;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
				return defaultReceiverThreadingProfile != null;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
				return defaultComponentThreadingProfile != null;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP:
				return abstractStorageGroup != null && !abstractStorageGroup.isEmpty();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE:
				return getAbstractStorage() != null;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY:
				return defaultConnectionStrategy != null;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__CLUSTER_ID:
				return CLUSTER_ID_EDEFAULT == null ? clusterId != null : !CLUSTER_ID_EDEFAULT.equals(clusterId);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_ENCODING:
				return DEFAULT_ENCODING_EDEFAULT == null ? defaultEncoding != null : !DEFAULT_ENCODING_EDEFAULT.equals(defaultEncoding);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC:
				return isSetDefaultRemoteSync();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
				return isSetDefaultSynchronousEndpoints();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
				return DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT == null ? defaultSynchronousEventTimeout != null : !DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT_EDEFAULT.equals(defaultSynchronousEventTimeout);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
				return DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT == null ? defaultTransactionTimeout != null : !DEFAULT_TRANSACTION_TIMEOUT_EDEFAULT.equals(defaultTransactionTimeout);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DOMAIN_ID:
				return DOMAIN_ID_EDEFAULT == null ? domainId != null : !DOMAIN_ID_EDEFAULT.equals(domainId);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__SERVER_ID:
				return SERVER_ID_EDEFAULT == null ? serverId != null : !SERVER_ID_EDEFAULT.equals(serverId);
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY:
				return isSetWorkingDirectory();
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
		result.append(" (abstractStorageGroup: ");
		result.append(abstractStorageGroup);
		result.append(", clusterId: ");
		result.append(clusterId);
		result.append(", defaultEncoding: ");
		result.append(defaultEncoding);
		result.append(", defaultRemoteSync: ");
		if (defaultRemoteSyncESet) result.append(defaultRemoteSync); else result.append("<unset>");
		result.append(", defaultSynchronousEndpoints: ");
		if (defaultSynchronousEndpointsESet) result.append(defaultSynchronousEndpoints); else result.append("<unset>");
		result.append(", defaultSynchronousEventTimeout: ");
		result.append(defaultSynchronousEventTimeout);
		result.append(", defaultTransactionTimeout: ");
		result.append(defaultTransactionTimeout);
		result.append(", domainId: ");
		result.append(domainId);
		result.append(", serverId: ");
		result.append(serverId);
		result.append(", workingDirectory: ");
		if (workingDirectoryESet) result.append(workingDirectory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MuleManagementContextTypeImpl
