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
import org.mule.ide.config.core.TlsKeyStoreType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tls Key Store Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getKeyManagerAlgorithm <em>Key Manager Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getKeyStore <em>Key Store</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getKeyStorePassword <em>Key Store Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getKeyStoreType <em>Key Store Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TlsKeyStoreTypeImpl extends EObjectImpl implements TlsKeyStoreType {
	/**
	 * The default value of the '{@link #getKeyManagerAlgorithm() <em>Key Manager Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyManagerAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_MANAGER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyManagerAlgorithm() <em>Key Manager Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyManagerAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String keyManagerAlgorithm = KEY_MANAGER_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyPassword() <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyPassword() <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPassword()
	 * @generated
	 * @ordered
	 */
	protected String keyPassword = KEY_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyStore() <em>Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStore()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_STORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyStore() <em>Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStore()
	 * @generated
	 * @ordered
	 */
	protected String keyStore = KEY_STORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyStorePassword() <em>Key Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStorePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_STORE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyStorePassword() <em>Key Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStorePassword()
	 * @generated
	 * @ordered
	 */
	protected String keyStorePassword = KEY_STORE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyStoreType() <em>Key Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStoreType()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_STORE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyStoreType() <em>Key Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyStoreType()
	 * @generated
	 * @ordered
	 */
	protected String keyStoreType = KEY_STORE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TlsKeyStoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTlsKeyStoreType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyManagerAlgorithm() {
		return keyManagerAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyManagerAlgorithm(String newKeyManagerAlgorithm) {
		String oldKeyManagerAlgorithm = keyManagerAlgorithm;
		keyManagerAlgorithm = newKeyManagerAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__KEY_MANAGER_ALGORITHM, oldKeyManagerAlgorithm, keyManagerAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyPassword() {
		return keyPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyPassword(String newKeyPassword) {
		String oldKeyPassword = keyPassword;
		keyPassword = newKeyPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD, oldKeyPassword, keyPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyStore() {
		return keyStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyStore(String newKeyStore) {
		String oldKeyStore = keyStore;
		keyStore = newKeyStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE, oldKeyStore, keyStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyStorePassword() {
		return keyStorePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyStorePassword(String newKeyStorePassword) {
		String oldKeyStorePassword = keyStorePassword;
		keyStorePassword = newKeyStorePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_PASSWORD, oldKeyStorePassword, keyStorePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyStoreType() {
		return keyStoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyStoreType(String newKeyStoreType) {
		String oldKeyStoreType = keyStoreType;
		keyStoreType = newKeyStoreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_TYPE, oldKeyStoreType, keyStoreType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_MANAGER_ALGORITHM:
				return getKeyManagerAlgorithm();
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				return getKeyPassword();
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE:
				return getKeyStore();
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_PASSWORD:
				return getKeyStorePassword();
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_TYPE:
				return getKeyStoreType();
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
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_MANAGER_ALGORITHM:
				setKeyManagerAlgorithm((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				setKeyPassword((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE:
				setKeyStore((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_PASSWORD:
				setKeyStorePassword((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_TYPE:
				setKeyStoreType((String)newValue);
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
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_MANAGER_ALGORITHM:
				setKeyManagerAlgorithm(KEY_MANAGER_ALGORITHM_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				setKeyPassword(KEY_PASSWORD_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE:
				setKeyStore(KEY_STORE_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_PASSWORD:
				setKeyStorePassword(KEY_STORE_PASSWORD_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_TYPE:
				setKeyStoreType(KEY_STORE_TYPE_EDEFAULT);
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
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_MANAGER_ALGORITHM:
				return KEY_MANAGER_ALGORITHM_EDEFAULT == null ? keyManagerAlgorithm != null : !KEY_MANAGER_ALGORITHM_EDEFAULT.equals(keyManagerAlgorithm);
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				return KEY_PASSWORD_EDEFAULT == null ? keyPassword != null : !KEY_PASSWORD_EDEFAULT.equals(keyPassword);
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE:
				return KEY_STORE_EDEFAULT == null ? keyStore != null : !KEY_STORE_EDEFAULT.equals(keyStore);
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_PASSWORD:
				return KEY_STORE_PASSWORD_EDEFAULT == null ? keyStorePassword != null : !KEY_STORE_PASSWORD_EDEFAULT.equals(keyStorePassword);
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_STORE_TYPE:
				return KEY_STORE_TYPE_EDEFAULT == null ? keyStoreType != null : !KEY_STORE_TYPE_EDEFAULT.equals(keyStoreType);
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
		result.append(" (keyManagerAlgorithm: ");
		result.append(keyManagerAlgorithm);
		result.append(", keyPassword: ");
		result.append(keyPassword);
		result.append(", keyStore: ");
		result.append(keyStore);
		result.append(", keyStorePassword: ");
		result.append(keyStorePassword);
		result.append(", keyStoreType: ");
		result.append(keyStoreType);
		result.append(')');
		return result.toString();
	}

} //TlsKeyStoreTypeImpl
