/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;

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
 * @see org.mule.ide.config.jms.JMSFactory
 * @model kind="package"
 * @generated
 */
public interface JMSPackage extends EPackage, IGlobalElementTypeProvider {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mulesource.org/schema/mule/jms/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JMSPackage eINSTANCE = org.mule.ide.config.jms.impl.JMSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.VendorJmsConnectorTypeImpl <em>Vendor Jms Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.VendorJmsConnectorTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getVendorJmsConnectorType()
	 * @generated
	 */
	int VENDOR_JMS_CONNECTOR_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__NAME = CorePackage.CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__PROPERTY = CorePackage.CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__SERVICE_OVERRIDES = CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Acknowledgement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache Jms Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__CACHE_JMS_SESSIONS = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__CLIENT_ID = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__CONNECTION_FACTORY_REF = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Durable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__DURABLE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eager Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__EAGER_CONSUMER = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Honor Qos Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__HONOR_QOS_HEADERS = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Redelivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__MAX_REDELIVERY = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>No Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__NO_LOCAL = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__PASSWORD = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Persistent Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__PERSISTENT_DELIVERY = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Recover Jms Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Redelivery Handler Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__SPECIFICATION = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE__USERNAME = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Vendor Jms Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_JMS_CONNECTOR_TYPE_FEATURE_COUNT = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.ActiveMqConnectorTypeImpl <em>Active Mq Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.ActiveMqConnectorTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getActiveMqConnectorType()
	 * @generated
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__NAME = VENDOR_JMS_CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__PROPERTY = VENDOR_JMS_CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = VENDOR_JMS_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = VENDOR_JMS_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = VENDOR_JMS_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = VENDOR_JMS_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__SERVICE_OVERRIDES = VENDOR_JMS_CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = VENDOR_JMS_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = VENDOR_JMS_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = VENDOR_JMS_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = VENDOR_JMS_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Acknowledgement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE = VENDOR_JMS_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE;

	/**
	 * The feature id for the '<em><b>Cache Jms Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__CACHE_JMS_SESSIONS = VENDOR_JMS_CONNECTOR_TYPE__CACHE_JMS_SESSIONS;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__CLIENT_ID = VENDOR_JMS_CONNECTOR_TYPE__CLIENT_ID;

	/**
	 * The feature id for the '<em><b>Connection Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__CONNECTION_FACTORY_REF = VENDOR_JMS_CONNECTOR_TYPE__CONNECTION_FACTORY_REF;

	/**
	 * The feature id for the '<em><b>Durable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__DURABLE = VENDOR_JMS_CONNECTOR_TYPE__DURABLE;

	/**
	 * The feature id for the '<em><b>Eager Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__EAGER_CONSUMER = VENDOR_JMS_CONNECTOR_TYPE__EAGER_CONSUMER;

	/**
	 * The feature id for the '<em><b>Honor Qos Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__HONOR_QOS_HEADERS = VENDOR_JMS_CONNECTOR_TYPE__HONOR_QOS_HEADERS;

	/**
	 * The feature id for the '<em><b>Max Redelivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__MAX_REDELIVERY = VENDOR_JMS_CONNECTOR_TYPE__MAX_REDELIVERY;

	/**
	 * The feature id for the '<em><b>No Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__NO_LOCAL = VENDOR_JMS_CONNECTOR_TYPE__NO_LOCAL;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__PASSWORD = VENDOR_JMS_CONNECTOR_TYPE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Persistent Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__PERSISTENT_DELIVERY = VENDOR_JMS_CONNECTOR_TYPE__PERSISTENT_DELIVERY;

	/**
	 * The feature id for the '<em><b>Recover Jms Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS = VENDOR_JMS_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Redelivery Handler Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF = VENDOR_JMS_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__SPECIFICATION = VENDOR_JMS_CONNECTOR_TYPE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__USERNAME = VENDOR_JMS_CONNECTOR_TYPE__USERNAME;

	/**
	 * The feature id for the '<em><b>Broker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL = VENDOR_JMS_CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Mq Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MQ_CONNECTOR_TYPE_FEATURE_COUNT = VENDOR_JMS_CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.CustomConnectorTypeImpl <em>Custom Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.CustomConnectorTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getCustomConnectorType()
	 * @generated
	 */
	int CUSTOM_CONNECTOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__NAME = CorePackage.CUSTOM_CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__PROPERTY = CorePackage.CUSTOM_CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = CorePackage.CUSTOM_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = CorePackage.CUSTOM_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = CorePackage.CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = CorePackage.CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__SERVICE_OVERRIDES = CorePackage.CUSTOM_CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = CorePackage.CUSTOM_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = CorePackage.CUSTOM_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = CorePackage.CUSTOM_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = CorePackage.CUSTOM_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CLASS = CorePackage.CUSTOM_CONNECTOR_TYPE__CLASS;

