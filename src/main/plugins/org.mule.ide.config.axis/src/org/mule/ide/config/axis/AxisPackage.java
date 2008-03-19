/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.IGlobalElementTypeProvider;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <![CDATA[
 * 	Spring XML Beans Schema, version 2.0
 * 	Authors: Rob Harrop, Juergen Hoeller
 * 
 * 	This defines a simple and consistent way of creating a namespace
 * 	of JavaBeans objects, managed by a Spring BeanFactory, read by
 * 	XmlBeanDefinitionReader (with DefaultBeanDefinitionDocumentReader).
 * 
 * 	This document type is used by most Spring functionality, including
 * 	web application contexts, which are based on bean factories.
 * 
 * 	Each "bean" element in this document defines a JavaBean.
 * 	Typically the bean class is specified, along with JavaBean properties
 * 	and/or constructor arguments.
 * 
 * 	A bean instance can be a "singleton" (shared instance) or a "prototype"
 * 	(independent instance). Further scopes can be provided by extended
 * 	bean factories, for example in a web environment.
 * 
 * 	References among beans are supported, that is, setting a JavaBean property
 * 	or a constructor argument to refer to another bean in the same factory
 * 	(or an ancestor factory).
 * 
 * 	As alternative to bean references, "inner bean definitions" can be used.
 * 	Singleton flags of such inner bean definitions are effectively ignored:
 * 	inner beans are typically anonymous prototypes.
 * 
 * 	There is also support for lists, sets, maps, and java.util.Properties
 * 	as bean property types or constructor argument types.
 * 		]]>
 * <!-- end-model-doc -->
 * @see org.mule.ide.config.axis.AxisFactory
 * @model kind="package"
 * @generated
 */
public interface AxisPackage extends EPackage, IGlobalElementTypeProvider {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "axis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mulesource.org/schema/mule/axis/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "axis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AxisPackage eINSTANCE = org.mule.ide.config.axis.impl.AxisPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.AxisConnectorTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getAxisConnectorType()
	 * @generated
	 */
	int AXIS_CONNECTOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__NAME = CorePackage.CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__PROPERTY = CorePackage.CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__SERVICE_OVERRIDES = CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Bean Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__BEAN_TYPE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supported Scheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Axis Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__AXIS_REF = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Client Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__CLIENT_CONFIG = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Provider Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Do Auto Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Server Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__SERVER_CONFIG = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Server Provider Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Treat Map As Named Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_CONNECTOR_TYPE_FEATURE_COUNT = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.BeanTypeTypeImpl <em>Bean Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.BeanTypeTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getBeanTypeType()
	 * @generated
	 */
	int BEAN_TYPE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Bean Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.DocumentRootImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Bean Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEAN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT = 5;

