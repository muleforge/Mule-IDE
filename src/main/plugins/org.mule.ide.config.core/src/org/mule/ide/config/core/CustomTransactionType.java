/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.CustomTransactionType#getFactoryClass <em>Factory Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.CustomTransactionType#getFactoryRef <em>Factory Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getCustomTransactionType()
 * @model extendedMetaData="name='customTransactionType' kind='empty'"
 * @generated
 */
public interface CustomTransactionType extends AbstractTransactionType {
	/**
	 * Returns the value of the '<em><b>Factory Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Class</em>' attribute.
	 * @see #setFactoryClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getCustomTransactionType_FactoryClass()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='factory-class'"
	 * @generated
	 */
	String getFactoryClass();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.CustomTransactionType#getFactoryClass <em>Factory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Class</em>' attribute.
	 * @see #getFactoryClass()
	 * @generated
	 */
	void setFactoryClass(String value);

	/**
	 * Returns the value of the '<em><b>Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Ref</em>' attribute.
	 * @see #setFactoryRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getCustomTransactionType_FactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='factory-ref'"
	 * @generated
	 */
	String getFactoryRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.CustomTransactionType#getFactoryRef <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Ref</em>' attribute.
	 * @see #getFactoryRef()
	 * @generated
	 */
	void setFactoryRef(String value);

} // CustomTransactionType
