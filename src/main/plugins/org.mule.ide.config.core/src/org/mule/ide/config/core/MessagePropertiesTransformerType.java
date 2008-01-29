/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Properties Transformer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getDeleteMessageProperty <em>Delete Message Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddMessageProperty <em>Add Message Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddMessageProperties <em>Add Message Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MessagePropertiesTransformerType#isOverwrite <em>Overwrite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getMessagePropertiesTransformerType()
 * @model extendedMetaData="name='messagePropertiesTransformerType' kind='elementOnly'"
 * @generated
 */
public interface MessagePropertiesTransformerType extends AbstractTransformerType {
	/**
	 * Returns the value of the '<em><b>Delete Message Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.KeyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Message Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Message Property</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMessagePropertiesTransformerType_DeleteMessageProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='delete-message-property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeyType> getDeleteMessageProperty();

	/**
	 * Returns the value of the '<em><b>Add Message Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Message Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Message Property</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMessagePropertiesTransformerType_AddMessageProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='add-message-property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeyValueType> getAddMessageProperty();

	/**
	 * Returns the value of the '<em><b>Add Message Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Message Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Message Properties</em>' containment reference.
	 * @see #setAddMessageProperties(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getMessagePropertiesTransformerType_AddMessageProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='add-message-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getAddMessageProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddMessageProperties <em>Add Message Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Message Properties</em>' containment reference.
	 * @see #getAddMessageProperties()
	 * @generated
	 */
	void setAddMessageProperties(MapType value);

	/**
	 * Returns the value of the '<em><b>Overwrite</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overwrite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overwrite</em>' attribute.
	 * @see #isSetOverwrite()
	 * @see #unsetOverwrite()
	 * @see #setOverwrite(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getMessagePropertiesTransformerType_Overwrite()
	 * @model default="true" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='overwrite'"
	 * @generated
	 */
	boolean isOverwrite();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#isOverwrite <em>Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overwrite</em>' attribute.
	 * @see #isSetOverwrite()
	 * @see #unsetOverwrite()
	 * @see #isOverwrite()
	 * @generated
	 */
	void setOverwrite(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#isOverwrite <em>Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverwrite()
	 * @see #isOverwrite()
	 * @see #setOverwrite(boolean)
	 * @generated
	 */
	void unsetOverwrite();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#isOverwrite <em>Overwrite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overwrite</em>' attribute is set.
	 * @see #unsetOverwrite()
	 * @see #isOverwrite()
	 * @see #setOverwrite(boolean)
	 * @generated
	 */
	boolean isSetOverwrite();

} // MessagePropertiesTransformerType