	/**
	 * The feature id for the '<em><b>Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INBOUND_ENDPOINT = 6;

	/**
	 * The feature id for the '<em><b>Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTBOUND_ENDPOINT = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.GlobalEndpointTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getGlobalEndpointType()
	 * @generated
	 */
	int GLOBAL_ENDPOINT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__NAME = CorePackage.GLOBAL_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__GROUP = CorePackage.GLOBAL_ENDPOINT_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TRANSFORMERS = CorePackage.GLOBAL_ENDPOINT_TYPE__TRANSFORMERS;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = CorePackage.GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY = CorePackage.GLOBAL_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTY = CorePackage.GLOBAL_ENDPOINT_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTIES = CorePackage.GLOBAL_ENDPOINT_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ADDRESS = CorePackage.GLOBAL_ENDPOINT_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF = CorePackage.GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ENCODING = CorePackage.GLOBAL_ENDPOINT_TYPE__ENCODING;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REF = CorePackage.GLOBAL_ENDPOINT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC = CorePackage.GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = CorePackage.GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = CorePackage.GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS = CorePackage.GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS = CorePackage.GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__OPTIONS = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bean Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__BEAN_TYPE = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Soap Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SOAP_SERVICE = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soap Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SOAP_METHOD = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTY1 = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTIES1 = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Client Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__CLIENT_CONFIG = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SERVICE_NAMESPACE = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SOAP_ACTION = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>SOAP Action1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SOAP_ACTION1 = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__STYLE = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__USE = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__WSDL_FILE = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Global Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.InboundEndpointTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getInboundEndpointType()
	 * @generated
	 */
	int INBOUND_ENDPOINT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__NAME = CorePackage.INBOUND_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__GROUP = CorePackage.INBOUND_ENDPOINT_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TRANSFORMERS = CorePackage.INBOUND_ENDPOINT_TYPE__TRANSFORMERS;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = CorePackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY = CorePackage.INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTY = CorePackage.INBOUND_ENDPOINT_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTIES = CorePackage.INBOUND_ENDPOINT_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ADDRESS = CorePackage.INBOUND_ENDPOINT_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__CONNECTOR_REF = CorePackage.INBOUND_ENDPOINT_TYPE__CONNECTOR_REF;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ENCODING = CorePackage.INBOUND_ENDPOINT_TYPE__ENCODING;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REF = CorePackage.INBOUND_ENDPOINT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC = CorePackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = CorePackage.INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = CorePackage.INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SYNCHRONOUS = CorePackage.INBOUND_ENDPOINT_TYPE__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = CorePackage.INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__OPTIONS = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bean Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__BEAN_TYPE = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Soap Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SOAP_SERVICE = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soap Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SOAP_METHOD = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTY1 = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTIES1 = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Client Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SOAP_ACTION = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>SOAP Action1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SOAP_ACTION1 = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__STYLE = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__USE = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__WSDL_FILE = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Inbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.OptionsTypeImpl <em>Options Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.OptionsTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getOptionsType()
	 * @generated
	 */
	int OPTIONS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Allowed Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__ALLOWED_METHODS = 1;

	/**
	 * The feature id for the '<em><b>Extra Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__EXTRA_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Wsdl Input Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__WSDL_INPUT_SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Wsdl Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__WSDL_PORT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Wsdl Service Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__WSDL_SERVICE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Wsdl Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__WSDL_SERVICE_PORT = 7;

	/**
	 * The feature id for the '<em><b>Wsdl Soap Action Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE = 8;

	/**
	 * The feature id for the '<em><b>Wsdl Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__WSDL_TARGET_NAMESPACE = 9;

	/**
	 * The number of structural features of the '<em>Options Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.OutboundEndpointTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getOutboundEndpointType()
	 * @generated
	 */
	int OUTBOUND_ENDPOINT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__NAME = CorePackage.OUTBOUND_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__GROUP = CorePackage.OUTBOUND_ENDPOINT_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TRANSFORMERS = CorePackage.OUTBOUND_ENDPOINT_TYPE__TRANSFORMERS;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = CorePackage.OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY = CorePackage.OUTBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTY = CorePackage.OUTBOUND_ENDPOINT_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTIES = CorePackage.OUTBOUND_ENDPOINT_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ADDRESS = CorePackage.OUTBOUND_ENDPOINT_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF = CorePackage.OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ENCODING = CorePackage.OUTBOUND_ENDPOINT_TYPE__ENCODING;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REF = CorePackage.OUTBOUND_ENDPOINT_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC = CorePackage.OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = CorePackage.OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = CorePackage.OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS = CorePackage.OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = CorePackage.OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Soap Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SOAP_SERVICE = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soap Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SOAP_METHOD = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTY1 = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTIES1 = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__CLIENT_CONFIG = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SOAP_ACTION = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>SOAP Action1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SOAP_ACTION1 = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__STYLE = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__USE = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Outbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.SoapMethodTypeImpl <em>Soap Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.SoapMethodTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapMethodType()
	 * @generated
	 */
	int SOAP_METHOD_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Soap Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_METHOD_TYPE__SOAP_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Soap Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_METHOD_TYPE__SOAP_RETURN = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_METHOD_TYPE__METHOD = 2;

