/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Manager Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getNotification <em>Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getDisableNotification <em>Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getNotificationListener <em>Notification Listener</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#isDynamic <em>Dynamic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType()
 * @model extendedMetaData="name='notificationManagerType' kind='elementOnly'"
 * @generated
 */
public interface NotificationManagerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.DefineNotificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Associate an event with an interface.
	 *                         Listeners which implement the interface will receive instances of the event.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_Notification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DefineNotificationType> getNotification();

	/**
	 * Returns the value of the '<em><b>Disable Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.DisableNotificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Block the association of an event with a particular interface.
	 *                         This filters events after the association with a particular interface
	 *                         (and so takes precedence).
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disable Notification</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_DisableNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disable-notification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisableNotificationType> getDisableNotification();

	/**
	 * Returns the value of the '<em><b>Notification Listener</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.NotificationListenerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Listener</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Register a bean as a listener with the notification system.
	 *                         Events are dispatched by reflection - the listener will receive all events
	 *                         associated with any interfaces it implements.
	 *                         The relationship between interfaces and events is configured by the
	 *                         notification and disable-notification elements.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification Listener</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_NotificationListener()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notification-listener' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NotificationListenerType> getNotificationListener();

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     If the notification manager is dynamic then programatic updates to the manager
	 *                     (ie via Java code) will affect all messages.
	 *                     Otherwise, some parts of the system may cache state for
	 *                     efficiency and so not generate newly enabled notifications.
	 *                     The default value is false.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #isSetDynamic()
	 * @see #unsetDynamic()
	 * @see #setDynamic(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_Dynamic()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='dynamic'"
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NotificationManagerType#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isSetDynamic()
	 * @see #unsetDynamic()
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.NotificationManagerType#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDynamic()
	 * @see #isDynamic()
	 * @see #setDynamic(boolean)
	 * @generated
	 */
	void unsetDynamic();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.NotificationManagerType#isDynamic <em>Dynamic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dynamic</em>' attribute is set.
	 * @see #unsetDynamic()
	 * @see #isDynamic()
	 * @see #setDynamic(boolean)
	 * @generated
	 */
	boolean isSetDynamic();

} // NotificationManagerType
