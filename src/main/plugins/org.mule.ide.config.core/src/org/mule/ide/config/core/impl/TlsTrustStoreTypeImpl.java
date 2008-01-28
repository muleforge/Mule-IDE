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
import org.mule.ide.config.core.TlsTrustStoreType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tls Trust Store Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.TlsTrustStoreTypeImpl#getTrustStore <em>Trust Store</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsTrustStoreTypeImpl#getTrustStorePassword <em>Trust Store Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TlsTrustStoreTypeImpl extends EObjectImpl implements TlsTrustStoreType {
	/**
	 * The default value of the '{@link #getTrustStore() <em>Trust Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustStore()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_STORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustStore() <em>Trust Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustStore()
	 * @generated
	 * @ordered
	 */
	protected String trustStore = TRUST_STORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrustStorePassword() <em>Trust Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustStorePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_STORE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustStorePassword() <em>Trust Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustStorePassword()
	 * @generated
	 * @ordered
	 */
	protected String trustStorePassword = TRUST_STORE_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TlsTrustStoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTlsTrustStoreType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrustStore() {
		return trustStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustStore(String newTrustStore) {
		String oldTrustStore = trustStore;
		trustStore = newTrustStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE, oldTrustStore, trustStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrustStorePassword() {
		return trustStorePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustStorePassword(String newTrustStorePassword) {
		String oldTrustStorePassword = trustStorePassword;
		trustStorePassword = newTrustStorePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD, oldTrustStorePassword, trustStorePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE:
				return getTrustStore();
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD:
				return getTrustStorePassword();
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
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE:
				setTrustStore((String)newValue);
				return;
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD:
				setTrustStorePassword((String)newValue);
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
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE:
				setTrustStore(TRUST_STORE_EDEFAULT);
				return;
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD:
				setTrustStorePassword(TRUST_STORE_PASSWORD_EDEFAULT);
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
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE:
				return TRUST_STORE_EDEFAULT == null ? trustStore != null : !TRUST_STORE_EDEFAULT.equals(trustStore);
			case CorePackage.TLS_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD:
				return TRUST_STORE_PASSWORD_EDEFAULT == null ? trustStorePassword != null : !TRUST_STORE_PASSWORD_EDEFAULT.equals(trustStorePassword);
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
		result.append(" (trustStore: ");
		result.append(trustStore);
		result.append(", trustStorePassword: ");
		result.append(trustStorePassword);
		result.append(')');
		return result.toString();
	}

} //TlsTrustStoreTypeImpl
