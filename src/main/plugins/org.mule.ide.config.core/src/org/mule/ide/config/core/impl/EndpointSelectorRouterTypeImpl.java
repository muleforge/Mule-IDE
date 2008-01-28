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
import org.mule.ide.config.core.EndpointSelectorRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Selector Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.EndpointSelectorRouterTypeImpl#getSelectorProperty <em>Selector Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointSelectorRouterTypeImpl extends FilteringOutboundRouterTypeImpl implements EndpointSelectorRouterType {
	/**
	 * The default value of the '{@link #getSelectorProperty() <em>Selector Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectorProperty() <em>Selector Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorProperty()
	 * @generated
	 * @ordered
	 */
	protected String selectorProperty = SELECTOR_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointSelectorRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEndpointSelectorRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectorProperty() {
		return selectorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectorProperty(String newSelectorProperty) {
		String oldSelectorProperty = selectorProperty;
		selectorProperty = newSelectorProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE__SELECTOR_PROPERTY, oldSelectorProperty, selectorProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE__SELECTOR_PROPERTY:
				return getSelectorProperty();
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
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE__SELECTOR_PROPERTY:
				setSelectorProperty((String)newValue);
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
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE__SELECTOR_PROPERTY:
				setSelectorProperty(SELECTOR_PROPERTY_EDEFAULT);
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
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE__SELECTOR_PROPERTY:
				return SELECTOR_PROPERTY_EDEFAULT == null ? selectorProperty != null : !SELECTOR_PROPERTY_EDEFAULT.equals(selectorProperty);
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
		result.append(" (selectorProperty: ");
		result.append(selectorProperty);
		result.append(')');
		return result.toString();
	}

} //EndpointSelectorRouterTypeImpl
