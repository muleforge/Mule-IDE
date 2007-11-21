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
import org.mule.ide.config.core.NoArgsCallDelegateInstanceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Args Call Delegate Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.NoArgsCallDelegateInstanceTypeImpl#getDelegateInstanceRef <em>Delegate Instance Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NoArgsCallDelegateInstanceTypeImpl#getDelegateMethod <em>Delegate Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoArgsCallDelegateInstanceTypeImpl extends EObjectImpl implements NoArgsCallDelegateInstanceType {
	/**
	 * The default value of the '{@link #getDelegateInstanceRef() <em>Delegate Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATE_INSTANCE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegateInstanceRef() <em>Delegate Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected String delegateInstanceRef = DELEGATE_INSTANCE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelegateMethod() <em>Delegate Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegateMethod() <em>Delegate Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateMethod()
	 * @generated
	 * @ordered
	 */
	protected String delegateMethod = DELEGATE_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoArgsCallDelegateInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNoArgsCallDelegateInstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelegateInstanceRef() {
		return delegateInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateInstanceRef(String newDelegateInstanceRef) {
		String oldDelegateInstanceRef = delegateInstanceRef;
		delegateInstanceRef = newDelegateInstanceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_INSTANCE_REF, oldDelegateInstanceRef, delegateInstanceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelegateMethod() {
		return delegateMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateMethod(String newDelegateMethod) {
		String oldDelegateMethod = delegateMethod;
		delegateMethod = newDelegateMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_METHOD, oldDelegateMethod, delegateMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_INSTANCE_REF:
				return getDelegateInstanceRef();
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_METHOD:
				return getDelegateMethod();
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
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_INSTANCE_REF:
				setDelegateInstanceRef((String)newValue);
				return;
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_METHOD:
				setDelegateMethod((String)newValue);
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
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_INSTANCE_REF:
				setDelegateInstanceRef(DELEGATE_INSTANCE_REF_EDEFAULT);
				return;
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_METHOD:
				setDelegateMethod(DELEGATE_METHOD_EDEFAULT);
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
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_INSTANCE_REF:
				return DELEGATE_INSTANCE_REF_EDEFAULT == null ? delegateInstanceRef != null : !DELEGATE_INSTANCE_REF_EDEFAULT.equals(delegateInstanceRef);
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_METHOD:
				return DELEGATE_METHOD_EDEFAULT == null ? delegateMethod != null : !DELEGATE_METHOD_EDEFAULT.equals(delegateMethod);
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
		result.append(" (delegateInstanceRef: ");
		result.append(delegateInstanceRef);
		result.append(", delegateMethod: ");
		result.append(delegateMethod);
		result.append(')');
		return result.toString();
	}

} //NoArgsCallDelegateInstanceTypeImpl
