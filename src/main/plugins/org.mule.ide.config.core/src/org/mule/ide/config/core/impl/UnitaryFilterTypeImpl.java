/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.UnitaryFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unitary Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.UnitaryFilterTypeImpl#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.UnitaryFilterTypeImpl#getAbstractFilter <em>Abstract Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitaryFilterTypeImpl extends AbstractFilterTypeImpl implements UnitaryFilterType {
	/**
	 * The cached value of the '{@link #getAbstractFilterGroup() <em>Abstract Filter Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFilterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFilterGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitaryFilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getUnitaryFilterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractFilterGroup() {
		if (abstractFilterGroup == null) {
			abstractFilterGroup = new BasicFeatureMap(this, CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER_GROUP);
		}
		return abstractFilterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFilterType getAbstractFilter() {
		return (AbstractFilterType)getAbstractFilterGroup().get(CorePackage.eINSTANCE.getUnitaryFilterType_AbstractFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFilter(AbstractFilterType newAbstractFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractFilterGroup()).basicAdd(CorePackage.eINSTANCE.getUnitaryFilterType_AbstractFilter(), newAbstractFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER_GROUP:
				return ((InternalEList<?>)getAbstractFilterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER:
				return basicSetAbstractFilter(null, msgs);
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
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER_GROUP:
				if (coreType) return getAbstractFilterGroup();
				return ((FeatureMap.Internal)getAbstractFilterGroup()).getWrapper();
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER:
				return getAbstractFilter();
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
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER_GROUP:
				((FeatureMap.Internal)getAbstractFilterGroup()).set(newValue);
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
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER_GROUP:
				getAbstractFilterGroup().clear();
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
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER_GROUP:
				return abstractFilterGroup != null && !abstractFilterGroup.isEmpty();
			case CorePackage.UNITARY_FILTER_TYPE__ABSTRACT_FILTER:
				return getAbstractFilter() != null;
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
		result.append(" (abstractFilterGroup: ");
		result.append(abstractFilterGroup);
		result.append(')');
		return result.toString();
	}

} //UnitaryFilterTypeImpl