	/**
	 * The feature id for the '<em><b>Acknowledgement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache Jms Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CACHE_JMS_SESSIONS = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CLIENT_ID = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Durable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__DURABLE = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eager Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__EAGER_CONSUMER = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Honor Qos Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__HONOR_QOS_HEADERS = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Redelivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__MAX_REDELIVERY = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>No Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__NO_LOCAL = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__PASSWORD = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Persistent Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__PERSISTENT_DELIVERY = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Recover Jms Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Redelivery Handler Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__SPECIFICATION = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__USERNAME = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Custom Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT = CorePackage.CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.DocumentRootImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Activemq Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Activemq Xa Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Client Ack Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION = 5;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Custom Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT = 8;

	/**
	 * The feature id for the '<em><b>Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INBOUND_ENDPOINT = 9;

	/**
	 * The feature id for the '<em><b>Jmsmessage To Object Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER = 10;

	/**
	 * The feature id for the '<em><b>Object To Jmsmessage Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER = 11;

	/**
	 * The feature id for the '<em><b>Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTBOUND_ENDPOINT = 12;

	/**
	 * The feature id for the '<em><b>Property Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_FILTER = 13;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION = 14;

	/**
	 * The feature id for the '<em><b>Weblogic Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBLOGIC_CONNECTOR = 15;

	/**
	 * The feature id for the '<em><b>Websphere Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBSPHERE_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Xa Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XA_TRANSACTION = 17;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl <em>Generic Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.GenericConnectorTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getGenericConnectorType()
	 * @generated
	 */
	int GENERIC_CONNECTOR_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__NAME = CorePackage.CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__PROPERTY = CorePackage.CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__SERVICE_OVERRIDES = CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Acknowledgement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache Jms Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__CLIENT_ID = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Durable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__DURABLE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eager Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Honor Qos Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Redelivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>No Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__NO_LOCAL = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__PASSWORD = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Persistent Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Recover Jms Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Redelivery Handler Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__SPECIFICATION = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE__USERNAME = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Generic Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONNECTOR_TYPE_FEATURE_COUNT = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.GlobalEndpointTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getGlobalEndpointType()
	 * @generated
	 */
	int GLOBAL_ENDPOINT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__NAME = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__GROUP = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TRANSFORMERS = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SELECTOR = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTIES = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ADDRESS = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ENCODING = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__QUEUE = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REF = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TOPIC = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Global Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.InboundEndpointTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getInboundEndpointType()
	 * @generated
	 */
	int INBOUND_ENDPOINT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__NAME = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__GROUP = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TRANSFORMERS = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SELECTOR = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTIES = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ADDRESS = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__CONNECTOR_REF = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ENCODING = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__QUEUE = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REF = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SYNCHRONOUS = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TOPIC = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Inbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.JmsSelectorFilterImpl <em>Jms Selector Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.JmsSelectorFilterImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getJmsSelectorFilter()
	 * @generated
	 */
	int JMS_SELECTOR_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMS_SELECTOR_FILTER__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Jms Selector Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMS_SELECTOR_FILTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.OutboundEndpointTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getOutboundEndpointType()
	 * @generated
	 */
	int OUTBOUND_ENDPOINT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__NAME = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__GROUP = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TRANSFORMERS = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SELECTOR = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTIES = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ADDRESS = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ENCODING = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__QUEUE = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REF = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TOPIC = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Outbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.impl.PropertyFilterTypeImpl <em>Property Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.impl.PropertyFilterTypeImpl
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getPropertyFilterType()
	 * @generated
	 */
	int PROPERTY_FILTER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_TYPE__NAME = CorePackage.ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_TYPE__NOT = CorePackage.ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_TYPE__EXPRESSION = CorePackage.ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_TYPE__PATTERN = CorePackage.ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_TYPE__PROPERTY_CLASS = CorePackage.ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_TYPE__PROPERTY_NAME = CorePackage.ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_TYPE_FEATURE_COUNT = CorePackage.ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.AcknowledgementModeType <em>Acknowledgement Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.AcknowledgementModeType
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getAcknowledgementModeType()
	 * @generated
	 */
	int ACKNOWLEDGEMENT_MODE_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.jms.SpecificationType <em>Specification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.SpecificationType
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getSpecificationType()
	 * @generated
	 */
	int SPECIFICATION_TYPE = 11;

