/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.impl;

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
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.ResponseTransformersType;
import org.mule.ide.config.core.TransformersType;

import org.mule.ide.config.core.impl.AbstractInboundEndpointTypeImpl;

import org.mule.ide.config.jms.InboundEndpointType;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.jms.JmsSelectorFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbound Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getResponseTransformers <em>Response Transformers</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getConnectorRef <em>Connector Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#isRemoteSync <em>Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getResponseTransformerRefs <em>Response Transformer Refs</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl#getTransformerRefs <em>Transformer Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InboundEndpointTypeImpl extends AbstractInboundEndpointTypeImpl implements InboundEndpointType {
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
	 * The default value of the '{@link #getQueue() <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected String queue = QUEUE_EDEFAULT;

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
	 * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected String topic = TOPIC_EDEFAULT;

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
	protected InboundEndpointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JMSPackage.Literals.INBOUND_ENDPOINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, JMSPackage.INBOUND_ENDPOINT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransformerGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransformerType> getAbstractTransformer() {
		return getAbstractTransformerGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformersType> getTransformers() {
		return getGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__TRANSFORMERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponseTransformersType> getResponseTransformers() {
		return getGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransactionGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransactionType> getAbstractTransaction() {
		return getAbstractTransactionGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractFilterGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFilterType> getAbstractFilter() {
		return getAbstractFilterGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JmsSelectorFilter> getSelector() {
		return getGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__SELECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractSecurityFilterGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSecurityFilterType> getAbstractSecurityFilter() {
		return getAbstractSecurityFilterGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractConnectionStrategyGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConnectionStrategyType> getAbstractConnectionStrategy() {
		return getAbstractConnectionStrategyGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getProperties() {
		return getGroup().list(JMSPackage.Literals.INBOUND_ENDPOINT_TYPE__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__ADDRESS, oldAddress, address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__CONNECTOR_REF, oldConnectorRef, connectorRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueue(String newQueue) {
		String oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__QUEUE, oldQueue, queue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__REF, oldRef, ref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC, oldRemoteSync, remoteSync, !oldRemoteSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC, oldRemoteSync, REMOTE_SYNC_EDEFAULT, oldRemoteSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT, oldRemoteSyncTimeout, remoteSyncTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS, oldResponseTransformerRefs, responseTransformerRefs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__SYNCHRONOUS, oldSynchronous, synchronous, !oldSynchronousESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.INBOUND_ENDPOINT_TYPE__SYNCHRONOUS, oldSynchronous, SYNCHRONOUS_EDEFAULT, oldSynchronousESet));
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
	public String getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(String newTopic) {
		String oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__TOPIC, oldTopic, topic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS, oldTransformerRefs, transformerRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JMSPackage.INBOUND_ENDPOINT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return ((InternalEList<?>)getAbstractTransformerGroup()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER:
				return ((InternalEList<?>)getAbstractTransformer()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMERS:
				return ((InternalEList<?>)getTransformers()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS:
				return ((InternalEList<?>)getResponseTransformers()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				return ((InternalEList<?>)getAbstractTransactionGroup()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION:
				return ((InternalEList<?>)getAbstractTransaction()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				return ((InternalEList<?>)getAbstractFilterGroup()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER:
				return ((InternalEList<?>)getAbstractFilter()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SELECTOR:
				return ((InternalEList<?>)getSelector()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				return ((InternalEList<?>)getAbstractSecurityFilterGroup()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER:
				return ((InternalEList<?>)getAbstractSecurityFilter()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractConnectionStrategyGroup()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY:
				return ((InternalEList<?>)getAbstractConnectionStrategy()).basicRemove(otherEnd, msgs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES:
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
			case JMSPackage.INBOUND_ENDPOINT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				if (coreType) return getAbstractTransformerGroup();
				return ((FeatureMap.Internal)getAbstractTransformerGroup()).getWrapper();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMERS:
				return getTransformers();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS:
				return getResponseTransformers();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				if (coreType) return getAbstractTransactionGroup();
				return ((FeatureMap.Internal)getAbstractTransactionGroup()).getWrapper();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION:
				return getAbstractTransaction();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				if (coreType) return getAbstractFilterGroup();
				return ((FeatureMap.Internal)getAbstractFilterGroup()).getWrapper();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER:
				return getAbstractFilter();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SELECTOR:
				return getSelector();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				if (coreType) return getAbstractSecurityFilterGroup();
				return ((FeatureMap.Internal)getAbstractSecurityFilterGroup()).getWrapper();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER:
				return getAbstractSecurityFilter();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				if (coreType) return getAbstractConnectionStrategyGroup();
				return ((FeatureMap.Internal)getAbstractConnectionStrategyGroup()).getWrapper();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY:
				return getAbstractConnectionStrategy();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES:
				return getProperties();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ADDRESS:
				return getAddress();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__CONNECTOR_REF:
				return getConnectorRef();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ENCODING:
				return getEncoding();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__QUEUE:
				return getQueue();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REF:
				return getRef();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC:
				return isRemoteSync() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				return getRemoteSyncTimeout();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				return getResponseTransformerRefs();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SYNCHRONOUS:
				return isSynchronous() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TOPIC:
				return getTopic();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS:
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
			case JMSPackage.INBOUND_ENDPOINT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				((FeatureMap.Internal)getAbstractTransformerGroup()).set(newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMERS:
				getTransformers().clear();
				getTransformers().addAll((Collection<? extends TransformersType>)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS:
				getResponseTransformers().clear();
				getResponseTransformers().addAll((Collection<? extends ResponseTransformersType>)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				((FeatureMap.Internal)getAbstractTransactionGroup()).set(newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				((FeatureMap.Internal)getAbstractFilterGroup()).set(newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SELECTOR:
				getSelector().clear();
				getSelector().addAll((Collection<? extends JmsSelectorFilter>)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				((FeatureMap.Internal)getAbstractSecurityFilterGroup()).set(newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractConnectionStrategyGroup()).set(newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MapType>)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ADDRESS:
				setAddress((String)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__CONNECTOR_REF:
				setConnectorRef((String)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__QUEUE:
				setQueue((String)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REF:
				setRef((String)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC:
				setRemoteSync(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				setRemoteSyncTimeout((String)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				setResponseTransformerRefs((List<String>)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SYNCHRONOUS:
				setSynchronous(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TOPIC:
				setTopic((String)newValue);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS:
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
			case JMSPackage.INBOUND_ENDPOINT_TYPE__GROUP:
				getGroup().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				getAbstractTransformerGroup().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMERS:
				getTransformers().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS:
				getResponseTransformers().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				getAbstractTransactionGroup().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				getAbstractFilterGroup().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SELECTOR:
				getSelector().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				getAbstractSecurityFilterGroup().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				getAbstractConnectionStrategyGroup().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES:
				getProperties().clear();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__CONNECTOR_REF:
				setConnectorRef(CONNECTOR_REF_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__QUEUE:
				setQueue(QUEUE_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REF:
				setRef(REF_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC:
				unsetRemoteSync();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				setRemoteSyncTimeout(REMOTE_SYNC_TIMEOUT_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				setResponseTransformerRefs(RESPONSE_TRANSFORMER_REFS_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SYNCHRONOUS:
				unsetSynchronous();
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TOPIC:
				setTopic(TOPIC_EDEFAULT);
				return;
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS:
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
			case JMSPackage.INBOUND_ENDPOINT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return !getAbstractTransformerGroup().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER:
				return !getAbstractTransformer().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMERS:
				return !getTransformers().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS:
				return !getResponseTransformers().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP:
				return !getAbstractTransactionGroup().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION:
				return !getAbstractTransaction().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP:
				return !getAbstractFilterGroup().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER:
				return !getAbstractFilter().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SELECTOR:
				return !getSelector().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP:
				return !getAbstractSecurityFilterGroup().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER:
				return !getAbstractSecurityFilter().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP:
				return !getAbstractConnectionStrategyGroup().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY:
				return !getAbstractConnectionStrategy().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES:
				return !getProperties().isEmpty();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__CONNECTOR_REF:
				return CONNECTOR_REF_EDEFAULT == null ? connectorRef != null : !CONNECTOR_REF_EDEFAULT.equals(connectorRef);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__QUEUE:
				return QUEUE_EDEFAULT == null ? queue != null : !QUEUE_EDEFAULT.equals(queue);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC:
				return isSetRemoteSync();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
				return REMOTE_SYNC_TIMEOUT_EDEFAULT == null ? remoteSyncTimeout != null : !REMOTE_SYNC_TIMEOUT_EDEFAULT.equals(remoteSyncTimeout);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
				return RESPONSE_TRANSFORMER_REFS_EDEFAULT == null ? responseTransformerRefs != null : !RESPONSE_TRANSFORMER_REFS_EDEFAULT.equals(responseTransformerRefs);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__SYNCHRONOUS:
				return isSetSynchronous();
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TOPIC:
				return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
			case JMSPackage.INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS:
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
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", queue: ");
		result.append(queue);
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
		result.append(", topic: ");
		result.append(topic);
		result.append(", transformerRefs: ");
		result.append(transformerRefs);
		result.append(')');
		return result.toString();
	}

} //InboundEndpointTypeImpl