	/**
	 * The number of structural features of the '<em>Soap Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.SoapParameterTypeImpl <em>Soap Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.SoapParameterTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapParameterType()
	 * @generated
	 */
	int SOAP_PARAMETER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_PARAMETER_TYPE__MODE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_PARAMETER_TYPE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_PARAMETER_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Soap Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_PARAMETER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.SoapReturnTypeImpl <em>Soap Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.SoapReturnTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapReturnType()
	 * @generated
	 */
	int SOAP_RETURN_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_RETURN_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Soap Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_RETURN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.impl.SoapServiceTypeImpl <em>Soap Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.impl.SoapServiceTypeImpl
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapServiceType()
	 * @generated
	 */
	int SOAP_SERVICE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SERVICE_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Soap Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SERVICE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.ModeType <em>Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.ModeType
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getModeType()
	 * @generated
	 */
	int MODE_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.StyleType <em>Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.StyleType
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.axis.UseType <em>Use Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.UseType
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 13;

	/**
	 * The meta object id for the '<em>Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.ModeType
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getModeTypeObject()
	 * @generated
	 */
	int MODE_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.StyleType
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getStyleTypeObject()
	 * @generated
	 */
	int STYLE_TYPE_OBJECT = 15;

	/**
	 * The meta object id for the '<em>Use Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.axis.UseType
	 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getUseTypeObject()
	 * @generated
	 */
	int USE_TYPE_OBJECT = 16;


	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.AxisConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType
	 * @generated
	 */
	EClass getAxisConnectorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.AxisConnectorType#getBeanType <em>Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Type</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#getBeanType()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EReference getAxisConnectorType_BeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.AxisConnectorType#getSupportedScheme <em>Supported Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Scheme</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#getSupportedScheme()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EReference getAxisConnectorType_SupportedScheme();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.AxisConnectorType#getAxisRef <em>Axis Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Ref</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#getAxisRef()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EAttribute getAxisConnectorType_AxisRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.AxisConnectorType#getClientConfig <em>Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Config</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#getClientConfig()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EAttribute getAxisConnectorType_ClientConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.AxisConnectorType#getClientProviderRef <em>Client Provider Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Provider Ref</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#getClientProviderRef()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EAttribute getAxisConnectorType_ClientProviderRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.AxisConnectorType#isDoAutoTypes <em>Do Auto Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Auto Types</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#isDoAutoTypes()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EAttribute getAxisConnectorType_DoAutoTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.AxisConnectorType#getServerConfig <em>Server Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Config</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#getServerConfig()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EAttribute getAxisConnectorType_ServerConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.AxisConnectorType#getServerProviderRef <em>Server Provider Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Provider Ref</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#getServerProviderRef()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EAttribute getAxisConnectorType_ServerProviderRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.AxisConnectorType#isTreatMapAsNamedParams <em>Treat Map As Named Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treat Map As Named Params</em>'.
	 * @see org.mule.ide.config.axis.AxisConnectorType#isTreatMapAsNamedParams()
	 * @see #getAxisConnectorType()
	 * @generated
	 */
	EAttribute getAxisConnectorType_TreatMapAsNamedParams();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.BeanTypeType <em>Bean Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Type Type</em>'.
	 * @see org.mule.ide.config.axis.BeanTypeType
	 * @generated
	 */
	EClass getBeanTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.BeanTypeType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.mule.ide.config.axis.BeanTypeType#getInterface()
	 * @see #getBeanTypeType()
	 * @generated
	 */
	EAttribute getBeanTypeType_Interface();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.axis.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.axis.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.axis.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.DocumentRoot#getBeanType <em>Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean Type</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getBeanType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BeanType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.DocumentRoot#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.DocumentRoot#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getInboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.axis.DocumentRoot#getOutboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OutboundEndpoint();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Endpoint Type</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType
	 * @generated
	 */
	EClass getGlobalEndpointType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.GlobalEndpointType#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getOptions()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.GlobalEndpointType#getBeanType <em>Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Type</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getBeanType()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_BeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.GlobalEndpointType#getSoapService <em>Soap Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Service</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getSoapService()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_SoapService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.GlobalEndpointType#getSoapMethod <em>Soap Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Method</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getSoapMethod()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_SoapMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.GlobalEndpointType#getProperty1 <em>Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property1</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getProperty1()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Property1();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.GlobalEndpointType#getProperties1 <em>Properties1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties1</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getProperties1()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Properties1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.GlobalEndpointType#getClientConfig <em>Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Config</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getClientConfig()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_ClientConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.GlobalEndpointType#getServiceNamespace <em>Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Namespace</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getServiceNamespace()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_ServiceNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.GlobalEndpointType#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getSoapAction()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.GlobalEndpointType#getSOAPAction1 <em>SOAP Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SOAP Action1</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getSOAPAction1()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_SOAPAction1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.GlobalEndpointType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getStyle()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.GlobalEndpointType#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getUse()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.GlobalEndpointType#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl File</em>'.
	 * @see org.mule.ide.config.axis.GlobalEndpointType#getWsdlFile()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_WsdlFile();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType
	 * @generated
	 */
	EClass getInboundEndpointType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.InboundEndpointType#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getOptions()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.InboundEndpointType#getBeanType <em>Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Type</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getBeanType()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_BeanType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.InboundEndpointType#getSoapService <em>Soap Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Service</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getSoapService()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_SoapService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.InboundEndpointType#getSoapMethod <em>Soap Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Method</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getSoapMethod()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_SoapMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.InboundEndpointType#getProperty1 <em>Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property1</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getProperty1()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Property1();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.InboundEndpointType#getProperties1 <em>Properties1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties1</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getProperties1()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Properties1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.InboundEndpointType#getClientConfig <em>Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Config</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getClientConfig()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_ClientConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.InboundEndpointType#getServiceNamespace <em>Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Namespace</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getServiceNamespace()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_ServiceNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.InboundEndpointType#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getSoapAction()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.InboundEndpointType#getSOAPAction1 <em>SOAP Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SOAP Action1</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getSOAPAction1()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_SOAPAction1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.InboundEndpointType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getStyle()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.InboundEndpointType#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getUse()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.InboundEndpointType#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl File</em>'.
	 * @see org.mule.ide.config.axis.InboundEndpointType#getWsdlFile()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_WsdlFile();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.OptionsType <em>Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Type</em>'.
	 * @see org.mule.ide.config.axis.OptionsType
	 * @generated
	 */
	EClass getOptionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.OptionsType#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getOption()
	 * @see #getOptionsType()
	 * @generated
	 */
	EReference getOptionsType_Option();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getAllowedMethods <em>Allowed Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Methods</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getAllowedMethods()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_AllowedMethods();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getExtraClasses <em>Extra Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Classes</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getExtraClasses()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_ExtraClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getScope()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getWsdlInputSchema <em>Wsdl Input Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Input Schema</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getWsdlInputSchema()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_WsdlInputSchema();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getWsdlPortType <em>Wsdl Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Port Type</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getWsdlPortType()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_WsdlPortType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getWsdlServiceElement <em>Wsdl Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Service Element</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getWsdlServiceElement()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_WsdlServiceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getWsdlServicePort <em>Wsdl Service Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Service Port</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getWsdlServicePort()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_WsdlServicePort();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getWsdlSoapActionMode <em>Wsdl Soap Action Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Soap Action Mode</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getWsdlSoapActionMode()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_WsdlSoapActionMode();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OptionsType#getWsdlTargetNamespace <em>Wsdl Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Target Namespace</em>'.
	 * @see org.mule.ide.config.axis.OptionsType#getWsdlTargetNamespace()
	 * @see #getOptionsType()
	 * @generated
	 */
	EAttribute getOptionsType_WsdlTargetNamespace();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType
	 * @generated
	 */
	EClass getOutboundEndpointType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.OutboundEndpointType#getSoapService <em>Soap Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Service</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getSoapService()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_SoapService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.OutboundEndpointType#getSoapMethod <em>Soap Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Method</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getSoapMethod()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_SoapMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.OutboundEndpointType#getProperty1 <em>Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property1</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getProperty1()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Property1();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.OutboundEndpointType#getProperties1 <em>Properties1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties1</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getProperties1()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Properties1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OutboundEndpointType#getClientConfig <em>Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Config</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getClientConfig()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_ClientConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OutboundEndpointType#getServiceNamespace <em>Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Namespace</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getServiceNamespace()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_ServiceNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OutboundEndpointType#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getSoapAction()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OutboundEndpointType#getSOAPAction1 <em>SOAP Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SOAP Action1</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getSOAPAction1()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_SOAPAction1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OutboundEndpointType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getStyle()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.OutboundEndpointType#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.mule.ide.config.axis.OutboundEndpointType#getUse()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Use();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.SoapMethodType <em>Soap Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soap Method Type</em>'.
	 * @see org.mule.ide.config.axis.SoapMethodType
	 * @generated
	 */
	EClass getSoapMethodType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.axis.SoapMethodType#getSoapParameter <em>Soap Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Parameter</em>'.
	 * @see org.mule.ide.config.axis.SoapMethodType#getSoapParameter()
	 * @see #getSoapMethodType()
	 * @generated
	 */
	EReference getSoapMethodType_SoapParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.axis.SoapMethodType#getSoapReturn <em>Soap Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soap Return</em>'.
	 * @see org.mule.ide.config.axis.SoapMethodType#getSoapReturn()
	 * @see #getSoapMethodType()
	 * @generated
	 */
	EReference getSoapMethodType_SoapReturn();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.SoapMethodType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.mule.ide.config.axis.SoapMethodType#getMethod()
	 * @see #getSoapMethodType()
	 * @generated
	 */
	EAttribute getSoapMethodType_Method();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.SoapParameterType <em>Soap Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soap Parameter Type</em>'.
	 * @see org.mule.ide.config.axis.SoapParameterType
	 * @generated
	 */
	EClass getSoapParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.SoapParameterType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.mule.ide.config.axis.SoapParameterType#getMode()
	 * @see #getSoapParameterType()
	 * @generated
	 */
	EAttribute getSoapParameterType_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.SoapParameterType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.mule.ide.config.axis.SoapParameterType#getParameter()
	 * @see #getSoapParameterType()
	 * @generated
	 */
	EAttribute getSoapParameterType_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.SoapParameterType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mule.ide.config.axis.SoapParameterType#getType()
	 * @see #getSoapParameterType()
	 * @generated
	 */
	EAttribute getSoapParameterType_Type();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.SoapReturnType <em>Soap Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soap Return Type</em>'.
	 * @see org.mule.ide.config.axis.SoapReturnType
	 * @generated
	 */
	EClass getSoapReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.SoapReturnType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mule.ide.config.axis.SoapReturnType#getType()
	 * @see #getSoapReturnType()
	 * @generated
	 */
	EAttribute getSoapReturnType_Type();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.axis.SoapServiceType <em>Soap Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soap Service Type</em>'.
	 * @see org.mule.ide.config.axis.SoapServiceType
	 * @generated
	 */
	EClass getSoapServiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.axis.SoapServiceType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.mule.ide.config.axis.SoapServiceType#getInterface()
	 * @see #getSoapServiceType()
	 * @generated
	 */
	EAttribute getSoapServiceType_Interface();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.axis.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Type</em>'.
	 * @see org.mule.ide.config.axis.ModeType
	 * @generated
	 */
	EEnum getModeType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.axis.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style Type</em>'.
	 * @see org.mule.ide.config.axis.StyleType
	 * @generated
	 */
	EEnum getStyleType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.axis.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Use Type</em>'.
	 * @see org.mule.ide.config.axis.UseType
	 * @generated
	 */
	EEnum getUseType();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.axis.ModeType <em>Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mode Type Object</em>'.
	 * @see org.mule.ide.config.axis.ModeType
	 * @model instanceClass="org.mule.ide.config.axis.ModeType"
	 *        extendedMetaData="name='mode_._type:Object' baseType='mode_._type'"
	 * @generated
	 */
	EDataType getModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.axis.StyleType <em>Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Type Object</em>'.
	 * @see org.mule.ide.config.axis.StyleType
	 * @model instanceClass="org.mule.ide.config.axis.StyleType"
	 *        extendedMetaData="name='style_._type:Object' baseType='style_._type'"
	 * @generated
	 */
	EDataType getStyleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.axis.UseType <em>Use Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Use Type Object</em>'.
	 * @see org.mule.ide.config.axis.UseType
	 * @model instanceClass="org.mule.ide.config.axis.UseType"
	 *        extendedMetaData="name='use_._type:Object' baseType='use_._type'"
	 * @generated
	 */
	EDataType getUseTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AxisFactory getAxisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.AxisConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.AxisConnectorTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getAxisConnectorType()
		 * @generated
		 */
		EClass AXIS_CONNECTOR_TYPE = eINSTANCE.getAxisConnectorType();

