/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.mule.ide.config.spring.SpringPackage;

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
 * @see org.mule.ide.config.core.CoreFactory
 * @model kind="package"
 * customization
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mulesource.org/schema/mule/core/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.mule.ide.config.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractExtensionTypeImpl <em>Abstract Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractExtensionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractExtensionType()
	 * @generated
	 */
	int ABSTRACT_EXTENSION_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Abstract Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTENSION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractAgentTypeImpl <em>Abstract Agent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractAgentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractAgentType()
	 * @generated
	 */
	int ABSTRACT_AGENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Agent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_AGENT_TYPE_FEATURE_COUNT = ABSTRACT_EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractAsyncReplyRouterTypeImpl <em>Abstract Async Reply Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractAsyncReplyRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractAsyncReplyRouterType()
	 * @generated
	 */
	int ABSTRACT_ASYNC_REPLY_ROUTER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Async Reply Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractCatchAllStrategyTypeImpl <em>Abstract Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractCatchAllStrategyType()
	 * @generated
	 */
	int ABSTRACT_CATCH_ALL_STRATEGY_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Abstract Catch All Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractComponentThreadingProfileTypeImpl <em>Abstract Component Threading Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractComponentThreadingProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractComponentThreadingProfileType()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Abstract Component Threading Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractComponentTypeImpl <em>Abstract Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractComponentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractComponentType()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET = 1;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER = 3;

	/**
	 * The number of structural features of the '<em>Abstract Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractConnectorTypeImpl <em>Abstract Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractConnectorType()
	 * @generated
	 */
	int ABSTRACT_CONNECTOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractEntryPointResolverSetTypeImpl <em>Abstract Entry Point Resolver Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractEntryPointResolverSetTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractEntryPointResolverSetType()
	 * @generated
	 */
	int ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Abstract Entry Point Resolver Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractEntryPointResolverTypeImpl <em>Abstract Entry Point Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractEntryPointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractEntryPointResolverType()
	 * @generated
	 */
	int ABSTRACT_ENTRY_POINT_RESOLVER_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Abstract Entry Point Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractExceptionStrategyTypeImpl <em>Abstract Exception Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractExceptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractExceptionStrategyType()
	 * @generated
	 */
	int ABSTRACT_EXCEPTION_STRATEGY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Commit Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION = 0;

	/**
	 * The feature id for the '<em><b>Rollback Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION = 1;

	/**
	 * The feature id for the '<em><b>Enable Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS = 2;

	/**
	 * The number of structural features of the '<em>Abstract Exception Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractFilterTypeImpl <em>Abstract Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractFilterType()
	 * @generated
	 */
	int ABSTRACT_FILTER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FILTER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FILTER_TYPE__NOT = 1;

	/**
	 * The number of structural features of the '<em>Abstract Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FILTER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractGlobalEndpointTypeImpl <em>Abstract Global Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractGlobalEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractGlobalEndpointType()
	 * @generated
	 */
	int ABSTRACT_GLOBAL_ENDPOINT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GLOBAL_ENDPOINT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Global Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractInboundEndpointTypeImpl <em>Abstract Inbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractInboundEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractInboundEndpointType()
	 * @generated
	 */
	int ABSTRACT_INBOUND_ENDPOINT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INBOUND_ENDPOINT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Inbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractInboundRouterTypeImpl <em>Abstract Inbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractInboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractInboundRouterType()
	 * @generated
	 */
	int ABSTRACT_INBOUND_ROUTER_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Abstract Inbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractLifecycleAdapterFactoryImpl <em>Abstract Lifecycle Adapter Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractLifecycleAdapterFactoryImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractLifecycleAdapterFactory()
	 * @generated
	 */
	int ABSTRACT_LIFECYCLE_ADAPTER_FACTORY = 14;

	/**
	 * The number of structural features of the '<em>Abstract Lifecycle Adapter Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractMessageInfoMappingTypeImpl <em>Abstract Message Info Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractMessageInfoMappingTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractMessageInfoMappingType()
	 * @generated
	 */
	int ABSTRACT_MESSAGE_INFO_MAPPING_TYPE = 15;

	/**
	 * The number of structural features of the '<em>Abstract Message Info Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl <em>Abstract Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractModelTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractModelType()
	 * @generated
	 */
	int ABSTRACT_MODEL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET = 3;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER = 5;

	/**
	 * The feature id for the '<em><b>Abstract Service Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Abstract Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__NAME = 8;

	/**
	 * The number of structural features of the '<em>Abstract Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractObjectFactoryTypeImpl <em>Abstract Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractObjectFactoryType()
	 * @generated
	 */
	int ABSTRACT_OBJECT_FACTORY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Abstract Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractOutboundEndpointTypeImpl <em>Abstract Outbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractOutboundEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractOutboundEndpointType()
	 * @generated
	 */
	int ABSTRACT_OUTBOUND_ENDPOINT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUTBOUND_ENDPOINT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Outbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractOutboundRouterTypeImpl <em>Abstract Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractOutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractOutboundRouterType()
	 * @generated
	 */
	int ABSTRACT_OUTBOUND_ROUTER_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Abstract Outbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractPoolingProfileTypeImpl <em>Abstract Pooling Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractPoolingProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractPoolingProfileType()
	 * @generated
	 */
	int ABSTRACT_POOLING_PROFILE_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Abstract Pooling Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractQueueProfileTypeImpl <em>Abstract Queue Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractQueueProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractQueueProfileType()
	 * @generated
	 */
	int ABSTRACT_QUEUE_PROFILE_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Abstract Queue Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUEUE_PROFILE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractSecurityFilterTypeImpl <em>Abstract Security Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractSecurityFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractSecurityFilterType()
	 * @generated
	 */
	int ABSTRACT_SECURITY_FILTER_TYPE = 22;

	/**
	 * The number of structural features of the '<em>Abstract Security Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECURITY_FILTER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractSecurityManagerTypeImpl <em>Abstract Security Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractSecurityManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractSecurityManagerType()
	 * @generated
	 */
	int ABSTRACT_SECURITY_MANAGER_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECURITY_MANAGER_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECURITY_MANAGER_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Abstract Security Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECURITY_MANAGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractServiceTypeImpl <em>Abstract Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractServiceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractServiceType()
	 * @generated
	 */
	int ABSTRACT_SERVICE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractTransactionManagerTypeImpl <em>Abstract Transaction Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractTransactionManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractTransactionManagerType()
	 * @generated
	 */
	int ABSTRACT_TRANSACTION_MANAGER_TYPE = 25;

	/**
	 * The number of structural features of the '<em>Abstract Transaction Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractTransactionTypeImpl <em>Abstract Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractTransactionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractTransactionType()
	 * @generated
	 */
	int ABSTRACT_TRANSACTION_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_TYPE__TIMEOUT = 1;

	/**
	 * The number of structural features of the '<em>Abstract Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractTransformerTypeImpl <em>Abstract Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractTransformerType()
	 * @generated
	 */
	int ABSTRACT_TRANSFORMER_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSFORMER_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Abstract Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AppendStringTransformerTypeImpl <em>Append String Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AppendStringTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAppendStringTransformerType()
	 * @generated
	 */
	int APPEND_STRING_TRANSFORMER_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_STRING_TRANSFORMER_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_STRING_TRANSFORMER_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_STRING_TRANSFORMER_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_STRING_TRANSFORMER_TYPE__MESSAGE = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Append String Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_STRING_TRANSFORMER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl <em>Async Reply Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAsyncReplyCollectionType()
	 * @generated
	 */
	int ASYNC_REPLY_COLLECTION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Abstract Async Reply Router Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Async Reply Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_ASYNC_REPLY_ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__ABSTRACT_TRANSFORMER = 5;

	/**
	 * The feature id for the '<em><b>Fail On Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__FAIL_ON_TIMEOUT = 6;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE__TIMEOUT = 7;

	/**
	 * The number of structural features of the '<em>Async Reply Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_COLLECTION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl <em>Async Reply Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AsyncReplyRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAsyncReplyRouterType()
	 * @generated
	 */
	int ASYNC_REPLY_ROUTER_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP = ABSTRACT_ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT = ABSTRACT_ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = ABSTRACT_ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = ABSTRACT_ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Async Reply Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT = ABSTRACT_ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.BaseEntryPointResolverTypeImpl <em>Base Entry Point Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.BaseEntryPointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getBaseEntryPointResolverType()
	 * @generated
	 */
	int BASE_ENTRY_POINT_RESOLVER_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Accept Void Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS = ABSTRACT_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST = ABSTRACT_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Entry Point Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT = ABSTRACT_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.BaseServiceTypeImpl <em>Base Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.BaseServiceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getBaseServiceType()
	 * @generated
	 */
	int BASE_SERVICE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__NAME = ABSTRACT_SERVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__INBOUND = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__ABSTRACT_COMPONENT = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__OUTBOUND = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Async Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__ASYNC_REPLY = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__INITIAL_STATE = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Base Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE_FEATURE_COUNT = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.BaseTransactionTypeImpl <em>Base Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.BaseTransactionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getBaseTransactionType()
	 * @generated
	 */
	int BASE_TRANSACTION_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TRANSACTION_TYPE__ACTION = ABSTRACT_TRANSACTION_TYPE__ACTION;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TRANSACTION_TYPE__TIMEOUT = ABSTRACT_TRANSACTION_TYPE__TIMEOUT;

	/**
	 * The number of structural features of the '<em>Base Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TRANSACTION_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl <em>Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.OutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getOutboundRouterType()
	 * @generated
	 */
	int OUTBOUND_ROUTER_TYPE = 102;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl <em>Filtering Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getFilteringOutboundRouterType()
	 * @generated
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE = 77;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ChunkingRouterTypeImpl <em>Chunking Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ChunkingRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getChunkingRouterType()
	 * @generated
	 */
	int CHUNKING_ROUTER_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CollectionFilterTypeImpl <em>Collection Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CollectionFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCollectionFilterType()
	 * @generated
	 */
	int COLLECTION_FILTER_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ReflectionEntryPointResolverTypeImpl <em>Reflection Entry Point Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ReflectionEntryPointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getReflectionEntryPointResolverType()
	 * @generated
	 */
	int REFLECTION_ENTRY_POINT_RESOLVER_TYPE = 113;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ComplexEntryPointResolverTypeImpl <em>Complex Entry Point Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ComplexEntryPointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getComplexEntryPointResolverType()
	 * @generated
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ConfigurationTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getConfigurationType()
	 * @generated
	 */
	int CONFIGURATION_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.FilteredInboundRouterTypeImpl <em>Filtered Inbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.FilteredInboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getFilteredInboundRouterType()
	 * @generated
	 */
	int FILTERED_INBOUND_ROUTER_TYPE = 76;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MessageChunkingAggregatorRouterTypeImpl <em>Message Chunking Aggregator Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MessageChunkingAggregatorRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMessageChunkingAggregatorRouterType()
	 * @generated
	 */
	int MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE = 92;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomCorrelationAggregatorRouterTypeImpl <em>Custom Correlation Aggregator Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomCorrelationAggregatorRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomCorrelationAggregatorRouterType()
	 * @generated
	 */
	int CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomAsyncReplyRouterTypeImpl <em>Custom Async Reply Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomAsyncReplyRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomAsyncReplyRouterType()
	 * @generated
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE = 40;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomCatchAllStrategyTypeImpl <em>Custom Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomCatchAllStrategyType()
	 * @generated
	 */
	int CUSTOM_CATCH_ALL_STRATEGY_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomConnectorTypeImpl <em>Custom Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomConnectorType()
	 * @generated
	 */
	int CUSTOM_CONNECTOR_TYPE = 42;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EncryptionStrategyTypeImpl <em>Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEncryptionStrategyType()
	 * @generated
	 */
	int ENCRYPTION_STRATEGY_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomEncryptionStrategyTypeImpl <em>Custom Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomEncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomEncryptionStrategyType()
	 * @generated
	 */
	int CUSTOM_ENCRYPTION_STRATEGY_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomEntryPointResolverSetTypeImpl <em>Custom Entry Point Resolver Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomEntryPointResolverSetTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomEntryPointResolverSetType()
	 * @generated
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_SET_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomEntryPointResolverTypeImpl <em>Custom Entry Point Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomEntryPointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomEntryPointResolverType()
	 * @generated
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_TYPE = 46;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EndpointExceptionStrategyTypeImpl <em>Endpoint Exception Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EndpointExceptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEndpointExceptionStrategyType()
	 * @generated
	 */
	int ENDPOINT_EXCEPTION_STRATEGY_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomExceptionStrategyTypeImpl <em>Custom Exception Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomExceptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomExceptionStrategyType()
	 * @generated
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomFilterTypeImpl <em>Custom Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomFilterType()
	 * @generated
	 */
	int CUSTOM_FILTER_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ForwardingCatchAllStrategyTypeImpl <em>Forwarding Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ForwardingCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getForwardingCatchAllStrategyType()
	 * @generated
	 */
	int FORWARDING_CATCH_ALL_STRATEGY_TYPE = 78;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomForwardingCatchAllStrategyTypeImpl <em>Custom Forwarding Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomForwardingCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomForwardingCatchAllStrategyType()
	 * @generated
	 */
	int CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE = 49;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomInboundRouterTypeImpl <em>Custom Inbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomInboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomInboundRouterType()
	 * @generated
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE = 50;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomLifecycleAdapterFactoryImpl <em>Custom Lifecycle Adapter Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomLifecycleAdapterFactoryImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomLifecycleAdapterFactory()
	 * @generated
	 */
	int CUSTOM_LIFECYCLE_ADAPTER_FACTORY = 51;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomOutboundRouterTypeImpl <em>Custom Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomOutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomOutboundRouterType()
	 * @generated
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE = 53;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SecurityProviderTypeImpl <em>Security Provider Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SecurityProviderTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSecurityProviderType()
	 * @generated
	 */
	int SECURITY_PROVIDER_TYPE = 120;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomSecurityProviderTypeImpl <em>Custom Security Provider Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomSecurityProviderTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomSecurityProviderType()
	 * @generated
	 */
	int CUSTOM_SECURITY_PROVIDER_TYPE = 54;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomServiceTypeImpl <em>Custom Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomServiceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomServiceType()
	 * @generated
	 */
	int CUSTOM_SERVICE_TYPE = 55;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.JndiTransactionManagerType1Impl <em>Jndi Transaction Manager Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.JndiTransactionManagerType1Impl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getJndiTransactionManagerType1()
	 * @generated
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE1 = 86;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.JndiTransactionManagerTypeImpl <em>Jndi Transaction Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.JndiTransactionManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getJndiTransactionManagerType()
	 * @generated
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE = 85;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomTransactionManagerTypeImpl <em>Custom Transaction Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomTransactionManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomTransactionManagerType()
	 * @generated
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE = 56;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomTransactionTypeImpl <em>Custom Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomTransactionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomTransactionType()
	 * @generated
	 */
	int CUSTOM_TRANSACTION_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomTransformerTypeImpl <em>Custom Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomTransformerType()
	 * @generated
	 */
	int CUSTOM_TRANSFORMER_TYPE = 58;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DefaultComponentTypeImpl <em>Default Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DefaultComponentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDefaultComponentType()
	 * @generated
	 */
	int DEFAULT_COMPONENT_TYPE = 59;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl <em>Default Java Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DefaultJavaComponentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDefaultJavaComponentType()
	 * @generated
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE = 60;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SedaModelTypeImpl <em>Seda Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SedaModelTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSedaModelType()
	 * @generated
	 */
	int SEDA_MODEL_TYPE = 121;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DefaultModelTypeImpl <em>Default Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DefaultModelTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDefaultModelType()
	 * @generated
	 */
	int DEFAULT_MODEL_TYPE = 61;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SedaServiceTypeImpl <em>Seda Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SedaServiceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSedaServiceType()
	 * @generated
	 */
	int SEDA_SERVICE_TYPE = 122;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DefineNotificationTypeImpl <em>Define Notification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DefineNotificationTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDefineNotificationType()
	 * @generated
	 */
	int DEFINE_NOTIFICATION_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DescriptionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 63;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DisableNotificationTypeImpl <em>Disable Notification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DisableNotificationTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDisableNotificationType()
	 * @generated
	 */
	int DISABLE_NOTIFICATION_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DocumentRootImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 65;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EncryptionSecurityFilterTypeImpl <em>Encryption Security Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EncryptionSecurityFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEncryptionSecurityFilterType()
	 * @generated
	 */
	int ENCRYPTION_SECURITY_FILTER_TYPE = 66;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EncryptionTransformerTypeImpl <em>Encryption Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EncryptionTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEncryptionTransformerType()
	 * @generated
	 */
	int ENCRYPTION_TRANSFORMER_TYPE = 68;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EndpointSelectorRouterTypeImpl <em>Endpoint Selector Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EndpointSelectorRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEndpointSelectorRouterType()
	 * @generated
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ExpressionTransformerTypeImpl <em>Expression Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ExpressionTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExpressionTransformerType()
	 * @generated
	 */
	int EXPRESSION_TRANSFORMER_TYPE = 74;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ExtensibleEntryPointResolverSetImpl <em>Extensible Entry Point Resolver Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ExtensibleEntryPointResolverSetImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExtensibleEntryPointResolverSet()
	 * @generated
	 */
	int EXTENSIBLE_ENTRY_POINT_RESOLVER_SET = 75;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl <em>Generic Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getGenericObjectFactoryType()
	 * @generated
	 */
	int GENERIC_OBJECT_FACTORY_TYPE = 79;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.GlobalEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getGlobalEndpointType()
	 * @generated
	 */
	int GLOBAL_ENDPOINT_TYPE = 80;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.InboundCollectionTypeImpl <em>Inbound Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.InboundCollectionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInboundCollectionType()
	 * @generated
	 */
	int INBOUND_COLLECTION_TYPE = 82;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.InboundEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInboundEndpointType()
	 * @generated
	 */
	int INBOUND_ENDPOINT_TYPE = 83;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.JndiConnectorTypeImpl <em>Jndi Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.JndiConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getJndiConnectorType()
	 * @generated
	 */
	int JNDI_CONNECTOR_TYPE = 84;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.KeyTypeImpl <em>Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.KeyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 87;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.KeyValueTypeImpl <em>Key Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.KeyValueTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getKeyValueType()
	 * @generated
	 */
	int KEY_VALUE_TYPE = 88;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ListOrSetTypeImpl <em>List Or Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ListOrSetTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getListOrSetType()
	 * @generated
	 */
	int LIST_OR_SET_TYPE = 89;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.LoggingCatchAllStrategyTypeImpl <em>Logging Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.LoggingCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getLoggingCatchAllStrategyType()
	 * @generated
	 */
	int LOGGING_CATCH_ALL_STRATEGY_TYPE = 90;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MapTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 91;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl <em>Message Properties Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMessagePropertiesTransformerType()
	 * @generated
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE = 93;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MessageSplitterOutboundRouterTypeImpl <em>Message Splitter Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MessageSplitterOutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMessageSplitterOutboundRouterType()
	 * @generated
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE = 94;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MethodEntryPointResolverTypeImpl <em>Method Entry Point Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MethodEntryPointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMethodEntryPointResolverType()
	 * @generated
	 */
	int METHOD_ENTRY_POINT_RESOLVER_TYPE = 95;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MethodTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 96;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MuleTypeImpl <em>Mule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MuleTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMuleType()
	 * @generated
	 */
	int MULE_TYPE = 97;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.NotificationListenerTypeImpl <em>Notification Listener Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.NotificationListenerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNotificationListenerType()
	 * @generated
	 */
	int NOTIFICATION_LISTENER_TYPE = 98;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.NotificationManagerTypeImpl <em>Notification Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.NotificationManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNotificationManagerType()
	 * @generated
	 */
	int NOTIFICATION_MANAGER_TYPE = 99;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.OutboundCollectionTypeImpl <em>Outbound Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.OutboundCollectionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getOutboundCollectionType()
	 * @generated
	 */
	int OUTBOUND_COLLECTION_TYPE = 100;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.OutboundEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getOutboundEndpointType()
	 * @generated
	 */
	int OUTBOUND_ENDPOINT_TYPE = 101;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PasswordEncryptionStrategyTypeImpl <em>Password Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PasswordEncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPasswordEncryptionStrategyType()
	 * @generated
	 */
	int PASSWORD_ENCRYPTION_STRATEGY_TYPE = 103;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PatternFilterTypeImpl <em>Pattern Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PatternFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPatternFilterType()
	 * @generated
	 */
	int PATTERN_FILTER_TYPE = 104;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FILTER_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FILTER_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FILTER_TYPE__PATTERN = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CaseSensitivePatternFilterTypeImpl <em>Case Sensitive Pattern Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CaseSensitivePatternFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCaseSensitivePatternFilterType()
	 * @generated
	 */
	int CASE_SENSITIVE_PATTERN_FILTER_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SENSITIVE_PATTERN_FILTER_TYPE__NAME = PATTERN_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SENSITIVE_PATTERN_FILTER_TYPE__NOT = PATTERN_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SENSITIVE_PATTERN_FILTER_TYPE__PATTERN = PATTERN_FILTER_TYPE__PATTERN;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SENSITIVE_PATTERN_FILTER_TYPE__CASE_SENSITIVE = PATTERN_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Sensitive Pattern Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SENSITIVE_PATTERN_FILTER_TYPE_FEATURE_COUNT = PATTERN_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__REPLY_TO = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Outbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE_FEATURE_COUNT = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__REPLY_TO = OUTBOUND_ROUTER_TYPE__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP = OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION = OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION = OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER = OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP = OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER = OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS = OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Filtering Outbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT = OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__REPLY_TO = FILTERING_OUTBOUND_ROUTER_TYPE__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_TRANSACTION = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ENABLE_CORRELATION = FILTERING_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_FILTER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_TRANSFORMER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__TRANSFORMER_REFS = FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__MESSAGE_SIZE = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__NUMBER_OF_MESSAGES = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chunking Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE_FEATURE_COUNT = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_TYPE__ABSTRACT_FILTER_GROUP = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_TYPE__ABSTRACT_FILTER = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accept Void Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS = BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS;

	/**
	 * The feature id for the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST = BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST;

	/**
	 * The feature id for the '<em><b>Exclude Object Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS = BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclude Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT = BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reflection Entry Point Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT = BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accept Void Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS = REFLECTION_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS;

	/**
	 * The feature id for the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST = REFLECTION_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST;

	/**
	 * The feature id for the '<em><b>Exclude Object Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS = REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS;

	/**
	 * The feature id for the '<em><b>Exclude Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT = REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT;

	/**
	 * The feature id for the '<em><b>Include Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT = REFLECTION_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ENABLE_DISCOVERY = REFLECTION_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Entry Point Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT = REFLECTION_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_THREADING_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Default Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Default Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE = 2;

	/**
	 * The feature id for the '<em><b>Default Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE = 3;

	/**
	 * The feature id for the '<em><b>Default Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_REMOTE_SYNC = 4;

	/**
	 * The feature id for the '<em><b>Default Synchronous Endpoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS = 5;

	/**
	 * The feature id for the '<em><b>Default Synchronous Event Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT = 6;

	/**
	 * The feature id for the '<em><b>Default Transaction Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DEFAULT_TRANSACTION_TIMEOUT = 7;

	/**
	 * The number of structural features of the '<em>Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NAME = ABSTRACT_CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__PROPERTY = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__SERVICE_OVERRIDES = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP = ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT = ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE__PROPERTY = ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE__CLASS = ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Async Reply Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT = ASYNC_REPLY_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATCH_ALL_STRATEGY_TYPE__PROPERTY = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATCH_ALL_STRATEGY_TYPE__CLASS = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Catch All Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__NAME = CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__PROPERTY = CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__SERVICE_OVERRIDES = CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CLASS = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER = ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filtered Inbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT = ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Correlation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Chunking Aggregator Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE_FEATURE_COUNT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER = MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Correlation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION = MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE__CLASS = MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Correlation Aggregator Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE_FEATURE_COUNT = MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_STRATEGY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Encryption Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENCRYPTION_STRATEGY_TYPE__NAME = ENCRYPTION_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENCRYPTION_STRATEGY_TYPE__PROPERTY = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENCRYPTION_STRATEGY_TYPE__STRATEGY_REF = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Encryption Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_SET_TYPE__PROPERTY = ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_SET_TYPE__CLASS = ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Entry Point Resolver Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT = ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_TYPE__PROPERTY = ABSTRACT_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_TYPE__CLASS = ABSTRACT_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Entry Point Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT = ABSTRACT_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commit Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION = ABSTRACT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Rollback Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION = ABSTRACT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Enable Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS = ABSTRACT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Endpoint Exception Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT = ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commit Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION = ENDPOINT_EXCEPTION_STRATEGY_TYPE__COMMIT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Rollback Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION = ENDPOINT_EXCEPTION_STRATEGY_TYPE__ROLLBACK_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Enable Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS = ENDPOINT_EXCEPTION_STRATEGY_TYPE__ENABLE_NOTIFICATIONS;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = ENDPOINT_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__PROPERTY = ENDPOINT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__CLASS = ENDPOINT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Exception Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT = ENDPOINT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FILTER_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FILTER_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FILTER_TYPE__PROPERTY = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FILTER_TYPE__CLASS = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_CATCH_ALL_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_CATCH_ALL_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forwarding Catch All Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = FORWARDING_CATCH_ALL_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = FORWARDING_CATCH_ALL_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE__PROPERTY = FORWARDING_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE__CLASS = FORWARDING_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Forwarding Catch All Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT = FORWARDING_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__PROPERTY = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__CLASS = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Custom Inbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE_FEATURE_COUNT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LIFECYCLE_ADAPTER_FACTORY__CLASS = ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Lifecycle Adapter Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LIFECYCLE_ADAPTER_FACTORY_FEATURE_COUNT = ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomMessageInfoMappingTypeImpl <em>Custom Message Info Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomMessageInfoMappingTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomMessageInfoMappingType()
	 * @generated
	 */
	int CUSTOM_MESSAGE_INFO_MAPPING_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE_INFO_MAPPING_TYPE__PROPERTY = ABSTRACT_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE_INFO_MAPPING_TYPE__CLASS = ABSTRACT_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Message Info Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT = ABSTRACT_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__REPLY_TO = FILTERING_OUTBOUND_ROUTER_TYPE__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION = FILTERING_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS = FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__PROPERTY = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__CLASS = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Outbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROVIDER_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Security Provider Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROVIDER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_PROVIDER_TYPE__NAME = SECURITY_PROVIDER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_PROVIDER_TYPE__PROPERTY = SECURITY_PROVIDER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_PROVIDER_TYPE__PROVIDER_REF = SECURITY_PROVIDER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Security Provider Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SECURITY_PROVIDER_TYPE_FEATURE_COUNT = SECURITY_PROVIDER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__NAME = BASE_SERVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__INBOUND = BASE_SERVICE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Abstract Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP = BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__ABSTRACT_COMPONENT = BASE_SERVICE_TYPE__ABSTRACT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__OUTBOUND = BASE_SERVICE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Async Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__ASYNC_REPLY = BASE_SERVICE_TYPE__ASYNC_REPLY;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY = BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__INITIAL_STATE = BASE_SERVICE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE__CLASS = BASE_SERVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SERVICE_TYPE_FEATURE_COUNT = BASE_SERVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE1__ENVIRONMENT = ABSTRACT_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jndi Transaction Manager Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE1_FEATURE_COUNT = ABSTRACT_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE__ENVIRONMENT = JNDI_TRANSACTION_MANAGER_TYPE1__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE__PROPERTY = JNDI_TRANSACTION_MANAGER_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE__CLASS = JNDI_TRANSACTION_MANAGER_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Transaction Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT = JNDI_TRANSACTION_MANAGER_TYPE1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_TYPE__ACTION = BASE_TRANSACTION_TYPE__ACTION;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_TYPE__TIMEOUT = BASE_TRANSACTION_TYPE__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Factory Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_TYPE__FACTORY_CLASS = BASE_TRANSACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_TYPE__FACTORY_REF = BASE_TRANSACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_TYPE_FEATURE_COUNT = BASE_TRANSACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMER_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMER_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMER_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMER_TYPE__PROPERTY = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMER_TYPE__CLASS = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER;

	/**
	 * The number of structural features of the '<em>Default Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_COMPONENT_TYPE_FEATURE_COUNT = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER = ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Lifecycle Adapter Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Lifecycle Adapter Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__BINDING = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE__CLASS = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Default Java Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_JAVA_COMPONENT_TYPE_FEATURE_COUNT = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY = ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP = ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET = ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER = ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER;

	/**
	 * The feature id for the '<em><b>Abstract Service Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_SERVICE_GROUP = ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_SERVICE = ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__NAME = ABSTRACT_MODEL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP = ABSTRACT_MODEL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE = ABSTRACT_MODEL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inherit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__INHERIT = ABSTRACT_MODEL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__CONNECTIONS = ABSTRACT_MODEL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Seda Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE_FEATURE_COUNT = ABSTRACT_MODEL_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = SEDA_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY = SEDA_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP = SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET = SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER = SEDA_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER;

	/**
	 * The feature id for the '<em><b>Abstract Service Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP = SEDA_MODEL_TYPE__ABSTRACT_SERVICE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_SERVICE = SEDA_MODEL_TYPE__ABSTRACT_SERVICE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__NAME = SEDA_MODEL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP = SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE = SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE;

	/**
	 * The feature id for the '<em><b>Inherit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__INHERIT = SEDA_MODEL_TYPE__INHERIT;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__CONNECTIONS = SEDA_MODEL_TYPE__CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Default Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE_FEATURE_COUNT = SEDA_MODEL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_NOTIFICATION_TYPE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Event Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_NOTIFICATION_TYPE__EVENT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_NOTIFICATION_TYPE__INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_NOTIFICATION_TYPE__INTERFACE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Define Notification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_NOTIFICATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_NOTIFICATION_TYPE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Event Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_NOTIFICATION_TYPE__EVENT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_NOTIFICATION_TYPE__INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_NOTIFICATION_TYPE__INTERFACE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Disable Notification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_NOTIFICATION_TYPE_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Abstract Async Reply Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_ASYNC_REPLY_ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_CATCH_ALL_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Abstract Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_COMPONENT_THREADING_PROFILE = 6;

	/**
	 * The feature id for the '<em><b>Abstract Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER = 8;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER_SET = 9;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_EXCEPTION_STRATEGY = 10;

	/**
	 * The feature id for the '<em><b>Abstract Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_EXTENSION = 11;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_FILTER = 12;

	/**
	 * The feature id for the '<em><b>Abstract Global Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_GLOBAL_ENDPOINT = 13;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_INBOUND_ENDPOINT = 14;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_INBOUND_ROUTER = 15;

	/**
	 * The feature id for the '<em><b>Abstract Lifecycle Adapter Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY = 16;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_MESSAGE_INFO_MAPPING = 17;

	/**
	 * The feature id for the '<em><b>Abstract Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_MODEL = 18;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OBJECT_FACTORY = 19;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ENDPOINT = 20;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ROUTER = 21;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_POOLING_PROFILE = 22;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_QUEUE_PROFILE = 23;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SECURITY_FILTER = 24;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SECURITY_MANAGER = 25;

	/**
	 * The feature id for the '<em><b>Abstract Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SERVICE = 26;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSACTION = 27;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER = 28;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSFORMER = 29;

	/**
	 * The feature id for the '<em><b>And Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AND_FILTER = 30;

	/**
	 * The feature id for the '<em><b>Append String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPEND_STRING_TRANSFORMER = 31;

	/**
	 * The feature id for the '<em><b>Array Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARRAY_ENTRY_POINT_RESOLVER = 32;

	/**
	 * The feature id for the '<em><b>Base64 Decoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASE64_DECODER_TRANSFORMER = 33;

	/**
	 * The feature id for the '<em><b>Base64 Encoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASE64_ENCODER_TRANSFORMER = 34;

	/**
	 * The feature id for the '<em><b>Bridge Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BRIDGE_COMPONENT = 35;

	/**
	 * The feature id for the '<em><b>Byte Array To Hex String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BYTE_ARRAY_TO_HEX_STRING_TRANSFORMER = 36;

	/**
	 * The feature id for the '<em><b>Byte Array To Object Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BYTE_ARRAY_TO_OBJECT_TRANSFORMER = 37;

	/**
	 * The feature id for the '<em><b>Byte Array To Serializable Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BYTE_ARRAY_TO_SERIALIZABLE_TRANSFORMER = 38;

	/**
	 * The feature id for the '<em><b>Byte Array To String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BYTE_ARRAY_TO_STRING_TRANSFORMER = 39;

	/**
	 * The feature id for the '<em><b>Callable Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALLABLE_ENTRY_POINT_RESOLVER = 40;

	/**
	 * The feature id for the '<em><b>Chaining Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHAINING_ROUTER = 41;

	/**
	 * The feature id for the '<em><b>Collection Async Reply Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLECTION_ASYNC_REPLY_ROUTER = 42;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT = 43;

	/**
	 * The feature id for the '<em><b>Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE = 44;

	/**
	 * The feature id for the '<em><b>Correlation Resequencer Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER = 45;

	/**
	 * The feature id for the '<em><b>Custom Async Reply Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER = 46;

	/**
	 * The feature id for the '<em><b>Custom Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY = 47;

	/**
	 * The feature id for the '<em><b>Custom Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CONNECTOR = 48;

	/**
	 * The feature id for the '<em><b>Custom Correlation Aggregator Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CORRELATION_AGGREGATOR_ROUTER = 49;

	/**
	 * The feature id for the '<em><b>Custom Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER = 50;

	/**
	 * The feature id for the '<em><b>Custom Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER_SET = 51;

	/**
	 * The feature id for the '<em><b>Custom Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY = 52;

	/**
	 * The feature id for the '<em><b>Custom Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_FILTER = 53;

	/**
	 * The feature id for the '<em><b>Custom Forwarding Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY = 54;

	/**
	 * The feature id for the '<em><b>Custom Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER = 55;

	/**
	 * The feature id for the '<em><b>Custom Lifecycle Adapter Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_LIFECYCLE_ADAPTER_FACTORY = 56;

	/**
	 * The feature id for the '<em><b>Custom Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_MESSAGE_INFO_MAPPING = 57;

	/**
	 * The feature id for the '<em><b>Custom Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER = 58;

	/**
	 * The feature id for the '<em><b>Custom Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_SERVICE = 59;

	/**
	 * The feature id for the '<em><b>Custom Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_TRANSACTION = 60;

	/**
	 * The feature id for the '<em><b>Custom Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER = 61;

	/**
	 * The feature id for the '<em><b>Custom Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_TRANSFORMER = 62;

	/**
	 * The feature id for the '<em><b>Decrypt Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECRYPT_TRANSFORMER = 63;

	/**
	 * The feature id for the '<em><b>Default Connector Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY = 64;

	/**
	 * The feature id for the '<em><b>Default Service Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY = 65;

	/**
	 * The feature id for the '<em><b>Echo Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ECHO_COMPONENT = 66;

	/**
	 * The feature id for the '<em><b>Encryption Security Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER = 67;

	/**
	 * The feature id for the '<em><b>Encrypt Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPT_TRANSFORMER = 68;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT = 69;

	/**
	 * The feature id for the '<em><b>Endpoint Selector Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER = 70;

	/**
	 * The feature id for the '<em><b>Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTRY_POINT_RESOLVER_SET = 71;

	/**
	 * The feature id for the '<em><b>Exception Based Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER = 72;

	/**
	 * The feature id for the '<em><b>Exception Type Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER = 73;

	/**
	 * The feature id for the '<em><b>Expression Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION_FILTER = 74;

	/**
	 * The feature id for the '<em><b>Expression Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION_MESSAGE_INFO_MAPPING = 75;

	/**
	 * The feature id for the '<em><b>Expression Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION_TRANSFORMER = 76;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 77;

	/**
	 * The feature id for the '<em><b>Filtering Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTERING_ROUTER = 78;

	/**
	 * The feature id for the '<em><b>Forwarding Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY = 79;

	/**
	 * The feature id for the '<em><b>Forwarding Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORWARDING_ROUTER = 80;

	/**
	 * The feature id for the '<em><b>Gzip Compress Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GZIP_COMPRESS_TRANSFORMER = 81;

	/**
	 * The feature id for the '<em><b>Gzip Uncompress Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GZIP_UNCOMPRESS_TRANSFORMER = 82;

	/**
	 * The feature id for the '<em><b>Hex String To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEX_STRING_TO_BYTE_ARRAY_TRANSFORMER = 83;

	/**
	 * The feature id for the '<em><b>Idempotent Receiver Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER = 84;

	/**
	 * The feature id for the '<em><b>Idempotent Secure Hash Receiver Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER = 85;

	/**
	 * The feature id for the '<em><b>Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INBOUND_ENDPOINT = 86;

	/**
	 * The feature id for the '<em><b>Inbound Pass Through Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER = 87;

	/**
	 * The feature id for the '<em><b>Include Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUDE_ENTRY_POINT = 88;

	/**
	 * The feature id for the '<em><b>Jboss Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JBOSS_TRANSACTION_MANAGER = 89;

	/**
	 * The feature id for the '<em><b>Jndi Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JNDI_TRANSACTION_MANAGER = 90;

	/**
	 * The feature id for the '<em><b>Jrun Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JRUN_TRANSACTION_MANAGER = 91;

	/**
	 * The feature id for the '<em><b>Legacy Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEGACY_ENTRY_POINT_RESOLVER_SET = 92;

	/**
	 * The feature id for the '<em><b>List Message Splitter Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER = 93;

	/**
	 * The feature id for the '<em><b>Log Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOG_COMPONENT = 94;

	/**
	 * The feature id for the '<em><b>Logging Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY = 95;

	/**
	 * The feature id for the '<em><b>Message Chunking Aggregator Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER = 96;

	/**
	 * The feature id for the '<em><b>Message Chunking Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER = 97;

	/**
	 * The feature id for the '<em><b>Message Properties Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_PROPERTIES_TRANSFORMER = 98;

	/**
	 * The feature id for the '<em><b>Message Property Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER = 99;

	/**
	 * The feature id for the '<em><b>Method Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD_ENTRY_POINT_RESOLVER = 100;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 101;

	/**
	 * The feature id for the '<em><b>Mule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULE = 102;

	/**
	 * The feature id for the '<em><b>Multicasting Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTICASTING_ROUTER = 103;

	/**
	 * The feature id for the '<em><b>No Action Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NO_ACTION_TRANSFORMER = 104;

	/**
	 * The feature id for the '<em><b>No Arguments Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NO_ARGUMENTS_ENTRY_POINT_RESOLVER = 105;

	/**
	 * The feature id for the '<em><b>Not Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOT_FILTER = 106;

	/**
	 * The feature id for the '<em><b>Null Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NULL_COMPONENT = 107;

	/**
	 * The feature id for the '<em><b>Object To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_TO_BYTE_ARRAY_TRANSFORMER = 108;

	/**
	 * The feature id for the '<em><b>Object To String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_TO_STRING_TRANSFORMER = 109;

	/**
	 * The feature id for the '<em><b>Or Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OR_FILTER = 110;

	/**
	 * The feature id for the '<em><b>Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTBOUND_ENDPOINT = 111;

	/**
	 * The feature id for the '<em><b>Outbound Pass Through Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER = 112;

	/**
	 * The feature id for the '<em><b>Payload Type Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER = 113;

	/**
	 * The feature id for the '<em><b>Pooled Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POOLED_COMPONENT = 114;

	/**
	 * The feature id for the '<em><b>Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POOLING_PROFILE = 115;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTIES = 116;

	/**
	 * The feature id for the '<em><b>Property Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_ENTRY_POINT_RESOLVER = 117;

	/**
	 * The feature id for the '<em><b>Prototype Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTOTYPE_OBJECT = 118;

	/**
	 * The feature id for the '<em><b>Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUEUE_PROFILE = 119;

	/**
	 * The feature id for the '<em><b>Reflection Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFLECTION_ENTRY_POINT_RESOLVER = 120;

	/**
	 * The feature id for the '<em><b>Regex Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGEX_FILTER = 121;

	/**
	 * The feature id for the '<em><b>Resin Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESIN_TRANSACTION_MANAGER = 122;

	/**
	 * The feature id for the '<em><b>Security Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_MANAGER = 123;

	/**
	 * The feature id for the '<em><b>Seda Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEDA_MODEL = 124;

	/**
	 * The feature id for the '<em><b>Selective Consumer Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER = 125;

	/**
	 * The feature id for the '<em><b>Serializable To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERIALIZABLE_TO_BYTE_ARRAY_TRANSFORMER = 126;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 127;

	/**
	 * The feature id for the '<em><b>Single Async Reply Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER = 128;

	/**
	 * The feature id for the '<em><b>Singleton Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SINGLETON_OBJECT = 129;

	/**
	 * The feature id for the '<em><b>Spring Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPRING_OBJECT = 130;

	/**
	 * The feature id for the '<em><b>Static Recipient List Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER = 131;

	/**
	 * The feature id for the '<em><b>String To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_TO_BYTE_ARRAY_TRANSFORMER = 132;

	/**
	 * The feature id for the '<em><b>Template Endpoint Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER = 133;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER = 134;

	/**
	 * The feature id for the '<em><b>Weblogic Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBLOGIC_TRANSACTION_MANAGER = 135;

	/**
	 * The feature id for the '<em><b>Websphere Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBSPHERE_TRANSACTION_MANAGER = 136;

	/**
	 * The feature id for the '<em><b>Wildcard Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WILDCARD_FILTER = 137;

	/**
	 * The feature id for the '<em><b>Wire Tap Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WIRE_TAP_ROUTER = 138;

	/**
	 * The feature id for the '<em><b>Xml Entity Decoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XML_ENTITY_DECODER_TRANSFORMER = 139;

	/**
	 * The feature id for the '<em><b>Xml Entity Encoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XML_ENTITY_ENCODER_TRANSFORMER = 140;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 141;

	/**
	 * The feature id for the '<em><b>Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_SECURITY_FILTER_TYPE__STRATEGY_REF = ABSTRACT_SECURITY_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Encryption Security Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_SECURITY_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_SECURITY_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_TRANSFORMER_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_TRANSFORMER_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_TRANSFORMER_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_TRANSFORMER_TYPE__STRATEGY_REF = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Encryption Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_TRANSFORMER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__REPLY_TO = FILTERING_OUTBOUND_ROUTER_TYPE__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_TRANSACTION = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ENABLE_CORRELATION = FILTERING_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_FILTER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_TRANSFORMER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__TRANSFORMER_REFS = FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Selector Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__SELECTOR_EXPRESSION = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Endpoint Selector Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE_FEATURE_COUNT = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ExceptionPatternTypeImpl <em>Exception Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ExceptionPatternTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExceptionPatternType()
	 * @generated
	 */
	int EXCEPTION_PATTERN_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Exception Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_PATTERN_TYPE__EXCEPTION_PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Exception Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_PATTERN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ExpressionFilterTypeImpl <em>Expression Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ExpressionFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExpressionFilterType()
	 * @generated
	 */
	int EXPRESSION_FILTER_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FILTER_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FILTER_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Custom Evaluator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FILTER_TYPE__CUSTOM_EVALUATOR = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evaluator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FILTER_TYPE__EVALUATOR = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FILTER_TYPE__EXPRESSION = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Null Returns True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FILTER_TYPE__NULL_RETURNS_TRUE = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Expression Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ExpressionMessageInfoMappingTypeImpl <em>Expression Message Info Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ExpressionMessageInfoMappingTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExpressionMessageInfoMappingType()
	 * @generated
	 */
	int EXPRESSION_MESSAGE_INFO_MAPPING_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Correlation Id Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__CORRELATION_ID_EXPRESSION = ABSTRACT_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Id Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__MESSAGE_ID_EXPRESSION = ABSTRACT_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Message Info Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT = ABSTRACT_MESSAGE_INFO_MAPPING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRANSFORMER_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRANSFORMER_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRANSFORMER_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRANSFORMER_TYPE__GROUP = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRANSFORMER_TYPE__RETURN_ARGUMENT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRANSFORMER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ENTRY_POINT_RESOLVER_SET__ABSTRACT_ENTRY_POINT_RESOLVER = ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extensible Entry Point Resolver Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ENTRY_POINT_RESOLVER_SET_FEATURE_COUNT = ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_OBJECT_FACTORY = 1;

	/**
	 * The number of structural features of the '<em>Generic Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__NAME = ABSTRACT_GLOBAL_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__GROUP = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TRANSFORMERS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTY = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTIES = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ADDRESS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ENCODING = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REF = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Global Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.GlobalPropertyTypeImpl <em>Global Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.GlobalPropertyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getGlobalPropertyType()
	 * @generated
	 */
	int GLOBAL_PROPERTY_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Global Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Router Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER = 5;

	/**
	 * The number of structural features of the '<em>Inbound Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_COLLECTION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__NAME = ABSTRACT_INBOUND_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__GROUP = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TRANSFORMERS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTY = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTIES = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ADDRESS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__CONNECTOR_REF = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ENCODING = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REF = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SYNCHRONOUS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Inbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE_FEATURE_COUNT = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__NAME = CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__PROPERTY = CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__SERVICE_OVERRIDES = CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Jndi Provider Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTY = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jndi Provider Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jndi Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF = CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jndi Initial Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY = CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jndi Provider Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL = CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Jndi Url Pkg Prefixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES = CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Jndi Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE__ENVIRONMENT = JNDI_TRANSACTION_MANAGER_TYPE1__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE__JNDI_NAME = JNDI_TRANSACTION_MANAGER_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jndi Transaction Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT = JNDI_TRANSACTION_MANAGER_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__KEY = 0;

	/**
	 * The number of structural features of the '<em>Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__KEY = KEY_TYPE__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__VALUE = KEY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE__VALUE_REF = KEY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_TYPE_FEATURE_COUNT = KEY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__MERGE = SpringPackage.LIST_OR_SET_TYPE__MERGE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__VALUE_TYPE = SpringPackage.LIST_OR_SET_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__GROUP = SpringPackage.LIST_OR_SET_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__BEAN = SpringPackage.LIST_OR_SET_TYPE__BEAN;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__REF = SpringPackage.LIST_OR_SET_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__IDREF = SpringPackage.LIST_OR_SET_TYPE__IDREF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__VALUE = SpringPackage.LIST_OR_SET_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__NULL = SpringPackage.LIST_OR_SET_TYPE__NULL;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__LIST = SpringPackage.LIST_OR_SET_TYPE__LIST;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__SET = SpringPackage.LIST_OR_SET_TYPE__SET;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__MAP = SpringPackage.LIST_OR_SET_TYPE__MAP;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__PROPS = SpringPackage.LIST_OR_SET_TYPE__PROPS;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__ANY = SpringPackage.LIST_OR_SET_TYPE__ANY;

	/**
	 * The number of structural features of the '<em>List Or Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE_FEATURE_COUNT = SpringPackage.LIST_OR_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logging Catch All Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__MERGE = SpringPackage.MAP_TYPE__MERGE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__VALUE_TYPE = SpringPackage.MAP_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__GROUP = SpringPackage.MAP_TYPE__GROUP;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__ENTRY = SpringPackage.MAP_TYPE__ENTRY;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__KEY_TYPE = SpringPackage.MAP_TYPE__KEY_TYPE;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = SpringPackage.MAP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Delete Message Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_MESSAGE_PROPERTY = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Add Message Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTY = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Add Message Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Properties Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__REPLY_TO = FILTERING_OUTBOUND_ROUTER_TYPE__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION = FILTERING_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS = FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Honor Synchronicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__HONOR_SYNCHRONICITY = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Splitter Outbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accept Void Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS = BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS;

	/**
	 * The feature id for the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST = BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST;

	/**
	 * The feature id for the '<em><b>Include Entry Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT = BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Entry Point Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT = BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__BEANS = 2;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__BEAN = 3;

	/**
	 * The feature id for the '<em><b>Global Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__GLOBAL_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__NOTIFICATIONS = 6;

	/**
	 * The feature id for the '<em><b>Abstract Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_EXTENSION_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Abstract Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_EXTENSION = 8;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_SECURITY_MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER = 12;

	/**
	 * The feature id for the '<em><b>Abstract Connector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_CONNECTOR_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Abstract Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Abstract Global Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Abstract Global Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT = 16;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSFORMER_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSFORMER = 18;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_FILTER_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Abstract Model Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_MODEL_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Abstract Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_MODEL = 22;

	/**
	 * The number of structural features of the '<em>Mule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE_FEATURE_COUNT = 23;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_LISTENER_TYPE__REF = 0;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_LISTENER_TYPE__SUBSCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Notification Listener Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_LISTENER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MANAGER_TYPE__NOTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Disable Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MANAGER_TYPE__DISABLE_NOTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Notification Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MANAGER_TYPE__NOTIFICATION_LISTENER = 2;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MANAGER_TYPE__DYNAMIC = 3;

	/**
	 * The number of structural features of the '<em>Notification Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_MANAGER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Router Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Match All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_COLLECTION_TYPE__MATCH_ALL = 4;

	/**
	 * The number of structural features of the '<em>Outbound Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_COLLECTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__NAME = ABSTRACT_OUTBOUND_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__GROUP = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TRANSFORMERS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTY = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTIES = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ADDRESS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ENCODING = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REF = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Outbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_ENCRYPTION_STRATEGY_TYPE__NAME = ENCRYPTION_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Iteration Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_ENCRYPTION_STRATEGY_TYPE__ITERATION_COUNT = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_ENCRYPTION_STRATEGY_TYPE__PASSWORD = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_ENCRYPTION_STRATEGY_TYPE__SALT = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Password Encryption Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PojoBindingTypeImpl <em>Pojo Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PojoBindingTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPojoBindingType()
	 * @generated
	 */
	int POJO_BINDING_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__METHOD = 3;

	/**
	 * The number of structural features of the '<em>Pojo Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PooledJavaComponentTypeImpl <em>Pooled Java Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PooledJavaComponentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPooledJavaComponentType()
	 * @generated
	 */
	int POOLED_JAVA_COMPONENT_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY;

	/**
	 * The feature id for the '<em><b>Abstract Lifecycle Adapter Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Lifecycle Adapter Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY = DEFAULT_JAVA_COMPONENT_TYPE__ABSTRACT_LIFECYCLE_ADAPTER_FACTORY;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__BINDING = DEFAULT_JAVA_COMPONENT_TYPE__BINDING;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__CLASS = DEFAULT_JAVA_COMPONENT_TYPE__CLASS;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE_GROUP = DEFAULT_JAVA_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE__ABSTRACT_POOLING_PROFILE = DEFAULT_JAVA_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pooled Java Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_JAVA_COMPONENT_TYPE_FEATURE_COUNT = DEFAULT_JAVA_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PoolingProfileTypeImpl <em>Pooling Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PoolingProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPoolingProfileType()
	 * @generated
	 */
	int POOLING_PROFILE_TYPE = 107;

	/**
	 * The feature id for the '<em><b>Exhausted Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PROFILE_TYPE__EXHAUSTED_ACTION = ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialisation Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PROFILE_TYPE__INITIALISATION_POLICY = ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PROFILE_TYPE__MAX_ACTIVE = ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PROFILE_TYPE__MAX_IDLE = ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PROFILE_TYPE__MAX_WAIT = ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pooling Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PROFILE_TYPE_FEATURE_COUNT = ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PropertyEntryPointResolverTypeImpl <em>Property Entry Point Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PropertyEntryPointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPropertyEntryPointResolverType()
	 * @generated
	 */
	int PROPERTY_ENTRY_POINT_RESOLVER_TYPE = 108;

	/**
	 * The feature id for the '<em><b>Accept Void Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS = BASE_ENTRY_POINT_RESOLVER_TYPE__ACCEPT_VOID_METHODS;

	/**
	 * The feature id for the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST = BASE_ENTRY_POINT_RESOLVER_TYPE__TRANSFORM_FIRST;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY_POINT_RESOLVER_TYPE__PROPERTY = BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Entry Point Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT = BASE_ENTRY_POINT_RESOLVER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PrototypeObjectFactoryTypeImpl <em>Prototype Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PrototypeObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPrototypeObjectFactoryType()
	 * @generated
	 */
	int PROTOTYPE_OBJECT_FACTORY_TYPE = 109;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE_OBJECT_FACTORY_TYPE__PROPERTY = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE_OBJECT_FACTORY_TYPE__PROPERTIES = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE_OBJECT_FACTORY_TYPE__CLASS = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prototype Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE_OBJECT_FACTORY_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.QueueProfileTypeImpl <em>Queue Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.QueueProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getQueueProfileType()
	 * @generated
	 */
	int QUEUE_PROFILE_TYPE = 110;

	/**
	 * The feature id for the '<em><b>Max Outstanding Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_PROFILE_TYPE__MAX_OUTSTANDING_MESSAGES = ABSTRACT_QUEUE_PROFILE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_PROFILE_TYPE__PERSISTENT = ABSTRACT_QUEUE_PROFILE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Queue Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_PROFILE_TYPE_FEATURE_COUNT = ABSTRACT_QUEUE_PROFILE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ReferenceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 111;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.RefFilterTypeImpl <em>Ref Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.RefFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getRefFilterType()
	 * @generated
	 */
	int REF_FILTER_TYPE = 112;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FILTER_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FILTER_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FILTER_TYPE__REF = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.RefTransformerTypeImpl <em>Ref Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.RefTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getRefTransformerType()
	 * @generated
	 */
	int REF_TRANSFORMER_TYPE = 114;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSFORMER_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSFORMER_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSFORMER_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSFORMER_TYPE__REF = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSFORMER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ReplyToTypeImpl <em>Reply To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ReplyToTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getReplyToType()
	 * @generated
	 */
	int REPLY_TO_TYPE = 115;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_TO_TYPE__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Reply To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_TO_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ResponseTransformersTypeImpl <em>Response Transformers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ResponseTransformersTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getResponseTransformersType()
	 * @generated
	 */
	int RESPONSE_TRANSFORMERS_TYPE = 116;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TRANSFORMERS_TYPE__ABSTRACT_TRANSFORMER_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TRANSFORMERS_TYPE__ABSTRACT_TRANSFORMER = 1;

	/**
	 * The number of structural features of the '<em>Response Transformers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TRANSFORMERS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ReturnArgumentTypeImpl <em>Return Argument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ReturnArgumentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getReturnArgumentType()
	 * @generated
	 */
	int RETURN_ARGUMENT_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Custom Evaluator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ARGUMENT_TYPE__CUSTOM_EVALUATOR = 0;

	/**
	 * The feature id for the '<em><b>Evaluator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ARGUMENT_TYPE__EVALUATOR = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ARGUMENT_TYPE__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ARGUMENT_TYPE__OPTIONAL = 3;

	/**
	 * The number of structural features of the '<em>Return Argument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ARGUMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SecretKeyEncryptionStrategyTypeImpl <em>Secret Key Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SecretKeyEncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSecretKeyEncryptionStrategyType()
	 * @generated
	 */
	int SECRET_KEY_ENCRYPTION_STRATEGY_TYPE = 118;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__NAME = ENCRYPTION_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_ENCRYPTION_STRATEGY_TYPE__KEY_FACTORY_REF = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secret Key Encryption Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT = ENCRYPTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SecurityManagerTypeImpl <em>Security Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SecurityManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSecurityManagerType()
	 * @generated
	 */
	int SECURITY_MANAGER_TYPE = 119;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_TYPE__ID = ABSTRACT_SECURITY_MANAGER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_TYPE__NAME = ABSTRACT_SECURITY_MANAGER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Custom Security Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER = ABSTRACT_SECURITY_MANAGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Encryption Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY = ABSTRACT_SECURITY_MANAGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secret Key Encryption Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY = ABSTRACT_SECURITY_MANAGER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password Encryption Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY = ABSTRACT_SECURITY_MANAGER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_TYPE_FEATURE_COUNT = ABSTRACT_SECURITY_MANAGER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__NAME = BASE_SERVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__INBOUND = BASE_SERVICE_TYPE__INBOUND;

	/**
	 * The feature id for the '<em><b>Abstract Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP = BASE_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT = BASE_SERVICE_TYPE__ABSTRACT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__OUTBOUND = BASE_SERVICE_TYPE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Async Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ASYNC_REPLY = BASE_SERVICE_TYPE__ASYNC_REPLY;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY = BASE_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__INITIAL_STATE = BASE_SERVICE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Abstract Component Threading Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP = BASE_SERVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE = BASE_SERVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP = BASE_SERVICE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE = BASE_SERVICE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Queue Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__QUEUE_TIMEOUT = BASE_SERVICE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Seda Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE_FEATURE_COUNT = BASE_SERVICE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl <em>Selective Consumer Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSelectiveConsumerRouterType()
	 * @generated
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE = 123;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_FILTER = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Selective Consumer Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE_FEATURE_COUNT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ServiceOverridesTypeImpl <em>Service Overrides Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ServiceOverridesTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getServiceOverridesType()
	 * @generated
	 */
	int SERVICE_OVERRIDES_TYPE = 124;

	/**
	 * The feature id for the '<em><b>Dispatcher Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__DISPATCHER_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Endpoint Builder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__ENDPOINT_BUILDER = 1;

	/**
	 * The feature id for the '<em><b>Inbound Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__INBOUND_TRANSFORMER = 2;

	/**
	 * The feature id for the '<em><b>Message Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__MESSAGE_ADAPTER = 3;

	/**
	 * The feature id for the '<em><b>Message Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__MESSAGE_RECEIVER = 4;

	/**
	 * The feature id for the '<em><b>Outbound Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__OUTBOUND_TRANSFORMER = 5;

	/**
	 * The feature id for the '<em><b>Response Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__RESPONSE_TRANSFORMER = 6;

	/**
	 * The feature id for the '<em><b>Service Finder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__SERVICE_FINDER = 7;

	/**
	 * The feature id for the '<em><b>Session Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__SESSION_HANDLER = 8;

	/**
	 * The feature id for the '<em><b>Stream Message Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER = 9;

	/**
	 * The feature id for the '<em><b>Transacted Message Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER = 10;

	/**
	 * The number of structural features of the '<em>Service Overrides Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SingletonObjectFactoryTypeImpl <em>Singleton Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SingletonObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSingletonObjectFactoryType()
	 * @generated
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE = 125;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE__PROPERTY = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE__PROPERTIES = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE__CLASS = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singleton Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SpringBeanLookupTypeImpl <em>Spring Bean Lookup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SpringBeanLookupTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSpringBeanLookupType()
	 * @generated
	 */
	int SPRING_BEAN_LOOKUP_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BEAN_LOOKUP_TYPE__PROPERTY = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BEAN_LOOKUP_TYPE__PROPERTIES = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BEAN_LOOKUP_TYPE__BEAN = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spring Bean Lookup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_BEAN_LOOKUP_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl <em>Static Recipient List Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getStaticRecipientListRouterType()
	 * @generated
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE = 127;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__REPLY_TO = FILTERING_OUTBOUND_ROUTER_TYPE__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_TRANSACTION = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_MESSAGE_INFO_MAPPING;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ENABLE_CORRELATION = FILTERING_OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_FILTER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_TRANSFORMER = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__TRANSFORMER_REFS = FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recipients Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recipients Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__SYNCHRONOUS = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Static Recipient List Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE_FEATURE_COUNT = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl <em>Threading Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ThreadingProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getThreadingProfileType()
	 * @generated
	 */
	int THREADING_PROFILE_TYPE = 128;

	/**
	 * The feature id for the '<em><b>Do Threading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__DO_THREADING = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Threads Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Threads Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__MAX_THREADS_IDLE = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pool Exhausted Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thread TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__THREAD_TTL = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thread Wait Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Threading Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE_FEATURE_COUNT = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TlsClientKeyStoreTypeImpl <em>Tls Client Key Store Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TlsClientKeyStoreTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTlsClientKeyStoreType()
	 * @generated
	 */
	int TLS_CLIENT_KEY_STORE_TYPE = 129;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_CLIENT_KEY_STORE_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_CLIENT_KEY_STORE_TYPE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_CLIENT_KEY_STORE_TYPE__STORE_PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Tls Client Key Store Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_CLIENT_KEY_STORE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl <em>Tls Key Store Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TlsKeyStoreTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTlsKeyStoreType()
	 * @generated
	 */
	int TLS_KEY_STORE_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Key Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__KEY_PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__PATH = 3;

	/**
	 * The feature id for the '<em><b>Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__STORE_PASSWORD = 4;

	/**
	 * The number of structural features of the '<em>Tls Key Store Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TlsProtocolHandlerImpl <em>Tls Protocol Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TlsProtocolHandlerImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTlsProtocolHandler()
	 * @generated
	 */
	int TLS_PROTOCOL_HANDLER = 131;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_PROTOCOL_HANDLER__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Tls Protocol Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_PROTOCOL_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TlsTrustStoreTypeImpl <em>Tls Trust Store Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TlsTrustStoreTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTlsTrustStoreType()
	 * @generated
	 */
	int TLS_TRUST_STORE_TYPE = 133;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_TRUST_STORE_TYPE__PATH = 0;

	/**
	 * The feature id for the '<em><b>Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_TRUST_STORE_TYPE__STORE_PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Tls Trust Store Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_TRUST_STORE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl <em>Tls Server Trust Store Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TlsServerTrustStoreTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTlsServerTrustStoreType()
	 * @generated
	 */
	int TLS_SERVER_TRUST_STORE_TYPE = 132;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__PATH = TLS_TRUST_STORE_TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__STORE_PASSWORD = TLS_TRUST_STORE_TYPE__STORE_PASSWORD;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__ALGORITHM = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__CLASS = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Explicit Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_ONLY = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__FACTORY_REF = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Require Client Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tls Server Trust Store Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE_FEATURE_COUNT = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TransactionManagerTypeImpl <em>Transaction Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TransactionManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTransactionManagerType()
	 * @generated
	 */
	int TRANSACTION_MANAGER_TYPE = 134;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MANAGER_TYPE__NAME = ABSTRACT_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transaction Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_MANAGER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TransformersTypeImpl <em>Transformers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TransformersTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTransformersType()
	 * @generated
	 */
	int TRANSFORMERS_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMERS_TYPE__ABSTRACT_TRANSFORMER_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMERS_TYPE__ABSTRACT_TRANSFORMER = 1;

	/**
	 * The number of structural features of the '<em>Transformers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMERS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TypeFilterTypeImpl <em>Type Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TypeFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTypeFilterType()
	 * @generated
	 */
	int TYPE_FILTER_TYPE = 136;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Expected Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER_TYPE__EXPECTED_TYPE = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.UnitaryFilterTypeImpl <em>Unitary Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.UnitaryFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getUnitaryFilterType()
	 * @generated
	 */
	int UNITARY_FILTER_TYPE = 137;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_FILTER_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_FILTER_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_FILTER_TYPE__ABSTRACT_FILTER_GROUP = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_FILTER_TYPE__ABSTRACT_FILTER = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unitary Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_FILTER_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ValueTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 138;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE_REF = 1;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.WildcardFilterTypeImpl <em>Wildcard Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.WildcardFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getWildcardFilterType()
	 * @generated
	 */
	int WILDCARD_FILTER_TYPE = 139;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FILTER_TYPE__NAME = PATTERN_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FILTER_TYPE__NOT = PATTERN_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FILTER_TYPE__PATTERN = PATTERN_FILTER_TYPE__PATTERN;

	/**
	 * The number of structural features of the '<em>Wildcard Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FILTER_TYPE_FEATURE_COUNT = PATTERN_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.WireTapRouterTypeImpl <em>Wire Tap Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.WireTapRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getWireTapRouterType()
	 * @generated
	 */
	int WIRE_TAP_ROUTER_TYPE = 140;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE__ABSTRACT_FILTER = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wire Tap Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE_FEATURE_COUNT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ConnectionImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 141;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 142;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.EnableCorrelationType <em>Enable Correlation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEnableCorrelationType()
	 * @generated
	 */
	int ENABLE_CORRELATION_TYPE = 143;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.EvaluatorType <em>Evaluator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EvaluatorType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEvaluatorType()
	 * @generated
	 */
	int EVALUATOR_TYPE = 144;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.EvaluatorType1 <em>Evaluator Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EvaluatorType1
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEvaluatorType1()
	 * @generated
	 */
	int EVALUATOR_TYPE1 = 145;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.ExhaustedActionType <em>Exhausted Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExhaustedActionType()
	 * @generated
	 */
	int EXHAUSTED_ACTION_TYPE = 146;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.InitialisationPolicyType <em>Initialisation Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialisationPolicyType()
	 * @generated
	 */
	int INITIALISATION_POLICY_TYPE = 147;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.InitialStateType <em>Initial State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialStateType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialStateType()
	 * @generated
	 */
	int INITIAL_STATE_TYPE = 148;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.NotificationTypes <em>Notification Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.NotificationTypes
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNotificationTypes()
	 * @generated
	 */
	int NOTIFICATION_TYPES = 149;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.PoolExhaustedActionType <em>Pool Exhausted Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPoolExhaustedActionType()
	 * @generated
	 */
	int POOL_EXHAUSTED_ACTION_TYPE = 150;

	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 151;

	/**
	 * The meta object id for the '<em>Enable Correlation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEnableCorrelationTypeObject()
	 * @generated
	 */
	int ENABLE_CORRELATION_TYPE_OBJECT = 152;

	/**
	 * The meta object id for the '<em>Evaluator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EvaluatorType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEvaluatorTypeObject()
	 * @generated
	 */
	int EVALUATOR_TYPE_OBJECT = 153;

	/**
	 * The meta object id for the '<em>Evaluator Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EvaluatorType1
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEvaluatorTypeObject1()
	 * @generated
	 */
	int EVALUATOR_TYPE_OBJECT1 = 154;

	/**
	 * The meta object id for the '<em>Exhausted Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExhaustedActionTypeObject()
	 * @generated
	 */
	int EXHAUSTED_ACTION_TYPE_OBJECT = 155;

	/**
	 * The meta object id for the '<em>Initialisation Policy Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialisationPolicyTypeObject()
	 * @generated
	 */
	int INITIALISATION_POLICY_TYPE_OBJECT = 156;

	/**
	 * The meta object id for the '<em>Initial State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialStateType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialStateTypeObject()
	 * @generated
	 */
	int INITIAL_STATE_TYPE_OBJECT = 157;

	/**
	 * The meta object id for the '<em>Non Blank String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNonBlankString()
	 * @generated
	 */
	int NON_BLANK_STRING = 158;

	/**
	 * The meta object id for the '<em>Non Blank String Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNonBlankStringMember0()
	 * @generated
	 */
	int NON_BLANK_STRING_MEMBER0 = 159;

	/**
	 * The meta object id for the '<em>Notification Types Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.NotificationTypes
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNotificationTypesObject()
	 * @generated
	 */
	int NOTIFICATION_TYPES_OBJECT = 160;

	/**
	 * The meta object id for the '<em>Pool Exhausted Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPoolExhaustedActionTypeObject()
	 * @generated
	 */
	int POOL_EXHAUSTED_ACTION_TYPE_OBJECT = 161;

	/**
	 * The meta object id for the '<em>Property Placeholder Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPropertyPlaceholderType()
	 * @generated
	 */
	int PROPERTY_PLACEHOLDER_TYPE = 162;

	/**
	 * The meta object id for the '<em>Substitutable Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBoolean()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN = 163;

	/**
	 * The meta object id for the '<em>Substitutable Boolean Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBooleanMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN_MEMBER0 = 164;

	/**
	 * The meta object id for the '<em>Substitutable Boolean Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBooleanMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN_MEMBER0_OBJECT = 165;

	/**
	 * The meta object id for the '<em>Substitutable Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBooleanObject()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN_OBJECT = 166;

	/**
	 * The meta object id for the '<em>Substitutable Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableClass()
	 * @generated
	 */
	int SUBSTITUTABLE_CLASS = 167;

	/**
	 * The meta object id for the '<em>Substitutable Class Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableClassMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_CLASS_MEMBER0 = 168;

	/**
	 * The meta object id for the '<em>Substitutable Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableInt()
	 * @generated
	 */
	int SUBSTITUTABLE_INT = 169;

	/**
	 * The meta object id for the '<em>Substitutable Int Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableIntMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_INT_MEMBER0 = 170;

	/**
	 * The meta object id for the '<em>Substitutable Int Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableIntMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_INT_MEMBER0_OBJECT = 171;

	/**
	 * The meta object id for the '<em>Substitutable Int Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableIntObject()
	 * @generated
	 */
	int SUBSTITUTABLE_INT_OBJECT = 172;

	/**
	 * The meta object id for the '<em>Substitutable Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLong()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG = 173;

	/**
	 * The meta object id for the '<em>Substitutable Long Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLongMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG_MEMBER0 = 174;

	/**
	 * The meta object id for the '<em>Substitutable Long Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLongMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG_MEMBER0_OBJECT = 175;

	/**
	 * The meta object id for the '<em>Substitutable Long Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLongObject()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG_OBJECT = 176;

	/**
	 * The meta object id for the '<em>Substitutable Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableName()
	 * @generated
	 */
	int SUBSTITUTABLE_NAME = 177;

	/**
	 * The meta object id for the '<em>Substitutable Name Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableNameMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_NAME_MEMBER0 = 178;

	/**
	 * The meta object id for the '<em>Substitutable Port Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumber()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER = 179;

	/**
	 * The meta object id for the '<em>Substitutable Port Number Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumberMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER_MEMBER0 = 180;

	/**
	 * The meta object id for the '<em>Substitutable Port Number Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumberMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER_MEMBER0_OBJECT = 181;

	/**
	 * The meta object id for the '<em>Substitutable Port Number Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumberObject()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER_OBJECT = 182;


	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractAgentType <em>Abstract Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Agent Type</em>'.
	 * @see org.mule.ide.config.core.AbstractAgentType
	 * @generated
	 */
	EClass getAbstractAgentType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractAsyncReplyRouterType <em>Abstract Async Reply Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Async Reply Router Type</em>'.
	 * @see org.mule.ide.config.core.AbstractAsyncReplyRouterType
	 * @generated
	 */
	EClass getAbstractAsyncReplyRouterType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractCatchAllStrategyType <em>Abstract Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Catch All Strategy Type</em>'.
	 * @see org.mule.ide.config.core.AbstractCatchAllStrategyType
	 * @generated
	 */
	EClass getAbstractCatchAllStrategyType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractComponentThreadingProfileType <em>Abstract Component Threading Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Threading Profile Type</em>'.
	 * @see org.mule.ide.config.core.AbstractComponentThreadingProfileType
	 * @generated
	 */
	EClass getAbstractComponentThreadingProfileType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractComponentType <em>Abstract Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Type</em>'.
	 * @see org.mule.ide.config.core.AbstractComponentType
	 * @generated
	 */
	EClass getAbstractComponentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverSetGroup <em>Abstract Entry Point Resolver Set Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Entry Point Resolver Set Group</em>'.
	 * @see org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverSetGroup()
	 * @see #getAbstractComponentType()
	 * @generated
	 */
	EAttribute getAbstractComponentType_AbstractEntryPointResolverSetGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entry Point Resolver Set</em>'.
	 * @see org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverSet()
	 * @see #getAbstractComponentType()
	 * @generated
	 */
	EReference getAbstractComponentType_AbstractEntryPointResolverSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Entry Point Resolver Group</em>'.
	 * @see org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverGroup()
	 * @see #getAbstractComponentType()
	 * @generated
	 */
	EAttribute getAbstractComponentType_AbstractEntryPointResolverGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolver()
	 * @see #getAbstractComponentType()
	 * @generated
	 */
	EReference getAbstractComponentType_AbstractEntryPointResolver();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractConnectorType <em>Abstract Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connector Type</em>'.
	 * @see org.mule.ide.config.core.AbstractConnectorType
	 * @generated
	 */
	EClass getAbstractConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractConnectorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractConnectorType#getName()
	 * @see #getAbstractConnectorType()
	 * @generated
	 */
	EAttribute getAbstractConnectorType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractEntryPointResolverSetType <em>Abstract Entry Point Resolver Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entry Point Resolver Set Type</em>'.
	 * @see org.mule.ide.config.core.AbstractEntryPointResolverSetType
	 * @generated
	 */
	EClass getAbstractEntryPointResolverSetType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractEntryPointResolverType <em>Abstract Entry Point Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entry Point Resolver Type</em>'.
	 * @see org.mule.ide.config.core.AbstractEntryPointResolverType
	 * @generated
	 */
	EClass getAbstractEntryPointResolverType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractExceptionStrategyType <em>Abstract Exception Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Exception Strategy Type</em>'.
	 * @see org.mule.ide.config.core.AbstractExceptionStrategyType
	 * @generated
	 */
	EClass getAbstractExceptionStrategyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#getCommitTransaction <em>Commit Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commit Transaction</em>'.
	 * @see org.mule.ide.config.core.AbstractExceptionStrategyType#getCommitTransaction()
	 * @see #getAbstractExceptionStrategyType()
	 * @generated
	 */
	EReference getAbstractExceptionStrategyType_CommitTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#getRollbackTransaction <em>Rollback Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rollback Transaction</em>'.
	 * @see org.mule.ide.config.core.AbstractExceptionStrategyType#getRollbackTransaction()
	 * @see #getAbstractExceptionStrategyType()
	 * @generated
	 */
	EReference getAbstractExceptionStrategyType_RollbackTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractExceptionStrategyType#isEnableNotifications <em>Enable Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Notifications</em>'.
	 * @see org.mule.ide.config.core.AbstractExceptionStrategyType#isEnableNotifications()
	 * @see #getAbstractExceptionStrategyType()
	 * @generated
	 */
	EAttribute getAbstractExceptionStrategyType_EnableNotifications();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractExtensionType <em>Abstract Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Extension Type</em>'.
	 * @see org.mule.ide.config.core.AbstractExtensionType
	 * @generated
	 */
	EClass getAbstractExtensionType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractFilterType <em>Abstract Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Filter Type</em>'.
	 * @see org.mule.ide.config.core.AbstractFilterType
	 * @generated
	 */
	EClass getAbstractFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractFilterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractFilterType#getName()
	 * @see #getAbstractFilterType()
	 * @generated
	 */
	EAttribute getAbstractFilterType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractFilterType#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see org.mule.ide.config.core.AbstractFilterType#isNot()
	 * @see #getAbstractFilterType()
	 * @generated
	 */
	EAttribute getAbstractFilterType_Not();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractGlobalEndpointType <em>Abstract Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Global Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.AbstractGlobalEndpointType
	 * @generated
	 */
	EClass getAbstractGlobalEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractGlobalEndpointType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractGlobalEndpointType#getName()
	 * @see #getAbstractGlobalEndpointType()
	 * @generated
	 */
	EAttribute getAbstractGlobalEndpointType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractInboundEndpointType <em>Abstract Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Inbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.AbstractInboundEndpointType
	 * @generated
	 */
	EClass getAbstractInboundEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractInboundEndpointType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractInboundEndpointType#getName()
	 * @see #getAbstractInboundEndpointType()
	 * @generated
	 */
	EAttribute getAbstractInboundEndpointType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractInboundRouterType <em>Abstract Inbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Inbound Router Type</em>'.
	 * @see org.mule.ide.config.core.AbstractInboundRouterType
	 * @generated
	 */
	EClass getAbstractInboundRouterType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractLifecycleAdapterFactory <em>Abstract Lifecycle Adapter Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Lifecycle Adapter Factory</em>'.
	 * @see org.mule.ide.config.core.AbstractLifecycleAdapterFactory
	 * @generated
	 */
	EClass getAbstractLifecycleAdapterFactory();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractMessageInfoMappingType <em>Abstract Message Info Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Message Info Mapping Type</em>'.
	 * @see org.mule.ide.config.core.AbstractMessageInfoMappingType
	 * @generated
	 */
	EClass getAbstractMessageInfoMappingType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractModelType <em>Abstract Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Model Type</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType
	 * @generated
	 */
	EClass getAbstractModelType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AbstractModelType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Exception Strategy Group</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractExceptionStrategyGroup()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EAttribute getAbstractModelType_AbstractExceptionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractModelType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractExceptionStrategy()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EReference getAbstractModelType_AbstractExceptionStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverSetGroup <em>Abstract Entry Point Resolver Set Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Entry Point Resolver Set Group</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverSetGroup()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EAttribute getAbstractModelType_AbstractEntryPointResolverSetGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entry Point Resolver Set</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverSet()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EReference getAbstractModelType_AbstractEntryPointResolverSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Entry Point Resolver Group</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverGroup()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EAttribute getAbstractModelType_AbstractEntryPointResolverGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolver()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EReference getAbstractModelType_AbstractEntryPointResolver();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AbstractModelType#getAbstractServiceGroup <em>Abstract Service Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Service Group</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractServiceGroup()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EAttribute getAbstractModelType_AbstractServiceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.AbstractModelType#getAbstractService <em>Abstract Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Service</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractService()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EReference getAbstractModelType_AbstractService();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractModelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getName()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EAttribute getAbstractModelType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractObjectFactoryType <em>Abstract Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Object Factory Type</em>'.
	 * @see org.mule.ide.config.core.AbstractObjectFactoryType
	 * @generated
	 */
	EClass getAbstractObjectFactoryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.AbstractObjectFactoryType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.AbstractObjectFactoryType#getProperty()
	 * @see #getAbstractObjectFactoryType()
	 * @generated
	 */
	EReference getAbstractObjectFactoryType_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractObjectFactoryType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.mule.ide.config.core.AbstractObjectFactoryType#getProperties()
	 * @see #getAbstractObjectFactoryType()
	 * @generated
	 */
	EReference getAbstractObjectFactoryType_Properties();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractOutboundEndpointType <em>Abstract Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Outbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.AbstractOutboundEndpointType
	 * @generated
	 */
	EClass getAbstractOutboundEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractOutboundEndpointType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractOutboundEndpointType#getName()
	 * @see #getAbstractOutboundEndpointType()
	 * @generated
	 */
	EAttribute getAbstractOutboundEndpointType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractOutboundRouterType <em>Abstract Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Outbound Router Type</em>'.
	 * @see org.mule.ide.config.core.AbstractOutboundRouterType
	 * @generated
	 */
	EClass getAbstractOutboundRouterType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractPoolingProfileType <em>Abstract Pooling Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Pooling Profile Type</em>'.
	 * @see org.mule.ide.config.core.AbstractPoolingProfileType
	 * @generated
	 */
	EClass getAbstractPoolingProfileType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractQueueProfileType <em>Abstract Queue Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Queue Profile Type</em>'.
	 * @see org.mule.ide.config.core.AbstractQueueProfileType
	 * @generated
	 */
	EClass getAbstractQueueProfileType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractSecurityFilterType <em>Abstract Security Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Security Filter Type</em>'.
	 * @see org.mule.ide.config.core.AbstractSecurityFilterType
	 * @generated
	 */
	EClass getAbstractSecurityFilterType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractSecurityManagerType <em>Abstract Security Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Security Manager Type</em>'.
	 * @see org.mule.ide.config.core.AbstractSecurityManagerType
	 * @generated
	 */
	EClass getAbstractSecurityManagerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.mule.ide.config.core.AbstractSecurityManagerType#getId()
	 * @see #getAbstractSecurityManagerType()
	 * @generated
	 */
	EAttribute getAbstractSecurityManagerType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractSecurityManagerType#getName()
	 * @see #getAbstractSecurityManagerType()
	 * @generated
	 */
	EAttribute getAbstractSecurityManagerType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractServiceType <em>Abstract Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Service Type</em>'.
	 * @see org.mule.ide.config.core.AbstractServiceType
	 * @generated
	 */
	EClass getAbstractServiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractServiceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractServiceType#getName()
	 * @see #getAbstractServiceType()
	 * @generated
	 */
	EAttribute getAbstractServiceType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractTransactionManagerType <em>Abstract Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transaction Manager Type</em>'.
	 * @see org.mule.ide.config.core.AbstractTransactionManagerType
	 * @generated
	 */
	EClass getAbstractTransactionManagerType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractTransactionType <em>Abstract Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transaction Type</em>'.
	 * @see org.mule.ide.config.core.AbstractTransactionType
	 * @generated
	 */
	EClass getAbstractTransactionType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractTransactionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.mule.ide.config.core.AbstractTransactionType#getAction()
	 * @see #getAbstractTransactionType()
	 * @generated
	 */
	EAttribute getAbstractTransactionType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractTransactionType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.mule.ide.config.core.AbstractTransactionType#getTimeout()
	 * @see #getAbstractTransactionType()
	 * @generated
	 */
	EAttribute getAbstractTransactionType_Timeout();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractTransformerType <em>Abstract Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transformer Type</em>'.
	 * @see org.mule.ide.config.core.AbstractTransformerType
	 * @generated
	 */
	EClass getAbstractTransformerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractTransformerType#isIgnoreBadInput <em>Ignore Bad Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Bad Input</em>'.
	 * @see org.mule.ide.config.core.AbstractTransformerType#isIgnoreBadInput()
	 * @see #getAbstractTransformerType()
	 * @generated
	 */
	EAttribute getAbstractTransformerType_IgnoreBadInput();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractTransformerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractTransformerType#getName()
	 * @see #getAbstractTransformerType()
	 * @generated
	 */
	EAttribute getAbstractTransformerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractTransformerType#getReturnClass <em>Return Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Class</em>'.
	 * @see org.mule.ide.config.core.AbstractTransformerType#getReturnClass()
	 * @see #getAbstractTransformerType()
	 * @generated
	 */
	EAttribute getAbstractTransformerType_ReturnClass();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AppendStringTransformerType <em>Append String Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append String Transformer Type</em>'.
	 * @see org.mule.ide.config.core.AppendStringTransformerType
	 * @generated
	 */
	EClass getAppendStringTransformerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AppendStringTransformerType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.mule.ide.config.core.AppendStringTransformerType#getMessage()
	 * @see #getAppendStringTransformerType()
	 * @generated
	 */
	EAttribute getAppendStringTransformerType_Message();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AsyncReplyCollectionType <em>Async Reply Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Async Reply Collection Type</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType
	 * @generated
	 */
	EClass getAsyncReplyCollectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractInboundEndpointGroup()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EAttribute getAsyncReplyCollectionType_AbstractInboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractInboundEndpoint()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EReference getAsyncReplyCollectionType_AbstractInboundEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractAsyncReplyRouterGroup <em>Abstract Async Reply Router Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Async Reply Router Group</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractAsyncReplyRouterGroup()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EAttribute getAsyncReplyCollectionType_AbstractAsyncReplyRouterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractAsyncReplyRouter <em>Abstract Async Reply Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Async Reply Router</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractAsyncReplyRouter()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EReference getAsyncReplyCollectionType_AbstractAsyncReplyRouter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractTransformerGroup()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EAttribute getAsyncReplyCollectionType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractTransformer()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EReference getAsyncReplyCollectionType_AbstractTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AsyncReplyCollectionType#isFailOnTimeout <em>Fail On Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail On Timeout</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#isFailOnTimeout()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EAttribute getAsyncReplyCollectionType_FailOnTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyCollectionType#getTimeout()
	 * @see #getAsyncReplyCollectionType()
	 * @generated
	 */
	EAttribute getAsyncReplyCollectionType_Timeout();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AsyncReplyRouterType <em>Async Reply Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Async Reply Router Type</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyRouterType
	 * @generated
	 */
	EClass getAsyncReplyRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyRouterType#getAbstractInboundEndpointGroup()
	 * @see #getAsyncReplyRouterType()
	 * @generated
	 */
	EAttribute getAsyncReplyRouterType_AbstractInboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyRouterType#getAbstractInboundEndpoint()
	 * @see #getAsyncReplyRouterType()
	 * @generated
	 */
	EReference getAsyncReplyRouterType_AbstractInboundEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractMessageInfoMappingGroup <em>Abstract Message Info Mapping Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Message Info Mapping Group</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyRouterType#getAbstractMessageInfoMappingGroup()
	 * @see #getAsyncReplyRouterType()
	 * @generated
	 */
	EAttribute getAsyncReplyRouterType_AbstractMessageInfoMappingGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractMessageInfoMapping <em>Abstract Message Info Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Message Info Mapping</em>'.
	 * @see org.mule.ide.config.core.AsyncReplyRouterType#getAbstractMessageInfoMapping()
	 * @see #getAsyncReplyRouterType()
	 * @generated
	 */
	EReference getAsyncReplyRouterType_AbstractMessageInfoMapping();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.BaseEntryPointResolverType <em>Base Entry Point Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Entry Point Resolver Type</em>'.
	 * @see org.mule.ide.config.core.BaseEntryPointResolverType
	 * @generated
	 */
	EClass getBaseEntryPointResolverType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isAcceptVoidMethods <em>Accept Void Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Void Methods</em>'.
	 * @see org.mule.ide.config.core.BaseEntryPointResolverType#isAcceptVoidMethods()
	 * @see #getBaseEntryPointResolverType()
	 * @generated
	 */
	EAttribute getBaseEntryPointResolverType_AcceptVoidMethods();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isTransformFirst <em>Transform First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform First</em>'.
	 * @see org.mule.ide.config.core.BaseEntryPointResolverType#isTransformFirst()
	 * @see #getBaseEntryPointResolverType()
	 * @generated
	 */
	EAttribute getBaseEntryPointResolverType_TransformFirst();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.BaseServiceType <em>Base Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Service Type</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType
	 * @generated
	 */
	EClass getBaseServiceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getInbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getInbound()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_Inbound();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.BaseServiceType#getAbstractComponentGroup <em>Abstract Component Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Component Group</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getAbstractComponentGroup()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EAttribute getBaseServiceType_AbstractComponentGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getAbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Component</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getAbstractComponent()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_AbstractComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getOutbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outbound</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getOutbound()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_Outbound();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getAsyncReply <em>Async Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Async Reply</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getAsyncReply()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_AsyncReply();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Exception Strategy Group</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategyGroup()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EAttribute getBaseServiceType_AbstractExceptionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategy()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_AbstractExceptionStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.BaseServiceType#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getInitialState()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EAttribute getBaseServiceType_InitialState();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.BaseTransactionType <em>Base Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Transaction Type</em>'.
	 * @see org.mule.ide.config.core.BaseTransactionType
	 * @generated
	 */
	EClass getBaseTransactionType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CaseSensitivePatternFilterType <em>Case Sensitive Pattern Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Sensitive Pattern Filter Type</em>'.
	 * @see org.mule.ide.config.core.CaseSensitivePatternFilterType
	 * @generated
	 */
	EClass getCaseSensitivePatternFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CaseSensitivePatternFilterType#isCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see org.mule.ide.config.core.CaseSensitivePatternFilterType#isCaseSensitive()
	 * @see #getCaseSensitivePatternFilterType()
	 * @generated
	 */
	EAttribute getCaseSensitivePatternFilterType_CaseSensitive();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ChunkingRouterType <em>Chunking Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunking Router Type</em>'.
	 * @see org.mule.ide.config.core.ChunkingRouterType
	 * @generated
	 */
	EClass getChunkingRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ChunkingRouterType#getMessageSize <em>Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Size</em>'.
	 * @see org.mule.ide.config.core.ChunkingRouterType#getMessageSize()
	 * @see #getChunkingRouterType()
	 * @generated
	 */
	EAttribute getChunkingRouterType_MessageSize();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ChunkingRouterType#getNumberOfMessages <em>Number Of Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Messages</em>'.
	 * @see org.mule.ide.config.core.ChunkingRouterType#getNumberOfMessages()
	 * @see #getChunkingRouterType()
	 * @generated
	 */
	EAttribute getChunkingRouterType_NumberOfMessages();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CollectionFilterType <em>Collection Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Filter Type</em>'.
	 * @see org.mule.ide.config.core.CollectionFilterType
	 * @generated
	 */
	EClass getCollectionFilterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.CollectionFilterType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.CollectionFilterType#getAbstractFilterGroup()
	 * @see #getCollectionFilterType()
	 * @generated
	 */
	EAttribute getCollectionFilterType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CollectionFilterType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.CollectionFilterType#getAbstractFilter()
	 * @see #getCollectionFilterType()
	 * @generated
	 */
	EReference getCollectionFilterType_AbstractFilter();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ComplexEntryPointResolverType <em>Complex Entry Point Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Entry Point Resolver Type</em>'.
	 * @see org.mule.ide.config.core.ComplexEntryPointResolverType
	 * @generated
	 */
	EClass getComplexEntryPointResolverType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ComplexEntryPointResolverType#getIncludeEntryPoint <em>Include Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Entry Point</em>'.
	 * @see org.mule.ide.config.core.ComplexEntryPointResolverType#getIncludeEntryPoint()
	 * @see #getComplexEntryPointResolverType()
	 * @generated
	 */
	EReference getComplexEntryPointResolverType_IncludeEntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ComplexEntryPointResolverType#isEnableDiscovery <em>Enable Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Discovery</em>'.
	 * @see org.mule.ide.config.core.ComplexEntryPointResolverType#isEnableDiscovery()
	 * @see #getComplexEntryPointResolverType()
	 * @generated
	 */
	EAttribute getComplexEntryPointResolverType_EnableDiscovery();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType
	 * @generated
	 */
	EClass getConfigurationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConfigurationType#getDefaultThreadingProfile <em>Default Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Threading Profile</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#getDefaultThreadingProfile()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_DefaultThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConfigurationType#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Dispatcher Threading Profile</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#getDefaultDispatcherThreadingProfile()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_DefaultDispatcherThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConfigurationType#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Receiver Threading Profile</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#getDefaultReceiverThreadingProfile()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_DefaultReceiverThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConfigurationType#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Component Threading Profile</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#getDefaultComponentThreadingProfile()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_DefaultComponentThreadingProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConfigurationType#isDefaultRemoteSync <em>Default Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Remote Sync</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#isDefaultRemoteSync()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_DefaultRemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConfigurationType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Synchronous Endpoints</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#isDefaultSynchronousEndpoints()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_DefaultSynchronousEndpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConfigurationType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Synchronous Event Timeout</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#getDefaultSynchronousEventTimeout()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_DefaultSynchronousEventTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConfigurationType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Transaction Timeout</em>'.
	 * @see org.mule.ide.config.core.ConfigurationType#getDefaultTransactionTimeout()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_DefaultTransactionTimeout();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see org.mule.ide.config.core.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ConnectorType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getProperty()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConnectorType#getReceiverThreadingProfile <em>Receiver Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver Threading Profile</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getReceiverThreadingProfile()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ReceiverThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConnectorType#getDispatcherThreadingProfile <em>Dispatcher Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dispatcher Threading Profile</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getDispatcherThreadingProfile()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_DispatcherThreadingProfile();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ConnectorType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Exception Strategy Group</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getAbstractExceptionStrategyGroup()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_AbstractExceptionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConnectorType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getAbstractExceptionStrategy()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_AbstractExceptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ConnectorType#getServiceOverrides <em>Service Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Overrides</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getServiceOverrides()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ServiceOverrides();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConnectorType#isCreateDispatcherPerRequest <em>Create Dispatcher Per Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Dispatcher Per Request</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#isCreateDispatcherPerRequest()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_CreateDispatcherPerRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConnectorType#isCreateMultipleTransactedReceivers <em>Create Multiple Transacted Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Multiple Transacted Receivers</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#isCreateMultipleTransactedReceivers()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_CreateMultipleTransactedReceivers();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConnectorType#isDynamicNotification <em>Dynamic Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Notification</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#isDynamicNotification()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_DynamicNotification();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConnectorType#getNumberOfConcurrentTransactedReceivers <em>Number Of Concurrent Transacted Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Concurrent Transacted Receivers</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getNumberOfConcurrentTransactedReceivers()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_NumberOfConcurrentTransactedReceivers();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomAsyncReplyRouterType <em>Custom Async Reply Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Async Reply Router Type</em>'.
	 * @see org.mule.ide.config.core.CustomAsyncReplyRouterType
	 * @generated
	 */
	EClass getCustomAsyncReplyRouterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomAsyncReplyRouterType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomAsyncReplyRouterType#getProperty()
	 * @see #getCustomAsyncReplyRouterType()
	 * @generated
	 */
	EReference getCustomAsyncReplyRouterType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomAsyncReplyRouterType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomAsyncReplyRouterType#getClass_()
	 * @see #getCustomAsyncReplyRouterType()
	 * @generated
	 */
	EAttribute getCustomAsyncReplyRouterType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomCatchAllStrategyType <em>Custom Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Catch All Strategy Type</em>'.
	 * @see org.mule.ide.config.core.CustomCatchAllStrategyType
	 * @generated
	 */
	EClass getCustomCatchAllStrategyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomCatchAllStrategyType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomCatchAllStrategyType#getProperty()
	 * @see #getCustomCatchAllStrategyType()
	 * @generated
	 */
	EReference getCustomCatchAllStrategyType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomCatchAllStrategyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomCatchAllStrategyType#getClass_()
	 * @see #getCustomCatchAllStrategyType()
	 * @generated
	 */
	EAttribute getCustomCatchAllStrategyType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomConnectorType <em>Custom Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Connector Type</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType
	 * @generated
	 */
	EClass getCustomConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomConnectorType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getClass_()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomCorrelationAggregatorRouterType <em>Custom Correlation Aggregator Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Correlation Aggregator Router Type</em>'.
	 * @see org.mule.ide.config.core.CustomCorrelationAggregatorRouterType
	 * @generated
	 */
	EClass getCustomCorrelationAggregatorRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomCorrelationAggregatorRouterType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomCorrelationAggregatorRouterType#getClass_()
	 * @see #getCustomCorrelationAggregatorRouterType()
	 * @generated
	 */
	EAttribute getCustomCorrelationAggregatorRouterType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomEncryptionStrategyType <em>Custom Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Encryption Strategy Type</em>'.
	 * @see org.mule.ide.config.core.CustomEncryptionStrategyType
	 * @generated
	 */
	EClass getCustomEncryptionStrategyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomEncryptionStrategyType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomEncryptionStrategyType#getProperty()
	 * @see #getCustomEncryptionStrategyType()
	 * @generated
	 */
	EReference getCustomEncryptionStrategyType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomEncryptionStrategyType#getStrategyRef <em>Strategy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Ref</em>'.
	 * @see org.mule.ide.config.core.CustomEncryptionStrategyType#getStrategyRef()
	 * @see #getCustomEncryptionStrategyType()
	 * @generated
	 */
	EAttribute getCustomEncryptionStrategyType_StrategyRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomEntryPointResolverSetType <em>Custom Entry Point Resolver Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Entry Point Resolver Set Type</em>'.
	 * @see org.mule.ide.config.core.CustomEntryPointResolverSetType
	 * @generated
	 */
	EClass getCustomEntryPointResolverSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomEntryPointResolverSetType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomEntryPointResolverSetType#getProperty()
	 * @see #getCustomEntryPointResolverSetType()
	 * @generated
	 */
	EReference getCustomEntryPointResolverSetType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomEntryPointResolverSetType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomEntryPointResolverSetType#getClass_()
	 * @see #getCustomEntryPointResolverSetType()
	 * @generated
	 */
	EAttribute getCustomEntryPointResolverSetType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomEntryPointResolverType <em>Custom Entry Point Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Entry Point Resolver Type</em>'.
	 * @see org.mule.ide.config.core.CustomEntryPointResolverType
	 * @generated
	 */
	EClass getCustomEntryPointResolverType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomEntryPointResolverType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomEntryPointResolverType#getProperty()
	 * @see #getCustomEntryPointResolverType()
	 * @generated
	 */
	EReference getCustomEntryPointResolverType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomEntryPointResolverType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomEntryPointResolverType#getClass_()
	 * @see #getCustomEntryPointResolverType()
	 * @generated
	 */
	EAttribute getCustomEntryPointResolverType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomExceptionStrategyType <em>Custom Exception Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Exception Strategy Type</em>'.
	 * @see org.mule.ide.config.core.CustomExceptionStrategyType
	 * @generated
	 */
	EClass getCustomExceptionStrategyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomExceptionStrategyType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomExceptionStrategyType#getProperty()
	 * @see #getCustomExceptionStrategyType()
	 * @generated
	 */
	EReference getCustomExceptionStrategyType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomExceptionStrategyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomExceptionStrategyType#getClass_()
	 * @see #getCustomExceptionStrategyType()
	 * @generated
	 */
	EAttribute getCustomExceptionStrategyType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomFilterType <em>Custom Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Filter Type</em>'.
	 * @see org.mule.ide.config.core.CustomFilterType
	 * @generated
	 */
	EClass getCustomFilterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomFilterType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomFilterType#getProperty()
	 * @see #getCustomFilterType()
	 * @generated
	 */
	EReference getCustomFilterType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomFilterType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomFilterType#getClass_()
	 * @see #getCustomFilterType()
	 * @generated
	 */
	EAttribute getCustomFilterType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomForwardingCatchAllStrategyType <em>Custom Forwarding Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Forwarding Catch All Strategy Type</em>'.
	 * @see org.mule.ide.config.core.CustomForwardingCatchAllStrategyType
	 * @generated
	 */
	EClass getCustomForwardingCatchAllStrategyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomForwardingCatchAllStrategyType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomForwardingCatchAllStrategyType#getProperty()
	 * @see #getCustomForwardingCatchAllStrategyType()
	 * @generated
	 */
	EReference getCustomForwardingCatchAllStrategyType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomForwardingCatchAllStrategyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomForwardingCatchAllStrategyType#getClass_()
	 * @see #getCustomForwardingCatchAllStrategyType()
	 * @generated
	 */
	EAttribute getCustomForwardingCatchAllStrategyType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomInboundRouterType <em>Custom Inbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Inbound Router Type</em>'.
	 * @see org.mule.ide.config.core.CustomInboundRouterType
	 * @generated
	 */
	EClass getCustomInboundRouterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomInboundRouterType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomInboundRouterType#getProperty()
	 * @see #getCustomInboundRouterType()
	 * @generated
	 */
	EReference getCustomInboundRouterType_Property();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.CustomInboundRouterType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.CustomInboundRouterType#getAbstractInboundEndpointGroup()
	 * @see #getCustomInboundRouterType()
	 * @generated
	 */
	EAttribute getCustomInboundRouterType_AbstractInboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomInboundRouterType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.CustomInboundRouterType#getAbstractInboundEndpoint()
	 * @see #getCustomInboundRouterType()
	 * @generated
	 */
	EReference getCustomInboundRouterType_AbstractInboundEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomInboundRouterType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomInboundRouterType#getClass_()
	 * @see #getCustomInboundRouterType()
	 * @generated
	 */
	EAttribute getCustomInboundRouterType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomLifecycleAdapterFactory <em>Custom Lifecycle Adapter Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Lifecycle Adapter Factory</em>'.
	 * @see org.mule.ide.config.core.CustomLifecycleAdapterFactory
	 * @generated
	 */
	EClass getCustomLifecycleAdapterFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomLifecycleAdapterFactory#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomLifecycleAdapterFactory#getClass_()
	 * @see #getCustomLifecycleAdapterFactory()
	 * @generated
	 */
	EAttribute getCustomLifecycleAdapterFactory_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomMessageInfoMappingType <em>Custom Message Info Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Message Info Mapping Type</em>'.
	 * @see org.mule.ide.config.core.CustomMessageInfoMappingType
	 * @generated
	 */
	EClass getCustomMessageInfoMappingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomMessageInfoMappingType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomMessageInfoMappingType#getProperty()
	 * @see #getCustomMessageInfoMappingType()
	 * @generated
	 */
	EReference getCustomMessageInfoMappingType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomMessageInfoMappingType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomMessageInfoMappingType#getClass_()
	 * @see #getCustomMessageInfoMappingType()
	 * @generated
	 */
	EAttribute getCustomMessageInfoMappingType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomOutboundRouterType <em>Custom Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Outbound Router Type</em>'.
	 * @see org.mule.ide.config.core.CustomOutboundRouterType
	 * @generated
	 */
	EClass getCustomOutboundRouterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomOutboundRouterType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomOutboundRouterType#getProperty()
	 * @see #getCustomOutboundRouterType()
	 * @generated
	 */
	EReference getCustomOutboundRouterType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomOutboundRouterType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomOutboundRouterType#getClass_()
	 * @see #getCustomOutboundRouterType()
	 * @generated
	 */
	EAttribute getCustomOutboundRouterType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomSecurityProviderType <em>Custom Security Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Security Provider Type</em>'.
	 * @see org.mule.ide.config.core.CustomSecurityProviderType
	 * @generated
	 */
	EClass getCustomSecurityProviderType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomSecurityProviderType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomSecurityProviderType#getProperty()
	 * @see #getCustomSecurityProviderType()
	 * @generated
	 */
	EReference getCustomSecurityProviderType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomSecurityProviderType#getProviderRef <em>Provider Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Ref</em>'.
	 * @see org.mule.ide.config.core.CustomSecurityProviderType#getProviderRef()
	 * @see #getCustomSecurityProviderType()
	 * @generated
	 */
	EAttribute getCustomSecurityProviderType_ProviderRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomServiceType <em>Custom Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Service Type</em>'.
	 * @see org.mule.ide.config.core.CustomServiceType
	 * @generated
	 */
	EClass getCustomServiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomServiceType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomServiceType#getClass_()
	 * @see #getCustomServiceType()
	 * @generated
	 */
	EAttribute getCustomServiceType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomTransactionManagerType <em>Custom Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Transaction Manager Type</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionManagerType
	 * @generated
	 */
	EClass getCustomTransactionManagerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomTransactionManagerType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionManagerType#getProperty()
	 * @see #getCustomTransactionManagerType()
	 * @generated
	 */
	EReference getCustomTransactionManagerType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomTransactionManagerType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionManagerType#getClass_()
	 * @see #getCustomTransactionManagerType()
	 * @generated
	 */
	EAttribute getCustomTransactionManagerType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomTransactionType <em>Custom Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Transaction Type</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionType
	 * @generated
	 */
	EClass getCustomTransactionType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomTransactionType#getFactoryClass <em>Factory Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Class</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionType#getFactoryClass()
	 * @see #getCustomTransactionType()
	 * @generated
	 */
	EAttribute getCustomTransactionType_FactoryClass();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomTransactionType#getFactoryRef <em>Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Ref</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionType#getFactoryRef()
	 * @see #getCustomTransactionType()
	 * @generated
	 */
	EAttribute getCustomTransactionType_FactoryRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomTransformerType <em>Custom Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Transformer Type</em>'.
	 * @see org.mule.ide.config.core.CustomTransformerType
	 * @generated
	 */
	EClass getCustomTransformerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomTransformerType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomTransformerType#getProperty()
	 * @see #getCustomTransformerType()
	 * @generated
	 */
	EReference getCustomTransformerType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomTransformerType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomTransformerType#getClass_()
	 * @see #getCustomTransformerType()
	 * @generated
	 */
	EAttribute getCustomTransformerType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DefaultComponentType <em>Default Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Component Type</em>'.
	 * @see org.mule.ide.config.core.DefaultComponentType
	 * @generated
	 */
	EClass getDefaultComponentType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DefaultJavaComponentType <em>Default Java Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Java Component Type</em>'.
	 * @see org.mule.ide.config.core.DefaultJavaComponentType
	 * @generated
	 */
	EClass getDefaultJavaComponentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.DefaultJavaComponentType#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Object Factory Group</em>'.
	 * @see org.mule.ide.config.core.DefaultJavaComponentType#getAbstractObjectFactoryGroup()
	 * @see #getDefaultJavaComponentType()
	 * @generated
	 */
	EAttribute getDefaultJavaComponentType_AbstractObjectFactoryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DefaultJavaComponentType#getAbstractObjectFactory <em>Abstract Object Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Object Factory</em>'.
	 * @see org.mule.ide.config.core.DefaultJavaComponentType#getAbstractObjectFactory()
	 * @see #getDefaultJavaComponentType()
	 * @generated
	 */
	EReference getDefaultJavaComponentType_AbstractObjectFactory();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.DefaultJavaComponentType#getAbstractLifecycleAdapterFactoryGroup <em>Abstract Lifecycle Adapter Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Lifecycle Adapter Factory Group</em>'.
	 * @see org.mule.ide.config.core.DefaultJavaComponentType#getAbstractLifecycleAdapterFactoryGroup()
	 * @see #getDefaultJavaComponentType()
	 * @generated
	 */
	EAttribute getDefaultJavaComponentType_AbstractLifecycleAdapterFactoryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DefaultJavaComponentType#getAbstractLifecycleAdapterFactory <em>Abstract Lifecycle Adapter Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Lifecycle Adapter Factory</em>'.
	 * @see org.mule.ide.config.core.DefaultJavaComponentType#getAbstractLifecycleAdapterFactory()
	 * @see #getDefaultJavaComponentType()
	 * @generated
	 */
	EReference getDefaultJavaComponentType_AbstractLifecycleAdapterFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.DefaultJavaComponentType#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see org.mule.ide.config.core.DefaultJavaComponentType#getBinding()
	 * @see #getDefaultJavaComponentType()
	 * @generated
	 */
	EReference getDefaultJavaComponentType_Binding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DefaultJavaComponentType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.DefaultJavaComponentType#getClass_()
	 * @see #getDefaultJavaComponentType()
	 * @generated
	 */
	EAttribute getDefaultJavaComponentType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DefaultModelType <em>Default Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Model Type</em>'.
	 * @see org.mule.ide.config.core.DefaultModelType
	 * @generated
	 */
	EClass getDefaultModelType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DefineNotificationType <em>Define Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Notification Type</em>'.
	 * @see org.mule.ide.config.core.DefineNotificationType
	 * @generated
	 */
	EClass getDefineNotificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DefineNotificationType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.mule.ide.config.core.DefineNotificationType#getEvent()
	 * @see #getDefineNotificationType()
	 * @generated
	 */
	EAttribute getDefineNotificationType_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DefineNotificationType#getEventClass <em>Event Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Class</em>'.
	 * @see org.mule.ide.config.core.DefineNotificationType#getEventClass()
	 * @see #getDefineNotificationType()
	 * @generated
	 */
	EAttribute getDefineNotificationType_EventClass();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DefineNotificationType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.mule.ide.config.core.DefineNotificationType#getInterface()
	 * @see #getDefineNotificationType()
	 * @generated
	 */
	EAttribute getDefineNotificationType_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DefineNotificationType#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Class</em>'.
	 * @see org.mule.ide.config.core.DefineNotificationType#getInterfaceClass()
	 * @see #getDefineNotificationType()
	 * @generated
	 */
	EAttribute getDefineNotificationType_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.mule.ide.config.core.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DescriptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mule.ide.config.core.DescriptionType#getValue()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Value();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DisableNotificationType <em>Disable Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disable Notification Type</em>'.
	 * @see org.mule.ide.config.core.DisableNotificationType
	 * @generated
	 */
	EClass getDisableNotificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DisableNotificationType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.mule.ide.config.core.DisableNotificationType#getEvent()
	 * @see #getDisableNotificationType()
	 * @generated
	 */
	EAttribute getDisableNotificationType_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DisableNotificationType#getEventClass <em>Event Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Class</em>'.
	 * @see org.mule.ide.config.core.DisableNotificationType#getEventClass()
	 * @see #getDisableNotificationType()
	 * @generated
	 */
	EAttribute getDisableNotificationType_EventClass();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DisableNotificationType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.mule.ide.config.core.DisableNotificationType#getInterface()
	 * @see #getDisableNotificationType()
	 * @generated
	 */
	EAttribute getDisableNotificationType_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.DisableNotificationType#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Class</em>'.
	 * @see org.mule.ide.config.core.DisableNotificationType#getInterfaceClass()
	 * @see #getDisableNotificationType()
	 * @generated
	 */
	EAttribute getDisableNotificationType_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.core.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.core.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractAsyncReplyRouter <em>Abstract Async Reply Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Async Reply Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractAsyncReplyRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractAsyncReplyRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractCatchAllStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractCatchAllStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Component Threading Profile</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractComponentThreadingProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractComponentThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Connector</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entry Point Resolver Set</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractEntryPointResolverSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractEntryPointResolverSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractExceptionStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractExceptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractExtension <em>Abstract Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Extension</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractExtension();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractGlobalEndpoint <em>Abstract Global Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Global Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractGlobalEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractGlobalEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractInboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractInboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractInboundRouter <em>Abstract Inbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Inbound Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractInboundRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractInboundRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractLifecycleAdapterFactory <em>Abstract Lifecycle Adapter Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Lifecycle Adapter Factory</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractLifecycleAdapterFactory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractLifecycleAdapterFactory();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractMessageInfoMapping <em>Abstract Message Info Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Message Info Mapping</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractMessageInfoMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractMessageInfoMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractModel <em>Abstract Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Model</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractObjectFactory <em>Abstract Object Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Object Factory</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractObjectFactory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractObjectFactory();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractOutboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractOutboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractOutboundRouter <em>Abstract Outbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Outbound Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractOutboundRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractOutboundRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Pooling Profile</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractPoolingProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractPoolingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractQueueProfile <em>Abstract Queue Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Queue Profile</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractQueueProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractQueueProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractSecurityFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractSecurityManager <em>Abstract Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Security Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractSecurityManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractSecurityManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractService <em>Abstract Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Service</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractService();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAndFilter <em>And Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAndFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AndFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAppendStringTransformer <em>Append String Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Append String Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAppendStringTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AppendStringTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getArrayEntryPointResolver <em>Array Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getArrayEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ArrayEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getBase64DecoderTransformer <em>Base64 Decoder Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64 Decoder Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getBase64DecoderTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Base64DecoderTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getBase64EncoderTransformer <em>Base64 Encoder Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64 Encoder Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getBase64EncoderTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Base64EncoderTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getBridgeComponent <em>Bridge Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bridge Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getBridgeComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BridgeComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToHexStringTransformer <em>Byte Array To Hex String Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Byte Array To Hex String Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getByteArrayToHexStringTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ByteArrayToHexStringTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToObjectTransformer <em>Byte Array To Object Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Byte Array To Object Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getByteArrayToObjectTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ByteArrayToObjectTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToSerializableTransformer <em>Byte Array To Serializable Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Byte Array To Serializable Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getByteArrayToSerializableTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ByteArrayToSerializableTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToStringTransformer <em>Byte Array To String Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Byte Array To String Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getByteArrayToStringTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ByteArrayToStringTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCallableEntryPointResolver <em>Callable Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Callable Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCallableEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CallableEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getChainingRouter <em>Chaining Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chaining Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getChainingRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChainingRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCollectionAsyncReplyRouter <em>Collection Async Reply Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Async Reply Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCollectionAsyncReplyRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CollectionAsyncReplyRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Component();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getComponentThreadingProfile <em>Component Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Threading Profile</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getComponentThreadingProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCorrelationResequencerRouter <em>Correlation Resequencer Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Resequencer Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCorrelationResequencerRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationResequencerRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomAsyncReplyRouter <em>Custom Async Reply Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Async Reply Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomAsyncReplyRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomAsyncReplyRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomCatchAllStrategy <em>Custom Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomCatchAllStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomCatchAllStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomConnector <em>Custom Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Connector</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomCorrelationAggregatorRouter <em>Custom Correlation Aggregator Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Correlation Aggregator Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomCorrelationAggregatorRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomCorrelationAggregatorRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolver <em>Custom Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolverSet <em>Custom Entry Point Resolver Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Entry Point Resolver Set</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolverSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomEntryPointResolverSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomExceptionStrategy <em>Custom Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomExceptionStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomExceptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomFilter <em>Custom Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomForwardingCatchAllStrategy <em>Custom Forwarding Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Forwarding Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomForwardingCatchAllStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomForwardingCatchAllStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomInboundRouter <em>Custom Inbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Inbound Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomInboundRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomInboundRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomLifecycleAdapterFactory <em>Custom Lifecycle Adapter Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Lifecycle Adapter Factory</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomLifecycleAdapterFactory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomLifecycleAdapterFactory();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomMessageInfoMapping <em>Custom Message Info Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Message Info Mapping</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomMessageInfoMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomMessageInfoMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomOutboundRouter <em>Custom Outbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Outbound Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomOutboundRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomOutboundRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomService <em>Custom Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Service</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomService();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransaction <em>Custom Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Transaction</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransactionManager <em>Custom Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransformer <em>Custom Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getDecryptTransformer <em>Decrypt Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decrypt Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getDecryptTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DecryptTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getDefaultConnectorExceptionStrategy <em>Default Connector Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Connector Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getDefaultConnectorExceptionStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DefaultConnectorExceptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getDefaultServiceExceptionStrategy <em>Default Service Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Service Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getDefaultServiceExceptionStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DefaultServiceExceptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getEchoComponent <em>Echo Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Echo Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getEchoComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EchoComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getEncryptionSecurityFilter <em>Encryption Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encryption Security Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getEncryptionSecurityFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptionSecurityFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getEncryptTransformer <em>Encrypt Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypt Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getEncryptTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EncryptTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getEndpointSelectorRouter <em>Endpoint Selector Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Selector Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getEndpointSelectorRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndpointSelectorRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getEntryPointResolverSet <em>Entry Point Resolver Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Point Resolver Set</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getEntryPointResolverSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntryPointResolverSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getExceptionBasedRouter <em>Exception Based Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Based Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getExceptionBasedRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExceptionBasedRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getExceptionTypeFilter <em>Exception Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getExceptionTypeFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExceptionTypeFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getExpressionFilter <em>Expression Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getExpressionFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExpressionFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getExpressionMessageInfoMapping <em>Expression Message Info Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Message Info Mapping</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getExpressionMessageInfoMapping()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExpressionMessageInfoMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getExpressionTransformer <em>Expression Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getExpressionTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExpressionTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getFilteringRouter <em>Filtering Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filtering Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getFilteringRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilteringRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getForwardingCatchAllStrategy <em>Forwarding Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forwarding Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getForwardingCatchAllStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ForwardingCatchAllStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getForwardingRouter <em>Forwarding Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forwarding Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getForwardingRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ForwardingRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getGzipCompressTransformer <em>Gzip Compress Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gzip Compress Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getGzipCompressTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GzipCompressTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getGzipUncompressTransformer <em>Gzip Uncompress Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gzip Uncompress Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getGzipUncompressTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GzipUncompressTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getHexStringToByteArrayTransformer <em>Hex String To Byte Array Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hex String To Byte Array Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getHexStringToByteArrayTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HexStringToByteArrayTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getIdempotentReceiverRouter <em>Idempotent Receiver Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Idempotent Receiver Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getIdempotentReceiverRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IdempotentReceiverRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getIdempotentSecureHashReceiverRouter <em>Idempotent Secure Hash Receiver Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Idempotent Secure Hash Receiver Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getIdempotentSecureHashReceiverRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IdempotentSecureHashReceiverRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getInboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getInboundPassThroughRouter <em>Inbound Pass Through Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound Pass Through Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getInboundPassThroughRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InboundPassThroughRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getIncludeEntryPoint <em>Include Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include Entry Point</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getIncludeEntryPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IncludeEntryPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getJbossTransactionManager <em>Jboss Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jboss Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getJbossTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JbossTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getJndiTransactionManager <em>Jndi Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jndi Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getJndiTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JndiTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getJrunTransactionManager <em>Jrun Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jrun Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getJrunTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JrunTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getLegacyEntryPointResolverSet <em>Legacy Entry Point Resolver Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Entry Point Resolver Set</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getLegacyEntryPointResolverSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LegacyEntryPointResolverSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getListMessageSplitterRouter <em>List Message Splitter Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Message Splitter Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getListMessageSplitterRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListMessageSplitterRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getLogComponent <em>Log Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getLogComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LogComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getLoggingCatchAllStrategy <em>Logging Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logging Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getLoggingCatchAllStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoggingCatchAllStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingAggregatorRouter <em>Message Chunking Aggregator Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Chunking Aggregator Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMessageChunkingAggregatorRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageChunkingAggregatorRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingRouter <em>Message Chunking Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Chunking Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMessageChunkingRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageChunkingRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertiesTransformer <em>Message Properties Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Properties Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMessagePropertiesTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessagePropertiesTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyFilter <em>Message Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Property Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMessagePropertyFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessagePropertyFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMethodEntryPointResolver <em>Method Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMethodEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MethodEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Model();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMule <em>Mule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mule</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mule();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMulticastingRouter <em>Multicasting Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multicasting Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMulticastingRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MulticastingRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getNoActionTransformer <em>No Action Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Action Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getNoActionTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NoActionTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getNoArgumentsEntryPointResolver <em>No Arguments Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Arguments Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getNoArgumentsEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NoArgumentsEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getNotFilter <em>Not Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getNotFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NotFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getNullComponent <em>Null Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getNullComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NullComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getObjectToByteArrayTransformer <em>Object To Byte Array Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object To Byte Array Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getObjectToByteArrayTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectToByteArrayTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getObjectToStringTransformer <em>Object To String Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object To String Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getObjectToStringTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectToStringTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getOrFilter <em>Or Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getOrFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getOutboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OutboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getOutboundPassThroughRouter <em>Outbound Pass Through Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outbound Pass Through Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getOutboundPassThroughRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OutboundPassThroughRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPayloadTypeFilter <em>Payload Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Type Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPayloadTypeFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PayloadTypeFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPooledComponent <em>Pooled Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pooled Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPooledComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PooledComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPoolingProfile <em>Pooling Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pooling Profile</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPoolingProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PoolingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPropertyEntryPointResolver <em>Property Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPropertyEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPrototypeObject <em>Prototype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prototype Object</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPrototypeObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrototypeObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getQueueProfile <em>Queue Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queue Profile</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getQueueProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_QueueProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getReflectionEntryPointResolver <em>Reflection Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reflection Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getReflectionEntryPointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReflectionEntryPointResolver();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getRegexFilter <em>Regex Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regex Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getRegexFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegexFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getResinTransactionManager <em>Resin Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resin Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getResinTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResinTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSecurityManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SecurityManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSedaModel <em>Seda Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seda Model</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSedaModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SedaModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSelectiveConsumerRouter <em>Selective Consumer Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selective Consumer Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSelectiveConsumerRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SelectiveConsumerRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSerializableToByteArrayTransformer <em>Serializable To Byte Array Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serializable To Byte Array Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSerializableToByteArrayTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SerializableToByteArrayTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Service();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSingleAsyncReplyRouter <em>Single Async Reply Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Async Reply Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSingleAsyncReplyRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SingleAsyncReplyRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSingletonObject <em>Singleton Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Singleton Object</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSingletonObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SingletonObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSpringObject <em>Spring Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spring Object</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSpringObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpringObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getStaticRecipientListRouter <em>Static Recipient List Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Recipient List Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getStaticRecipientListRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StaticRecipientListRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getStringToByteArrayTransformer <em>String To Byte Array Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String To Byte Array Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getStringToByteArrayTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringToByteArrayTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTemplateEndpointRouter <em>Template Endpoint Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Endpoint Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTemplateEndpointRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TemplateEndpointRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getWeblogicTransactionManager <em>Weblogic Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weblogic Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getWeblogicTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WeblogicTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getWebsphereTransactionManager <em>Websphere Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Websphere Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getWebsphereTransactionManager()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebsphereTransactionManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getWildcardFilter <em>Wildcard Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wildcard Filter</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getWildcardFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WildcardFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getWireTapRouter <em>Wire Tap Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wire Tap Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getWireTapRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WireTapRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getXmlEntityDecoderTransformer <em>Xml Entity Decoder Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Entity Decoder Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getXmlEntityDecoderTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XmlEntityDecoderTransformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getXmlEntityEncoderTransformer <em>Xml Entity Encoder Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Entity Encoder Transformer</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getXmlEntityEncoderTransformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XmlEntityEncoderTransformer();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.EncryptionSecurityFilterType <em>Encryption Security Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryption Security Filter Type</em>'.
	 * @see org.mule.ide.config.core.EncryptionSecurityFilterType
	 * @generated
	 */
	EClass getEncryptionSecurityFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.EncryptionSecurityFilterType#getStrategyRef <em>Strategy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Ref</em>'.
	 * @see org.mule.ide.config.core.EncryptionSecurityFilterType#getStrategyRef()
	 * @see #getEncryptionSecurityFilterType()
	 * @generated
	 */
	EAttribute getEncryptionSecurityFilterType_StrategyRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.EncryptionStrategyType <em>Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryption Strategy Type</em>'.
	 * @see org.mule.ide.config.core.EncryptionStrategyType
	 * @generated
	 */
	EClass getEncryptionStrategyType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.EncryptionStrategyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.EncryptionStrategyType#getName()
	 * @see #getEncryptionStrategyType()
	 * @generated
	 */
	EAttribute getEncryptionStrategyType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.EncryptionTransformerType <em>Encryption Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryption Transformer Type</em>'.
	 * @see org.mule.ide.config.core.EncryptionTransformerType
	 * @generated
	 */
	EClass getEncryptionTransformerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.EncryptionTransformerType#getStrategyRef <em>Strategy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Ref</em>'.
	 * @see org.mule.ide.config.core.EncryptionTransformerType#getStrategyRef()
	 * @see #getEncryptionTransformerType()
	 * @generated
	 */
	EAttribute getEncryptionTransformerType_StrategyRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.EndpointExceptionStrategyType <em>Endpoint Exception Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Exception Strategy Type</em>'.
	 * @see org.mule.ide.config.core.EndpointExceptionStrategyType
	 * @generated
	 */
	EClass getEndpointExceptionStrategyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.EndpointExceptionStrategyType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.EndpointExceptionStrategyType#getAbstractOutboundEndpointGroup()
	 * @see #getEndpointExceptionStrategyType()
	 * @generated
	 */
	EAttribute getEndpointExceptionStrategyType_AbstractOutboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.EndpointExceptionStrategyType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.EndpointExceptionStrategyType#getAbstractOutboundEndpoint()
	 * @see #getEndpointExceptionStrategyType()
	 * @generated
	 */
	EReference getEndpointExceptionStrategyType_AbstractOutboundEndpoint();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.EndpointSelectorRouterType <em>Endpoint Selector Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Selector Router Type</em>'.
	 * @see org.mule.ide.config.core.EndpointSelectorRouterType
	 * @generated
	 */
	EClass getEndpointSelectorRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.EndpointSelectorRouterType#getSelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector Expression</em>'.
	 * @see org.mule.ide.config.core.EndpointSelectorRouterType#getSelectorExpression()
	 * @see #getEndpointSelectorRouterType()
	 * @generated
	 */
	EAttribute getEndpointSelectorRouterType_SelectorExpression();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ExceptionPatternType <em>Exception Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Pattern Type</em>'.
	 * @see org.mule.ide.config.core.ExceptionPatternType
	 * @generated
	 */
	EClass getExceptionPatternType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ExceptionPatternType#getExceptionPattern <em>Exception Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Pattern</em>'.
	 * @see org.mule.ide.config.core.ExceptionPatternType#getExceptionPattern()
	 * @see #getExceptionPatternType()
	 * @generated
	 */
	EAttribute getExceptionPatternType_ExceptionPattern();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ExpressionFilterType <em>Expression Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Filter Type</em>'.
	 * @see org.mule.ide.config.core.ExpressionFilterType
	 * @generated
	 */
	EClass getExpressionFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ExpressionFilterType#getCustomEvaluator <em>Custom Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Evaluator</em>'.
	 * @see org.mule.ide.config.core.ExpressionFilterType#getCustomEvaluator()
	 * @see #getExpressionFilterType()
	 * @generated
	 */
	EAttribute getExpressionFilterType_CustomEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ExpressionFilterType#getEvaluator <em>Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluator</em>'.
	 * @see org.mule.ide.config.core.ExpressionFilterType#getEvaluator()
	 * @see #getExpressionFilterType()
	 * @generated
	 */
	EAttribute getExpressionFilterType_Evaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ExpressionFilterType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.mule.ide.config.core.ExpressionFilterType#getExpression()
	 * @see #getExpressionFilterType()
	 * @generated
	 */
	EAttribute getExpressionFilterType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ExpressionFilterType#isNullReturnsTrue <em>Null Returns True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Returns True</em>'.
	 * @see org.mule.ide.config.core.ExpressionFilterType#isNullReturnsTrue()
	 * @see #getExpressionFilterType()
	 * @generated
	 */
	EAttribute getExpressionFilterType_NullReturnsTrue();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ExpressionMessageInfoMappingType <em>Expression Message Info Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Message Info Mapping Type</em>'.
	 * @see org.mule.ide.config.core.ExpressionMessageInfoMappingType
	 * @generated
	 */
	EClass getExpressionMessageInfoMappingType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ExpressionMessageInfoMappingType#getCorrelationIdExpression <em>Correlation Id Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Id Expression</em>'.
	 * @see org.mule.ide.config.core.ExpressionMessageInfoMappingType#getCorrelationIdExpression()
	 * @see #getExpressionMessageInfoMappingType()
	 * @generated
	 */
	EAttribute getExpressionMessageInfoMappingType_CorrelationIdExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ExpressionMessageInfoMappingType#getMessageIdExpression <em>Message Id Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id Expression</em>'.
	 * @see org.mule.ide.config.core.ExpressionMessageInfoMappingType#getMessageIdExpression()
	 * @see #getExpressionMessageInfoMappingType()
	 * @generated
	 */
	EAttribute getExpressionMessageInfoMappingType_MessageIdExpression();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ExpressionTransformerType <em>Expression Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Transformer Type</em>'.
	 * @see org.mule.ide.config.core.ExpressionTransformerType
	 * @generated
	 */
	EClass getExpressionTransformerType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ExpressionTransformerType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.core.ExpressionTransformerType#getGroup()
	 * @see #getExpressionTransformerType()
	 * @generated
	 */
	EAttribute getExpressionTransformerType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ExpressionTransformerType#getReturnArgument <em>Return Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Argument</em>'.
	 * @see org.mule.ide.config.core.ExpressionTransformerType#getReturnArgument()
	 * @see #getExpressionTransformerType()
	 * @generated
	 */
	EReference getExpressionTransformerType_ReturnArgument();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ExtensibleEntryPointResolverSet <em>Extensible Entry Point Resolver Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensible Entry Point Resolver Set</em>'.
	 * @see org.mule.ide.config.core.ExtensibleEntryPointResolverSet
	 * @generated
	 */
	EClass getExtensibleEntryPointResolverSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ExtensibleEntryPointResolverSet#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Entry Point Resolver Group</em>'.
	 * @see org.mule.ide.config.core.ExtensibleEntryPointResolverSet#getAbstractEntryPointResolverGroup()
	 * @see #getExtensibleEntryPointResolverSet()
	 * @generated
	 */
	EAttribute getExtensibleEntryPointResolverSet_AbstractEntryPointResolverGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ExtensibleEntryPointResolverSet#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Entry Point Resolver</em>'.
	 * @see org.mule.ide.config.core.ExtensibleEntryPointResolverSet#getAbstractEntryPointResolver()
	 * @see #getExtensibleEntryPointResolverSet()
	 * @generated
	 */
	EReference getExtensibleEntryPointResolverSet_AbstractEntryPointResolver();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.FilteredInboundRouterType <em>Filtered Inbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtered Inbound Router Type</em>'.
	 * @see org.mule.ide.config.core.FilteredInboundRouterType
	 * @generated
	 */
	EClass getFilteredInboundRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.FilteredInboundRouterType#getAbstractFilterGroup()
	 * @see #getFilteredInboundRouterType()
	 * @generated
	 */
	EAttribute getFilteredInboundRouterType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.FilteredInboundRouterType#getAbstractFilter()
	 * @see #getFilteredInboundRouterType()
	 * @generated
	 */
	EReference getFilteredInboundRouterType_AbstractFilter();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.FilteringOutboundRouterType <em>Filtering Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering Outbound Router Type</em>'.
	 * @see org.mule.ide.config.core.FilteringOutboundRouterType
	 * @generated
	 */
	EClass getFilteringOutboundRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractFilterGroup()
	 * @see #getFilteringOutboundRouterType()
	 * @generated
	 */
	EAttribute getFilteringOutboundRouterType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractFilter()
	 * @see #getFilteringOutboundRouterType()
	 * @generated
	 */
	EReference getFilteringOutboundRouterType_AbstractFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractTransformerGroup()
	 * @see #getFilteringOutboundRouterType()
	 * @generated
	 */
	EAttribute getFilteringOutboundRouterType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.FilteringOutboundRouterType#getAbstractTransformer()
	 * @see #getFilteringOutboundRouterType()
	 * @generated
	 */
	EReference getFilteringOutboundRouterType_AbstractTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.FilteringOutboundRouterType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.FilteringOutboundRouterType#getTransformerRefs()
	 * @see #getFilteringOutboundRouterType()
	 * @generated
	 */
	EAttribute getFilteringOutboundRouterType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ForwardingCatchAllStrategyType <em>Forwarding Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forwarding Catch All Strategy Type</em>'.
	 * @see org.mule.ide.config.core.ForwardingCatchAllStrategyType
	 * @generated
	 */
	EClass getForwardingCatchAllStrategyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ForwardingCatchAllStrategyType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.ForwardingCatchAllStrategyType#getAbstractOutboundEndpointGroup()
	 * @see #getForwardingCatchAllStrategyType()
	 * @generated
	 */
	EAttribute getForwardingCatchAllStrategyType_AbstractOutboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ForwardingCatchAllStrategyType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.ForwardingCatchAllStrategyType#getAbstractOutboundEndpoint()
	 * @see #getForwardingCatchAllStrategyType()
	 * @generated
	 */
	EReference getForwardingCatchAllStrategyType_AbstractOutboundEndpoint();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.GenericObjectFactoryType <em>Generic Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Object Factory Type</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType
	 * @generated
	 */
	EClass getGenericObjectFactoryType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Object Factory Group</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getAbstractObjectFactoryGroup()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EAttribute getGenericObjectFactoryType_AbstractObjectFactoryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractObjectFactory <em>Abstract Object Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Object Factory</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getAbstractObjectFactory()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EReference getGenericObjectFactoryType_AbstractObjectFactory();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType
	 * @generated
	 */
	EClass getGlobalEndpointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GlobalEndpointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractTransformerGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractTransformer()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getTransformers()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Transformers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getResponseTransformers <em>Response Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Transformers</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getResponseTransformers()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_ResponseTransformers();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractTransactionGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractTransaction()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractFilterGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractFilter()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Filter Group</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractSecurityFilterGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractSecurityFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractSecurityFilter()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getProperty()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getProperties()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAddress()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getConnectorRef <em>Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Ref</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getConnectorRef()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_ConnectorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getEncoding()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getRef()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#isRemoteSync()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_RemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync Timeout</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getRemoteSyncTimeout()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_RemoteSyncTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getResponseTransformerRefs()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_ResponseTransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#isSynchronous()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getTransformerRefs()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.GlobalPropertyType <em>Global Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Property Type</em>'.
	 * @see org.mule.ide.config.core.GlobalPropertyType
	 * @generated
	 */
	EClass getGlobalPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalPropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.GlobalPropertyType#getName()
	 * @see #getGlobalPropertyType()
	 * @generated
	 */
	EAttribute getGlobalPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalPropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mule.ide.config.core.GlobalPropertyType#getValue()
	 * @see #getGlobalPropertyType()
	 * @generated
	 */
	EAttribute getGlobalPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.InboundCollectionType <em>Inbound Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Collection Type</em>'.
	 * @see org.mule.ide.config.core.InboundCollectionType
	 * @generated
	 */
	EClass getInboundCollectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundCollectionType#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Catch All Strategy Group</em>'.
	 * @see org.mule.ide.config.core.InboundCollectionType#getAbstractCatchAllStrategyGroup()
	 * @see #getInboundCollectionType()
	 * @generated
	 */
	EAttribute getInboundCollectionType_AbstractCatchAllStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.InboundCollectionType#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.InboundCollectionType#getAbstractCatchAllStrategy()
	 * @see #getInboundCollectionType()
	 * @generated
	 */
	EReference getInboundCollectionType_AbstractCatchAllStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundCollectionType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.InboundCollectionType#getAbstractInboundEndpointGroup()
	 * @see #getInboundCollectionType()
	 * @generated
	 */
	EAttribute getInboundCollectionType_AbstractInboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundCollectionType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.InboundCollectionType#getAbstractInboundEndpoint()
	 * @see #getInboundCollectionType()
	 * @generated
	 */
	EReference getInboundCollectionType_AbstractInboundEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundCollectionType#getAbstractInboundRouterGroup <em>Abstract Inbound Router Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Router Group</em>'.
	 * @see org.mule.ide.config.core.InboundCollectionType#getAbstractInboundRouterGroup()
	 * @see #getInboundCollectionType()
	 * @generated
	 */
	EAttribute getInboundCollectionType_AbstractInboundRouterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundCollectionType#getAbstractInboundRouter <em>Abstract Inbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Router</em>'.
	 * @see org.mule.ide.config.core.InboundCollectionType#getAbstractInboundRouter()
	 * @see #getInboundCollectionType()
	 * @generated
	 */
	EReference getInboundCollectionType_AbstractInboundRouter();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType
	 * @generated
	 */
	EClass getInboundEndpointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundEndpointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractTransformerGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractTransformer()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getTransformers()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Transformers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getResponseTransformers <em>Response Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Transformers</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getResponseTransformers()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_ResponseTransformers();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractTransactionGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractTransaction()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractFilterGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractFilter()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Filter Group</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractSecurityFilterGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractSecurityFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractSecurityFilter()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getProperty()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getProperties()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAddress()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getConnectorRef <em>Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Ref</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getConnectorRef()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_ConnectorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getEncoding()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getRef()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#isRemoteSync <em>Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#isRemoteSync()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_RemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync Timeout</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getRemoteSyncTimeout()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_RemoteSyncTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getResponseTransformerRefs()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_ResponseTransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#isSynchronous()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getTransformerRefs()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.JndiConnectorType <em>Jndi Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jndi Connector Type</em>'.
	 * @see org.mule.ide.config.core.JndiConnectorType
	 * @generated
	 */
	EClass getJndiConnectorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.JndiConnectorType#getJndiProviderProperty <em>Jndi Provider Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jndi Provider Property</em>'.
	 * @see org.mule.ide.config.core.JndiConnectorType#getJndiProviderProperty()
	 * @see #getJndiConnectorType()
	 * @generated
	 */
	EReference getJndiConnectorType_JndiProviderProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.JndiConnectorType#getJndiProviderProperties <em>Jndi Provider Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jndi Provider Properties</em>'.
	 * @see org.mule.ide.config.core.JndiConnectorType#getJndiProviderProperties()
	 * @see #getJndiConnectorType()
	 * @generated
	 */
	EReference getJndiConnectorType_JndiProviderProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.JndiConnectorType#getJndiContextRef <em>Jndi Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Context Ref</em>'.
	 * @see org.mule.ide.config.core.JndiConnectorType#getJndiContextRef()
	 * @see #getJndiConnectorType()
	 * @generated
	 */
	EAttribute getJndiConnectorType_JndiContextRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.JndiConnectorType#getJndiInitialFactory <em>Jndi Initial Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Initial Factory</em>'.
	 * @see org.mule.ide.config.core.JndiConnectorType#getJndiInitialFactory()
	 * @see #getJndiConnectorType()
	 * @generated
	 */
	EAttribute getJndiConnectorType_JndiInitialFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.JndiConnectorType#getJndiProviderUrl <em>Jndi Provider Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Provider Url</em>'.
	 * @see org.mule.ide.config.core.JndiConnectorType#getJndiProviderUrl()
	 * @see #getJndiConnectorType()
	 * @generated
	 */
	EAttribute getJndiConnectorType_JndiProviderUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.JndiConnectorType#getJndiUrlPkgPrefixes <em>Jndi Url Pkg Prefixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Url Pkg Prefixes</em>'.
	 * @see org.mule.ide.config.core.JndiConnectorType#getJndiUrlPkgPrefixes()
	 * @see #getJndiConnectorType()
	 * @generated
	 */
	EAttribute getJndiConnectorType_JndiUrlPkgPrefixes();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.JndiTransactionManagerType <em>Jndi Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jndi Transaction Manager Type</em>'.
	 * @see org.mule.ide.config.core.JndiTransactionManagerType
	 * @generated
	 */
	EClass getJndiTransactionManagerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.JndiTransactionManagerType#getJndiName <em>Jndi Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Name</em>'.
	 * @see org.mule.ide.config.core.JndiTransactionManagerType#getJndiName()
	 * @see #getJndiTransactionManagerType()
	 * @generated
	 */
	EAttribute getJndiTransactionManagerType_JndiName();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.JndiTransactionManagerType1 <em>Jndi Transaction Manager Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jndi Transaction Manager Type1</em>'.
	 * @see org.mule.ide.config.core.JndiTransactionManagerType1
	 * @generated
	 */
	EClass getJndiTransactionManagerType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.JndiTransactionManagerType1#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see org.mule.ide.config.core.JndiTransactionManagerType1#getEnvironment()
	 * @see #getJndiTransactionManagerType1()
	 * @generated
	 */
	EReference getJndiTransactionManagerType1_Environment();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Type</em>'.
	 * @see org.mule.ide.config.core.KeyType
	 * @generated
	 */
	EClass getKeyType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.KeyType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.mule.ide.config.core.KeyType#getKey()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_Key();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.KeyValueType <em>Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Type</em>'.
	 * @see org.mule.ide.config.core.KeyValueType
	 * @generated
	 */
	EClass getKeyValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.KeyValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mule.ide.config.core.KeyValueType#getValue()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EAttribute getKeyValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.KeyValueType#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Ref</em>'.
	 * @see org.mule.ide.config.core.KeyValueType#getValueRef()
	 * @see #getKeyValueType()
	 * @generated
	 */
	EAttribute getKeyValueType_ValueRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ListOrSetType <em>List Or Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Or Set Type</em>'.
	 * @see org.mule.ide.config.core.ListOrSetType
	 * @generated
	 */
	EClass getListOrSetType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.LoggingCatchAllStrategyType <em>Logging Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logging Catch All Strategy Type</em>'.
	 * @see org.mule.ide.config.core.LoggingCatchAllStrategyType
	 * @generated
	 */
	EClass getLoggingCatchAllStrategyType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see org.mule.ide.config.core.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MessageChunkingAggregatorRouterType <em>Message Chunking Aggregator Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Chunking Aggregator Router Type</em>'.
	 * @see org.mule.ide.config.core.MessageChunkingAggregatorRouterType
	 * @generated
	 */
	EClass getMessageChunkingAggregatorRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MessageChunkingAggregatorRouterType#getCorrelationExpression <em>Correlation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Expression</em>'.
	 * @see org.mule.ide.config.core.MessageChunkingAggregatorRouterType#getCorrelationExpression()
	 * @see #getMessageChunkingAggregatorRouterType()
	 * @generated
	 */
	EAttribute getMessageChunkingAggregatorRouterType_CorrelationExpression();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MessagePropertiesTransformerType <em>Message Properties Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Properties Transformer Type</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType
	 * @generated
	 */
	EClass getMessagePropertiesTransformerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getDeleteMessageProperty <em>Delete Message Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Message Property</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType#getDeleteMessageProperty()
	 * @see #getMessagePropertiesTransformerType()
	 * @generated
	 */
	EReference getMessagePropertiesTransformerType_DeleteMessageProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddMessageProperty <em>Add Message Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Message Property</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType#getAddMessageProperty()
	 * @see #getMessagePropertiesTransformerType()
	 * @generated
	 */
	EReference getMessagePropertiesTransformerType_AddMessageProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddMessageProperties <em>Add Message Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Message Properties</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType#getAddMessageProperties()
	 * @see #getMessagePropertiesTransformerType()
	 * @generated
	 */
	EReference getMessagePropertiesTransformerType_AddMessageProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#isOverwrite <em>Overwrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overwrite</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType#isOverwrite()
	 * @see #getMessagePropertiesTransformerType()
	 * @generated
	 */
	EAttribute getMessagePropertiesTransformerType_Overwrite();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MessageSplitterOutboundRouterType <em>Message Splitter Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Splitter Outbound Router Type</em>'.
	 * @see org.mule.ide.config.core.MessageSplitterOutboundRouterType
	 * @generated
	 */
	EClass getMessageSplitterOutboundRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MessageSplitterOutboundRouterType#isHonorSynchronicity <em>Honor Synchronicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honor Synchronicity</em>'.
	 * @see org.mule.ide.config.core.MessageSplitterOutboundRouterType#isHonorSynchronicity()
	 * @see #getMessageSplitterOutboundRouterType()
	 * @generated
	 */
	EAttribute getMessageSplitterOutboundRouterType_HonorSynchronicity();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MethodEntryPointResolverType <em>Method Entry Point Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Entry Point Resolver Type</em>'.
	 * @see org.mule.ide.config.core.MethodEntryPointResolverType
	 * @generated
	 */
	EClass getMethodEntryPointResolverType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MethodEntryPointResolverType#getIncludeEntryPoint <em>Include Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Entry Point</em>'.
	 * @see org.mule.ide.config.core.MethodEntryPointResolverType#getIncludeEntryPoint()
	 * @see #getMethodEntryPointResolverType()
	 * @generated
	 */
	EReference getMethodEntryPointResolverType_IncludeEntryPoint();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.mule.ide.config.core.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MethodType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.mule.ide.config.core.MethodType#getMethod()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Method();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MuleType <em>Mule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mule Type</em>'.
	 * @see org.mule.ide.config.core.MuleType
	 * @generated
	 */
	EClass getMuleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see org.mule.ide.config.core.MuleType#getConfiguration()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifications</em>'.
	 * @see org.mule.ide.config.core.MuleType#getNotifications()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_Notifications();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.mule.ide.config.core.MuleType#getDescription()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractExtensionGroup <em>Abstract Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Extension Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractExtensionGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractExtensionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractExtension <em>Abstract Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Extension</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractExtension()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractExtension();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractSecurityManagerGroup <em>Abstract Security Manager Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Manager Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractSecurityManagerGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractSecurityManagerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractSecurityManager <em>Abstract Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Manager</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractSecurityManager()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractSecurityManager();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractTransactionManagerGroup <em>Abstract Transaction Manager Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Manager Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractTransactionManagerGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractTransactionManagerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractTransactionManager()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractTransactionManager();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractConnectorGroup <em>Abstract Connector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Connector Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractConnectorGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractConnectorGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Connector</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractConnector()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractConnector();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractGlobalEndpointGroup <em>Abstract Global Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Global Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractGlobalEndpointGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractGlobalEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractGlobalEndpoint <em>Abstract Global Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Global Endpoint</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractGlobalEndpoint()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractGlobalEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractTransformerGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractTransformer()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractTransformer();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractFilterGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractFilter()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractModelGroup <em>Abstract Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Model Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractModelGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractModelGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractModel <em>Abstract Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Model</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractModel()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beans</em>'.
	 * @see org.mule.ide.config.core.MuleType#getBeans()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_Beans();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean</em>'.
	 * @see org.mule.ide.config.core.MuleType#getBean()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_Bean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getGlobalProperty <em>Global Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Property</em>'.
	 * @see org.mule.ide.config.core.MuleType#getGlobalProperty()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_GlobalProperty();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.NotificationListenerType <em>Notification Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Listener Type</em>'.
	 * @see org.mule.ide.config.core.NotificationListenerType
	 * @generated
	 */
	EClass getNotificationListenerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.NotificationListenerType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.NotificationListenerType#getRef()
	 * @see #getNotificationListenerType()
	 * @generated
	 */
	EAttribute getNotificationListenerType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.NotificationListenerType#getSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription</em>'.
	 * @see org.mule.ide.config.core.NotificationListenerType#getSubscription()
	 * @see #getNotificationListenerType()
	 * @generated
	 */
	EAttribute getNotificationListenerType_Subscription();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.NotificationManagerType <em>Notification Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Manager Type</em>'.
	 * @see org.mule.ide.config.core.NotificationManagerType
	 * @generated
	 */
	EClass getNotificationManagerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.NotificationManagerType#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notification</em>'.
	 * @see org.mule.ide.config.core.NotificationManagerType#getNotification()
	 * @see #getNotificationManagerType()
	 * @generated
	 */
	EReference getNotificationManagerType_Notification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.NotificationManagerType#getDisableNotification <em>Disable Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disable Notification</em>'.
	 * @see org.mule.ide.config.core.NotificationManagerType#getDisableNotification()
	 * @see #getNotificationManagerType()
	 * @generated
	 */
	EReference getNotificationManagerType_DisableNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.NotificationManagerType#getNotificationListener <em>Notification Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notification Listener</em>'.
	 * @see org.mule.ide.config.core.NotificationManagerType#getNotificationListener()
	 * @see #getNotificationManagerType()
	 * @generated
	 */
	EReference getNotificationManagerType_NotificationListener();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.NotificationManagerType#isDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see org.mule.ide.config.core.NotificationManagerType#isDynamic()
	 * @see #getNotificationManagerType()
	 * @generated
	 */
	EAttribute getNotificationManagerType_Dynamic();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.OutboundCollectionType <em>Outbound Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Collection Type</em>'.
	 * @see org.mule.ide.config.core.OutboundCollectionType
	 * @generated
	 */
	EClass getOutboundCollectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Catch All Strategy Group</em>'.
	 * @see org.mule.ide.config.core.OutboundCollectionType#getAbstractCatchAllStrategyGroup()
	 * @see #getOutboundCollectionType()
	 * @generated
	 */
	EAttribute getOutboundCollectionType_AbstractCatchAllStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.OutboundCollectionType#getAbstractCatchAllStrategy()
	 * @see #getOutboundCollectionType()
	 * @generated
	 */
	EReference getOutboundCollectionType_AbstractCatchAllStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractOutboundRouterGroup <em>Abstract Outbound Router Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Router Group</em>'.
	 * @see org.mule.ide.config.core.OutboundCollectionType#getAbstractOutboundRouterGroup()
	 * @see #getOutboundCollectionType()
	 * @generated
	 */
	EAttribute getOutboundCollectionType_AbstractOutboundRouterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractOutboundRouter <em>Abstract Outbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Outbound Router</em>'.
	 * @see org.mule.ide.config.core.OutboundCollectionType#getAbstractOutboundRouter()
	 * @see #getOutboundCollectionType()
	 * @generated
	 */
	EReference getOutboundCollectionType_AbstractOutboundRouter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundCollectionType#isMatchAll <em>Match All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match All</em>'.
	 * @see org.mule.ide.config.core.OutboundCollectionType#isMatchAll()
	 * @see #getOutboundCollectionType()
	 * @generated
	 */
	EAttribute getOutboundCollectionType_MatchAll();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType
	 * @generated
	 */
	EClass getOutboundEndpointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundEndpointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractTransformerGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractTransformer()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getTransformers()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Transformers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getResponseTransformers <em>Response Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Transformers</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getResponseTransformers()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_ResponseTransformers();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractTransactionGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractTransaction()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractFilterGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractFilter()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Filter Group</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractSecurityFilterGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractSecurityFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractSecurityFilter()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getProperty()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getProperties()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAddress()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getConnectorRef <em>Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Ref</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getConnectorRef()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_ConnectorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getEncoding()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getRef()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#isRemoteSync <em>Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#isRemoteSync()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_RemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync Timeout</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getRemoteSyncTimeout()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_RemoteSyncTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getResponseTransformerRefs()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_ResponseTransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#isSynchronous()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getTransformerRefs()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.OutboundRouterType <em>Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Router Type</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType
	 * @generated
	 */
	EClass getOutboundRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractOutboundEndpointGroup()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EAttribute getOutboundRouterType_AbstractOutboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractOutboundEndpoint()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EReference getOutboundRouterType_AbstractOutboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.OutboundRouterType#getReplyTo <em>Reply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply To</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getReplyTo()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EReference getOutboundRouterType_ReplyTo();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractTransactionGroup()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EAttribute getOutboundRouterType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractTransaction()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EReference getOutboundRouterType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractMessageInfoMappingGroup <em>Abstract Message Info Mapping Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Message Info Mapping Group</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractMessageInfoMappingGroup()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EAttribute getOutboundRouterType_AbstractMessageInfoMappingGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractMessageInfoMapping <em>Abstract Message Info Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Message Info Mapping</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractMessageInfoMapping()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EReference getOutboundRouterType_AbstractMessageInfoMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundRouterType#getEnableCorrelation <em>Enable Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Correlation</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getEnableCorrelation()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EAttribute getOutboundRouterType_EnableCorrelation();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType <em>Password Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Encryption Strategy Type</em>'.
	 * @see org.mule.ide.config.core.PasswordEncryptionStrategyType
	 * @generated
	 */
	EClass getPasswordEncryptionStrategyType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getIterationCount <em>Iteration Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration Count</em>'.
	 * @see org.mule.ide.config.core.PasswordEncryptionStrategyType#getIterationCount()
	 * @see #getPasswordEncryptionStrategyType()
	 * @generated
	 */
	EAttribute getPasswordEncryptionStrategyType_IterationCount();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.mule.ide.config.core.PasswordEncryptionStrategyType#getPassword()
	 * @see #getPasswordEncryptionStrategyType()
	 * @generated
	 */
	EAttribute getPasswordEncryptionStrategyType_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getSalt <em>Salt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salt</em>'.
	 * @see org.mule.ide.config.core.PasswordEncryptionStrategyType#getSalt()
	 * @see #getPasswordEncryptionStrategyType()
	 * @generated
	 */
	EAttribute getPasswordEncryptionStrategyType_Salt();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PatternFilterType <em>Pattern Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Filter Type</em>'.
	 * @see org.mule.ide.config.core.PatternFilterType
	 * @generated
	 */
	EClass getPatternFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PatternFilterType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.mule.ide.config.core.PatternFilterType#getPattern()
	 * @see #getPatternFilterType()
	 * @generated
	 */
	EAttribute getPatternFilterType_Pattern();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PojoBindingType <em>Pojo Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pojo Binding Type</em>'.
	 * @see org.mule.ide.config.core.PojoBindingType
	 * @generated
	 */
	EClass getPojoBindingType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.PojoBindingType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.PojoBindingType#getAbstractOutboundEndpointGroup()
	 * @see #getPojoBindingType()
	 * @generated
	 */
	EAttribute getPojoBindingType_AbstractOutboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.PojoBindingType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.PojoBindingType#getAbstractOutboundEndpoint()
	 * @see #getPojoBindingType()
	 * @generated
	 */
	EReference getPojoBindingType_AbstractOutboundEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PojoBindingType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.mule.ide.config.core.PojoBindingType#getInterface()
	 * @see #getPojoBindingType()
	 * @generated
	 */
	EAttribute getPojoBindingType_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PojoBindingType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.mule.ide.config.core.PojoBindingType#getMethod()
	 * @see #getPojoBindingType()
	 * @generated
	 */
	EAttribute getPojoBindingType_Method();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PooledJavaComponentType <em>Pooled Java Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pooled Java Component Type</em>'.
	 * @see org.mule.ide.config.core.PooledJavaComponentType
	 * @generated
	 */
	EClass getPooledJavaComponentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.PooledJavaComponentType#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Pooling Profile Group</em>'.
	 * @see org.mule.ide.config.core.PooledJavaComponentType#getAbstractPoolingProfileGroup()
	 * @see #getPooledJavaComponentType()
	 * @generated
	 */
	EAttribute getPooledJavaComponentType_AbstractPoolingProfileGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.PooledJavaComponentType#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Pooling Profile</em>'.
	 * @see org.mule.ide.config.core.PooledJavaComponentType#getAbstractPoolingProfile()
	 * @see #getPooledJavaComponentType()
	 * @generated
	 */
	EReference getPooledJavaComponentType_AbstractPoolingProfile();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PoolingProfileType <em>Pooling Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pooling Profile Type</em>'.
	 * @see org.mule.ide.config.core.PoolingProfileType
	 * @generated
	 */
	EClass getPoolingProfileType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PoolingProfileType#getExhaustedAction <em>Exhausted Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exhausted Action</em>'.
	 * @see org.mule.ide.config.core.PoolingProfileType#getExhaustedAction()
	 * @see #getPoolingProfileType()
	 * @generated
	 */
	EAttribute getPoolingProfileType_ExhaustedAction();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PoolingProfileType#getInitialisationPolicy <em>Initialisation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialisation Policy</em>'.
	 * @see org.mule.ide.config.core.PoolingProfileType#getInitialisationPolicy()
	 * @see #getPoolingProfileType()
	 * @generated
	 */
	EAttribute getPoolingProfileType_InitialisationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PoolingProfileType#getMaxActive <em>Max Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Active</em>'.
	 * @see org.mule.ide.config.core.PoolingProfileType#getMaxActive()
	 * @see #getPoolingProfileType()
	 * @generated
	 */
	EAttribute getPoolingProfileType_MaxActive();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PoolingProfileType#getMaxIdle <em>Max Idle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Idle</em>'.
	 * @see org.mule.ide.config.core.PoolingProfileType#getMaxIdle()
	 * @see #getPoolingProfileType()
	 * @generated
	 */
	EAttribute getPoolingProfileType_MaxIdle();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PoolingProfileType#getMaxWait <em>Max Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Wait</em>'.
	 * @see org.mule.ide.config.core.PoolingProfileType#getMaxWait()
	 * @see #getPoolingProfileType()
	 * @generated
	 */
	EAttribute getPoolingProfileType_MaxWait();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PropertyEntryPointResolverType <em>Property Entry Point Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Entry Point Resolver Type</em>'.
	 * @see org.mule.ide.config.core.PropertyEntryPointResolverType
	 * @generated
	 */
	EClass getPropertyEntryPointResolverType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PropertyEntryPointResolverType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.mule.ide.config.core.PropertyEntryPointResolverType#getProperty()
	 * @see #getPropertyEntryPointResolverType()
	 * @generated
	 */
	EAttribute getPropertyEntryPointResolverType_Property();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PrototypeObjectFactoryType <em>Prototype Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prototype Object Factory Type</em>'.
	 * @see org.mule.ide.config.core.PrototypeObjectFactoryType
	 * @generated
	 */
	EClass getPrototypeObjectFactoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PrototypeObjectFactoryType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.PrototypeObjectFactoryType#getClass_()
	 * @see #getPrototypeObjectFactoryType()
	 * @generated
	 */
	EAttribute getPrototypeObjectFactoryType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.QueueProfileType <em>Queue Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Profile Type</em>'.
	 * @see org.mule.ide.config.core.QueueProfileType
	 * @generated
	 */
	EClass getQueueProfileType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.QueueProfileType#getMaxOutstandingMessages <em>Max Outstanding Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Outstanding Messages</em>'.
	 * @see org.mule.ide.config.core.QueueProfileType#getMaxOutstandingMessages()
	 * @see #getQueueProfileType()
	 * @generated
	 */
	EAttribute getQueueProfileType_MaxOutstandingMessages();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.QueueProfileType#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.mule.ide.config.core.QueueProfileType#isPersistent()
	 * @see #getQueueProfileType()
	 * @generated
	 */
	EAttribute getQueueProfileType_Persistent();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.mule.ide.config.core.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ReferenceType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.ReferenceType#getRef()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Ref();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.RefFilterType <em>Ref Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Filter Type</em>'.
	 * @see org.mule.ide.config.core.RefFilterType
	 * @generated
	 */
	EClass getRefFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.RefFilterType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.RefFilterType#getRef()
	 * @see #getRefFilterType()
	 * @generated
	 */
	EAttribute getRefFilterType_Ref();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ReflectionEntryPointResolverType <em>Reflection Entry Point Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflection Entry Point Resolver Type</em>'.
	 * @see org.mule.ide.config.core.ReflectionEntryPointResolverType
	 * @generated
	 */
	EClass getReflectionEntryPointResolverType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ReflectionEntryPointResolverType#getExcludeObjectMethods <em>Exclude Object Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Object Methods</em>'.
	 * @see org.mule.ide.config.core.ReflectionEntryPointResolverType#getExcludeObjectMethods()
	 * @see #getReflectionEntryPointResolverType()
	 * @generated
	 */
	EReference getReflectionEntryPointResolverType_ExcludeObjectMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ReflectionEntryPointResolverType#getExcludeEntryPoint <em>Exclude Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Entry Point</em>'.
	 * @see org.mule.ide.config.core.ReflectionEntryPointResolverType#getExcludeEntryPoint()
	 * @see #getReflectionEntryPointResolverType()
	 * @generated
	 */
	EReference getReflectionEntryPointResolverType_ExcludeEntryPoint();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.RefTransformerType <em>Ref Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Transformer Type</em>'.
	 * @see org.mule.ide.config.core.RefTransformerType
	 * @generated
	 */
	EClass getRefTransformerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.RefTransformerType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.RefTransformerType#getRef()
	 * @see #getRefTransformerType()
	 * @generated
	 */
	EAttribute getRefTransformerType_Ref();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ReplyToType <em>Reply To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply To Type</em>'.
	 * @see org.mule.ide.config.core.ReplyToType
	 * @generated
	 */
	EClass getReplyToType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ReplyToType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.core.ReplyToType#getAddress()
	 * @see #getReplyToType()
	 * @generated
	 */
	EAttribute getReplyToType_Address();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ResponseTransformersType <em>Response Transformers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Transformers Type</em>'.
	 * @see org.mule.ide.config.core.ResponseTransformersType
	 * @generated
	 */
	EClass getResponseTransformersType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseTransformersType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.ResponseTransformersType#getAbstractTransformerGroup()
	 * @see #getResponseTransformersType()
	 * @generated
	 */
	EAttribute getResponseTransformersType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseTransformersType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.ResponseTransformersType#getAbstractTransformer()
	 * @see #getResponseTransformersType()
	 * @generated
	 */
	EReference getResponseTransformersType_AbstractTransformer();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ReturnArgumentType <em>Return Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Argument Type</em>'.
	 * @see org.mule.ide.config.core.ReturnArgumentType
	 * @generated
	 */
	EClass getReturnArgumentType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ReturnArgumentType#getCustomEvaluator <em>Custom Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Evaluator</em>'.
	 * @see org.mule.ide.config.core.ReturnArgumentType#getCustomEvaluator()
	 * @see #getReturnArgumentType()
	 * @generated
	 */
	EAttribute getReturnArgumentType_CustomEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ReturnArgumentType#getEvaluator <em>Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluator</em>'.
	 * @see org.mule.ide.config.core.ReturnArgumentType#getEvaluator()
	 * @see #getReturnArgumentType()
	 * @generated
	 */
	EAttribute getReturnArgumentType_Evaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ReturnArgumentType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.mule.ide.config.core.ReturnArgumentType#getExpression()
	 * @see #getReturnArgumentType()
	 * @generated
	 */
	EAttribute getReturnArgumentType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ReturnArgumentType#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.mule.ide.config.core.ReturnArgumentType#isOptional()
	 * @see #getReturnArgumentType()
	 * @generated
	 */
	EAttribute getReturnArgumentType_Optional();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType <em>Secret Key Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret Key Encryption Strategy Type</em>'.
	 * @see org.mule.ide.config.core.SecretKeyEncryptionStrategyType
	 * @generated
	 */
	EClass getSecretKeyEncryptionStrategyType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKey()
	 * @see #getSecretKeyEncryptionStrategyType()
	 * @generated
	 */
	EAttribute getSecretKeyEncryptionStrategyType_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKeyFactoryRef <em>Key Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Factory Ref</em>'.
	 * @see org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKeyFactoryRef()
	 * @see #getSecretKeyEncryptionStrategyType()
	 * @generated
	 */
	EAttribute getSecretKeyEncryptionStrategyType_KeyFactoryRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SecurityManagerType <em>Security Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manager Type</em>'.
	 * @see org.mule.ide.config.core.SecurityManagerType
	 * @generated
	 */
	EClass getSecurityManagerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.SecurityManagerType#getCustomSecurityProvider <em>Custom Security Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Security Provider</em>'.
	 * @see org.mule.ide.config.core.SecurityManagerType#getCustomSecurityProvider()
	 * @see #getSecurityManagerType()
	 * @generated
	 */
	EReference getSecurityManagerType_CustomSecurityProvider();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.SecurityManagerType#getCustomEncryptionStrategy <em>Custom Encryption Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Encryption Strategy</em>'.
	 * @see org.mule.ide.config.core.SecurityManagerType#getCustomEncryptionStrategy()
	 * @see #getSecurityManagerType()
	 * @generated
	 */
	EReference getSecurityManagerType_CustomEncryptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.SecurityManagerType#getSecretKeyEncryptionStrategy <em>Secret Key Encryption Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secret Key Encryption Strategy</em>'.
	 * @see org.mule.ide.config.core.SecurityManagerType#getSecretKeyEncryptionStrategy()
	 * @see #getSecurityManagerType()
	 * @generated
	 */
	EReference getSecurityManagerType_SecretKeyEncryptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.SecurityManagerType#getPasswordEncryptionStrategy <em>Password Encryption Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password Encryption Strategy</em>'.
	 * @see org.mule.ide.config.core.SecurityManagerType#getPasswordEncryptionStrategy()
	 * @see #getSecurityManagerType()
	 * @generated
	 */
	EReference getSecurityManagerType_PasswordEncryptionStrategy();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SecurityProviderType <em>Security Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Provider Type</em>'.
	 * @see org.mule.ide.config.core.SecurityProviderType
	 * @generated
	 */
	EClass getSecurityProviderType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SecurityProviderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.SecurityProviderType#getName()
	 * @see #getSecurityProviderType()
	 * @generated
	 */
	EAttribute getSecurityProviderType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SedaModelType <em>Seda Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seda Model Type</em>'.
	 * @see org.mule.ide.config.core.SedaModelType
	 * @generated
	 */
	EClass getSedaModelType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.SedaModelType#getAbstractQueueProfileGroup <em>Abstract Queue Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Queue Profile Group</em>'.
	 * @see org.mule.ide.config.core.SedaModelType#getAbstractQueueProfileGroup()
	 * @see #getSedaModelType()
	 * @generated
	 */
	EAttribute getSedaModelType_AbstractQueueProfileGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.SedaModelType#getAbstractQueueProfile <em>Abstract Queue Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Queue Profile</em>'.
	 * @see org.mule.ide.config.core.SedaModelType#getAbstractQueueProfile()
	 * @see #getSedaModelType()
	 * @generated
	 */
	EReference getSedaModelType_AbstractQueueProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SedaModelType#isInherit <em>Inherit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherit</em>'.
	 * @see org.mule.ide.config.core.SedaModelType#isInherit()
	 * @see #getSedaModelType()
	 * @generated
	 */
	EAttribute getSedaModelType_Inherit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.SedaModelType#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.mule.ide.config.core.SedaModelType#getConnections()
	 * @see #getSedaModelType()
	 * @generated
	 */
	EReference getSedaModelType_Connections();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SedaServiceType <em>Seda Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seda Service Type</em>'.
	 * @see org.mule.ide.config.core.SedaServiceType
	 * @generated
	 */
	EClass getSedaServiceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.SedaServiceType#getAbstractComponentThreadingProfileGroup <em>Abstract Component Threading Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Component Threading Profile Group</em>'.
	 * @see org.mule.ide.config.core.SedaServiceType#getAbstractComponentThreadingProfileGroup()
	 * @see #getSedaServiceType()
	 * @generated
	 */
	EAttribute getSedaServiceType_AbstractComponentThreadingProfileGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.SedaServiceType#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Component Threading Profile</em>'.
	 * @see org.mule.ide.config.core.SedaServiceType#getAbstractComponentThreadingProfile()
	 * @see #getSedaServiceType()
	 * @generated
	 */
	EReference getSedaServiceType_AbstractComponentThreadingProfile();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.SedaServiceType#getAbstractQueueProfileGroup <em>Abstract Queue Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Queue Profile Group</em>'.
	 * @see org.mule.ide.config.core.SedaServiceType#getAbstractQueueProfileGroup()
	 * @see #getSedaServiceType()
	 * @generated
	 */
	EAttribute getSedaServiceType_AbstractQueueProfileGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.SedaServiceType#getAbstractQueueProfile <em>Abstract Queue Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Queue Profile</em>'.
	 * @see org.mule.ide.config.core.SedaServiceType#getAbstractQueueProfile()
	 * @see #getSedaServiceType()
	 * @generated
	 */
	EReference getSedaServiceType_AbstractQueueProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SedaServiceType#getQueueTimeout <em>Queue Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Timeout</em>'.
	 * @see org.mule.ide.config.core.SedaServiceType#getQueueTimeout()
	 * @see #getSedaServiceType()
	 * @generated
	 */
	EAttribute getSedaServiceType_QueueTimeout();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SelectiveConsumerRouterType <em>Selective Consumer Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selective Consumer Router Type</em>'.
	 * @see org.mule.ide.config.core.SelectiveConsumerRouterType
	 * @generated
	 */
	EClass getSelectiveConsumerRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.SelectiveConsumerRouterType#getAbstractTransformerGroup()
	 * @see #getSelectiveConsumerRouterType()
	 * @generated
	 */
	EAttribute getSelectiveConsumerRouterType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.SelectiveConsumerRouterType#getAbstractTransformer()
	 * @see #getSelectiveConsumerRouterType()
	 * @generated
	 */
	EReference getSelectiveConsumerRouterType_AbstractTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.SelectiveConsumerRouterType#getTransformerRefs()
	 * @see #getSelectiveConsumerRouterType()
	 * @generated
	 */
	EAttribute getSelectiveConsumerRouterType_TransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformFirst <em>Transform First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform First</em>'.
	 * @see org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformFirst()
	 * @see #getSelectiveConsumerRouterType()
	 * @generated
	 */
	EAttribute getSelectiveConsumerRouterType_TransformFirst();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ServiceOverridesType <em>Service Overrides Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Overrides Type</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType
	 * @generated
	 */
	EClass getServiceOverridesType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getDispatcherFactory <em>Dispatcher Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dispatcher Factory</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getDispatcherFactory()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_DispatcherFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getEndpointBuilder <em>Endpoint Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Builder</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getEndpointBuilder()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_EndpointBuilder();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getInboundTransformer <em>Inbound Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inbound Transformer</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getInboundTransformer()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_InboundTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getMessageAdapter <em>Message Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Adapter</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getMessageAdapter()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_MessageAdapter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getMessageReceiver <em>Message Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Receiver</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getMessageReceiver()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_MessageReceiver();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getOutboundTransformer <em>Outbound Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outbound Transformer</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getOutboundTransformer()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_OutboundTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getResponseTransformer <em>Response Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getResponseTransformer()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_ResponseTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getServiceFinder <em>Service Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Finder</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getServiceFinder()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_ServiceFinder();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getSessionHandler <em>Session Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Handler</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getSessionHandler()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_SessionHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getStreamMessageAdapter <em>Stream Message Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Message Adapter</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getStreamMessageAdapter()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_StreamMessageAdapter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ServiceOverridesType#getTransactedMessageReceiver <em>Transacted Message Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transacted Message Receiver</em>'.
	 * @see org.mule.ide.config.core.ServiceOverridesType#getTransactedMessageReceiver()
	 * @see #getServiceOverridesType()
	 * @generated
	 */
	EAttribute getServiceOverridesType_TransactedMessageReceiver();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SingletonObjectFactoryType <em>Singleton Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Object Factory Type</em>'.
	 * @see org.mule.ide.config.core.SingletonObjectFactoryType
	 * @generated
	 */
	EClass getSingletonObjectFactoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SingletonObjectFactoryType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.SingletonObjectFactoryType#getClass_()
	 * @see #getSingletonObjectFactoryType()
	 * @generated
	 */
	EAttribute getSingletonObjectFactoryType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.SpringBeanLookupType <em>Spring Bean Lookup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Bean Lookup Type</em>'.
	 * @see org.mule.ide.config.core.SpringBeanLookupType
	 * @generated
	 */
	EClass getSpringBeanLookupType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SpringBeanLookupType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see org.mule.ide.config.core.SpringBeanLookupType#getBean()
	 * @see #getSpringBeanLookupType()
	 * @generated
	 */
	EAttribute getSpringBeanLookupType_Bean();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.StaticRecipientListRouterType <em>Static Recipient List Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Recipient List Router Type</em>'.
	 * @see org.mule.ide.config.core.StaticRecipientListRouterType
	 * @generated
	 */
	EClass getStaticRecipientListRouterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipients</em>'.
	 * @see org.mule.ide.config.core.StaticRecipientListRouterType#getRecipients()
	 * @see #getStaticRecipientListRouterType()
	 * @generated
	 */
	EReference getStaticRecipientListRouterType_Recipients();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsDelimiter <em>Recipients Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipients Delimiter</em>'.
	 * @see org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsDelimiter()
	 * @see #getStaticRecipientListRouterType()
	 * @generated
	 */
	EAttribute getStaticRecipientListRouterType_RecipientsDelimiter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsProperty <em>Recipients Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipients Property</em>'.
	 * @see org.mule.ide.config.core.StaticRecipientListRouterType#getRecipientsProperty()
	 * @see #getStaticRecipientListRouterType()
	 * @generated
	 */
	EAttribute getStaticRecipientListRouterType_RecipientsProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.StaticRecipientListRouterType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.core.StaticRecipientListRouterType#isSynchronous()
	 * @see #getStaticRecipientListRouterType()
	 * @generated
	 */
	EAttribute getStaticRecipientListRouterType_Synchronous();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ThreadingProfileType <em>Threading Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threading Profile Type</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType
	 * @generated
	 */
	EClass getThreadingProfileType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#isDoThreading <em>Do Threading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Threading</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#isDoThreading()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_DoThreading();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxBufferSize <em>Max Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Buffer Size</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#getMaxBufferSize()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_MaxBufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsActive <em>Max Threads Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Threads Active</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsActive()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_MaxThreadsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsIdle <em>Max Threads Idle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Threads Idle</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsIdle()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_MaxThreadsIdle();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#getPoolExhaustedAction <em>Pool Exhausted Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool Exhausted Action</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#getPoolExhaustedAction()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_PoolExhaustedAction();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadTTL <em>Thread TTL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread TTL</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#getThreadTTL()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_ThreadTTL();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadWaitTimeout <em>Thread Wait Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Wait Timeout</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#getThreadWaitTimeout()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_ThreadWaitTimeout();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TlsClientKeyStoreType <em>Tls Client Key Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tls Client Key Store Type</em>'.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType
	 * @generated
	 */
	EClass getTlsClientKeyStoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType#getClass_()
	 * @see #getTlsClientKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsClientKeyStoreType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType#getPath()
	 * @see #getTlsClientKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsClientKeyStoreType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getStorePassword <em>Store Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Password</em>'.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType#getStorePassword()
	 * @see #getTlsClientKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsClientKeyStoreType_StorePassword();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TlsKeyStoreType <em>Tls Key Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tls Key Store Type</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType
	 * @generated
	 */
	EClass getTlsKeyStoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getAlgorithm()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getClass_()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyPassword <em>Key Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Password</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getKeyPassword()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_KeyPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getPath()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getStorePassword <em>Store Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Password</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getStorePassword()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_StorePassword();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TlsProtocolHandler <em>Tls Protocol Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tls Protocol Handler</em>'.
	 * @see org.mule.ide.config.core.TlsProtocolHandler
	 * @generated
	 */
	EClass getTlsProtocolHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsProtocolHandler#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.mule.ide.config.core.TlsProtocolHandler#getProperty()
	 * @see #getTlsProtocolHandler()
	 * @generated
	 */
	EAttribute getTlsProtocolHandler_Property();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TlsServerTrustStoreType <em>Tls Server Trust Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tls Server Trust Store Type</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType
	 * @generated
	 */
	EClass getTlsServerTrustStoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#getAlgorithm()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#getClass_()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitOnly <em>Explicit Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Only</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitOnly()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_ExplicitOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getFactoryRef <em>Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Ref</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#getFactoryRef()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_FactoryRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isRequireClientAuthentication <em>Require Client Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Client Authentication</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#isRequireClientAuthentication()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_RequireClientAuthentication();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TlsTrustStoreType <em>Tls Trust Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tls Trust Store Type</em>'.
	 * @see org.mule.ide.config.core.TlsTrustStoreType
	 * @generated
	 */
	EClass getTlsTrustStoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsTrustStoreType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.mule.ide.config.core.TlsTrustStoreType#getPath()
	 * @see #getTlsTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsTrustStoreType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsTrustStoreType#getStorePassword <em>Store Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Password</em>'.
	 * @see org.mule.ide.config.core.TlsTrustStoreType#getStorePassword()
	 * @see #getTlsTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsTrustStoreType_StorePassword();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TransactionManagerType <em>Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Manager Type</em>'.
	 * @see org.mule.ide.config.core.TransactionManagerType
	 * @generated
	 */
	EClass getTransactionManagerType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TransactionManagerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.TransactionManagerType#getName()
	 * @see #getTransactionManagerType()
	 * @generated
	 */
	EAttribute getTransactionManagerType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TransformersType <em>Transformers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformers Type</em>'.
	 * @see org.mule.ide.config.core.TransformersType
	 * @generated
	 */
	EClass getTransformersType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.TransformersType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.TransformersType#getAbstractTransformerGroup()
	 * @see #getTransformersType()
	 * @generated
	 */
	EAttribute getTransformersType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.TransformersType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.TransformersType#getAbstractTransformer()
	 * @see #getTransformersType()
	 * @generated
	 */
	EReference getTransformersType_AbstractTransformer();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TypeFilterType <em>Type Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Filter Type</em>'.
	 * @see org.mule.ide.config.core.TypeFilterType
	 * @generated
	 */
	EClass getTypeFilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TypeFilterType#getExpectedType <em>Expected Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Type</em>'.
	 * @see org.mule.ide.config.core.TypeFilterType#getExpectedType()
	 * @see #getTypeFilterType()
	 * @generated
	 */
	EAttribute getTypeFilterType_ExpectedType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.UnitaryFilterType <em>Unitary Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unitary Filter Type</em>'.
	 * @see org.mule.ide.config.core.UnitaryFilterType
	 * @generated
	 */
	EClass getUnitaryFilterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.UnitaryFilterType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.UnitaryFilterType#getAbstractFilterGroup()
	 * @see #getUnitaryFilterType()
	 * @generated
	 */
	EAttribute getUnitaryFilterType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.UnitaryFilterType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.UnitaryFilterType#getAbstractFilter()
	 * @see #getUnitaryFilterType()
	 * @generated
	 */
	EReference getUnitaryFilterType_AbstractFilter();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.mule.ide.config.core.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mule.ide.config.core.ValueType#getValue()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ValueType#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Ref</em>'.
	 * @see org.mule.ide.config.core.ValueType#getValueRef()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_ValueRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.WildcardFilterType <em>Wildcard Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wildcard Filter Type</em>'.
	 * @see org.mule.ide.config.core.WildcardFilterType
	 * @generated
	 */
	EClass getWildcardFilterType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.WireTapRouterType <em>Wire Tap Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Tap Router Type</em>'.
	 * @see org.mule.ide.config.core.WireTapRouterType
	 * @generated
	 */
	EClass getWireTapRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.WireTapRouterType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.WireTapRouterType#getAbstractOutboundEndpointGroup()
	 * @see #getWireTapRouterType()
	 * @generated
	 */
	EAttribute getWireTapRouterType_AbstractOutboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.WireTapRouterType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.WireTapRouterType#getAbstractOutboundEndpoint()
	 * @see #getWireTapRouterType()
	 * @generated
	 */
	EReference getWireTapRouterType_AbstractOutboundEndpoint();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.mule.ide.config.core.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.Connection#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see org.mule.ide.config.core.Connection#getEndpoint()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Endpoint();

	/**
	 * Returns the meta object for the reference '{@link org.mule.ide.config.core.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.mule.ide.config.core.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link org.mule.ide.config.core.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.mule.ide.config.core.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.mule.ide.config.core.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.EnableCorrelationType <em>Enable Correlation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enable Correlation Type</em>'.
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @generated
	 */
	EEnum getEnableCorrelationType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.EvaluatorType <em>Evaluator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluator Type</em>'.
	 * @see org.mule.ide.config.core.EvaluatorType
	 * @generated
	 */
	EEnum getEvaluatorType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.EvaluatorType1 <em>Evaluator Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluator Type1</em>'.
	 * @see org.mule.ide.config.core.EvaluatorType1
	 * @generated
	 */
	EEnum getEvaluatorType1();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.ExhaustedActionType <em>Exhausted Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exhausted Action Type</em>'.
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @generated
	 */
	EEnum getExhaustedActionType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.InitialisationPolicyType <em>Initialisation Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initialisation Policy Type</em>'.
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @generated
	 */
	EEnum getInitialisationPolicyType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.InitialStateType <em>Initial State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initial State Type</em>'.
	 * @see org.mule.ide.config.core.InitialStateType
	 * @generated
	 */
	EEnum getInitialStateType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.NotificationTypes <em>Notification Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Types</em>'.
	 * @see org.mule.ide.config.core.NotificationTypes
	 * @generated
	 */
	EEnum getNotificationTypes();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.PoolExhaustedActionType <em>Pool Exhausted Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pool Exhausted Action Type</em>'.
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @generated
	 */
	EEnum getPoolExhaustedActionType();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.ActionType <em>Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action Type Object</em>'.
	 * @see org.mule.ide.config.core.ActionType
	 * @model instanceClass="org.mule.ide.config.core.ActionType"
	 *        extendedMetaData="name='action_._type:Object' baseType='action_._type'"
	 * @generated
	 */
	EDataType getActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.EnableCorrelationType <em>Enable Correlation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enable Correlation Type Object</em>'.
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @model instanceClass="org.mule.ide.config.core.EnableCorrelationType"
	 *        extendedMetaData="name='enableCorrelation_._type:Object' baseType='enableCorrelation_._type'"
	 * @generated
	 */
	EDataType getEnableCorrelationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.EvaluatorType <em>Evaluator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Evaluator Type Object</em>'.
	 * @see org.mule.ide.config.core.EvaluatorType
	 * @model instanceClass="org.mule.ide.config.core.EvaluatorType"
	 *        extendedMetaData="name='evaluator_._type:Object' baseType='evaluator_._type'"
	 * @generated
	 */
	EDataType getEvaluatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.EvaluatorType1 <em>Evaluator Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Evaluator Type Object1</em>'.
	 * @see org.mule.ide.config.core.EvaluatorType1
	 * @model instanceClass="org.mule.ide.config.core.EvaluatorType1"
	 *        extendedMetaData="name='evaluator_._1_._type:Object' baseType='evaluator_._1_._type'"
	 * @generated
	 */
	EDataType getEvaluatorTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.ExhaustedActionType <em>Exhausted Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exhausted Action Type Object</em>'.
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @model instanceClass="org.mule.ide.config.core.ExhaustedActionType"
	 *        extendedMetaData="name='exhaustedAction_._type:Object' baseType='exhaustedAction_._type'"
	 * @generated
	 */
	EDataType getExhaustedActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.InitialisationPolicyType <em>Initialisation Policy Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Initialisation Policy Type Object</em>'.
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @model instanceClass="org.mule.ide.config.core.InitialisationPolicyType"
	 *        extendedMetaData="name='initialisationPolicy_._type:Object' baseType='initialisationPolicy_._type'"
	 * @generated
	 */
	EDataType getInitialisationPolicyTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.InitialStateType <em>Initial State Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Initial State Type Object</em>'.
	 * @see org.mule.ide.config.core.InitialStateType
	 * @model instanceClass="org.mule.ide.config.core.InitialStateType"
	 *        extendedMetaData="name='initialState_._type:Object' baseType='initialState_._type'"
	 * @generated
	 */
	EDataType getInitialStateTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Blank String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Blank String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nonBlankString' memberTypes='nonBlankString_._member_._0'"
	 * @generated
	 */
	EDataType getNonBlankString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Blank String Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Blank String Member0</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nonBlankString_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.*[^%20]+.*'"
	 * @generated
	 */
	EDataType getNonBlankStringMember0();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.NotificationTypes <em>Notification Types Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notification Types Object</em>'.
	 * @see org.mule.ide.config.core.NotificationTypes
	 * @model instanceClass="org.mule.ide.config.core.NotificationTypes"
	 *        extendedMetaData="name='notificationTypes:Object' baseType='notificationTypes'"
	 * @generated
	 */
	EDataType getNotificationTypesObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.PoolExhaustedActionType <em>Pool Exhausted Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pool Exhausted Action Type Object</em>'.
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @model instanceClass="org.mule.ide.config.core.PoolExhaustedActionType"
	 *        extendedMetaData="name='poolExhaustedAction_._type:Object' baseType='poolExhaustedAction_._type'"
	 * @generated
	 */
	EDataType getPoolExhaustedActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Property Placeholder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Placeholder Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='propertyPlaceholderType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(\\$\\{[^\\}]+\\})'"
	 * @generated
	 */
	EDataType getPropertyPlaceholderType();

	/**
	 * Returns the meta object for data type '<em>Substitutable Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Boolean</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='substitutableBoolean' memberTypes='substitutableBoolean_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableBoolean();

	/**
	 * Returns the meta object for data type '<em>Substitutable Boolean Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Boolean Member0</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='substitutableBoolean_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getSubstitutableBooleanMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Substitutable Boolean Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Boolean Member0 Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='substitutableBoolean_._member_._0:Object' baseType='substitutableBoolean_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableBooleanMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Substitutable Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Boolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='substitutableBoolean:Object' baseType='substitutableBoolean'"
	 * @generated
	 */
	EDataType getSubstitutableBooleanObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Substitutable Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Class</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='substitutableClass' memberTypes='substitutableClass_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableClass();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Substitutable Class Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Class Member0</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='substitutableClass_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\[?[A-Za-z0-9_\\.$]+'"
	 * @generated
	 */
	EDataType getSubstitutableClassMember0();

	/**
	 * Returns the meta object for data type '<em>Substitutable Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Int</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='substitutableInt' memberTypes='substitutableInt_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableInt();

	/**
	 * Returns the meta object for data type '<em>Substitutable Int Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Int Member0</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='substitutableInt_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getSubstitutableIntMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Substitutable Int Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Int Member0 Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='substitutableInt_._member_._0:Object' baseType='substitutableInt_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableIntMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Substitutable Int Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Int Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='substitutableInt:Object' baseType='substitutableInt'"
	 * @generated
	 */
	EDataType getSubstitutableIntObject();

	/**
	 * Returns the meta object for data type '<em>Substitutable Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Long</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='substitutableLong' memberTypes='substitutableLong_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableLong();

	/**
	 * Returns the meta object for data type '<em>Substitutable Long Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Long Member0</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='substitutableLong_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#long'"
	 * @generated
	 */
	EDataType getSubstitutableLongMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Substitutable Long Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Long Member0 Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='substitutableLong_._member_._0:Object' baseType='substitutableLong_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableLongMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Substitutable Long Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Long Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='substitutableLong:Object' baseType='substitutableLong'"
	 * @generated
	 */
	EDataType getSubstitutableLongObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Substitutable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='substitutableName' memberTypes='substitutableName_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutableName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Substitutable Name Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Name Member0</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='substitutableName_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKEN'"
	 * @generated
	 */
	EDataType getSubstitutableNameMember0();

	/**
	 * Returns the meta object for data type '<em>Substitutable Port Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Port Number</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='substitutablePortNumber' memberTypes='substitutablePortNumber_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutablePortNumber();

	/**
	 * Returns the meta object for data type '<em>Substitutable Port Number Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Port Number Member0</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='substitutablePortNumber_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0' maxInclusive='65536'"
	 * @generated
	 */
	EDataType getSubstitutablePortNumberMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Substitutable Port Number Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Port Number Member0 Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='substitutablePortNumber_._member_._0:Object' baseType='substitutablePortNumber_._member_._0'"
	 * @generated
	 */
	EDataType getSubstitutablePortNumberMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Substitutable Port Number Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Substitutable Port Number Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='substitutablePortNumber:Object' baseType='substitutablePortNumber'"
	 * @generated
	 */
	EDataType getSubstitutablePortNumberObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

} //CorePackage
