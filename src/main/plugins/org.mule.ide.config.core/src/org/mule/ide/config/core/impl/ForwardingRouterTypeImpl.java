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

import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ForwardingRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forwarding Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ForwardingRouterTypeImpl#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ForwardingRouterTypeImpl#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForwardingRouterTypeImpl extends FilteredInboundRouterTypeImpl implements ForwardingRouterType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardingRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getForwardingRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractInboundEndpointGroup() {
		if (abstractInboundEndpointGroup == null) {
			abstractInboundEndpointGroup = new BasicFeatureMap(this, CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP);
		}
		return abstractInboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInboundEndpointType> getAbstractInboundEndpoint() {
		return getAbstractInboundEndpointGroup().list(CorePackage.eINSTANCE.getForwardingRouterType_AbstractInboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractInboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractInboundEndpoint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractInboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractInboundEndpointGroup()).getWrapper();
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return getAbstractInboundEndpoint();
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
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractInboundEndpointGroup()).set(newValue);
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
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				getAbstractInboundEndpointGroup().clear();
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
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return abstractInboundEndpointGroup != null && !abstractInboundEndpointGroup.isEmpty();
			case CorePackage.FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return !getAbstractInboundEndpoint().isEmpty();
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
		result.append(" (abstractInboundEndpointGroup: ");
		result.append(abstractInboundEndpointGroup);
		result.append(')');
		return result.toString();
	}

} //ForwardingRouterTypeImpl
