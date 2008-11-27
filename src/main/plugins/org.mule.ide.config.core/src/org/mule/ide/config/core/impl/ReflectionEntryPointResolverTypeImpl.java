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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MethodType;
import org.mule.ide.config.core.ReflectionEntryPointResolverType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflection Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ReflectionEntryPointResolverTypeImpl#getExcludeObjectMethods <em>Exclude Object Methods</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ReflectionEntryPointResolverTypeImpl#getExcludeEntryPoint <em>Exclude Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReflectionEntryPointResolverTypeImpl extends BaseEntryPointResolverTypeImpl implements ReflectionEntryPointResolverType {
	/**
	 * The cached value of the '{@link #getExcludeObjectMethods() <em>Exclude Object Methods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeObjectMethods()
	 * @generated
	 * @ordered
	 */
	protected EObject excludeObjectMethods;

	/**
	 * The cached value of the '{@link #getExcludeEntryPoint() <em>Exclude Entry Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodType> excludeEntryPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectionEntryPointResolverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getReflectionEntryPointResolverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getExcludeObjectMethods() {
		return excludeObjectMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeObjectMethods(EObject newExcludeObjectMethods, NotificationChain msgs) {
		EObject oldExcludeObjectMethods = excludeObjectMethods;
		excludeObjectMethods = newExcludeObjectMethods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS, oldExcludeObjectMethods, newExcludeObjectMethods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeObjectMethods(EObject newExcludeObjectMethods) {
		if (newExcludeObjectMethods != excludeObjectMethods) {
			NotificationChain msgs = null;
			if (excludeObjectMethods != null)
				msgs = ((InternalEObject)excludeObjectMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS, null, msgs);
			if (newExcludeObjectMethods != null)
				msgs = ((InternalEObject)newExcludeObjectMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS, null, msgs);
			msgs = basicSetExcludeObjectMethods(newExcludeObjectMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS, newExcludeObjectMethods, newExcludeObjectMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodType> getExcludeEntryPoint() {
		if (excludeEntryPoint == null) {
			excludeEntryPoint = new EObjectContainmentEList<MethodType>(MethodType.class, this, CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT);
		}
		return excludeEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS:
				return basicSetExcludeObjectMethods(null, msgs);
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT:
				return ((InternalEList<?>)getExcludeEntryPoint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS:
				return getExcludeObjectMethods();
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT:
				return getExcludeEntryPoint();
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
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS:
				setExcludeObjectMethods((EObject)newValue);
				return;
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT:
				getExcludeEntryPoint().clear();
				getExcludeEntryPoint().addAll((Collection<? extends MethodType>)newValue);
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
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS:
				setExcludeObjectMethods((EObject)null);
				return;
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT:
				getExcludeEntryPoint().clear();
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
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS:
				return excludeObjectMethods != null;
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT:
				return excludeEntryPoint != null && !excludeEntryPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReflectionEntryPointResolverTypeImpl
