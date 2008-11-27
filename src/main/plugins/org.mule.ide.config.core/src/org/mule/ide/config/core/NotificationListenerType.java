/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Listener Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.NotificationListenerType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationListenerType#getSubscription <em>Subscription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getNotificationListenerType()
 * @model extendedMetaData="name='notification-listener_._type' kind='empty'"
 * @generated
 */
public interface NotificationListenerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The bean that will receive notifications.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getNotificationListenerType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NotificationListenerType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 An optional string that is compared with the event's resource identifier.
	 *                                 Only events with matching identifiers will be sent.
	 *                                 If no value is given, all events are sent.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription</em>' attribute.
	 * @see #setSubscription(String)
	 * @see org.mule.ide.config.core.CorePackage#getNotificationListenerType_Subscription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='subscription'"
	 * @generated
	 */
	String getSubscription();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.NotificationListenerType#getSubscription <em>Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' attribute.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(String value);

} // NotificationListenerType
