/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Overrides Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getDispatcherFactory <em>Dispatcher Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getEndpointBuilder <em>Endpoint Builder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getInboundTransformer <em>Inbound Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getMessageAdapter <em>Message Adapter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getMessageReceiver <em>Message Receiver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getOutboundTransformer <em>Outbound Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getResponseTransformer <em>Response Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getServiceFinder <em>Service Finder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getSessionHandler <em>Session Handler</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getStreamMessageAdapter <em>Stream Message Adapter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ServiceOverridesType#getTransactedMessageReceiver <em>Transacted Message Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType()
 * @model extendedMetaData="name='serviceOverridesType' kind='empty'"
 * @generated
 */
public interface ServiceOverridesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dispatcher Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatcher Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatcher Factory</em>' attribute.
	 * @see #setDispatcherFactory(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_DispatcherFactory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='dispatcherFactory'"
	 * @generated
	 */
	String getDispatcherFactory();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getDispatcherFactory <em>Dispatcher Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatcher Factory</em>' attribute.
	 * @see #getDispatcherFactory()
	 * @generated
	 */
	void setDispatcherFactory(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Builder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Builder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Builder</em>' attribute.
	 * @see #setEndpointBuilder(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_EndpointBuilder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='endpointBuilder'"
	 * @generated
	 */
	String getEndpointBuilder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getEndpointBuilder <em>Endpoint Builder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Builder</em>' attribute.
	 * @see #getEndpointBuilder()
	 * @generated
	 */
	void setEndpointBuilder(String value);

	/**
	 * Returns the value of the '<em><b>Inbound Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Transformer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Transformer</em>' attribute.
	 * @see #setInboundTransformer(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_InboundTransformer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='inboundTransformer'"
	 * @generated
	 */
	String getInboundTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getInboundTransformer <em>Inbound Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Transformer</em>' attribute.
	 * @see #getInboundTransformer()
	 * @generated
	 */
	void setInboundTransformer(String value);

	/**
	 * Returns the value of the '<em><b>Message Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Adapter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Adapter</em>' attribute.
	 * @see #setMessageAdapter(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_MessageAdapter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='messageAdapter'"
	 * @generated
	 */
	String getMessageAdapter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getMessageAdapter <em>Message Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Adapter</em>' attribute.
	 * @see #getMessageAdapter()
	 * @generated
	 */
	void setMessageAdapter(String value);

	/**
	 * Returns the value of the '<em><b>Message Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Receiver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Receiver</em>' attribute.
	 * @see #setMessageReceiver(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_MessageReceiver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='messageReceiver'"
	 * @generated
	 */
	String getMessageReceiver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getMessageReceiver <em>Message Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Receiver</em>' attribute.
	 * @see #getMessageReceiver()
	 * @generated
	 */
	void setMessageReceiver(String value);

	/**
	 * Returns the value of the '<em><b>Outbound Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Transformer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Transformer</em>' attribute.
	 * @see #setOutboundTransformer(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_OutboundTransformer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='outboundTransformer'"
	 * @generated
	 */
	String getOutboundTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getOutboundTransformer <em>Outbound Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outbound Transformer</em>' attribute.
	 * @see #getOutboundTransformer()
	 * @generated
	 */
	void setOutboundTransformer(String value);

	/**
	 * Returns the value of the '<em><b>Response Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Transformer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Transformer</em>' attribute.
	 * @see #setResponseTransformer(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_ResponseTransformer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='responseTransformer'"
	 * @generated
	 */
	String getResponseTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getResponseTransformer <em>Response Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Transformer</em>' attribute.
	 * @see #getResponseTransformer()
	 * @generated
	 */
	void setResponseTransformer(String value);

	/**
	 * Returns the value of the '<em><b>Service Finder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Finder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Finder</em>' attribute.
	 * @see #setServiceFinder(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_ServiceFinder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='serviceFinder'"
	 * @generated
	 */
	String getServiceFinder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getServiceFinder <em>Service Finder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Finder</em>' attribute.
	 * @see #getServiceFinder()
	 * @generated
	 */
	void setServiceFinder(String value);

	/**
	 * Returns the value of the '<em><b>Session Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Handler</em>' attribute.
	 * @see #setSessionHandler(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_SessionHandler()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='sessionHandler'"
	 * @generated
	 */
	String getSessionHandler();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getSessionHandler <em>Session Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Handler</em>' attribute.
	 * @see #getSessionHandler()
	 * @generated
	 */
	void setSessionHandler(String value);

	/**
	 * Returns the value of the '<em><b>Stream Message Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Message Adapter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Message Adapter</em>' attribute.
	 * @see #setStreamMessageAdapter(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_StreamMessageAdapter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='streamMessageAdapter'"
	 * @generated
	 */
	String getStreamMessageAdapter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getStreamMessageAdapter <em>Stream Message Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Message Adapter</em>' attribute.
	 * @see #getStreamMessageAdapter()
	 * @generated
	 */
	void setStreamMessageAdapter(String value);

	/**
	 * Returns the value of the '<em><b>Transacted Message Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transacted Message Receiver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transacted Message Receiver</em>' attribute.
	 * @see #setTransactedMessageReceiver(String)
	 * @see org.mule.ide.config.core.CorePackage#getServiceOverridesType_TransactedMessageReceiver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='transactedMessageReceiver'"
	 * @generated
	 */
	String getTransactedMessageReceiver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ServiceOverridesType#getTransactedMessageReceiver <em>Transacted Message Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transacted Message Receiver</em>' attribute.
	 * @see #getTransactedMessageReceiver()
	 * @generated
	 */
	void setTransactedMessageReceiver(String value);

} // ServiceOverridesType
