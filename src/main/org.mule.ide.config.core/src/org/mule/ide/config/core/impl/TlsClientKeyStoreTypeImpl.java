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
import org.mule.ide.config.core.TlsClientKeyStoreType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tls Client Key Store Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.TlsClientKeyStoreTypeImpl#getClientKeyStore <em>Client Key Store</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsClientKeyStoreTypeImpl#getClientKeyStorePassword <em>Client Key Store Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TlsClientKeyStoreTypeImpl#getClientKeyStoreType <em>Client Key Store Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TlsClientKeyStoreTypeImpl extends EObjectImpl implements TlsClientKeyStoreType {
	/**
	 * The default value of the '{@link #getClientKeyStore() <em>Client Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyStore()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_KEY_STORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientKeyStore() <em>Client Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyStore()
	 * @generated
	 * @ordered
	 */
	protected String clientKeyStore = CLIENT_KEY_STORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientKeyStorePassword() <em>Client Key Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyStorePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_KEY_STORE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientKeyStorePassword() <em>Client Key Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyStorePassword()
	 * @generated
	 * @ordered
	 */
	protected String clientKeyStorePassword = CLIENT_KEY_STORE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientKeyStoreType() <em>Client Key Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyStoreType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_KEY_STORE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientKeyStoreType() <em>Client Key Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyStoreType()
	 * @generated
	 * @ordered
	 */
	protected String clientKeyStoreType = CLIENT_KEY_STORE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TlsClientKeyStoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTlsClientKeyStoreType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientKeyStore() {
		return clientKeyStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientKeyStore(String newClientKeyStore) {
		String oldClientKeyStore = clientKeyStore;
		clientKeyStore = newClientKeyStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE, oldClientKeyStore, clientKeyStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientKeyStorePassword() {
		return clientKeyStorePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientKeyStorePassword(String newClientKeyStorePassword) {
		String oldClientKeyStorePassword = clientKeyStorePassword;
		clientKeyStorePassword = newClientKeyStorePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_PASSWORD, oldClientKeyStorePassword, clientKeyStorePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientKeyStoreType() {
		return clientKeyStoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientKeyStoreType(String newClientKeyStoreType) {
		String oldClientKeyStoreType = clientKeyStoreType;
		clientKeyStoreType = newClientKeyStoreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_TYPE, oldClientKeyStoreType, clientKeyStoreType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE:
				return getClientKeyStore();
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_PASSWORD:
				return getClientKeyStorePassword();
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_TYPE:
				return getClientKeyStoreType();
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
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE:
				setClientKeyStore((String)newValue);
				return;
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_PASSWORD:
				setClientKeyStorePassword((String)newValue);
				return;
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_TYPE:
				setClientKeyStoreType((String)newValue);
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
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE:
				setClientKeyStore(CLIENT_KEY_STORE_EDEFAULT);
				return;
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_PASSWORD:
				setClientKeyStorePassword(CLIENT_KEY_STORE_PASSWORD_EDEFAULT);
				return;
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_TYPE:
				setClientKeyStoreType(CLIENT_KEY_STORE_TYPE_EDEFAULT);
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
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE:
				return CLIENT_KEY_STORE_EDEFAULT == null ? clientKeyStore != null : !CLIENT_KEY_STORE_EDEFAULT.equals(clientKeyStore);
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_PASSWORD:
				return CLIENT_KEY_STORE_PASSWORD_EDEFAULT == null ? clientKeyStorePassword != null : !CLIENT_KEY_STORE_PASSWORD_EDEFAULT.equals(clientKeyStorePassword);
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_TYPE:
				return CLIENT_KEY_STORE_TYPE_EDEFAULT == null ? clientKeyStoreType != null : !CLIENT_KEY_STORE_TYPE_EDEFAULT.equals(clientKeyStoreType);
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
		result.append(" (clientKeyStore: ");
		result.append(clientKeyStore);
		result.append(", clientKeyStorePassword: ");
		result.append(clientKeyStorePassword);
		result.append(", clientKeyStoreType: ");
		result.append(clientKeyStoreType);
		result.append(')');
		return result.toString();
	}

} //TlsClientKeyStoreTypeImpl
