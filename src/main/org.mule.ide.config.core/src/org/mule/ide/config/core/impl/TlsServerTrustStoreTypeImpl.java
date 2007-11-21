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

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.TlsServerTrustStoreType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tls Server Trust Store Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#isExplicitTrustStoreOnly <em>Explicit Trust Store Only</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#isRequireClientAuthentication <em>Require Client Authentication</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#getTrustManagerAlgorithm <em>Trust Manager Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#getTrustManagerFactory <em>Trust Manager Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#getTrustStoreType <em>Trust Store Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TlsServerTrustStoreTypeImpl extends TlsTrustStoreTypeImpl implements TlsServerTrustStoreType {
	/**
	 * The default value of the '{@link #isExplicitTrustStoreOnly() <em>Explicit Trust Store Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitTrustStoreOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_TRUST_STORE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitTrustStoreOnly() <em>Explicit Trust Store Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitTrustStoreOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitTrustStoreOnly = EXPLICIT_TRUST_STORE_ONLY_EDEFAULT;

	/**
	 * This is true if the Explicit Trust Store Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean explicitTrustStoreOnlyESet;

	/**
	 * The default value of the '{@link #isRequireClientAuthentication() <em>Require Client Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireClientAuthentication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_CLIENT_AUTHENTICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireClientAuthentication() <em>Require Client Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireClientAuthentication()
	 * @generated
	 * @ordered
	 */
	protected boolean requireClientAuthentication = REQUIRE_CLIENT_AUTHENTICATION_EDEFAULT;

	/**
	 * This is true if the Require Client Authentication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requireClientAuthenticationESet;

	/**
	 * The default value of the '{@link #getTrustManagerAlgorithm() <em>Trust Manager Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustManagerAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_MANAGER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustManagerAlgorithm() <em>Trust Manager Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustManagerAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String trustManagerAlgorithm = TRUST_MANAGER_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrustManagerFactory() <em>Trust Manager Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustManagerFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_MANAGER_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustManagerFactory() <em>Trust Manager Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustManagerFactory()
	 * @generated
	 * @ordered
	 */
	protected String trustManagerFactory = TRUST_MANAGER_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrustStoreType() <em>Trust Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustStoreType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_STORE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustStoreType() <em>Trust Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustStoreType()
	 * @generated
	 * @ordered
	 */
	protected String trustStoreType = TRUST_STORE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TlsServerTrustStoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTlsServerTrustStoreType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicitTrustStoreOnly() {
		return explicitTrustStoreOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitTrustStoreOnly(boolean newExplicitTrustStoreOnly) {
		boolean oldExplicitTrustStoreOnly = explicitTrustStoreOnly;
		explicitTrustStoreOnly = newExplicitTrustStoreOnly;
		boolean oldExplicitTrustStoreOnlyESet = explicitTrustStoreOnlyESet;
		explicitTrustStoreOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY, oldExplicitTrustStoreOnly, explicitTrustStoreOnly, !oldExplicitTrustStoreOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExplicitTrustStoreOnly() {
		boolean oldExplicitTrustStoreOnly = explicitTrustStoreOnly;
		boolean oldExplicitTrustStoreOnlyESet = explicitTrustStoreOnlyESet;
		explicitTrustStoreOnly = EXPLICIT_TRUST_STORE_ONLY_EDEFAULT;
		explicitTrustStoreOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY, oldExplicitTrustStoreOnly, EXPLICIT_TRUST_STORE_ONLY_EDEFAULT, oldExplicitTrustStoreOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExplicitTrustStoreOnly() {
		return explicitTrustStoreOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireClientAuthentication() {
		return requireClientAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireClientAuthentication(boolean newRequireClientAuthentication) {
		boolean oldRequireClientAuthentication = requireClientAuthentication;
		requireClientAuthentication = newRequireClientAuthentication;
		boolean oldRequireClientAuthenticationESet = requireClientAuthenticationESet;
		requireClientAuthenticationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION, oldRequireClientAuthentication, requireClientAuthentication, !oldRequireClientAuthenticationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequireClientAuthentication() {
		boolean oldRequireClientAuthentication = requireClientAuthentication;
		boolean oldRequireClientAuthenticationESet = requireClientAuthenticationESet;
		requireClientAuthentication = REQUIRE_CLIENT_AUTHENTICATION_EDEFAULT;
		requireClientAuthenticationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION, oldRequireClientAuthentication, REQUIRE_CLIENT_AUTHENTICATION_EDEFAULT, oldRequireClientAuthenticationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequireClientAuthentication() {
		return requireClientAuthenticationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrustManagerAlgorithm() {
		return trustManagerAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustManagerAlgorithm(String newTrustManagerAlgorithm) {
		String oldTrustManagerAlgorithm = trustManagerAlgorithm;
		trustManagerAlgorithm = newTrustManagerAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_ALGORITHM, oldTrustManagerAlgorithm, trustManagerAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrustManagerFactory() {
		return trustManagerFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustManagerFactory(String newTrustManagerFactory) {
		String oldTrustManagerFactory = trustManagerFactory;
		trustManagerFactory = newTrustManagerFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_FACTORY, oldTrustManagerFactory, trustManagerFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrustStoreType() {
		return trustStoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustStoreType(String newTrustStoreType) {
		String oldTrustStoreType = trustStoreType;
		trustStoreType = newTrustStoreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_TYPE, oldTrustStoreType, trustStoreType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY:
				return isExplicitTrustStoreOnly() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				return isRequireClientAuthentication() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_ALGORITHM:
				return getTrustManagerAlgorithm();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_FACTORY:
				return getTrustManagerFactory();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_TYPE:
				return getTrustStoreType();
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
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY:
				setExplicitTrustStoreOnly(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				setRequireClientAuthentication(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_ALGORITHM:
				setTrustManagerAlgorithm((String)newValue);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_FACTORY:
				setTrustManagerFactory((String)newValue);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_TYPE:
				setTrustStoreType((String)newValue);
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
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY:
				unsetExplicitTrustStoreOnly();
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				unsetRequireClientAuthentication();
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_ALGORITHM:
				setTrustManagerAlgorithm(TRUST_MANAGER_ALGORITHM_EDEFAULT);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_FACTORY:
				setTrustManagerFactory(TRUST_MANAGER_FACTORY_EDEFAULT);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_TYPE:
				setTrustStoreType(TRUST_STORE_TYPE_EDEFAULT);
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
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY:
				return isSetExplicitTrustStoreOnly();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				return isSetRequireClientAuthentication();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_ALGORITHM:
				return TRUST_MANAGER_ALGORITHM_EDEFAULT == null ? trustManagerAlgorithm != null : !TRUST_MANAGER_ALGORITHM_EDEFAULT.equals(trustManagerAlgorithm);
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_FACTORY:
				return TRUST_MANAGER_FACTORY_EDEFAULT == null ? trustManagerFactory != null : !TRUST_MANAGER_FACTORY_EDEFAULT.equals(trustManagerFactory);
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_TYPE:
				return TRUST_STORE_TYPE_EDEFAULT == null ? trustStoreType != null : !TRUST_STORE_TYPE_EDEFAULT.equals(trustStoreType);
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
		result.append(" (explicitTrustStoreOnly: ");
		if (explicitTrustStoreOnlyESet) result.append(explicitTrustStoreOnly); else result.append("<unset>");
		result.append(", requireClientAuthentication: ");
		if (requireClientAuthenticationESet) result.append(requireClientAuthentication); else result.append("<unset>");
		result.append(", trustManagerAlgorithm: ");
		result.append(trustManagerAlgorithm);
		result.append(", trustManagerFactory: ");
		result.append(trustManagerFactory);
		result.append(", trustStoreType: ");
		result.append(trustStoreType);
		result.append(')');
		return result.toString();
	}

} //TlsServerTrustStoreTypeImpl
