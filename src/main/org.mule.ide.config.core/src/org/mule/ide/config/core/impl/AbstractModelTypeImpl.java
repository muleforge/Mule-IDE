/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractEntrypointResolverType;
import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractEntrypointResolverGroup <em>Abstract Entrypoint Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractEntrypointResolver <em>Abstract Entrypoint Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractServiceGroup <em>Abstract Service Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractModelTypeImpl extends EObjectImpl implements AbstractModelType {
	/**
	 * The cached value of the '{@link #getAbstractExceptionStrategyGroup() <em>Abstract Exception Strategy Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractExceptionStrategyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractExceptionStrategyGroup;

	/**
	 * The cached value of the '{@link #getAbstractEntrypointResolverGroup() <em>Abstract Entrypoint Resolver Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractEntrypointResolverGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractEntrypointResolverGroup;

	/**
	 * The cached value of the '{@link #getAbstractServiceGroup() <em>Abstract Service Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractServiceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractServiceGroup;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAbstractModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractExceptionStrategyGroup() {
		if (abstractExceptionStrategyGroup == null) {
			abstractExceptionStrategyGroup = new BasicFeatureMap(this, CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP);
		}
		return abstractExceptionStrategyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExceptionStrategyType getAbstractExceptionStrategy() {
		return (AbstractExceptionStrategyType)getAbstractExceptionStrategyGroup().get(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractExceptionStrategy(AbstractExceptionStrategyType newAbstractExceptionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).basicAdd(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategy(), newAbstractExceptionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractEntrypointResolverGroup() {
		if (abstractEntrypointResolverGroup == null) {
			abstractEntrypointResolverGroup = new BasicFeatureMap(this, CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP);
		}
		return abstractEntrypointResolverGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntrypointResolverType getAbstractEntrypointResolver() {
		return (AbstractEntrypointResolverType)getAbstractEntrypointResolverGroup().get(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntrypointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntrypointResolver(AbstractEntrypointResolverType newAbstractEntrypointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractEntrypointResolverGroup()).basicAdd(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntrypointResolver(), newAbstractEntrypointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractServiceGroup() {
		if (abstractServiceGroup == null) {
			abstractServiceGroup = new BasicFeatureMap(this, CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP);
		}
		return abstractServiceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractServiceType> getAbstractService() {
		return getAbstractServiceGroup().list(CorePackage.eINSTANCE.getAbstractModelType_AbstractService());
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_MODEL_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_MODEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractExceptionStrategyGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return basicSetAbstractExceptionStrategy(null, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP:
				return ((InternalEList<?>)getAbstractEntrypointResolverGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER:
				return basicSetAbstractEntrypointResolver(null, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				return ((InternalEList<?>)getAbstractServiceGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE:
				return ((InternalEList<?>)getAbstractService()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				if (coreType) return getAbstractExceptionStrategyGroup();
				return ((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).getWrapper();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP:
				if (coreType) return getAbstractEntrypointResolverGroup();
				return ((FeatureMap.Internal)getAbstractEntrypointResolverGroup()).getWrapper();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER:
				return getAbstractEntrypointResolver();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				if (coreType) return getAbstractServiceGroup();
				return ((FeatureMap.Internal)getAbstractServiceGroup()).getWrapper();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE:
				return getAbstractService();
			case CorePackage.ABSTRACT_MODEL_TYPE__CLASS:
				return getClass_();
			case CorePackage.ABSTRACT_MODEL_TYPE__NAME:
				return getName();
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).set(newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP:
				((FeatureMap.Internal)getAbstractEntrypointResolverGroup()).set(newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				((FeatureMap.Internal)getAbstractServiceGroup()).set(newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__NAME:
				setName((String)newValue);
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				getAbstractExceptionStrategyGroup().clear();
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP:
				getAbstractEntrypointResolverGroup().clear();
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				getAbstractServiceGroup().clear();
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				return abstractExceptionStrategyGroup != null && !abstractExceptionStrategyGroup.isEmpty();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy() != null;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP:
				return abstractEntrypointResolverGroup != null && !abstractEntrypointResolverGroup.isEmpty();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER:
				return getAbstractEntrypointResolver() != null;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				return abstractServiceGroup != null && !abstractServiceGroup.isEmpty();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE:
				return !getAbstractService().isEmpty();
			case CorePackage.ABSTRACT_MODEL_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CorePackage.ABSTRACT_MODEL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (abstractExceptionStrategyGroup: ");
		result.append(abstractExceptionStrategyGroup);
		result.append(", abstractEntrypointResolverGroup: ");
		result.append(abstractEntrypointResolverGroup);
		result.append(", abstractServiceGroup: ");
		result.append(abstractServiceGroup);
		result.append(", class: ");
		result.append(class_);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractModelTypeImpl
