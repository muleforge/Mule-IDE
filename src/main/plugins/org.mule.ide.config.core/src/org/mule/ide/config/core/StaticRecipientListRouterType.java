/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Recipient List Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsDelimiter <em>Recipients Delimiter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsProperty <em>Recipients Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.StaticRecipientListRouterType#isSynchronous <em>Synchronous</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getStaticRecipientListRouterType()
 * @model extendedMetaData="name='staticRecipientListRouterType' kind='elementOnly'"
 * @generated
 */
public interface StaticRecipientListRouterType extends FilteringOutboundRouterType {
	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' containment reference.
	 * @see #setRecipients(ListOrSetType)
	 * @see org.mule.ide.config.core.CorePackage#getStaticRecipientListRouterType_Recipients()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipients' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOrSetType getRecipients();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipients <em>Recipients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipients</em>' containment reference.
	 * @see #getRecipients()
	 * @generated
	 */
	void setRecipients(ListOrSetType value);

	/**
	 * Returns the value of the '<em><b>Recipients Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients Delimiter</em>' attribute.
	 * @see #setRecipientsDelimiter(String)
	 * @see org.mule.ide.config.core.CorePackage#getStaticRecipientListRouterType_RecipientsDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recipientsDelimiter'"
	 * @generated
	 */
	String getRecipientsDelimiter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsDelimiter <em>Recipients Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipients Delimiter</em>' attribute.
	 * @see #getRecipientsDelimiter()
	 * @generated
	 */
	void setRecipientsDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Recipients Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients Property</em>' attribute.
	 * @see #setRecipientsProperty(String)
	 * @see org.mule.ide.config.core.CorePackage#getStaticRecipientListRouterType_RecipientsProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recipientsProperty'"
	 * @generated
	 */
	String getRecipientsProperty();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsProperty <em>Recipients Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipients Property</em>' attribute.
	 * @see #getRecipientsProperty()
	 * @generated
	 */
	void setRecipientsProperty(String value);

	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #isSetSynchronous()
	 * @see #unsetSynchronous()
	 * @see #setSynchronous(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getStaticRecipientListRouterType_Synchronous()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='synchronous'"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.StaticRecipientListRouterType#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #isSetSynchronous()
	 * @see #unsetSynchronous()
	 * @see #isSynchronous()
	 * @generated
	 */
	void setSynchronous(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.StaticRecipientListRouterType#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSynchronous()
	 * @see #isSynchronous()
	 * @see #setSynchronous(boolean)
	 * @generated
	 */
	void unsetSynchronous();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.StaticRecipientListRouterType#isSynchronous <em>Synchronous</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Synchronous</em>' attribute is set.
	 * @see #unsetSynchronous()
	 * @see #isSynchronous()
	 * @see #setSynchronous(boolean)
	 * @generated
	 */
	boolean isSetSynchronous();

} // StaticRecipientListRouterType
