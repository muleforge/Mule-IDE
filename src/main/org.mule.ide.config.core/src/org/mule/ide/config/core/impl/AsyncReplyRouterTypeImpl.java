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
import org.mule.ide.config.core.AbstractPropertyExtractorType;
import org.mule.ide.config.core.AsyncReplyRouterType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomPropertyExtractorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Async Reply Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
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
	 * The cached value of the '{@link #getAbstractPropertyExtractorGroup() <em>Abstract Property Extractor Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractPropertyExtractorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractPropertyExtractorGroup;

	/**
	 * The cached value of the '{@link #getCustomPropertyExtractor() <em>Custom Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomPropertyExtractor()
	 * @generated
	 * @ordered
	 */
	protected CustomPropertyExtractorType customPropertyExtractor;

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
	public FeatureMap getAbstractPropertyExtractorGroup() {
		if (abstractPropertyExtractorGroup == null) {
			abstractPropertyExtractorGroup = new BasicFeatureMap(this, CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP);
		}
		return abstractPropertyExtractorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getAbstractPropertyExtractor() {
		return (AbstractPropertyExtractorType)getAbstractPropertyExtractorGroup().get(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPropertyExtractor(AbstractPropertyExtractorType newAbstractPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).basicAdd(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractor(), newAbstractPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPropertyExtractorType getCustomPropertyExtractor() {
		return customPropertyExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomPropertyExtractor(CustomPropertyExtractorType newCustomPropertyExtractor, NotificationChain msgs) {
		CustomPropertyExtractorType oldCustomPropertyExtractor = customPropertyExtractor;
		customPropertyExtractor = newCustomPropertyExtractor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, oldCustomPropertyExtractor, newCustomPropertyExtractor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomPropertyExtractor(CustomPropertyExtractorType newCustomPropertyExtractor) {
		if (newCustomPropertyExtractor != customPropertyExtractor) {
			NotificationChain msgs = null;
			if (customPropertyExtractor != null)
				msgs = ((InternalEObject)customPropertyExtractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, null, msgs);
			if (newCustomPropertyExtractor != null)
				msgs = ((InternalEObject)newCustomPropertyExtractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, null, msgs);
			msgs = basicSetCustomPropertyExtractor(newCustomPropertyExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, newCustomPropertyExtractor, newCustomPropertyExtractor));
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				return ((InternalEList<?>)getAbstractPropertyExtractorGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return basicSetAbstractPropertyExtractor(null, msgs);
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
				return basicSetCustomPropertyExtractor(null, msgs);
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				if (coreType) return getAbstractPropertyExtractorGroup();
				return ((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).getWrapper();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
				return getCustomPropertyExtractor();
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).set(newValue);
				return;
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
				setCustomPropertyExtractor((CustomPropertyExtractorType)newValue);
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				getAbstractPropertyExtractorGroup().clear();
				return;
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
				setCustomPropertyExtractor((CustomPropertyExtractorType)null);
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
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				return abstractPropertyExtractorGroup != null && !abstractPropertyExtractorGroup.isEmpty();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor() != null;
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
				return customPropertyExtractor != null;
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
		result.append(", abstractPropertyExtractorGroup: ");
		result.append(abstractPropertyExtractorGroup);
		result.append(')');
		return result.toString();
	}

} //AsyncReplyRouterTypeImpl
