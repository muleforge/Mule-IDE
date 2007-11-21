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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractPropertyExtractorType;
import org.mule.ide.config.core.AbstractResponseEndpointType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ResponseRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterTypeImpl#getAbstractResponseEndpointGroup <em>Abstract Response Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterTypeImpl#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterTypeImpl#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterTypeImpl#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ResponseRouterTypeImpl#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseRouterTypeImpl extends AbstractResponseRouterTypeImpl implements ResponseRouterType {
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
	protected EObject customPropertyExtractor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getResponseRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractResponseEndpointGroup() {
		if (abstractResponseEndpointGroup == null) {
			abstractResponseEndpointGroup = new BasicFeatureMap(this, CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP);
		}
		return abstractResponseEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResponseEndpointType> getAbstractResponseEndpoint() {
		return getAbstractResponseEndpointGroup().list(CorePackage.eINSTANCE.getResponseRouterType_AbstractResponseEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractPropertyExtractorGroup() {
		if (abstractPropertyExtractorGroup == null) {
			abstractPropertyExtractorGroup = new BasicFeatureMap(this, CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP);
		}
		return abstractPropertyExtractorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getAbstractPropertyExtractor() {
		return (AbstractPropertyExtractorType)getAbstractPropertyExtractorGroup().get(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPropertyExtractor(AbstractPropertyExtractorType newAbstractPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).basicAdd(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractor(), newAbstractPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCustomPropertyExtractor() {
		return customPropertyExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomPropertyExtractor(EObject newCustomPropertyExtractor, NotificationChain msgs) {
		EObject oldCustomPropertyExtractor = customPropertyExtractor;
		customPropertyExtractor = newCustomPropertyExtractor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, oldCustomPropertyExtractor, newCustomPropertyExtractor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomPropertyExtractor(EObject newCustomPropertyExtractor) {
		if (newCustomPropertyExtractor != customPropertyExtractor) {
			NotificationChain msgs = null;
			if (customPropertyExtractor != null)
				msgs = ((InternalEObject)customPropertyExtractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, null, msgs);
			if (newCustomPropertyExtractor != null)
				msgs = ((InternalEObject)newCustomPropertyExtractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, null, msgs);
			msgs = basicSetCustomPropertyExtractor(newCustomPropertyExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR, newCustomPropertyExtractor, newCustomPropertyExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractResponseEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT:
				return ((InternalEList<?>)getAbstractResponseEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				return ((InternalEList<?>)getAbstractPropertyExtractorGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return basicSetAbstractPropertyExtractor(null, msgs);
			case CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
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
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				if (coreType) return getAbstractResponseEndpointGroup();
				return ((FeatureMap.Internal)getAbstractResponseEndpointGroup()).getWrapper();
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT:
				return getAbstractResponseEndpoint();
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				if (coreType) return getAbstractPropertyExtractorGroup();
				return ((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).getWrapper();
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor();
			case CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
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
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractResponseEndpointGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).set(newValue);
				return;
			case CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
				setCustomPropertyExtractor((EObject)newValue);
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
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				getAbstractResponseEndpointGroup().clear();
				return;
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				getAbstractPropertyExtractorGroup().clear();
				return;
			case CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
				setCustomPropertyExtractor((EObject)null);
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
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
				return abstractResponseEndpointGroup != null && !abstractResponseEndpointGroup.isEmpty();
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT:
				return !getAbstractResponseEndpoint().isEmpty();
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				return abstractPropertyExtractorGroup != null && !abstractPropertyExtractorGroup.isEmpty();
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor() != null;
			case CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
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
		result.append(" (abstractResponseEndpointGroup: ");
		result.append(abstractResponseEndpointGroup);
		result.append(", abstractPropertyExtractorGroup: ");
		result.append(abstractPropertyExtractorGroup);
		result.append(')');
		return result.toString();
	}

} //ResponseRouterTypeImpl
