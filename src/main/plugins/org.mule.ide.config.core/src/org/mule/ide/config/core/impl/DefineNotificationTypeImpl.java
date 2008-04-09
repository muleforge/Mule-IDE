/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DefineNotificationType;
import org.mule.ide.config.core.NotificationTypes;
import org.mule.ide.config.core.EventType1;
import org.mule.ide.config.core.InterfaceType1;
import org.mule.ide.config.core.EventType;
import org.mule.ide.config.core.InterfaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Notification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.DefineNotificationTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefineNotificationTypeImpl#getEventClass <em>Event Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefineNotificationTypeImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DefineNotificationTypeImpl#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefineNotificationTypeImpl extends EObjectImpl implements DefineNotificationType {
	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationTypes EVENT_EDEFAULT = NotificationTypes.MANAGER;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected NotificationTypes event = EVENT_EDEFAULT;

	/**
	 * This is true if the Event attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventESet;

	/**
	 * The default value of the '{@link #getEventClass() <em>Event Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventClass()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventClass() <em>Event Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventClass()
	 * @generated
	 * @ordered
	 */
	protected String eventClass = EVENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationTypes INTERFACE_EDEFAULT = NotificationTypes.MANAGER;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected NotificationTypes interface_ = INTERFACE_EDEFAULT;

	/**
	 * This is true if the Interface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interfaceESet;

	/**
	 * The default value of the '{@link #getInterfaceClass() <em>Interface Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceClass() <em>Interface Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClass()
	 * @generated
	 * @ordered
	 */
	protected String interfaceClass = INTERFACE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefineNotificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDefineNotificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTypes getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(NotificationTypes newEvent) {
		NotificationTypes oldEvent = event;
		event = newEvent == null ? EVENT_EDEFAULT : newEvent;
		boolean oldEventESet = eventESet;
		eventESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT, oldEvent, event, !oldEventESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvent() {
		NotificationTypes oldEvent = event;
		boolean oldEventESet = eventESet;
		event = EVENT_EDEFAULT;
		eventESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT, oldEvent, EVENT_EDEFAULT, oldEventESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvent() {
		return eventESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventClass() {
		return eventClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventClass(String newEventClass) {
		String oldEventClass = eventClass;
		eventClass = newEventClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT_CLASS, oldEventClass, eventClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTypes getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(NotificationTypes newInterface) {
		NotificationTypes oldInterface = interface_;
		interface_ = newInterface == null ? INTERFACE_EDEFAULT : newInterface;
		boolean oldInterfaceESet = interfaceESet;
		interfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE, oldInterface, interface_, !oldInterfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterface() {
		NotificationTypes oldInterface = interface_;
		boolean oldInterfaceESet = interfaceESet;
		interface_ = INTERFACE_EDEFAULT;
		interfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE, oldInterface, INTERFACE_EDEFAULT, oldInterfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterface() {
		return interfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceClass() {
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceClass(String newInterfaceClass) {
		String oldInterfaceClass = interfaceClass;
		interfaceClass = newInterfaceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE_CLASS, oldInterfaceClass, interfaceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT:
				return getEvent();
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT_CLASS:
				return getEventClass();
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE:
				return getInterface();
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE_CLASS:
				return getInterfaceClass();
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
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT:
				setEvent((NotificationTypes)newValue);
				return;
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT_CLASS:
				setEventClass((String)newValue);
				return;
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE:
				setInterface((NotificationTypes)newValue);
				return;
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE_CLASS:
				setInterfaceClass((String)newValue);
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
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT:
				unsetEvent();
				return;
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT_CLASS:
				setEventClass(EVENT_CLASS_EDEFAULT);
				return;
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE:
				unsetInterface();
				return;
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE_CLASS:
				setInterfaceClass(INTERFACE_CLASS_EDEFAULT);
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
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT:
				return isSetEvent();
			case CorePackage.DEFINE_NOTIFICATION_TYPE__EVENT_CLASS:
				return EVENT_CLASS_EDEFAULT == null ? eventClass != null : !EVENT_CLASS_EDEFAULT.equals(eventClass);
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE:
				return isSetInterface();
			case CorePackage.DEFINE_NOTIFICATION_TYPE__INTERFACE_CLASS:
				return INTERFACE_CLASS_EDEFAULT == null ? interfaceClass != null : !INTERFACE_CLASS_EDEFAULT.equals(interfaceClass);
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
		result.append(" (event: ");
		if (eventESet) result.append(event); else result.append("<unset>");
		result.append(", eventClass: ");
		result.append(eventClass);
		result.append(", interface: ");
		if (interfaceESet) result.append(interface_); else result.append("<unset>");
		result.append(", interfaceClass: ");
		result.append(interfaceClass);
		result.append(')');
		return result.toString();
	}

} //DefineNotificationTypeImpl
