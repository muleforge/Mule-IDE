/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundCollectionType;
import org.mule.ide.config.core.InitialStateType;
import org.mule.ide.config.core.OutboundCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getInbound <em>Inbound</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractComponentGroup <em>Abstract Component Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getOutbound <em>Outbound</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAsyncReply <em>Async Reply</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseServiceTypeImpl extends AbstractServiceTypeImpl implements BaseServiceType {
	/**
	 * The cached value of the '{@link #getInbound() <em>Inbound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInbound()
	 * @generated
	 * @ordered
	 */
	protected InboundCollectionType inbound;

	/**
	 * The cached value of the '{@link #getAbstractComponentGroup() <em>Abstract Component Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractComponentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractComponentGroup;

	/**
	 * The cached value of the '{@link #getOutbound() <em>Outbound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutbound()
	 * @generated
	 * @ordered
	 */
	protected OutboundCollectionType outbound;

	/**
	 * The cached value of the '{@link #getAsyncReply() <em>Async Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncReply()
	 * @generated
	 * @ordered
	 */
	protected AsyncReplyCollectionType asyncReply;

	/**
	 * The cached value of the '{@link #getAbstractExceptionStrategyGroup() <em>Abstract Exception Strategy Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractExceptionStrategyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractExceptionStrategyGroup;

	/**
	 * The default value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final InitialStateType INITIAL_STATE_EDEFAULT = InitialStateType.STARTED;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected InitialStateType initialState = INITIAL_STATE_EDEFAULT;

	/**
	 * This is true if the Initial State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * customization
	 */
	protected BaseServiceTypeImpl() {
		super();
		
		// Initialize the inbound/outbound/asyncreply collections with
		// placeholder instances.
		setInbound(CoreFactory.eINSTANCE.createInboundCollectionType());
		setAsyncReply(CoreFactory.eINSTANCE.createAsyncReplyCollectionType());
		setOutbound(CoreFactory.eINSTANCE.createOutboundCollectionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getBaseServiceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundCollectionType getInbound() {
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInbound(InboundCollectionType newInbound, NotificationChain msgs) {
		InboundCollectionType oldInbound = inbound;
		inbound = newInbound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__INBOUND, oldInbound, newInbound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * customization
	 */
	public void setInbound(InboundCollectionType newInbound) {
		// After object construction, this collection should never be set to null
		// (except via eInverseRemove() called when the object is being orphaned for GC, see below).
		// The sync reloader will call this with null when the collection is being deleted
		// in source during source editing.  In this case, we should replace the existing collection 
		// with a new placeholder instance.
		if (newInbound == null && inbound != null) {
			if (inbound.isIDEPlaceholder()) {
				return;
			} else {
				newInbound = CoreFactory.eINSTANCE.createInboundCollectionType();
			}
		}
		
		if (newInbound != inbound) {
			NotificationChain msgs = null;
			if (inbound != null)
				msgs = ((InternalEObject)inbound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__INBOUND, null, msgs);
			if (newInbound != null)
				msgs = ((InternalEObject)newInbound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__INBOUND, null, msgs);
			msgs = basicSetInbound(newInbound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__INBOUND, newInbound, newInbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractComponentGroup() {
		if (abstractComponentGroup == null) {
			abstractComponentGroup = new BasicFeatureMap(this, CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP);
		}
		return abstractComponentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentType getAbstractComponent() {
		return (AbstractComponentType)getAbstractComponentGroup().get(CorePackage.eINSTANCE.getBaseServiceType_AbstractComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractComponent(AbstractComponentType newAbstractComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractComponentGroup()).basicAdd(CorePackage.eINSTANCE.getBaseServiceType_AbstractComponent(), newAbstractComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundCollectionType getOutbound() {
		return outbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutbound(OutboundCollectionType newOutbound, NotificationChain msgs) {
		OutboundCollectionType oldOutbound = outbound;
		outbound = newOutbound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__OUTBOUND, oldOutbound, newOutbound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * customization
	 */
	public void setOutbound(OutboundCollectionType newOutbound) {
		// After object construction, this collection should never be set to null
		// (except via eInverseRemove() called when the object is being orphaned for GC, see below).
		// The sync reloader will call this with null when the collection is being deleted
		// in source during source editing.  In this case, we should replace the existing collection 
		// with a new placeholder instance.
		if (newOutbound == null && outbound != null) {
			if (outbound.isIDEPlaceholder()) {
				return;
			} else {
				newOutbound = CoreFactory.eINSTANCE.createOutboundCollectionType();
			}
		}
		
		if (newOutbound != outbound) {
			NotificationChain msgs = null;
			if (outbound != null)
				msgs = ((InternalEObject)outbound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__OUTBOUND, null, msgs);
			if (newOutbound != null)
				msgs = ((InternalEObject)newOutbound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__OUTBOUND, null, msgs);
			msgs = basicSetOutbound(newOutbound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__OUTBOUND, newOutbound, newOutbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncReplyCollectionType getAsyncReply() {
		return asyncReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsyncReply(AsyncReplyCollectionType newAsyncReply, NotificationChain msgs) {
		AsyncReplyCollectionType oldAsyncReply = asyncReply;
		asyncReply = newAsyncReply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY, oldAsyncReply, newAsyncReply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * customization
	 */
	public void setAsyncReply(AsyncReplyCollectionType newAsyncReply) {
		// After object construction, this collection should never be set to null
		// (except via eInverseRemove() called when the object is being orphaned for GC, see below).
		// The sync reloader will call this with null when the collection is being deleted
		// in source during source editing.  In this case, we should replace the existing collection 
		// with a new placeholder instance.
		if (newAsyncReply == null && asyncReply != null) {
			if (asyncReply.isIDEPlaceholder()) {
				return;
			} else {
				newAsyncReply = CoreFactory.eINSTANCE.createAsyncReplyCollectionType();
			}
		}

		if (newAsyncReply != asyncReply) {
			NotificationChain msgs = null;
			if (asyncReply != null)
				msgs = ((InternalEObject)asyncReply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY, null, msgs);
			if (newAsyncReply != null)
				msgs = ((InternalEObject)newAsyncReply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY, null, msgs);
			msgs = basicSetAsyncReply(newAsyncReply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY, newAsyncReply, newAsyncReply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractExceptionStrategyGroup() {
		if (abstractExceptionStrategyGroup == null) {
			abstractExceptionStrategyGroup = new BasicFeatureMap(this, CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP);
		}
		return abstractExceptionStrategyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExceptionStrategyType getAbstractExceptionStrategy() {
		return (AbstractExceptionStrategyType)getAbstractExceptionStrategyGroup().get(CorePackage.eINSTANCE.getBaseServiceType_AbstractExceptionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractExceptionStrategy(AbstractExceptionStrategyType newAbstractExceptionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).basicAdd(CorePackage.eINSTANCE.getBaseServiceType_AbstractExceptionStrategy(), newAbstractExceptionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStateType getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(InitialStateType newInitialState) {
		InitialStateType oldInitialState = initialState;
		initialState = newInitialState == null ? INITIAL_STATE_EDEFAULT : newInitialState;
		boolean oldInitialStateESet = initialStateESet;
		initialStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__INITIAL_STATE, oldInitialState, initialState, !oldInitialStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialState() {
		InitialStateType oldInitialState = initialState;
		boolean oldInitialStateESet = initialStateESet;
		initialState = INITIAL_STATE_EDEFAULT;
		initialStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.BASE_SERVICE_TYPE__INITIAL_STATE, oldInitialState, INITIAL_STATE_EDEFAULT, oldInitialStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialState() {
		return initialStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BASE_SERVICE_TYPE__INBOUND:
				return basicSetInbound(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				return ((InternalEList<?>)getAbstractComponentGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT:
				return basicSetAbstractComponent(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND:
				return basicSetOutbound(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY:
				return basicSetAsyncReply(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractExceptionStrategyGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return basicSetAbstractExceptionStrategy(null, msgs);
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND:
				return getInbound();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				if (coreType) return getAbstractComponentGroup();
				return ((FeatureMap.Internal)getAbstractComponentGroup()).getWrapper();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT:
				return getAbstractComponent();
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND:
				return getOutbound();
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY:
				return getAsyncReply();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				if (coreType) return getAbstractExceptionStrategyGroup();
				return ((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).getWrapper();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy();
			case CorePackage.BASE_SERVICE_TYPE__INITIAL_STATE:
				return getInitialState();
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND:
				setInbound((InboundCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				((FeatureMap.Internal)getAbstractComponentGroup()).set(newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND:
				setOutbound((OutboundCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY:
				setAsyncReply((AsyncReplyCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).set(newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__INITIAL_STATE:
				setInitialState((InitialStateType)newValue);
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND:
				setInbound((InboundCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				getAbstractComponentGroup().clear();
				return;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND:
				setOutbound((OutboundCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY:
				setAsyncReply((AsyncReplyCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				getAbstractExceptionStrategyGroup().clear();
				return;
			case CorePackage.BASE_SERVICE_TYPE__INITIAL_STATE:
				unsetInitialState();
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND:
				return inbound != null;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				return abstractComponentGroup != null && !abstractComponentGroup.isEmpty();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT:
				return getAbstractComponent() != null;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND:
				return outbound != null;
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY:
				return asyncReply != null;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				return abstractExceptionStrategyGroup != null && !abstractExceptionStrategyGroup.isEmpty();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy() != null;
			case CorePackage.BASE_SERVICE_TYPE__INITIAL_STATE:
				return isSetInitialState();
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
		result.append(" (abstractComponentGroup: ");
		result.append(abstractComponentGroup);
		result.append(", abstractExceptionStrategyGroup: ");
		result.append(abstractExceptionStrategyGroup);
		result.append(", initialState: ");
		if (initialStateESet) result.append(initialState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BaseServiceTypeImpl
