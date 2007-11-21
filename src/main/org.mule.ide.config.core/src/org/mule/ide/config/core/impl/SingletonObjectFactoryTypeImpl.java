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
import org.mule.ide.config.core.SingletonObjectFactoryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.SingletonObjectFactoryTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SingletonObjectFactoryTypeImpl#getInstanceRef <em>Instance Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingletonObjectFactoryTypeImpl extends AbstractObjectFactoryTypeImpl implements SingletonObjectFactoryType {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceRef() <em>Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceRef() <em>Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected String instanceRef = INSTANCE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonObjectFactoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSingletonObjectFactoryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceRef() {
		return instanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceRef(String newInstanceRef) {
		String oldInstanceRef = instanceRef;
		instanceRef = newInstanceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__INSTANCE_REF, oldInstanceRef, instanceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__CLASS:
				return getClass_();
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				return getInstanceRef();
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
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				setInstanceRef((String)newValue);
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
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				setInstanceRef(INSTANCE_REF_EDEFAULT);
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
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				return INSTANCE_REF_EDEFAULT == null ? instanceRef != null : !INSTANCE_REF_EDEFAULT.equals(instanceRef);
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", instanceRef: ");
		result.append(instanceRef);
		result.append(')');
		return result.toString();
	}

} //SingletonObjectFactoryTypeImpl