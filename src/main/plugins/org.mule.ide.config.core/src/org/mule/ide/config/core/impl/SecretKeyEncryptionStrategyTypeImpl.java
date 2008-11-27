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
import org.mule.ide.config.core.SecretKeyEncryptionStrategyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secret Key Encryption Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.SecretKeyEncryptionStrategyTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SecretKeyEncryptionStrategyTypeImpl#getKeyFactoryRef <em>Key Factory Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecretKeyEncryptionStrategyTypeImpl extends EncryptionStrategyTypeImpl implements SecretKeyEncryptionStrategyType {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyFactoryRef() <em>Key Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_FACTORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyFactoryRef() <em>Key Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected String keyFactoryRef = KEY_FACTORY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretKeyEncryptionStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSecretKeyEncryptionStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyFactoryRef() {
		return keyFactoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyFactoryRef(String newKeyFactoryRef) {
		String oldKeyFactoryRef = keyFactoryRef;
		keyFactoryRef = newKeyFactoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY_FACTORY_REF, oldKeyFactoryRef, keyFactoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY:
				return getKey();
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY_FACTORY_REF:
				return getKeyFactoryRef();
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
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY:
				setKey((String)newValue);
				return;
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY_FACTORY_REF:
				setKeyFactoryRef((String)newValue);
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
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY_FACTORY_REF:
				setKeyFactoryRef(KEY_FACTORY_REF_EDEFAULT);
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
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY_FACTORY_REF:
				return KEY_FACTORY_REF_EDEFAULT == null ? keyFactoryRef != null : !KEY_FACTORY_REF_EDEFAULT.equals(keyFactoryRef);
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
		result.append(" (key: ");
		result.append(key);
		result.append(", keyFactoryRef: ");
		result.append(keyFactoryRef);
		result.append(')');
		return result.toString();
	}

} //SecretKeyEncryptionStrategyTypeImpl
