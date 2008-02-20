/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis;

import org.eclipse.emf.common.util.EList;

import org.mule.ide.config.core.ConnectorType;
import org.mule.ide.config.core.ValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#getSupportedScheme <em>Supported Scheme</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#getAxisRef <em>Axis Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#getClientConfig <em>Client Config</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#getClientProviderRef <em>Client Provider Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#isDoAutoTypes <em>Do Auto Types</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#getServerConfig <em>Server Config</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#getServerProviderRef <em>Server Provider Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.AxisConnectorType#isTreatMapAsNamedParams <em>Treat Map As Named Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType()
 * @model extendedMetaData="name='axisConnectorType' kind='elementOnly'"
 * @generated
 */
public interface AxisConnectorType extends ConnectorType {
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
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_BeanType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bean-type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BeanTypeType> getBeanType();

	/**
	 * Returns the value of the '<em><b>Supported Scheme</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Scheme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Scheme</em>' containment reference list.
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_SupportedScheme()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supported-scheme' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueType> getSupportedScheme();

	/**
	 * Returns the value of the '<em><b>Axis Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Bean reference to the axis server that should be used.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Ref</em>' attribute.
	 * @see #setAxisRef(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_AxisRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='axis-ref'"
	 * @generated
	 */
	String getAxisRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#getAxisRef <em>Axis Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Ref</em>' attribute.
	 * @see #getAxisRef()
	 * @generated
	 */
	void setAxisRef(String value);

	/**
	 * Returns the value of the '<em><b>Client Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Configuration file to use when building the axis client.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Config</em>' attribute.
	 * @see #setClientConfig(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_ClientConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientConfig'"
	 * @generated
	 */
	String getClientConfig();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#getClientConfig <em>Client Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Config</em>' attribute.
	 * @see #getClientConfig()
	 * @generated
	 */
	void setClientConfig(String value);

	/**
	 * Returns the value of the '<em><b>Client Provider Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Bean reference to the client provider that should be used to
	 *                             create the axis client.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Provider Ref</em>' attribute.
	 * @see #setClientProviderRef(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_ClientProviderRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientProvider-ref'"
	 * @generated
	 */
	String getClientProviderRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#getClientProviderRef <em>Client Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Provider Ref</em>' attribute.
	 * @see #getClientProviderRef()
	 * @generated
	 */
	void setClientProviderRef(String value);

	/**
	 * Returns the value of the '<em><b>Do Auto Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Use this property to configure whether AxisServer should automatically map types.
	 *                             This property has only effect if you don't provide your own axisServer via the
	 *                             'axisServer-ref' property.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Auto Types</em>' attribute.
	 * @see #isSetDoAutoTypes()
	 * @see #unsetDoAutoTypes()
	 * @see #setDoAutoTypes(boolean)
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_DoAutoTypes()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='doAutoTypes'"
	 * @generated
	 */
	boolean isDoAutoTypes();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#isDoAutoTypes <em>Do Auto Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Auto Types</em>' attribute.
	 * @see #isSetDoAutoTypes()
	 * @see #unsetDoAutoTypes()
	 * @see #isDoAutoTypes()
	 * @generated
	 */
	void setDoAutoTypes(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#isDoAutoTypes <em>Do Auto Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoAutoTypes()
	 * @see #isDoAutoTypes()
	 * @see #setDoAutoTypes(boolean)
	 * @generated
	 */
	void unsetDoAutoTypes();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#isDoAutoTypes <em>Do Auto Types</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Do Auto Types</em>' attribute is set.
	 * @see #unsetDoAutoTypes()
	 * @see #isDoAutoTypes()
	 * @see #setDoAutoTypes(boolean)
	 * @generated
	 */
	boolean isSetDoAutoTypes();

	/**
	 * Returns the value of the '<em><b>Server Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Configuration file to use when building the axis server.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Config</em>' attribute.
	 * @see #setServerConfig(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_ServerConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serverConfig'"
	 * @generated
	 */
	String getServerConfig();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#getServerConfig <em>Server Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Config</em>' attribute.
	 * @see #getServerConfig()
	 * @generated
	 */
	void setServerConfig(String value);

	/**
	 * Returns the value of the '<em><b>Server Provider Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Bean reference to the server provider that should be used to create the
	 *                             AxisServer.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Provider Ref</em>' attribute.
	 * @see #setServerProviderRef(String)
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_ServerProviderRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serverProvider-ref'"
	 * @generated
	 */
	String getServerProviderRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#getServerProviderRef <em>Server Provider Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Provider Ref</em>' attribute.
	 * @see #getServerProviderRef()
	 * @generated
	 */
	void setServerProviderRef(String value);

	/**
	 * Returns the value of the '<em><b>Treat Map As Named Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The AxisConnector treats a Map as container for named parameters, which 
	 *                             eventually will be unpacked. This will result into a problem if your exposed 
	 *                             service needs to take a Map as a parameter, because the actual Map will never 
	 *                             reach the service intact. In this case set this property to false.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treat Map As Named Params</em>' attribute.
	 * @see #isSetTreatMapAsNamedParams()
	 * @see #unsetTreatMapAsNamedParams()
	 * @see #setTreatMapAsNamedParams(boolean)
	 * @see org.mule.ide.config.axis.AxisPackage#getAxisConnectorType_TreatMapAsNamedParams()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='treatMapAsNamedParams'"
	 * @generated
	 */
	boolean isTreatMapAsNamedParams();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#isTreatMapAsNamedParams <em>Treat Map As Named Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treat Map As Named Params</em>' attribute.
	 * @see #isSetTreatMapAsNamedParams()
	 * @see #unsetTreatMapAsNamedParams()
	 * @see #isTreatMapAsNamedParams()
	 * @generated
	 */
	void setTreatMapAsNamedParams(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#isTreatMapAsNamedParams <em>Treat Map As Named Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTreatMapAsNamedParams()
	 * @see #isTreatMapAsNamedParams()
	 * @see #setTreatMapAsNamedParams(boolean)
	 * @generated
	 */
	void unsetTreatMapAsNamedParams();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.axis.AxisConnectorType#isTreatMapAsNamedParams <em>Treat Map As Named Params</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Treat Map As Named Params</em>' attribute is set.
	 * @see #unsetTreatMapAsNamedParams()
	 * @see #isTreatMapAsNamedParams()
	 * @see #setTreatMapAsNamedParams(boolean)
	 * @generated
	 */
	boolean isSetTreatMapAsNamedParams();

} // AxisConnectorType
