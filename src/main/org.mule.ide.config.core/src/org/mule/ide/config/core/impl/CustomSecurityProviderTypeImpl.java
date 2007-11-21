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
import org.mule.ide.config.core.CustomSecurityProviderType;

import org.mule.ide.config.spring.PropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Security Provider Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.CustomSecurityProviderTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.CustomSecurityProviderTypeImpl#getProviderRef <em>Provider Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomSecurityProviderTypeImpl extends SecurityProviderTypeImpl implements CustomSecurityProviderType {
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
	 * The default value of the '{@link #getProviderRef() <em>Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderRef() <em>Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderRef()
	 * @generated
	 * @ordered
	 */
	protected String providerRef = PROVIDER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomSecurityProviderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCustomSecurityProviderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderRef() {
		return providerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderRef(String newProviderRef) {
		String oldProviderRef = providerRef;
		providerRef = newProviderRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROVIDER_REF, oldProviderRef, providerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROPERTY:
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
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROPERTY:
				return getProperty();
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROVIDER_REF:
				return getProviderRef();
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
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROVIDER_REF:
				setProviderRef((String)newValue);
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
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROVIDER_REF:
				setProviderRef(PROVIDER_REF_EDEFAULT);
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
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE__PROVIDER_REF:
				return PROVIDER_REF_EDEFAULT == null ? providerRef != null : !PROVIDER_REF_EDEFAULT.equals(providerRef);
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
		result.append(" (providerRef: ");
		result.append(providerRef);
		result.append(')');
		return result.toString();
	}

} //CustomSecurityProviderTypeImpl
