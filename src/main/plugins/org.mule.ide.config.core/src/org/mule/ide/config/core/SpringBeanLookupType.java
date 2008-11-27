/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Bean Lookup Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.SpringBeanLookupType#getBean <em>Bean</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSpringBeanLookupType()
 * @model extendedMetaData="name='springBeanLookupType' kind='elementOnly'"
 * @generated
 */
public interface SpringBeanLookupType extends AbstractObjectFactoryType {
	/**
	 * Returns the value of the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of Spring bean to look up
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' attribute.
	 * @see #setBean(String)
	 * @see org.mule.ide.config.core.CorePackage#getSpringBeanLookupType_Bean()
	 * @model dataType="org.mule.ide.config.core.SubstitutableName"
	 *        extendedMetaData="kind='attribute' name='bean'"
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SpringBeanLookupType#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(String value);

} // SpringBeanLookupType
