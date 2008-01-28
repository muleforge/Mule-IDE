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
import org.mule.ide.config.core.RmiContainerContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rmi Container Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.RmiContainerContextTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.RmiContainerContextTypeImpl#getSecurityManager <em>Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.RmiContainerContextTypeImpl#getSecurityPolicy <em>Security Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RmiContainerContextTypeImpl extends BaseContainerContextTypeImpl implements RmiContainerContextType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "rmi";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getSecurityManager() <em>Security Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityManager()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityManager() <em>Security Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityManager()
	 * @generated
	 * @ordered
	 */
	protected String securityManager = SECURITY_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityPolicy() <em>Security Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityPolicy() <em>Security Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPolicy()
	 * @generated
	 * @ordered
	 */
	protected String securityPolicy = SECURITY_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RmiContainerContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRmiContainerContextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RMI_CONTAINER_CONTEXT_TYPE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RMI_CONTAINER_CONTEXT_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityManager() {
		return securityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityManager(String newSecurityManager) {
		String oldSecurityManager = securityManager;
		securityManager = newSecurityManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_MANAGER, oldSecurityManager, securityManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityPolicy() {
		return securityPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityPolicy(String newSecurityPolicy) {
		String oldSecurityPolicy = securityPolicy;
		securityPolicy = newSecurityPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_POLICY, oldSecurityPolicy, securityPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__NAME:
				return getName();
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_MANAGER:
				return getSecurityManager();
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_POLICY:
				return getSecurityPolicy();
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
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_MANAGER:
				setSecurityManager((String)newValue);
				return;
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_POLICY:
				setSecurityPolicy((String)newValue);
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
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__NAME:
				unsetName();
				return;
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_MANAGER:
				setSecurityManager(SECURITY_MANAGER_EDEFAULT);
				return;
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_POLICY:
				setSecurityPolicy(SECURITY_POLICY_EDEFAULT);
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
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__NAME:
				return isSetName();
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_MANAGER:
				return SECURITY_MANAGER_EDEFAULT == null ? securityManager != null : !SECURITY_MANAGER_EDEFAULT.equals(securityManager);
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE__SECURITY_POLICY:
				return SECURITY_POLICY_EDEFAULT == null ? securityPolicy != null : !SECURITY_POLICY_EDEFAULT.equals(securityPolicy);
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", securityManager: ");
		result.append(securityManager);
		result.append(", securityPolicy: ");
		result.append(securityPolicy);
		result.append(')');
		return result.toString();
	}

} //RmiContainerContextTypeImpl
