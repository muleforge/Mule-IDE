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
import org.mule.ide.config.core.AsyncReplyRouterCollectionType;
import org.mule.ide.config.core.AbstractObjectFactoryType;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundRouterCollectionType;
import org.mule.ide.config.core.InitialStateType;
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.OutboundRouterCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getInboundRouter <em>Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractComponentGroup <em>Abstract Component Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getOutboundRouter <em>Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAsyncReplyRouter <em>Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseServiceTypeImpl extends AbstractServiceTypeImpl implements BaseServiceType {
	/**
	 * The cached value of the '{@link #getInboundRouter() <em>Inbound Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundRouter()
	 * @generated
	 * @ordered
	 */
	protected InboundRouterCollectionType inboundRouter;

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
	 * The cached value of the '{@link #getOutboundRouter() <em>Outbound Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundRouter()
	 * @generated
	 * @ordered
	 */
	protected OutboundRouterCollectionType outboundRouter;

	/**
	 * The cached value of the '{@link #getAsyncReplyRouter() <em>Async Reply Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncReplyRouter()
	 * @generated
	 * @ordered
	 */
	protected AsyncReplyRouterCollectionType asyncReplyRouter;

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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

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
	 * @generated
	 */
	protected BaseServiceTypeImpl() {
		super();
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
	public InboundRouterCollectionType getInboundRouter() {
		return inboundRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundRouter(InboundRouterCollectionType newInboundRouter, NotificationChain msgs) {
		InboundRouterCollectionType oldInboundRouter = inboundRouter;
		inboundRouter = newInboundRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER, oldInboundRouter, newInboundRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundRouter(InboundRouterCollectionType newInboundRouter) {
		if (newInboundRouter != inboundRouter) {
			NotificationChain msgs = null;
			if (inboundRouter != null)
				msgs = ((InternalEObject)inboundRouter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER, null, msgs);
			if (newInboundRouter != null)
				msgs = ((InternalEObject)newInboundRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER, null, msgs);
			msgs = basicSetInboundRouter(newInboundRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER, newInboundRouter, newInboundRouter));
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
	public OutboundRouterCollectionType getOutboundRouter() {
		return outboundRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutboundRouter(OutboundRouterCollectionType newOutboundRouter, NotificationChain msgs) {
		OutboundRouterCollectionType oldOutboundRouter = outboundRouter;
		outboundRouter = newOutboundRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER, oldOutboundRouter, newOutboundRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundRouter(OutboundRouterCollectionType newOutboundRouter) {
		if (newOutboundRouter != outboundRouter) {
			NotificationChain msgs = null;
			if (outboundRouter != null)
				msgs = ((InternalEObject)outboundRouter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER, null, msgs);
			if (newOutboundRouter != null)
				msgs = ((InternalEObject)newOutboundRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER, null, msgs);
			msgs = basicSetOutboundRouter(newOutboundRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER, newOutboundRouter, newOutboundRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncReplyRouterCollectionType getAsyncReplyRouter() {
		return asyncReplyRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsyncReplyRouter(AsyncReplyRouterCollectionType newAsyncReplyRouter, NotificationChain msgs) {
		AsyncReplyRouterCollectionType oldAsyncReplyRouter = asyncReplyRouter;
		asyncReplyRouter = newAsyncReplyRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER, oldAsyncReplyRouter, newAsyncReplyRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsyncReplyRouter(AsyncReplyRouterCollectionType newAsyncReplyRouter) {
		if (newAsyncReplyRouter != asyncReplyRouter) {
			NotificationChain msgs = null;
			if (asyncReplyRouter != null)
				msgs = ((InternalEObject)asyncReplyRouter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER, null, msgs);
			if (newAsyncReplyRouter != null)
				msgs = ((InternalEObject)newAsyncReplyRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER, null, msgs);
			msgs = basicSetAsyncReplyRouter(newAsyncReplyRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER, newAsyncReplyRouter, newAsyncReplyRouter));
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
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__CLASS, oldClass, class_));
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				return basicSetInboundRouter(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				return ((InternalEList<?>)getAbstractComponentGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT:
				return basicSetAbstractComponent(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				return basicSetOutboundRouter(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER:
				return basicSetAsyncReplyRouter(null, msgs);
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				return getInboundRouter();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				if (coreType) return getAbstractComponentGroup();
				return ((FeatureMap.Internal)getAbstractComponentGroup()).getWrapper();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT:
				return getAbstractComponent();
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				return getOutboundRouter();
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER:
				return getAsyncReplyRouter();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				if (coreType) return getAbstractExceptionStrategyGroup();
				return ((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).getWrapper();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy();
			case CorePackage.BASE_SERVICE_TYPE__CLASS:
				return getClass_();
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				setInboundRouter((InboundRouterCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				((FeatureMap.Internal)getAbstractComponentGroup()).set(newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				setOutboundRouter((OutboundRouterCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER:
				setAsyncReplyRouter((AsyncReplyRouterCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).set(newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__CLASS:
				setClass((String)newValue);
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				setInboundRouter((InboundRouterCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				getAbstractComponentGroup().clear();
				return;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				setOutboundRouter((OutboundRouterCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER:
				setAsyncReplyRouter((AsyncReplyRouterCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				getAbstractExceptionStrategyGroup().clear();
				return;
			case CorePackage.BASE_SERVICE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
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
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				return inboundRouter != null;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP:
				return abstractComponentGroup != null && !abstractComponentGroup.isEmpty();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_COMPONENT:
				return getAbstractComponent() != null;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				return outboundRouter != null;
			case CorePackage.BASE_SERVICE_TYPE__ASYNC_REPLY_ROUTER:
				return asyncReplyRouter != null;
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				return abstractExceptionStrategyGroup != null && !abstractExceptionStrategyGroup.isEmpty();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy() != null;
			case CorePackage.BASE_SERVICE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
		result.append(", class: ");
		result.append(class_);
		result.append(", initialState: ");
		if (initialStateESet) result.append(initialState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BaseServiceTypeImpl
