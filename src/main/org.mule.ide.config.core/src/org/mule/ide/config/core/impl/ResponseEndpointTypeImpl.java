/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractConnectionStrategyType;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractSecurityFilterType;
import org.mule.ide.config.core.AbstractTransactionType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CreateConnectorType;
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.ResponseEndpointType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getConnectorRef <em>Connector Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getCreateConnector <em>Create Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#isRemoteSync <em>Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getResponseTransformerRefs <em>Response Transformer Refs</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl#getTransformerRefs <em>Transformer Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseEndpointTypeImpl extends AbstractResponseEndpointTypeImpl implements ResponseEndpointType {
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
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectorRef() <em>Connector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorRef() <em>Connector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorRef()
	 * @generated
	 * @ordered
	 */
	protected String connectorRef = CONNECTOR_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateConnector() <em>Create Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateConnector()
	 * @generated
	 * @ordered
	 */
	protected static final CreateConnectorType CREATE_CONNECTOR_EDEFAULT = CreateConnectorType.FINDORCREATE;

	/**
	 * The cached value of the '{@link #getCreateConnector() <em>Create Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateConnector()
	 * @generated
	 * @ordered
	 */
	protected CreateConnectorType createConnector = CREATE_CONNECTOR_EDEFAULT;

	/**
	 * This is true if the Create Connector attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createConnectorESet;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteSync() <em>Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteSync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_SYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteSync() <em>Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteSync()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteSync = REMOTE_SYNC_EDEFAULT;

	/**
	 * This is true if the Remote Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remoteSyncESet;

	/**
	 * The default value of the '{@link #getRemoteSyncTimeout() <em>Remote Sync Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSyncTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SYNC_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteSyncTimeout() <em>Remote Sync Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSyncTimeout()
	 * @generated
	 * @ordered
	 */
	protected String remoteSyncTimeout = REMOTE_SYNC_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTransformerRefs() <em>Response Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTransformerRefs()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> RESPONSE_TRANSFORMER_REFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTransformerRefs() <em>Response Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTransformerRefs()
	 * @generated
	 * @ordered
	 */
	protected List<String> responseTransformerRefs = RESPONSE_TRANSFORMER_REFS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronous = SYNCHRONOUS_EDEFAULT;

	/**
	 * This is true if the Synchronous attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean synchronousESet;

	/**
	 * The default value of the '{@link #getTransformerRefs() <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerRefs()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> TRANSFORMER_REFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformerRefs() <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerRefs()
	 * @generated
	 * @ordered
	 */
	protected List<String> transformerRefs = TRANSFORMER_REFS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseEndpointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getResponseEndpointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.RESPONSE_ENDPOINT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransformerGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractTransformerGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransformerType> getAbstractTransformer() {
		return getAbstractTransformerGroup().list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransactionGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractTransactionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransactionType> getAbstractTransaction() {
		return getAbstractTransactionGroup().list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractTransaction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractFilterGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractFilterGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFilterType> getAbstractFilter() {
		return getAbstractFilterGroup().list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractSecurityFilterGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractSecurityFilterGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSecurityFilterType> getAbstractSecurityFilter() {
		return getAbstractSecurityFilterGroup().list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractSecurityFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractConnectionStrategyGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractConnectionStrategyGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConnectionStrategyType> getAbstractConnectionStrategy() {
		return getAbstractConnectionStrategyGroup().list(CorePackage.eINSTANCE.getResponseEndpointType_AbstractConnectionStrategy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getProperties() {
		return getGroup().list(CorePackage.eINSTANCE.getResponseEndpointType_Properties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectorRef() {
		return connectorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorRef(String newConnectorRef) {
		String oldConnectorRef = connectorRef;
		connectorRef = newConnectorRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__CONNECTOR_REF, oldConnectorRef, connectorRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateConnectorType getCreateConnector() {
		return createConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateConnector(CreateConnectorType newCreateConnector) {
		CreateConnectorType oldCreateConnector = createConnector;
		createConnector = newCreateConnector == null ? CREATE_CONNECTOR_EDEFAULT : newCreateConnector;
		boolean oldCreateConnectorESet = createConnectorESet;
		createConnectorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__CREATE_CONNECTOR, oldCreateConnector, createConnector, !oldCreateConnectorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateConnector() {
		CreateConnectorType oldCreateConnector = createConnector;
		boolean oldCreateConnectorESet = createConnectorESet;
		createConnector = CREATE_CONNECTOR_EDEFAULT;
		createConnectorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RESPONSE_ENDPOINT_TYPE__CREATE_CONNECTOR, oldCreateConnector, CREATE_CONNECTOR_EDEFAULT, oldCreateConnectorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateConnector() {
		return createConnectorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteSync() {
		return remoteSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteSync(boolean newRemoteSync) {
		boolean oldRemoteSync = remoteSync;
		remoteSync = newRemoteSync;
		boolean oldRemoteSyncESet = remoteSyncESet;
		remoteSyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC, oldRemoteSync, remoteSync, !oldRemoteSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemoteSync() {
		boolean oldRemoteSync = remoteSync;
		boolean oldRemoteSyncESet = remoteSyncESet;
		remoteSync = REMOTE_SYNC_EDEFAULT;
		remoteSyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC, oldRemoteSync, REMOTE_SYNC_EDEFAULT, oldRemoteSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemoteSync() {
		return remoteSyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteSyncTimeout() {
		return remoteSyncTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteSyncTimeout(String newRemoteSyncTimeout) {
		String oldRemoteSyncTimeout = remoteSyncTimeout;
		remoteSyncTimeout = newRemoteSyncTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT, oldRemoteSyncTimeout, remoteSyncTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getResponseTransformerRefs() {
		return responseTransformerRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTransformerRefs(List<String> newResponseTransformerRefs) {
		List<String> oldResponseTransformerRefs = responseTransformerRefs;
		responseTransformerRefs = newResponseTransformerRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS, oldResponseTransformerRefs, responseTransformerRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronous(boolean newSynchronous) {
		boolean oldSynchronous = synchronous;
		synchronous = newSynchronous;
		boolean oldSynchronousESet = synchronousESet;
		synchronousESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__SYNCHRONOUS, oldSynchronous, synchronous, !oldSynchronousESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSynchronous() {
		boolean oldSynchronous = synchronous;
		boolean oldSynchronousESet = synchronousESet;
		synchronous = SYNCHRONOUS_EDEFAULT;
		synchronousESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RESPONSE_ENDPOINT_TYPE__SYNCHRONOUS, oldSynchronous, SYNCHRONOUS_EDEFAULT, oldSynchronousESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSynchronous() {
		return synchronousESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getTransformerRefs() {
		return transformerRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerRefs(List<String> newTransformerRefs) {
		List<String> oldTransformerRefs = transformerRefs;
		transformerRefs = newTransformerRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ENDPOINT_TYPE__TRANSFORMER_REFS, oldTransformerRefs, transformerRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RESPONSE_ENDPOINT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return ((InternalEList<?>)getAbstractTransformerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER:
				return ((InternalEList<?>)getAbstractTransformer()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				return ((InternalEList<?>)getAbstractTransactionGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION:
				return ((InternalEList<?>)getAbstractTransaction()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				return ((InternalEList<?>)getAbstractFilterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER:
				return ((InternalEList<?>)getAbstractFilter()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				return ((InternalEList<?>)getAbstractSecurityFilterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER:
				return ((InternalEList<?>)getAbstractSecurityFilter()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractConnectionStrategyGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY:
				return ((InternalEList<?>)getAbstractConnectionStrategy()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case CorePackage.RESPONSE_ENDPOINT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				if (coreType) return getAbstractTransformerGroup();
				return ((FeatureMap.Internal)getAbstractTransformerGroup()).getWrapper();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				if (coreType) return getAbstractTransactionGroup();
				return ((FeatureMap.Internal)getAbstractTransactionGroup()).getWrapper();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION:
				return getAbstractTransaction();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				if (coreType) return getAbstractFilterGroup();
				return ((FeatureMap.Internal)getAbstractFilterGroup()).getWrapper();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER:
				return getAbstractFilter();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				if (coreType) return getAbstractSecurityFilterGroup();
				return ((FeatureMap.Internal)getAbstractSecurityFilterGroup()).getWrapper();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER:
				return getAbstractSecurityFilter();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				if (coreType) return getAbstractConnectionStrategyGroup();
				return ((FeatureMap.Internal)getAbstractConnectionStrategyGroup()).getWrapper();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY:
				return getAbstractConnectionStrategy();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__PROPERTIES:
				return getProperties();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ADDRESS:
				return getAddress();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CONNECTOR_REF:
				return getConnectorRef();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CREATE_CONNECTOR:
				return getCreateConnector();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ENCODING:
				return getEncoding();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REF:
				return getRef();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC:
				return isRemoteSync() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				return getRemoteSyncTimeout();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				return getResponseTransformerRefs();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__SYNCHRONOUS:
				return isSynchronous() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__TRANSFORMER_REFS:
				return getTransformerRefs();
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
			case CorePackage.RESPONSE_ENDPOINT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				((FeatureMap.Internal)getAbstractTransformerGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				((FeatureMap.Internal)getAbstractTransactionGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				((FeatureMap.Internal)getAbstractFilterGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				((FeatureMap.Internal)getAbstractSecurityFilterGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractConnectionStrategyGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MapType>)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ADDRESS:
				setAddress((String)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CONNECTOR_REF:
				setConnectorRef((String)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CREATE_CONNECTOR:
				setCreateConnector((CreateConnectorType)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REF:
				setRef((String)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC:
				setRemoteSync(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				setRemoteSyncTimeout((String)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				setResponseTransformerRefs((List<String>)newValue);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__SYNCHRONOUS:
				setSynchronous(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__TRANSFORMER_REFS:
				setTransformerRefs((List<String>)newValue);
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
			case CorePackage.RESPONSE_ENDPOINT_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				getAbstractTransformerGroup().clear();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				getAbstractTransactionGroup().clear();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				getAbstractFilterGroup().clear();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				getAbstractSecurityFilterGroup().clear();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				getAbstractConnectionStrategyGroup().clear();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__PROPERTIES:
				getProperties().clear();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CONNECTOR_REF:
				setConnectorRef(CONNECTOR_REF_EDEFAULT);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CREATE_CONNECTOR:
				unsetCreateConnector();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REF:
				setRef(REF_EDEFAULT);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC:
				unsetRemoteSync();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				setRemoteSyncTimeout(REMOTE_SYNC_TIMEOUT_EDEFAULT);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				setResponseTransformerRefs(RESPONSE_TRANSFORMER_REFS_EDEFAULT);
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__SYNCHRONOUS:
				unsetSynchronous();
				return;
			case CorePackage.RESPONSE_ENDPOINT_TYPE__TRANSFORMER_REFS:
				setTransformerRefs(TRANSFORMER_REFS_EDEFAULT);
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
			case CorePackage.RESPONSE_ENDPOINT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return !getAbstractTransformerGroup().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER:
				return !getAbstractTransformer().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				return !getAbstractTransactionGroup().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION:
				return !getAbstractTransaction().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				return !getAbstractFilterGroup().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER:
				return !getAbstractFilter().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				return !getAbstractSecurityFilterGroup().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER:
				return !getAbstractSecurityFilter().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				return !getAbstractConnectionStrategyGroup().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY:
				return !getAbstractConnectionStrategy().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__PROPERTIES:
				return !getProperties().isEmpty();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CONNECTOR_REF:
				return CONNECTOR_REF_EDEFAULT == null ? connectorRef != null : !CONNECTOR_REF_EDEFAULT.equals(connectorRef);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__CREATE_CONNECTOR:
				return isSetCreateConnector();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC:
				return isSetRemoteSync();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				return REMOTE_SYNC_TIMEOUT_EDEFAULT == null ? remoteSyncTimeout != null : !REMOTE_SYNC_TIMEOUT_EDEFAULT.equals(remoteSyncTimeout);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				return RESPONSE_TRANSFORMER_REFS_EDEFAULT == null ? responseTransformerRefs != null : !RESPONSE_TRANSFORMER_REFS_EDEFAULT.equals(responseTransformerRefs);
			case CorePackage.RESPONSE_ENDPOINT_TYPE__SYNCHRONOUS:
				return isSetSynchronous();
			case CorePackage.RESPONSE_ENDPOINT_TYPE__TRANSFORMER_REFS:
				return TRANSFORMER_REFS_EDEFAULT == null ? transformerRefs != null : !TRANSFORMER_REFS_EDEFAULT.equals(transformerRefs);
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
		result.append(", address: ");
		result.append(address);
		result.append(", connectorRef: ");
		result.append(connectorRef);
		result.append(", createConnector: ");
		if (createConnectorESet) result.append(createConnector); else result.append("<unset>");
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", ref: ");
		result.append(ref);
		result.append(", remoteSync: ");
		if (remoteSyncESet) result.append(remoteSync); else result.append("<unset>");
		result.append(", remoteSyncTimeout: ");
		result.append(remoteSyncTimeout);
		result.append(", responseTransformerRefs: ");
		result.append(responseTransformerRefs);
		result.append(", synchronous: ");
		if (synchronousESet) result.append(synchronous); else result.append("<unset>");
		result.append(", transformerRefs: ");
		result.append(transformerRefs);
		result.append(')');
		return result.toString();
	}

} //ResponseEndpointTypeImpl
