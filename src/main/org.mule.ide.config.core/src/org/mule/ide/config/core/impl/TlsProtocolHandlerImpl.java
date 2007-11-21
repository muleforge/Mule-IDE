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
import org.mule.ide.config.core.TlsProtocolHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tls Protocol Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.TlsProtocolHandlerImpl#getProtocolHandler <em>Protocol Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TlsProtocolHandlerImpl extends EObjectImpl implements TlsProtocolHandler {
	/**
	 * The default value of the '{@link #getProtocolHandler() <em>Protocol Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolHandler() <em>Protocol Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolHandler()
	 * @generated
	 * @ordered
	 */
	protected String protocolHandler = PROTOCOL_HANDLER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TlsProtocolHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTlsProtocolHandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolHandler() {
		return protocolHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolHandler(String newProtocolHandler) {
		String oldProtocolHandler = protocolHandler;
		protocolHandler = newProtocolHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TLS_PROTOCOL_HANDLER__PROTOCOL_HANDLER, oldProtocolHandler, protocolHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TLS_PROTOCOL_HANDLER__PROTOCOL_HANDLER:
				return getProtocolHandler();
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
			case CorePackage.TLS_PROTOCOL_HANDLER__PROTOCOL_HANDLER:
				setProtocolHandler((String)newValue);
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
			case CorePackage.TLS_PROTOCOL_HANDLER__PROTOCOL_HANDLER:
				setProtocolHandler(PROTOCOL_HANDLER_EDEFAULT);
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
			case CorePackage.TLS_PROTOCOL_HANDLER__PROTOCOL_HANDLER:
				return PROTOCOL_HANDLER_EDEFAULT == null ? protocolHandler != null : !PROTOCOL_HANDLER_EDEFAULT.equals(protocolHandler);
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
		result.append(" (protocolHandler: ");
		result.append(protocolHandler);
		result.append(')');
		return result.toString();
	}

} //TlsProtocolHandlerImpl
