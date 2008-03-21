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
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl#getStorePassword <em>Store Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TlsKeyStoreTypeImpl extends EObjectImpl implements TlsKeyStoreType {
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorePassword() <em>Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorePassword() <em>Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorePassword()
	 * @generated
	 * @ordered
	 */
	protected String storePassword = STORE_PASSWORD_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__ALGORITHM, oldAlgorithm, algorithm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__CLASS, oldClass, class_));
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
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStorePassword() {
		return storePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorePassword(String newStorePassword) {
		String oldStorePassword = storePassword;
		storePassword = newStorePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_KEY_STORE_TYPE__STORE_PASSWORD, oldStorePassword, storePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TLS_KEY_STORE_TYPE__ALGORITHM:
				return getAlgorithm();
			case CorePackage.TLS_KEY_STORE_TYPE__CLASS:
				return getClass_();
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				return getKeyPassword();
			case CorePackage.TLS_KEY_STORE_TYPE__PATH:
				return getPath();
			case CorePackage.TLS_KEY_STORE_TYPE__STORE_PASSWORD:
				return getStorePassword();
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
			case CorePackage.TLS_KEY_STORE_TYPE__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				setKeyPassword((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__PATH:
				setPath((String)newValue);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__STORE_PASSWORD:
				setStorePassword((String)newValue);
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
			case CorePackage.TLS_KEY_STORE_TYPE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				setKeyPassword(KEY_PASSWORD_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CorePackage.TLS_KEY_STORE_TYPE__STORE_PASSWORD:
				setStorePassword(STORE_PASSWORD_EDEFAULT);
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
			case CorePackage.TLS_KEY_STORE_TYPE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case CorePackage.TLS_KEY_STORE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CorePackage.TLS_KEY_STORE_TYPE__KEY_PASSWORD:
				return KEY_PASSWORD_EDEFAULT == null ? keyPassword != null : !KEY_PASSWORD_EDEFAULT.equals(keyPassword);
			case CorePackage.TLS_KEY_STORE_TYPE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CorePackage.TLS_KEY_STORE_TYPE__STORE_PASSWORD:
				return STORE_PASSWORD_EDEFAULT == null ? storePassword != null : !STORE_PASSWORD_EDEFAULT.equals(storePassword);
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
		result.append(", keyPassword: ");
		result.append(keyPassword);
		result.append(", path: ");
		result.append(path);
		result.append(", storePassword: ");
		result.append(storePassword);
		result.append(')');
		return result.toString();
	}

} //TlsKeyStoreTypeImpl
