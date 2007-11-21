/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractBindingType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.NestedRouterCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Router Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.NestedRouterCollectionTypeImpl#getAbstractBindingGroup <em>Abstract Binding Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.NestedRouterCollectionTypeImpl#getAbstractBinding <em>Abstract Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedRouterCollectionTypeImpl extends EObjectImpl implements NestedRouterCollectionType {
	/**
	 * The cached value of the '{@link #getAbstractBindingGroup() <em>Abstract Binding Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractBindingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractBindingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedRouterCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNestedRouterCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractBindingGroup() {
		if (abstractBindingGroup == null) {
			abstractBindingGroup = new BasicFeatureMap(this, CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING_GROUP);
		}
		return abstractBindingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractBindingType> getAbstractBinding() {
		return getAbstractBindingGroup().list(CorePackage.eINSTANCE.getNestedRouterCollectionType_AbstractBinding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING_GROUP:
				return ((InternalEList<?>)getAbstractBindingGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING:
				return ((InternalEList<?>)getAbstractBinding()).basicRemove(otherEnd, msgs);
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
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING_GROUP:
				if (coreType) return getAbstractBindingGroup();
				return ((FeatureMap.Internal)getAbstractBindingGroup()).getWrapper();
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING:
				return getAbstractBinding();
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
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING_GROUP:
				((FeatureMap.Internal)getAbstractBindingGroup()).set(newValue);
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
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING_GROUP:
				getAbstractBindingGroup().clear();
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
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING_GROUP:
				return abstractBindingGroup != null && !abstractBindingGroup.isEmpty();
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE__ABSTRACT_BINDING:
				return !getAbstractBinding().isEmpty();
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
		result.append(" (abstractBindingGroup: ");
		result.append(abstractBindingGroup);
		result.append(')');
		return result.toString();
	}

} //NestedRouterCollectionTypeImpl
