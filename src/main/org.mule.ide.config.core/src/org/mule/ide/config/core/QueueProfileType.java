/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.QueueProfileType#getMaxOutstandingMessages <em>Max Outstanding Messages</em>}</li>
 *   <li>{@link org.mule.ide.config.core.QueueProfileType#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getQueueProfileType()
 * @model extendedMetaData="name='queueProfileType' kind='empty'"
 * @generated
 */
public interface QueueProfileType extends AbstractQueueProfileType {
	/**
	 * Returns the value of the '<em><b>Max Outstanding Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Outstanding Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Outstanding Messages</em>' attribute.
	 * @see #setMaxOutstandingMessages(String)
	 * @see org.mule.ide.config.core.CorePackage#getQueueProfileType_MaxOutstandingMessages()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxOutstandingMessages'"
	 * @generated
	 */
	String getMaxOutstandingMessages();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.QueueProfileType#getMaxOutstandingMessages <em>Max Outstanding Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Outstanding Messages</em>' attribute.
	 * @see #getMaxOutstandingMessages()
	 * @generated
	 */
	void setMaxOutstandingMessages(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #isSetPersistent()
	 * @see #unsetPersistent()
	 * @see #setPersistent(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getQueueProfileType_Persistent()
	 * @model default="false" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='persistent'"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.QueueProfileType#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isSetPersistent()
	 * @see #unsetPersistent()
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.QueueProfileType#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistent()
	 * @see #isPersistent()
	 * @see #setPersistent(boolean)
	 * @generated
	 */
	void unsetPersistent();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.QueueProfileType#isPersistent <em>Persistent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistent</em>' attribute is set.
	 * @see #unsetPersistent()
	 * @see #isPersistent()
	 * @see #setPersistent(boolean)
	 * @generated
	 */
	boolean isSetPersistent();

} // QueueProfileType
