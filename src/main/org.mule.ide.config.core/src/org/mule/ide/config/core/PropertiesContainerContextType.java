/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Container Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.PropertiesContainerContextType#getAny <em>Any</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PropertiesContainerContextType#isEnableTemplates <em>Enable Templates</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PropertiesContainerContextType#isIncludeSystemProperties <em>Include System Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PropertiesContainerContextType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getPropertiesContainerContextType()
 * @model extendedMetaData="name='propertiesContainerContextType' kind='elementOnly'"
 * @generated
 */
public interface PropertiesContainerContextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getPropertiesContainerContextType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Enable Templates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Templates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Templates</em>' attribute.
	 * @see #isSetEnableTemplates()
	 * @see #unsetEnableTemplates()
	 * @see #setEnableTemplates(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getPropertiesContainerContextType_EnableTemplates()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='enableTemplates'"
	 * @generated
	 */
	boolean isEnableTemplates();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#isEnableTemplates <em>Enable Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Templates</em>' attribute.
	 * @see #isSetEnableTemplates()
	 * @see #unsetEnableTemplates()
	 * @see #isEnableTemplates()
	 * @generated
	 */
	void setEnableTemplates(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#isEnableTemplates <em>Enable Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableTemplates()
	 * @see #isEnableTemplates()
	 * @see #setEnableTemplates(boolean)
	 * @generated
	 */
	void unsetEnableTemplates();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#isEnableTemplates <em>Enable Templates</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Templates</em>' attribute is set.
	 * @see #unsetEnableTemplates()
	 * @see #isEnableTemplates()
	 * @see #setEnableTemplates(boolean)
	 * @generated
	 */
	boolean isSetEnableTemplates();

	/**
	 * Returns the value of the '<em><b>Include System Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include System Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include System Properties</em>' attribute.
	 * @see #isSetIncludeSystemProperties()
	 * @see #unsetIncludeSystemProperties()
	 * @see #setIncludeSystemProperties(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getPropertiesContainerContextType_IncludeSystemProperties()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='includeSystemProperties'"
	 * @generated
	 */
	boolean isIncludeSystemProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#isIncludeSystemProperties <em>Include System Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include System Properties</em>' attribute.
	 * @see #isSetIncludeSystemProperties()
	 * @see #unsetIncludeSystemProperties()
	 * @see #isIncludeSystemProperties()
	 * @generated
	 */
	void setIncludeSystemProperties(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#isIncludeSystemProperties <em>Include System Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeSystemProperties()
	 * @see #isIncludeSystemProperties()
	 * @see #setIncludeSystemProperties(boolean)
	 * @generated
	 */
	void unsetIncludeSystemProperties();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#isIncludeSystemProperties <em>Include System Properties</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include System Properties</em>' attribute is set.
	 * @see #unsetIncludeSystemProperties()
	 * @see #isIncludeSystemProperties()
	 * @see #setIncludeSystemProperties(boolean)
	 * @generated
	 */
	boolean isSetIncludeSystemProperties();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"properties"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.mule.ide.config.core.CorePackage#getPropertiesContainerContextType_Name()
	 * @model default="properties" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.PropertiesContainerContextType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // PropertiesContainerContextType
