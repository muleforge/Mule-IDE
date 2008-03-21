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

import org.mule.ide.config.core.AbstractPoolingProfileType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.PooledJavaComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pooled Java Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.PooledJavaComponentTypeImpl#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PooledJavaComponentTypeImpl#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PooledJavaComponentTypeImpl extends DefaultJavaComponentTypeImpl implements PooledJavaComponentType {
	/**
	 * The cached value of the '{@link #getAbstractPoolingProfileGroup() <em>Abstract Pooling Profile Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractPoolingProfileGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractPoolingProfileGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PooledJavaComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPooledJavaComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractPoolingProfileGroup() {
		if (abstractPoolingProfileGroup == null) {
			abstractPoolingProfileGroup = new BasicFeatureMap(this, CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE_GROUP);
		}
		return abstractPoolingProfileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPoolingProfileType getAbstractPoolingProfile() {
		return (AbstractPoolingProfileType)getAbstractPoolingProfileGroup().get(CorePackage.eINSTANCE.getPooledJavaComponentType_AbstractPoolingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPoolingProfile(AbstractPoolingProfileType newAbstractPoolingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractPoolingProfileGroup()).basicAdd(CorePackage.eINSTANCE.getPooledJavaComponentType_AbstractPoolingProfile(), newAbstractPoolingProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				return ((InternalEList<?>)getAbstractPoolingProfileGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE:
				return basicSetAbstractPoolingProfile(null, msgs);
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
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				if (coreType) return getAbstractPoolingProfileGroup();
				return ((FeatureMap.Internal)getAbstractPoolingProfileGroup()).getWrapper();
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile();
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
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				((FeatureMap.Internal)getAbstractPoolingProfileGroup()).set(newValue);
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
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				getAbstractPoolingProfileGroup().clear();
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
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				return abstractPoolingProfileGroup != null && !abstractPoolingProfileGroup.isEmpty();
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile() != null;
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
		result.append(" (abstractPoolingProfileGroup: ");
		result.append(abstractPoolingProfileGroup);
		result.append(')');
		return result.toString();
	}

} //PooledJavaComponentTypeImpl
