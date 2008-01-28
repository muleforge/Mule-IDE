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
import org.mule.ide.config.core.IocContainerContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ioc Container Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.IocContainerContextTypeImpl#getConfigLocation <em>Config Location</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.IocContainerContextTypeImpl#getConfigurationText <em>Configuration Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IocContainerContextTypeImpl extends BaseContainerContextTypeImpl implements IocContainerContextType {
	/**
	 * The default value of the '{@link #getConfigLocation() <em>Config Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigLocation() <em>Config Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigLocation()
	 * @generated
	 * @ordered
	 */
	protected String configLocation = CONFIG_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationText() <em>Configuration Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationText()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationText() <em>Configuration Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationText()
	 * @generated
	 * @ordered
	 */
	protected String configurationText = CONFIGURATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IocContainerContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getIocContainerContextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigLocation() {
		return configLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigLocation(String newConfigLocation) {
		String oldConfigLocation = configLocation;
		configLocation = newConfigLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIG_LOCATION, oldConfigLocation, configLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationText() {
		return configurationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationText(String newConfigurationText) {
		String oldConfigurationText = configurationText;
		configurationText = newConfigurationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIGURATION_TEXT, oldConfigurationText, configurationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIG_LOCATION:
				return getConfigLocation();
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIGURATION_TEXT:
				return getConfigurationText();
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
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIG_LOCATION:
				setConfigLocation((String)newValue);
				return;
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIGURATION_TEXT:
				setConfigurationText((String)newValue);
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
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIG_LOCATION:
				setConfigLocation(CONFIG_LOCATION_EDEFAULT);
				return;
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIGURATION_TEXT:
				setConfigurationText(CONFIGURATION_TEXT_EDEFAULT);
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
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIG_LOCATION:
				return CONFIG_LOCATION_EDEFAULT == null ? configLocation != null : !CONFIG_LOCATION_EDEFAULT.equals(configLocation);
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE__CONFIGURATION_TEXT:
				return CONFIGURATION_TEXT_EDEFAULT == null ? configurationText != null : !CONFIGURATION_TEXT_EDEFAULT.equals(configurationText);
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
		result.append(" (configLocation: ");
		result.append(configLocation);
		result.append(", configurationText: ");
		result.append(configurationText);
		result.append(')');
		return result.toString();
	}

} //IocContainerContextTypeImpl