	/**
	 * The meta object id for the '<em>Acknowledgement Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.AcknowledgementModeType
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getAcknowledgementModeTypeObject()
	 * @generated
	 */
	int ACKNOWLEDGEMENT_MODE_TYPE_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Specification Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.jms.SpecificationType
	 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getSpecificationTypeObject()
	 * @generated
	 */
	int SPECIFICATION_TYPE_OBJECT = 13;


	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.ActiveMqConnectorType <em>Active Mq Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Mq Connector Type</em>'.
	 * @see org.mule.ide.config.jms.ActiveMqConnectorType
	 * @generated
	 */
	EClass getActiveMqConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.ActiveMqConnectorType#getBrokerURL <em>Broker URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Broker URL</em>'.
	 * @see org.mule.ide.config.jms.ActiveMqConnectorType#getBrokerURL()
	 * @see #getActiveMqConnectorType()
	 * @generated
	 */
	EAttribute getActiveMqConnectorType_BrokerURL();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.CustomConnectorType <em>Custom Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Connector Type</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType
	 * @generated
	 */
	EClass getCustomConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#getAcknowledgementMode <em>Acknowledgement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acknowledgement Mode</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#getAcknowledgementMode()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_AcknowledgementMode();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#isCacheJmsSessions <em>Cache Jms Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Jms Sessions</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#isCacheJmsSessions()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_CacheJmsSessions();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#getClientId()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#isDurable <em>Durable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durable</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#isDurable()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_Durable();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#isEagerConsumer <em>Eager Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eager Consumer</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#isEagerConsumer()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_EagerConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#isHonorQosHeaders <em>Honor Qos Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honor Qos Headers</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#isHonorQosHeaders()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_HonorQosHeaders();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#getMaxRedelivery <em>Max Redelivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Redelivery</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#getMaxRedelivery()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_MaxRedelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#isNoLocal <em>No Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Local</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#isNoLocal()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_NoLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#getPassword()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#isPersistentDelivery <em>Persistent Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent Delivery</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#isPersistentDelivery()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_PersistentDelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#isRecoverJmsConnections <em>Recover Jms Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recover Jms Connections</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#isRecoverJmsConnections()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_RecoverJmsConnections();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#getRedeliveryHandlerRef <em>Redelivery Handler Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redelivery Handler Ref</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#getRedeliveryHandlerRef()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_RedeliveryHandlerRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#getSpecification()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_Specification();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.CustomConnectorType#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.mule.ide.config.jms.CustomConnectorType#getUsername()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_Username();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.jms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.jms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getActivemqConnector <em>Activemq Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activemq Connector</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getActivemqConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ActivemqConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getActivemqXaConnector <em>Activemq Xa Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activemq Xa Connector</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getActivemqXaConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ActivemqXaConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getClientAckTransaction <em>Client Ack Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client Ack Transaction</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getClientAckTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClientAckTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getCustomConnector <em>Custom Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Connector</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getCustomConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getInboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getJmsmessageToObjectTransformer <em>Jmsmessage To Object Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jmsmessage To Object Transformer</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getJmsmessageToObjectTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JmsmessageToObjectTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getObjectToJmsmessageTransformer <em>Object To Jmsmessage Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object To Jmsmessage Transformer</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getObjectToJmsmessageTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectToJmsmessageTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getOutboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OutboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getPropertyFilter <em>Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Filter</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getPropertyFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getWeblogicConnector <em>Weblogic Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weblogic Connector</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getWeblogicConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WeblogicConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getWebsphereConnector <em>Websphere Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Websphere Connector</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getWebsphereConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebsphereConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.jms.DocumentRoot#getXaTransaction <em>Xa Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xa Transaction</em>'.
	 * @see org.mule.ide.config.jms.DocumentRoot#getXaTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XaTransaction();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.GenericConnectorType <em>Generic Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Connector Type</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType
	 * @generated
	 */
	EClass getGenericConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getAcknowledgementMode <em>Acknowledgement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acknowledgement Mode</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getAcknowledgementMode()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_AcknowledgementMode();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#isCacheJmsSessions <em>Cache Jms Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Jms Sessions</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#isCacheJmsSessions()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_CacheJmsSessions();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getClientId()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getConnectionFactoryRef <em>Connection Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Factory Ref</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getConnectionFactoryRef()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_ConnectionFactoryRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#isDurable <em>Durable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durable</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#isDurable()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_Durable();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#isEagerConsumer <em>Eager Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eager Consumer</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#isEagerConsumer()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_EagerConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#isHonorQosHeaders <em>Honor Qos Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honor Qos Headers</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#isHonorQosHeaders()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_HonorQosHeaders();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getMaxRedelivery <em>Max Redelivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Redelivery</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getMaxRedelivery()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_MaxRedelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#isNoLocal <em>No Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Local</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#isNoLocal()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_NoLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getPassword()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#isPersistentDelivery <em>Persistent Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent Delivery</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#isPersistentDelivery()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_PersistentDelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#isRecoverJmsConnections <em>Recover Jms Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recover Jms Connections</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#isRecoverJmsConnections()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_RecoverJmsConnections();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getRedeliveryHandlerRef <em>Redelivery Handler Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redelivery Handler Ref</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getRedeliveryHandlerRef()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_RedeliveryHandlerRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getSpecification()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_Specification();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GenericConnectorType#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.mule.ide.config.jms.GenericConnectorType#getUsername()
	 * @see #getGenericConnectorType()
	 * @generated
	 */
	EAttribute getGenericConnectorType_Username();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Endpoint Type</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType
	 * @generated
	 */
	EClass getGlobalEndpointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.GlobalEndpointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransformerGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransformer()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getTransformers()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Transformers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getResponseTransformers <em>Response Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Transformers</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getResponseTransformers()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_ResponseTransformers();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransactionGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransaction()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractFilterGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractFilter()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selector</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getSelector()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Selector();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Filter Group</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractSecurityFilterGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractSecurityFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAbstractSecurityFilter()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.GlobalEndpointType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getProperties()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getAddress()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getConnectorRef <em>Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Ref</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getConnectorRef()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_ConnectorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getEncoding()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getQueue()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Queue();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getRef()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#isRemoteSync()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_RemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync Timeout</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getRemoteSyncTimeout()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_RemoteSyncTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer Refs</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getResponseTransformerRefs()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_ResponseTransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#isSynchronous()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getTopic()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Topic();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.GlobalEndpointType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.jms.GlobalEndpointType#getTransformerRefs()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType
	 * @generated
	 */
	EClass getInboundEndpointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.InboundEndpointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractTransformerGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractTransformer()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getTransformers()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Transformers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getResponseTransformers <em>Response Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Transformers</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getResponseTransformers()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_ResponseTransformers();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractTransactionGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractTransaction()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractFilterGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractFilter()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selector</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getSelector()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Selector();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Filter Group</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractSecurityFilterGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractSecurityFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAbstractSecurityFilter()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.InboundEndpointType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getProperties()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getAddress()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getConnectorRef <em>Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Ref</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getConnectorRef()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_ConnectorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getEncoding()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getQueue()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Queue();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getRef()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#isRemoteSync <em>Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#isRemoteSync()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_RemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync Timeout</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getRemoteSyncTimeout()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_RemoteSyncTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer Refs</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getResponseTransformerRefs()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_ResponseTransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#isSynchronous()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getTopic()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Topic();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.InboundEndpointType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.jms.InboundEndpointType#getTransformerRefs()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.JmsSelectorFilter <em>Jms Selector Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jms Selector Filter</em>'.
	 * @see org.mule.ide.config.jms.JmsSelectorFilter
	 * @generated
	 */
	EClass getJmsSelectorFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.JmsSelectorFilter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.mule.ide.config.jms.JmsSelectorFilter#getExpression()
	 * @see #getJmsSelectorFilter()
	 * @generated
	 */
	EAttribute getJmsSelectorFilter_Expression();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType
	 * @generated
	 */
	EClass getOutboundEndpointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.OutboundEndpointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransformerGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransformer()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getTransformers()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Transformers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getResponseTransformers <em>Response Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Transformers</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getResponseTransformers()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_ResponseTransformers();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransactionGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractTransaction()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractFilterGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractFilter()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selector</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getSelector()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Selector();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Filter Group</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractSecurityFilterGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractSecurityFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAbstractSecurityFilter()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.jms.OutboundEndpointType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getProperties()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getAddress()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getConnectorRef <em>Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Ref</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getConnectorRef()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_ConnectorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getEncoding()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getQueue()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Queue();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getRef()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#isRemoteSync <em>Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#isRemoteSync()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_RemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync Timeout</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getRemoteSyncTimeout()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_RemoteSyncTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer Refs</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getResponseTransformerRefs()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_ResponseTransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#isSynchronous()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getTopic()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Topic();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.OutboundEndpointType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.jms.OutboundEndpointType#getTransformerRefs()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.PropertyFilterType <em>Property Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Filter Type</em>'.
	 * @see org.mule.ide.config.jms.PropertyFilterType
	 * @generated
	 */
	EClass getPropertyFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.PropertyFilterType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.mule.ide.config.jms.PropertyFilterType#getExpression()
	 * @see #getPropertyFilterType()
	 * @generated
	 */
	EAttribute getPropertyFilterType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.PropertyFilterType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.mule.ide.config.jms.PropertyFilterType#getPattern()
	 * @see #getPropertyFilterType()
	 * @generated
	 */
	EAttribute getPropertyFilterType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.PropertyFilterType#getPropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Class</em>'.
	 * @see org.mule.ide.config.jms.PropertyFilterType#getPropertyClass()
	 * @see #getPropertyFilterType()
	 * @generated
	 */
	EAttribute getPropertyFilterType_PropertyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.PropertyFilterType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.mule.ide.config.jms.PropertyFilterType#getPropertyName()
	 * @see #getPropertyFilterType()
	 * @generated
	 */
	EAttribute getPropertyFilterType_PropertyName();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.jms.VendorJmsConnectorType <em>Vendor Jms Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Jms Connector Type</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType
	 * @generated
	 */
	EClass getVendorJmsConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getAcknowledgementMode <em>Acknowledgement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acknowledgement Mode</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getAcknowledgementMode()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_AcknowledgementMode();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#isCacheJmsSessions <em>Cache Jms Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Jms Sessions</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#isCacheJmsSessions()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_CacheJmsSessions();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getClientId()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getConnectionFactoryRef <em>Connection Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Factory Ref</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getConnectionFactoryRef()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_ConnectionFactoryRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#isDurable <em>Durable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durable</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#isDurable()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_Durable();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#isEagerConsumer <em>Eager Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eager Consumer</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#isEagerConsumer()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_EagerConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#isHonorQosHeaders <em>Honor Qos Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honor Qos Headers</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#isHonorQosHeaders()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_HonorQosHeaders();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getMaxRedelivery <em>Max Redelivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Redelivery</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getMaxRedelivery()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_MaxRedelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#isNoLocal <em>No Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Local</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#isNoLocal()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_NoLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getPassword()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#isPersistentDelivery <em>Persistent Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent Delivery</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#isPersistentDelivery()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_PersistentDelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#isRecoverJmsConnections <em>Recover Jms Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recover Jms Connections</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#isRecoverJmsConnections()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_RecoverJmsConnections();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getRedeliveryHandlerRef <em>Redelivery Handler Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redelivery Handler Ref</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getRedeliveryHandlerRef()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_RedeliveryHandlerRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getSpecification()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_Specification();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.jms.VendorJmsConnectorType#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType#getUsername()
	 * @see #getVendorJmsConnectorType()
	 * @generated
	 */
	EAttribute getVendorJmsConnectorType_Username();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.jms.AcknowledgementModeType <em>Acknowledgement Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acknowledgement Mode Type</em>'.
	 * @see org.mule.ide.config.jms.AcknowledgementModeType
	 * @generated
	 */
	EEnum getAcknowledgementModeType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.jms.SpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specification Type</em>'.
	 * @see org.mule.ide.config.jms.SpecificationType
	 * @generated
	 */
	EEnum getSpecificationType();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.jms.AcknowledgementModeType <em>Acknowledgement Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Acknowledgement Mode Type Object</em>'.
	 * @see org.mule.ide.config.jms.AcknowledgementModeType
	 * @model instanceClass="org.mule.ide.config.jms.AcknowledgementModeType"
	 *        extendedMetaData="name='acknowledgementMode_._type:Object' baseType='acknowledgementMode_._type'"
	 * @generated
	 */
	EDataType getAcknowledgementModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.jms.SpecificationType <em>Specification Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Specification Type Object</em>'.
	 * @see org.mule.ide.config.jms.SpecificationType
	 * @model instanceClass="org.mule.ide.config.jms.SpecificationType"
	 *        extendedMetaData="name='specification_._type:Object' baseType='specification_._type'"
	 * @generated
	 */
	EDataType getSpecificationTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JMSFactory getJMSFactory();

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
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.ActiveMqConnectorTypeImpl <em>Active Mq Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.ActiveMqConnectorTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getActiveMqConnectorType()
		 * @generated
		 */
		EClass ACTIVE_MQ_CONNECTOR_TYPE = eINSTANCE.getActiveMqConnectorType();