		/**
		 * The meta object literal for the '<em><b>Bean Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_CONNECTOR_TYPE__BEAN_TYPE = eINSTANCE.getAxisConnectorType_BeanType();

		/**
		 * The meta object literal for the '<em><b>Supported Scheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME = eINSTANCE.getAxisConnectorType_SupportedScheme();

		/**
		 * The meta object literal for the '<em><b>Axis Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_CONNECTOR_TYPE__AXIS_REF = eINSTANCE.getAxisConnectorType_AxisRef();

		/**
		 * The meta object literal for the '<em><b>Client Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_CONNECTOR_TYPE__CLIENT_CONFIG = eINSTANCE.getAxisConnectorType_ClientConfig();

		/**
		 * The meta object literal for the '<em><b>Client Provider Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF = eINSTANCE.getAxisConnectorType_ClientProviderRef();

		/**
		 * The meta object literal for the '<em><b>Do Auto Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES = eINSTANCE.getAxisConnectorType_DoAutoTypes();

		/**
		 * The meta object literal for the '<em><b>Server Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_CONNECTOR_TYPE__SERVER_CONFIG = eINSTANCE.getAxisConnectorType_ServerConfig();

		/**
		 * The meta object literal for the '<em><b>Server Provider Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF = eINSTANCE.getAxisConnectorType_ServerProviderRef();

		/**
		 * The meta object literal for the '<em><b>Treat Map As Named Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS = eINSTANCE.getAxisConnectorType_TreatMapAsNamedParams();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.BeanTypeTypeImpl <em>Bean Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.BeanTypeTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getBeanTypeType()
		 * @generated
		 */
		EClass BEAN_TYPE_TYPE = eINSTANCE.getBeanTypeType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE_TYPE__INTERFACE = eINSTANCE.getBeanTypeType_Interface();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.DocumentRootImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Bean Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BEAN_TYPE = eINSTANCE.getDocumentRoot_BeanType();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONNECTOR = eINSTANCE.getDocumentRoot_Connector();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDPOINT = eINSTANCE.getDocumentRoot_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Inbound Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INBOUND_ENDPOINT = eINSTANCE.getDocumentRoot_InboundEndpoint();

