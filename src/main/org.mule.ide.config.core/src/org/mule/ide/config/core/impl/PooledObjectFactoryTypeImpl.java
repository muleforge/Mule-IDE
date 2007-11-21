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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractPoolingProfileType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.PooledObjectFactoryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pooled Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.PooledObjectFactoryTypeImpl#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PooledObjectFactoryTypeImpl#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PooledObjectFactoryTypeImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PooledObjectFactoryTypeImpl extends AbstractObjectFactoryTypeImpl implements PooledObjectFactoryType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PooledObjectFactoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPooledObjectFactoryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractPoolingProfileGroup() {
		if (abstractPoolingProfileGroup == null) {
			abstractPoolingProfileGroup = new BasicFeatureMap(this, CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP);
		}
		return abstractPoolingProfileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPoolingProfileType getAbstractPoolingProfile() {
		return (AbstractPoolingProfileType)getAbstractPoolingProfileGroup().get(CorePackage.eINSTANCE.getPooledObjectFactoryType_AbstractPoolingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPoolingProfile(AbstractPoolingProfileType newAbstractPoolingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractPoolingProfileGroup()).basicAdd(CorePackage.eINSTANCE.getPooledObjectFactoryType_AbstractPoolingProfile(), newAbstractPoolingProfile, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POOLED_OBJECT_FACTORY_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				return ((InternalEList<?>)getAbstractPoolingProfileGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE:
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
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				if (coreType) return getAbstractPoolingProfileGroup();
				return ((FeatureMap.Internal)getAbstractPoolingProfileGroup()).getWrapper();
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile();
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__CLASS:
				return getClass_();
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
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				((FeatureMap.Internal)getAbstractPoolingProfileGroup()).set(newValue);
				return;
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__CLASS:
				setClass((String)newValue);
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
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				getAbstractPoolingProfileGroup().clear();
				return;
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
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
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				return abstractPoolingProfileGroup != null && !abstractPoolingProfileGroup.isEmpty();
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile() != null;
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
		result.append(", class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //PooledObjectFactoryTypeImpl
