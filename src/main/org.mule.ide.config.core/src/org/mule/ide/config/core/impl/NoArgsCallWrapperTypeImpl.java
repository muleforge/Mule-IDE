/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.NoArgsCallDelegateClassType;
import org.mule.ide.config.core.NoArgsCallDelegateInstanceType;
import org.mule.ide.config.core.NoArgsCallWrapperType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Args Call Wrapper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.NoArgsCallWrapperTypeImpl#getDelegateClass <em>Delegate Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NoArgsCallWrapperTypeImpl#getDelegateInstance <em>Delegate Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoArgsCallWrapperTypeImpl extends DefaultComponentTypeImpl implements NoArgsCallWrapperType {
	/**
	 * The cached value of the '{@link #getDelegateClass() <em>Delegate Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateClass()
	 * @generated
	 * @ordered
	 */
	protected NoArgsCallDelegateClassType delegateClass;

	/**
	 * The cached value of the '{@link #getDelegateInstance() <em>Delegate Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateInstance()
	 * @generated
	 * @ordered
	 */
	protected NoArgsCallDelegateInstanceType delegateInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoArgsCallWrapperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNoArgsCallWrapperType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoArgsCallDelegateClassType getDelegateClass() {
		return delegateClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegateClass(NoArgsCallDelegateClassType newDelegateClass, NotificationChain msgs) {
		NoArgsCallDelegateClassType oldDelegateClass = delegateClass;
		delegateClass = newDelegateClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS, oldDelegateClass, newDelegateClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateClass(NoArgsCallDelegateClassType newDelegateClass) {
		if (newDelegateClass != delegateClass) {
			NotificationChain msgs = null;
			if (delegateClass != null)
				msgs = ((InternalEObject)delegateClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS, null, msgs);
			if (newDelegateClass != null)
				msgs = ((InternalEObject)newDelegateClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS, null, msgs);
			msgs = basicSetDelegateClass(newDelegateClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS, newDelegateClass, newDelegateClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoArgsCallDelegateInstanceType getDelegateInstance() {
		return delegateInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegateInstance(NoArgsCallDelegateInstanceType newDelegateInstance, NotificationChain msgs) {
		NoArgsCallDelegateInstanceType oldDelegateInstance = delegateInstance;
		delegateInstance = newDelegateInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE, oldDelegateInstance, newDelegateInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateInstance(NoArgsCallDelegateInstanceType newDelegateInstance) {
		if (newDelegateInstance != delegateInstance) {
			NotificationChain msgs = null;
			if (delegateInstance != null)
				msgs = ((InternalEObject)delegateInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE, null, msgs);
			if (newDelegateInstance != null)
				msgs = ((InternalEObject)newDelegateInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE, null, msgs);
			msgs = basicSetDelegateInstance(newDelegateInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE, newDelegateInstance, newDelegateInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS:
				return basicSetDelegateClass(null, msgs);
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE:
				return basicSetDelegateInstance(null, msgs);
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
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS:
				return getDelegateClass();
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE:
				return getDelegateInstance();
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
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS:
				setDelegateClass((NoArgsCallDelegateClassType)newValue);
				return;
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE:
				setDelegateInstance((NoArgsCallDelegateInstanceType)newValue);
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
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS:
				setDelegateClass((NoArgsCallDelegateClassType)null);
				return;
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE:
				setDelegateInstance((NoArgsCallDelegateInstanceType)null);
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
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS:
				return delegateClass != null;
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE:
				return delegateInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //NoArgsCallWrapperTypeImpl
