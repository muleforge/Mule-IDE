/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.BeansType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MuleType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getEnvironmentProperty <em>Environment Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAdminAgent <em>Admin Agent</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getNotifications <em>Notifications</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractExtensionGroup <em>Abstract Extension Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractExtension <em>Abstract Extension</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractSecurityManagerGroup <em>Abstract Security Manager Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractSecurityManager <em>Abstract Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractTransactionManagerGroup <em>Abstract Transaction Manager Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractTransactionFactoryGroup <em>Abstract Transaction Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractConnectorGroup <em>Abstract Connector Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractConnector <em>Abstract Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractGlobalEndpointGroup <em>Abstract Global Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractGlobalEndpoint <em>Abstract Global Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractModelGroup <em>Abstract Model Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getAbstractModel <em>Abstract Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getBeans <em>Beans</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getMuleType()
 * @model extendedMetaData="name='muleType' kind='elementOnly'"
 * @generated
 */
public interface MuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Environment Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.EnvironmentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Property</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_EnvironmentProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='environment-property' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EnvironmentPropertyType> getEnvironmentProperty();

	/**
	 * Returns the value of the '<em><b>Admin Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AdminAgentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Agent</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AdminAgent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='admin-agent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AdminAgentType> getAdminAgent();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.ManagementContextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_Configuration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ManagementContextType> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.NotificationManagerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_Notifications()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notifications' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NotificationManagerType> getNotifications();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_Description()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Abstract Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Abstract base for arbitrary extensions as children of the mule element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Extension Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-extension:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractExtensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Abstract base for arbitrary extensions as children of the mule element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Extension</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractExtension()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-extension' namespace='##targetNamespace' group='abstract-extension:group'"
	 * @generated
	 */
	EList<AbstractExtensionType> getAbstractExtension();

	/**
	 * Returns the value of the '<em><b>Abstract Security Manager Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A security manager is a container for security providers. More than one
	 *                 security manager may be configured; each contains providers from a particular
	 *                 module and has that module's type. This element is abstract - a security
	 *                 related module or transport will provide a suitable implementation.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Security Manager Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractSecurityManagerGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-security-manager:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractSecurityManagerGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Security Manager</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractSecurityManagerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A security manager is a container for security providers. More than one
	 *                 security manager may be configured; each contains providers from a particular
	 *                 module and has that module's type. This element is abstract - a security
	 *                 related module or transport will provide a suitable implementation.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Security Manager</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractSecurityManager()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-security-manager' namespace='##targetNamespace' group='abstract-security-manager:group'"
	 * @generated
	 */
	EList<AbstractSecurityManagerType> getAbstractSecurityManager();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Manager Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Manager Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Manager Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractTransactionManagerGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transaction-manager:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractTransactionManagerGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Manager</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractTransactionManagerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Manager</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractTransactionManager()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction-manager' namespace='##targetNamespace' group='abstract-transaction-manager:group'"
	 * @generated
	 */
	EList<AbstractTransactionManagerType> getAbstractTransactionManager();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Factory Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Factory Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Factory Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractTransactionFactoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transaction-factory:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractTransactionFactoryGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Factory</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractTransactionFactoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Factory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Factory</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractTransactionFactory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction-factory' namespace='##targetNamespace' group='abstract-transaction-factory:group'"
	 * @generated
	 */
	EList<AbstractTransactionFactoryType> getAbstractTransactionFactory();

	/**
	 * Returns the value of the '<em><b>Abstract Connector Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connector Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connector Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractConnectorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-connector:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractConnectorGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connector</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractConnector()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-connector' namespace='##targetNamespace' group='abstract-connector:group'"
	 * @generated
	 */
	EList<AbstractConnectorType> getAbstractConnector();

	/**
	 * Returns the value of the '<em><b>Abstract Global Endpoint Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Global Endpoint Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Global Endpoint Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractGlobalEndpointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-global-endpoint:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractGlobalEndpointGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Global Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractGlobalEndpointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Global Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Global Endpoint</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractGlobalEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-global-endpoint' namespace='##targetNamespace' group='abstract-global-endpoint:group'"
	 * @generated
	 */
	EList<AbstractGlobalEndpointType> getAbstractGlobalEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transformer Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transformer Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractTransformerGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transformer:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractTransformerGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractTransformerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transformer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transformer</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractTransformer()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='##targetNamespace' group='abstract-transformer:group'"
	 * @generated
	 */
	EList<AbstractTransformerType> getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Filter Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractFilterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-filter:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractFilterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractFilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Filter</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-filter' namespace='##targetNamespace' group='abstract-filter:group'"
	 * @generated
	 */
	EList<AbstractFilterType> getAbstractFilter();

	/**
	 * Returns the value of the '<em><b>Abstract Model Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Model Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Model Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractModelGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-model:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractModelGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Model</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_AbstractModel()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-model' namespace='##targetNamespace' group='abstract-model:group'"
	 * @generated
	 */
	EList<AbstractModelType> getAbstractModel();

	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.BeansType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Allow embedding of further spring documents.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_Beans()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='beans' namespace='http://www.springframework.org/schema/beans' group='#group:0'"
	 * @generated
	 */
	EList<BeansType> getBeans();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.BeanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             We support direct use of spring beans via this tag.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='http://www.springframework.org/schema/beans' group='#group:0'"
	 * @generated
	 */
	EList<BeanType> getBean();

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
	 * @see org.mule.ide.config.core.CorePackage#getMuleType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MuleType