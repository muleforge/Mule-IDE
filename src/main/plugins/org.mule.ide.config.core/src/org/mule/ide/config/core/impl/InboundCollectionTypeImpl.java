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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractCatchAllStrategyType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractInboundRouterType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbound Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.InboundCollectionTypeImpl#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundCollectionTypeImpl#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundCollectionTypeImpl#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundCollectionTypeImpl#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundCollectionTypeImpl#getAbstractInboundRouterGroup <em>Abstract Inbound Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundCollectionTypeImpl#getAbstractInboundRouter <em>Abstract Inbound Router</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InboundCollectionTypeImpl extends PlaceholderSupportEObjectImpl implements InboundCollectionType {
	/**
	 * The cached value of the '{@link #getAbstractCatchAllStrategyGroup() <em>Abstract Catch All Strategy Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractCatchAllStrategyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractCatchAllStrategyGroup;

	/**
	 * The cached value of the '{@link #getAbstractInboundEndpointGroup() <em>Abstract Inbound Endpoint Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractInboundEndpointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractInboundEndpointGroup;

	/**
	 * The cached value of the '{@link #getAbstractInboundRouterGroup() <em>Abstract Inbound Router Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractInboundRouterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractInboundRouterGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InboundCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getInboundCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractCatchAllStrategyGroup() {
		if (abstractCatchAllStrategyGroup == null) {
			abstractCatchAllStrategyGroup = new BasicFeatureMap(this, CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP);
		}
		return abstractCatchAllStrategyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCatchAllStrategyType getAbstractCatchAllStrategy() {
		return (AbstractCatchAllStrategyType)getAbstractCatchAllStrategyGroup().get(CorePackage.eINSTANCE.getInboundCollectionType_AbstractCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCatchAllStrategy(AbstractCatchAllStrategyType newAbstractCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).basicAdd(CorePackage.eINSTANCE.getInboundCollectionType_AbstractCatchAllStrategy(), newAbstractCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractInboundEndpointGroup() {
		if (abstractInboundEndpointGroup == null) {
			abstractInboundEndpointGroup = new BasicFeatureMap(this, CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP);
		}
		return abstractInboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInboundEndpointType> getAbstractInboundEndpoint() {
		return getAbstractInboundEndpointGroup().list(CorePackage.eINSTANCE.getInboundCollectionType_AbstractInboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractInboundRouterGroup() {
		if (abstractInboundRouterGroup == null) {
			abstractInboundRouterGroup = new BasicFeatureMap(this, CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP);
		}
		return abstractInboundRouterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInboundRouterType> getAbstractInboundRouter() {
		return getAbstractInboundRouterGroup().list(CorePackage.eINSTANCE.getInboundCollectionType_AbstractInboundRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractCatchAllStrategyGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return basicSetAbstractCatchAllStrategy(null, msgs);
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractInboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractInboundEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				return ((InternalEList<?>)getAbstractInboundRouterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER:
				return ((InternalEList<?>)getAbstractInboundRouter()).basicRemove(otherEnd, msgs);
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
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				if (coreType) return getAbstractCatchAllStrategyGroup();
				return ((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).getWrapper();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractInboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractInboundEndpointGroup()).getWrapper();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return getAbstractInboundEndpoint();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				if (coreType) return getAbstractInboundRouterGroup();
				return ((FeatureMap.Internal)getAbstractInboundRouterGroup()).getWrapper();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER:
				return getAbstractInboundRouter();
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
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).set(newValue);
				return;
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractInboundEndpointGroup()).set(newValue);
				return;
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				((FeatureMap.Internal)getAbstractInboundRouterGroup()).set(newValue);
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
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				getAbstractCatchAllStrategyGroup().clear();
				return;
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				getAbstractInboundEndpointGroup().clear();
				return;
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				getAbstractInboundRouterGroup().clear();
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
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				return abstractCatchAllStrategyGroup != null && !abstractCatchAllStrategyGroup.isEmpty();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy() != null;
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return abstractInboundEndpointGroup != null && !abstractInboundEndpointGroup.isEmpty();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return !getAbstractInboundEndpoint().isEmpty();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				return abstractInboundRouterGroup != null && !abstractInboundRouterGroup.isEmpty();
			case CorePackage.INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER:
				return !getAbstractInboundRouter().isEmpty();
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
		result.append(" (abstractCatchAllStrategyGroup: ");
		result.append(abstractCatchAllStrategyGroup);
		result.append(", abstractInboundEndpointGroup: ");
		result.append(abstractInboundEndpointGroup);
		result.append(", abstractInboundRouterGroup: ");
		result.append(abstractInboundRouterGroup);
		result.append(')');
		return result.toString();
	}

} //InboundCollectionTypeImpl
