/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Container Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.IocContainerContextType#getConfigLocation <em>Config Location</em>}</li>
 *   <li>{@link org.mule.ide.config.core.IocContainerContextType#getConfigurationText <em>Configuration Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getIocContainerContextType()
 * @model extendedMetaData="name='iocContainerContextType' kind='elementOnly'"
 * @generated
 */
public interface IocContainerContextType extends BaseContainerContextType {
	/**
	 * Returns the value of the '<em><b>Config Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Location</em>' attribute.
	 * @see #setConfigLocation(String)
	 * @see org.mule.ide.config.core.CorePackage#getIocContainerContextType_ConfigLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='configLocation'"
	 * @generated
	 */
	String getConfigLocation();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.IocContainerContextType#getConfigLocation <em>Config Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Location</em>' attribute.
	 * @see #getConfigLocation()
	 * @generated
	 */
	void setConfigLocation(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Text</em>' attribute.
	 * @see #setConfigurationText(String)
	 * @see org.mule.ide.config.core.CorePackage#getIocContainerContextType_ConfigurationText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='configurationText'"
	 * @generated
	 */
	String getConfigurationText();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.IocContainerContextType#getConfigurationText <em>Configuration Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Text</em>' attribute.
	 * @see #getConfigurationText()
	 * @generated
	 */
	void setConfigurationText(String value);

} // IocContainerContextType