		/**
		 * The meta object literal for the '<em><b>Outbound Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OUTBOUND_ENDPOINT = eINSTANCE.getDocumentRoot_OutboundEndpoint();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.GlobalEndpointTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getGlobalEndpointType()
		 * @generated
		 */
		EClass GLOBAL_ENDPOINT_TYPE = eINSTANCE.getGlobalEndpointType();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__OPTIONS = eINSTANCE.getGlobalEndpointType_Options();

		/**
		 * The meta object literal for the '<em><b>Bean Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__BEAN_TYPE = eINSTANCE.getGlobalEndpointType_BeanType();

		/**
		 * The meta object literal for the '<em><b>Soap Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__SOAP_SERVICE = eINSTANCE.getGlobalEndpointType_SoapService();

		/**
		 * The meta object literal for the '<em><b>Soap Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__SOAP_METHOD = eINSTANCE.getGlobalEndpointType_SoapMethod();

		/**
		 * The meta object literal for the '<em><b>Property1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__PROPERTY1 = eINSTANCE.getGlobalEndpointType_Property1();

		/**
		 * The meta object literal for the '<em><b>Properties1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__PROPERTIES1 = eINSTANCE.getGlobalEndpointType_Properties1();

		/**
		 * The meta object literal for the '<em><b>Client Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__CLIENT_CONFIG = eINSTANCE.getGlobalEndpointType_ClientConfig();

		/**
		 * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__SERVICE_NAMESPACE = eINSTANCE.getGlobalEndpointType_ServiceNamespace();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__SOAP_ACTION = eINSTANCE.getGlobalEndpointType_SoapAction();

		/**
		 * The meta object literal for the '<em><b>SOAP Action1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__SOAP_ACTION1 = eINSTANCE.getGlobalEndpointType_SOAPAction1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__STYLE = eINSTANCE.getGlobalEndpointType_Style();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__USE = eINSTANCE.getGlobalEndpointType_Use();

		/**
		 * The meta object literal for the '<em><b>Wsdl File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__WSDL_FILE = eINSTANCE.getGlobalEndpointType_WsdlFile();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.InboundEndpointTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getInboundEndpointType()
		 * @generated
		 */
		EClass INBOUND_ENDPOINT_TYPE = eINSTANCE.getInboundEndpointType();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__OPTIONS = eINSTANCE.getInboundEndpointType_Options();

