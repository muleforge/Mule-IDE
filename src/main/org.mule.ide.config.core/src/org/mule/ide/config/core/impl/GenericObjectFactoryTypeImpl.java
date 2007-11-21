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
import org.mule.ide.config.core.GenericObjectFactoryType;
import org.mule.ide.config.core.ScopeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getInstanceRef <em>Instance Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericObjectFactoryTypeImpl extends AbstractObjectFactoryTypeImpl implements GenericObjectFactoryType {
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
	 * The default value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected String factoryRef = FACTORY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceRef() <em>Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceRef() <em>Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected String instanceRef = INSTANCE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeType SCOPE_EDEFAULT = ScopeType.PROTOTYPE;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeType scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

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
	public FeatureMap getAbstractPoolingProfileGroup() {
		if (abstractPoolingProfileGroup == null) {
			abstractPoolingProfileGroup = new BasicFeatureMap(this, CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP);
		}
		return abstractPoolingProfileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPoolingProfileType getAbstractPoolingProfile() {
		return (AbstractPoolingProfileType)getAbstractPoolingProfileGroup().get(CorePackage.eINSTANCE.getGenericObjectFactoryType_AbstractPoolingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPoolingProfile(AbstractPoolingProfileType newAbstractPoolingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractPoolingProfileGroup()).basicAdd(CorePackage.eINSTANCE.getGenericObjectFactoryType_AbstractPoolingProfile(), newAbstractPoolingProfile, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERIC_OBJECT_FACTORY_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryRef() {
		return factoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryRef(String newFactoryRef) {
		String oldFactoryRef = factoryRef;
		factoryRef = newFactoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERIC_OBJECT_FACTORY_TYPE__FACTORY_REF, oldFactoryRef, factoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceRef() {
		return instanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceRef(String newInstanceRef) {
		String oldInstanceRef = instanceRef;
		instanceRef = newInstanceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERIC_OBJECT_FACTORY_TYPE__INSTANCE_REF, oldInstanceRef, instanceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ScopeType newScope) {
		ScopeType oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERIC_OBJECT_FACTORY_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScope() {
		ScopeType oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.GENERIC_OBJECT_FACTORY_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScope() {
		return scopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				return ((InternalEList<?>)getAbstractPoolingProfileGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE:
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				if (coreType) return getAbstractPoolingProfileGroup();
				return ((FeatureMap.Internal)getAbstractPoolingProfileGroup()).getWrapper();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__CLASS:
				return getClass_();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__FACTORY_REF:
				return getFactoryRef();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				return getInstanceRef();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__SCOPE:
				return getScope();
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				((FeatureMap.Internal)getAbstractPoolingProfileGroup()).set(newValue);
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__FACTORY_REF:
				setFactoryRef((String)newValue);
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				setInstanceRef((String)newValue);
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__SCOPE:
				setScope((ScopeType)newValue);
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				getAbstractPoolingProfileGroup().clear();
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__FACTORY_REF:
				setFactoryRef(FACTORY_REF_EDEFAULT);
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				setInstanceRef(INSTANCE_REF_EDEFAULT);
				return;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__SCOPE:
				unsetScope();
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
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP:
				return abstractPoolingProfileGroup != null && !abstractPoolingProfileGroup.isEmpty();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile() != null;
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__FACTORY_REF:
				return FACTORY_REF_EDEFAULT == null ? factoryRef != null : !FACTORY_REF_EDEFAULT.equals(factoryRef);
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__INSTANCE_REF:
				return INSTANCE_REF_EDEFAULT == null ? instanceRef != null : !INSTANCE_REF_EDEFAULT.equals(instanceRef);
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE__SCOPE:
				return isSetScope();
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
		result.append(", factoryRef: ");
		result.append(factoryRef);
		result.append(", instanceRef: ");
		result.append(instanceRef);
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GenericObjectFactoryTypeImpl
