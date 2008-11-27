/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MethodEntryPointResolverType;
import org.mule.ide.config.core.MethodType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.MethodEntryPointResolverTypeImpl#getIncludeEntryPoint <em>Include Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodEntryPointResolverTypeImpl extends BaseEntryPointResolverTypeImpl implements MethodEntryPointResolverType {
	/**
	 * The cached value of the '{@link #getIncludeEntryPoint() <em>Include Entry Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodType> includeEntryPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodEntryPointResolverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getMethodEntryPointResolverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodType> getIncludeEntryPoint() {
		if (includeEntryPoint == null) {
			includeEntryPoint = new EObjectContainmentEList<MethodType>(MethodType.class, this, CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT);
		}
		return includeEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				return ((InternalEList<?>)getIncludeEntryPoint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				return getIncludeEntryPoint();
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
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				getIncludeEntryPoint().clear();
				getIncludeEntryPoint().addAll((Collection<? extends MethodType>)newValue);
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
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				getIncludeEntryPoint().clear();
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
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				return includeEntryPoint != null && !includeEntryPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodEntryPointResolverTypeImpl
