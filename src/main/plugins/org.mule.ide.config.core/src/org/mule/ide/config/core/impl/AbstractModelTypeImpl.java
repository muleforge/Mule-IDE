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

import org.mule.ide.config.core.AbstractEntryPointResolverSetType;
import org.mule.ide.config.core.AbstractEntryPointResolverType;
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
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractEntryPointResolverSetGroup <em>Abstract Entry Point Resolver Set Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractServiceGroup <em>Abstract Service Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl#getAbstractService <em>Abstract Service</em>}</li>
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
	 * The cached value of the '{@link #getAbstractEntryPointResolverSetGroup() <em>Abstract Entry Point Resolver Set Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractEntryPointResolverSetGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractEntryPointResolverSetGroup;

	/**
	 * The cached value of the '{@link #getAbstractEntryPointResolverGroup() <em>Abstract Entry Point Resolver Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractEntryPointResolverGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractEntryPointResolverGroup;

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
	public FeatureMap getAbstractEntryPointResolverSetGroup() {
		if (abstractEntryPointResolverSetGroup == null) {
			abstractEntryPointResolverSetGroup = new BasicFeatureMap(this, CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP);
		}
		return abstractEntryPointResolverSetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverSetType getAbstractEntryPointResolverSet() {
		return (AbstractEntryPointResolverSetType)getAbstractEntryPointResolverSetGroup().get(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntryPointResolverSet(AbstractEntryPointResolverSetType newAbstractEntryPointResolverSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractEntryPointResolverSetGroup()).basicAdd(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverSet(), newAbstractEntryPointResolverSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractEntryPointResolverGroup() {
		if (abstractEntryPointResolverGroup == null) {
			abstractEntryPointResolverGroup = new BasicFeatureMap(this, CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP);
		}
		return abstractEntryPointResolverGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverType getAbstractEntryPointResolver() {
		return (AbstractEntryPointResolverType)getAbstractEntryPointResolverGroup().get(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntryPointResolver(AbstractEntryPointResolverType newAbstractEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractEntryPointResolverGroup()).basicAdd(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolver(), newAbstractEntryPointResolver, msgs);
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				return ((InternalEList<?>)getAbstractEntryPointResolverSetGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return basicSetAbstractEntryPointResolverSet(null, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				return ((InternalEList<?>)getAbstractEntryPointResolverGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER:
				return basicSetAbstractEntryPointResolver(null, msgs);
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				if (coreType) return getAbstractEntryPointResolverSetGroup();
				return ((FeatureMap.Internal)getAbstractEntryPointResolverSetGroup()).getWrapper();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return getAbstractEntryPointResolverSet();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				if (coreType) return getAbstractEntryPointResolverGroup();
				return ((FeatureMap.Internal)getAbstractEntryPointResolverGroup()).getWrapper();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER:
				return getAbstractEntryPointResolver();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				if (coreType) return getAbstractServiceGroup();
				return ((FeatureMap.Internal)getAbstractServiceGroup()).getWrapper();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE:
				return getAbstractService();
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				((FeatureMap.Internal)getAbstractEntryPointResolverSetGroup()).set(newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				((FeatureMap.Internal)getAbstractEntryPointResolverGroup()).set(newValue);
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				((FeatureMap.Internal)getAbstractServiceGroup()).set(newValue);
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				getAbstractEntryPointResolverSetGroup().clear();
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				getAbstractEntryPointResolverGroup().clear();
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				getAbstractServiceGroup().clear();
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
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				return abstractEntryPointResolverSetGroup != null && !abstractEntryPointResolverSetGroup.isEmpty();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return getAbstractEntryPointResolverSet() != null;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				return abstractEntryPointResolverGroup != null && !abstractEntryPointResolverGroup.isEmpty();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER:
				return getAbstractEntryPointResolver() != null;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
				return abstractServiceGroup != null && !abstractServiceGroup.isEmpty();
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE:
				return !getAbstractService().isEmpty();
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
		result.append(", abstractEntryPointResolverSetGroup: ");
		result.append(abstractEntryPointResolverSetGroup);
		result.append(", abstractEntryPointResolverGroup: ");
		result.append(abstractEntryPointResolverGroup);
		result.append(", abstractServiceGroup: ");
		result.append(abstractServiceGroup);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractModelTypeImpl
