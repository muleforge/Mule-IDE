/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.mule.ide.config.spring.PropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#getReceiverThreadingProfile <em>Receiver Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#getDispatcherThreadingProfile <em>Dispatcher Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#getServiceOverrides <em>Service Overrides</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#isCreateDispatcherPerRequest <em>Create Dispatcher Per Request</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#isCreateMultipleTransactedReceivers <em>Create Multiple Transacted Receivers</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConnectorType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getConnectorType()
 * @model extendedMetaData="name='connectorType' kind='elementOnly'"
 * @generated
 */
public interface ConnectorType extends AbstractConnectorType {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Bean definitions can have zero or more properties.
	 * 	Property elements correspond to JavaBean setter methods exposed
	 * 	by the bean classes. Spring supports primitives, references to other
	 * 	beans in the same or related factories, lists, maps and properties.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='http://www.springframework.org/schema/beans'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Threading Profile</em>' containment reference.
	 * @see #setReceiverThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_ReceiverThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiver-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getReceiverThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConnectorType#getReceiverThreadingProfile <em>Receiver Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Threading Profile</em>' containment reference.
	 * @see #getReceiverThreadingProfile()
	 * @generated
	 */
	void setReceiverThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatcher Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatcher Threading Profile</em>' containment reference.
	 * @see #setDispatcherThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_DispatcherThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispatcher-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDispatcherThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConnectorType#getDispatcherThreadingProfile <em>Dispatcher Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatcher Threading Profile</em>' containment reference.
	 * @see #getDispatcherThreadingProfile()
	 * @generated
	 */
	void setDispatcherThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Exception Strategy Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_AbstractExceptionStrategyGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-exception-strategy:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractExceptionStrategyGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Exception Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_AbstractExceptionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-exception-strategy' namespace='##targetNamespace' group='abstract-exception-strategy:group'"
	 * @generated
	 */
	AbstractExceptionStrategyType getAbstractExceptionStrategy();

	/**
	 * Returns the value of the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Overrides</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Overrides</em>' containment reference.
	 * @see #setServiceOverrides(ServiceOverridesType)
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_ServiceOverrides()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-overrides' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceOverridesType getServiceOverrides();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConnectorType#getServiceOverrides <em>Service Overrides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Overrides</em>' containment reference.
	 * @see #getServiceOverrides()
	 * @generated
	 */
	void setServiceOverrides(ServiceOverridesType value);

	/**
	 * Returns the value of the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Dispatcher Per Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Dispatcher Per Request</em>' attribute.
	 * @see #isSetCreateDispatcherPerRequest()
	 * @see #unsetCreateDispatcherPerRequest()
	 * @see #setCreateDispatcherPerRequest(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_CreateDispatcherPerRequest()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='createDispatcherPerRequest'"
	 * @generated
	 */
	boolean isCreateDispatcherPerRequest();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConnectorType#isCreateDispatcherPerRequest <em>Create Dispatcher Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Dispatcher Per Request</em>' attribute.
	 * @see #isSetCreateDispatcherPerRequest()
	 * @see #unsetCreateDispatcherPerRequest()
	 * @see #isCreateDispatcherPerRequest()
	 * @generated
	 */
	void setCreateDispatcherPerRequest(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ConnectorType#isCreateDispatcherPerRequest <em>Create Dispatcher Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateDispatcherPerRequest()
	 * @see #isCreateDispatcherPerRequest()
	 * @see #setCreateDispatcherPerRequest(boolean)
	 * @generated
	 */
	void unsetCreateDispatcherPerRequest();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ConnectorType#isCreateDispatcherPerRequest <em>Create Dispatcher Per Request</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Dispatcher Per Request</em>' attribute is set.
	 * @see #unsetCreateDispatcherPerRequest()
	 * @see #isCreateDispatcherPerRequest()
	 * @see #setCreateDispatcherPerRequest(boolean)
	 * @generated
	 */
	boolean isSetCreateDispatcherPerRequest();

	/**
	 * Returns the value of the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Multiple Transacted Receivers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Multiple Transacted Receivers</em>' attribute.
	 * @see #isSetCreateMultipleTransactedReceivers()
	 * @see #unsetCreateMultipleTransactedReceivers()
	 * @see #setCreateMultipleTransactedReceivers(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_CreateMultipleTransactedReceivers()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='createMultipleTransactedReceivers'"
	 * @generated
	 */
	boolean isCreateMultipleTransactedReceivers();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConnectorType#isCreateMultipleTransactedReceivers <em>Create Multiple Transacted Receivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Multiple Transacted Receivers</em>' attribute.
	 * @see #isSetCreateMultipleTransactedReceivers()
	 * @see #unsetCreateMultipleTransactedReceivers()
	 * @see #isCreateMultipleTransactedReceivers()
	 * @generated
	 */
	void setCreateMultipleTransactedReceivers(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ConnectorType#isCreateMultipleTransactedReceivers <em>Create Multiple Transacted Receivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateMultipleTransactedReceivers()
	 * @see #isCreateMultipleTransactedReceivers()
	 * @see #setCreateMultipleTransactedReceivers(boolean)
	 * @generated
	 */
	void unsetCreateMultipleTransactedReceivers();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ConnectorType#isCreateMultipleTransactedReceivers <em>Create Multiple Transacted Receivers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Multiple Transacted Receivers</em>' attribute is set.
	 * @see #unsetCreateMultipleTransactedReceivers()
	 * @see #isCreateMultipleTransactedReceivers()
	 * @see #setCreateMultipleTransactedReceivers(boolean)
	 * @generated
	 */
	boolean isSetCreateMultipleTransactedReceivers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.core.CorePackage#getConnectorType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConnectorType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConnectorType
