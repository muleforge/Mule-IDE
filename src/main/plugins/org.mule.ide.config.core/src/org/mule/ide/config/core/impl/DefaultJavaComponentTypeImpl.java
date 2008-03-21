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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractLifecycleAdapterFactory;
import org.mule.ide.config.core.AbstractObjectFactoryType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DefaultJavaComponentType;
import org.mule.ide.config.core.PojoBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Java Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl#getAbstractLifecycleAdapterFactoryGroup <em>Abstract Lifecycle Adapter Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl#getAbstractLifecycleAdapterFactory <em>Abstract Lifecycle Adapter Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultJavaComponentTypeImpl extends AbstractComponentTypeImpl implements DefaultJavaComponentType {
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
	 * The cached value of the '{@link #getAbstractLifecycleAdapterFactoryGroup() <em>Abstract Lifecycle Adapter Factory Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractLifecycleAdapterFactoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractLifecycleAdapterFactoryGroup;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PojoBindingType> binding;

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
	protected DefaultJavaComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDefaultJavaComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractObjectFactoryGroup() {
		if (abstractObjectFactoryGroup == null) {
			abstractObjectFactoryGroup = new BasicFeatureMap(this, CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP);
		}
		return abstractObjectFactoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObjectFactoryType getAbstractObjectFactory() {
		return (AbstractObjectFactoryType)getAbstractObjectFactoryGroup().get(CorePackage.eINSTANCE.getDefaultJavaComponentType_AbstractObjectFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObjectFactory(AbstractObjectFactoryType newAbstractObjectFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractObjectFactoryGroup()).basicAdd(CorePackage.eINSTANCE.getDefaultJavaComponentType_AbstractObjectFactory(), newAbstractObjectFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractLifecycleAdapterFactoryGroup() {
		if (abstractLifecycleAdapterFactoryGroup == null) {
			abstractLifecycleAdapterFactoryGroup = new BasicFeatureMap(this, CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP);
		}
		return abstractLifecycleAdapterFactoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLifecycleAdapterFactory getAbstractLifecycleAdapterFactory() {
		return (AbstractLifecycleAdapterFactory)getAbstractLifecycleAdapterFactoryGroup().get(CorePackage.eINSTANCE.getDefaultJavaComponentType_AbstractLifecycleAdapterFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractLifecycleAdapterFactory(AbstractLifecycleAdapterFactory newAbstractLifecycleAdapterFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractLifecycleAdapterFactoryGroup()).basicAdd(CorePackage.eINSTANCE.getDefaultJavaComponentType_AbstractLifecycleAdapterFactory(), newAbstractLifecycleAdapterFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PojoBindingType> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<PojoBindingType>(PojoBindingType.class, this, CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__BINDING);
		}
		return binding;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				return ((InternalEList<?>)getAbstractObjectFactoryGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY:
				return basicSetAbstractObjectFactory(null, msgs);
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP:
				return ((InternalEList<?>)getAbstractLifecycleAdapterFactoryGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY:
				return basicSetAbstractLifecycleAdapterFactory(null, msgs);
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				if (coreType) return getAbstractObjectFactoryGroup();
				return ((FeatureMap.Internal)getAbstractObjectFactoryGroup()).getWrapper();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP:
				if (coreType) return getAbstractLifecycleAdapterFactoryGroup();
				return ((FeatureMap.Internal)getAbstractLifecycleAdapterFactoryGroup()).getWrapper();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY:
				return getAbstractLifecycleAdapterFactory();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__BINDING:
				return getBinding();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__CLASS:
				return getClass_();
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
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				((FeatureMap.Internal)getAbstractObjectFactoryGroup()).set(newValue);
				return;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP:
				((FeatureMap.Internal)getAbstractLifecycleAdapterFactoryGroup()).set(newValue);
				return;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends PojoBindingType>)newValue);
				return;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__CLASS:
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
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				getAbstractObjectFactoryGroup().clear();
				return;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP:
				getAbstractLifecycleAdapterFactoryGroup().clear();
				return;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__BINDING:
				getBinding().clear();
				return;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__CLASS:
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
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				return abstractObjectFactoryGroup != null && !abstractObjectFactoryGroup.isEmpty();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory() != null;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP:
				return abstractLifecycleAdapterFactoryGroup != null && !abstractLifecycleAdapterFactoryGroup.isEmpty();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY:
				return getAbstractLifecycleAdapterFactory() != null;
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__BINDING:
				return binding != null && !binding.isEmpty();
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE__CLASS:
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
		result.append(" (abstractObjectFactoryGroup: ");
		result.append(abstractObjectFactoryGroup);
		result.append(", abstractLifecycleAdapterFactoryGroup: ");
		result.append(abstractLifecycleAdapterFactoryGroup);
		result.append(", class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //DefaultJavaComponentTypeImpl
