/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disable Notification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.DisableNotificationType#getEvent <em>Event</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DisableNotificationType#getEventClass <em>Event Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DisableNotificationType#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DisableNotificationType#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getDisableNotificationType()
 * @model extendedMetaData="name='disableNotificationType' kind='empty'"
 * @generated
 */
public interface DisableNotificationType extends AbstractDisableNotificationType {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The default value is <code>"MANAGER"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.EventType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The event to not deliver.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see org.mule.ide.config.core.EventType1
	 * @see #isSetEvent()
	 * @see #unsetEvent()
	 * @see #setEvent(EventType1)
	 * @see org.mule.ide.config.core.CorePackage#getDisableNotificationType_Event()
	 * @model default="MANAGER" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='event'"
	 * @generated
	 */
	EventType1 getEvent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see org.mule.ide.config.core.EventType1
	 * @see #isSetEvent()
	 * @see #unsetEvent()
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventType1 value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvent()
	 * @see #getEvent()
	 * @see #setEvent(EventType1)
	 * @generated
	 */
	void unsetEvent();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getEvent <em>Event</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event</em>' attribute is set.
	 * @see #unsetEvent()
	 * @see #getEvent()
	 * @see #setEvent(EventType1)
	 * @generated
	 */
	boolean isSetEvent();

	/**
	 * Returns the value of the '<em><b>Event Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The class associated with an event that will no longer be delivered to any interface.
	 *                             This can be used instead of the event attribute to specify a custom class.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Class</em>' attribute.
	 * @see #setEventClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getDisableNotificationType_EventClass()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='event-class'"
	 * @generated
	 */
	String getEventClass();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getEventClass <em>Event Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Class</em>' attribute.
	 * @see #getEventClass()
	 * @generated
	 */
	void setEventClass(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * The default value is <code>"MANAGER"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.InterfaceType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The interface that will no longer receive an event.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see org.mule.ide.config.core.InterfaceType1
	 * @see #isSetInterface()
	 * @see #unsetInterface()
	 * @see #setInterface(InterfaceType1)
	 * @see org.mule.ide.config.core.CorePackage#getDisableNotificationType_Interface()
	 * @model default="MANAGER" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interface'"
	 * @generated
	 */
	InterfaceType1 getInterface();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see org.mule.ide.config.core.InterfaceType1
	 * @see #isSetInterface()
	 * @see #unsetInterface()
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceType1 value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterface()
	 * @see #getInterface()
	 * @see #setInterface(InterfaceType1)
	 * @generated
	 */
	void unsetInterface();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getInterface <em>Interface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interface</em>' attribute is set.
	 * @see #unsetInterface()
	 * @see #getInterface()
	 * @see #setInterface(InterfaceType1)
	 * @generated
	 */
	boolean isSetInterface();

	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The interface (class name) that will no longer receive an event.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Class</em>' attribute.
	 * @see #setInterfaceClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getDisableNotificationType_InterfaceClass()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='interface-class'"
	 * @generated
	 */
	String getInterfaceClass();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DisableNotificationType#getInterfaceClass <em>Interface Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Class</em>' attribute.
	 * @see #getInterfaceClass()
	 * @generated
	 */
	void setInterfaceClass(String value);

} // DisableNotificationType