		/**
		 * The meta object literal for the '<em><b>Bean Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__BEAN_TYPE = eINSTANCE.getInboundEndpointType_BeanType();

		/**
		 * The meta object literal for the '<em><b>Soap Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__SOAP_SERVICE = eINSTANCE.getInboundEndpointType_SoapService();

		/**
		 * The meta object literal for the '<em><b>Soap Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__SOAP_METHOD = eINSTANCE.getInboundEndpointType_SoapMethod();

		/**
		 * The meta object literal for the '<em><b>Property1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__PROPERTY1 = eINSTANCE.getInboundEndpointType_Property1();

		/**
		 * The meta object literal for the '<em><b>Properties1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__PROPERTIES1 = eINSTANCE.getInboundEndpointType_Properties1();

		/**
		 * The meta object literal for the '<em><b>Client Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG = eINSTANCE.getInboundEndpointType_ClientConfig();

		/**
		 * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE = eINSTANCE.getInboundEndpointType_ServiceNamespace();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__SOAP_ACTION = eINSTANCE.getInboundEndpointType_SoapAction();

		/**
		 * The meta object literal for the '<em><b>SOAP Action1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__SOAP_ACTION1 = eINSTANCE.getInboundEndpointType_SOAPAction1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__STYLE = eINSTANCE.getInboundEndpointType_Style();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__USE = eINSTANCE.getInboundEndpointType_Use();

		/**
		 * The meta object literal for the '<em><b>Wsdl File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__WSDL_FILE = eINSTANCE.getInboundEndpointType_WsdlFile();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.OptionsTypeImpl <em>Options Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.OptionsTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getOptionsType()
		 * @generated
		 */
		EClass OPTIONS_TYPE = eINSTANCE.getOptionsType();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_TYPE__OPTION = eINSTANCE.getOptionsType_Option();