		/**
		 * The meta object literal for the '<em><b>Broker URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL = eINSTANCE.getActiveMqConnectorType_BrokerURL();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.CustomConnectorTypeImpl <em>Custom Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.CustomConnectorTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getCustomConnectorType()
		 * @generated
		 */
		EClass CUSTOM_CONNECTOR_TYPE = eINSTANCE.getCustomConnectorType();

		/**
		 * The meta object literal for the '<em><b>Acknowledgement Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE = eINSTANCE.getCustomConnectorType_AcknowledgementMode();

		/**
		 * The meta object literal for the '<em><b>Cache Jms Sessions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__CACHE_JMS_SESSIONS = eINSTANCE.getCustomConnectorType_CacheJmsSessions();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__CLIENT_ID = eINSTANCE.getCustomConnectorType_ClientId();

		/**
		 * The meta object literal for the '<em><b>Durable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__DURABLE = eINSTANCE.getCustomConnectorType_Durable();

		/**
		 * The meta object literal for the '<em><b>Eager Consumer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__EAGER_CONSUMER = eINSTANCE.getCustomConnectorType_EagerConsumer();

		/**
		 * The meta object literal for the '<em><b>Honor Qos Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__HONOR_QOS_HEADERS = eINSTANCE.getCustomConnectorType_HonorQosHeaders();

		/**
		 * The meta object literal for the '<em><b>Max Redelivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__MAX_REDELIVERY = eINSTANCE.getCustomConnectorType_MaxRedelivery();

		/**
		 * The meta object literal for the '<em><b>No Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__NO_LOCAL = eINSTANCE.getCustomConnectorType_NoLocal();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__PASSWORD = eINSTANCE.getCustomConnectorType_Password();

		/**
		 * The meta object literal for the '<em><b>Persistent Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__PERSISTENT_DELIVERY = eINSTANCE.getCustomConnectorType_PersistentDelivery();

		/**
		 * The meta object literal for the '<em><b>Recover Jms Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS = eINSTANCE.getCustomConnectorType_RecoverJmsConnections();

		/**
		 * The meta object literal for the '<em><b>Redelivery Handler Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF = eINSTANCE.getCustomConnectorType_RedeliveryHandlerRef();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__SPECIFICATION = eINSTANCE.getCustomConnectorType_Specification();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONNECTOR_TYPE__USERNAME = eINSTANCE.getCustomConnectorType_Username();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.DocumentRootImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Activemq Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR = eINSTANCE.getDocumentRoot_ActivemqConnector();

		/**
		 * The meta object literal for the '<em><b>Activemq Xa Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR = eINSTANCE.getDocumentRoot_ActivemqXaConnector();

		/**
		 * The meta object literal for the '<em><b>Client Ack Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION = eINSTANCE.getDocumentRoot_ClientAckTransaction();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONNECTOR = eINSTANCE.getDocumentRoot_Connector();

		/**
		 * The meta object literal for the '<em><b>Custom Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CUSTOM_CONNECTOR = eINSTANCE.getDocumentRoot_CustomConnector();

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
		 * The meta object literal for the '<em><b>Jmsmessage To Object Transformer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER = eINSTANCE.getDocumentRoot_JmsmessageToObjectTransformer();

		/**
		 * The meta object literal for the '<em><b>Object To Jmsmessage Transformer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER = eINSTANCE.getDocumentRoot_ObjectToJmsmessageTransformer();

		/**
		 * The meta object literal for the '<em><b>Outbound Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OUTBOUND_ENDPOINT = eINSTANCE.getDocumentRoot_OutboundEndpoint();

		/**
		 * The meta object literal for the '<em><b>Property Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_FILTER = eINSTANCE.getDocumentRoot_PropertyFilter();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSACTION = eINSTANCE.getDocumentRoot_Transaction();

		/**
		 * The meta object literal for the '<em><b>Weblogic Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEBLOGIC_CONNECTOR = eINSTANCE.getDocumentRoot_WeblogicConnector();

		/**
		 * The meta object literal for the '<em><b>Websphere Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEBSPHERE_CONNECTOR = eINSTANCE.getDocumentRoot_WebsphereConnector();

		/**
		 * The meta object literal for the '<em><b>Xa Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XA_TRANSACTION = eINSTANCE.getDocumentRoot_XaTransaction();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.GenericConnectorTypeImpl <em>Generic Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.GenericConnectorTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getGenericConnectorType()
		 * @generated
		 */
		EClass GENERIC_CONNECTOR_TYPE = eINSTANCE.getGenericConnectorType();

