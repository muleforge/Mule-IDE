/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.core.KeyValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getOption <em>Option</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getAllowedMethods <em>Allowed Methods</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getExtraClasses <em>Extra Classes</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getWsdlInputSchema <em>Wsdl Input Schema</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getWsdlPortType <em>Wsdl Port Type</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getWsdlServiceElement <em>Wsdl Service Element</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getWsdlServicePort <em>Wsdl Service Port</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getWsdlSoapActionMode <em>Wsdl Soap Action Mode</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.OptionsType#getWsdlTargetNamespace <em>Wsdl Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType()
 * @model extendedMetaData="name='options_._type' kind='elementOnly'"
 * @generated
 */
public interface OptionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_Option()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeyValueType> getOption();

	/**
	 * Returns the value of the '<em><b>Allowed Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Methods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Methods</em>' attribute.
	 * @see #setAllowedMethods(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_AllowedMethods()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowedMethods'"
	 * @generated
	 */
	String getAllowedMethods();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getAllowedMethods <em>Allowed Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Methods</em>' attribute.
	 * @see #getAllowedMethods()
	 * @generated
	 */
	void setAllowedMethods(String value);

	/**
	 * Returns the value of the '<em><b>Extra Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Classes</em>' attribute.
	 * @see #setExtraClasses(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_ExtraClasses()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='extraClasses'"
	 * @generated
	 */
	String getExtraClasses();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getExtraClasses <em>Extra Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Classes</em>' attribute.
	 * @see #getExtraClasses()
	 * @generated
	 */
	void setExtraClasses(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_Scope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Input Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Input Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Input Schema</em>' attribute.
	 * @see #setWsdlInputSchema(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_WsdlInputSchema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wsdlInputSchema'"
	 * @generated
	 */
	String getWsdlInputSchema();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getWsdlInputSchema <em>Wsdl Input Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Input Schema</em>' attribute.
	 * @see #getWsdlInputSchema()
	 * @generated
	 */
	void setWsdlInputSchema(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Port Type</em>' attribute.
	 * @see #setWsdlPortType(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_WsdlPortType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wsdlPortType'"
	 * @generated
	 */
	String getWsdlPortType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getWsdlPortType <em>Wsdl Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Port Type</em>' attribute.
	 * @see #getWsdlPortType()
	 * @generated
	 */
	void setWsdlPortType(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Service Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Service Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Service Element</em>' attribute.
	 * @see #setWsdlServiceElement(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_WsdlServiceElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wsdlServiceElement'"
	 * @generated
	 */
	String getWsdlServiceElement();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getWsdlServiceElement <em>Wsdl Service Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Service Element</em>' attribute.
	 * @see #getWsdlServiceElement()
	 * @generated
	 */
	void setWsdlServiceElement(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Service Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Service Port</em>' attribute.
	 * @see #setWsdlServicePort(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_WsdlServicePort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wsdlServicePort'"
	 * @generated
	 */
	String getWsdlServicePort();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getWsdlServicePort <em>Wsdl Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Service Port</em>' attribute.
	 * @see #getWsdlServicePort()
	 * @generated
	 */
	void setWsdlServicePort(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Soap Action Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Soap Action Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Soap Action Mode</em>' attribute.
	 * @see #setWsdlSoapActionMode(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_WsdlSoapActionMode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wsdlSoapActionMode'"
	 * @generated
	 */
	String getWsdlSoapActionMode();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getWsdlSoapActionMode <em>Wsdl Soap Action Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Soap Action Mode</em>' attribute.
	 * @see #getWsdlSoapActionMode()
	 * @generated
	 */
	void setWsdlSoapActionMode(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Target Namespace</em>' attribute.
	 * @see #setWsdlTargetNamespace(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getOptionsType_WsdlTargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wsdlTargetNamespace'"
	 * @generated
	 */
	String getWsdlTargetNamespace();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.OptionsType#getWsdlTargetNamespace <em>Wsdl Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Target Namespace</em>' attribute.
	 * @see #getWsdlTargetNamespace()
	 * @generated
	 */
	void setWsdlTargetNamespace(String value);

} // OptionsType
