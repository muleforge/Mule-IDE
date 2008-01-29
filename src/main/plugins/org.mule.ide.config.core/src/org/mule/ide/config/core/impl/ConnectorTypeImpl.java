/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.ConnectorType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ServiceOverridesType;
import org.mule.ide.config.core.ThreadingProfileType;

import org.mule.ide.config.spring.PropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#getReceiverThreadingProfile <em>Receiver Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#getDispatcherThreadingProfile <em>Dispatcher Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#getServiceOverrides <em>Service Overrides</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#isCreateDispatcherPerRequest <em>Create Dispatcher Per Request</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#isCreateMultipleTransactedReceivers <em>Create Multiple Transacted Receivers</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#isDynamicNotification <em>Dynamic Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ConnectorTypeImpl#getNumberOfConcurrentTransactedReceivers <em>Number Of Concurrent Transacted Receivers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorTypeImpl extends AbstractConnectorTypeImpl implements ConnectorType {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> property;

	/**
	 * The cached value of the '{@link #getReceiverThreadingProfile() <em>Receiver Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverThreadingProfile()
	 * @generated
	 * @ordered
	 */
	protected ThreadingProfileType receiverThreadingProfile;

	/**
	 * The cached value of the '{@link #getDispatcherThreadingProfile() <em>Dispatcher Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatcherThreadingProfile()
	 * @generated
	 * @ordered
	 */
	protected ThreadingProfileType dispatcherThreadingProfile;

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
	 * The cached value of the '{@link #getServiceOverrides() <em>Service Overrides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOverrides()
	 * @generated
	 * @ordered
	 */
	protected ServiceOverridesType serviceOverrides;

	/**
	 * The default value of the '{@link #isCreateDispatcherPerRequest() <em>Create Dispatcher Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDispatcherPerRequest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_DISPATCHER_PER_REQUEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateDispatcherPerRequest() <em>Create Dispatcher Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDispatcherPerRequest()
	 * @generated
	 * @ordered
	 */
	protected boolean createDispatcherPerRequest = CREATE_DISPATCHER_PER_REQUEST_EDEFAULT;

	/**
	 * This is true if the Create Dispatcher Per Request attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createDispatcherPerRequestESet;

	/**
	 * The default value of the '{@link #isCreateMultipleTransactedReceivers() <em>Create Multiple Transacted Receivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateMultipleTransactedReceivers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_MULTIPLE_TRANSACTED_RECEIVERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateMultipleTransactedReceivers() <em>Create Multiple Transacted Receivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateMultipleTransactedReceivers()
	 * @generated
	 * @ordered
	 */
	protected boolean createMultipleTransactedReceivers = CREATE_MULTIPLE_TRANSACTED_RECEIVERS_EDEFAULT;

	/**
	 * This is true if the Create Multiple Transacted Receivers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createMultipleTransactedReceiversESet;

	/**
	 * The default value of the '{@link #isDynamicNotification() <em>Dynamic Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicNotification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_NOTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicNotification() <em>Dynamic Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicNotification()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicNotification = DYNAMIC_NOTIFICATION_EDEFAULT;

	/**
	 * This is true if the Dynamic Notification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicNotificationESet;

	/**
	 * The default value of the '{@link #getNumberOfConcurrentTransactedReceivers() <em>Number Of Concurrent Transacted Receivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfConcurrentTransactedReceivers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfConcurrentTransactedReceivers() <em>Number Of Concurrent Transacted Receivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfConcurrentTransactedReceivers()
	 * @generated
	 * @ordered
	 */
	protected int numberOfConcurrentTransactedReceivers = NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS_EDEFAULT;

	/**
	 * This is true if the Number Of Concurrent Transacted Receivers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberOfConcurrentTransactedReceiversESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConnectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, CorePackage.CONNECTOR_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType getReceiverThreadingProfile() {
		return receiverThreadingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiverThreadingProfile(ThreadingProfileType newReceiverThreadingProfile, NotificationChain msgs) {
		ThreadingProfileType oldReceiverThreadingProfile = receiverThreadingProfile;
		receiverThreadingProfile = newReceiverThreadingProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE, oldReceiverThreadingProfile, newReceiverThreadingProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverThreadingProfile(ThreadingProfileType newReceiverThreadingProfile) {
		if (newReceiverThreadingProfile != receiverThreadingProfile) {
			NotificationChain msgs = null;
			if (receiverThreadingProfile != null)
				msgs = ((InternalEObject)receiverThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE, null, msgs);
			if (newReceiverThreadingProfile != null)
				msgs = ((InternalEObject)newReceiverThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE, null, msgs);
			msgs = basicSetReceiverThreadingProfile(newReceiverThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE, newReceiverThreadingProfile, newReceiverThreadingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType getDispatcherThreadingProfile() {
		return dispatcherThreadingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispatcherThreadingProfile(ThreadingProfileType newDispatcherThreadingProfile, NotificationChain msgs) {
		ThreadingProfileType oldDispatcherThreadingProfile = dispatcherThreadingProfile;
		dispatcherThreadingProfile = newDispatcherThreadingProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE, oldDispatcherThreadingProfile, newDispatcherThreadingProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatcherThreadingProfile(ThreadingProfileType newDispatcherThreadingProfile) {
		if (newDispatcherThreadingProfile != dispatcherThreadingProfile) {
			NotificationChain msgs = null;
			if (dispatcherThreadingProfile != null)
				msgs = ((InternalEObject)dispatcherThreadingProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE, null, msgs);
			if (newDispatcherThreadingProfile != null)
				msgs = ((InternalEObject)newDispatcherThreadingProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE, null, msgs);
			msgs = basicSetDispatcherThreadingProfile(newDispatcherThreadingProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE, newDispatcherThreadingProfile, newDispatcherThreadingProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractExceptionStrategyGroup() {
		if (abstractExceptionStrategyGroup == null) {
			abstractExceptionStrategyGroup = new BasicFeatureMap(this, CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP);
		}
		return abstractExceptionStrategyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExceptionStrategyType getAbstractExceptionStrategy() {
		return (AbstractExceptionStrategyType)getAbstractExceptionStrategyGroup().get(CorePackage.eINSTANCE.getConnectorType_AbstractExceptionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractExceptionStrategy(AbstractExceptionStrategyType newAbstractExceptionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).basicAdd(CorePackage.eINSTANCE.getConnectorType_AbstractExceptionStrategy(), newAbstractExceptionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOverridesType getServiceOverrides() {
		return serviceOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceOverrides(ServiceOverridesType newServiceOverrides, NotificationChain msgs) {
		ServiceOverridesType oldServiceOverrides = serviceOverrides;
		serviceOverrides = newServiceOverrides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES, oldServiceOverrides, newServiceOverrides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceOverrides(ServiceOverridesType newServiceOverrides) {
		if (newServiceOverrides != serviceOverrides) {
			NotificationChain msgs = null;
			if (serviceOverrides != null)
				msgs = ((InternalEObject)serviceOverrides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES, null, msgs);
			if (newServiceOverrides != null)
				msgs = ((InternalEObject)newServiceOverrides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES, null, msgs);
			msgs = basicSetServiceOverrides(newServiceOverrides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES, newServiceOverrides, newServiceOverrides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateDispatcherPerRequest() {
		return createDispatcherPerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateDispatcherPerRequest(boolean newCreateDispatcherPerRequest) {
		boolean oldCreateDispatcherPerRequest = createDispatcherPerRequest;
		createDispatcherPerRequest = newCreateDispatcherPerRequest;
		boolean oldCreateDispatcherPerRequestESet = createDispatcherPerRequestESet;
		createDispatcherPerRequestESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST, oldCreateDispatcherPerRequest, createDispatcherPerRequest, !oldCreateDispatcherPerRequestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateDispatcherPerRequest() {
		boolean oldCreateDispatcherPerRequest = createDispatcherPerRequest;
		boolean oldCreateDispatcherPerRequestESet = createDispatcherPerRequestESet;
		createDispatcherPerRequest = CREATE_DISPATCHER_PER_REQUEST_EDEFAULT;
		createDispatcherPerRequestESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST, oldCreateDispatcherPerRequest, CREATE_DISPATCHER_PER_REQUEST_EDEFAULT, oldCreateDispatcherPerRequestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateDispatcherPerRequest() {
		return createDispatcherPerRequestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateMultipleTransactedReceivers() {
		return createMultipleTransactedReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateMultipleTransactedReceivers(boolean newCreateMultipleTransactedReceivers) {
		boolean oldCreateMultipleTransactedReceivers = createMultipleTransactedReceivers;
		createMultipleTransactedReceivers = newCreateMultipleTransactedReceivers;
		boolean oldCreateMultipleTransactedReceiversESet = createMultipleTransactedReceiversESet;
		createMultipleTransactedReceiversESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS, oldCreateMultipleTransactedReceivers, createMultipleTransactedReceivers, !oldCreateMultipleTransactedReceiversESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreateMultipleTransactedReceivers() {
		boolean oldCreateMultipleTransactedReceivers = createMultipleTransactedReceivers;
		boolean oldCreateMultipleTransactedReceiversESet = createMultipleTransactedReceiversESet;
		createMultipleTransactedReceivers = CREATE_MULTIPLE_TRANSACTED_RECEIVERS_EDEFAULT;
		createMultipleTransactedReceiversESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS, oldCreateMultipleTransactedReceivers, CREATE_MULTIPLE_TRANSACTED_RECEIVERS_EDEFAULT, oldCreateMultipleTransactedReceiversESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreateMultipleTransactedReceivers() {
		return createMultipleTransactedReceiversESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicNotification() {
		return dynamicNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicNotification(boolean newDynamicNotification) {
		boolean oldDynamicNotification = dynamicNotification;
		dynamicNotification = newDynamicNotification;
		boolean oldDynamicNotificationESet = dynamicNotificationESet;
		dynamicNotificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION, oldDynamicNotification, dynamicNotification, !oldDynamicNotificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamicNotification() {
		boolean oldDynamicNotification = dynamicNotification;
		boolean oldDynamicNotificationESet = dynamicNotificationESet;
		dynamicNotification = DYNAMIC_NOTIFICATION_EDEFAULT;
		dynamicNotificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION, oldDynamicNotification, DYNAMIC_NOTIFICATION_EDEFAULT, oldDynamicNotificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamicNotification() {
		return dynamicNotificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfConcurrentTransactedReceivers() {
		return numberOfConcurrentTransactedReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfConcurrentTransactedReceivers(int newNumberOfConcurrentTransactedReceivers) {
		int oldNumberOfConcurrentTransactedReceivers = numberOfConcurrentTransactedReceivers;
		numberOfConcurrentTransactedReceivers = newNumberOfConcurrentTransactedReceivers;
		boolean oldNumberOfConcurrentTransactedReceiversESet = numberOfConcurrentTransactedReceiversESet;
		numberOfConcurrentTransactedReceiversESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS, oldNumberOfConcurrentTransactedReceivers, numberOfConcurrentTransactedReceivers, !oldNumberOfConcurrentTransactedReceiversESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfConcurrentTransactedReceivers() {
		int oldNumberOfConcurrentTransactedReceivers = numberOfConcurrentTransactedReceivers;
		boolean oldNumberOfConcurrentTransactedReceiversESet = numberOfConcurrentTransactedReceiversESet;
		numberOfConcurrentTransactedReceivers = NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS_EDEFAULT;
		numberOfConcurrentTransactedReceiversESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS, oldNumberOfConcurrentTransactedReceivers, NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS_EDEFAULT, oldNumberOfConcurrentTransactedReceiversESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfConcurrentTransactedReceivers() {
		return numberOfConcurrentTransactedReceiversESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONNECTOR_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE:
				return basicSetReceiverThreadingProfile(null, msgs);
			case CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE:
				return basicSetDispatcherThreadingProfile(null, msgs);
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				return ((InternalEList<?>)getAbstractExceptionStrategyGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return basicSetAbstractExceptionStrategy(null, msgs);
			case CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES:
				return basicSetServiceOverrides(null, msgs);
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
			case CorePackage.CONNECTOR_TYPE__PROPERTY:
				return getProperty();
			case CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE:
				return getReceiverThreadingProfile();
			case CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE:
				return getDispatcherThreadingProfile();
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				if (coreType) return getAbstractExceptionStrategyGroup();
				return ((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).getWrapper();
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy();
			case CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES:
				return getServiceOverrides();
			case CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST:
				return isCreateDispatcherPerRequest() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS:
				return isCreateMultipleTransactedReceivers() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION:
				return isDynamicNotification() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS:
				return new Integer(getNumberOfConcurrentTransactedReceivers());
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
			case CorePackage.CONNECTOR_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE:
				setReceiverThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE:
				setDispatcherThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				((FeatureMap.Internal)getAbstractExceptionStrategyGroup()).set(newValue);
				return;
			case CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES:
				setServiceOverrides((ServiceOverridesType)newValue);
				return;
			case CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST:
				setCreateDispatcherPerRequest(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS:
				setCreateMultipleTransactedReceivers(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION:
				setDynamicNotification(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS:
				setNumberOfConcurrentTransactedReceivers(((Integer)newValue).intValue());
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
			case CorePackage.CONNECTOR_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE:
				setReceiverThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE:
				setDispatcherThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				getAbstractExceptionStrategyGroup().clear();
				return;
			case CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES:
				setServiceOverrides((ServiceOverridesType)null);
				return;
			case CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST:
				unsetCreateDispatcherPerRequest();
				return;
			case CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS:
				unsetCreateMultipleTransactedReceivers();
				return;
			case CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION:
				unsetDynamicNotification();
				return;
			case CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS:
				unsetNumberOfConcurrentTransactedReceivers();
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
			case CorePackage.CONNECTOR_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE:
				return receiverThreadingProfile != null;
			case CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE:
				return dispatcherThreadingProfile != null;
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
				return abstractExceptionStrategyGroup != null && !abstractExceptionStrategyGroup.isEmpty();
			case CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy() != null;
			case CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES:
				return serviceOverrides != null;
			case CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST:
				return isSetCreateDispatcherPerRequest();
			case CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS:
				return isSetCreateMultipleTransactedReceivers();
			case CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION:
				return isSetDynamicNotification();
			case CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS:
				return isSetNumberOfConcurrentTransactedReceivers();
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
		result.append(" (abstractExceptionStrategyGroup: ");
		result.append(abstractExceptionStrategyGroup);
		result.append(", createDispatcherPerRequest: ");
		if (createDispatcherPerRequestESet) result.append(createDispatcherPerRequest); else result.append("<unset>");
		result.append(", createMultipleTransactedReceivers: ");
		if (createMultipleTransactedReceiversESet) result.append(createMultipleTransactedReceivers); else result.append("<unset>");
		result.append(", dynamicNotification: ");
		if (dynamicNotificationESet) result.append(dynamicNotification); else result.append("<unset>");
		result.append(", numberOfConcurrentTransactedReceivers: ");
		if (numberOfConcurrentTransactedReceiversESet) result.append(numberOfConcurrentTransactedReceivers); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConnectorTypeImpl
