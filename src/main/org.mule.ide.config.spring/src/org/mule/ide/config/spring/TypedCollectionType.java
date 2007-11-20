/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.TypedCollectionType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getTypedCollectionType()
 * @model extendedMetaData="name='typedCollectionType' kind='empty'"
 * @generated
 */
public interface TypedCollectionType extends BaseCollectionType {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The default Java type for nested values. Must be a fully qualified
	 * 	class name.
	 * 						]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getTypedCollectionType_ValueType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value-type'"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.TypedCollectionType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

} // TypedCollectionType
