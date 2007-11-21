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

import org.mule.ide.config.core.AbstractCatchAllStrategyType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractInboundRouterType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundRouterCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbound Router Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl#getAbstractInboundRouterGroup <em>Abstract Inbound Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl#getAbstractInboundRouter <em>Abstract Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl#isMatchAll <em>Match All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InboundRouterCollectionTypeImpl extends EObjectImpl implements InboundRouterCollectionType {
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
	 * The default value of the '{@link #isMatchAll() <em>Match All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMatchAll() <em>Match All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchAll()
	 * @generated
	 * @ordered
	 */
	protected boolean matchAll = MATCH_ALL_EDEFAULT;

	/**
	 * This is true if the Match All attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matchAllESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InboundRouterCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getInboundRouterCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractCatchAllStrategyGroup() {
		if (abstractCatchAllStrategyGroup == null) {
			abstractCatchAllStrategyGroup = new BasicFeatureMap(this, CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP);
		}
		return abstractCatchAllStrategyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCatchAllStrategyType getAbstractCatchAllStrategy() {
		return (AbstractCatchAllStrategyType)getAbstractCatchAllStrategyGroup().get(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCatchAllStrategy(AbstractCatchAllStrategyType newAbstractCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).basicAdd(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategy(), newAbstractCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractInboundEndpointGroup() {
		if (abstractInboundEndpointGroup == null) {
			abstractInboundEndpointGroup = new BasicFeatureMap(this, CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP);
		}
		return abstractInboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInboundEndpointType> getAbstractInboundEndpoint() {
		return getAbstractInboundEndpointGroup().list(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractInboundRouterGroup() {
		if (abstractInboundRouterGroup == null) {
			abstractInboundRouterGroup = new BasicFeatureMap(this, CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP);
		}
		return abstractInboundRouterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInboundRouterType> getAbstractInboundRouter() {
		return getAbstractInboundRouterGroup().list(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMatchAll() {
		return matchAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchAll(boolean newMatchAll) {
		boolean oldMatchAll = matchAll;
		matchAll = newMatchAll;
		boolean oldMatchAllESet = matchAllESet;
		matchAllESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL, oldMatchAll, matchAll, !oldMatchAllESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMatchAll() {
		boolean oldMatchAll = matchAll;
		boolean oldMatchAllESet = matchAllESet;
		matchAll = MATCH_ALL_EDEFAULT;
		matchAllESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL, oldMatchAll, MATCH_ALL_EDEFAULT, oldMatchAllESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMatchAll() {
		return matchAllESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractCatchAllStrategyGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return basicSetAbstractCatchAllStrategy(null, msgs);
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractInboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractInboundEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				return ((InternalEList<?>)getAbstractInboundRouterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER:
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
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				if (coreType) return getAbstractCatchAllStrategyGroup();
				return ((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).getWrapper();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractInboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractInboundEndpointGroup()).getWrapper();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return getAbstractInboundEndpoint();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				if (coreType) return getAbstractInboundRouterGroup();
				return ((FeatureMap.Internal)getAbstractInboundRouterGroup()).getWrapper();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER:
				return getAbstractInboundRouter();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
				return isMatchAll() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).set(newValue);
				return;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractInboundEndpointGroup()).set(newValue);
				return;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				((FeatureMap.Internal)getAbstractInboundRouterGroup()).set(newValue);
				return;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
				setMatchAll(((Boolean)newValue).booleanValue());
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
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				getAbstractCatchAllStrategyGroup().clear();
				return;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				getAbstractInboundEndpointGroup().clear();
				return;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				getAbstractInboundRouterGroup().clear();
				return;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
				unsetMatchAll();
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
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				return abstractCatchAllStrategyGroup != null && !abstractCatchAllStrategyGroup.isEmpty();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy() != null;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return abstractInboundEndpointGroup != null && !abstractInboundEndpointGroup.isEmpty();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return !getAbstractInboundEndpoint().isEmpty();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
				return abstractInboundRouterGroup != null && !abstractInboundRouterGroup.isEmpty();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER:
				return !getAbstractInboundRouter().isEmpty();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
				return isSetMatchAll();
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
		result.append(", matchAll: ");
		if (matchAllESet) result.append(matchAll); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InboundRouterCollectionTypeImpl