		/**
		 * The meta object literal for the '<em><b>Allowed Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__ALLOWED_METHODS = eINSTANCE.getOptionsType_AllowedMethods();

		/**
		 * The meta object literal for the '<em><b>Extra Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__EXTRA_CLASSES = eINSTANCE.getOptionsType_ExtraClasses();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__SCOPE = eINSTANCE.getOptionsType_Scope();

		/**
		 * The meta object literal for the '<em><b>Wsdl Input Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__WSDL_INPUT_SCHEMA = eINSTANCE.getOptionsType_WsdlInputSchema();

		/**
		 * The meta object literal for the '<em><b>Wsdl Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__WSDL_PORT_TYPE = eINSTANCE.getOptionsType_WsdlPortType();

		/**
		 * The meta object literal for the '<em><b>Wsdl Service Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__WSDL_SERVICE_ELEMENT = eINSTANCE.getOptionsType_WsdlServiceElement();

		/**
		 * The meta object literal for the '<em><b>Wsdl Service Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__WSDL_SERVICE_PORT = eINSTANCE.getOptionsType_WsdlServicePort();

		/**
		 * The meta object literal for the '<em><b>Wsdl Soap Action Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE = eINSTANCE.getOptionsType_WsdlSoapActionMode();

		/**
		 * The meta object literal for the '<em><b>Wsdl Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_TYPE__WSDL_TARGET_NAMESPACE = eINSTANCE.getOptionsType_WsdlTargetNamespace();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.OutboundEndpointTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getOutboundEndpointType()
		 * @generated
		 */
		EClass OUTBOUND_ENDPOINT_TYPE = eINSTANCE.getOutboundEndpointType();

