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

import org.mule.ide.config.core.AbstractStorageType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.IdempotentReceiverType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Idempotent Receiver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.IdempotentReceiverTypeImpl#getAbstractStorageGroup <em>Abstract Storage Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.IdempotentReceiverTypeImpl#getAbstractStorage <em>Abstract Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdempotentReceiverTypeImpl extends FilteredInboundRouterTypeImpl implements IdempotentReceiverType {
	/**
	 * The cached value of the '{@link #getAbstractStorageGroup() <em>Abstract Storage Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractStorageGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractStorageGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdempotentReceiverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getIdempotentReceiverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractStorageGroup() {
		if (abstractStorageGroup == null) {
			abstractStorageGroup = new BasicFeatureMap(this, CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE_GROUP);
		}
		return abstractStorageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStorageType getAbstractStorage() {
		return (AbstractStorageType)getAbstractStorageGroup().get(CorePackage.eINSTANCE.getIdempotentReceiverType_AbstractStorage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractStorage(AbstractStorageType newAbstractStorage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractStorageGroup()).basicAdd(CorePackage.eINSTANCE.getIdempotentReceiverType_AbstractStorage(), newAbstractStorage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE_GROUP:
				return ((InternalEList<?>)getAbstractStorageGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE:
				return basicSetAbstractStorage(null, msgs);
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
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE_GROUP:
				if (coreType) return getAbstractStorageGroup();
				return ((FeatureMap.Internal)getAbstractStorageGroup()).getWrapper();
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE:
				return getAbstractStorage();
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
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE_GROUP:
				((FeatureMap.Internal)getAbstractStorageGroup()).set(newValue);
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
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE_GROUP:
				getAbstractStorageGroup().clear();
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
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE_GROUP:
				return abstractStorageGroup != null && !abstractStorageGroup.isEmpty();
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE:
				return getAbstractStorage() != null;
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
		result.append(" (abstractStorageGroup: ");
		result.append(abstractStorageGroup);
		result.append(')');
		return result.toString();
	}

} //IdempotentReceiverTypeImpl
