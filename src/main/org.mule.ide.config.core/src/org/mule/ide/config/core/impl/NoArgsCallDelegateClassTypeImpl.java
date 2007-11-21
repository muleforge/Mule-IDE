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
import org.mule.ide.config.core.NoArgsCallDelegateClassType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Args Call Delegate Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.NoArgsCallDelegateClassTypeImpl#getDelegateClass <em>Delegate Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NoArgsCallDelegateClassTypeImpl#getDelegateMethod <em>Delegate Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoArgsCallDelegateClassTypeImpl extends EObjectImpl implements NoArgsCallDelegateClassType {
	/**
	 * The default value of the '{@link #getDelegateClass() <em>Delegate Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegateClass() <em>Delegate Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateClass()
	 * @generated
	 * @ordered
	 */
	protected String delegateClass = DELEGATE_CLASS_EDEFAULT;

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
	protected NoArgsCallDelegateClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNoArgsCallDelegateClassType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelegateClass() {
		return delegateClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateClass(String newDelegateClass) {
		String oldDelegateClass = delegateClass;
		delegateClass = newDelegateClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_CLASS, oldDelegateClass, delegateClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_METHOD, oldDelegateMethod, delegateMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_CLASS:
				return getDelegateClass();
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_METHOD:
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
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_CLASS:
				setDelegateClass((String)newValue);
				return;
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_METHOD:
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
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_CLASS:
				setDelegateClass(DELEGATE_CLASS_EDEFAULT);
				return;
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_METHOD:
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
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_CLASS:
				return DELEGATE_CLASS_EDEFAULT == null ? delegateClass != null : !DELEGATE_CLASS_EDEFAULT.equals(delegateClass);
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_METHOD:
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
		result.append(" (delegateClass: ");
		result.append(delegateClass);
		result.append(", delegateMethod: ");
		result.append(delegateMethod);
		result.append(')');
		return result.toString();
	}

} //NoArgsCallDelegateClassTypeImpl