		/**
		 * The meta object literal for the '<em><b>Acknowledgement Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE = eINSTANCE.getGenericConnectorType_AcknowledgementMode();

		/**
		 * The meta object literal for the '<em><b>Cache Jms Sessions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS = eINSTANCE.getGenericConnectorType_CacheJmsSessions();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__CLIENT_ID = eINSTANCE.getGenericConnectorType_ClientId();

		/**
		 * The meta object literal for the '<em><b>Connection Factory Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF = eINSTANCE.getGenericConnectorType_ConnectionFactoryRef();

		/**
		 * The meta object literal for the '<em><b>Durable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__DURABLE = eINSTANCE.getGenericConnectorType_Durable();

		/**
		 * The meta object literal for the '<em><b>Eager Consumer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER = eINSTANCE.getGenericConnectorType_EagerConsumer();

		/**
		 * The meta object literal for the '<em><b>Honor Qos Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS = eINSTANCE.getGenericConnectorType_HonorQosHeaders();

		/**
		 * The meta object literal for the '<em><b>Max Redelivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY = eINSTANCE.getGenericConnectorType_MaxRedelivery();

		/**
		 * The meta object literal for the '<em><b>No Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__NO_LOCAL = eINSTANCE.getGenericConnectorType_NoLocal();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__PASSWORD = eINSTANCE.getGenericConnectorType_Password();

		/**
		 * The meta object literal for the '<em><b>Persistent Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY = eINSTANCE.getGenericConnectorType_PersistentDelivery();

		/**
		 * The meta object literal for the '<em><b>Recover Jms Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS = eINSTANCE.getGenericConnectorType_RecoverJmsConnections();

		/**
		 * The meta object literal for the '<em><b>Redelivery Handler Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF = eINSTANCE.getGenericConnectorType_RedeliveryHandlerRef();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__SPECIFICATION = eINSTANCE.getGenericConnectorType_Specification();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONNECTOR_TYPE__USERNAME = eINSTANCE.getGenericConnectorType_Username();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.GlobalEndpointTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getGlobalEndpointType()
		 * @generated
		 */
		EClass GLOBAL_ENDPOINT_TYPE = eINSTANCE.getGlobalEndpointType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__GROUP = eINSTANCE.getGlobalEndpointType_Group();

