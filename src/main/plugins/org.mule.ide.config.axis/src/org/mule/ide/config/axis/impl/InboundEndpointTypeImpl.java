/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.BeanTypeType;
import org.mule.ide.config.axis.InboundEndpointType;
import org.mule.ide.config.axis.OptionsType;
import org.mule.ide.config.axis.SoapMethodType;
import org.mule.ide.config.axis.SoapServiceType;
import org.mule.ide.config.axis.StyleType;
import org.mule.ide.config.axis.UseType;

import org.mule.ide.config.core.KeyValueType;
import org.mule.ide.config.core.MapType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbound Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getSoapService <em>Soap Service</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getSoapMethod <em>Soap Method</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getProperty1 <em>Property1</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getProperties1 <em>Properties1</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getClientConfig <em>Client Config</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getSoapAction <em>Soap Action</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getSOAPAction1 <em>SOAP Action1</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl#getWsdlFile <em>Wsdl File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InboundEndpointTypeImpl extends org.mule.ide.config.core.impl.InboundEndpointTypeImpl implements InboundEndpointType {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected OptionsType options;

	/**
	 * The cached value of the '{@link #getBeanType() <em>Bean Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanType()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanTypeType> beanType;

	/**
	 * The cached value of the '{@link #getSoapService() <em>Soap Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapService()
	 * @generated
	 * @ordered
	 */
	protected EList<SoapServiceType> soapService;

	/**
	 * The cached value of the '{@link #getSoapMethod() <em>Soap Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<SoapMethodType> soapMethod;

	/**
	 * The cached value of the '{@link #getProperty1() <em>Property1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty1()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueType> property1;

	/**
	 * The cached value of the '{@link #getProperties1() <em>Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties1()
	 * @generated
	 * @ordered
	 */
	protected MapType properties1;

	/**
	 * The default value of the '{@link #getClientConfig() <em>Client Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientConfig() <em>Client Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientConfig()
	 * @generated
	 * @ordered
	 */
	protected String clientConfig = CLIENT_CONFIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamespace()
	 * @generated
	 * @ordered
	 */
	protected String serviceNamespace = SERVICE_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoapAction() <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapAction()
	 * @generated
	 * @ordered
	 */
	protected static final String SOAP_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoapAction() <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapAction()
	 * @generated
	 * @ordered
	 */
	protected String soapAction = SOAP_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSOAPAction1() <em>SOAP Action1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOAPAction1()
	 * @generated
	 * @ordered
	 */
	protected static final String SOAP_ACTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSOAPAction1() <em>SOAP Action1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOAPAction1()
	 * @generated
	 * @ordered
	 */
	protected String sOAPAction1 = SOAP_ACTION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE_EDEFAULT = StyleType.RPC;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleType style = STYLE_EDEFAULT;

	/**
	 * This is true if the Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleESet;

	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final UseType USE_EDEFAULT = UseType.ENCODED;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected UseType use = USE_EDEFAULT;

	/**
	 * This is true if the Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useESet;

	/**
	 * The default value of the '{@link #getWsdlFile() <em>Wsdl File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlFile()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlFile() <em>Wsdl File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlFile()
	 * @generated
	 * @ordered
	 */
	protected String wsdlFile = WSDL_FILE_EDEFAULT;

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
		return AxisPackage.Literals.INBOUND_ENDPOINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsType getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(OptionsType newOptions, NotificationChain msgs) {
		OptionsType oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(OptionsType newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanTypeType> getBeanType() {
		if (beanType == null) {
			beanType = new EObjectContainmentEList<BeanTypeType>(BeanTypeType.class, this, AxisPackage.INBOUND_ENDPOINT_TYPE__BEAN_TYPE);
		}
		return beanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoapServiceType> getSoapService() {
		if (soapService == null) {
			soapService = new EObjectContainmentEList<SoapServiceType>(SoapServiceType.class, this, AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE);
		}
		return soapService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoapMethodType> getSoapMethod() {
		if (soapMethod == null) {
			soapMethod = new EObjectContainmentEList<SoapMethodType>(SoapMethodType.class, this, AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_METHOD);
		}
		return soapMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueType> getProperty1() {
		if (property1 == null) {
			property1 = new EObjectContainmentEList<KeyValueType>(KeyValueType.class, this, AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTY1);
		}
		return property1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getProperties1() {
		return properties1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties1(MapType newProperties1, NotificationChain msgs) {
		MapType oldProperties1 = properties1;
		properties1 = newProperties1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1, oldProperties1, newProperties1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties1(MapType newProperties1) {
		if (newProperties1 != properties1) {
			NotificationChain msgs = null;
			if (properties1 != null)
				msgs = ((InternalEObject)properties1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1, null, msgs);
			if (newProperties1 != null)
				msgs = ((InternalEObject)newProperties1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1, null, msgs);
			msgs = basicSetProperties1(newProperties1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1, newProperties1, newProperties1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientConfig() {
		return clientConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientConfig(String newClientConfig) {
		String oldClientConfig = clientConfig;
		clientConfig = newClientConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG, oldClientConfig, clientConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNamespace() {
		return serviceNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNamespace(String newServiceNamespace) {
		String oldServiceNamespace = serviceNamespace;
		serviceNamespace = newServiceNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE, oldServiceNamespace, serviceNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoapAction() {
		return soapAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoapAction(String newSoapAction) {
		String oldSoapAction = soapAction;
		soapAction = newSoapAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION, oldSoapAction, soapAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSOAPAction1() {
		return sOAPAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSOAPAction1(String newSOAPAction1) {
		String oldSOAPAction1 = sOAPAction1;
		sOAPAction1 = newSOAPAction1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION1, oldSOAPAction1, sOAPAction1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleType newStyle) {
		StyleType oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__STYLE, oldStyle, style, !oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle() {
		StyleType oldStyle = style;
		boolean oldStyleESet = styleESet;
		style = STYLE_EDEFAULT;
		styleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AxisPackage.INBOUND_ENDPOINT_TYPE__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyle() {
		return styleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseType getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(UseType newUse) {
		UseType oldUse = use;
		use = newUse == null ? USE_EDEFAULT : newUse;
		boolean oldUseESet = useESet;
		useESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__USE, oldUse, use, !oldUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUse() {
		UseType oldUse = use;
		boolean oldUseESet = useESet;
		use = USE_EDEFAULT;
		useESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AxisPackage.INBOUND_ENDPOINT_TYPE__USE, oldUse, USE_EDEFAULT, oldUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUse() {
		return useESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlFile() {
		return wsdlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlFile(String newWsdlFile) {
		String oldWsdlFile = wsdlFile;
		wsdlFile = newWsdlFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.INBOUND_ENDPOINT_TYPE__WSDL_FILE, oldWsdlFile, wsdlFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS:
				return basicSetOptions(null, msgs);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__BEAN_TYPE:
				return ((InternalEList<?>)getBeanType()).basicRemove(otherEnd, msgs);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE:
				return ((InternalEList<?>)getSoapService()).basicRemove(otherEnd, msgs);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_METHOD:
				return ((InternalEList<?>)getSoapMethod()).basicRemove(otherEnd, msgs);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTY1:
				return ((InternalEList<?>)getProperty1()).basicRemove(otherEnd, msgs);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1:
				return basicSetProperties1(null, msgs);
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
			case AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS:
				return getOptions();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__BEAN_TYPE:
				return getBeanType();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE:
				return getSoapService();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_METHOD:
				return getSoapMethod();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTY1:
				return getProperty1();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1:
				return getProperties1();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG:
				return getClientConfig();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE:
				return getServiceNamespace();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION:
				return getSoapAction();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION1:
				return getSOAPAction1();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__STYLE:
				return getStyle();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__USE:
				return getUse();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__WSDL_FILE:
				return getWsdlFile();
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
			case AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS:
				setOptions((OptionsType)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__BEAN_TYPE:
				getBeanType().clear();
				getBeanType().addAll((Collection<? extends BeanTypeType>)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE:
				getSoapService().clear();
				getSoapService().addAll((Collection<? extends SoapServiceType>)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_METHOD:
				getSoapMethod().clear();
				getSoapMethod().addAll((Collection<? extends SoapMethodType>)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTY1:
				getProperty1().clear();
				getProperty1().addAll((Collection<? extends KeyValueType>)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1:
				setProperties1((MapType)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG:
				setClientConfig((String)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE:
				setServiceNamespace((String)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION:
				setSoapAction((String)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION1:
				setSOAPAction1((String)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__STYLE:
				setStyle((StyleType)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__USE:
				setUse((UseType)newValue);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__WSDL_FILE:
				setWsdlFile((String)newValue);
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
			case AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS:
				setOptions((OptionsType)null);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__BEAN_TYPE:
				getBeanType().clear();
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE:
				getSoapService().clear();
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_METHOD:
				getSoapMethod().clear();
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTY1:
				getProperty1().clear();
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1:
				setProperties1((MapType)null);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG:
				setClientConfig(CLIENT_CONFIG_EDEFAULT);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE:
				setServiceNamespace(SERVICE_NAMESPACE_EDEFAULT);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION:
				setSoapAction(SOAP_ACTION_EDEFAULT);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION1:
				setSOAPAction1(SOAP_ACTION1_EDEFAULT);
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__STYLE:
				unsetStyle();
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__USE:
				unsetUse();
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__WSDL_FILE:
				setWsdlFile(WSDL_FILE_EDEFAULT);
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
			case AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS:
				return options != null;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__BEAN_TYPE:
				return beanType != null && !beanType.isEmpty();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE:
				return soapService != null && !soapService.isEmpty();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_METHOD:
				return soapMethod != null && !soapMethod.isEmpty();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTY1:
				return property1 != null && !property1.isEmpty();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1:
				return properties1 != null;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG:
				return CLIENT_CONFIG_EDEFAULT == null ? clientConfig != null : !CLIENT_CONFIG_EDEFAULT.equals(clientConfig);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE:
				return SERVICE_NAMESPACE_EDEFAULT == null ? serviceNamespace != null : !SERVICE_NAMESPACE_EDEFAULT.equals(serviceNamespace);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION:
				return SOAP_ACTION_EDEFAULT == null ? soapAction != null : !SOAP_ACTION_EDEFAULT.equals(soapAction);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION1:
				return SOAP_ACTION1_EDEFAULT == null ? sOAPAction1 != null : !SOAP_ACTION1_EDEFAULT.equals(sOAPAction1);
			case AxisPackage.INBOUND_ENDPOINT_TYPE__STYLE:
				return isSetStyle();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__USE:
				return isSetUse();
			case AxisPackage.INBOUND_ENDPOINT_TYPE__WSDL_FILE:
				return WSDL_FILE_EDEFAULT == null ? wsdlFile != null : !WSDL_FILE_EDEFAULT.equals(wsdlFile);
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
		result.append(" (clientConfig: ");
		result.append(clientConfig);
		result.append(", serviceNamespace: ");
		result.append(serviceNamespace);
		result.append(", soapAction: ");
		result.append(soapAction);
		result.append(", sOAPAction1: ");
		result.append(sOAPAction1);
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(", use: ");
		if (useESet) result.append(use); else result.append("<unset>");
		result.append(", wsdlFile: ");
		result.append(wsdlFile);
		result.append(')');
		return result.toString();
	}

} //InboundEndpointTypeImpl
