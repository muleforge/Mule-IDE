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

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractObjectFactoryType;
import org.mule.ide.config.core.AbstractPoolingProfileType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.GenericObjectFactoryType;
import org.mule.ide.config.core.ScopeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericObjectFactoryTypeImpl extends EObjectImpl implements GenericObjectFactoryType {
	/**
	 * The cached value of the '{@link #getAbstractObjectFactoryGroup() <em>Abstract Object Factory Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractObjectFactoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractObjectFactoryGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericObjectFactoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getGenericObjectFactoryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractObjectFactoryGroup() {
		if (abstractObjectFactoryGroup == null) {
			abstractObjectFactoryGroup = new BasicFeatureMap(this, CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP);
		}
		return abstractObjectFactoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObjectFactoryType getAbstractObjectFactory() {
		return (AbstractObjectFactoryType)getAbstractObjectFactoryGroup().get(CorePackage.eINSTANCE.getGenericObjectFactoryType_AbstractObjectFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObjectFactory(AbstractObjectFactoryType newAbstractObjectFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractObjectFactoryGroup()).basicAdd(CorePackage.eINSTANCE.getGenericObjectFactoryType_AbstractObjectFactory(), newAbstractObjectFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				return ((InternalEList<?>)getAbstractObjectFactoryGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY:
				return basicSetAbstractObjectFactory(null, msgs);
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				if (coreType) return getAbstractObjectFactoryGroup();
				return ((FeatureMap.Internal)getAbstractObjectFactoryGroup()).getWrapper();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory();
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				((FeatureMap.Internal)getAbstractObjectFactoryGroup()).set(newValue);
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				getAbstractObjectFactoryGroup().clear();
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				return abstractObjectFactoryGroup != null && !abstractObjectFactoryGroup.isEmpty();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory() != null;
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
		result.append(" (abstractObjectFactoryGroup: ");
		result.append(abstractObjectFactoryGroup);
		result.append(')');
		return result.toString();
	}

} //GenericObjectFactoryTypeImpl