		/**
		 * The meta object literal for the '<em><b>Soap Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__SOAP_SERVICE = eINSTANCE.getOutboundEndpointType_SoapService();

		/**
		 * The meta object literal for the '<em><b>Soap Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__SOAP_METHOD = eINSTANCE.getOutboundEndpointType_SoapMethod();

		/**
		 * The meta object literal for the '<em><b>Property1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__PROPERTY1 = eINSTANCE.getOutboundEndpointType_Property1();

		/**
		 * The meta object literal for the '<em><b>Properties1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__PROPERTIES1 = eINSTANCE.getOutboundEndpointType_Properties1();

		/**
		 * The meta object literal for the '<em><b>Client Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__CLIENT_CONFIG = eINSTANCE.getOutboundEndpointType_ClientConfig();

		/**
		 * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE = eINSTANCE.getOutboundEndpointType_ServiceNamespace();

		/**
		 * The meta object literal for the '<em><b>Soap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__SOAP_ACTION = eINSTANCE.getOutboundEndpointType_SoapAction();

		/**
		 * The meta object literal for the '<em><b>SOAP Action1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__SOAP_ACTION1 = eINSTANCE.getOutboundEndpointType_SOAPAction1();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__STYLE = eINSTANCE.getOutboundEndpointType_Style();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__USE = eINSTANCE.getOutboundEndpointType_Use();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.SoapMethodTypeImpl <em>Soap Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.SoapMethodTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapMethodType()
		 * @generated
		 */
		EClass SOAP_METHOD_TYPE = eINSTANCE.getSoapMethodType();

		/**
		 * The meta object literal for the '<em><b>Soap Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOAP_METHOD_TYPE__SOAP_PARAMETER = eINSTANCE.getSoapMethodType_SoapParameter();

		/**
		 * The meta object literal for the '<em><b>Soap Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOAP_METHOD_TYPE__SOAP_RETURN = eINSTANCE.getSoapMethodType_SoapReturn();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_METHOD_TYPE__METHOD = eINSTANCE.getSoapMethodType_Method();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.SoapParameterTypeImpl <em>Soap Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.SoapParameterTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapParameterType()
		 * @generated
		 */
		EClass SOAP_PARAMETER_TYPE = eINSTANCE.getSoapParameterType();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_PARAMETER_TYPE__MODE = eINSTANCE.getSoapParameterType_Mode();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_PARAMETER_TYPE__PARAMETER = eINSTANCE.getSoapParameterType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_PARAMETER_TYPE__TYPE = eINSTANCE.getSoapParameterType_Type();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.SoapReturnTypeImpl <em>Soap Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.SoapReturnTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapReturnType()
		 * @generated
		 */
		EClass SOAP_RETURN_TYPE = eINSTANCE.getSoapReturnType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_RETURN_TYPE__TYPE = eINSTANCE.getSoapReturnType_Type();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.impl.SoapServiceTypeImpl <em>Soap Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.impl.SoapServiceTypeImpl
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getSoapServiceType()
		 * @generated
		 */
		EClass SOAP_SERVICE_TYPE = eINSTANCE.getSoapServiceType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOAP_SERVICE_TYPE__INTERFACE = eINSTANCE.getSoapServiceType_Interface();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.ModeType <em>Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.ModeType
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getModeType()
		 * @generated
		 */
		EEnum MODE_TYPE = eINSTANCE.getModeType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.StyleType <em>Style Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.StyleType
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getStyleType()
		 * @generated
		 */
		EEnum STYLE_TYPE = eINSTANCE.getStyleType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.axis.UseType <em>Use Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.UseType
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getUseType()
		 * @generated
		 */
		EEnum USE_TYPE = eINSTANCE.getUseType();

		/**
		 * The meta object literal for the '<em>Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.ModeType
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getModeTypeObject()
		 * @generated
		 */
		EDataType MODE_TYPE_OBJECT = eINSTANCE.getModeTypeObject();

		/**
		 * The meta object literal for the '<em>Style Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.StyleType
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getStyleTypeObject()
		 * @generated
		 */
		EDataType STYLE_TYPE_OBJECT = eINSTANCE.getStyleTypeObject();

		/**
		 * The meta object literal for the '<em>Use Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.axis.UseType
		 * @see org.mule.ide.config.axis.impl.AxisPackageImpl#getUseTypeObject()
		 * @generated
		 */
		EDataType USE_TYPE_OBJECT = eINSTANCE.getUseTypeObject();

	}

} //AxisPackage
