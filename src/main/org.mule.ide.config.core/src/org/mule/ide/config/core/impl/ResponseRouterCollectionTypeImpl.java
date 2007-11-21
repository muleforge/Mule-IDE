/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.List;

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

import org.mule.ide.config.core.AbstractResponseEndpointType;
import org.mule.ide.config.core.AbstractResponseRouterType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ResponseRouterCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Router Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getAbstractResponseEndpointGroup <em>Abstract Response Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getAbstractResponseRouterGroup <em>Abstract Response Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getAbstractResponseRouter <em>Abstract Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl#getTransformerRef <em>Transformer Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseRouterCollectionTypeImpl extends EObjectImpl implements ResponseRouterCollectionType {
	/**
	 * The cached value of the '{@link #getAbstractResponseEndpointGroup() <em>Abstract Response Endpoint Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractResponseEndpointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractResponseEndpointGroup;

	/**
	 * The cached value of the '{@link #getAbstractResponseRouterGroup() <em>Abstract Response Router Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractResponseRouterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractResponseRouterGroup;

	/**
	 * The cached value of the '{@link #getAbstractTransformerGroup() <em>Abstract Transformer Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTransformerGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTransformerGroup;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformerRef() <em>Transformer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerRef()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> TRANSFORMER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformerRef() <em>Transformer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerRef()
	 * @generated
	 * @ordered
	 */
	protected List<String> transformerRef = TRANSFORMER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseRouterCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getResponseRouterCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractResponseEndpointGroup() {
		if (abstractResponseEndpointGroup == null) {
			abstractResponseEndpointGroup = new BasicFeatureMap(this, CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP);
		}
		return abstractResponseEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResponseEndpointType> getAbstractResponseEndpoint() {
		return getAbstractResponseEndpointGroup().list(CorePackage.eINSTANCE.getResponseRouterCollectionType_AbstractResponseEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractResponseRouterGroup() {
		if (abstractResponseRouterGroup == null) {
			abstractResponseRouterGroup = new BasicFeatureMap(this, CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER_GROUP);
		}
		return abstractResponseRouterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResponseRouterType> getAbstractResponseRouter() {
		return getAbstractResponseRouterGroup().list(CorePackage.eINSTANCE.getResponseRouterCollectionType_AbstractResponseRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransformerGroup() {
		if (abstractTransformerGroup == null) {
			abstractTransformerGroup = new BasicFeatureMap(this, CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP);
		}
		return abstractTransformerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransformerType> getAbstractTransformer() {
		return getAbstractTransformerGroup().list(CorePackage.eINSTANCE.getResponseRouterCollectionType_AbstractTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getTransformerRef() {
		return transformerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerRef(List<String> newTransformerRef) {
		List<String> oldTransformerRef = transformerRef;
		transformerRef = newTransformerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TRANSFORMER_REF, oldTransformerRef, transformerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractResponseEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT:
				return ((InternalEList<?>)getAbstractResponseEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER_GROUP:
				return ((InternalEList<?>)getAbstractResponseRouterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER:
				return ((InternalEList<?>)getAbstractResponseRouter()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return ((InternalEList<?>)getAbstractTransformerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER:
				return ((InternalEList<?>)getAbstractTransformer()).basicRemove(otherEnd, msgs);
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
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				if (coreType) return getAbstractResponseEndpointGroup();
				return ((FeatureMap.Internal)getAbstractResponseEndpointGroup()).getWrapper();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT:
				return getAbstractResponseEndpoint();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER_GROUP:
				if (coreType) return getAbstractResponseRouterGroup();
				return ((FeatureMap.Internal)getAbstractResponseRouterGroup()).getWrapper();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER:
				return getAbstractResponseRouter();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				if (coreType) return getAbstractTransformerGroup();
				return ((FeatureMap.Internal)getAbstractTransformerGroup()).getWrapper();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TIMEOUT:
				return getTimeout();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TRANSFORMER_REF:
				return getTransformerRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractResponseEndpointGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER_GROUP:
				((FeatureMap.Internal)getAbstractResponseRouterGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				((FeatureMap.Internal)getAbstractTransformerGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TRANSFORMER_REF:
				setTransformerRef((List<String>)newValue);
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
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				getAbstractResponseEndpointGroup().clear();
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER_GROUP:
				getAbstractResponseRouterGroup().clear();
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				getAbstractTransformerGroup().clear();
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TRANSFORMER_REF:
				setTransformerRef(TRANSFORMER_REF_EDEFAULT);
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
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				return abstractResponseEndpointGroup != null && !abstractResponseEndpointGroup.isEmpty();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT:
				return !getAbstractResponseEndpoint().isEmpty();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER_GROUP:
				return abstractResponseRouterGroup != null && !abstractResponseRouterGroup.isEmpty();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER:
				return !getAbstractResponseRouter().isEmpty();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return abstractTransformerGroup != null && !abstractTransformerGroup.isEmpty();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER:
				return !getAbstractTransformer().isEmpty();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE__TRANSFORMER_REF:
				return TRANSFORMER_REF_EDEFAULT == null ? transformerRef != null : !TRANSFORMER_REF_EDEFAULT.equals(transformerRef);
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
		result.append(" (abstractResponseEndpointGroup: ");
		result.append(abstractResponseEndpointGroup);
		result.append(", abstractResponseRouterGroup: ");
		result.append(abstractResponseRouterGroup);
		result.append(", abstractTransformerGroup: ");
		result.append(abstractTransformerGroup);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", transformerRef: ");
		result.append(transformerRef);
		result.append(')');
		return result.toString();
	}

} //ResponseRouterCollectionTypeImpl
