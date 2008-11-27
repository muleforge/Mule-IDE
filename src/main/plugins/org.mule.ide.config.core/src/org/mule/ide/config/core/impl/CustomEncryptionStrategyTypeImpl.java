/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomEncryptionStrategyType;

import org.mule.ide.config.spring.PropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Encryption Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.CustomEncryptionStrategyTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.CustomEncryptionStrategyTypeImpl#getStrategyRef <em>Strategy Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomEncryptionStrategyTypeImpl extends EncryptionStrategyTypeImpl implements CustomEncryptionStrategyType {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> property;

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
	protected CustomEncryptionStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCustomEncryptionStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__PROPERTY);
		}
		return property;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__STRATEGY_REF, oldStrategyRef, strategyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__PROPERTY:
				return getProperty();
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__STRATEGY_REF:
				return getStrategyRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__STRATEGY_REF:
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
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__STRATEGY_REF:
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
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE__STRATEGY_REF:
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

} //CustomEncryptionStrategyTypeImpl
