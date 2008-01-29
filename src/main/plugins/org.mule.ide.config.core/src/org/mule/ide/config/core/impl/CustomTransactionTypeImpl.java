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
import org.mule.ide.config.core.CustomTransactionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.CustomTransactionTypeImpl#getFactoryClass <em>Factory Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.CustomTransactionTypeImpl#getFactoryRef <em>Factory Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomTransactionTypeImpl extends AbstractTransactionTypeImpl implements CustomTransactionType {
	/**
	 * The default value of the '{@link #getFactoryClass() <em>Factory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryClass() <em>Factory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClass()
	 * @generated
	 * @ordered
	 */
	protected String factoryClass = FACTORY_CLASS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCustomTransactionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryClass() {
		return factoryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryClass(String newFactoryClass) {
		String oldFactoryClass = factoryClass;
		factoryClass = newFactoryClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_CLASS, oldFactoryClass, factoryClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_REF, oldFactoryRef, factoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_CLASS:
				return getFactoryClass();
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_REF:
				return getFactoryRef();
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
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_CLASS:
				setFactoryClass((String)newValue);
				return;
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_REF:
				setFactoryRef((String)newValue);
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
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_CLASS:
				setFactoryClass(FACTORY_CLASS_EDEFAULT);
				return;
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_REF:
				setFactoryRef(FACTORY_REF_EDEFAULT);
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
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_CLASS:
				return FACTORY_CLASS_EDEFAULT == null ? factoryClass != null : !FACTORY_CLASS_EDEFAULT.equals(factoryClass);
			case CorePackage.CUSTOM_TRANSACTION_TYPE__FACTORY_REF:
				return FACTORY_REF_EDEFAULT == null ? factoryRef != null : !FACTORY_REF_EDEFAULT.equals(factoryRef);
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
		result.append(" (factoryClass: ");
		result.append(factoryClass);
		result.append(", factoryRef: ");
		result.append(factoryRef);
		result.append(')');
		return result.toString();
	}

} //CustomTransactionTypeImpl