		/**
		 * The meta object literal for the '<em><b>Abstract Transformer Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = eINSTANCE.getGlobalEndpointType_AbstractTransformerGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Transformer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = eINSTANCE.getGlobalEndpointType_AbstractTransformer();

		/**
		 * The meta object literal for the '<em><b>Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__TRANSFORMERS = eINSTANCE.getGlobalEndpointType_Transformers();

		/**
		 * The meta object literal for the '<em><b>Response Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = eINSTANCE.getGlobalEndpointType_ResponseTransformers();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = eINSTANCE.getGlobalEndpointType_AbstractTransactionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = eINSTANCE.getGlobalEndpointType_AbstractTransaction();

		/**
		 * The meta object literal for the '<em><b>Abstract Filter Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = eINSTANCE.getGlobalEndpointType_AbstractFilterGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER = eINSTANCE.getGlobalEndpointType_AbstractFilter();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__SELECTOR = eINSTANCE.getGlobalEndpointType_Selector();

		/**
		 * The meta object literal for the '<em><b>Abstract Security Filter Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = eINSTANCE.getGlobalEndpointType_AbstractSecurityFilterGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Security Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = eINSTANCE.getGlobalEndpointType_AbstractSecurityFilter();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ENDPOINT_TYPE__PROPERTIES = eINSTANCE.getGlobalEndpointType_Properties();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__ADDRESS = eINSTANCE.getGlobalEndpointType_Address();

		/**
		 * The meta object literal for the '<em><b>Connector Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF = eINSTANCE.getGlobalEndpointType_ConnectorRef();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__ENCODING = eINSTANCE.getGlobalEndpointType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__QUEUE = eINSTANCE.getGlobalEndpointType_Queue();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__REF = eINSTANCE.getGlobalEndpointType_Ref();

		/**
		 * The meta object literal for the '<em><b>Remote Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC = eINSTANCE.getGlobalEndpointType_RemoteSync();

		/**
		 * The meta object literal for the '<em><b>Remote Sync Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = eINSTANCE.getGlobalEndpointType_RemoteSyncTimeout();

		/**
		 * The meta object literal for the '<em><b>Response Transformer Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = eINSTANCE.getGlobalEndpointType_ResponseTransformerRefs();

		/**
		 * The meta object literal for the '<em><b>Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS = eINSTANCE.getGlobalEndpointType_Synchronous();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__TOPIC = eINSTANCE.getGlobalEndpointType_Topic();

		/**
		 * The meta object literal for the '<em><b>Transformer Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS = eINSTANCE.getGlobalEndpointType_TransformerRefs();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.InboundEndpointTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getInboundEndpointType()
		 * @generated
		 */
		EClass INBOUND_ENDPOINT_TYPE = eINSTANCE.getInboundEndpointType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__GROUP = eINSTANCE.getInboundEndpointType_Group();

