/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.BaseTransactionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getActivemqConnector <em>Activemq Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getActivemqXaConnector <em>Activemq Xa Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getClientAckTransaction <em>Client Ack Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getCustomConnector <em>Custom Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getJmsmessageToObjectTransformer <em>Jmsmessage To Object Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getObjectToJmsmessageTransformer <em>Object To Jmsmessage Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getPropertyFilter <em>Property Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getWeblogicConnector <em>Weblogic Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getWebsphereConnector <em>Websphere Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.DocumentRoot#getXaTransaction <em>Xa Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Activemq Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activemq Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activemq Connector</em>' containment reference.
	 * @see #setActivemqConnector(ActiveMqConnectorType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_ActivemqConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='activemq-connector' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-connector'"
	 * @generated
	 */
	ActiveMqConnectorType getActivemqConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getActivemqConnector <em>Activemq Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activemq Connector</em>' containment reference.
	 * @see #getActivemqConnector()
	 * @generated
	 */
	void setActivemqConnector(ActiveMqConnectorType value);

	/**
	 * Returns the value of the '<em><b>Activemq Xa Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activemq Xa Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activemq Xa Connector</em>' containment reference.
	 * @see #setActivemqXaConnector(ActiveMqConnectorType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_ActivemqXaConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='activemq-xa-connector' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-connector'"
	 * @generated
	 */
	ActiveMqConnectorType getActivemqXaConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getActivemqXaConnector <em>Activemq Xa Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activemq Xa Connector</em>' containment reference.
	 * @see #getActivemqXaConnector()
	 * @generated
	 */
	void setActivemqXaConnector(ActiveMqConnectorType value);

	/**
	 * Returns the value of the '<em><b>Client Ack Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Ack Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Ack Transaction</em>' containment reference.
	 * @see #setClientAckTransaction(BaseTransactionType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_ClientAckTransaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='client-ack-transaction' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction'"
	 * @generated
	 */
	BaseTransactionType getClientAckTransaction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getClientAckTransaction <em>Client Ack Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Ack Transaction</em>' containment reference.
	 * @see #getClientAckTransaction()
	 * @generated
	 */
	void setClientAckTransaction(BaseTransactionType value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(GenericConnectorType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_Connector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-connector'"
	 * @generated
	 */
	GenericConnectorType getConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(GenericConnectorType value);

	/**
	 * Returns the value of the '<em><b>Custom Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Connector</em>' containment reference.
	 * @see #setCustomConnector(CustomConnectorType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_CustomConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-connector' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-connector'"
	 * @generated
	 */
	CustomConnectorType getCustomConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getCustomConnector <em>Custom Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Connector</em>' containment reference.
	 * @see #getCustomConnector()
	 * @generated
	 */
	void setCustomConnector(CustomConnectorType value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(GlobalEndpointType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_Endpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-global-endpoint'"
	 * @generated
	 */
	GlobalEndpointType getEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(GlobalEndpointType value);

	/**
	 * Returns the value of the '<em><b>Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Endpoint</em>' containment reference.
	 * @see #setInboundEndpoint(InboundEndpointType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_InboundEndpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inbound-endpoint' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-inbound-endpoint'"
	 * @generated
	 */
	InboundEndpointType getInboundEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Endpoint</em>' containment reference.
	 * @see #getInboundEndpoint()
	 * @generated
	 */
	void setInboundEndpoint(InboundEndpointType value);

	/**
	 * Returns the value of the '<em><b>Jmsmessage To Object Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jmsmessage To Object Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jmsmessage To Object Transformer</em>' containment reference.
	 * @see #setJmsmessageToObjectTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_JmsmessageToObjectTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jmsmessage-to-object-transformer' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getJmsmessageToObjectTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getJmsmessageToObjectTransformer <em>Jmsmessage To Object Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jmsmessage To Object Transformer</em>' containment reference.
	 * @see #getJmsmessageToObjectTransformer()
	 * @generated
	 */
	void setJmsmessageToObjectTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Object To Jmsmessage Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object To Jmsmessage Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object To Jmsmessage Transformer</em>' containment reference.
	 * @see #setObjectToJmsmessageTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_ObjectToJmsmessageTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-to-jmsmessage-transformer' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getObjectToJmsmessageTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getObjectToJmsmessageTransformer <em>Object To Jmsmessage Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object To Jmsmessage Transformer</em>' containment reference.
	 * @see #getObjectToJmsmessageTransformer()
	 * @generated
	 */
	void setObjectToJmsmessageTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Endpoint</em>' containment reference.
	 * @see #setOutboundEndpoint(OutboundEndpointType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_OutboundEndpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outbound-endpoint' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-outbound-endpoint'"
	 * @generated
	 */
	OutboundEndpointType getOutboundEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outbound Endpoint</em>' containment reference.
	 * @see #getOutboundEndpoint()
	 * @generated
	 */
	void setOutboundEndpoint(OutboundEndpointType value);

	/**
	 * Returns the value of the '<em><b>Property Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Filter</em>' containment reference.
	 * @see #setPropertyFilter(PropertyFilterType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_PropertyFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property-filter' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-filter'"
	 * @generated
	 */
	PropertyFilterType getPropertyFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getPropertyFilter <em>Property Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Filter</em>' containment reference.
	 * @see #getPropertyFilter()
	 * @generated
	 */
	void setPropertyFilter(PropertyFilterType value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference.
	 * @see #setTransaction(BaseTransactionType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_Transaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction'"
	 * @generated
	 */
	BaseTransactionType getTransaction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getTransaction <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' containment reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(BaseTransactionType value);

	/**
	 * Returns the value of the '<em><b>Weblogic Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weblogic Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weblogic Connector</em>' containment reference.
	 * @see #setWeblogicConnector(VendorJmsConnectorType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_WeblogicConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='weblogic-connector' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-connector'"
	 * @generated
	 */
	VendorJmsConnectorType getWeblogicConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getWeblogicConnector <em>Weblogic Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weblogic Connector</em>' containment reference.
	 * @see #getWeblogicConnector()
	 * @generated
	 */
	void setWeblogicConnector(VendorJmsConnectorType value);

	/**
	 * Returns the value of the '<em><b>Websphere Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Websphere Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Websphere Connector</em>' containment reference.
	 * @see #setWebsphereConnector(VendorJmsConnectorType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_WebsphereConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='websphere-connector' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-connector'"
	 * @generated
	 */
	VendorJmsConnectorType getWebsphereConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getWebsphereConnector <em>Websphere Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Websphere Connector</em>' containment reference.
	 * @see #getWebsphereConnector()
	 * @generated
	 */
	void setWebsphereConnector(VendorJmsConnectorType value);

	/**
	 * Returns the value of the '<em><b>Xa Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xa Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xa Transaction</em>' containment reference.
	 * @see #setXaTransaction(BaseTransactionType)
	 * @see org.mule.ide.config.jms.JMSPackage#getDocumentRoot_XaTransaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xa-transaction' namespace='##targetNamespace' affiliation='http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction'"
	 * @generated
	 */
	BaseTransactionType getXaTransaction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.DocumentRoot#getXaTransaction <em>Xa Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xa Transaction</em>' containment reference.
	 * @see #getXaTransaction()
	 * @generated
	 */
	void setXaTransaction(BaseTransactionType value);

} // DocumentRoot
