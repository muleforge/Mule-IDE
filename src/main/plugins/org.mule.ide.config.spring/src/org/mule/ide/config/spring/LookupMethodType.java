/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.LookupMethodType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.LookupMethodType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getLookupMethodType()
 * @model extendedMetaData="name='lookup-method_._type' kind='empty'"
 * @generated
 */
public interface LookupMethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the bean in the current or ancestor factories that
	 * 	the lookup method should resolve to. Often this bean will be a
	 * 	prototype, in which case the lookup method will return a distinct
	 * 	instance on every invocation. This is useful for single-threaded objects.
	 * 							]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' attribute.
	 * @see #setBean(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getLookupMethodType_Bean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bean'"
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.LookupMethodType#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the lookup method. This method must take no arguments.
	 * 							]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getLookupMethodType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.LookupMethodType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LookupMethodType
