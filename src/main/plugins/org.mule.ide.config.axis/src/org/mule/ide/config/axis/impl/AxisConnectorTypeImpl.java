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

import org.mule.ide.config.axis.AxisConnectorType;
import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.BeanTypeType;

import org.mule.ide.config.core.ValueType;

import org.mule.ide.config.core.impl.ConnectorTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#getSupportedScheme <em>Supported Scheme</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#getAxisRef <em>Axis Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#getClientConfig <em>Client Config</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#getClientProviderRef <em>Client Provider Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#isDoAutoTypes <em>Do Auto Types</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#getServerConfig <em>Server Config</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#getServerProviderRef <em>Server Provider Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl#isTreatMapAsNamedParams <em>Treat Map As Named Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisConnectorTypeImpl extends ConnectorTypeImpl implements AxisConnectorType {
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
	 * The cached value of the '{@link #getSupportedScheme() <em>Supported Scheme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedScheme()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueType> supportedScheme;

	/**
	 * The default value of the '{@link #getAxisRef() <em>Axis Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisRef()
	 * @generated
	 * @ordered
	 */
	protected static final String AXIS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxisRef() <em>Axis Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisRef()
	 * @generated
	 * @ordered
	 */
	protected String axisRef = AXIS_REF_EDEFAULT;

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
	 * The default value of the '{@link #getClientProviderRef() <em>Client Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientProviderRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_PROVIDER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientProviderRef() <em>Client Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientProviderRef()
	 * @generated
	 * @ordered
	 */
	protected String clientProviderRef = CLIENT_PROVIDER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isDoAutoTypes() <em>Do Auto Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoAutoTypes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DO_AUTO_TYPES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDoAutoTypes() <em>Do Auto Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoAutoTypes()
	 * @generated
	 * @ordered
	 */
	protected boolean doAutoTypes = DO_AUTO_TYPES_EDEFAULT;

	/**
	 * This is true if the Do Auto Types attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doAutoTypesESet;

	/**
	 * The default value of the '{@link #getServerConfig() <em>Server Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerConfig() <em>Server Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerConfig()
	 * @generated
	 * @ordered
	 */
	protected String serverConfig = SERVER_CONFIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerProviderRef() <em>Server Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerProviderRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_PROVIDER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerProviderRef() <em>Server Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerProviderRef()
	 * @generated
	 * @ordered
	 */
	protected String serverProviderRef = SERVER_PROVIDER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isTreatMapAsNamedParams() <em>Treat Map As Named Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreatMapAsNamedParams()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TREAT_MAP_AS_NAMED_PARAMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTreatMapAsNamedParams() <em>Treat Map As Named Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreatMapAsNamedParams()
	 * @generated
	 * @ordered
	 */
	protected boolean treatMapAsNamedParams = TREAT_MAP_AS_NAMED_PARAMS_EDEFAULT;

	/**
	 * This is true if the Treat Map As Named Params attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean treatMapAsNamedParamsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxisPackage.Literals.AXIS_CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanTypeType> getBeanType() {
		if (beanType == null) {
			beanType = new EObjectContainmentEList<BeanTypeType>(BeanTypeType.class, this, AxisPackage.AXIS_CONNECTOR_TYPE__BEAN_TYPE);
		}
		return beanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueType> getSupportedScheme() {
		if (supportedScheme == null) {
			supportedScheme = new EObjectContainmentEList<ValueType>(ValueType.class, this, AxisPackage.AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME);
		}
		return supportedScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxisRef() {
		return axisRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisRef(String newAxisRef) {
		String oldAxisRef = axisRef;
		axisRef = newAxisRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.AXIS_CONNECTOR_TYPE__AXIS_REF, oldAxisRef, axisRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_CONFIG, oldClientConfig, clientConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientProviderRef() {
		return clientProviderRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientProviderRef(String newClientProviderRef) {
		String oldClientProviderRef = clientProviderRef;
		clientProviderRef = newClientProviderRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF, oldClientProviderRef, clientProviderRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDoAutoTypes() {
		return doAutoTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoAutoTypes(boolean newDoAutoTypes) {
		boolean oldDoAutoTypes = doAutoTypes;
		doAutoTypes = newDoAutoTypes;
		boolean oldDoAutoTypesESet = doAutoTypesESet;
		doAutoTypesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES, oldDoAutoTypes, doAutoTypes, !oldDoAutoTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDoAutoTypes() {
		boolean oldDoAutoTypes = doAutoTypes;
		boolean oldDoAutoTypesESet = doAutoTypesESet;
		doAutoTypes = DO_AUTO_TYPES_EDEFAULT;
		doAutoTypesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AxisPackage.AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES, oldDoAutoTypes, DO_AUTO_TYPES_EDEFAULT, oldDoAutoTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDoAutoTypes() {
		return doAutoTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerConfig() {
		return serverConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerConfig(String newServerConfig) {
		String oldServerConfig = serverConfig;
		serverConfig = newServerConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_CONFIG, oldServerConfig, serverConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerProviderRef() {
		return serverProviderRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerProviderRef(String newServerProviderRef) {
		String oldServerProviderRef = serverProviderRef;
		serverProviderRef = newServerProviderRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF, oldServerProviderRef, serverProviderRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTreatMapAsNamedParams() {
		return treatMapAsNamedParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatMapAsNamedParams(boolean newTreatMapAsNamedParams) {
		boolean oldTreatMapAsNamedParams = treatMapAsNamedParams;
		treatMapAsNamedParams = newTreatMapAsNamedParams;
		boolean oldTreatMapAsNamedParamsESet = treatMapAsNamedParamsESet;
		treatMapAsNamedParamsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS, oldTreatMapAsNamedParams, treatMapAsNamedParams, !oldTreatMapAsNamedParamsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTreatMapAsNamedParams() {
		boolean oldTreatMapAsNamedParams = treatMapAsNamedParams;
		boolean oldTreatMapAsNamedParamsESet = treatMapAsNamedParamsESet;
		treatMapAsNamedParams = TREAT_MAP_AS_NAMED_PARAMS_EDEFAULT;
		treatMapAsNamedParamsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AxisPackage.AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS, oldTreatMapAsNamedParams, TREAT_MAP_AS_NAMED_PARAMS_EDEFAULT, oldTreatMapAsNamedParamsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTreatMapAsNamedParams() {
		return treatMapAsNamedParamsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxisPackage.AXIS_CONNECTOR_TYPE__BEAN_TYPE:
				return ((InternalEList<?>)getBeanType()).basicRemove(otherEnd, msgs);
			case AxisPackage.AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME:
				return ((InternalEList<?>)getSupportedScheme()).basicRemove(otherEnd, msgs);
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
			case AxisPackage.AXIS_CONNECTOR_TYPE__BEAN_TYPE:
				return getBeanType();
			case AxisPackage.AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME:
				return getSupportedScheme();
			case AxisPackage.AXIS_CONNECTOR_TYPE__AXIS_REF:
				return getAxisRef();
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_CONFIG:
				return getClientConfig();
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF:
				return getClientProviderRef();
			case AxisPackage.AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES:
				return isDoAutoTypes() ? Boolean.TRUE : Boolean.FALSE;
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_CONFIG:
				return getServerConfig();
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF:
				return getServerProviderRef();
			case AxisPackage.AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS:
				return isTreatMapAsNamedParams() ? Boolean.TRUE : Boolean.FALSE;
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
			case AxisPackage.AXIS_CONNECTOR_TYPE__BEAN_TYPE:
				getBeanType().clear();
				getBeanType().addAll((Collection<? extends BeanTypeType>)newValue);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME:
				getSupportedScheme().clear();
				getSupportedScheme().addAll((Collection<? extends ValueType>)newValue);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__AXIS_REF:
				setAxisRef((String)newValue);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_CONFIG:
				setClientConfig((String)newValue);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF:
				setClientProviderRef((String)newValue);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES:
				setDoAutoTypes(((Boolean)newValue).booleanValue());
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_CONFIG:
				setServerConfig((String)newValue);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF:
				setServerProviderRef((String)newValue);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS:
				setTreatMapAsNamedParams(((Boolean)newValue).booleanValue());
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
			case AxisPackage.AXIS_CONNECTOR_TYPE__BEAN_TYPE:
				getBeanType().clear();
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME:
				getSupportedScheme().clear();
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__AXIS_REF:
				setAxisRef(AXIS_REF_EDEFAULT);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_CONFIG:
				setClientConfig(CLIENT_CONFIG_EDEFAULT);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF:
				setClientProviderRef(CLIENT_PROVIDER_REF_EDEFAULT);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES:
				unsetDoAutoTypes();
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_CONFIG:
				setServerConfig(SERVER_CONFIG_EDEFAULT);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF:
				setServerProviderRef(SERVER_PROVIDER_REF_EDEFAULT);
				return;
			case AxisPackage.AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS:
				unsetTreatMapAsNamedParams();
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
			case AxisPackage.AXIS_CONNECTOR_TYPE__BEAN_TYPE:
				return beanType != null && !beanType.isEmpty();
			case AxisPackage.AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME:
				return supportedScheme != null && !supportedScheme.isEmpty();
			case AxisPackage.AXIS_CONNECTOR_TYPE__AXIS_REF:
				return AXIS_REF_EDEFAULT == null ? axisRef != null : !AXIS_REF_EDEFAULT.equals(axisRef);
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_CONFIG:
				return CLIENT_CONFIG_EDEFAULT == null ? clientConfig != null : !CLIENT_CONFIG_EDEFAULT.equals(clientConfig);
			case AxisPackage.AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF:
				return CLIENT_PROVIDER_REF_EDEFAULT == null ? clientProviderRef != null : !CLIENT_PROVIDER_REF_EDEFAULT.equals(clientProviderRef);
			case AxisPackage.AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES:
				return isSetDoAutoTypes();
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_CONFIG:
				return SERVER_CONFIG_EDEFAULT == null ? serverConfig != null : !SERVER_CONFIG_EDEFAULT.equals(serverConfig);
			case AxisPackage.AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF:
				return SERVER_PROVIDER_REF_EDEFAULT == null ? serverProviderRef != null : !SERVER_PROVIDER_REF_EDEFAULT.equals(serverProviderRef);
			case AxisPackage.AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS:
				return isSetTreatMapAsNamedParams();
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
		result.append(" (axisRef: ");
		result.append(axisRef);
		result.append(", clientConfig: ");
		result.append(clientConfig);
		result.append(", clientProviderRef: ");
		result.append(clientProviderRef);
		result.append(", doAutoTypes: ");
		if (doAutoTypesESet) result.append(doAutoTypes); else result.append("<unset>");
		result.append(", serverConfig: ");
		result.append(serverConfig);
		result.append(", serverProviderRef: ");
		result.append(serverProviderRef);
		result.append(", treatMapAsNamedParams: ");
		if (treatMapAsNamedParamsESet) result.append(treatMapAsNamedParams); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AxisConnectorTypeImpl
