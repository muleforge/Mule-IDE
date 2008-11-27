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

import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.EndpointExceptionStrategyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Exception Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.EndpointExceptionStrategyTypeImpl#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.EndpointExceptionStrategyTypeImpl#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointExceptionStrategyTypeImpl extends AbstractExceptionStrategyTypeImpl implements EndpointExceptionStrategyType {
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
	protected EndpointExceptionStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEndpointExceptionStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractOutboundEndpointGroup() {
		if (abstractOutboundEndpointGroup == null) {
			abstractOutboundEndpointGroup = new BasicFeatureMap(this, CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP);
		}
		return abstractOutboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractOutboundEndpointType> getAbstractOutboundEndpoint() {
		return getAbstractOutboundEndpointGroup().list(CorePackage.eINSTANCE.getEndpointExceptionStrategyType_AbstractOutboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractOutboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractOutboundEndpoint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractOutboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).getWrapper();
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
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
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
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
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
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
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return abstractOutboundEndpointGroup != null && !abstractOutboundEndpointGroup.isEmpty();
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return !getAbstractOutboundEndpoint().isEmpty();
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

} //EndpointExceptionStrategyTypeImpl
