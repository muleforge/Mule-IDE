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

import org.mule.ide.config.core.BaseEntryPointResolverType;
import org.mule.ide.config.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.BaseEntryPointResolverTypeImpl#isAcceptVoidMethods <em>Accept Void Methods</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseEntryPointResolverTypeImpl#isTransformFirst <em>Transform First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseEntryPointResolverTypeImpl extends AbstractEntryPointResolverTypeImpl implements BaseEntryPointResolverType {
	/**
	 * The default value of the '{@link #isAcceptVoidMethods() <em>Accept Void Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptVoidMethods()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPT_VOID_METHODS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAcceptVoidMethods() <em>Accept Void Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptVoidMethods()
	 * @generated
	 * @ordered
	 */
	protected boolean acceptVoidMethods = ACCEPT_VOID_METHODS_EDEFAULT;

	/**
	 * This is true if the Accept Void Methods attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acceptVoidMethodsESet;

	/**
	 * The default value of the '{@link #isTransformFirst() <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransformFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSFORM_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransformFirst() <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransformFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean transformFirst = TRANSFORM_FIRST_EDEFAULT;

	/**
	 * This is true if the Transform First attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transformFirstESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseEntryPointResolverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getBaseEntryPointResolverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAcceptVoidMethods() {
		return acceptVoidMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptVoidMethods(boolean newAcceptVoidMethods) {
		boolean oldAcceptVoidMethods = acceptVoidMethods;
		acceptVoidMethods = newAcceptVoidMethods;
		boolean oldAcceptVoidMethodsESet = acceptVoidMethodsESet;
		acceptVoidMethodsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS, oldAcceptVoidMethods, acceptVoidMethods, !oldAcceptVoidMethodsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcceptVoidMethods() {
		boolean oldAcceptVoidMethods = acceptVoidMethods;
		boolean oldAcceptVoidMethodsESet = acceptVoidMethodsESet;
		acceptVoidMethods = ACCEPT_VOID_METHODS_EDEFAULT;
		acceptVoidMethodsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS, oldAcceptVoidMethods, ACCEPT_VOID_METHODS_EDEFAULT, oldAcceptVoidMethodsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcceptVoidMethods() {
		return acceptVoidMethodsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransformFirst() {
		return transformFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformFirst(boolean newTransformFirst) {
		boolean oldTransformFirst = transformFirst;
		transformFirst = newTransformFirst;
		boolean oldTransformFirstESet = transformFirstESet;
		transformFirstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST, oldTransformFirst, transformFirst, !oldTransformFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransformFirst() {
		boolean oldTransformFirst = transformFirst;
		boolean oldTransformFirstESet = transformFirstESet;
		transformFirst = TRANSFORM_FIRST_EDEFAULT;
		transformFirstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST, oldTransformFirst, TRANSFORM_FIRST_EDEFAULT, oldTransformFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransformFirst() {
		return transformFirstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS:
				return isAcceptVoidMethods() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST:
				return isTransformFirst() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS:
				setAcceptVoidMethods(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST:
				setTransformFirst(((Boolean)newValue).booleanValue());
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
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS:
				unsetAcceptVoidMethods();
				return;
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST:
				unsetTransformFirst();
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
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS:
				return isSetAcceptVoidMethods();
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST:
				return isSetTransformFirst();
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
		result.append(" (acceptVoidMethods: ");
		if (acceptVoidMethodsESet) result.append(acceptVoidMethods); else result.append("<unset>");
		result.append(", transformFirst: ");
		if (transformFirstESet) result.append(transformFirst); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BaseEntryPointResolverTypeImpl
