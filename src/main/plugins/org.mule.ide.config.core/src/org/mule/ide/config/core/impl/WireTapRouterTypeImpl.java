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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.WireTapRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Tap Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.WireTapRouterTypeImpl#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.WireTapRouterTypeImpl#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireTapRouterTypeImpl extends FilteredInboundRouterTypeImpl implements WireTapRouterType {
	/**
	 * The cached value of the '{@link #getAbstractOutboundEndpointGroup() <em>Abstract Outbound Endpoint Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractOutboundEndpointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractOutboundEndpointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireTapRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getWireTapRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractOutboundEndpointGroup() {
		if (abstractOutboundEndpointGroup == null) {
			abstractOutboundEndpointGroup = new BasicFeatureMap(this, CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP);
		}
		return abstractOutboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOutboundEndpointType getAbstractOutboundEndpoint() {
		return (AbstractOutboundEndpointType)getAbstractOutboundEndpointGroup().get(CorePackage.eINSTANCE.getWireTapRouterType_AbstractOutboundEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractOutboundEndpoint(AbstractOutboundEndpointType newAbstractOutboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).basicAdd(CorePackage.eINSTANCE.getWireTapRouterType_AbstractOutboundEndpoint(), newAbstractOutboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractOutboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return basicSetAbstractOutboundEndpoint(null, msgs);
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
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractOutboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).getWrapper();
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return getAbstractOutboundEndpoint();
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
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).set(newValue);
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
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				getAbstractOutboundEndpointGroup().clear();
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
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return abstractOutboundEndpointGroup != null && !abstractOutboundEndpointGroup.isEmpty();
			case CorePackage.WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return getAbstractOutboundEndpoint() != null;
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
		result.append(" (abstractOutboundEndpointGroup: ");
		result.append(abstractOutboundEndpointGroup);
		result.append(')');
		return result.toString();
	}

} //WireTapRouterTypeImpl
