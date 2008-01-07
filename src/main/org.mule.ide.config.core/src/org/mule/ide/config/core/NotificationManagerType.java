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
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getAbstractDefineNotificationGroup <em>Abstract Define Notification Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getAbstractDefineNotification <em>Abstract Define Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getAbstractDisableNotificationGroup <em>Abstract Disable Notification Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getAbstractDisableNotification <em>Abstract Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NotificationManagerType#getGroup2 <em>Group2</em>}</li>
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
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Define Notification Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Define Notification Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Define Notification Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_AbstractDefineNotificationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-define-notification:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractDefineNotificationGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Define Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractDefineNotificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Define Notification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Define Notification</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_AbstractDefineNotification()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-define-notification' namespace='##targetNamespace' group='abstract-define-notification:group'"
	 * @generated
	 */
	EList<AbstractDefineNotificationType> getAbstractDefineNotification();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Abstract Disable Notification Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Disable Notification Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Disable Notification Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_AbstractDisableNotificationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-disable-notification:group' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	FeatureMap getAbstractDisableNotificationGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Disable Notification</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractDisableNotificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Disable Notification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Disable Notification</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_AbstractDisableNotification()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-disable-notification' namespace='##targetNamespace' group='abstract-disable-notification:group'"
	 * @generated
	 */
	EList<AbstractDisableNotificationType> getAbstractDisableNotification();

	/**
	 * Returns the value of the '<em><b>Group2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_Group2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
	 * @generated
	 */
	FeatureMap getGroup2();

	/**
	 * Returns the value of the '<em><b>Notification Listener</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.NotificationListenerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Listener</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Listener</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getNotificationManagerType_NotificationListener()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notification-listener' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<NotificationListenerType> getNotificationListener();

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     If the notification manager is dynamic then updates to the manager will affect
	 *                     all messages.  Otherwise, some parts of the system may cache state for
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
