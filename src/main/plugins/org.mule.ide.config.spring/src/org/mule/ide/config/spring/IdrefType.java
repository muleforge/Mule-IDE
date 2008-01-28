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
 * A representation of the model object '<em><b>Idref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.IdrefType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.IdrefType#getLocal <em>Local</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getIdrefType()
 * @model extendedMetaData="name='idref_._type' kind='empty'"
 * @generated
 */
public interface IdrefType extends EObject {
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
	 * @see org.mule.ide.config.spring.SpringPackage#getIdrefType_Bean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bean'"
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.IdrefType#getBean <em>Bean</em>}' attribute.
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
	 * @see org.mule.ide.config.spring.SpringPackage#getIdrefType_Local()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='local'"
	 * @generated
	 */
	String getLocal();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.IdrefType#getLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(String value);

} // IdrefType
