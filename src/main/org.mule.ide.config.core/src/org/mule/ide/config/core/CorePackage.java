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
 * @generated
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_AGENT_TYPE__NAME = ABSTRACT_EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Agent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_AGENT_TYPE_FEATURE_COUNT = ABSTRACT_EXTENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractBindingTypeImpl <em>Abstract Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractBindingTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractBindingType()
	 * @generated
	 */
	int ABSTRACT_BINDING_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BINDING_TYPE_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Abstract Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractConnectionStrategyTypeImpl <em>Abstract Connection Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractConnectionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractConnectionStrategyType()
	 * @generated
	 */
	int ABSTRACT_CONNECTION_STRATEGY_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Abstract Connection Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION_STRATEGY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractConnectorTypeImpl <em>Abstract Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractConnectorType()
	 * @generated
	 */
	int ABSTRACT_CONNECTOR_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Abstract Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractEntrypointResolverTypeImpl <em>Abstract Entrypoint Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractEntrypointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractEntrypointResolverType()
	 * @generated
	 */
	int ABSTRACT_ENTRYPOINT_RESOLVER_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Abstract Entrypoint Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTRYPOINT_RESOLVER_TYPE_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Abstract Exception Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractModelTypeImpl <em>Abstract Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractModelTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractModelType()
	 * @generated
	 */
	int ABSTRACT_MODEL_TYPE = 14;

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
	 * The feature id for the '<em><b>Abstract Entrypoint Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER = 3;

	/**
	 * The feature id for the '<em><b>Abstract Service Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Abstract Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractObjectFactoryTypeImpl <em>Abstract Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractObjectFactoryType()
	 * @generated
	 */
	int ABSTRACT_OBJECT_FACTORY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Abstract Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractOutboundEndpointTypeImpl <em>Abstract Outbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractOutboundEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractOutboundEndpointType()
	 * @generated
	 */
	int ABSTRACT_OUTBOUND_ENDPOINT_TYPE = 16;

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
	int ABSTRACT_OUTBOUND_ROUTER_TYPE = 17;

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
	int ABSTRACT_POOLING_PROFILE_TYPE = 18;

	/**
	 * The number of structural features of the '<em>Abstract Pooling Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POOLING_PROFILE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractPropertyExtractorTypeImpl <em>Abstract Property Extractor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractPropertyExtractorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractPropertyExtractorType()
	 * @generated
	 */
	int ABSTRACT_PROPERTY_EXTRACTOR_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Abstract Property Extractor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_EXTRACTOR_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractQueueProfileTypeImpl <em>Abstract Queue Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractQueueProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractQueueProfileType()
	 * @generated
	 */
	int ABSTRACT_QUEUE_PROFILE_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Abstract Queue Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUEUE_PROFILE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractResponseEndpointTypeImpl <em>Abstract Response Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractResponseEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractResponseEndpointType()
	 * @generated
	 */
	int ABSTRACT_RESPONSE_ENDPOINT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONSE_ENDPOINT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Response Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractResponseRouterTypeImpl <em>Abstract Response Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractResponseRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractResponseRouterType()
	 * @generated
	 */
	int ABSTRACT_RESPONSE_ROUTER_TYPE = 22;

	/**
	 * The number of structural features of the '<em>Abstract Response Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONSE_ROUTER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractSecurityFilterTypeImpl <em>Abstract Security Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractSecurityFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractSecurityFilterType()
	 * @generated
	 */
	int ABSTRACT_SECURITY_FILTER_TYPE = 23;

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
	int ABSTRACT_SECURITY_MANAGER_TYPE = 24;

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
	int ABSTRACT_SERVICE_TYPE = 25;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractStorageTypeImpl <em>Abstract Storage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractStorageTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractStorageType()
	 * @generated
	 */
	int ABSTRACT_STORAGE_TYPE = 26;

	/**
	 * The number of structural features of the '<em>Abstract Storage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STORAGE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractTransactionFactoryTypeImpl <em>Abstract Transaction Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractTransactionFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractTransactionFactoryType()
	 * @generated
	 */
	int ABSTRACT_TRANSACTION_FACTORY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_FACTORY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Transaction Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_FACTORY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractTransactionManagerTypeImpl <em>Abstract Transaction Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractTransactionManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractTransactionManagerType()
	 * @generated
	 */
	int ABSTRACT_TRANSACTION_MANAGER_TYPE = 28;

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
	int ABSTRACT_TRANSACTION_TYPE = 29;

	/**
	 * The number of structural features of the '<em>Abstract Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.AbstractTransformerTypeImpl <em>Abstract Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.AbstractTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getAbstractTransformerType()
	 * @generated
	 */
	int ABSTRACT_TRANSFORMER_TYPE = 30;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.BaseContainerContextTypeImpl <em>Base Container Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.BaseContainerContextTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getBaseContainerContextType()
	 * @generated
	 */
	int BASE_CONTAINER_CONTEXT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_CONTEXT_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Base Container Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__INBOUND_ROUTER = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__OUTBOUND_ROUTER = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__RESPONSE_ROUTER = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__CLASS = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE__INITIAL_STATE = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Base Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_SERVICE_TYPE_FEATURE_COUNT = ABSTRACT_SERVICE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CallableEntrypointResolverTypeImpl <em>Callable Entrypoint Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CallableEntrypointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCallableEntrypointResolverType()
	 * @generated
	 */
	int CALLABLE_ENTRYPOINT_RESOLVER_TYPE = 33;

	/**
	 * The number of structural features of the '<em>Callable Entrypoint Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ENTRYPOINT_RESOLVER_TYPE_FEATURE_COUNT = ABSTRACT_ENTRYPOINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.OutboundRouterTypeImpl <em>Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.OutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getOutboundRouterType()
	 * @generated
	 */
	int OUTBOUND_ROUTER_TYPE = 95;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Enable Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Outbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_TYPE_FEATURE_COUNT = ABSTRACT_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl <em>Filtering Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getFilteringOutboundRouterType()
	 * @generated
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE = 69;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ChunkingRouterTypeImpl <em>Chunking Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ChunkingRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getChunkingRouterType()
	 * @generated
	 */
	int CHUNKING_ROUTER_TYPE = 34;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNKING_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CollectionFilterTypeImpl <em>Collection Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CollectionFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCollectionFilterType()
	 * @generated
	 */
	int COLLECTION_FILTER_TYPE = 35;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ConnectionStrategyTypeImpl <em>Connection Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ConnectionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getConnectionStrategyType()
	 * @generated
	 */
	int CONNECTION_STRATEGY_TYPE = 36;

	/**
	 * The number of structural features of the '<em>Connection Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_STRATEGY_TYPE_FEATURE_COUNT = ABSTRACT_CONNECTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 37;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NAME = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ContainerContextTypeImpl <em>Container Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ContainerContextTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getContainerContextType()
	 * @generated
	 */
	int CONTAINER_CONTEXT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONTEXT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONTEXT_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONTEXT_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Container Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONTEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.FilteredInboundRouterTypeImpl <em>Filtered Inbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.FilteredInboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getFilteredInboundRouterType()
	 * @generated
	 */
	int FILTERED_INBOUND_ROUTER_TYPE = 68;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Filtered Inbound Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT = ABSTRACT_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CorrelationRouterTypeImpl <em>Correlation Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorrelationRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCorrelationRouterType()
	 * @generated
	 */
	int CORRELATION_ROUTER_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_ROUTER_TYPE__ABSTRACT_FILTER = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Correlation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_ROUTER_TYPE__CORRELATION_EXPRESSION = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlation Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_ROUTER_TYPE_FEATURE_COUNT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CorrelationAggregatorRouterTypeImpl <em>Correlation Aggregator Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorrelationAggregatorRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCorrelationAggregatorRouterType()
	 * @generated
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = CORRELATION_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE__ABSTRACT_FILTER = CORRELATION_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = CORRELATION_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = CORRELATION_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = CORRELATION_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Correlation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION = CORRELATION_ROUTER_TYPE__CORRELATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE__CLASS = CORRELATION_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Correlation Aggregator Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_AGGREGATOR_ROUTER_TYPE_FEATURE_COUNT = CORRELATION_ROUTER_TYPE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomConnectionStrategyTypeImpl <em>Custom Connection Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomConnectionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomConnectionStrategyType()
	 * @generated
	 */
	int CUSTOM_CONNECTION_STRATEGY_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION_STRATEGY_TYPE__PROPERTY = CONNECTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION_STRATEGY_TYPE__CLASS = CONNECTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Connection Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION_STRATEGY_TYPE_FEATURE_COUNT = CONNECTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomConnectorTypeImpl <em>Custom Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomConnectorType()
	 * @generated
	 */
	int CUSTOM_CONNECTOR_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__PROPERTY = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__SERVICE_OVERRIDES = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CLASS = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE__NAME = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Custom Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTOR_TYPE_FEATURE_COUNT = ABSTRACT_CONNECTOR_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomContainerContextTypeImpl <em>Custom Container Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomContainerContextTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomContainerContextType()
	 * @generated
	 */
	int CUSTOM_CONTAINER_CONTEXT_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTAINER_CONTEXT_TYPE__ANY = BASE_CONTAINER_CONTEXT_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTAINER_CONTEXT_TYPE__CLASS = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTAINER_CONTEXT_TYPE__NAME = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Container Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EncryptionStrategyTypeImpl <em>Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEncryptionStrategyType()
	 * @generated
	 */
	int ENCRYPTION_STRATEGY_TYPE = 64;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomEncryptionStrategyTypeImpl <em>Custom Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomEncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomEncryptionStrategyType()
	 * @generated
	 */
	int CUSTOM_ENCRYPTION_STRATEGY_TYPE = 45;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomEntrypointResolverTypeImpl <em>Custom Entrypoint Resolver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomEntrypointResolverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomEntrypointResolverType()
	 * @generated
	 */
	int CUSTOM_ENTRYPOINT_RESOLVER_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRYPOINT_RESOLVER_TYPE__PROPERTY = ABSTRACT_ENTRYPOINT_RESOLVER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRYPOINT_RESOLVER_TYPE__CLASS = ABSTRACT_ENTRYPOINT_RESOLVER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Entrypoint Resolver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTRYPOINT_RESOLVER_TYPE_FEATURE_COUNT = ABSTRACT_ENTRYPOINT_RESOLVER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ExceptionStrategyTypeImpl <em>Exception Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ExceptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExceptionStrategyType()
	 * @generated
	 */
	int EXCEPTION_STRATEGY_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT = ABSTRACT_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = EXCEPTION_STRATEGY_TYPE__ABSTRACT_OUTBOUND_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__PROPERTY = EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE__CLASS = EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Exception Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT = EXCEPTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ForwardingCatchAllStrategyTypeImpl <em>Forwarding Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ForwardingCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getForwardingCatchAllStrategyType()
	 * @generated
	 */
	int FORWARDING_CATCH_ALL_STRATEGY_TYPE = 71;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomForwardingCatchAllStrategyTypeImpl <em>Custom Forwarding Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomForwardingCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomForwardingCatchAllStrategyType()
	 * @generated
	 */
	int CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE = 49;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomInboundRouterTypeImpl <em>Custom Inbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomInboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomInboundRouterType()
	 * @generated
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE = 50;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomOutboundRouterTypeImpl <em>Custom Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomOutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomOutboundRouterType()
	 * @generated
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE = 51;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomPropertyExtractorTypeImpl <em>Custom Property Extractor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomPropertyExtractorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomPropertyExtractorType()
	 * @generated
	 */
	int CUSTOM_PROPERTY_EXTRACTOR_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_EXTRACTOR_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_EXTRACTOR_TYPE__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Custom Property Extractor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_EXTRACTOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ResponseRouterTypeImpl <em>Response Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ResponseRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getResponseRouterType()
	 * @generated
	 */
	int RESPONSE_ROUTER_TYPE = 109;

	/**
	 * The feature id for the '<em><b>Abstract Response Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP = ABSTRACT_RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Response Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT = ABSTRACT_RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = ABSTRACT_RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = ABSTRACT_RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = ABSTRACT_RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Response Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_TYPE_FEATURE_COUNT = ABSTRACT_RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomResponseRouterTypeImpl <em>Custom Response Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomResponseRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomResponseRouterType()
	 * @generated
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Abstract Response Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP = RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Response Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT = RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE__PROPERTY = RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE__CLASS = RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Response Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESPONSE_ROUTER_TYPE_FEATURE_COUNT = RESPONSE_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SecurityProviderTypeImpl <em>Security Provider Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SecurityProviderTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSecurityProviderType()
	 * @generated
	 */
	int SECURITY_PROVIDER_TYPE = 115;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomSecurityProviderTypeImpl <em>Custom Security Provider Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomSecurityProviderTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomSecurityProviderType()
	 * @generated
	 */
	int CUSTOM_SECURITY_PROVIDER_TYPE = 54;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomTransactionFactoryTypeImpl <em>Custom Transaction Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomTransactionFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomTransactionFactoryType()
	 * @generated
	 */
	int CUSTOM_TRANSACTION_FACTORY_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_FACTORY_TYPE__NAME = ABSTRACT_TRANSACTION_FACTORY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_FACTORY_TYPE__PROPERTY = ABSTRACT_TRANSACTION_FACTORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_FACTORY_TYPE__CLASS = ABSTRACT_TRANSACTION_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Transaction Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_FACTORY_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_FACTORY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.JndiTransactionManagerTypeImpl <em>Jndi Transaction Manager Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.JndiTransactionManagerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getJndiTransactionManagerType()
	 * @generated
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE__ENVIRONMENT = ABSTRACT_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jndi Transaction Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE__ENVIRONMENT = JNDI_TRANSACTION_MANAGER_TYPE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE__PROPERTY = JNDI_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE__CLASS = JNDI_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Transaction Manager Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT = JNDI_TRANSACTION_MANAGER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.CustomTransformerTypeImpl <em>Custom Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CustomTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCustomTransformerType()
	 * @generated
	 */
	int CUSTOM_TRANSFORMER_TYPE = 57;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PooledObjectFactoryTypeImpl <em>Pooled Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PooledObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPooledObjectFactoryType()
	 * @generated
	 */
	int POOLED_OBJECT_FACTORY_TYPE = 100;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DefaultComponentTypeImpl <em>Default Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DefaultComponentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDefaultComponentType()
	 * @generated
	 */
	int DEFAULT_COMPONENT_TYPE = 58;

	/**
	 * The number of structural features of the '<em>Default Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_COMPONENT_TYPE_FEATURE_COUNT = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SedaModelTypeImpl <em>Seda Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SedaModelTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSedaModelType()
	 * @generated
	 */
	int SEDA_MODEL_TYPE = 116;

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
	 * The feature id for the '<em><b>Abstract Entrypoint Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP = ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER = ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE__CLASS = ABSTRACT_MODEL_TYPE__CLASS;

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
	 * The number of structural features of the '<em>Seda Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_MODEL_TYPE_FEATURE_COUNT = ABSTRACT_MODEL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DefaultModelTypeImpl <em>Default Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DefaultModelTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDefaultModelType()
	 * @generated
	 */
	int DEFAULT_MODEL_TYPE = 59;

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
	 * The feature id for the '<em><b>Abstract Entrypoint Resolver Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP = SEDA_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER = SEDA_MODEL_TYPE__ABSTRACT_ENTRYPOINT_RESOLVER;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE__CLASS = SEDA_MODEL_TYPE__CLASS;

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
	 * The number of structural features of the '<em>Default Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_MODEL_TYPE_FEATURE_COUNT = SEDA_MODEL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SedaServiceTypeImpl <em>Seda Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SedaServiceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSedaServiceType()
	 * @generated
	 */
	int SEDA_SERVICE_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__NAME = BASE_SERVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__INBOUND_ROUTER = BASE_SERVICE_TYPE__INBOUND_ROUTER;

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
	 * The feature id for the '<em><b>Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__OUTBOUND_ROUTER = BASE_SERVICE_TYPE__OUTBOUND_ROUTER;

	/**
	 * The feature id for the '<em><b>Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__RESPONSE_ROUTER = BASE_SERVICE_TYPE__RESPONSE_ROUTER;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEDA_SERVICE_TYPE__CLASS = BASE_SERVICE_TYPE__CLASS;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DefaultServiceTypeImpl <em>Default Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DefaultServiceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDefaultServiceType()
	 * @generated
	 */
	int DEFAULT_SERVICE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__NAME = SEDA_SERVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__INBOUND_ROUTER = SEDA_SERVICE_TYPE__INBOUND_ROUTER;

	/**
	 * The feature id for the '<em><b>Abstract Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP = SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_COMPONENT = SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__OUTBOUND_ROUTER = SEDA_SERVICE_TYPE__OUTBOUND_ROUTER;

	/**
	 * The feature id for the '<em><b>Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__RESPONSE_ROUTER = SEDA_SERVICE_TYPE__RESPONSE_ROUTER;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = SEDA_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY = SEDA_SERVICE_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__CLASS = SEDA_SERVICE_TYPE__CLASS;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__INITIAL_STATE = SEDA_SERVICE_TYPE__INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Abstract Component Threading Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP = SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE = SEDA_SERVICE_TYPE__ABSTRACT_COMPONENT_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP = SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE = SEDA_SERVICE_TYPE__ABSTRACT_QUEUE_PROFILE;

	/**
	 * The feature id for the '<em><b>Queue Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE__QUEUE_TIMEOUT = SEDA_SERVICE_TYPE__QUEUE_TIMEOUT;

	/**
	 * The number of structural features of the '<em>Default Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SERVICE_TYPE_FEATURE_COUNT = SEDA_SERVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DescriptionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.DocumentRootImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 62;

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
	 * The feature id for the '<em><b>Abstract Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_BINDING = 3;

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
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_CONNECTION_STRATEGY = 7;

	/**
	 * The feature id for the '<em><b>Abstract Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Abstract Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_ENTRYPOINT_RESOLVER = 9;

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
	 * The feature id for the '<em><b>Abstract Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OBJECT_FACTORY = 17;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ENDPOINT = 18;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ROUTER = 19;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_POOLING_PROFILE = 20;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_PROPERTY_EXTRACTOR = 21;

	/**
	 * The feature id for the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_QUEUE_PROFILE = 22;

	/**
	 * The feature id for the '<em><b>Abstract Response Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_RESPONSE_ENDPOINT = 23;

	/**
	 * The feature id for the '<em><b>Abstract Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_RESPONSE_ROUTER = 24;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SECURITY_FILTER = 25;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SECURITY_MANAGER = 26;

	/**
	 * The feature id for the '<em><b>Abstract Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SERVICE = 27;

	/**
	 * The feature id for the '<em><b>Abstract Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_STORAGE = 28;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSACTION = 29;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSACTION_FACTORY = 30;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER = 31;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TRANSFORMER = 32;

	/**
	 * The feature id for the '<em><b>And Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AND_FILTER = 33;

	/**
	 * The feature id for the '<em><b>Bean Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR = 34;

	/**
	 * The feature id for the '<em><b>Bridge Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BRIDGE_COMPONENT = 35;

	/**
	 * The feature id for the '<em><b>Callable Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALLABLE_ENTRYPOINT_RESOLVER = 36;

	/**
	 * The feature id for the '<em><b>Chaining Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHAINING_ROUTER = 37;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT = 38;

	/**
	 * The feature id for the '<em><b>Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE = 39;

	/**
	 * The feature id for the '<em><b>Correlation Aggregator Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_AGGREGATOR_ROUTER = 40;

	/**
	 * The feature id for the '<em><b>Correlation Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR = 41;

	/**
	 * The feature id for the '<em><b>Correlation Resequencer Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER = 42;

	/**
	 * The feature id for the '<em><b>Custom Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY = 43;

	/**
	 * The feature id for the '<em><b>Custom Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY = 44;

	/**
	 * The feature id for the '<em><b>Custom Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CONNECTOR = 45;

	/**
	 * The feature id for the '<em><b>Custom Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_CONTAINER = 46;

	/**
	 * The feature id for the '<em><b>Custom Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_ENTRYPOINT_RESOLVER = 47;

	/**
	 * The feature id for the '<em><b>Custom Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY = 48;

	/**
	 * The feature id for the '<em><b>Custom Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_FILTER = 49;

	/**
	 * The feature id for the '<em><b>Custom Forwarding Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY = 50;

	/**
	 * The feature id for the '<em><b>Custom Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER = 51;

	/**
	 * The feature id for the '<em><b>Custom Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER = 52;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR = 53;

	/**
	 * The feature id for the '<em><b>Custom Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_RESPONSE_ROUTER = 54;

	/**
	 * The feature id for the '<em><b>Custom Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_TRANSACTION_FACTORY = 55;

	/**
	 * The feature id for the '<em><b>Custom Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER = 56;

	/**
	 * The feature id for the '<em><b>Custom Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_TRANSFORMER = 57;

	/**
	 * The feature id for the '<em><b>Default Connector Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY = 58;

	/**
	 * The feature id for the '<em><b>Default Service Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY = 59;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 60;

	/**
	 * The feature id for the '<em><b>Echo Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ECHO_COMPONENT = 61;

	/**
	 * The feature id for the '<em><b>Ejb Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EJB_CONTAINER = 62;

	/**
	 * The feature id for the '<em><b>Encryption Security Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER = 63;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT = 64;

	/**
	 * The feature id for the '<em><b>Endpoint Selector Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER = 65;

	/**
	 * The feature id for the '<em><b>Exception Based Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER = 66;

	/**
	 * The feature id for the '<em><b>Exception Type Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER = 67;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 68;

	/**
	 * The feature id for the '<em><b>Filtering Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTERING_ROUTER = 69;

	/**
	 * The feature id for the '<em><b>Forwarding Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY = 70;

	/**
	 * The feature id for the '<em><b>Forwarding Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORWARDING_ROUTER = 71;

	/**
	 * The feature id for the '<em><b>Hivemind Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIVEMIND_CONTAINER = 72;

	/**
	 * The feature id for the '<em><b>Idempotent Receiver Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER = 73;

	/**
	 * The feature id for the '<em><b>Idempotent Secure Hash Receiver Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER = 74;

	/**
	 * The feature id for the '<em><b>Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INBOUND_ENDPOINT = 75;

	/**
	 * The feature id for the '<em><b>Inbound Pass Through Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER = 76;

	/**
	 * The feature id for the '<em><b>Jndi Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JNDI_CONTAINER = 77;

	/**
	 * The feature id for the '<em><b>List Message Splitter Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER = 78;

	/**
	 * The feature id for the '<em><b>Log Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOG_COMPONENT = 79;

	/**
	 * The feature id for the '<em><b>Logging Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY = 80;

	/**
	 * The feature id for the '<em><b>Map Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR = 81;

	/**
	 * The feature id for the '<em><b>Message Chunking Aggregator Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER = 82;

	/**
	 * The feature id for the '<em><b>Message Chunking Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER = 83;

	/**
	 * The feature id for the '<em><b>Message Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR = 84;

	/**
	 * The feature id for the '<em><b>Message Property Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER = 85;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 86;

	/**
	 * The feature id for the '<em><b>Mule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULE = 87;

	/**
	 * The feature id for the '<em><b>Mule Unsafe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULE_UNSAFE = 88;

	/**
	 * The feature id for the '<em><b>Multicasting Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTICASTING_ROUTER = 89;

	/**
	 * The feature id for the '<em><b>No Args Call Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NO_ARGS_CALL_COMPONENT = 90;

	/**
	 * The feature id for the '<em><b>Not Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOT_FILTER = 91;

	/**
	 * The feature id for the '<em><b>Null Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NULL_COMPONENT = 92;

	/**
	 * The feature id for the '<em><b>Or Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OR_FILTER = 93;

	/**
	 * The feature id for the '<em><b>Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTBOUND_ENDPOINT = 94;

	/**
	 * The feature id for the '<em><b>Outbound Pass Through Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER = 95;

	/**
	 * The feature id for the '<em><b>Pass Through Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PASS_THROUGH_COMPONENT = 96;

	/**
	 * The feature id for the '<em><b>Payload Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYLOAD_PROPERTY_EXTRACTOR = 97;

	/**
	 * The feature id for the '<em><b>Payload Type Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER = 98;

	/**
	 * The feature id for the '<em><b>Pico Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PICO_CONTAINER = 99;

	/**
	 * The feature id for the '<em><b>Plexus Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLEXUS_CONTAINER = 100;

	/**
	 * The feature id for the '<em><b>Pooled Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POOLED_OBJECT = 101;

	/**
	 * The feature id for the '<em><b>Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POOLING_PROFILE = 102;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTIES = 103;

	/**
	 * The feature id for the '<em><b>Properties Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTIES_CONTAINER = 104;

	/**
	 * The feature id for the '<em><b>Prototype Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTOTYPE_OBJECT = 105;

	/**
	 * The feature id for the '<em><b>Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUEUE_PROFILE = 106;

	/**
	 * The feature id for the '<em><b>Regex Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGEX_FILTER = 107;

	/**
	 * The feature id for the '<em><b>Response Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESPONSE_ENDPOINT = 108;

	/**
	 * The feature id for the '<em><b>Retry Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY = 109;

	/**
	 * The feature id for the '<em><b>Rmi Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RMI_CONTAINER = 110;

	/**
	 * The feature id for the '<em><b>Security Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_MANAGER = 111;

	/**
	 * The feature id for the '<em><b>Seda Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEDA_MODEL = 112;

	/**
	 * The feature id for the '<em><b>Selective Consumer Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER = 113;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 114;

	/**
	 * The feature id for the '<em><b>Single Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SINGLE_RESPONSE_ROUTER = 115;

	/**
	 * The feature id for the '<em><b>Singleton Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SINGLETON_OBJECT = 116;

	/**
	 * The feature id for the '<em><b>Static Recipient List Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER = 117;

	/**
	 * The feature id for the '<em><b>Template Endpoint Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER = 118;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION = 119;

	/**
	 * The feature id for the '<em><b>Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_FACTORY = 120;

	/**
	 * The feature id for the '<em><b>Transaction Manager Jboss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_MANAGER_JBOSS = 121;

	/**
	 * The feature id for the '<em><b>Transaction Manager Jndi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_MANAGER_JNDI = 122;

	/**
	 * The feature id for the '<em><b>Transaction Manager Jrun</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_MANAGER_JRUN = 123;

	/**
	 * The feature id for the '<em><b>Transaction Manager Resin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_MANAGER_RESIN = 124;

	/**
	 * The feature id for the '<em><b>Transaction Manager Weblogic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBLOGIC = 125;

	/**
	 * The feature id for the '<em><b>Transaction Manager Websphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBSPHERE = 126;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER = 127;

	/**
	 * The feature id for the '<em><b>Transformer Append String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_APPEND_STRING = 128;

	/**
	 * The feature id for the '<em><b>Transformer Base64 Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_BASE64_DECODER = 129;

	/**
	 * The feature id for the '<em><b>Transformer Base64 Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_BASE64_ENCODER = 130;

	/**
	 * The feature id for the '<em><b>Transformer Byte Array To Hex String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_HEX_STRING = 131;

	/**
	 * The feature id for the '<em><b>Transformer Byte Array To Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_OBJECT = 132;

	/**
	 * The feature id for the '<em><b>Transformer Byte Array To Serializable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_SERIALIZABLE = 133;

	/**
	 * The feature id for the '<em><b>Transformer Byte Array To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_STRING = 134;

	/**
	 * The feature id for the '<em><b>Transformer Decrypt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_DECRYPT = 135;

	/**
	 * The feature id for the '<em><b>Transformer Encrypt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_ENCRYPT = 136;

	/**
	 * The feature id for the '<em><b>Transformer Gzip Compress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_GZIP_COMPRESS = 137;

	/**
	 * The feature id for the '<em><b>Transformer Gzip Uncompress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_GZIP_UNCOMPRESS = 138;

	/**
	 * The feature id for the '<em><b>Transformer Hex Sting To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_HEX_STING_TO_BYTE_ARRAY = 139;

	/**
	 * The feature id for the '<em><b>Transformer Message Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_MESSAGE_PROPERTIES = 140;

	/**
	 * The feature id for the '<em><b>Transformer No Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_NO_ACTION = 141;

	/**
	 * The feature id for the '<em><b>Transformer Object To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_BYTE_ARRAY = 142;

	/**
	 * The feature id for the '<em><b>Transformer Object To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_STRING = 143;

	/**
	 * The feature id for the '<em><b>Transformer Serializable To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_SERIALIZABLE_TO_BYTE_ARRAY = 144;

	/**
	 * The feature id for the '<em><b>Transformer String To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_STRING_TO_BYTE_ARRAY = 145;

	/**
	 * The feature id for the '<em><b>Transformer Uc Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_UC_DECODER = 146;

	/**
	 * The feature id for the '<em><b>Transformer Uc Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_UC_ENCODER = 147;

	/**
	 * The feature id for the '<em><b>Transformer Uu Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_UU_DECODER = 148;

	/**
	 * The feature id for the '<em><b>Transformer Uu Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_UU_ENCODER = 149;

	/**
	 * The feature id for the '<em><b>Transformer Xml Entity Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_DECODER = 150;

	/**
	 * The feature id for the '<em><b>Transformer Xml Entity Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_ENCODER = 151;

	/**
	 * The feature id for the '<em><b>Wildcard Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WILDCARD_FILTER = 152;

	/**
	 * The feature id for the '<em><b>Wire Tap Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WIRE_TAP_ROUTER = 153;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 154;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EncryptionSecurityFilterTypeImpl <em>Encryption Security Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EncryptionSecurityFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEncryptionSecurityFilterType()
	 * @generated
	 */
	int ENCRYPTION_SECURITY_FILTER_TYPE = 63;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EndpointSelectorRouterTypeImpl <em>Endpoint Selector Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EndpointSelectorRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEndpointSelectorRouterType()
	 * @generated
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE = 65;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The feature id for the '<em><b>Selector Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE__SELECTOR_PROPERTY = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Endpoint Selector Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_SELECTOR_ROUTER_TYPE_FEATURE_COUNT = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.EnvironmentPropertyTypeImpl <em>Environment Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.EnvironmentPropertyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEnvironmentPropertyType()
	 * @generated
	 */
	int ENVIRONMENT_PROPERTY_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Environment Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.FilterRefTypeImpl <em>Filter Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.FilterRefTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getFilterRefType()
	 * @generated
	 */
	int FILTER_REF_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_REF_TYPE__NAME = ABSTRACT_FILTER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_REF_TYPE__NOT = ABSTRACT_FILTER_TYPE__NOT;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_REF_TYPE__REF = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_REF_TYPE_FEATURE_COUNT = ABSTRACT_FILTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ForwardingRouterTypeImpl <em>Forwarding Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ForwardingRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getForwardingRouterType()
	 * @generated
	 */
	int FORWARDING_ROUTER_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE__ABSTRACT_FILTER_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE__ABSTRACT_FILTER = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forwarding Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARDING_ROUTER_TYPE_FEATURE_COUNT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl <em>Generic Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.GenericObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getGenericObjectFactoryType()
	 * @generated
	 */
	int GENERIC_OBJECT_FACTORY_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__PROPERTIES = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__CLASS = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__FACTORY_REF = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__INSTANCE_REF = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE__SCOPE = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Generic Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OBJECT_FACTORY_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.GlobalEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getGlobalEndpointType()
	 * @generated
	 */
	int GLOBAL_ENDPOINT_TYPE = 74;

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
	 * The feature id for the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__PROPERTIES = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ADDRESS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Create Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__CREATE_CONNECTOR = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__ENCODING = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REF = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Global Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT = ABSTRACT_GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.IdempotentReceiverTypeImpl <em>Idempotent Receiver Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.IdempotentReceiverTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getIdempotentReceiverType()
	 * @generated
	 */
	int IDEMPOTENT_RECEIVER_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_FILTER_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_FILTER = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_FILTER;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Abstract Storage Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE_GROUP = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE__ABSTRACT_STORAGE = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Idempotent Receiver Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEMPOTENT_RECEIVER_TYPE_FEATURE_COUNT = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.InboundEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInboundEndpointType()
	 * @generated
	 */
	int INBOUND_ENDPOINT_TYPE = 76;

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
	 * The feature id for the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__PROPERTIES = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ADDRESS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__CONNECTOR_REF = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Create Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__CREATE_CONNECTOR = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__ENCODING = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REF = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SYNCHRONOUS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Inbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE_FEATURE_COUNT = ABSTRACT_INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl <em>Inbound Router Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.InboundRouterCollectionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInboundRouterCollectionType()
	 * @generated
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Router Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Inbound Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER = 5;

	/**
	 * The feature id for the '<em><b>Match All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL = 6;

	/**
	 * The number of structural features of the '<em>Inbound Router Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ROUTER_COLLECTION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.IocContainerContextTypeImpl <em>Ioc Container Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.IocContainerContextTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getIocContainerContextType()
	 * @generated
	 */
	int IOC_CONTAINER_CONTEXT_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_CONTAINER_CONTEXT_TYPE__ANY = BASE_CONTAINER_CONTEXT_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Config Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_CONTAINER_CONTEXT_TYPE__CONFIG_LOCATION = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_CONTAINER_CONTEXT_TYPE__CONFIGURATION_TEXT = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ioc Container Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOC_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.JndiConnectorTypeImpl <em>Jndi Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.JndiConnectorTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getJndiConnectorType()
	 * @generated
	 */
	int JNDI_CONNECTOR_TYPE = 79;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__NAME = CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Jndi Provider Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES = CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jndi Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF = CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jndi Initial Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY = CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jndi Provider Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL = CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jndi Url Pkg Prefixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES = CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Jndi Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_CONNECTOR_TYPE_FEATURE_COUNT = CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ListOrSetTypeImpl <em>List Or Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ListOrSetTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getListOrSetType()
	 * @generated
	 */
	int LIST_OR_SET_TYPE = 81;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.LoggingCatchAllStrategyTypeImpl <em>Logging Catch All Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.LoggingCatchAllStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getLoggingCatchAllStrategyType()
	 * @generated
	 */
	int LOGGING_CATCH_ALL_STRATEGY_TYPE = 82;

	/**
	 * The number of structural features of the '<em>Logging Catch All Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT = ABSTRACT_CATCH_ALL_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MapTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 83;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl <em>Message Properties Transformer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMessagePropertiesTransformerType()
	 * @generated
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE = 84;

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
	 * The feature id for the '<em><b>Delete Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Add Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Properties Transformer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PROPERTIES_TRANSFORMER_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MessageSplitterOutboundRouterTypeImpl <em>Message Splitter Outbound Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MessageSplitterOutboundRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMessageSplitterOutboundRouterType()
	 * @generated
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE = 85;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MuleAdminAgentTypeImpl <em>Mule Admin Agent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MuleAdminAgentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMuleAdminAgentType()
	 * @generated
	 */
	int MULE_ADMIN_AGENT_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_ADMIN_AGENT_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Server Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_ADMIN_AGENT_TYPE__SERVER_URI = 1;

	/**
	 * The number of structural features of the '<em>Mule Admin Agent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_ADMIN_AGENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MuleManagementContextTypeImpl <em>Mule Management Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MuleManagementContextTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMuleManagementContextType()
	 * @generated
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Default Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Default Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Default Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE = 2;

	/**
	 * The feature id for the '<em><b>Default Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE = 3;

	/**
	 * The feature id for the '<em><b>Abstract Storage Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE = 5;

	/**
	 * The feature id for the '<em><b>Default Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY = 6;

	/**
	 * The feature id for the '<em><b>Cluster Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__CLUSTER_ID = 7;

	/**
	 * The feature id for the '<em><b>Default Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_ENCODING = 8;

	/**
	 * The feature id for the '<em><b>Default Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC = 9;

	/**
	 * The feature id for the '<em><b>Default Synchronous Endpoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS = 10;

	/**
	 * The feature id for the '<em><b>Default Synchronous Event Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT = 11;

	/**
	 * The feature id for the '<em><b>Default Transaction Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_TRANSACTION_TIMEOUT = 12;

	/**
	 * The feature id for the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__DOMAIN_ID = 13;

	/**
	 * The feature id for the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__SERVER_ID = 14;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY = 15;

	/**
	 * The number of structural features of the '<em>Mule Management Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_MANAGEMENT_CONTEXT_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MuleTypeImpl <em>Mule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MuleTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMuleType()
	 * @generated
	 */
	int MULE_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Environment Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ENVIRONMENT_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Admin Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ADMIN_AGENT = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Abstract Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_EXTENSION_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Abstract Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_EXTENSION = 6;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_SECURITY_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Factory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY = 12;

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
	 * The feature id for the '<em><b>Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__BEANS = 23;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__BEAN = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE__NAME = 25;

	/**
	 * The number of structural features of the '<em>Mule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.MuleUnsafeTypeImpl <em>Mule Unsafe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.MuleUnsafeTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getMuleUnsafeType()
	 * @generated
	 */
	int MULE_UNSAFE_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Environment Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ENVIRONMENT_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Admin Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ADMIN_AGENT = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Abstract Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_EXTENSION_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Abstract Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_EXTENSION = 6;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Abstract Security Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_SECURITY_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_TRANSACTION_MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Factory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_TRANSACTION_FACTORY = 12;

	/**
	 * The feature id for the '<em><b>Abstract Connector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_CONNECTOR_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Abstract Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Abstract Global Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_GLOBAL_ENDPOINT_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Abstract Global Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_GLOBAL_ENDPOINT = 16;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_TRANSFORMER_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_TRANSFORMER = 18;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_FILTER_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Abstract Model Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_MODEL_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Abstract Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ABSTRACT_MODEL = 22;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__ANY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE__NAME = 24;

	/**
	 * The number of structural features of the '<em>Mule Unsafe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULE_UNSAFE_TYPE_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.NoArgsCallDelegateClassTypeImpl <em>No Args Call Delegate Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.NoArgsCallDelegateClassTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNoArgsCallDelegateClassType()
	 * @generated
	 */
	int NO_ARGS_CALL_DELEGATE_CLASS_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Delegate Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Delegate Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_DELEGATE_CLASS_TYPE__DELEGATE_METHOD = 1;

	/**
	 * The number of structural features of the '<em>No Args Call Delegate Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_DELEGATE_CLASS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.NoArgsCallDelegateInstanceTypeImpl <em>No Args Call Delegate Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.NoArgsCallDelegateInstanceTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNoArgsCallDelegateInstanceType()
	 * @generated
	 */
	int NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Delegate Instance Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_INSTANCE_REF = 0;

	/**
	 * The feature id for the '<em><b>Delegate Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE__DELEGATE_METHOD = 1;

	/**
	 * The number of structural features of the '<em>No Args Call Delegate Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.NoArgsCallWrapperTypeImpl <em>No Args Call Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.NoArgsCallWrapperTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getNoArgsCallWrapperType()
	 * @generated
	 */
	int NO_ARGS_CALL_WRAPPER_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Delegate Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_CLASS = DEFAULT_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delegate Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_WRAPPER_TYPE__DELEGATE_INSTANCE = DEFAULT_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>No Args Call Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ARGS_CALL_WRAPPER_TYPE_FEATURE_COUNT = DEFAULT_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.OutboundEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getOutboundEndpointType()
	 * @generated
	 */
	int OUTBOUND_ENDPOINT_TYPE = 93;

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
	 * The feature id for the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__PROPERTIES = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ADDRESS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Create Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__CREATE_CONNECTOR = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__ENCODING = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REF = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Outbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT = ABSTRACT_OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.OutboundRouterCollectionTypeImpl <em>Outbound Router Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.OutboundRouterCollectionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getOutboundRouterCollectionType()
	 * @generated
	 */
	int OUTBOUND_ROUTER_COLLECTION_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Router Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Match All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL = 4;

	/**
	 * The number of structural features of the '<em>Outbound Router Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ROUTER_COLLECTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PasswordEncryptionStrategyTypeImpl <em>Password Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PasswordEncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPasswordEncryptionStrategyType()
	 * @generated
	 */
	int PASSWORD_ENCRYPTION_STRATEGY_TYPE = 96;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PatternFilterTypeImpl <em>Pattern Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PatternFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPatternFilterType()
	 * @generated
	 */
	int PATTERN_FILTER_TYPE = 97;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PojoBindingTypeImpl <em>Pojo Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PojoBindingTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPojoBindingType()
	 * @generated
	 */
	int POJO_BINDING_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP = ABSTRACT_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT = ABSTRACT_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__INTERFACE = ABSTRACT_BINDING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE__METHOD = ABSTRACT_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pojo Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_BINDING_TYPE_FEATURE_COUNT = ABSTRACT_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PojoComponentTypeImpl <em>Pojo Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PojoComponentTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPojoComponentType()
	 * @generated
	 */
	int POJO_COMPONENT_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY_GROUP = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_COMPONENT_TYPE__ABSTRACT_OBJECT_FACTORY = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_COMPONENT_TYPE__BINDING = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_COMPONENT_TYPE__CLASS = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pojo Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_COMPONENT_TYPE_FEATURE_COUNT = ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_OBJECT_FACTORY_TYPE__PROPERTIES = ABSTRACT_OBJECT_FACTORY_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE_GROUP = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_OBJECT_FACTORY_TYPE__ABSTRACT_POOLING_PROFILE = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_OBJECT_FACTORY_TYPE__CLASS = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pooled Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLED_OBJECT_FACTORY_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PoolingProfileTypeImpl <em>Pooling Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PoolingProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPoolingProfileType()
	 * @generated
	 */
	int POOLING_PROFILE_TYPE = 101;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PropertiesContainerContextTypeImpl <em>Properties Container Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PropertiesContainerContextTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPropertiesContainerContextType()
	 * @generated
	 */
	int PROPERTIES_CONTAINER_CONTEXT_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONTAINER_CONTEXT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Enable Templates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONTAINER_CONTEXT_TYPE__ENABLE_TEMPLATES = 1;

	/**
	 * The feature id for the '<em><b>Include System Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONTAINER_CONTEXT_TYPE__INCLUDE_SYSTEM_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONTAINER_CONTEXT_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Properties Container Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.PrototypeObjectFactoryTypeImpl <em>Prototype Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.PrototypeObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPrototypeObjectFactoryType()
	 * @generated
	 */
	int PROTOTYPE_OBJECT_FACTORY_TYPE = 103;

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
	int QUEUE_PROFILE_TYPE = 104;

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
	int REFERENCE_TYPE = 105;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ReplyToTypeImpl <em>Reply To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ReplyToTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getReplyToType()
	 * @generated
	 */
	int REPLY_TO_TYPE = 106;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ResponseEndpointTypeImpl <em>Response Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ResponseEndpointTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getResponseEndpointType()
	 * @generated
	 */
	int RESPONSE_ENDPOINT_TYPE = 107;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__NAME = ABSTRACT_RESPONSE_ENDPOINT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__GROUP = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__TRANSFORMERS = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_TRANSACTION = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_FILTER = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY_GROUP = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ABSTRACT_CONNECTION_STRATEGY = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__PROPERTIES = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ADDRESS = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__CONNECTOR_REF = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Create Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__CREATE_CONNECTOR = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__ENCODING = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__REF = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__SYNCHRONOUS = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE__TRANSFORMER_REFS = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Response Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT = ABSTRACT_RESPONSE_ENDPOINT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl <em>Response Router Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ResponseRouterCollectionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getResponseRouterCollectionType()
	 * @generated
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE = 108;

	/**
	 * The feature id for the '<em><b>Abstract Response Endpoint Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Response Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Abstract Response Router Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Abstract Response Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_RESPONSE_ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__ABSTRACT_TRANSFORMER = 5;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__TIMEOUT = 6;

	/**
	 * The feature id for the '<em><b>Transformer Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE__TRANSFORMER_REF = 7;

	/**
	 * The number of structural features of the '<em>Response Router Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ROUTER_COLLECTION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ResponseTransformersTypeImpl <em>Response Transformers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ResponseTransformersTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getResponseTransformersType()
	 * @generated
	 */
	int RESPONSE_TRANSFORMERS_TYPE = 110;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.RetryConnectionStrategyTypeImpl <em>Retry Connection Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.RetryConnectionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getRetryConnectionStrategyType()
	 * @generated
	 */
	int RETRY_CONNECTION_STRATEGY_TYPE = 111;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_CONNECTION_STRATEGY_TYPE__RETRY_COUNT = CONNECTION_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retry Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_CONNECTION_STRATEGY_TYPE__RETRY_FREQUENCY = CONNECTION_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Retry Connection Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_CONNECTION_STRATEGY_TYPE_FEATURE_COUNT = CONNECTION_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.RmiContainerContextTypeImpl <em>Rmi Container Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.RmiContainerContextTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getRmiContainerContextType()
	 * @generated
	 */
	int RMI_CONTAINER_CONTEXT_TYPE = 112;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMI_CONTAINER_CONTEXT_TYPE__ANY = BASE_CONTAINER_CONTEXT_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMI_CONTAINER_CONTEXT_TYPE__NAME = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMI_CONTAINER_CONTEXT_TYPE__SECURITY_MANAGER = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMI_CONTAINER_CONTEXT_TYPE__SECURITY_POLICY = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rmi Container Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMI_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT = BASE_CONTAINER_CONTEXT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SecretKeyEncryptionStrategyTypeImpl <em>Secret Key Encryption Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SecretKeyEncryptionStrategyTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSecretKeyEncryptionStrategyType()
	 * @generated
	 */
	int SECRET_KEY_ENCRYPTION_STRATEGY_TYPE = 113;

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
	int SECURITY_MANAGER_TYPE = 114;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl <em>Selective Consumer Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSelectiveConsumerRouterType()
	 * @generated
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE = 118;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The feature id for the '<em><b>Transformer First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_FIRST = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS = FILTERED_INBOUND_ROUTER_TYPE_FEATURE_COUNT + 3;

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
	int SERVICE_OVERRIDES_TYPE = 119;

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
	 * The feature id for the '<em><b>Stream Message Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER = 8;

	/**
	 * The feature id for the '<em><b>Transacted Message Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER = 9;

	/**
	 * The number of structural features of the '<em>Service Overrides Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERRIDES_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.SingletonObjectFactoryTypeImpl <em>Singleton Object Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.SingletonObjectFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSingletonObjectFactoryType()
	 * @generated
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE = 120;

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
	 * The feature id for the '<em><b>Instance Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE__INSTANCE_REF = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Singleton Object Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_OBJECT_FACTORY_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_FACTORY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl <em>Static Recipient List Router Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getStaticRecipientListRouterType()
	 * @generated
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE = 121;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERING_OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The feature id for the '<em><b>Recipients Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recipients Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Recipient List Router Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_RECIPIENT_LIST_ROUTER_TYPE_FEATURE_COUNT = FILTERING_OUTBOUND_ROUTER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.ThreadingProfileTypeImpl <em>Threading Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.ThreadingProfileTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getThreadingProfileType()
	 * @generated
	 */
	int THREADING_PROFILE_TYPE = 122;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__NAME = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pool Exhausted Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thread TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__THREAD_TTL = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thread Wait Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Threading Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREADING_PROFILE_TYPE_FEATURE_COUNT = ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TlsClientKeyStoreTypeImpl <em>Tls Client Key Store Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TlsClientKeyStoreTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTlsClientKeyStoreType()
	 * @generated
	 */
	int TLS_CLIENT_KEY_STORE_TYPE = 123;

	/**
	 * The feature id for the '<em><b>Client Key Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE = 0;

	/**
	 * The feature id for the '<em><b>Client Key Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Client Key Store Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_CLIENT_KEY_STORE_TYPE__CLIENT_KEY_STORE_TYPE = 2;

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
	int TLS_KEY_STORE_TYPE = 124;

	/**
	 * The feature id for the '<em><b>Key Manager Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__KEY_MANAGER_ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Key Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__KEY_PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Key Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__KEY_STORE = 2;

	/**
	 * The feature id for the '<em><b>Key Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__KEY_STORE_PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Key Store Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_KEY_STORE_TYPE__KEY_STORE_TYPE = 4;

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
	int TLS_PROTOCOL_HANDLER = 125;

	/**
	 * The feature id for the '<em><b>Protocol Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_PROTOCOL_HANDLER__PROTOCOL_HANDLER = 0;

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
	int TLS_TRUST_STORE_TYPE = 127;

	/**
	 * The feature id for the '<em><b>Trust Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_TRUST_STORE_TYPE__TRUST_STORE = 0;

	/**
	 * The feature id for the '<em><b>Trust Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD = 1;

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
	int TLS_SERVER_TRUST_STORE_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Trust Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE = TLS_TRUST_STORE_TYPE__TRUST_STORE;

	/**
	 * The feature id for the '<em><b>Trust Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD = TLS_TRUST_STORE_TYPE__TRUST_STORE_PASSWORD;

	/**
	 * The feature id for the '<em><b>Explicit Trust Store Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Require Client Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trust Manager Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_ALGORITHM = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trust Manager Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_FACTORY = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trust Store Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_TYPE = TLS_TRUST_STORE_TYPE_FEATURE_COUNT + 4;

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
	int TRANSACTION_MANAGER_TYPE = 128;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TransactionRefFactoryTypeImpl <em>Transaction Ref Factory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TransactionRefFactoryTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTransactionRefFactoryType()
	 * @generated
	 */
	int TRANSACTION_REF_FACTORY_TYPE = 129;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_REF_FACTORY_TYPE__NAME = ABSTRACT_TRANSACTION_FACTORY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_REF_FACTORY_TYPE__REF = ABSTRACT_TRANSACTION_FACTORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transaction Ref Factory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_REF_FACTORY_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_FACTORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TransactionTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Factory Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP = ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY = ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TRANSACTION_FACTORY = ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ACTION = ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TIMEOUT = ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_FEATURE_COUNT = ABSTRACT_TRANSACTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TransformerAppendStringTypeImpl <em>Transformer Append String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TransformerAppendStringTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTransformerAppendStringType()
	 * @generated
	 */
	int TRANSFORMER_APPEND_STRING_TYPE = 131;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_APPEND_STRING_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_APPEND_STRING_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_APPEND_STRING_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_APPEND_STRING_TYPE__MESSAGE = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformer Append String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_APPEND_STRING_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TransformerRefTypeImpl <em>Transformer Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TransformerRefTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTransformerRefType()
	 * @generated
	 */
	int TRANSFORMER_REF_TYPE = 132;

	/**
	 * The feature id for the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_REF_TYPE__IGNORE_BAD_INPUT = ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_REF_TYPE__NAME = ABSTRACT_TRANSFORMER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_REF_TYPE__RETURN_CLASS = ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_REF_TYPE__REF = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformer Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_REF_TYPE_FEATURE_COUNT = ABSTRACT_TRANSFORMER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.TransformersTypeImpl <em>Transformers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.TransformersTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getTransformersType()
	 * @generated
	 */
	int TRANSFORMERS_TYPE = 133;

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
	int TYPE_FILTER_TYPE = 134;

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
	int UNITARY_FILTER_TYPE = 135;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.impl.WildcardFilterTypeImpl <em>Wildcard Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.WildcardFilterTypeImpl
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getWildcardFilterType()
	 * @generated
	 */
	int WILDCARD_FILTER_TYPE = 136;

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
	int WIRE_TAP_ROUTER_TYPE = 137;

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
	 * The feature id for the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_TAP_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR = FILTERED_INBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR;

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
	 * The meta object id for the '{@link org.mule.ide.config.core.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 138;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.CreateConnectorType <em>Create Connector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.CreateConnectorType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCreateConnectorType()
	 * @generated
	 */
	int CREATE_CONNECTOR_TYPE = 139;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.EnableCorrelationType <em>Enable Correlation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEnableCorrelationType()
	 * @generated
	 */
	int ENABLE_CORRELATION_TYPE = 140;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.ExhaustedActionType <em>Exhausted Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExhaustedActionType()
	 * @generated
	 */
	int EXHAUSTED_ACTION_TYPE = 141;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.InitialisationPolicyType <em>Initialisation Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialisationPolicyType()
	 * @generated
	 */
	int INITIALISATION_POLICY_TYPE = 142;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.InitialStateType <em>Initial State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialStateType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialStateType()
	 * @generated
	 */
	int INITIAL_STATE_TYPE = 143;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.PoolExhaustedActionType <em>Pool Exhausted Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPoolExhaustedActionType()
	 * @generated
	 */
	int POOL_EXHAUSTED_ACTION_TYPE = 144;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.core.ScopeType <em>Scope Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ScopeType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getScopeType()
	 * @generated
	 */
	int SCOPE_TYPE = 145;

	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 146;

	/**
	 * The meta object id for the '<em>Create Connector Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.CreateConnectorType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getCreateConnectorTypeObject()
	 * @generated
	 */
	int CREATE_CONNECTOR_TYPE_OBJECT = 147;

	/**
	 * The meta object id for the '<em>Enable Correlation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getEnableCorrelationTypeObject()
	 * @generated
	 */
	int ENABLE_CORRELATION_TYPE_OBJECT = 148;

	/**
	 * The meta object id for the '<em>Exhausted Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getExhaustedActionTypeObject()
	 * @generated
	 */
	int EXHAUSTED_ACTION_TYPE_OBJECT = 149;

	/**
	 * The meta object id for the '<em>Initialisation Policy Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialisationPolicyTypeObject()
	 * @generated
	 */
	int INITIALISATION_POLICY_TYPE_OBJECT = 150;

	/**
	 * The meta object id for the '<em>Initial State Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.InitialStateType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getInitialStateTypeObject()
	 * @generated
	 */
	int INITIAL_STATE_TYPE_OBJECT = 151;

	/**
	 * The meta object id for the '<em>Pool Exhausted Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPoolExhaustedActionTypeObject()
	 * @generated
	 */
	int POOL_EXHAUSTED_ACTION_TYPE_OBJECT = 152;

	/**
	 * The meta object id for the '<em>Property Placeholder Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getPropertyPlaceholderType()
	 * @generated
	 */
	int PROPERTY_PLACEHOLDER_TYPE = 153;

	/**
	 * The meta object id for the '<em>Scope Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.ScopeType
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getScopeTypeObject()
	 * @generated
	 */
	int SCOPE_TYPE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>Substitutable Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBoolean()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN = 155;

	/**
	 * The meta object id for the '<em>Substitutable Boolean Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBooleanMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN_MEMBER0 = 156;

	/**
	 * The meta object id for the '<em>Substitutable Boolean Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBooleanMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN_MEMBER0_OBJECT = 157;

	/**
	 * The meta object id for the '<em>Substitutable Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableBooleanObject()
	 * @generated
	 */
	int SUBSTITUTABLE_BOOLEAN_OBJECT = 158;

	/**
	 * The meta object id for the '<em>Substitutable Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableClass()
	 * @generated
	 */
	int SUBSTITUTABLE_CLASS = 159;

	/**
	 * The meta object id for the '<em>Substitutable Class Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableClassMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_CLASS_MEMBER0 = 160;

	/**
	 * The meta object id for the '<em>Substitutable Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableInt()
	 * @generated
	 */
	int SUBSTITUTABLE_INT = 161;

	/**
	 * The meta object id for the '<em>Substitutable Int Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableIntMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_INT_MEMBER0 = 162;

	/**
	 * The meta object id for the '<em>Substitutable Int Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableIntMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_INT_MEMBER0_OBJECT = 163;

	/**
	 * The meta object id for the '<em>Substitutable Int Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableIntObject()
	 * @generated
	 */
	int SUBSTITUTABLE_INT_OBJECT = 164;

	/**
	 * The meta object id for the '<em>Substitutable Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLong()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG = 165;

	/**
	 * The meta object id for the '<em>Substitutable Long Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLongMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG_MEMBER0 = 166;

	/**
	 * The meta object id for the '<em>Substitutable Long Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLongMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG_MEMBER0_OBJECT = 167;

	/**
	 * The meta object id for the '<em>Substitutable Long Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutableLongObject()
	 * @generated
	 */
	int SUBSTITUTABLE_LONG_OBJECT = 168;

	/**
	 * The meta object id for the '<em>Substitutable Port Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumber()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER = 169;

	/**
	 * The meta object id for the '<em>Substitutable Port Number Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumberMember0()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER_MEMBER0 = 170;

	/**
	 * The meta object id for the '<em>Substitutable Port Number Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumberMember0Object()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER_MEMBER0_OBJECT = 171;

	/**
	 * The meta object id for the '<em>Substitutable Port Number Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.mule.ide.config.core.impl.CorePackageImpl#getSubstitutablePortNumberObject()
	 * @generated
	 */
	int SUBSTITUTABLE_PORT_NUMBER_OBJECT = 172;


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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractAgentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractAgentType#getName()
	 * @see #getAbstractAgentType()
	 * @generated
	 */
	EAttribute getAbstractAgentType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractBindingType <em>Abstract Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Binding Type</em>'.
	 * @see org.mule.ide.config.core.AbstractBindingType
	 * @generated
	 */
	EClass getAbstractBindingType();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractConnectionStrategyType <em>Abstract Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connection Strategy Type</em>'.
	 * @see org.mule.ide.config.core.AbstractConnectionStrategyType
	 * @generated
	 */
	EClass getAbstractConnectionStrategyType();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractEntrypointResolverType <em>Abstract Entrypoint Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entrypoint Resolver Type</em>'.
	 * @see org.mule.ide.config.core.AbstractEntrypointResolverType
	 * @generated
	 */
	EClass getAbstractEntrypointResolverType();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntrypointResolverGroup <em>Abstract Entrypoint Resolver Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Entrypoint Resolver Group</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractEntrypointResolverGroup()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EAttribute getAbstractModelType_AbstractEntrypointResolverGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntrypointResolver <em>Abstract Entrypoint Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entrypoint Resolver</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getAbstractEntrypointResolver()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EReference getAbstractModelType_AbstractEntrypointResolver();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractModelType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.AbstractModelType#getClass_()
	 * @see #getAbstractModelType()
	 * @generated
	 */
	EAttribute getAbstractModelType_Class();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractPropertyExtractorType <em>Abstract Property Extractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Property Extractor Type</em>'.
	 * @see org.mule.ide.config.core.AbstractPropertyExtractorType
	 * @generated
	 */
	EClass getAbstractPropertyExtractorType();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractResponseEndpointType <em>Abstract Response Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Response Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.AbstractResponseEndpointType
	 * @generated
	 */
	EClass getAbstractResponseEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractResponseEndpointType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractResponseEndpointType#getName()
	 * @see #getAbstractResponseEndpointType()
	 * @generated
	 */
	EAttribute getAbstractResponseEndpointType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractResponseRouterType <em>Abstract Response Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Response Router Type</em>'.
	 * @see org.mule.ide.config.core.AbstractResponseRouterType
	 * @generated
	 */
	EClass getAbstractResponseRouterType();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractStorageType <em>Abstract Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Storage Type</em>'.
	 * @see org.mule.ide.config.core.AbstractStorageType
	 * @generated
	 */
	EClass getAbstractStorageType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.AbstractTransactionFactoryType <em>Abstract Transaction Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transaction Factory Type</em>'.
	 * @see org.mule.ide.config.core.AbstractTransactionFactoryType
	 * @generated
	 */
	EClass getAbstractTransactionFactoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.AbstractTransactionFactoryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.AbstractTransactionFactoryType#getName()
	 * @see #getAbstractTransactionFactoryType()
	 * @generated
	 */
	EAttribute getAbstractTransactionFactoryType_Name();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.BaseContainerContextType <em>Base Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Container Context Type</em>'.
	 * @see org.mule.ide.config.core.BaseContainerContextType
	 * @generated
	 */
	EClass getBaseContainerContextType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.BaseContainerContextType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.core.BaseContainerContextType#getAny()
	 * @see #getBaseContainerContextType()
	 * @generated
	 */
	EAttribute getBaseContainerContextType_Any();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getInboundRouter <em>Inbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound Router</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getInboundRouter()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_InboundRouter();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getOutboundRouter <em>Outbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outbound Router</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getOutboundRouter()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_OutboundRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.BaseServiceType#getResponseRouter <em>Response Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Router</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getResponseRouter()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EReference getBaseServiceType_ResponseRouter();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.BaseServiceType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.BaseServiceType#getClass_()
	 * @see #getBaseServiceType()
	 * @generated
	 */
	EAttribute getBaseServiceType_Class();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CallableEntrypointResolverType <em>Callable Entrypoint Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Entrypoint Resolver Type</em>'.
	 * @see org.mule.ide.config.core.CallableEntrypointResolverType
	 * @generated
	 */
	EClass getCallableEntrypointResolverType();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ConnectionStrategyType <em>Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Strategy Type</em>'.
	 * @see org.mule.ide.config.core.ConnectionStrategyType
	 * @generated
	 */
	EClass getConnectionStrategyType();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ConnectorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.ConnectorType#getName()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ContainerContextType <em>Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Context Type</em>'.
	 * @see org.mule.ide.config.core.ContainerContextType
	 * @generated
	 */
	EClass getContainerContextType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ContainerContextType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.core.ContainerContextType#getAny()
	 * @see #getContainerContextType()
	 * @generated
	 */
	EAttribute getContainerContextType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ContainerContextType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.ContainerContextType#getClass_()
	 * @see #getContainerContextType()
	 * @generated
	 */
	EAttribute getContainerContextType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ContainerContextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.ContainerContextType#getName()
	 * @see #getContainerContextType()
	 * @generated
	 */
	EAttribute getContainerContextType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CorrelationAggregatorRouterType <em>Correlation Aggregator Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Aggregator Router Type</em>'.
	 * @see org.mule.ide.config.core.CorrelationAggregatorRouterType
	 * @generated
	 */
	EClass getCorrelationAggregatorRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CorrelationAggregatorRouterType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CorrelationAggregatorRouterType#getClass_()
	 * @see #getCorrelationAggregatorRouterType()
	 * @generated
	 */
	EAttribute getCorrelationAggregatorRouterType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CorrelationRouterType <em>Correlation Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Router Type</em>'.
	 * @see org.mule.ide.config.core.CorrelationRouterType
	 * @generated
	 */
	EClass getCorrelationRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CorrelationRouterType#getCorrelationExpression <em>Correlation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Expression</em>'.
	 * @see org.mule.ide.config.core.CorrelationRouterType#getCorrelationExpression()
	 * @see #getCorrelationRouterType()
	 * @generated
	 */
	EAttribute getCorrelationRouterType_CorrelationExpression();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomConnectionStrategyType <em>Custom Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Connection Strategy Type</em>'.
	 * @see org.mule.ide.config.core.CustomConnectionStrategyType
	 * @generated
	 */
	EClass getCustomConnectionStrategyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomConnectionStrategyType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomConnectionStrategyType#getProperty()
	 * @see #getCustomConnectionStrategyType()
	 * @generated
	 */
	EReference getCustomConnectionStrategyType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomConnectionStrategyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomConnectionStrategyType#getClass_()
	 * @see #getCustomConnectionStrategyType()
	 * @generated
	 */
	EAttribute getCustomConnectionStrategyType_Class();

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
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomConnectorType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getProperty()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EReference getCustomConnectorType_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.CustomConnectorType#getReceiverThreadingProfile <em>Receiver Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver Threading Profile</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getReceiverThreadingProfile()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EReference getCustomConnectorType_ReceiverThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.CustomConnectorType#getDispatcherThreadingProfile <em>Dispatcher Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dispatcher Threading Profile</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getDispatcherThreadingProfile()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EReference getCustomConnectorType_DispatcherThreadingProfile();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.CustomConnectorType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Exception Strategy Group</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getAbstractExceptionStrategyGroup()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_AbstractExceptionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.CustomConnectorType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Exception Strategy</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getAbstractExceptionStrategy()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EReference getCustomConnectorType_AbstractExceptionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.CustomConnectorType#getServiceOverrides <em>Service Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Overrides</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getServiceOverrides()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EReference getCustomConnectorType_ServiceOverrides();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomConnectorType#isCreateDispatcherPerRequest <em>Create Dispatcher Per Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Dispatcher Per Request</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#isCreateDispatcherPerRequest()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_CreateDispatcherPerRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomConnectorType#isCreateMultipleTransactedReceivers <em>Create Multiple Transacted Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Multiple Transacted Receivers</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#isCreateMultipleTransactedReceivers()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_CreateMultipleTransactedReceivers();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomConnectorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.CustomConnectorType#getName()
	 * @see #getCustomConnectorType()
	 * @generated
	 */
	EAttribute getCustomConnectorType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomContainerContextType <em>Custom Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Container Context Type</em>'.
	 * @see org.mule.ide.config.core.CustomContainerContextType
	 * @generated
	 */
	EClass getCustomContainerContextType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomContainerContextType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomContainerContextType#getClass_()
	 * @see #getCustomContainerContextType()
	 * @generated
	 */
	EAttribute getCustomContainerContextType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomContainerContextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.CustomContainerContextType#getName()
	 * @see #getCustomContainerContextType()
	 * @generated
	 */
	EAttribute getCustomContainerContextType_Name();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomEntrypointResolverType <em>Custom Entrypoint Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Entrypoint Resolver Type</em>'.
	 * @see org.mule.ide.config.core.CustomEntrypointResolverType
	 * @generated
	 */
	EClass getCustomEntrypointResolverType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomEntrypointResolverType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomEntrypointResolverType#getProperty()
	 * @see #getCustomEntrypointResolverType()
	 * @generated
	 */
	EReference getCustomEntrypointResolverType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomEntrypointResolverType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomEntrypointResolverType#getClass_()
	 * @see #getCustomEntrypointResolverType()
	 * @generated
	 */
	EAttribute getCustomEntrypointResolverType_Class();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomPropertyExtractorType <em>Custom Property Extractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property Extractor Type</em>'.
	 * @see org.mule.ide.config.core.CustomPropertyExtractorType
	 * @generated
	 */
	EClass getCustomPropertyExtractorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomPropertyExtractorType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomPropertyExtractorType#getProperty()
	 * @see #getCustomPropertyExtractorType()
	 * @generated
	 */
	EReference getCustomPropertyExtractorType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomPropertyExtractorType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomPropertyExtractorType#getClass_()
	 * @see #getCustomPropertyExtractorType()
	 * @generated
	 */
	EAttribute getCustomPropertyExtractorType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomResponseRouterType <em>Custom Response Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Response Router Type</em>'.
	 * @see org.mule.ide.config.core.CustomResponseRouterType
	 * @generated
	 */
	EClass getCustomResponseRouterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomResponseRouterType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomResponseRouterType#getProperty()
	 * @see #getCustomResponseRouterType()
	 * @generated
	 */
	EReference getCustomResponseRouterType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomResponseRouterType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomResponseRouterType#getClass_()
	 * @see #getCustomResponseRouterType()
	 * @generated
	 */
	EAttribute getCustomResponseRouterType_Class();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.CustomTransactionFactoryType <em>Custom Transaction Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Transaction Factory Type</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionFactoryType
	 * @generated
	 */
	EClass getCustomTransactionFactoryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.CustomTransactionFactoryType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionFactoryType#getProperty()
	 * @see #getCustomTransactionFactoryType()
	 * @generated
	 */
	EReference getCustomTransactionFactoryType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.CustomTransactionFactoryType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.CustomTransactionFactoryType#getClass_()
	 * @see #getCustomTransactionFactoryType()
	 * @generated
	 */
	EAttribute getCustomTransactionFactoryType_Class();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DefaultModelType <em>Default Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Model Type</em>'.
	 * @see org.mule.ide.config.core.DefaultModelType
	 * @generated
	 */
	EClass getDefaultModelType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.DefaultServiceType <em>Default Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Service Type</em>'.
	 * @see org.mule.ide.config.core.DefaultServiceType
	 * @generated
	 */
	EClass getDefaultServiceType();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.core.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractBinding <em>Abstract Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Binding</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractBinding();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractConnectionStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractConnectionStrategy();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractEntrypointResolver <em>Abstract Entrypoint Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Entrypoint Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractEntrypointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractEntrypointResolver();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Property Extractor</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractPropertyExtractor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractPropertyExtractor();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Response Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractResponseEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractResponseEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractResponseRouter <em>Abstract Response Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Response Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractResponseRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractResponseRouter();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractStorage <em>Abstract Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Storage</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractStorage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractStorage();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Transaction Factory</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getAbstractTransactionFactory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractTransactionFactory();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getBeanPropertyExtractor <em>Bean Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean Property Extractor</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getBeanPropertyExtractor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BeanPropertyExtractor();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCallableEntrypointResolver <em>Callable Entrypoint Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Callable Entrypoint Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCallableEntrypointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CallableEntrypointResolver();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCorrelationAggregatorRouter <em>Correlation Aggregator Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Aggregator Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCorrelationAggregatorRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationAggregatorRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCorrelationPropertyExtractor <em>Correlation Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Property Extractor</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCorrelationPropertyExtractor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationPropertyExtractor();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomConnectionStrategy <em>Custom Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomConnectionStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomConnectionStrategy();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomContainer <em>Custom Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomEntrypointResolver <em>Custom Entrypoint Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Entrypoint Resolver</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomEntrypointResolver()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomEntrypointResolver();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomPropertyExtractor <em>Custom Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Property Extractor</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomPropertyExtractor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomPropertyExtractor();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomResponseRouter <em>Custom Response Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Response Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomResponseRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomResponseRouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransactionFactory <em>Custom Transaction Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Transaction Factory</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getCustomTransactionFactory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomTransactionFactory();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getEjbContainer <em>Ejb Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getEjbContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EjbContainer();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getHivemindContainer <em>Hivemind Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hivemind Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getHivemindContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HivemindContainer();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getJndiContainer <em>Jndi Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jndi Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getJndiContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JndiContainer();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMapPropertyExtractor <em>Map Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Property Extractor</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMapPropertyExtractor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MapPropertyExtractor();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyExtractor <em>Message Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Property Extractor</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMessagePropertyExtractor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessagePropertyExtractor();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getMuleUnsafe <em>Mule Unsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mule Unsafe</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getMuleUnsafe()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MuleUnsafe();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getNoArgsCallComponent <em>No Args Call Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Args Call Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getNoArgsCallComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NoArgsCallComponent();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPassThroughComponent <em>Pass Through Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pass Through Component</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPassThroughComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PassThroughComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPayloadPropertyExtractor <em>Payload Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Property Extractor</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPayloadPropertyExtractor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PayloadPropertyExtractor();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPicoContainer <em>Pico Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pico Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPicoContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PicoContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPlexusContainer <em>Plexus Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plexus Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPlexusContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlexusContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPooledObject <em>Pooled Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pooled Object</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPooledObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PooledObject();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getPropertiesContainer <em>Properties Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getPropertiesContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertiesContainer();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getResponseEndpoint <em>Response Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Endpoint</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getResponseEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResponseEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getRetryConnectionStrategy <em>Retry Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getRetryConnectionStrategy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RetryConnectionStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getRmiContainer <em>Rmi Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rmi Container</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getRmiContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RmiContainer();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getSingleResponseRouter <em>Single Response Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Response Router</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getSingleResponseRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SingleResponseRouter();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransactionFactory <em>Transaction Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Factory</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransactionFactory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionFactory();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJboss <em>Transaction Manager Jboss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Manager Jboss</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransactionManagerJboss()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionManagerJboss();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJndi <em>Transaction Manager Jndi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Manager Jndi</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransactionManagerJndi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionManagerJndi();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJrun <em>Transaction Manager Jrun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Manager Jrun</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransactionManagerJrun()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionManagerJrun();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerResin <em>Transaction Manager Resin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Manager Resin</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransactionManagerResin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionManagerResin();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerWeblogic <em>Transaction Manager Weblogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Manager Weblogic</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransactionManagerWeblogic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionManagerWeblogic();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerWebsphere <em>Transaction Manager Websphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Manager Websphere</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransactionManagerWebsphere()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionManagerWebsphere();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerAppendString <em>Transformer Append String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Append String</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerAppendString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerAppendString();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerBase64Decoder <em>Transformer Base64 Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Base64 Decoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerBase64Decoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerBase64Decoder();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerBase64Encoder <em>Transformer Base64 Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Base64 Encoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerBase64Encoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerBase64Encoder();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToHexString <em>Transformer Byte Array To Hex String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Byte Array To Hex String</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToHexString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerByteArrayToHexString();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToObject <em>Transformer Byte Array To Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Byte Array To Object</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerByteArrayToObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToSerializable <em>Transformer Byte Array To Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Byte Array To Serializable</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToSerializable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerByteArrayToSerializable();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToString <em>Transformer Byte Array To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Byte Array To String</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerByteArrayToString();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerDecrypt <em>Transformer Decrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Decrypt</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerDecrypt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerDecrypt();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerEncrypt <em>Transformer Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Encrypt</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerEncrypt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerEncrypt();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerGzipCompress <em>Transformer Gzip Compress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Gzip Compress</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerGzipCompress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerGzipCompress();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerGzipUncompress <em>Transformer Gzip Uncompress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Gzip Uncompress</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerGzipUncompress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerGzipUncompress();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerHexStingToByteArray <em>Transformer Hex Sting To Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Hex Sting To Byte Array</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerHexStingToByteArray()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerHexStingToByteArray();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerMessageProperties <em>Transformer Message Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Message Properties</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerMessageProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerMessageProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerNoAction <em>Transformer No Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer No Action</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerNoAction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerNoAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerObjectToByteArray <em>Transformer Object To Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Object To Byte Array</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerObjectToByteArray()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerObjectToByteArray();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerObjectToString <em>Transformer Object To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Object To String</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerObjectToString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerObjectToString();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerSerializableToByteArray <em>Transformer Serializable To Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Serializable To Byte Array</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerSerializableToByteArray()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerSerializableToByteArray();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerStringToByteArray <em>Transformer String To Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer String To Byte Array</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerStringToByteArray()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerStringToByteArray();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUcDecoder <em>Transformer Uc Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Uc Decoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerUcDecoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerUcDecoder();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUcEncoder <em>Transformer Uc Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Uc Encoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerUcEncoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerUcEncoder();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUuDecoder <em>Transformer Uu Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Uu Decoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerUuDecoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerUuDecoder();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUuEncoder <em>Transformer Uu Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Uu Encoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerUuEncoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerUuEncoder();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityDecoder <em>Transformer Xml Entity Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Xml Entity Decoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityDecoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerXmlEntityDecoder();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityEncoder <em>Transformer Xml Entity Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Xml Entity Encoder</em>'.
	 * @see org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityEncoder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformerXmlEntityEncoder();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.EndpointSelectorRouterType <em>Endpoint Selector Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Selector Router Type</em>'.
	 * @see org.mule.ide.config.core.EndpointSelectorRouterType
	 * @generated
	 */
	EClass getEndpointSelectorRouterType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.EndpointSelectorRouterType#getSelectorProperty <em>Selector Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector Property</em>'.
	 * @see org.mule.ide.config.core.EndpointSelectorRouterType#getSelectorProperty()
	 * @see #getEndpointSelectorRouterType()
	 * @generated
	 */
	EAttribute getEndpointSelectorRouterType_SelectorProperty();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.EnvironmentPropertyType <em>Environment Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Property Type</em>'.
	 * @see org.mule.ide.config.core.EnvironmentPropertyType
	 * @generated
	 */
	EClass getEnvironmentPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.EnvironmentPropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.EnvironmentPropertyType#getName()
	 * @see #getEnvironmentPropertyType()
	 * @generated
	 */
	EAttribute getEnvironmentPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.EnvironmentPropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mule.ide.config.core.EnvironmentPropertyType#getValue()
	 * @see #getEnvironmentPropertyType()
	 * @generated
	 */
	EAttribute getEnvironmentPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ExceptionStrategyType <em>Exception Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Strategy Type</em>'.
	 * @see org.mule.ide.config.core.ExceptionStrategyType
	 * @generated
	 */
	EClass getExceptionStrategyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ExceptionStrategyType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.ExceptionStrategyType#getAbstractOutboundEndpointGroup()
	 * @see #getExceptionStrategyType()
	 * @generated
	 */
	EAttribute getExceptionStrategyType_AbstractOutboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ExceptionStrategyType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.ExceptionStrategyType#getAbstractOutboundEndpoint()
	 * @see #getExceptionStrategyType()
	 * @generated
	 */
	EReference getExceptionStrategyType_AbstractOutboundEndpoint();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Property Extractor Group</em>'.
	 * @see org.mule.ide.config.core.FilteredInboundRouterType#getAbstractPropertyExtractorGroup()
	 * @see #getFilteredInboundRouterType()
	 * @generated
	 */
	EAttribute getFilteredInboundRouterType_AbstractPropertyExtractorGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Property Extractor</em>'.
	 * @see org.mule.ide.config.core.FilteredInboundRouterType#getAbstractPropertyExtractor()
	 * @see #getFilteredInboundRouterType()
	 * @generated
	 */
	EReference getFilteredInboundRouterType_AbstractPropertyExtractor();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.FilteredInboundRouterType#getCustomPropertyExtractor <em>Custom Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Property Extractor</em>'.
	 * @see org.mule.ide.config.core.FilteredInboundRouterType#getCustomPropertyExtractor()
	 * @see #getFilteredInboundRouterType()
	 * @generated
	 */
	EReference getFilteredInboundRouterType_CustomPropertyExtractor();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.FilterRefType <em>Filter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Ref Type</em>'.
	 * @see org.mule.ide.config.core.FilterRefType
	 * @generated
	 */
	EClass getFilterRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.FilterRefType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.FilterRefType#getRef()
	 * @see #getFilterRefType()
	 * @generated
	 */
	EAttribute getFilterRefType_Ref();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ForwardingRouterType <em>Forwarding Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forwarding Router Type</em>'.
	 * @see org.mule.ide.config.core.ForwardingRouterType
	 * @generated
	 */
	EClass getForwardingRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ForwardingRouterType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.ForwardingRouterType#getAbstractInboundEndpointGroup()
	 * @see #getForwardingRouterType()
	 * @generated
	 */
	EAttribute getForwardingRouterType_AbstractInboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ForwardingRouterType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.ForwardingRouterType#getAbstractInboundEndpoint()
	 * @see #getForwardingRouterType()
	 * @generated
	 */
	EReference getForwardingRouterType_AbstractInboundEndpoint();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Pooling Profile Group</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getAbstractPoolingProfileGroup()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EAttribute getGenericObjectFactoryType_AbstractPoolingProfileGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Pooling Profile</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getAbstractPoolingProfile()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EReference getGenericObjectFactoryType_AbstractPoolingProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GenericObjectFactoryType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getClass_()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EAttribute getGenericObjectFactoryType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GenericObjectFactoryType#getFactoryRef <em>Factory Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Ref</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getFactoryRef()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EAttribute getGenericObjectFactoryType_FactoryRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GenericObjectFactoryType#getInstanceRef <em>Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Ref</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getInstanceRef()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EAttribute getGenericObjectFactoryType_InstanceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GenericObjectFactoryType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType#getScope()
	 * @see #getGenericObjectFactoryType()
	 * @generated
	 */
	EAttribute getGenericObjectFactoryType_Scope();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Connection Strategy Group</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractConnectionStrategyGroup()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_AbstractConnectionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getAbstractConnectionStrategy()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EReference getGlobalEndpointType_AbstractConnectionStrategy();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.GlobalEndpointType#getCreateConnector <em>Create Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Connector</em>'.
	 * @see org.mule.ide.config.core.GlobalEndpointType#getCreateConnector()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_CreateConnector();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.IdempotentReceiverType <em>Idempotent Receiver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idempotent Receiver Type</em>'.
	 * @see org.mule.ide.config.core.IdempotentReceiverType
	 * @generated
	 */
	EClass getIdempotentReceiverType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.IdempotentReceiverType#getAbstractStorageGroup <em>Abstract Storage Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Storage Group</em>'.
	 * @see org.mule.ide.config.core.IdempotentReceiverType#getAbstractStorageGroup()
	 * @see #getIdempotentReceiverType()
	 * @generated
	 */
	EAttribute getIdempotentReceiverType_AbstractStorageGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.IdempotentReceiverType#getAbstractStorage <em>Abstract Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Storage</em>'.
	 * @see org.mule.ide.config.core.IdempotentReceiverType#getAbstractStorage()
	 * @see #getIdempotentReceiverType()
	 * @generated
	 */
	EReference getIdempotentReceiverType_AbstractStorage();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Connection Strategy Group</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractConnectionStrategyGroup()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_AbstractConnectionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundEndpointType#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getAbstractConnectionStrategy()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EReference getInboundEndpointType_AbstractConnectionStrategy();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundEndpointType#getCreateConnector <em>Create Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Connector</em>'.
	 * @see org.mule.ide.config.core.InboundEndpointType#getCreateConnector()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_CreateConnector();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.InboundRouterCollectionType <em>Inbound Router Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Router Collection Type</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType
	 * @generated
	 */
	EClass getInboundRouterCollectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Catch All Strategy Group</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType#getAbstractCatchAllStrategyGroup()
	 * @see #getInboundRouterCollectionType()
	 * @generated
	 */
	EAttribute getInboundRouterCollectionType_AbstractCatchAllStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType#getAbstractCatchAllStrategy()
	 * @see #getInboundRouterCollectionType()
	 * @generated
	 */
	EReference getInboundRouterCollectionType_AbstractCatchAllStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundEndpointGroup()
	 * @see #getInboundRouterCollectionType()
	 * @generated
	 */
	EAttribute getInboundRouterCollectionType_AbstractInboundEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundEndpoint()
	 * @see #getInboundRouterCollectionType()
	 * @generated
	 */
	EReference getInboundRouterCollectionType_AbstractInboundEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundRouterGroup <em>Abstract Inbound Router Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Inbound Router Group</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundRouterGroup()
	 * @see #getInboundRouterCollectionType()
	 * @generated
	 */
	EAttribute getInboundRouterCollectionType_AbstractInboundRouterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundRouter <em>Abstract Inbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Inbound Router</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundRouter()
	 * @see #getInboundRouterCollectionType()
	 * @generated
	 */
	EReference getInboundRouterCollectionType_AbstractInboundRouter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.InboundRouterCollectionType#isMatchAll <em>Match All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match All</em>'.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType#isMatchAll()
	 * @see #getInboundRouterCollectionType()
	 * @generated
	 */
	EAttribute getInboundRouterCollectionType_MatchAll();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.IocContainerContextType <em>Ioc Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ioc Container Context Type</em>'.
	 * @see org.mule.ide.config.core.IocContainerContextType
	 * @generated
	 */
	EClass getIocContainerContextType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.IocContainerContextType#getConfigLocation <em>Config Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Location</em>'.
	 * @see org.mule.ide.config.core.IocContainerContextType#getConfigLocation()
	 * @see #getIocContainerContextType()
	 * @generated
	 */
	EAttribute getIocContainerContextType_ConfigLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.IocContainerContextType#getConfigurationText <em>Configuration Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Text</em>'.
	 * @see org.mule.ide.config.core.IocContainerContextType#getConfigurationText()
	 * @see #getIocContainerContextType()
	 * @generated
	 */
	EAttribute getIocContainerContextType_ConfigurationText();

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
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.JndiTransactionManagerType#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see org.mule.ide.config.core.JndiTransactionManagerType#getEnvironment()
	 * @see #getJndiTransactionManagerType()
	 * @generated
	 */
	EReference getJndiTransactionManagerType_Environment();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MessagePropertiesTransformerType <em>Message Properties Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Properties Transformer Type</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType
	 * @generated
	 */
	EClass getMessagePropertiesTransformerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getDeleteProperties <em>Delete Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Properties</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType#getDeleteProperties()
	 * @see #getMessagePropertiesTransformerType()
	 * @generated
	 */
	EReference getMessagePropertiesTransformerType_DeleteProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MessagePropertiesTransformerType#getAddProperties <em>Add Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Properties</em>'.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType#getAddProperties()
	 * @see #getMessagePropertiesTransformerType()
	 * @generated
	 */
	EReference getMessagePropertiesTransformerType_AddProperties();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MuleAdminAgentType <em>Mule Admin Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mule Admin Agent Type</em>'.
	 * @see org.mule.ide.config.core.MuleAdminAgentType
	 * @generated
	 */
	EClass getMuleAdminAgentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleAdminAgentType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.mule.ide.config.core.MuleAdminAgentType#getProperty()
	 * @see #getMuleAdminAgentType()
	 * @generated
	 */
	EReference getMuleAdminAgentType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleAdminAgentType#getServerUri <em>Server Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Uri</em>'.
	 * @see org.mule.ide.config.core.MuleAdminAgentType#getServerUri()
	 * @see #getMuleAdminAgentType()
	 * @generated
	 */
	EAttribute getMuleAdminAgentType_ServerUri();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MuleManagementContextType <em>Mule Management Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mule Management Context Type</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType
	 * @generated
	 */
	EClass getMuleManagementContextType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultThreadingProfile <em>Default Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Threading Profile</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultThreadingProfile()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EReference getMuleManagementContextType_DefaultThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Dispatcher Threading Profile</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultDispatcherThreadingProfile()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EReference getMuleManagementContextType_DefaultDispatcherThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Receiver Threading Profile</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultReceiverThreadingProfile()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EReference getMuleManagementContextType_DefaultReceiverThreadingProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Component Threading Profile</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultComponentThreadingProfile()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EReference getMuleManagementContextType_DefaultComponentThreadingProfile();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleManagementContextType#getAbstractStorageGroup <em>Abstract Storage Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Storage Group</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getAbstractStorageGroup()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_AbstractStorageGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleManagementContextType#getAbstractStorage <em>Abstract Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Storage</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getAbstractStorage()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EReference getMuleManagementContextType_AbstractStorage();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultConnectionStrategy <em>Default Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultConnectionStrategy()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EReference getMuleManagementContextType_DefaultConnectionStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#getClusterId <em>Cluster Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster Id</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getClusterId()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_ClusterId();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultEncoding <em>Default Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Encoding</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultEncoding()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_DefaultEncoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultRemoteSync <em>Default Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Remote Sync</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#isDefaultRemoteSync()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_DefaultRemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Synchronous Endpoints</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#isDefaultSynchronousEndpoints()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_DefaultSynchronousEndpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Synchronous Event Timeout</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultSynchronousEventTimeout()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_DefaultSynchronousEventTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Transaction Timeout</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDefaultTransactionTimeout()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_DefaultTransactionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#getDomainId <em>Domain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Id</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getDomainId()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_DomainId();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#getServerId <em>Server Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Id</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getServerId()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_ServerId();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleManagementContextType#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Directory</em>'.
	 * @see org.mule.ide.config.core.MuleManagementContextType#getWorkingDirectory()
	 * @see #getMuleManagementContextType()
	 * @generated
	 */
	EAttribute getMuleManagementContextType_WorkingDirectory();

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
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getEnvironmentProperty <em>Environment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Property</em>'.
	 * @see org.mule.ide.config.core.MuleType#getEnvironmentProperty()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_EnvironmentProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAdminAgent <em>Admin Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admin Agent</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAdminAgent()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AdminAgent();

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
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleType#getAbstractTransactionFactoryGroup <em>Abstract Transaction Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Factory Group</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractTransactionFactoryGroup()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_AbstractTransactionFactoryGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleType#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction Factory</em>'.
	 * @see org.mule.ide.config.core.MuleType#getAbstractTransactionFactory()
	 * @see #getMuleType()
	 * @generated
	 */
	EReference getMuleType_AbstractTransactionFactory();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.MuleType#getName()
	 * @see #getMuleType()
	 * @generated
	 */
	EAttribute getMuleType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.MuleUnsafeType <em>Mule Unsafe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mule Unsafe Type</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType
	 * @generated
	 */
	EClass getMuleUnsafeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getEnvironmentProperty <em>Environment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Property</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getEnvironmentProperty()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_EnvironmentProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAdminAgent <em>Admin Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admin Agent</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAdminAgent()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AdminAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getConfiguration()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getDescription()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractExtensionGroup <em>Abstract Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Extension Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractExtensionGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractExtensionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractExtension <em>Abstract Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Extension</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractExtension()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractExtension();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractSecurityManagerGroup <em>Abstract Security Manager Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Manager Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractSecurityManagerGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractSecurityManagerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractSecurityManager <em>Abstract Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Manager</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractSecurityManager()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractSecurityManager();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionManagerGroup <em>Abstract Transaction Manager Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Manager Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionManagerGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractTransactionManagerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction Manager</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionManager()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractTransactionManager();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionFactoryGroup <em>Abstract Transaction Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Factory Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionFactoryGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractTransactionFactoryGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction Factory</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractTransactionFactory()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractTransactionFactory();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractConnectorGroup <em>Abstract Connector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Connector Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractConnectorGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractConnectorGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Connector</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractConnector()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractConnector();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractGlobalEndpointGroup <em>Abstract Global Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Global Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractGlobalEndpointGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractGlobalEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractGlobalEndpoint <em>Abstract Global Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Global Endpoint</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractGlobalEndpoint()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractGlobalEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractTransformerGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractTransformer()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractTransformer();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractFilterGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractFilter()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractModelGroup <em>Abstract Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Model Group</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractModelGroup()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_AbstractModelGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.MuleUnsafeType#getAbstractModel <em>Abstract Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Model</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAbstractModel()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EReference getMuleUnsafeType_AbstractModel();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.MuleUnsafeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getAny()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.MuleUnsafeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.MuleUnsafeType#getName()
	 * @see #getMuleUnsafeType()
	 * @generated
	 */
	EAttribute getMuleUnsafeType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.NoArgsCallDelegateClassType <em>No Args Call Delegate Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Args Call Delegate Class Type</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateClassType
	 * @generated
	 */
	EClass getNoArgsCallDelegateClassType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateClass <em>Delegate Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate Class</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateClass()
	 * @see #getNoArgsCallDelegateClassType()
	 * @generated
	 */
	EAttribute getNoArgsCallDelegateClassType_DelegateClass();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateMethod <em>Delegate Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate Method</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateClassType#getDelegateMethod()
	 * @see #getNoArgsCallDelegateClassType()
	 * @generated
	 */
	EAttribute getNoArgsCallDelegateClassType_DelegateMethod();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType <em>No Args Call Delegate Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Args Call Delegate Instance Type</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateInstanceType
	 * @generated
	 */
	EClass getNoArgsCallDelegateInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateInstanceRef <em>Delegate Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate Instance Ref</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateInstanceRef()
	 * @see #getNoArgsCallDelegateInstanceType()
	 * @generated
	 */
	EAttribute getNoArgsCallDelegateInstanceType_DelegateInstanceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateMethod <em>Delegate Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate Method</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateInstanceType#getDelegateMethod()
	 * @see #getNoArgsCallDelegateInstanceType()
	 * @generated
	 */
	EAttribute getNoArgsCallDelegateInstanceType_DelegateMethod();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.NoArgsCallWrapperType <em>No Args Call Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Args Call Wrapper Type</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallWrapperType
	 * @generated
	 */
	EClass getNoArgsCallWrapperType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.NoArgsCallWrapperType#getDelegateClass <em>Delegate Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate Class</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallWrapperType#getDelegateClass()
	 * @see #getNoArgsCallWrapperType()
	 * @generated
	 */
	EReference getNoArgsCallWrapperType_DelegateClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.NoArgsCallWrapperType#getDelegateInstance <em>Delegate Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate Instance</em>'.
	 * @see org.mule.ide.config.core.NoArgsCallWrapperType#getDelegateInstance()
	 * @see #getNoArgsCallWrapperType()
	 * @generated
	 */
	EReference getNoArgsCallWrapperType_DelegateInstance();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Connection Strategy Group</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractConnectionStrategyGroup()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_AbstractConnectionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundEndpointType#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getAbstractConnectionStrategy()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EReference getOutboundEndpointType_AbstractConnectionStrategy();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundEndpointType#getCreateConnector <em>Create Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Connector</em>'.
	 * @see org.mule.ide.config.core.OutboundEndpointType#getCreateConnector()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_CreateConnector();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.OutboundRouterCollectionType <em>Outbound Router Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Router Collection Type</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterCollectionType
	 * @generated
	 */
	EClass getOutboundRouterCollectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Catch All Strategy Group</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractCatchAllStrategyGroup()
	 * @see #getOutboundRouterCollectionType()
	 * @generated
	 */
	EAttribute getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Catch All Strategy</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractCatchAllStrategy()
	 * @see #getOutboundRouterCollectionType()
	 * @generated
	 */
	EReference getOutboundRouterCollectionType_AbstractCatchAllStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractOutboundRouterGroup <em>Abstract Outbound Router Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Outbound Router Group</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractOutboundRouterGroup()
	 * @see #getOutboundRouterCollectionType()
	 * @generated
	 */
	EAttribute getOutboundRouterCollectionType_AbstractOutboundRouterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractOutboundRouter <em>Abstract Outbound Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Outbound Router</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterCollectionType#getAbstractOutboundRouter()
	 * @see #getOutboundRouterCollectionType()
	 * @generated
	 */
	EReference getOutboundRouterCollectionType_AbstractOutboundRouter();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.OutboundRouterCollectionType#isMatchAll <em>Match All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match All</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterCollectionType#isMatchAll()
	 * @see #getOutboundRouterCollectionType()
	 * @generated
	 */
	EAttribute getOutboundRouterCollectionType_MatchAll();

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
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Property Extractor Group</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractPropertyExtractorGroup()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EAttribute getOutboundRouterType_AbstractPropertyExtractorGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.OutboundRouterType#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Property Extractor</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getAbstractPropertyExtractor()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EReference getOutboundRouterType_AbstractPropertyExtractor();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.OutboundRouterType#getCustomPropertyExtractor <em>Custom Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Property Extractor</em>'.
	 * @see org.mule.ide.config.core.OutboundRouterType#getCustomPropertyExtractor()
	 * @see #getOutboundRouterType()
	 * @generated
	 */
	EReference getOutboundRouterType_CustomPropertyExtractor();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PojoComponentType <em>Pojo Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pojo Component Type</em>'.
	 * @see org.mule.ide.config.core.PojoComponentType
	 * @generated
	 */
	EClass getPojoComponentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.PojoComponentType#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Object Factory Group</em>'.
	 * @see org.mule.ide.config.core.PojoComponentType#getAbstractObjectFactoryGroup()
	 * @see #getPojoComponentType()
	 * @generated
	 */
	EAttribute getPojoComponentType_AbstractObjectFactoryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.PojoComponentType#getAbstractObjectFactory <em>Abstract Object Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Object Factory</em>'.
	 * @see org.mule.ide.config.core.PojoComponentType#getAbstractObjectFactory()
	 * @see #getPojoComponentType()
	 * @generated
	 */
	EReference getPojoComponentType_AbstractObjectFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.PojoComponentType#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see org.mule.ide.config.core.PojoComponentType#getBinding()
	 * @see #getPojoComponentType()
	 * @generated
	 */
	EReference getPojoComponentType_Binding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PojoComponentType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.PojoComponentType#getClass_()
	 * @see #getPojoComponentType()
	 * @generated
	 */
	EAttribute getPojoComponentType_Class();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PooledObjectFactoryType <em>Pooled Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pooled Object Factory Type</em>'.
	 * @see org.mule.ide.config.core.PooledObjectFactoryType
	 * @generated
	 */
	EClass getPooledObjectFactoryType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.PooledObjectFactoryType#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Pooling Profile Group</em>'.
	 * @see org.mule.ide.config.core.PooledObjectFactoryType#getAbstractPoolingProfileGroup()
	 * @see #getPooledObjectFactoryType()
	 * @generated
	 */
	EAttribute getPooledObjectFactoryType_AbstractPoolingProfileGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.PooledObjectFactoryType#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Pooling Profile</em>'.
	 * @see org.mule.ide.config.core.PooledObjectFactoryType#getAbstractPoolingProfile()
	 * @see #getPooledObjectFactoryType()
	 * @generated
	 */
	EReference getPooledObjectFactoryType_AbstractPoolingProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PooledObjectFactoryType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.core.PooledObjectFactoryType#getClass_()
	 * @see #getPooledObjectFactoryType()
	 * @generated
	 */
	EAttribute getPooledObjectFactoryType_Class();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.PropertiesContainerContextType <em>Properties Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Container Context Type</em>'.
	 * @see org.mule.ide.config.core.PropertiesContainerContextType
	 * @generated
	 */
	EClass getPropertiesContainerContextType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.PropertiesContainerContextType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.core.PropertiesContainerContextType#getAny()
	 * @see #getPropertiesContainerContextType()
	 * @generated
	 */
	EAttribute getPropertiesContainerContextType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PropertiesContainerContextType#isEnableTemplates <em>Enable Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Templates</em>'.
	 * @see org.mule.ide.config.core.PropertiesContainerContextType#isEnableTemplates()
	 * @see #getPropertiesContainerContextType()
	 * @generated
	 */
	EAttribute getPropertiesContainerContextType_EnableTemplates();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PropertiesContainerContextType#isIncludeSystemProperties <em>Include System Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include System Properties</em>'.
	 * @see org.mule.ide.config.core.PropertiesContainerContextType#isIncludeSystemProperties()
	 * @see #getPropertiesContainerContextType()
	 * @generated
	 */
	EAttribute getPropertiesContainerContextType_IncludeSystemProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.PropertiesContainerContextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.PropertiesContainerContextType#getName()
	 * @see #getPropertiesContainerContextType()
	 * @generated
	 */
	EAttribute getPropertiesContainerContextType_Name();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ResponseEndpointType <em>Response Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Endpoint Type</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType
	 * @generated
	 */
	EClass getResponseEndpointType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseEndpointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getGroup()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractTransformerGroup()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractTransformer()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_AbstractTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getTransformers()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_Transformers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getResponseTransformers <em>Response Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Transformers</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getResponseTransformers()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_ResponseTransformers();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Group</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractTransactionGroup()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_AbstractTransactionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transaction</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractTransaction()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_AbstractTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Filter Group</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractFilterGroup()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_AbstractFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractFilter <em>Abstract Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Filter</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractFilter()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_AbstractFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Security Filter Group</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractSecurityFilterGroup()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_AbstractSecurityFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Security Filter</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractSecurityFilter()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_AbstractSecurityFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Connection Strategy Group</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractConnectionStrategyGroup()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_AbstractConnectionStrategyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Connection Strategy</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAbstractConnectionStrategy()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_AbstractConnectionStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseEndpointType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getProperties()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EReference getResponseEndpointType_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getAddress()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getConnectorRef <em>Connector Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Ref</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getConnectorRef()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_ConnectorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getCreateConnector <em>Create Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Connector</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getCreateConnector()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_CreateConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getEncoding()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getRef()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#isRemoteSync <em>Remote Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#isRemoteSync()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_RemoteSync();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Sync Timeout</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getRemoteSyncTimeout()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_RemoteSyncTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getResponseTransformerRefs()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_ResponseTransformerRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#isSynchronous()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseEndpointType#getTransformerRefs <em>Transformer Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Refs</em>'.
	 * @see org.mule.ide.config.core.ResponseEndpointType#getTransformerRefs()
	 * @see #getResponseEndpointType()
	 * @generated
	 */
	EAttribute getResponseEndpointType_TransformerRefs();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ResponseRouterCollectionType <em>Response Router Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Router Collection Type</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType
	 * @generated
	 */
	EClass getResponseRouterCollectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseEndpointGroup <em>Abstract Response Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Response Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseEndpointGroup()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EAttribute getResponseRouterCollectionType_AbstractResponseEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Response Endpoint</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseEndpoint()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EReference getResponseRouterCollectionType_AbstractResponseEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseRouterGroup <em>Abstract Response Router Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Response Router Group</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseRouterGroup()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EAttribute getResponseRouterCollectionType_AbstractResponseRouterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseRouter <em>Abstract Response Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Response Router</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseRouter()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EReference getResponseRouterCollectionType_AbstractResponseRouter();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transformer Group</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractTransformerGroup()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EAttribute getResponseRouterCollectionType_AbstractTransformerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractTransformer <em>Abstract Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Transformer</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractTransformer()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EReference getResponseRouterCollectionType_AbstractTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getTimeout()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EAttribute getResponseRouterCollectionType_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getTransformerRef <em>Transformer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Ref</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType#getTransformerRef()
	 * @see #getResponseRouterCollectionType()
	 * @generated
	 */
	EAttribute getResponseRouterCollectionType_TransformerRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.ResponseRouterType <em>Response Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Router Type</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterType
	 * @generated
	 */
	EClass getResponseRouterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseRouterType#getAbstractResponseEndpointGroup <em>Abstract Response Endpoint Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Response Endpoint Group</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterType#getAbstractResponseEndpointGroup()
	 * @see #getResponseRouterType()
	 * @generated
	 */
	EAttribute getResponseRouterType_AbstractResponseEndpointGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.core.ResponseRouterType#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Response Endpoint</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterType#getAbstractResponseEndpoint()
	 * @see #getResponseRouterType()
	 * @generated
	 */
	EReference getResponseRouterType_AbstractResponseEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.ResponseRouterType#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Property Extractor Group</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterType#getAbstractPropertyExtractorGroup()
	 * @see #getResponseRouterType()
	 * @generated
	 */
	EAttribute getResponseRouterType_AbstractPropertyExtractorGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ResponseRouterType#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Property Extractor</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterType#getAbstractPropertyExtractor()
	 * @see #getResponseRouterType()
	 * @generated
	 */
	EReference getResponseRouterType_AbstractPropertyExtractor();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.ResponseRouterType#getCustomPropertyExtractor <em>Custom Property Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Property Extractor</em>'.
	 * @see org.mule.ide.config.core.ResponseRouterType#getCustomPropertyExtractor()
	 * @see #getResponseRouterType()
	 * @generated
	 */
	EReference getResponseRouterType_CustomPropertyExtractor();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.RetryConnectionStrategyType <em>Retry Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Connection Strategy Type</em>'.
	 * @see org.mule.ide.config.core.RetryConnectionStrategyType
	 * @generated
	 */
	EClass getRetryConnectionStrategyType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryCount <em>Retry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Count</em>'.
	 * @see org.mule.ide.config.core.RetryConnectionStrategyType#getRetryCount()
	 * @see #getRetryConnectionStrategyType()
	 * @generated
	 */
	EAttribute getRetryConnectionStrategyType_RetryCount();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryFrequency <em>Retry Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Frequency</em>'.
	 * @see org.mule.ide.config.core.RetryConnectionStrategyType#getRetryFrequency()
	 * @see #getRetryConnectionStrategyType()
	 * @generated
	 */
	EAttribute getRetryConnectionStrategyType_RetryFrequency();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.RmiContainerContextType <em>Rmi Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rmi Container Context Type</em>'.
	 * @see org.mule.ide.config.core.RmiContainerContextType
	 * @generated
	 */
	EClass getRmiContainerContextType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.RmiContainerContextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.RmiContainerContextType#getName()
	 * @see #getRmiContainerContextType()
	 * @generated
	 */
	EAttribute getRmiContainerContextType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.RmiContainerContextType#getSecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Manager</em>'.
	 * @see org.mule.ide.config.core.RmiContainerContextType#getSecurityManager()
	 * @see #getRmiContainerContextType()
	 * @generated
	 */
	EAttribute getRmiContainerContextType_SecurityManager();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.RmiContainerContextType#getSecurityPolicy <em>Security Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Policy</em>'.
	 * @see org.mule.ide.config.core.RmiContainerContextType#getSecurityPolicy()
	 * @see #getRmiContainerContextType()
	 * @generated
	 */
	EAttribute getRmiContainerContextType_SecurityPolicy();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformerFirst <em>Transformer First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer First</em>'.
	 * @see org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformerFirst()
	 * @see #getSelectiveConsumerRouterType()
	 * @generated
	 */
	EAttribute getSelectiveConsumerRouterType_TransformerFirst();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.SingletonObjectFactoryType#getInstanceRef <em>Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Ref</em>'.
	 * @see org.mule.ide.config.core.SingletonObjectFactoryType#getInstanceRef()
	 * @see #getSingletonObjectFactoryType()
	 * @generated
	 */
	EAttribute getSingletonObjectFactoryType_InstanceRef();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.ThreadingProfileType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.core.ThreadingProfileType#getName()
	 * @see #getThreadingProfileType()
	 * @generated
	 */
	EAttribute getThreadingProfileType_Name();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStore <em>Client Key Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Key Store</em>'.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStore()
	 * @see #getTlsClientKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsClientKeyStoreType_ClientKeyStore();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStorePassword <em>Client Key Store Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Key Store Password</em>'.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStorePassword()
	 * @see #getTlsClientKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsClientKeyStoreType_ClientKeyStorePassword();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStoreType <em>Client Key Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Key Store Type</em>'.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStoreType()
	 * @see #getTlsClientKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsClientKeyStoreType_ClientKeyStoreType();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyManagerAlgorithm <em>Key Manager Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Manager Algorithm</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getKeyManagerAlgorithm()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_KeyManagerAlgorithm();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStore <em>Key Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Store</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getKeyStore()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_KeyStore();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStorePassword <em>Key Store Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Store Password</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getKeyStorePassword()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_KeyStorePassword();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStoreType <em>Key Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Store Type</em>'.
	 * @see org.mule.ide.config.core.TlsKeyStoreType#getKeyStoreType()
	 * @see #getTlsKeyStoreType()
	 * @generated
	 */
	EAttribute getTlsKeyStoreType_KeyStoreType();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsProtocolHandler#getProtocolHandler <em>Protocol Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Handler</em>'.
	 * @see org.mule.ide.config.core.TlsProtocolHandler#getProtocolHandler()
	 * @see #getTlsProtocolHandler()
	 * @generated
	 */
	EAttribute getTlsProtocolHandler_ProtocolHandler();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitTrustStoreOnly <em>Explicit Trust Store Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Trust Store Only</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitTrustStoreOnly()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_ExplicitTrustStoreOnly();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerAlgorithm <em>Trust Manager Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust Manager Algorithm</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerAlgorithm()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_TrustManagerAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerFactory <em>Trust Manager Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust Manager Factory</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerFactory()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_TrustManagerFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustStoreType <em>Trust Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust Store Type</em>'.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType#getTrustStoreType()
	 * @see #getTlsServerTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsServerTrustStoreType_TrustStoreType();

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
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsTrustStoreType#getTrustStore <em>Trust Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust Store</em>'.
	 * @see org.mule.ide.config.core.TlsTrustStoreType#getTrustStore()
	 * @see #getTlsTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsTrustStoreType_TrustStore();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TlsTrustStoreType#getTrustStorePassword <em>Trust Store Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust Store Password</em>'.
	 * @see org.mule.ide.config.core.TlsTrustStoreType#getTrustStorePassword()
	 * @see #getTlsTrustStoreType()
	 * @generated
	 */
	EAttribute getTlsTrustStoreType_TrustStorePassword();

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
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TransactionRefFactoryType <em>Transaction Ref Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Ref Factory Type</em>'.
	 * @see org.mule.ide.config.core.TransactionRefFactoryType
	 * @generated
	 */
	EClass getTransactionRefFactoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TransactionRefFactoryType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.TransactionRefFactoryType#getRef()
	 * @see #getTransactionRefFactoryType()
	 * @generated
	 */
	EAttribute getTransactionRefFactoryType_Ref();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type</em>'.
	 * @see org.mule.ide.config.core.TransactionType
	 * @generated
	 */
	EClass getTransactionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.core.TransactionType#getAbstractTransactionFactoryGroup <em>Abstract Transaction Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Transaction Factory Group</em>'.
	 * @see org.mule.ide.config.core.TransactionType#getAbstractTransactionFactoryGroup()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_AbstractTransactionFactoryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.TransactionType#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Transaction Factory</em>'.
	 * @see org.mule.ide.config.core.TransactionType#getAbstractTransactionFactory()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_AbstractTransactionFactory();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.core.TransactionType#getTransactionFactory <em>Transaction Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Factory</em>'.
	 * @see org.mule.ide.config.core.TransactionType#getTransactionFactory()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_TransactionFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TransactionType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.mule.ide.config.core.TransactionType#getAction()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TransactionType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.mule.ide.config.core.TransactionType#getTimeout()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Timeout();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TransformerAppendStringType <em>Transformer Append String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Append String Type</em>'.
	 * @see org.mule.ide.config.core.TransformerAppendStringType
	 * @generated
	 */
	EClass getTransformerAppendStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TransformerAppendStringType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.mule.ide.config.core.TransformerAppendStringType#getMessage()
	 * @see #getTransformerAppendStringType()
	 * @generated
	 */
	EAttribute getTransformerAppendStringType_Message();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.core.TransformerRefType <em>Transformer Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Ref Type</em>'.
	 * @see org.mule.ide.config.core.TransformerRefType
	 * @generated
	 */
	EClass getTransformerRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.core.TransformerRefType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.mule.ide.config.core.TransformerRefType#getRef()
	 * @see #getTransformerRefType()
	 * @generated
	 */
	EAttribute getTransformerRefType_Ref();

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
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.mule.ide.config.core.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.CreateConnectorType <em>Create Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Create Connector Type</em>'.
	 * @see org.mule.ide.config.core.CreateConnectorType
	 * @generated
	 */
	EEnum getCreateConnectorType();

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
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.PoolExhaustedActionType <em>Pool Exhausted Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pool Exhausted Action Type</em>'.
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @generated
	 */
	EEnum getPoolExhaustedActionType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.core.ScopeType <em>Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Type</em>'.
	 * @see org.mule.ide.config.core.ScopeType
	 * @generated
	 */
	EEnum getScopeType();

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
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.CreateConnectorType <em>Create Connector Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Create Connector Type Object</em>'.
	 * @see org.mule.ide.config.core.CreateConnectorType
	 * @model instanceClass="org.mule.ide.config.core.CreateConnectorType"
	 *        extendedMetaData="name='createConnector_._type:Object' baseType='createConnector_._type'"
	 * @generated
	 */
	EDataType getCreateConnectorTypeObject();

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
	 * Returns the meta object for data type '{@link org.mule.ide.config.core.ScopeType <em>Scope Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Type Object</em>'.
	 * @see org.mule.ide.config.core.ScopeType
	 * @model instanceClass="org.mule.ide.config.core.ScopeType"
	 *        extendedMetaData="name='scope_._type:Object' baseType='scope_._type'"
	 * @generated
	 */
	EDataType getScopeTypeObject();

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
	 *        extendedMetaData="name='substitutableClass_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\[?[A-Za-z0-9\\.]+'"
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
