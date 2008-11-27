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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractMessageInfoMappingType;
import org.mule.ide.config.core.AsyncReplyRouterType;
import org.mule.ide.config.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Async Reply Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractMessageInfoMappingGroup <em>Abstract Message Info Mapping Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractMessageInfoMapping <em>Abstract Message Info Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsyncReplyRouterTypeImpl extends AbstractAsyncReplyRouterTypeImpl implements AsyncReplyRouterType {
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
	 * The cached value of the '{@link #getAbstractMessageInfoMappingGroup() <em>Abstract Message Info Mapping Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMessageInfoMappingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractMessageInfoMappingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsyncReplyRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAsyncReplyRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractInboundEndpointGroup() {
		if (abstractInboundEndpointGroup == null) {
			abstractInboundEndpointGroup = new BasicFeatureMap(this, CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP);
		}
		return abstractInboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInboundEndpointType> getAbstractInboundEndpoint() {
		return getAbstractInboundEndpointGroup().list(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractInboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractMessageInfoMappingGroup() {
		if (abstractMessageInfoMappingGroup == null) {
			abstractMessageInfoMappingGroup = new BasicFeatureMap(this, CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP);
		}
		return abstractMessageInfoMappingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMessageInfoMappingType getAbstractMessageInfoMapping() {
		return (AbstractMessageInfoMappingType)getAbstractMessageInfoMappingGroup().get(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractMessageInfoMapping(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractMessageInfoMapping(AbstractMessageInfoMappingType newAbstractMessageInfoMapping, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractMessageInfoMappingGroup()).basicAdd(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractMessageInfoMapping(), newAbstractMessageInfoMapping, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractInboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractInboundEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP:
				return ((InternalEList<?>)getAbstractMessageInfoMappingGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING:
				return basicSetAbstractMessageInfoMapping(null, msgs);
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractInboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractInboundEndpointGroup()).getWrapper();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return getAbstractInboundEndpoint();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP:
				if (coreType) return getAbstractMessageInfoMappingGroup();
				return ((FeatureMap.Internal)getAbstractMessageInfoMappingGroup()).getWrapper();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING:
				return getAbstractMessageInfoMapping();
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractInboundEndpointGroup()).set(newValue);
				return;
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP:
				((FeatureMap.Internal)getAbstractMessageInfoMappingGroup()).set(newValue);
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				getAbstractInboundEndpointGroup().clear();
				return;
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP:
				getAbstractMessageInfoMappingGroup().clear();
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return abstractInboundEndpointGroup != null && !abstractInboundEndpointGroup.isEmpty();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return !getAbstractInboundEndpoint().isEmpty();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP:
				return abstractMessageInfoMappingGroup != null && !abstractMessageInfoMappingGroup.isEmpty();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING:
				return getAbstractMessageInfoMapping() != null;
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
		result.append(", abstractMessageInfoMappingGroup: ");
		result.append(abstractMessageInfoMappingGroup);
		result.append(')');
		return result.toString();
	}

} //AsyncReplyRouterTypeImpl
