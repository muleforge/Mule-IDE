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
 * A representation of the model object '<em><b>Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.RefType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.RefType#getLocal <em>Local</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.RefType#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getRefType()
 * @model extendedMetaData="name='ref_._type' kind='empty'"
 * @generated
 */
public interface RefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the referenced bean.
	 * 							]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' attribute.
	 * @see #setBean(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getRefType_Bean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bean'"
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.RefType#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(String value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the referenced bean. The value must be a bean ID,
	 * 	and thus can be checked by the XML parser, thus should be preferred
	 * 	for references within the same bean factory XML file.
	 * 							]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getRefType_Local()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='local'"
	 * @generated
	 */
	String getLocal();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.RefType#getLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the referenced bean *in a parent factory*.
	 * 						]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getRefType_Parent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parent'"
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.RefType#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

} // RefType
