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

import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.AbstractPropertyExtractorType;
import org.mule.ide.config.core.AbstractTransactionType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomPropertyExtractorType;
import org.mule.ide.config.core.EnableCorrelationType;
import org.mule.ide.config.core.OutboundRouterType;
import org.mule.ide.config.core.ReplyToType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outbound Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl#getEnableCorrelation <em>Enable Correlation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutboundRouterTypeImpl extends AbstractOutboundRouterTypeImpl implements OutboundRouterType {
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
	 * The cached value of the '{@link #getReplyTo() <em>Reply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyTo()
	 * @generated
	 * @ordered
	 */
	protected ReplyToType replyTo;

	/**
	 * The cached value of the '{@link #getAbstractTransactionGroup() <em>Abstract Transaction Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTransactionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTransactionGroup;

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
	 * The default value of the '{@link #getEnableCorrelation() <em>Enable Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCorrelation()
	 * @generated
	 * @ordered
	 */
	protected static final EnableCorrelationType ENABLE_CORRELATION_EDEFAULT = EnableCorrelationType.ALWAYS;

	/**
	 * The cached value of the '{@link #getEnableCorrelation() <em>Enable Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCorrelation()
	 * @generated
	 * @ordered
	 */
	protected EnableCorrelationType enableCorrelation = ENABLE_CORRELATION_EDEFAULT;

	/**
	 * This is true if the Enable Correlation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableCorrelationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutboundRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getOutboundRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractOutboundEndpointGroup() {
		if (abstractOutboundEndpointGroup == null) {
			abstractOutboundEndpointGroup = new BasicFeatureMap(this, CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP);
		}
		return abstractOutboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractOutboundEndpointType> getAbstractOutboundEndpoint() {
		return getAbstractOutboundEndpointGroup().list(CorePackage.eINSTANCE.getOutboundRouterType_AbstractOutboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyToType getReplyTo() {
		return replyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyTo(ReplyToType newReplyTo, NotificationChain msgs) {
		ReplyToType oldReplyTo = replyTo;
		replyTo = newReplyTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO, oldReplyTo, newReplyTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyTo(ReplyToType newReplyTo) {
		if (newReplyTo != replyTo) {
			NotificationChain msgs = null;
			if (replyTo != null)
				msgs = ((InternalEObject)replyTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO, null, msgs);
			if (newReplyTo != null)
				msgs = ((InternalEObject)newReplyTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO, null, msgs);
			msgs = basicSetReplyTo(newReplyTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO, newReplyTo, newReplyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransactionGroup() {
		if (abstractTransactionGroup == null) {
			abstractTransactionGroup = new BasicFeatureMap(this, CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP);
		}
		return abstractTransactionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransactionType getAbstractTransaction() {
		return (AbstractTransactionType)getAbstractTransactionGroup().get(CorePackage.eINSTANCE.getOutboundRouterType_AbstractTransaction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTransaction(AbstractTransactionType newAbstractTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractTransactionGroup()).basicAdd(CorePackage.eINSTANCE.getOutboundRouterType_AbstractTransaction(), newAbstractTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractPropertyExtractorGroup() {
		if (abstractPropertyExtractorGroup == null) {
			abstractPropertyExtractorGroup = new BasicFeatureMap(this, CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP);
		}
		return abstractPropertyExtractorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getAbstractPropertyExtractor() {
		return (AbstractPropertyExtractorType)getAbstractPropertyExtractorGroup().get(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPropertyExtractor(AbstractPropertyExtractorType newAbstractPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).basicAdd(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractor(), newAbstractPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableCorrelationType getEnableCorrelation() {
		return enableCorrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableCorrelation(EnableCorrelationType newEnableCorrelation) {
		EnableCorrelationType oldEnableCorrelation = enableCorrelation;
		enableCorrelation = newEnableCorrelation == null ? ENABLE_CORRELATION_EDEFAULT : newEnableCorrelation;
		boolean oldEnableCorrelationESet = enableCorrelationESet;
		enableCorrelationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION, oldEnableCorrelation, enableCorrelation, !oldEnableCorrelationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableCorrelation() {
		EnableCorrelationType oldEnableCorrelation = enableCorrelation;
		boolean oldEnableCorrelationESet = enableCorrelationESet;
		enableCorrelation = ENABLE_CORRELATION_EDEFAULT;
		enableCorrelationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION, oldEnableCorrelation, ENABLE_CORRELATION_EDEFAULT, oldEnableCorrelationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableCorrelation() {
		return enableCorrelationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractOutboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractOutboundEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO:
				return basicSetReplyTo(null, msgs);
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP:
				return ((InternalEList<?>)getAbstractTransactionGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION:
				return basicSetAbstractTransaction(null, msgs);
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				return ((InternalEList<?>)getAbstractPropertyExtractorGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return basicSetAbstractPropertyExtractor(null, msgs);
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
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractOutboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).getWrapper();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return getAbstractOutboundEndpoint();
			case CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO:
				return getReplyTo();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP:
				if (coreType) return getAbstractTransactionGroup();
				return ((FeatureMap.Internal)getAbstractTransactionGroup()).getWrapper();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION:
				return getAbstractTransaction();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				if (coreType) return getAbstractPropertyExtractorGroup();
				return ((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).getWrapper();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION:
				return getEnableCorrelation();
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
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).set(newValue);
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO:
				setReplyTo((ReplyToType)newValue);
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP:
				((FeatureMap.Internal)getAbstractTransactionGroup()).set(newValue);
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				((FeatureMap.Internal)getAbstractPropertyExtractorGroup()).set(newValue);
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION:
				setEnableCorrelation((EnableCorrelationType)newValue);
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
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				getAbstractOutboundEndpointGroup().clear();
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO:
				setReplyTo((ReplyToType)null);
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP:
				getAbstractTransactionGroup().clear();
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				getAbstractPropertyExtractorGroup().clear();
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION:
				unsetEnableCorrelation();
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
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return abstractOutboundEndpointGroup != null && !abstractOutboundEndpointGroup.isEmpty();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return !getAbstractOutboundEndpoint().isEmpty();
			case CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO:
				return replyTo != null;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP:
				return abstractTransactionGroup != null && !abstractTransactionGroup.isEmpty();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION:
				return getAbstractTransaction() != null;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
				return abstractPropertyExtractorGroup != null && !abstractPropertyExtractorGroup.isEmpty();
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor() != null;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION:
				return isSetEnableCorrelation();
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
		result.append(", abstractTransactionGroup: ");
		result.append(abstractTransactionGroup);
		result.append(", abstractPropertyExtractorGroup: ");
		result.append(abstractPropertyExtractorGroup);
		result.append(", enableCorrelation: ");
		if (enableCorrelationESet) result.append(enableCorrelation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutboundRouterTypeImpl
