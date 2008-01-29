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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.AbstractEntryPointResolverSetType;
import org.mule.ide.config.core.AbstractEntryPointResolverType;
import org.mule.ide.config.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractComponentTypeImpl#getAbstractEntryPointResolverSetGroup <em>Abstract Entry Point Resolver Set Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractComponentTypeImpl#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractComponentTypeImpl#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractComponentTypeImpl#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractComponentTypeImpl extends EObjectImpl implements AbstractComponentType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAbstractComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractEntryPointResolverSetGroup() {
		if (abstractEntryPointResolverSetGroup == null) {
			abstractEntryPointResolverSetGroup = new BasicFeatureMap(this, CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP);
		}
		return abstractEntryPointResolverSetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverSetType getAbstractEntryPointResolverSet() {
		return (AbstractEntryPointResolverSetType)getAbstractEntryPointResolverSetGroup().get(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntryPointResolverSet(AbstractEntryPointResolverSetType newAbstractEntryPointResolverSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractEntryPointResolverSetGroup()).basicAdd(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverSet(), newAbstractEntryPointResolverSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractEntryPointResolverGroup() {
		if (abstractEntryPointResolverGroup == null) {
			abstractEntryPointResolverGroup = new BasicFeatureMap(this, CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP);
		}
		return abstractEntryPointResolverGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverType getAbstractEntryPointResolver() {
		return (AbstractEntryPointResolverType)getAbstractEntryPointResolverGroup().get(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntryPointResolver(AbstractEntryPointResolverType newAbstractEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractEntryPointResolverGroup()).basicAdd(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolver(), newAbstractEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				return ((InternalEList<?>)getAbstractEntryPointResolverSetGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return basicSetAbstractEntryPointResolverSet(null, msgs);
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				return ((InternalEList<?>)getAbstractEntryPointResolverGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER:
				return basicSetAbstractEntryPointResolver(null, msgs);
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
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				if (coreType) return getAbstractEntryPointResolverSetGroup();
				return ((FeatureMap.Internal)getAbstractEntryPointResolverSetGroup()).getWrapper();
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return getAbstractEntryPointResolverSet();
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				if (coreType) return getAbstractEntryPointResolverGroup();
				return ((FeatureMap.Internal)getAbstractEntryPointResolverGroup()).getWrapper();
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER:
				return getAbstractEntryPointResolver();
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
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				((FeatureMap.Internal)getAbstractEntryPointResolverSetGroup()).set(newValue);
				return;
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				((FeatureMap.Internal)getAbstractEntryPointResolverGroup()).set(newValue);
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
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				getAbstractEntryPointResolverSetGroup().clear();
				return;
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				getAbstractEntryPointResolverGroup().clear();
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
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
				return abstractEntryPointResolverSetGroup != null && !abstractEntryPointResolverSetGroup.isEmpty();
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return getAbstractEntryPointResolverSet() != null;
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				return abstractEntryPointResolverGroup != null && !abstractEntryPointResolverGroup.isEmpty();
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER:
				return getAbstractEntryPointResolver() != null;
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
		result.append(" (abstractEntryPointResolverSetGroup: ");
		result.append(abstractEntryPointResolverSetGroup);
		result.append(", abstractEntryPointResolverGroup: ");
		result.append(abstractEntryPointResolverGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractComponentTypeImpl
