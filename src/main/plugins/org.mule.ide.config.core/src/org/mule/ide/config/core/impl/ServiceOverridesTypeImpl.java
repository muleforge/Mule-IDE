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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ServiceOverridesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Overrides Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getDispatcherFactory <em>Dispatcher Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getEndpointBuilder <em>Endpoint Builder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getInboundTransformer <em>Inbound Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getMessageAdapter <em>Message Adapter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getMessageReceiver <em>Message Receiver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getOutboundTransformer <em>Outbound Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getResponseTransformer <em>Response Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getServiceFinder <em>Service Finder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getSessionHandler <em>Session Handler</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getStreamMessageAdapter <em>Stream Message Adapter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl#getTransactedMessageReceiver <em>Transacted Message Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceOverridesTypeImpl extends EObjectImpl implements ServiceOverridesType {
	/**
	 * The default value of the '{@link #getDispatcherFactory() <em>Dispatcher Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatcherFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPATCHER_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDispatcherFactory() <em>Dispatcher Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatcherFactory()
	 * @generated
	 * @ordered
	 */
	protected String dispatcherFactory = DISPATCHER_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointBuilder() <em>Endpoint Builder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointBuilder()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_BUILDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointBuilder() <em>Endpoint Builder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointBuilder()
	 * @generated
	 * @ordered
	 */
	protected String endpointBuilder = ENDPOINT_BUILDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInboundTransformer() <em>Inbound Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundTransformer()
	 * @generated
	 * @ordered
	 */
	protected static final String INBOUND_TRANSFORMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInboundTransformer() <em>Inbound Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundTransformer()
	 * @generated
	 * @ordered
	 */
	protected String inboundTransformer = INBOUND_TRANSFORMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageAdapter() <em>Message Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ADAPTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageAdapter() <em>Message Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageAdapter()
	 * @generated
	 * @ordered
	 */
	protected String messageAdapter = MESSAGE_ADAPTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageReceiver() <em>Message Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageReceiver()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_RECEIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageReceiver() <em>Message Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageReceiver()
	 * @generated
	 * @ordered
	 */
	protected String messageReceiver = MESSAGE_RECEIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutboundTransformer() <em>Outbound Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundTransformer()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTBOUND_TRANSFORMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutboundTransformer() <em>Outbound Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundTransformer()
	 * @generated
	 * @ordered
	 */
	protected String outboundTransformer = OUTBOUND_TRANSFORMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTransformer() <em>Response Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTransformer()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TRANSFORMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTransformer() <em>Response Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTransformer()
	 * @generated
	 * @ordered
	 */
	protected String responseTransformer = RESPONSE_TRANSFORMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceFinder() <em>Service Finder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFinder()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_FINDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceFinder() <em>Service Finder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFinder()
	 * @generated
	 * @ordered
	 */
	protected String serviceFinder = SERVICE_FINDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionHandler() <em>Session Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionHandler() <em>Session Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionHandler()
	 * @generated
	 * @ordered
	 */
	protected String sessionHandler = SESSION_HANDLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreamMessageAdapter() <em>Stream Message Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamMessageAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_MESSAGE_ADAPTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamMessageAdapter() <em>Stream Message Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamMessageAdapter()
	 * @generated
	 * @ordered
	 */
	protected String streamMessageAdapter = STREAM_MESSAGE_ADAPTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactedMessageReceiver() <em>Transacted Message Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactedMessageReceiver()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTED_MESSAGE_RECEIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactedMessageReceiver() <em>Transacted Message Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactedMessageReceiver()
	 * @generated
	 * @ordered
	 */
	protected String transactedMessageReceiver = TRANSACTED_MESSAGE_RECEIVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOverridesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getServiceOverridesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDispatcherFactory() {
		return dispatcherFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatcherFactory(String newDispatcherFactory) {
		String oldDispatcherFactory = dispatcherFactory;
		dispatcherFactory = newDispatcherFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__DISPATCHER_FACTORY, oldDispatcherFactory, dispatcherFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointBuilder() {
		return endpointBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointBuilder(String newEndpointBuilder) {
		String oldEndpointBuilder = endpointBuilder;
		endpointBuilder = newEndpointBuilder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__ENDPOINT_BUILDER, oldEndpointBuilder, endpointBuilder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInboundTransformer() {
		return inboundTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundTransformer(String newInboundTransformer) {
		String oldInboundTransformer = inboundTransformer;
		inboundTransformer = newInboundTransformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__INBOUND_TRANSFORMER, oldInboundTransformer, inboundTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageAdapter() {
		return messageAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageAdapter(String newMessageAdapter) {
		String oldMessageAdapter = messageAdapter;
		messageAdapter = newMessageAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_ADAPTER, oldMessageAdapter, messageAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageReceiver() {
		return messageReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageReceiver(String newMessageReceiver) {
		String oldMessageReceiver = messageReceiver;
		messageReceiver = newMessageReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_RECEIVER, oldMessageReceiver, messageReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutboundTransformer() {
		return outboundTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundTransformer(String newOutboundTransformer) {
		String oldOutboundTransformer = outboundTransformer;
		outboundTransformer = newOutboundTransformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__OUTBOUND_TRANSFORMER, oldOutboundTransformer, outboundTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseTransformer() {
		return responseTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTransformer(String newResponseTransformer) {
		String oldResponseTransformer = responseTransformer;
		responseTransformer = newResponseTransformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__RESPONSE_TRANSFORMER, oldResponseTransformer, responseTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceFinder() {
		return serviceFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFinder(String newServiceFinder) {
		String oldServiceFinder = serviceFinder;
		serviceFinder = newServiceFinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__SERVICE_FINDER, oldServiceFinder, serviceFinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSessionHandler() {
		return sessionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionHandler(String newSessionHandler) {
		String oldSessionHandler = sessionHandler;
		sessionHandler = newSessionHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__SESSION_HANDLER, oldSessionHandler, sessionHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreamMessageAdapter() {
		return streamMessageAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamMessageAdapter(String newStreamMessageAdapter) {
		String oldStreamMessageAdapter = streamMessageAdapter;
		streamMessageAdapter = newStreamMessageAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER, oldStreamMessageAdapter, streamMessageAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactedMessageReceiver() {
		return transactedMessageReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactedMessageReceiver(String newTransactedMessageReceiver) {
		String oldTransactedMessageReceiver = transactedMessageReceiver;
		transactedMessageReceiver = newTransactedMessageReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER, oldTransactedMessageReceiver, transactedMessageReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SERVICE_OVERRIDES_TYPE__DISPATCHER_FACTORY:
				return getDispatcherFactory();
			case CorePackage.SERVICE_OVERRIDES_TYPE__ENDPOINT_BUILDER:
				return getEndpointBuilder();
			case CorePackage.SERVICE_OVERRIDES_TYPE__INBOUND_TRANSFORMER:
				return getInboundTransformer();
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_ADAPTER:
				return getMessageAdapter();
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_RECEIVER:
				return getMessageReceiver();
			case CorePackage.SERVICE_OVERRIDES_TYPE__OUTBOUND_TRANSFORMER:
				return getOutboundTransformer();
			case CorePackage.SERVICE_OVERRIDES_TYPE__RESPONSE_TRANSFORMER:
				return getResponseTransformer();
			case CorePackage.SERVICE_OVERRIDES_TYPE__SERVICE_FINDER:
				return getServiceFinder();
			case CorePackage.SERVICE_OVERRIDES_TYPE__SESSION_HANDLER:
				return getSessionHandler();
			case CorePackage.SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER:
				return getStreamMessageAdapter();
			case CorePackage.SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER:
				return getTransactedMessageReceiver();
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
			case CorePackage.SERVICE_OVERRIDES_TYPE__DISPATCHER_FACTORY:
				setDispatcherFactory((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__ENDPOINT_BUILDER:
				setEndpointBuilder((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__INBOUND_TRANSFORMER:
				setInboundTransformer((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_ADAPTER:
				setMessageAdapter((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_RECEIVER:
				setMessageReceiver((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__OUTBOUND_TRANSFORMER:
				setOutboundTransformer((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__RESPONSE_TRANSFORMER:
				setResponseTransformer((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__SERVICE_FINDER:
				setServiceFinder((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__SESSION_HANDLER:
				setSessionHandler((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER:
				setStreamMessageAdapter((String)newValue);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER:
				setTransactedMessageReceiver((String)newValue);
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
			case CorePackage.SERVICE_OVERRIDES_TYPE__DISPATCHER_FACTORY:
				setDispatcherFactory(DISPATCHER_FACTORY_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__ENDPOINT_BUILDER:
				setEndpointBuilder(ENDPOINT_BUILDER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__INBOUND_TRANSFORMER:
				setInboundTransformer(INBOUND_TRANSFORMER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_ADAPTER:
				setMessageAdapter(MESSAGE_ADAPTER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_RECEIVER:
				setMessageReceiver(MESSAGE_RECEIVER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__OUTBOUND_TRANSFORMER:
				setOutboundTransformer(OUTBOUND_TRANSFORMER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__RESPONSE_TRANSFORMER:
				setResponseTransformer(RESPONSE_TRANSFORMER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__SERVICE_FINDER:
				setServiceFinder(SERVICE_FINDER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__SESSION_HANDLER:
				setSessionHandler(SESSION_HANDLER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER:
				setStreamMessageAdapter(STREAM_MESSAGE_ADAPTER_EDEFAULT);
				return;
			case CorePackage.SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER:
				setTransactedMessageReceiver(TRANSACTED_MESSAGE_RECEIVER_EDEFAULT);
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
			case CorePackage.SERVICE_OVERRIDES_TYPE__DISPATCHER_FACTORY:
				return DISPATCHER_FACTORY_EDEFAULT == null ? dispatcherFactory != null : !DISPATCHER_FACTORY_EDEFAULT.equals(dispatcherFactory);
			case CorePackage.SERVICE_OVERRIDES_TYPE__ENDPOINT_BUILDER:
				return ENDPOINT_BUILDER_EDEFAULT == null ? endpointBuilder != null : !ENDPOINT_BUILDER_EDEFAULT.equals(endpointBuilder);
			case CorePackage.SERVICE_OVERRIDES_TYPE__INBOUND_TRANSFORMER:
				return INBOUND_TRANSFORMER_EDEFAULT == null ? inboundTransformer != null : !INBOUND_TRANSFORMER_EDEFAULT.equals(inboundTransformer);
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_ADAPTER:
				return MESSAGE_ADAPTER_EDEFAULT == null ? messageAdapter != null : !MESSAGE_ADAPTER_EDEFAULT.equals(messageAdapter);
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_RECEIVER:
				return MESSAGE_RECEIVER_EDEFAULT == null ? messageReceiver != null : !MESSAGE_RECEIVER_EDEFAULT.equals(messageReceiver);
			case CorePackage.SERVICE_OVERRIDES_TYPE__OUTBOUND_TRANSFORMER:
				return OUTBOUND_TRANSFORMER_EDEFAULT == null ? outboundTransformer != null : !OUTBOUND_TRANSFORMER_EDEFAULT.equals(outboundTransformer);
			case CorePackage.SERVICE_OVERRIDES_TYPE__RESPONSE_TRANSFORMER:
				return RESPONSE_TRANSFORMER_EDEFAULT == null ? responseTransformer != null : !RESPONSE_TRANSFORMER_EDEFAULT.equals(responseTransformer);
			case CorePackage.SERVICE_OVERRIDES_TYPE__SERVICE_FINDER:
				return SERVICE_FINDER_EDEFAULT == null ? serviceFinder != null : !SERVICE_FINDER_EDEFAULT.equals(serviceFinder);
			case CorePackage.SERVICE_OVERRIDES_TYPE__SESSION_HANDLER:
				return SESSION_HANDLER_EDEFAULT == null ? sessionHandler != null : !SESSION_HANDLER_EDEFAULT.equals(sessionHandler);
			case CorePackage.SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER:
				return STREAM_MESSAGE_ADAPTER_EDEFAULT == null ? streamMessageAdapter != null : !STREAM_MESSAGE_ADAPTER_EDEFAULT.equals(streamMessageAdapter);
			case CorePackage.SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER:
				return TRANSACTED_MESSAGE_RECEIVER_EDEFAULT == null ? transactedMessageReceiver != null : !TRANSACTED_MESSAGE_RECEIVER_EDEFAULT.equals(transactedMessageReceiver);
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
		result.append(" (dispatcherFactory: ");
		result.append(dispatcherFactory);
		result.append(", endpointBuilder: ");
		result.append(endpointBuilder);
		result.append(", inboundTransformer: ");
		result.append(inboundTransformer);
		result.append(", messageAdapter: ");
		result.append(messageAdapter);
		result.append(", messageReceiver: ");
		result.append(messageReceiver);
		result.append(", outboundTransformer: ");
		result.append(outboundTransformer);
		result.append(", responseTransformer: ");
		result.append(responseTransformer);
		result.append(", serviceFinder: ");
		result.append(serviceFinder);
		result.append(", sessionHandler: ");
		result.append(sessionHandler);
		result.append(", streamMessageAdapter: ");
		result.append(streamMessageAdapter);
		result.append(", transactedMessageReceiver: ");
		result.append(transactedMessageReceiver);
		result.append(')');
		return result.toString();
	}

} //ServiceOverridesTypeImpl
