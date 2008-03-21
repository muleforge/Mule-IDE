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
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#isExplicitOnly <em>Explicit Only</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl#isRequireClientAuthentication <em>Require Client Authentication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TlsServerTrustStoreTypeImpl extends TlsTrustStoreTypeImpl implements TlsServerTrustStoreType {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isExplicitOnly() <em>Explicit Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitOnly() <em>Explicit Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitOnly = EXPLICIT_ONLY_EDEFAULT;

	/**
	 * This is true if the Explicit Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean explicitOnlyESet;

	/**
	 * The default value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected String factoryRef = FACTORY_REF_EDEFAULT;

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
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicitOnly() {
		return explicitOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitOnly(boolean newExplicitOnly) {
		boolean oldExplicitOnly = explicitOnly;
		explicitOnly = newExplicitOnly;
		boolean oldExplicitOnlyESet = explicitOnlyESet;
		explicitOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_ONLY, oldExplicitOnly, explicitOnly, !oldExplicitOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExplicitOnly() {
		boolean oldExplicitOnly = explicitOnly;
		boolean oldExplicitOnlyESet = explicitOnlyESet;
		explicitOnly = EXPLICIT_ONLY_EDEFAULT;
		explicitOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_ONLY, oldExplicitOnly, EXPLICIT_ONLY_EDEFAULT, oldExplicitOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExplicitOnly() {
		return explicitOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryRef() {
		return factoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryRef(String newFactoryRef) {
		String oldFactoryRef = factoryRef;
		factoryRef = newFactoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_SERVER_TRUST_STORE_TYPE__FACTORY_REF, oldFactoryRef, factoryRef));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__ALGORITHM:
				return getAlgorithm();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__CLASS:
				return getClass_();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_ONLY:
				return isExplicitOnly() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__FACTORY_REF:
				return getFactoryRef();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				return isRequireClientAuthentication() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_ONLY:
				setExplicitOnly(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__FACTORY_REF:
				setFactoryRef((String)newValue);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				setRequireClientAuthentication(((Boolean)newValue).booleanValue());
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
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_ONLY:
				unsetExplicitOnly();
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__FACTORY_REF:
				setFactoryRef(FACTORY_REF_EDEFAULT);
				return;
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				unsetRequireClientAuthentication();
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
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_ONLY:
				return isSetExplicitOnly();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__FACTORY_REF:
				return FACTORY_REF_EDEFAULT == null ? factoryRef != null : !FACTORY_REF_EDEFAULT.equals(factoryRef);
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
				return isSetRequireClientAuthentication();
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
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", class: ");
		result.append(class_);
		result.append(", explicitOnly: ");
		if (explicitOnlyESet) result.append(explicitOnly); else result.append("<unset>");
		result.append(", factoryRef: ");
		result.append(factoryRef);
		result.append(", requireClientAuthentication: ");
		if (requireClientAuthenticationESet) result.append(requireClientAuthentication); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TlsServerTrustStoreTypeImpl
