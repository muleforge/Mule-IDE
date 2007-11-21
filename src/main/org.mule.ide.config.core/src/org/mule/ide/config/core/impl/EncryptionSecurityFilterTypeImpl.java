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
import org.mule.ide.config.core.EncryptionSecurityFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encryption Security Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.EncryptionSecurityFilterTypeImpl#getStrategyRef <em>Strategy Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncryptionSecurityFilterTypeImpl extends AbstractSecurityFilterTypeImpl implements EncryptionSecurityFilterType {
	/**
	 * The default value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategyRef() <em>Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyRef()
	 * @generated
	 * @ordered
	 */
	protected String strategyRef = STRATEGY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptionSecurityFilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEncryptionSecurityFilterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrategyRef() {
		return strategyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyRef(String newStrategyRef) {
		String oldStrategyRef = strategyRef;
		strategyRef = newStrategyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE__STRATEGY_REF, oldStrategyRef, strategyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE__STRATEGY_REF:
				return getStrategyRef();
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
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE__STRATEGY_REF:
				setStrategyRef((String)newValue);
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
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE__STRATEGY_REF:
				setStrategyRef(STRATEGY_REF_EDEFAULT);
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
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE__STRATEGY_REF:
				return STRATEGY_REF_EDEFAULT == null ? strategyRef != null : !STRATEGY_REF_EDEFAULT.equals(strategyRef);
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
		result.append(" (strategyRef: ");
		result.append(strategyRef);
		result.append(')');
		return result.toString();
	}

} //EncryptionSecurityFilterTypeImpl
