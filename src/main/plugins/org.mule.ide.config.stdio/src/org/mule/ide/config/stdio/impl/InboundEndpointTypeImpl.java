/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.stdio.InboundEndpointType;
import org.mule.ide.config.stdio.StdioPackage;
import org.mule.ide.config.stdio.SystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbound Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.stdio.impl.InboundEndpointTypeImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InboundEndpointTypeImpl extends org.mule.ide.config.core.impl.InboundEndpointTypeImpl implements InboundEndpointType {
	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final SystemType SYSTEM_EDEFAULT = SystemType.IN;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected SystemType system = SYSTEM_EDEFAULT;

	/**
	 * This is true if the System attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean systemESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InboundEndpointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StdioPackage.Literals.INBOUND_ENDPOINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemType newSystem) {
		SystemType oldSystem = system;
		system = newSystem == null ? SYSTEM_EDEFAULT : newSystem;
		boolean oldSystemESet = systemESet;
		systemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StdioPackage.INBOUND_ENDPOINT_TYPE__SYSTEM, oldSystem, system, !oldSystemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSystem() {
		SystemType oldSystem = system;
		boolean oldSystemESet = systemESet;
		system = SYSTEM_EDEFAULT;
		systemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StdioPackage.INBOUND_ENDPOINT_TYPE__SYSTEM, oldSystem, SYSTEM_EDEFAULT, oldSystemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSystem() {
		return systemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StdioPackage.INBOUND_ENDPOINT_TYPE__SYSTEM:
				return getSystem();
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
			case StdioPackage.INBOUND_ENDPOINT_TYPE__SYSTEM:
				setSystem((SystemType)newValue);
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
			case StdioPackage.INBOUND_ENDPOINT_TYPE__SYSTEM:
				unsetSystem();
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
			case StdioPackage.INBOUND_ENDPOINT_TYPE__SYSTEM:
				return isSetSystem();
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
		result.append(" (system: ");
		if (systemESet) result.append(system); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InboundEndpointTypeImpl
