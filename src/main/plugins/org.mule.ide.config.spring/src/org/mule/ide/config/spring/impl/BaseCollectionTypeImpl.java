/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mule.ide.config.spring.BaseCollectionType;
import org.mule.ide.config.spring.DefaultableBoolean;
import org.mule.ide.config.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.impl.BaseCollectionTypeImpl#getMerge <em>Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseCollectionTypeImpl extends EObjectImpl implements BaseCollectionType {
	/**
	 * The default value of the '{@link #getMerge() <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerge()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultableBoolean MERGE_EDEFAULT = DefaultableBoolean.DEFAULT;

	/**
	 * The cached value of the '{@link #getMerge() <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerge()
	 * @generated
	 * @ordered
	 */
	protected DefaultableBoolean merge = MERGE_EDEFAULT;

	/**
	 * This is true if the Merge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mergeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.BASE_COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultableBoolean getMerge() {
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerge(DefaultableBoolean newMerge) {
		DefaultableBoolean oldMerge = merge;
		merge = newMerge == null ? MERGE_EDEFAULT : newMerge;
		boolean oldMergeESet = mergeESet;
		mergeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BASE_COLLECTION_TYPE__MERGE, oldMerge, merge, !oldMergeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMerge() {
		DefaultableBoolean oldMerge = merge;
		boolean oldMergeESet = mergeESet;
		merge = MERGE_EDEFAULT;
		mergeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BASE_COLLECTION_TYPE__MERGE, oldMerge, MERGE_EDEFAULT, oldMergeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMerge() {
		return mergeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.BASE_COLLECTION_TYPE__MERGE:
				return getMerge();
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
			case SpringPackage.BASE_COLLECTION_TYPE__MERGE:
				setMerge((DefaultableBoolean)newValue);
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
			case SpringPackage.BASE_COLLECTION_TYPE__MERGE:
				unsetMerge();
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
			case SpringPackage.BASE_COLLECTION_TYPE__MERGE:
				return isSetMerge();
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
		result.append(" (merge: ");
		if (mergeESet) result.append(merge); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BaseCollectionTypeImpl
