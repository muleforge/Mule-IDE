/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;

import org.mule.ide.config.core.ConnectorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getAcknowledgementMode <em>Acknowledgement Mode</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#isCacheJmsSessions <em>Cache Jms Sessions</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getConnectionFactoryRef <em>Connection Factory Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#isDurable <em>Durable</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#isEagerConsumer <em>Eager Consumer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#isHonorQosHeaders <em>Honor Qos Headers</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getMaxRedelivery <em>Max Redelivery</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#isNoLocal <em>No Local</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#isPersistentDelivery <em>Persistent Delivery</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#isRecoverJmsConnections <em>Recover Jms Connections</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getRedeliveryHandlerRef <em>Redelivery Handler Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GenericConnectorType#getUsername <em>Username</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType()
 * @model extendedMetaData="name='genericConnectorType' kind='elementOnly'"
 * @generated
 */
public interface GenericConnectorType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Acknowledgement Mode</b></em>' attribute.
	 * The default value is <code>"AUTO_ACKNOWLEDGE"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.jms.AcknowledgementModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acknowledgement Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acknowledgement Mode</em>' attribute.
	 * @see org.mule.ide.config.jms.AcknowledgementModeType
	 * @see #isSetAcknowledgementMode()
	 * @see #unsetAcknowledgementMode()
	 * @see #setAcknowledgementMode(AcknowledgementModeType)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_AcknowledgementMode()
	 * @model default="AUTO_ACKNOWLEDGE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='acknowledgementMode'"
	 * @generated
	 */
	AcknowledgementModeType getAcknowledgementMode();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getAcknowledgementMode <em>Acknowledgement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledgement Mode</em>' attribute.
	 * @see org.mule.ide.config.jms.AcknowledgementModeType
	 * @see #isSetAcknowledgementMode()
	 * @see #unsetAcknowledgementMode()
	 * @see #getAcknowledgementMode()
	 * @generated
	 */
	void setAcknowledgementMode(AcknowledgementModeType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getAcknowledgementMode <em>Acknowledgement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcknowledgementMode()
	 * @see #getAcknowledgementMode()
	 * @see #setAcknowledgementMode(AcknowledgementModeType)
	 * @generated
	 */
	void unsetAcknowledgementMode();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getAcknowledgementMode <em>Acknowledgement Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acknowledgement Mode</em>' attribute is set.
	 * @see #unsetAcknowledgementMode()
	 * @see #getAcknowledgementMode()
	 * @see #setAcknowledgementMode(AcknowledgementModeType)
	 * @generated
	 */
	boolean isSetAcknowledgementMode();

	/**
	 * Returns the value of the '<em><b>Cache Jms Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Jms Sessions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Jms Sessions</em>' attribute.
	 * @see #isSetCacheJmsSessions()
	 * @see #unsetCacheJmsSessions()
	 * @see #setCacheJmsSessions(boolean)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_CacheJmsSessions()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='cacheJmsSessions'"
	 * @generated
	 */
	boolean isCacheJmsSessions();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isCacheJmsSessions <em>Cache Jms Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Jms Sessions</em>' attribute.
	 * @see #isSetCacheJmsSessions()
	 * @see #unsetCacheJmsSessions()
	 * @see #isCacheJmsSessions()
	 * @generated
	 */
	void setCacheJmsSessions(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isCacheJmsSessions <em>Cache Jms Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheJmsSessions()
	 * @see #isCacheJmsSessions()
	 * @see #setCacheJmsSessions(boolean)
	 * @generated
	 */
	void unsetCacheJmsSessions();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isCacheJmsSessions <em>Cache Jms Sessions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cache Jms Sessions</em>' attribute is set.
	 * @see #unsetCacheJmsSessions()
	 * @see #isCacheJmsSessions()
	 * @see #setCacheJmsSessions(boolean)
	 * @generated
	 */
	boolean isSetCacheJmsSessions();

	/**
	 * Returns the value of the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Id</em>' attribute.
	 * @see #setClientId(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_ClientId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientId'"
	 * @generated
	 */
	String getClientId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getClientId <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Id</em>' attribute.
	 * @see #getClientId()
	 * @generated
	 */
	void setClientId(String value);

	/**
	 * Returns the value of the '<em><b>Connection Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Factory Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Factory Ref</em>' attribute.
	 * @see #setConnectionFactoryRef(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_ConnectionFactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='connectionFactory-ref'"
	 * @generated
	 */
	String getConnectionFactoryRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getConnectionFactoryRef <em>Connection Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Factory Ref</em>' attribute.
	 * @see #getConnectionFactoryRef()
	 * @generated
	 */
	void setConnectionFactoryRef(String value);

	/**
	 * Returns the value of the '<em><b>Durable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durable</em>' attribute.
	 * @see #isSetDurable()
	 * @see #unsetDurable()
	 * @see #setDurable(boolean)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_Durable()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='durable'"
	 * @generated
	 */
	boolean isDurable();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isDurable <em>Durable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durable</em>' attribute.
	 * @see #isSetDurable()
	 * @see #unsetDurable()
	 * @see #isDurable()
	 * @generated
	 */
	void setDurable(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isDurable <em>Durable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurable()
	 * @see #isDurable()
	 * @see #setDurable(boolean)
	 * @generated
	 */
	void unsetDurable();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isDurable <em>Durable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Durable</em>' attribute is set.
	 * @see #unsetDurable()
	 * @see #isDurable()
	 * @see #setDurable(boolean)
	 * @generated
	 */
	boolean isSetDurable();

	/**
	 * Returns the value of the '<em><b>Eager Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eager Consumer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eager Consumer</em>' attribute.
	 * @see #isSetEagerConsumer()
	 * @see #unsetEagerConsumer()
	 * @see #setEagerConsumer(boolean)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_EagerConsumer()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='eagerConsumer'"
	 * @generated
	 */
	boolean isEagerConsumer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isEagerConsumer <em>Eager Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eager Consumer</em>' attribute.
	 * @see #isSetEagerConsumer()
	 * @see #unsetEagerConsumer()
	 * @see #isEagerConsumer()
	 * @generated
	 */
	void setEagerConsumer(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isEagerConsumer <em>Eager Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEagerConsumer()
	 * @see #isEagerConsumer()
	 * @see #setEagerConsumer(boolean)
	 * @generated
	 */
	void unsetEagerConsumer();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isEagerConsumer <em>Eager Consumer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eager Consumer</em>' attribute is set.
	 * @see #unsetEagerConsumer()
	 * @see #isEagerConsumer()
	 * @see #setEagerConsumer(boolean)
	 * @generated
	 */
	boolean isSetEagerConsumer();

	/**
	 * Returns the value of the '<em><b>Honor Qos Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Honor Qos Headers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Honor Qos Headers</em>' attribute.
	 * @see #isSetHonorQosHeaders()
	 * @see #unsetHonorQosHeaders()
	 * @see #setHonorQosHeaders(boolean)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_HonorQosHeaders()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='honorQosHeaders'"
	 * @generated
	 */
	boolean isHonorQosHeaders();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isHonorQosHeaders <em>Honor Qos Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Honor Qos Headers</em>' attribute.
	 * @see #isSetHonorQosHeaders()
	 * @see #unsetHonorQosHeaders()
	 * @see #isHonorQosHeaders()
	 * @generated
	 */
	void setHonorQosHeaders(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isHonorQosHeaders <em>Honor Qos Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHonorQosHeaders()
	 * @see #isHonorQosHeaders()
	 * @see #setHonorQosHeaders(boolean)
	 * @generated
	 */
	void unsetHonorQosHeaders();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isHonorQosHeaders <em>Honor Qos Headers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Honor Qos Headers</em>' attribute is set.
	 * @see #unsetHonorQosHeaders()
	 * @see #isHonorQosHeaders()
	 * @see #setHonorQosHeaders(boolean)
	 * @generated
	 */
	boolean isSetHonorQosHeaders();

	/**
	 * Returns the value of the '<em><b>Max Redelivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Redelivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Redelivery</em>' attribute.
	 * @see #isSetMaxRedelivery()
	 * @see #unsetMaxRedelivery()
	 * @see #setMaxRedelivery(int)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_MaxRedelivery()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='maxRedelivery'"
	 * @generated
	 */
	int getMaxRedelivery();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getMaxRedelivery <em>Max Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Redelivery</em>' attribute.
	 * @see #isSetMaxRedelivery()
	 * @see #unsetMaxRedelivery()
	 * @see #getMaxRedelivery()
	 * @generated
	 */
	void setMaxRedelivery(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getMaxRedelivery <em>Max Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRedelivery()
	 * @see #getMaxRedelivery()
	 * @see #setMaxRedelivery(int)
	 * @generated
	 */
	void unsetMaxRedelivery();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getMaxRedelivery <em>Max Redelivery</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Redelivery</em>' attribute is set.
	 * @see #unsetMaxRedelivery()
	 * @see #getMaxRedelivery()
	 * @see #setMaxRedelivery(int)
	 * @generated
	 */
	boolean isSetMaxRedelivery();

	/**
	 * Returns the value of the '<em><b>No Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Local</em>' attribute.
	 * @see #isSetNoLocal()
	 * @see #unsetNoLocal()
	 * @see #setNoLocal(boolean)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_NoLocal()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='noLocal'"
	 * @generated
	 */
	boolean isNoLocal();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isNoLocal <em>No Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Local</em>' attribute.
	 * @see #isSetNoLocal()
	 * @see #unsetNoLocal()
	 * @see #isNoLocal()
	 * @generated
	 */
	void setNoLocal(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isNoLocal <em>No Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoLocal()
	 * @see #isNoLocal()
	 * @see #setNoLocal(boolean)
	 * @generated
	 */
	void unsetNoLocal();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isNoLocal <em>No Local</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>No Local</em>' attribute is set.
	 * @see #unsetNoLocal()
	 * @see #isNoLocal()
	 * @see #setNoLocal(boolean)
	 * @generated
	 */
	boolean isSetNoLocal();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Persistent Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent Delivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Delivery</em>' attribute.
	 * @see #isSetPersistentDelivery()
	 * @see #unsetPersistentDelivery()
	 * @see #setPersistentDelivery(boolean)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_PersistentDelivery()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='persistentDelivery'"
	 * @generated
	 */
	boolean isPersistentDelivery();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isPersistentDelivery <em>Persistent Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Delivery</em>' attribute.
	 * @see #isSetPersistentDelivery()
	 * @see #unsetPersistentDelivery()
	 * @see #isPersistentDelivery()
	 * @generated
	 */
	void setPersistentDelivery(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isPersistentDelivery <em>Persistent Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistentDelivery()
	 * @see #isPersistentDelivery()
	 * @see #setPersistentDelivery(boolean)
	 * @generated
	 */
	void unsetPersistentDelivery();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isPersistentDelivery <em>Persistent Delivery</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistent Delivery</em>' attribute is set.
	 * @see #unsetPersistentDelivery()
	 * @see #isPersistentDelivery()
	 * @see #setPersistentDelivery(boolean)
	 * @generated
	 */
	boolean isSetPersistentDelivery();

	/**
	 * Returns the value of the '<em><b>Recover Jms Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recover Jms Connections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recover Jms Connections</em>' attribute.
	 * @see #isSetRecoverJmsConnections()
	 * @see #unsetRecoverJmsConnections()
	 * @see #setRecoverJmsConnections(boolean)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_RecoverJmsConnections()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='recoverJmsConnections'"
	 * @generated
	 */
	boolean isRecoverJmsConnections();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isRecoverJmsConnections <em>Recover Jms Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recover Jms Connections</em>' attribute.
	 * @see #isSetRecoverJmsConnections()
	 * @see #unsetRecoverJmsConnections()
	 * @see #isRecoverJmsConnections()
	 * @generated
	 */
	void setRecoverJmsConnections(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isRecoverJmsConnections <em>Recover Jms Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecoverJmsConnections()
	 * @see #isRecoverJmsConnections()
	 * @see #setRecoverJmsConnections(boolean)
	 * @generated
	 */
	void unsetRecoverJmsConnections();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#isRecoverJmsConnections <em>Recover Jms Connections</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recover Jms Connections</em>' attribute is set.
	 * @see #unsetRecoverJmsConnections()
	 * @see #isRecoverJmsConnections()
	 * @see #setRecoverJmsConnections(boolean)
	 * @generated
	 */
	boolean isSetRecoverJmsConnections();

	/**
	 * Returns the value of the '<em><b>Redelivery Handler Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Handler Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redelivery Handler Ref</em>' attribute.
	 * @see #setRedeliveryHandlerRef(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_RedeliveryHandlerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='redeliveryHandler-ref'"
	 * @generated
	 */
	String getRedeliveryHandlerRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getRedeliveryHandlerRef <em>Redelivery Handler Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Handler Ref</em>' attribute.
	 * @see #getRedeliveryHandlerRef()
	 * @generated
	 */
	void setRedeliveryHandlerRef(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * The default value is <code>"1.0.2b"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.jms.SpecificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see org.mule.ide.config.jms.SpecificationType
	 * @see #isSetSpecification()
	 * @see #unsetSpecification()
	 * @see #setSpecification(SpecificationType)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_Specification()
	 * @model default="1.0.2b" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='specification'"
	 * @generated
	 */
	SpecificationType getSpecification();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see org.mule.ide.config.jms.SpecificationType
	 * @see #isSetSpecification()
	 * @see #unsetSpecification()
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SpecificationType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecification()
	 * @see #getSpecification()
	 * @see #setSpecification(SpecificationType)
	 * @generated
	 */
	void unsetSpecification();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getSpecification <em>Specification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specification</em>' attribute is set.
	 * @see #unsetSpecification()
	 * @see #getSpecification()
	 * @see #setSpecification(SpecificationType)
	 * @generated
	 */
	boolean isSetSpecification();

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getGenericConnectorType_Username()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GenericConnectorType#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // GenericConnectorType
