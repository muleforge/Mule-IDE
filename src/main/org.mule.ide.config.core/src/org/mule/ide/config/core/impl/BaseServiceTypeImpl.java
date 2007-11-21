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

import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.AbstractObjectFactoryType;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundRouterCollectionType;
import org.mule.ide.config.core.InitialStateType;
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.NestedRouterCollectionType;
import org.mule.ide.config.core.OutboundRouterCollectionType;
import org.mule.ide.config.core.ResponseRouterCollectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getInboundRouter <em>Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getNestedRouter <em>Nested Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getOutboundRouter <em>Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl#getResponseRouter <em>Response Router</em>}</li>
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
	 * The cached value of the '{@link #getAbstractObjectFactoryGroup() <em>Abstract Object Factory Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractObjectFactoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractObjectFactoryGroup;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected MapType properties;

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
	 * The cached value of the '{@link #getNestedRouter() <em>Nested Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedRouter()
	 * @generated
	 * @ordered
	 */
	protected NestedRouterCollectionType nestedRouter;

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
	 * The cached value of the '{@link #getResponseRouter() <em>Response Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseRouter()
	 * @generated
	 * @ordered
	 */
	protected ResponseRouterCollectionType responseRouter;

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
	public FeatureMap getAbstractObjectFactoryGroup() {
		if (abstractObjectFactoryGroup == null) {
			abstractObjectFactoryGroup = new BasicFeatureMap(this, CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP);
		}
		return abstractObjectFactoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObjectFactoryType getAbstractObjectFactory() {
		return (AbstractObjectFactoryType)getAbstractObjectFactoryGroup().get(CorePackage.eINSTANCE.getBaseServiceType_AbstractObjectFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObjectFactory(AbstractObjectFactoryType newAbstractObjectFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractObjectFactoryGroup()).basicAdd(CorePackage.eINSTANCE.getBaseServiceType_AbstractObjectFactory(), newAbstractObjectFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(MapType newProperties, NotificationChain msgs) {
		MapType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(MapType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__PROPERTIES, newProperties, newProperties));
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
	public NestedRouterCollectionType getNestedRouter() {
		return nestedRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedRouter(NestedRouterCollectionType newNestedRouter, NotificationChain msgs) {
		NestedRouterCollectionType oldNestedRouter = nestedRouter;
		nestedRouter = newNestedRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER, oldNestedRouter, newNestedRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedRouter(NestedRouterCollectionType newNestedRouter) {
		if (newNestedRouter != nestedRouter) {
			NotificationChain msgs = null;
			if (nestedRouter != null)
				msgs = ((InternalEObject)nestedRouter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER, null, msgs);
			if (newNestedRouter != null)
				msgs = ((InternalEObject)newNestedRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER, null, msgs);
			msgs = basicSetNestedRouter(newNestedRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER, newNestedRouter, newNestedRouter));
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
	public ResponseRouterCollectionType getResponseRouter() {
		return responseRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseRouter(ResponseRouterCollectionType newResponseRouter, NotificationChain msgs) {
		ResponseRouterCollectionType oldResponseRouter = responseRouter;
		responseRouter = newResponseRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER, oldResponseRouter, newResponseRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseRouter(ResponseRouterCollectionType newResponseRouter) {
		if (newResponseRouter != responseRouter) {
			NotificationChain msgs = null;
			if (responseRouter != null)
				msgs = ((InternalEObject)responseRouter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER, null, msgs);
			if (newResponseRouter != null)
				msgs = ((InternalEObject)newResponseRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER, null, msgs);
			msgs = basicSetResponseRouter(newResponseRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER, newResponseRouter, newResponseRouter));
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
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				return ((InternalEList<?>)getAbstractObjectFactoryGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY:
				return basicSetAbstractObjectFactory(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				return basicSetInboundRouter(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER:
				return basicSetNestedRouter(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				return basicSetOutboundRouter(null, msgs);
			case CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER:
				return basicSetResponseRouter(null, msgs);
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
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				if (coreType) return getAbstractObjectFactoryGroup();
				return ((FeatureMap.Internal)getAbstractObjectFactoryGroup()).getWrapper();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory();
			case CorePackage.BASE_SERVICE_TYPE__PROPERTIES:
				return getProperties();
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				return getInboundRouter();
			case CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER:
				return getNestedRouter();
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				return getOutboundRouter();
			case CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER:
				return getResponseRouter();
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
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				((FeatureMap.Internal)getAbstractObjectFactoryGroup()).set(newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__PROPERTIES:
				setProperties((MapType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				setInboundRouter((InboundRouterCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER:
				setNestedRouter((NestedRouterCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				setOutboundRouter((OutboundRouterCollectionType)newValue);
				return;
			case CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER:
				setResponseRouter((ResponseRouterCollectionType)newValue);
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
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				getAbstractObjectFactoryGroup().clear();
				return;
			case CorePackage.BASE_SERVICE_TYPE__PROPERTIES:
				setProperties((MapType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				setInboundRouter((InboundRouterCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER:
				setNestedRouter((NestedRouterCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				setOutboundRouter((OutboundRouterCollectionType)null);
				return;
			case CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER:
				setResponseRouter((ResponseRouterCollectionType)null);
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
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP:
				return abstractObjectFactoryGroup != null && !abstractObjectFactoryGroup.isEmpty();
			case CorePackage.BASE_SERVICE_TYPE__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory() != null;
			case CorePackage.BASE_SERVICE_TYPE__PROPERTIES:
				return properties != null;
			case CorePackage.BASE_SERVICE_TYPE__INBOUND_ROUTER:
				return inboundRouter != null;
			case CorePackage.BASE_SERVICE_TYPE__NESTED_ROUTER:
				return nestedRouter != null;
			case CorePackage.BASE_SERVICE_TYPE__OUTBOUND_ROUTER:
				return outboundRouter != null;
			case CorePackage.BASE_SERVICE_TYPE__RESPONSE_ROUTER:
				return responseRouter != null;
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
		result.append(" (abstractObjectFactoryGroup: ");
		result.append(abstractObjectFactoryGroup);
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
