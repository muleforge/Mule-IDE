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
import org.mule.ide.config.core.AbstractAsyncReplyRouterType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Async Reply Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#getAbstractAsyncReplyRouterGroup <em>Abstract Async Reply Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#getAbstractAsyncReplyRouter <em>Abstract Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#isFailOnTimeout <em>Fail On Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsyncReplyCollectionTypeImpl extends PlaceholderSupportEObjectImpl implements AsyncReplyCollectionType {
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
	 * The cached value of the '{@link #getAbstractAsyncReplyRouterGroup() <em>Abstract Async Reply Router Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractAsyncReplyRouterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractAsyncReplyRouterGroup;

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
	 * The default value of the '{@link #isFailOnTimeout() <em>Fail On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailOnTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAIL_ON_TIMEOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailOnTimeout() <em>Fail On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailOnTimeout()
	 * @generated
	 * @ordered
	 */
	protected boolean failOnTimeout = FAIL_ON_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Fail On Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failOnTimeoutESet;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeoutESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsyncReplyCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAsyncReplyCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractInboundEndpointGroup() {
		if (abstractInboundEndpointGroup == null) {
			abstractInboundEndpointGroup = new BasicFeatureMap(this, CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP);
		}
		return abstractInboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInboundEndpointType> getAbstractInboundEndpoint() {
		return getAbstractInboundEndpointGroup().list(CorePackage.eINSTANCE.getAsyncReplyCollectionType_AbstractInboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractAsyncReplyRouterGroup() {
		if (abstractAsyncReplyRouterGroup == null) {
			abstractAsyncReplyRouterGroup = new BasicFeatureMap(this, CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER_GROUP);
		}
		return abstractAsyncReplyRouterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAsyncReplyRouterType> getAbstractAsyncReplyRouter() {
		return getAbstractAsyncReplyRouterGroup().list(CorePackage.eINSTANCE.getAsyncReplyCollectionType_AbstractAsyncReplyRouter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransformerGroup() {
		if (abstractTransformerGroup == null) {
			abstractTransformerGroup = new BasicFeatureMap(this, CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP);
		}
		return abstractTransformerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransformerType> getAbstractTransformer() {
		return getAbstractTransformerGroup().list(CorePackage.eINSTANCE.getAsyncReplyCollectionType_AbstractTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFailOnTimeout() {
		return failOnTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailOnTimeout(boolean newFailOnTimeout) {
		boolean oldFailOnTimeout = failOnTimeout;
		failOnTimeout = newFailOnTimeout;
		boolean oldFailOnTimeoutESet = failOnTimeoutESet;
		failOnTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASYNC_REPLY_COLLECTION_TYPE__FAIL_ON_TIMEOUT, oldFailOnTimeout, failOnTimeout, !oldFailOnTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFailOnTimeout() {
		boolean oldFailOnTimeout = failOnTimeout;
		boolean oldFailOnTimeoutESet = failOnTimeoutESet;
		failOnTimeout = FAIL_ON_TIMEOUT_EDEFAULT;
		failOnTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ASYNC_REPLY_COLLECTION_TYPE__FAIL_ON_TIMEOUT, oldFailOnTimeout, FAIL_ON_TIMEOUT_EDEFAULT, oldFailOnTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFailOnTimeout() {
		return failOnTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		boolean oldTimeoutESet = timeoutESet;
		timeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASYNC_REPLY_COLLECTION_TYPE__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeout() {
		int oldTimeout = timeout;
		boolean oldTimeoutESet = timeoutESet;
		timeout = TIMEOUT_EDEFAULT;
		timeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ASYNC_REPLY_COLLECTION_TYPE__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeout() {
		return timeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractInboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractInboundEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER_GROUP:
				return ((InternalEList<?>)getAbstractAsyncReplyRouterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER:
				return ((InternalEList<?>)getAbstractAsyncReplyRouter()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return ((InternalEList<?>)getAbstractTransformerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER:
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
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractInboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractInboundEndpointGroup()).getWrapper();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return getAbstractInboundEndpoint();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER_GROUP:
				if (coreType) return getAbstractAsyncReplyRouterGroup();
				return ((FeatureMap.Internal)getAbstractAsyncReplyRouterGroup()).getWrapper();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER:
				return getAbstractAsyncReplyRouter();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				if (coreType) return getAbstractTransformerGroup();
				return ((FeatureMap.Internal)getAbstractTransformerGroup()).getWrapper();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__FAIL_ON_TIMEOUT:
				return isFailOnTimeout() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__TIMEOUT:
				return new Integer(getTimeout());
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
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractInboundEndpointGroup()).set(newValue);
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER_GROUP:
				((FeatureMap.Internal)getAbstractAsyncReplyRouterGroup()).set(newValue);
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				((FeatureMap.Internal)getAbstractTransformerGroup()).set(newValue);
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__FAIL_ON_TIMEOUT:
				setFailOnTimeout(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__TIMEOUT:
				setTimeout(((Integer)newValue).intValue());
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
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				getAbstractInboundEndpointGroup().clear();
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER_GROUP:
				getAbstractAsyncReplyRouterGroup().clear();
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				getAbstractTransformerGroup().clear();
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__FAIL_ON_TIMEOUT:
				unsetFailOnTimeout();
				return;
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__TIMEOUT:
				unsetTimeout();
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
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
				return abstractInboundEndpointGroup != null && !abstractInboundEndpointGroup.isEmpty();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT:
				return !getAbstractInboundEndpoint().isEmpty();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER_GROUP:
				return abstractAsyncReplyRouterGroup != null && !abstractAsyncReplyRouterGroup.isEmpty();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER:
				return !getAbstractAsyncReplyRouter().isEmpty();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return abstractTransformerGroup != null && !abstractTransformerGroup.isEmpty();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER:
				return !getAbstractTransformer().isEmpty();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__FAIL_ON_TIMEOUT:
				return isSetFailOnTimeout();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE__TIMEOUT:
				return isSetTimeout();
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
		result.append(", abstractAsyncReplyRouterGroup: ");
		result.append(abstractAsyncReplyRouterGroup);
		result.append(", abstractTransformerGroup: ");
		result.append(abstractTransformerGroup);
		result.append(", failOnTimeout: ");
		if (failOnTimeoutESet) result.append(failOnTimeout); else result.append("<unset>");
		result.append(", timeout: ");
		if (timeoutESet) result.append(timeout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}
	
} //AsyncReplyCollectionTypeImpl