		/**
		 * The meta object literal for the '<em><b>Abstract Transformer Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = eINSTANCE.getInboundEndpointType_AbstractTransformerGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Transformer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = eINSTANCE.getInboundEndpointType_AbstractTransformer();

		/**
		 * The meta object literal for the '<em><b>Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__TRANSFORMERS = eINSTANCE.getInboundEndpointType_Transformers();

		/**
		 * The meta object literal for the '<em><b>Response Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = eINSTANCE.getInboundEndpointType_ResponseTransformers();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = eINSTANCE.getInboundEndpointType_AbstractTransactionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = eINSTANCE.getInboundEndpointType_AbstractTransaction();

		/**
		 * The meta object literal for the '<em><b>Abstract Filter Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = eINSTANCE.getInboundEndpointType_AbstractFilterGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = eINSTANCE.getInboundEndpointType_AbstractFilter();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__SELECTOR = eINSTANCE.getInboundEndpointType_Selector();

		/**
		 * The meta object literal for the '<em><b>Abstract Security Filter Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = eINSTANCE.getInboundEndpointType_AbstractSecurityFilterGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Security Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = eINSTANCE.getInboundEndpointType_AbstractSecurityFilter();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INBOUND_ENDPOINT_TYPE__PROPERTIES = eINSTANCE.getInboundEndpointType_Properties();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__ADDRESS = eINSTANCE.getInboundEndpointType_Address();

		/**
		 * The meta object literal for the '<em><b>Connector Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__CONNECTOR_REF = eINSTANCE.getInboundEndpointType_ConnectorRef();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__ENCODING = eINSTANCE.getInboundEndpointType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__QUEUE = eINSTANCE.getInboundEndpointType_Queue();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__REF = eINSTANCE.getInboundEndpointType_Ref();

		/**
		 * The meta object literal for the '<em><b>Remote Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__REMOTE_SYNC = eINSTANCE.getInboundEndpointType_RemoteSync();

		/**
		 * The meta object literal for the '<em><b>Remote Sync Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = eINSTANCE.getInboundEndpointType_RemoteSyncTimeout();

		/**
		 * The meta object literal for the '<em><b>Response Transformer Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = eINSTANCE.getInboundEndpointType_ResponseTransformerRefs();

		/**
		 * The meta object literal for the '<em><b>Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__SYNCHRONOUS = eINSTANCE.getInboundEndpointType_Synchronous();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__TOPIC = eINSTANCE.getInboundEndpointType_Topic();

		/**
		 * The meta object literal for the '<em><b>Transformer Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = eINSTANCE.getInboundEndpointType_TransformerRefs();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.JmsSelectorFilterImpl <em>Jms Selector Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.JmsSelectorFilterImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getJmsSelectorFilter()
		 * @generated
		 */
		EClass JMS_SELECTOR_FILTER = eINSTANCE.getJmsSelectorFilter();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMS_SELECTOR_FILTER__EXPRESSION = eINSTANCE.getJmsSelectorFilter_Expression();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.OutboundEndpointTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getOutboundEndpointType()
		 * @generated
		 */
		EClass OUTBOUND_ENDPOINT_TYPE = eINSTANCE.getOutboundEndpointType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__GROUP = eINSTANCE.getOutboundEndpointType_Group();

