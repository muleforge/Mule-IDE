/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Properties Transformer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getDeleteProperties <em>Delete Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddProperties <em>Add Properties</em>}</li>
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
	 * Returns the value of the '<em><b>Delete Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Properties</em>' containment reference.
	 * @see #setDeleteProperties(ListOrSetType)
	 * @see org.mule.ide.config.core.CorePackage#getMessagePropertiesTransformerType_DeleteProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='delete-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOrSetType getDeleteProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getDeleteProperties <em>Delete Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Properties</em>' containment reference.
	 * @see #getDeleteProperties()
	 * @generated
	 */
	void setDeleteProperties(ListOrSetType value);

	/**
	 * Returns the value of the '<em><b>Add Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Properties</em>' containment reference.
	 * @see #setAddProperties(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getMessagePropertiesTransformerType_AddProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='add-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getAddProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddProperties <em>Add Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Properties</em>' containment reference.
	 * @see #getAddProperties()
	 * @generated
	 */
	void setAddProperties(MapType value);

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
