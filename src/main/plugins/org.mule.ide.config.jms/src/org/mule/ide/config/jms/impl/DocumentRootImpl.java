/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractTransformerType;

import org.mule.ide.config.jms.ActiveMqConnectorType;
import org.mule.ide.config.jms.CustomConnectorType;
import org.mule.ide.config.jms.DocumentRoot;
import org.mule.ide.config.jms.GenericConnectorType;
import org.mule.ide.config.jms.GlobalEndpointType;
import org.mule.ide.config.jms.InboundEndpointType;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.jms.JmsTransactionType;
import org.mule.ide.config.jms.OutboundEndpointType;
import org.mule.ide.config.jms.PropertyFilterType;
import org.mule.ide.config.jms.VendorJmsConnectorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getActivemqConnector <em>Activemq Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getActivemqXaConnector <em>Activemq Xa Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getClientAckTransaction <em>Client Ack Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getCustomConnector <em>Custom Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getInboundEndpoint <em>Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getJmsmessageToObjectTransformer <em>Jmsmessage To Object Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getObjectToJmsmessageTransformer <em>Object To Jmsmessage Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getOutboundEndpoint <em>Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getPropertyFilter <em>Property Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getWeblogicConnector <em>Weblogic Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getWebsphereConnector <em>Websphere Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.DocumentRootImpl#getXaTransaction <em>Xa Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JMSPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, JMSPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, JMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, JMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveMqConnectorType getActivemqConnector() {
		return (ActiveMqConnectorType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivemqConnector(ActiveMqConnectorType newActivemqConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR, newActivemqConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivemqConnector(ActiveMqConnectorType newActivemqConnector) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR, newActivemqConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveMqConnectorType getActivemqXaConnector() {
		return (ActiveMqConnectorType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivemqXaConnector(ActiveMqConnectorType newActivemqXaConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR, newActivemqXaConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivemqXaConnector(ActiveMqConnectorType newActivemqXaConnector) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR, newActivemqXaConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmsTransactionType getClientAckTransaction() {
		return (JmsTransactionType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientAckTransaction(JmsTransactionType newClientAckTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION, newClientAckTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientAckTransaction(JmsTransactionType newClientAckTransaction) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION, newClientAckTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericConnectorType getConnector() {
		return (GenericConnectorType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(GenericConnectorType newConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(GenericConnectorType newConnector) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConnectorType getCustomConnector() {
		return (CustomConnectorType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__CUSTOM_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomConnector(CustomConnectorType newCustomConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__CUSTOM_CONNECTOR, newCustomConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomConnector(CustomConnectorType newCustomConnector) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__CUSTOM_CONNECTOR, newCustomConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalEndpointType getEndpoint() {
		return (GlobalEndpointType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(GlobalEndpointType newEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__ENDPOINT, newEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(GlobalEndpointType newEndpoint) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__ENDPOINT, newEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundEndpointType getInboundEndpoint() {
		return (InboundEndpointType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundEndpoint(InboundEndpointType newInboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT, newInboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundEndpoint(InboundEndpointType newInboundEndpoint) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT, newInboundEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getJmsmessageToObjectTransformer() {
		return (AbstractTransformerType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJmsmessageToObjectTransformer(AbstractTransformerType newJmsmessageToObjectTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER, newJmsmessageToObjectTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmsmessageToObjectTransformer(AbstractTransformerType newJmsmessageToObjectTransformer) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER, newJmsmessageToObjectTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getObjectToJmsmessageTransformer() {
		return (AbstractTransformerType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectToJmsmessageTransformer(AbstractTransformerType newObjectToJmsmessageTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER, newObjectToJmsmessageTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectToJmsmessageTransformer(AbstractTransformerType newObjectToJmsmessageTransformer) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER, newObjectToJmsmessageTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundEndpointType getOutboundEndpoint() {
		return (OutboundEndpointType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutboundEndpoint(OutboundEndpointType newOutboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT, newOutboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundEndpoint(OutboundEndpointType newOutboundEndpoint) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT, newOutboundEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFilterType getPropertyFilter() {
		return (PropertyFilterType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__PROPERTY_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyFilter(PropertyFilterType newPropertyFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__PROPERTY_FILTER, newPropertyFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyFilter(PropertyFilterType newPropertyFilter) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__PROPERTY_FILTER, newPropertyFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmsTransactionType getTransaction() {
		return (JmsTransactionType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(JmsTransactionType newTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__TRANSACTION, newTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(JmsTransactionType newTransaction) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__TRANSACTION, newTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorJmsConnectorType getWeblogicConnector() {
		return (VendorJmsConnectorType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeblogicConnector(VendorJmsConnectorType newWeblogicConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR, newWeblogicConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeblogicConnector(VendorJmsConnectorType newWeblogicConnector) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR, newWeblogicConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorJmsConnectorType getWebsphereConnector() {
		return (VendorJmsConnectorType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebsphereConnector(VendorJmsConnectorType newWebsphereConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR, newWebsphereConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsphereConnector(VendorJmsConnectorType newWebsphereConnector) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR, newWebsphereConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmsTransactionType getXaTransaction() {
		return (JmsTransactionType)getMixed().get(JMSPackage.Literals.DOCUMENT_ROOT__XA_TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXaTransaction(JmsTransactionType newXaTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(JMSPackage.Literals.DOCUMENT_ROOT__XA_TRANSACTION, newXaTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXaTransaction(JmsTransactionType newXaTransaction) {
		((FeatureMap.Internal)getMixed()).set(JMSPackage.Literals.DOCUMENT_ROOT__XA_TRANSACTION, newXaTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JMSPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case JMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case JMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR:
				return basicSetActivemqConnector(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR:
				return basicSetActivemqXaConnector(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION:
				return basicSetClientAckTransaction(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__CONNECTOR:
				return basicSetConnector(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return basicSetCustomConnector(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return basicSetInboundEndpoint(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER:
				return basicSetJmsmessageToObjectTransformer(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER:
				return basicSetObjectToJmsmessageTransformer(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return basicSetOutboundEndpoint(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__PROPERTY_FILTER:
				return basicSetPropertyFilter(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR:
				return basicSetWeblogicConnector(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR:
				return basicSetWebsphereConnector(null, msgs);
			case JMSPackage.DOCUMENT_ROOT__XA_TRANSACTION:
				return basicSetXaTransaction(null, msgs);
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
			case JMSPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case JMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case JMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR:
				return getActivemqConnector();
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR:
				return getActivemqXaConnector();
			case JMSPackage.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION:
				return getClientAckTransaction();
			case JMSPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector();
			case JMSPackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return getCustomConnector();
			case JMSPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case JMSPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return getInboundEndpoint();
			case JMSPackage.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER:
				return getJmsmessageToObjectTransformer();
			case JMSPackage.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER:
				return getObjectToJmsmessageTransformer();
			case JMSPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return getOutboundEndpoint();
			case JMSPackage.DOCUMENT_ROOT__PROPERTY_FILTER:
				return getPropertyFilter();
			case JMSPackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction();
			case JMSPackage.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR:
				return getWeblogicConnector();
			case JMSPackage.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR:
				return getWebsphereConnector();
			case JMSPackage.DOCUMENT_ROOT__XA_TRANSACTION:
				return getXaTransaction();
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
			case JMSPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR:
				setActivemqConnector((ActiveMqConnectorType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR:
				setActivemqXaConnector((ActiveMqConnectorType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION:
				setClientAckTransaction((JmsTransactionType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((GenericConnectorType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				setCustomConnector((CustomConnectorType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				setInboundEndpoint((InboundEndpointType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER:
				setJmsmessageToObjectTransformer((AbstractTransformerType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER:
				setObjectToJmsmessageTransformer((AbstractTransformerType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				setOutboundEndpoint((OutboundEndpointType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__PROPERTY_FILTER:
				setPropertyFilter((PropertyFilterType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((JmsTransactionType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR:
				setWeblogicConnector((VendorJmsConnectorType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR:
				setWebsphereConnector((VendorJmsConnectorType)newValue);
				return;
			case JMSPackage.DOCUMENT_ROOT__XA_TRANSACTION:
				setXaTransaction((JmsTransactionType)newValue);
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
			case JMSPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case JMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case JMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR:
				setActivemqConnector((ActiveMqConnectorType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR:
				setActivemqXaConnector((ActiveMqConnectorType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION:
				setClientAckTransaction((JmsTransactionType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((GenericConnectorType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				setCustomConnector((CustomConnectorType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				setInboundEndpoint((InboundEndpointType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER:
				setJmsmessageToObjectTransformer((AbstractTransformerType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER:
				setObjectToJmsmessageTransformer((AbstractTransformerType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				setOutboundEndpoint((OutboundEndpointType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__PROPERTY_FILTER:
				setPropertyFilter((PropertyFilterType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((JmsTransactionType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR:
				setWeblogicConnector((VendorJmsConnectorType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR:
				setWebsphereConnector((VendorJmsConnectorType)null);
				return;
			case JMSPackage.DOCUMENT_ROOT__XA_TRANSACTION:
				setXaTransaction((JmsTransactionType)null);
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
			case JMSPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case JMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case JMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR:
				return getActivemqConnector() != null;
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR:
				return getActivemqXaConnector() != null;
			case JMSPackage.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION:
				return getClientAckTransaction() != null;
			case JMSPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector() != null;
			case JMSPackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return getCustomConnector() != null;
			case JMSPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case JMSPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return getInboundEndpoint() != null;
			case JMSPackage.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER:
				return getJmsmessageToObjectTransformer() != null;
			case JMSPackage.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER:
				return getObjectToJmsmessageTransformer() != null;
			case JMSPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return getOutboundEndpoint() != null;
			case JMSPackage.DOCUMENT_ROOT__PROPERTY_FILTER:
				return getPropertyFilter() != null;
			case JMSPackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction() != null;
			case JMSPackage.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR:
				return getWeblogicConnector() != null;
			case JMSPackage.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR:
				return getWebsphereConnector() != null;
			case JMSPackage.DOCUMENT_ROOT__XA_TRANSACTION:
				return getXaTransaction() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