		/**
		 * The meta object literal for the '<em><b>Abstract Transformer Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = eINSTANCE.getOutboundEndpointType_AbstractTransformerGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Transformer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = eINSTANCE.getOutboundEndpointType_AbstractTransformer();

		/**
		 * The meta object literal for the '<em><b>Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__TRANSFORMERS = eINSTANCE.getOutboundEndpointType_Transformers();

		/**
		 * The meta object literal for the '<em><b>Response Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = eINSTANCE.getOutboundEndpointType_ResponseTransformers();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = eINSTANCE.getOutboundEndpointType_AbstractTransactionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = eINSTANCE.getOutboundEndpointType_AbstractTransaction();

		/**
		 * The meta object literal for the '<em><b>Abstract Filter Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = eINSTANCE.getOutboundEndpointType_AbstractFilterGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = eINSTANCE.getOutboundEndpointType_AbstractFilter();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__SELECTOR = eINSTANCE.getOutboundEndpointType_Selector();

		/**
		 * The meta object literal for the '<em><b>Abstract Security Filter Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = eINSTANCE.getOutboundEndpointType_AbstractSecurityFilterGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Security Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = eINSTANCE.getOutboundEndpointType_AbstractSecurityFilter();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_ENDPOINT_TYPE__PROPERTIES = eINSTANCE.getOutboundEndpointType_Properties();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__ADDRESS = eINSTANCE.getOutboundEndpointType_Address();

		/**
		 * The meta object literal for the '<em><b>Connector Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF = eINSTANCE.getOutboundEndpointType_ConnectorRef();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__ENCODING = eINSTANCE.getOutboundEndpointType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__QUEUE = eINSTANCE.getOutboundEndpointType_Queue();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__REF = eINSTANCE.getOutboundEndpointType_Ref();

		/**
		 * The meta object literal for the '<em><b>Remote Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC = eINSTANCE.getOutboundEndpointType_RemoteSync();

		/**
		 * The meta object literal for the '<em><b>Remote Sync Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = eINSTANCE.getOutboundEndpointType_RemoteSyncTimeout();

		/**
		 * The meta object literal for the '<em><b>Response Transformer Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = eINSTANCE.getOutboundEndpointType_ResponseTransformerRefs();

		/**
		 * The meta object literal for the '<em><b>Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS = eINSTANCE.getOutboundEndpointType_Synchronous();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__TOPIC = eINSTANCE.getOutboundEndpointType_Topic();

		/**
		 * The meta object literal for the '<em><b>Transformer Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = eINSTANCE.getOutboundEndpointType_TransformerRefs();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.PropertyFilterTypeImpl <em>Property Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.PropertyFilterTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getPropertyFilterType()
		 * @generated
		 */
		EClass PROPERTY_FILTER_TYPE = eINSTANCE.getPropertyFilterType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILTER_TYPE__EXPRESSION = eINSTANCE.getPropertyFilterType_Expression();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILTER_TYPE__PATTERN = eINSTANCE.getPropertyFilterType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Property Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILTER_TYPE__PROPERTY_CLASS = eINSTANCE.getPropertyFilterType_PropertyClass();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILTER_TYPE__PROPERTY_NAME = eINSTANCE.getPropertyFilterType_PropertyName();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.impl.VendorJmsConnectorTypeImpl <em>Vendor Jms Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.impl.VendorJmsConnectorTypeImpl
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getVendorJmsConnectorType()
		 * @generated
		 */
		EClass VENDOR_JMS_CONNECTOR_TYPE = eINSTANCE.getVendorJmsConnectorType();

		/**
		 * The meta object literal for the '<em><b>Acknowledgement Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE = eINSTANCE.getVendorJmsConnectorType_AcknowledgementMode();

		/**
		 * The meta object literal for the '<em><b>Cache Jms Sessions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__CACHE_JMS_SESSIONS = eINSTANCE.getVendorJmsConnectorType_CacheJmsSessions();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__CLIENT_ID = eINSTANCE.getVendorJmsConnectorType_ClientId();

		/**
		 * The meta object literal for the '<em><b>Connection Factory Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__CONNECTION_FACTORY_REF = eINSTANCE.getVendorJmsConnectorType_ConnectionFactoryRef();

		/**
		 * The meta object literal for the '<em><b>Durable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__DURABLE = eINSTANCE.getVendorJmsConnectorType_Durable();

		/**
		 * The meta object literal for the '<em><b>Eager Consumer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__EAGER_CONSUMER = eINSTANCE.getVendorJmsConnectorType_EagerConsumer();

		/**
		 * The meta object literal for the '<em><b>Honor Qos Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__HONOR_QOS_HEADERS = eINSTANCE.getVendorJmsConnectorType_HonorQosHeaders();

		/**
		 * The meta object literal for the '<em><b>Max Redelivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__MAX_REDELIVERY = eINSTANCE.getVendorJmsConnectorType_MaxRedelivery();

		/**
		 * The meta object literal for the '<em><b>No Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__NO_LOCAL = eINSTANCE.getVendorJmsConnectorType_NoLocal();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__PASSWORD = eINSTANCE.getVendorJmsConnectorType_Password();

		/**
		 * The meta object literal for the '<em><b>Persistent Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__PERSISTENT_DELIVERY = eINSTANCE.getVendorJmsConnectorType_PersistentDelivery();

		/**
		 * The meta object literal for the '<em><b>Recover Jms Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS = eINSTANCE.getVendorJmsConnectorType_RecoverJmsConnections();

		/**
		 * The meta object literal for the '<em><b>Redelivery Handler Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF = eINSTANCE.getVendorJmsConnectorType_RedeliveryHandlerRef();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__SPECIFICATION = eINSTANCE.getVendorJmsConnectorType_Specification();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_JMS_CONNECTOR_TYPE__USERNAME = eINSTANCE.getVendorJmsConnectorType_Username();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.AcknowledgementModeType <em>Acknowledgement Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.AcknowledgementModeType
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getAcknowledgementModeType()
		 * @generated
		 */
		EEnum ACKNOWLEDGEMENT_MODE_TYPE = eINSTANCE.getAcknowledgementModeType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.jms.SpecificationType <em>Specification Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.SpecificationType
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getSpecificationType()
		 * @generated
		 */
		EEnum SPECIFICATION_TYPE = eINSTANCE.getSpecificationType();

		/**
		 * The meta object literal for the '<em>Acknowledgement Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.AcknowledgementModeType
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getAcknowledgementModeTypeObject()
		 * @generated
		 */
		EDataType ACKNOWLEDGEMENT_MODE_TYPE_OBJECT = eINSTANCE.getAcknowledgementModeTypeObject();

		/**
		 * The meta object literal for the '<em>Specification Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.jms.SpecificationType
		 * @see org.mule.ide.config.jms.impl.JMSPackageImpl#getSpecificationTypeObject()
		 * @generated
		 */
		EDataType SPECIFICATION_TYPE_OBJECT = eINSTANCE.getSpecificationTypeObject();

	}

} //JMSPackage
