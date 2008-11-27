/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.impl.ConnectorTypeImpl;

import org.mule.ide.config.jms.AcknowledgementModeType;
import org.mule.ide.config.jms.GenericConnectorType;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.jms.SpecificationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getAcknowledgementMode <em>Acknowledgement Mode</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#isCacheJmsSessions <em>Cache Jms Sessions</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getConnectionFactoryRef <em>Connection Factory Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#isDurable <em>Durable</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#isEagerConsumer <em>Eager Consumer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#isHonorQosHeaders <em>Honor Qos Headers</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getMaxRedelivery <em>Max Redelivery</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#isNoLocal <em>No Local</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#isPersistentDelivery <em>Persistent Delivery</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#isRecoverJmsConnections <em>Recover Jms Connections</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getRedeliveryHandlerRef <em>Redelivery Handler Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl#getUsername <em>Username</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericConnectorTypeImpl extends ConnectorTypeImpl implements GenericConnectorType {
	/**
	 * The default value of the '{@link #getAcknowledgementMode() <em>Acknowledgement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgementMode()
	 * @generated
	 * @ordered
	 */
	protected static final AcknowledgementModeType ACKNOWLEDGEMENT_MODE_EDEFAULT = AcknowledgementModeType.AUTOACKNOWLEDGE;

	/**
	 * The cached value of the '{@link #getAcknowledgementMode() <em>Acknowledgement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgementMode()
	 * @generated
	 * @ordered
	 */
	protected AcknowledgementModeType acknowledgementMode = ACKNOWLEDGEMENT_MODE_EDEFAULT;

	/**
	 * This is true if the Acknowledgement Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acknowledgementModeESet;

	/**
	 * The default value of the '{@link #isCacheJmsSessions() <em>Cache Jms Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheJmsSessions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHE_JMS_SESSIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCacheJmsSessions() <em>Cache Jms Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheJmsSessions()
	 * @generated
	 * @ordered
	 */
	protected boolean cacheJmsSessions = CACHE_JMS_SESSIONS_EDEFAULT;

	/**
	 * This is true if the Cache Jms Sessions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cacheJmsSessionsESet;

	/**
	 * The default value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected String clientId = CLIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionFactoryRef() <em>Connection Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_FACTORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionFactoryRef() <em>Connection Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected String connectionFactoryRef = CONNECTION_FACTORY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isDurable() <em>Durable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDurable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DURABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDurable() <em>Durable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDurable()
	 * @generated
	 * @ordered
	 */
	protected boolean durable = DURABLE_EDEFAULT;

	/**
	 * This is true if the Durable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durableESet;

	/**
	 * The default value of the '{@link #isEagerConsumer() <em>Eager Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEagerConsumer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EAGER_CONSUMER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEagerConsumer() <em>Eager Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEagerConsumer()
	 * @generated
	 * @ordered
	 */
	protected boolean eagerConsumer = EAGER_CONSUMER_EDEFAULT;

	/**
	 * This is true if the Eager Consumer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eagerConsumerESet;

	/**
	 * The default value of the '{@link #isHonorQosHeaders() <em>Honor Qos Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonorQosHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HONOR_QOS_HEADERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHonorQosHeaders() <em>Honor Qos Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonorQosHeaders()
	 * @generated
	 * @ordered
	 */
	protected boolean honorQosHeaders = HONOR_QOS_HEADERS_EDEFAULT;

	/**
	 * This is true if the Honor Qos Headers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean honorQosHeadersESet;

	/**
	 * The default value of the '{@link #getMaxRedelivery() <em>Max Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRedelivery()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REDELIVERY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRedelivery() <em>Max Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRedelivery()
	 * @generated
	 * @ordered
	 */
	protected int maxRedelivery = MAX_REDELIVERY_EDEFAULT;

	/**
	 * This is true if the Max Redelivery attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxRedeliveryESet;

	/**
	 * The default value of the '{@link #isNoLocal() <em>No Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoLocal() <em>No Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean noLocal = NO_LOCAL_EDEFAULT;

	/**
	 * This is true if the No Local attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noLocalESet;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistentDelivery() <em>Persistent Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistentDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_DELIVERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistentDelivery() <em>Persistent Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistentDelivery()
	 * @generated
	 * @ordered
	 */
	protected boolean persistentDelivery = PERSISTENT_DELIVERY_EDEFAULT;

	/**
	 * This is true if the Persistent Delivery attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistentDeliveryESet;

	/**
	 * The default value of the '{@link #isRecoverJmsConnections() <em>Recover Jms Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecoverJmsConnections()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECOVER_JMS_CONNECTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecoverJmsConnections() <em>Recover Jms Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecoverJmsConnections()
	 * @generated
	 * @ordered
	 */
	protected boolean recoverJmsConnections = RECOVER_JMS_CONNECTIONS_EDEFAULT;

	/**
	 * This is true if the Recover Jms Connections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recoverJmsConnectionsESet;

	/**
	 * The default value of the '{@link #getRedeliveryHandlerRef() <em>Redelivery Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryHandlerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REDELIVERY_HANDLER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedeliveryHandlerRef() <em>Redelivery Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryHandlerRef()
	 * @generated
	 * @ordered
	 */
	protected String redeliveryHandlerRef = REDELIVERY_HANDLER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final SpecificationType SPECIFICATION_EDEFAULT = SpecificationType._10_2B;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected SpecificationType specification = SPECIFICATION_EDEFAULT;

	/**
	 * This is true if the Specification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specificationESet;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JMSPackage.Literals.GENERIC_CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcknowledgementModeType getAcknowledgementMode() {
		return acknowledgementMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcknowledgementMode(AcknowledgementModeType newAcknowledgementMode) {
		AcknowledgementModeType oldAcknowledgementMode = acknowledgementMode;
		acknowledgementMode = newAcknowledgementMode == null ? ACKNOWLEDGEMENT_MODE_EDEFAULT : newAcknowledgementMode;
		boolean oldAcknowledgementModeESet = acknowledgementModeESet;
		acknowledgementModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE, oldAcknowledgementMode, acknowledgementMode, !oldAcknowledgementModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcknowledgementMode() {
		AcknowledgementModeType oldAcknowledgementMode = acknowledgementMode;
		boolean oldAcknowledgementModeESet = acknowledgementModeESet;
		acknowledgementMode = ACKNOWLEDGEMENT_MODE_EDEFAULT;
		acknowledgementModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE, oldAcknowledgementMode, ACKNOWLEDGEMENT_MODE_EDEFAULT, oldAcknowledgementModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcknowledgementMode() {
		return acknowledgementModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCacheJmsSessions() {
		return cacheJmsSessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheJmsSessions(boolean newCacheJmsSessions) {
		boolean oldCacheJmsSessions = cacheJmsSessions;
		cacheJmsSessions = newCacheJmsSessions;
		boolean oldCacheJmsSessionsESet = cacheJmsSessionsESet;
		cacheJmsSessionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS, oldCacheJmsSessions, cacheJmsSessions, !oldCacheJmsSessionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCacheJmsSessions() {
		boolean oldCacheJmsSessions = cacheJmsSessions;
		boolean oldCacheJmsSessionsESet = cacheJmsSessionsESet;
		cacheJmsSessions = CACHE_JMS_SESSIONS_EDEFAULT;
		cacheJmsSessionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS, oldCacheJmsSessions, CACHE_JMS_SESSIONS_EDEFAULT, oldCacheJmsSessionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCacheJmsSessions() {
		return cacheJmsSessionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientId(String newClientId) {
		String oldClientId = clientId;
		clientId = newClientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__CLIENT_ID, oldClientId, clientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionFactoryRef() {
		return connectionFactoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionFactoryRef(String newConnectionFactoryRef) {
		String oldConnectionFactoryRef = connectionFactoryRef;
		connectionFactoryRef = newConnectionFactoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF, oldConnectionFactoryRef, connectionFactoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDurable() {
		return durable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurable(boolean newDurable) {
		boolean oldDurable = durable;
		durable = newDurable;
		boolean oldDurableESet = durableESet;
		durableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__DURABLE, oldDurable, durable, !oldDurableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurable() {
		boolean oldDurable = durable;
		boolean oldDurableESet = durableESet;
		durable = DURABLE_EDEFAULT;
		durableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__DURABLE, oldDurable, DURABLE_EDEFAULT, oldDurableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDurable() {
		return durableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEagerConsumer() {
		return eagerConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEagerConsumer(boolean newEagerConsumer) {
		boolean oldEagerConsumer = eagerConsumer;
		eagerConsumer = newEagerConsumer;
		boolean oldEagerConsumerESet = eagerConsumerESet;
		eagerConsumerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER, oldEagerConsumer, eagerConsumer, !oldEagerConsumerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEagerConsumer() {
		boolean oldEagerConsumer = eagerConsumer;
		boolean oldEagerConsumerESet = eagerConsumerESet;
		eagerConsumer = EAGER_CONSUMER_EDEFAULT;
		eagerConsumerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER, oldEagerConsumer, EAGER_CONSUMER_EDEFAULT, oldEagerConsumerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEagerConsumer() {
		return eagerConsumerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHonorQosHeaders() {
		return honorQosHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHonorQosHeaders(boolean newHonorQosHeaders) {
		boolean oldHonorQosHeaders = honorQosHeaders;
		honorQosHeaders = newHonorQosHeaders;
		boolean oldHonorQosHeadersESet = honorQosHeadersESet;
		honorQosHeadersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS, oldHonorQosHeaders, honorQosHeaders, !oldHonorQosHeadersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHonorQosHeaders() {
		boolean oldHonorQosHeaders = honorQosHeaders;
		boolean oldHonorQosHeadersESet = honorQosHeadersESet;
		honorQosHeaders = HONOR_QOS_HEADERS_EDEFAULT;
		honorQosHeadersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS, oldHonorQosHeaders, HONOR_QOS_HEADERS_EDEFAULT, oldHonorQosHeadersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHonorQosHeaders() {
		return honorQosHeadersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRedelivery() {
		return maxRedelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRedelivery(int newMaxRedelivery) {
		int oldMaxRedelivery = maxRedelivery;
		maxRedelivery = newMaxRedelivery;
		boolean oldMaxRedeliveryESet = maxRedeliveryESet;
		maxRedeliveryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY, oldMaxRedelivery, maxRedelivery, !oldMaxRedeliveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRedelivery() {
		int oldMaxRedelivery = maxRedelivery;
		boolean oldMaxRedeliveryESet = maxRedeliveryESet;
		maxRedelivery = MAX_REDELIVERY_EDEFAULT;
		maxRedeliveryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY, oldMaxRedelivery, MAX_REDELIVERY_EDEFAULT, oldMaxRedeliveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRedelivery() {
		return maxRedeliveryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoLocal() {
		return noLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLocal(boolean newNoLocal) {
		boolean oldNoLocal = noLocal;
		noLocal = newNoLocal;
		boolean oldNoLocalESet = noLocalESet;
		noLocalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__NO_LOCAL, oldNoLocal, noLocal, !oldNoLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoLocal() {
		boolean oldNoLocal = noLocal;
		boolean oldNoLocalESet = noLocalESet;
		noLocal = NO_LOCAL_EDEFAULT;
		noLocalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__NO_LOCAL, oldNoLocal, NO_LOCAL_EDEFAULT, oldNoLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoLocal() {
		return noLocalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistentDelivery() {
		return persistentDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistentDelivery(boolean newPersistentDelivery) {
		boolean oldPersistentDelivery = persistentDelivery;
		persistentDelivery = newPersistentDelivery;
		boolean oldPersistentDeliveryESet = persistentDeliveryESet;
		persistentDeliveryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY, oldPersistentDelivery, persistentDelivery, !oldPersistentDeliveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistentDelivery() {
		boolean oldPersistentDelivery = persistentDelivery;
		boolean oldPersistentDeliveryESet = persistentDeliveryESet;
		persistentDelivery = PERSISTENT_DELIVERY_EDEFAULT;
		persistentDeliveryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY, oldPersistentDelivery, PERSISTENT_DELIVERY_EDEFAULT, oldPersistentDeliveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistentDelivery() {
		return persistentDeliveryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecoverJmsConnections() {
		return recoverJmsConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoverJmsConnections(boolean newRecoverJmsConnections) {
		boolean oldRecoverJmsConnections = recoverJmsConnections;
		recoverJmsConnections = newRecoverJmsConnections;
		boolean oldRecoverJmsConnectionsESet = recoverJmsConnectionsESet;
		recoverJmsConnectionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS, oldRecoverJmsConnections, recoverJmsConnections, !oldRecoverJmsConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecoverJmsConnections() {
		boolean oldRecoverJmsConnections = recoverJmsConnections;
		boolean oldRecoverJmsConnectionsESet = recoverJmsConnectionsESet;
		recoverJmsConnections = RECOVER_JMS_CONNECTIONS_EDEFAULT;
		recoverJmsConnectionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS, oldRecoverJmsConnections, RECOVER_JMS_CONNECTIONS_EDEFAULT, oldRecoverJmsConnectionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecoverJmsConnections() {
		return recoverJmsConnectionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedeliveryHandlerRef() {
		return redeliveryHandlerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedeliveryHandlerRef(String newRedeliveryHandlerRef) {
		String oldRedeliveryHandlerRef = redeliveryHandlerRef;
		redeliveryHandlerRef = newRedeliveryHandlerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF, oldRedeliveryHandlerRef, redeliveryHandlerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationType getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(SpecificationType newSpecification) {
		SpecificationType oldSpecification = specification;
		specification = newSpecification == null ? SPECIFICATION_EDEFAULT : newSpecification;
		boolean oldSpecificationESet = specificationESet;
		specificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__SPECIFICATION, oldSpecification, specification, !oldSpecificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecification() {
		SpecificationType oldSpecification = specification;
		boolean oldSpecificationESet = specificationESet;
		specification = SPECIFICATION_EDEFAULT;
		specificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JMSPackage.GENERIC_CONNECTOR_TYPE__SPECIFICATION, oldSpecification, SPECIFICATION_EDEFAULT, oldSpecificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecification() {
		return specificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.GENERIC_CONNECTOR_TYPE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JMSPackage.GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE:
				return getAcknowledgementMode();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS:
				return isCacheJmsSessions() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CLIENT_ID:
				return getClientId();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF:
				return getConnectionFactoryRef();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__DURABLE:
				return isDurable() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER:
				return isEagerConsumer() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS:
				return isHonorQosHeaders() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY:
				return new Integer(getMaxRedelivery());
			case JMSPackage.GENERIC_CONNECTOR_TYPE__NO_LOCAL:
				return isNoLocal() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PASSWORD:
				return getPassword();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY:
				return isPersistentDelivery() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS:
				return isRecoverJmsConnections() ? Boolean.TRUE : Boolean.FALSE;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF:
				return getRedeliveryHandlerRef();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__SPECIFICATION:
				return getSpecification();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__USERNAME:
				return getUsername();
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
			case JMSPackage.GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE:
				setAcknowledgementMode((AcknowledgementModeType)newValue);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS:
				setCacheJmsSessions(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CLIENT_ID:
				setClientId((String)newValue);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF:
				setConnectionFactoryRef((String)newValue);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__DURABLE:
				setDurable(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER:
				setEagerConsumer(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS:
				setHonorQosHeaders(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY:
				setMaxRedelivery(((Integer)newValue).intValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__NO_LOCAL:
				setNoLocal(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PASSWORD:
				setPassword((String)newValue);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY:
				setPersistentDelivery(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS:
				setRecoverJmsConnections(((Boolean)newValue).booleanValue());
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF:
				setRedeliveryHandlerRef((String)newValue);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__SPECIFICATION:
				setSpecification((SpecificationType)newValue);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__USERNAME:
				setUsername((String)newValue);
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
			case JMSPackage.GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE:
				unsetAcknowledgementMode();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS:
				unsetCacheJmsSessions();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CLIENT_ID:
				setClientId(CLIENT_ID_EDEFAULT);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF:
				setConnectionFactoryRef(CONNECTION_FACTORY_REF_EDEFAULT);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__DURABLE:
				unsetDurable();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER:
				unsetEagerConsumer();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS:
				unsetHonorQosHeaders();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY:
				unsetMaxRedelivery();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__NO_LOCAL:
				unsetNoLocal();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY:
				unsetPersistentDelivery();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS:
				unsetRecoverJmsConnections();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF:
				setRedeliveryHandlerRef(REDELIVERY_HANDLER_REF_EDEFAULT);
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__SPECIFICATION:
				unsetSpecification();
				return;
			case JMSPackage.GENERIC_CONNECTOR_TYPE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
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
			case JMSPackage.GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE:
				return isSetAcknowledgementMode();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS:
				return isSetCacheJmsSessions();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientId != null : !CLIENT_ID_EDEFAULT.equals(clientId);
			case JMSPackage.GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF:
				return CONNECTION_FACTORY_REF_EDEFAULT == null ? connectionFactoryRef != null : !CONNECTION_FACTORY_REF_EDEFAULT.equals(connectionFactoryRef);
			case JMSPackage.GENERIC_CONNECTOR_TYPE__DURABLE:
				return isSetDurable();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER:
				return isSetEagerConsumer();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS:
				return isSetHonorQosHeaders();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY:
				return isSetMaxRedelivery();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__NO_LOCAL:
				return isSetNoLocal();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case JMSPackage.GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY:
				return isSetPersistentDelivery();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS:
				return isSetRecoverJmsConnections();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF:
				return REDELIVERY_HANDLER_REF_EDEFAULT == null ? redeliveryHandlerRef != null : !REDELIVERY_HANDLER_REF_EDEFAULT.equals(redeliveryHandlerRef);
			case JMSPackage.GENERIC_CONNECTOR_TYPE__SPECIFICATION:
				return isSetSpecification();
			case JMSPackage.GENERIC_CONNECTOR_TYPE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
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
		result.append(" (acknowledgementMode: ");
		if (acknowledgementModeESet) result.append(acknowledgementMode); else result.append("<unset>");
		result.append(", cacheJmsSessions: ");
		if (cacheJmsSessionsESet) result.append(cacheJmsSessions); else result.append("<unset>");
		result.append(", clientId: ");
		result.append(clientId);
		result.append(", connectionFactoryRef: ");
		result.append(connectionFactoryRef);
		result.append(", durable: ");
		if (durableESet) result.append(durable); else result.append("<unset>");
		result.append(", eagerConsumer: ");
		if (eagerConsumerESet) result.append(eagerConsumer); else result.append("<unset>");
		result.append(", honorQosHeaders: ");
		if (honorQosHeadersESet) result.append(honorQosHeaders); else result.append("<unset>");
		result.append(", maxRedelivery: ");
		if (maxRedeliveryESet) result.append(maxRedelivery); else result.append("<unset>");
		result.append(", noLocal: ");
		if (noLocalESet) result.append(noLocal); else result.append("<unset>");
		result.append(", password: ");
		result.append(password);
		result.append(", persistentDelivery: ");
		if (persistentDeliveryESet) result.append(persistentDelivery); else result.append("<unset>");
		result.append(", recoverJmsConnections: ");
		if (recoverJmsConnectionsESet) result.append(recoverJmsConnections); else result.append("<unset>");
		result.append(", redeliveryHandlerRef: ");
		result.append(redeliveryHandlerRef);
		result.append(", specification: ");
		if (specificationESet) result.append(specification); else result.append("<unset>");
		result.append(", username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //GenericConnectorTypeImpl
