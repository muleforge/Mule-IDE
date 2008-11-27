/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;

import org.mule.ide.config.core.AbstractFilterType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.PropertyFilterType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.PropertyFilterType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.PropertyFilterType#getPropertyClass <em>Property Class</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.PropertyFilterType#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.jms.JMSPackage#getPropertyFilterType()
 * @model extendedMetaData="name='property-filter_._type' kind='empty'"
 * @generated
 */
public interface PropertyFilterType extends AbstractFilterType {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getPropertyFilterType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.PropertyFilterType#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getPropertyFilterType_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.PropertyFilterType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Class</em>' attribute.
	 * @see #setPropertyClass(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getPropertyFilterType_PropertyClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='propertyClass'"
	 * @generated
	 */
	String getPropertyClass();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.PropertyFilterType#getPropertyClass <em>Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Class</em>' attribute.
	 * @see #getPropertyClass()
	 * @generated
	 */
	void setPropertyClass(String value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getPropertyFilterType_PropertyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='propertyName'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.PropertyFilterType#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // PropertyFilterType
