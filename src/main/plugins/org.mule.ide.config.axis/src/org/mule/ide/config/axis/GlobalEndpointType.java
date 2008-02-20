/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis;

import org.eclipse.emf.common.util.EList;

import org.mule.ide.config.core.KeyValueType;
import org.mule.ide.config.core.MapType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getOptions <em>Options</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getSoapService <em>Soap Service</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getSoapMethod <em>Soap Method</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getProperty1 <em>Property1</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getProperties1 <em>Properties1</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getClientConfig <em>Client Config</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getSoapAction <em>Soap Action</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getSOAPAction1 <em>SOAP Action1</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getUse <em>Use</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.GlobalEndpointType#getWsdlFile <em>Wsdl File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType()
 * @model extendedMetaData="name='globalEndpointType' kind='elementOnly'"
 * @generated
 */
public interface GlobalEndpointType extends org.mule.ide.config.core.GlobalEndpointType {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(OptionsType)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_Options()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='options' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionsType getOptions();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(OptionsType value);

	/**
	 * Returns the value of the '<em><b>Bean Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.axis.BeanTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Type</em>' containment reference list.
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_BeanType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bean-type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BeanTypeType> getBeanType();

	/**
	 * Returns the value of the '<em><b>Soap Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.axis.SoapServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Service</em>' containment reference list.
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_SoapService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='soap-service' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SoapServiceType> getSoapService();

	/**
	 * Returns the value of the '<em><b>Soap Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.axis.SoapMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Method</em>' containment reference list.
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_SoapMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='soap-method' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SoapMethodType> getSoapMethod();

	/**
	 * Returns the value of the '<em><b>Property1</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property1</em>' containment reference list.
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_Property1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='http://www.mulesource.org/schema/mule/core/2.0'"
	 * @generated
	 */
	EList<KeyValueType> getProperty1();

	/**
	 * Returns the value of the '<em><b>Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Set properties via Spring's entry attribute.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties1</em>' containment reference.
	 * @see #setProperties1(MapType)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_Properties1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='http://www.mulesource.org/schema/mule/core/2.0'"
	 * @generated
	 */
	MapType getProperties1();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getProperties1 <em>Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties1</em>' containment reference.
	 * @see #getProperties1()
	 * @generated
	 */
	void setProperties1(MapType value);

	/**
	 * Returns the value of the '<em><b>Client Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Config</em>' attribute.
	 * @see #setClientConfig(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_ClientConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientConfig'"
	 * @generated
	 */
	String getClientConfig();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getClientConfig <em>Client Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Config</em>' attribute.
	 * @see #getClientConfig()
	 * @generated
	 */
	void setClientConfig(String value);

	/**
	 * Returns the value of the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Namespace</em>' attribute.
	 * @see #setServiceNamespace(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_ServiceNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceNamespace'"
	 * @generated
	 */
	String getServiceNamespace();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getServiceNamespace <em>Service Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Namespace</em>' attribute.
	 * @see #getServiceNamespace()
	 * @generated
	 */
	void setServiceNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Action</em>' attribute.
	 * @see #setSoapAction(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_SoapAction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='soapAction'"
	 * @generated
	 */
	String getSoapAction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getSoapAction <em>Soap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap Action</em>' attribute.
	 * @see #getSoapAction()
	 * @generated
	 */
	void setSoapAction(String value);

	/**
	 * Returns the value of the '<em><b>SOAP Action1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SOAP Action1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SOAP Action1</em>' attribute.
	 * @see #setSOAPAction1(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_SOAPAction1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SOAPAction'"
	 * @generated
	 */
	String getSOAPAction1();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getSOAPAction1 <em>SOAP Action1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SOAP Action1</em>' attribute.
	 * @see #getSOAPAction1()
	 * @generated
	 */
	void setSOAPAction1(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"RPC"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.axis.StyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.mule.ide.config.axis.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(StyleType)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_Style()
	 * @model default="RPC" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.mule.ide.config.axis.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	boolean isSetStyle();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * The default value is <code>"ENCODED"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.axis.UseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see org.mule.ide.config.axis.UseType
	 * @see #isSetUse()
	 * @see #unsetUse()
	 * @see #setUse(UseType)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_Use()
	 * @model default="ENCODED" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use'"
	 * @generated
	 */
	UseType getUse();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see org.mule.ide.config.axis.UseType
	 * @see #isSetUse()
	 * @see #unsetUse()
	 * @see #getUse()
	 * @generated
	 */
	void setUse(UseType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUse()
	 * @see #getUse()
	 * @see #setUse(UseType)
	 * @generated
	 */
	void unsetUse();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getUse <em>Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use</em>' attribute is set.
	 * @see #unsetUse()
	 * @see #getUse()
	 * @see #setUse(UseType)
	 * @generated
	 */
	boolean isSetUse();

	/**
	 * Returns the value of the '<em><b>Wsdl File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl File</em>' attribute.
	 * @see #setWsdlFile(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getGlobalEndpointType_WsdlFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wsdlFile'"
	 * @generated
	 */
	String getWsdlFile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.GlobalEndpointType#getWsdlFile <em>Wsdl File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl File</em>' attribute.
	 * @see #getWsdlFile()
	 * @generated
	 */
	void setWsdlFile(String value);

} // GlobalEndpointType
