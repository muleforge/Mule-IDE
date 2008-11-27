/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractEntryPointResolverType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ExtensibleEntryPointResolverSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensible Entry Point Resolver Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ExtensibleEntryPointResolverSetImpl#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ExtensibleEntryPointResolverSetImpl#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensibleEntryPointResolverSetImpl extends AbstractEntryPointResolverSetTypeImpl implements ExtensibleEntryPointResolverSet {
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
	protected ExtensibleEntryPointResolverSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getExtensibleEntryPointResolverSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractEntryPointResolverGroup() {
		if (abstractEntryPointResolverGroup == null) {
			abstractEntryPointResolverGroup = new BasicFeatureMap(this, CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP);
		}
		return abstractEntryPointResolverGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEntryPointResolverType> getAbstractEntryPointResolver() {
		return getAbstractEntryPointResolverGroup().list(CorePackage.eINSTANCE.getExtensibleEntryPointResolverSet_AbstractEntryPointResolver());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				return ((InternalEList<?>)getAbstractEntryPointResolverGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER:
				return ((InternalEList<?>)getAbstractEntryPointResolver()).basicRemove(otherEnd, msgs);
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
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				if (coreType) return getAbstractEntryPointResolverGroup();
				return ((FeatureMap.Internal)getAbstractEntryPointResolverGroup()).getWrapper();
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER:
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
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
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
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
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
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
				return abstractEntryPointResolverGroup != null && !abstractEntryPointResolverGroup.isEmpty();
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER:
				return !getAbstractEntryPointResolver().isEmpty();
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
		result.append(" (abstractEntryPointResolverGroup: ");
		result.append(abstractEntryPointResolverGroup);
		result.append(')');
		return result.toString();
	}

} //ExtensibleEntryPointResolverSetImpl
