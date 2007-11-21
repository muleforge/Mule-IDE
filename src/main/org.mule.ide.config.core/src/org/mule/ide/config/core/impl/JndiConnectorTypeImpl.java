/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.JndiConnectorType;
import org.mule.ide.config.core.MapType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jndi Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.JndiConnectorTypeImpl#getJndiProviderProperties <em>Jndi Provider Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.JndiConnectorTypeImpl#getJndiContextRef <em>Jndi Context Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.JndiConnectorTypeImpl#getJndiInitialFactory <em>Jndi Initial Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.JndiConnectorTypeImpl#getJndiProviderUrl <em>Jndi Provider Url</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.JndiConnectorTypeImpl#getJndiUrlPkgPrefixes <em>Jndi Url Pkg Prefixes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JndiConnectorTypeImpl extends ConnectorTypeImpl implements JndiConnectorType {
	/**
	 * The cached value of the '{@link #getJndiProviderProperties() <em>Jndi Provider Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiProviderProperties()
	 * @generated
	 * @ordered
	 */
	protected MapType jndiProviderProperties;

	/**
	 * The default value of the '{@link #getJndiContextRef() <em>Jndi Context Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiContextRef()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_CONTEXT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiContextRef() <em>Jndi Context Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiContextRef()
	 * @generated
	 * @ordered
	 */
	protected String jndiContextRef = JNDI_CONTEXT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiInitialFactory() <em>Jndi Initial Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiInitialFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_INITIAL_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiInitialFactory() <em>Jndi Initial Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiInitialFactory()
	 * @generated
	 * @ordered
	 */
	protected String jndiInitialFactory = JNDI_INITIAL_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiProviderUrl() <em>Jndi Provider Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiProviderUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_PROVIDER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiProviderUrl() <em>Jndi Provider Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiProviderUrl()
	 * @generated
	 * @ordered
	 */
	protected String jndiProviderUrl = JNDI_PROVIDER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiUrlPkgPrefixes() <em>Jndi Url Pkg Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiUrlPkgPrefixes()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_URL_PKG_PREFIXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiUrlPkgPrefixes() <em>Jndi Url Pkg Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiUrlPkgPrefixes()
	 * @generated
	 * @ordered
	 */
	protected String jndiUrlPkgPrefixes = JNDI_URL_PKG_PREFIXES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JndiConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getJndiConnectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getJndiProviderProperties() {
		return jndiProviderProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJndiProviderProperties(MapType newJndiProviderProperties, NotificationChain msgs) {
		MapType oldJndiProviderProperties = jndiProviderProperties;
		jndiProviderProperties = newJndiProviderProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES, oldJndiProviderProperties, newJndiProviderProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiProviderProperties(MapType newJndiProviderProperties) {
		if (newJndiProviderProperties != jndiProviderProperties) {
			NotificationChain msgs = null;
			if (jndiProviderProperties != null)
				msgs = ((InternalEObject)jndiProviderProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES, null, msgs);
			if (newJndiProviderProperties != null)
				msgs = ((InternalEObject)newJndiProviderProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES, null, msgs);
			msgs = basicSetJndiProviderProperties(newJndiProviderProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES, newJndiProviderProperties, newJndiProviderProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiContextRef() {
		return jndiContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiContextRef(String newJndiContextRef) {
		String oldJndiContextRef = jndiContextRef;
		jndiContextRef = newJndiContextRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF, oldJndiContextRef, jndiContextRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiInitialFactory() {
		return jndiInitialFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiInitialFactory(String newJndiInitialFactory) {
		String oldJndiInitialFactory = jndiInitialFactory;
		jndiInitialFactory = newJndiInitialFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY, oldJndiInitialFactory, jndiInitialFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiProviderUrl() {
		return jndiProviderUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiProviderUrl(String newJndiProviderUrl) {
		String oldJndiProviderUrl = jndiProviderUrl;
		jndiProviderUrl = newJndiProviderUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL, oldJndiProviderUrl, jndiProviderUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiUrlPkgPrefixes() {
		return jndiUrlPkgPrefixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiUrlPkgPrefixes(String newJndiUrlPkgPrefixes) {
		String oldJndiUrlPkgPrefixes = jndiUrlPkgPrefixes;
		jndiUrlPkgPrefixes = newJndiUrlPkgPrefixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES, oldJndiUrlPkgPrefixes, jndiUrlPkgPrefixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES:
				return basicSetJndiProviderProperties(null, msgs);
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
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES:
				return getJndiProviderProperties();
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF:
				return getJndiContextRef();
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY:
				return getJndiInitialFactory();
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL:
				return getJndiProviderUrl();
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES:
				return getJndiUrlPkgPrefixes();
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
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES:
				setJndiProviderProperties((MapType)newValue);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF:
				setJndiContextRef((String)newValue);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY:
				setJndiInitialFactory((String)newValue);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL:
				setJndiProviderUrl((String)newValue);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES:
				setJndiUrlPkgPrefixes((String)newValue);
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
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES:
				setJndiProviderProperties((MapType)null);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF:
				setJndiContextRef(JNDI_CONTEXT_REF_EDEFAULT);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY:
				setJndiInitialFactory(JNDI_INITIAL_FACTORY_EDEFAULT);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL:
				setJndiProviderUrl(JNDI_PROVIDER_URL_EDEFAULT);
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES:
				setJndiUrlPkgPrefixes(JNDI_URL_PKG_PREFIXES_EDEFAULT);
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
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES:
				return jndiProviderProperties != null;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF:
				return JNDI_CONTEXT_REF_EDEFAULT == null ? jndiContextRef != null : !JNDI_CONTEXT_REF_EDEFAULT.equals(jndiContextRef);
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY:
				return JNDI_INITIAL_FACTORY_EDEFAULT == null ? jndiInitialFactory != null : !JNDI_INITIAL_FACTORY_EDEFAULT.equals(jndiInitialFactory);
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL:
				return JNDI_PROVIDER_URL_EDEFAULT == null ? jndiProviderUrl != null : !JNDI_PROVIDER_URL_EDEFAULT.equals(jndiProviderUrl);
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES:
				return JNDI_URL_PKG_PREFIXES_EDEFAULT == null ? jndiUrlPkgPrefixes != null : !JNDI_URL_PKG_PREFIXES_EDEFAULT.equals(jndiUrlPkgPrefixes);
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
		result.append(" (jndiContextRef: ");
		result.append(jndiContextRef);
		result.append(", jndiInitialFactory: ");
		result.append(jndiInitialFactory);
		result.append(", jndiProviderUrl: ");
		result.append(jndiProviderUrl);
		result.append(", jndiUrlPkgPrefixes: ");
		result.append(jndiUrlPkgPrefixes);
		result.append(')');
		return result.toString();
	}

} //JndiConnectorTypeImpl
