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
import org.mule.ide.config.core.AbstractOutboundRouterType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.OutboundRouterCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outbound Router Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterCollectionTypeImpl#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterCollectionTypeImpl#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterCollectionTypeImpl#getAbstractOutboundRouterGroup <em>Abstract Outbound Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterCollectionTypeImpl#getAbstractOutboundRouter <em>Abstract Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterCollectionTypeImpl#isMatchAll <em>Match All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutboundRouterCollectionTypeImpl extends EObjectImpl implements OutboundRouterCollectionType {
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
	 * The cached value of the '{@link #getAbstractOutboundRouterGroup() <em>Abstract Outbound Router Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractOutboundRouterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractOutboundRouterGroup;

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
	protected OutboundRouterCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getOutboundRouterCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractCatchAllStrategyGroup() {
		if (abstractCatchAllStrategyGroup == null) {
			abstractCatchAllStrategyGroup = new BasicFeatureMap(this, CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP);
		}
		return abstractCatchAllStrategyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCatchAllStrategyType getAbstractCatchAllStrategy() {
		return (AbstractCatchAllStrategyType)getAbstractCatchAllStrategyGroup().get(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCatchAllStrategy(AbstractCatchAllStrategyType newAbstractCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).basicAdd(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategy(), newAbstractCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractOutboundRouterGroup() {
		if (abstractOutboundRouterGroup == null) {
			abstractOutboundRouterGroup = new BasicFeatureMap(this, CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP);
		}
		return abstractOutboundRouterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractOutboundRouterType> getAbstractOutboundRouter() {
		return getAbstractOutboundRouterGroup().list(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouter());
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL, oldMatchAll, matchAll, !oldMatchAllESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL, oldMatchAll, MATCH_ALL_EDEFAULT, oldMatchAllESet));
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
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractCatchAllStrategyGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return basicSetAbstractCatchAllStrategy(null, msgs);
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP:
				return ((InternalEList<?>)getAbstractOutboundRouterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER:
				return ((InternalEList<?>)getAbstractOutboundRouter()).basicRemove(otherEnd, msgs);
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
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				if (coreType) return getAbstractCatchAllStrategyGroup();
				return ((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).getWrapper();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP:
				if (coreType) return getAbstractOutboundRouterGroup();
				return ((FeatureMap.Internal)getAbstractOutboundRouterGroup()).getWrapper();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER:
				return getAbstractOutboundRouter();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
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
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractCatchAllStrategyGroup()).set(newValue);
				return;
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP:
				((FeatureMap.Internal)getAbstractOutboundRouterGroup()).set(newValue);
				return;
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
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
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				getAbstractCatchAllStrategyGroup().clear();
				return;
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP:
				getAbstractOutboundRouterGroup().clear();
				return;
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
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
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
				return abstractCatchAllStrategyGroup != null && !abstractCatchAllStrategyGroup.isEmpty();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy() != null;
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP:
				return abstractOutboundRouterGroup != null && !abstractOutboundRouterGroup.isEmpty();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER:
				return !getAbstractOutboundRouter().isEmpty();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
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
		result.append(", abstractOutboundRouterGroup: ");
		result.append(abstractOutboundRouterGroup);
		result.append(", matchAll: ");
		if (matchAllESet) result.append(matchAll); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutboundRouterCollectionTypeImpl
