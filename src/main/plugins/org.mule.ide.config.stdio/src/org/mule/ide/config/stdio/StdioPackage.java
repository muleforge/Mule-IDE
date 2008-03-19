/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio;

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
 * @see org.mule.ide.config.stdio.StdioFactory
 * @model kind="package"
 * @generated
 */
public interface StdioPackage extends EPackage, IGlobalElementTypeProvider {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stdio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mulesource.org/schema/mule/stdio/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stdio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StdioPackage eINSTANCE = org.mule.ide.config.stdio.impl.StdioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mule.ide.config.stdio.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.stdio.impl.DocumentRootImpl
	 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT = 4;

	/**
	 * The feature id for the '<em><b>Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INBOUND_ENDPOINT = 5;

	/**
	 * The feature id for the '<em><b>Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTBOUND_ENDPOINT = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.stdio.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.stdio.impl.GlobalEndpointTypeImpl
	 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getGlobalEndpointType()
	 * @generated
	 */
	int GLOBAL_ENDPOINT_TYPE = 1;

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
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE__SYSTEM = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.GLOBAL_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.stdio.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.stdio.impl.InboundEndpointTypeImpl
	 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getInboundEndpointType()
	 * @generated
	 */
	int INBOUND_ENDPOINT_TYPE = 2;

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
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE__SYSTEM = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.INBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.stdio.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.stdio.impl.OutboundEndpointTypeImpl
	 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getOutboundEndpointType()
	 * @generated
	 */
	int OUTBOUND_ENDPOINT_TYPE = 3;

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
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE__SYSTEM = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outbound Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT = CorePackage.OUTBOUND_ENDPOINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl
	 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getStdioConnectorType()
	 * @generated
	 */
	int STDIO_CONNECTOR_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__NAME = CorePackage.CONNECTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__PROPERTY = CorePackage.CONNECTOR_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE = CorePackage.CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY = CorePackage.CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Service Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__SERVICE_OVERRIDES = CorePackage.CONNECTOR_TYPE__SERVICE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Create Dispatcher Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST = CorePackage.CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST;

	/**
	 * The feature id for the '<em><b>Create Multiple Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Dynamic Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__DYNAMIC_NOTIFICATION = CorePackage.CONNECTOR_TYPE__DYNAMIC_NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Concurrent Transacted Receivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS = CorePackage.CONNECTOR_TYPE__NUMBER_OF_CONCURRENT_TRANSACTED_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Message Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prompt Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prompt Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resource Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STDIO_CONNECTOR_TYPE_FEATURE_COUNT = CorePackage.CONNECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.stdio.SystemType <em>System Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.stdio.SystemType
	 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 5;

	/**
	 * The meta object id for the '<em>System Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.stdio.SystemType
	 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getSystemTypeObject()
	 * @generated
	 */
	int SYSTEM_TYPE_OBJECT = 6;


	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.stdio.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.stdio.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.stdio.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.stdio.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.stdio.DocumentRoot#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot#getConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.stdio.DocumentRoot#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot#getEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.stdio.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound Endpoint</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot#getInboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InboundEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.stdio.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outbound Endpoint</em>'.
	 * @see org.mule.ide.config.stdio.DocumentRoot#getOutboundEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OutboundEndpoint();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.stdio.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Endpoint Type</em>'.
	 * @see org.mule.ide.config.stdio.GlobalEndpointType
	 * @generated
	 */
	EClass getGlobalEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.GlobalEndpointType#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.mule.ide.config.stdio.GlobalEndpointType#getSystem()
	 * @see #getGlobalEndpointType()
	 * @generated
	 */
	EAttribute getGlobalEndpointType_System();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.stdio.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.stdio.InboundEndpointType
	 * @generated
	 */
	EClass getInboundEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.InboundEndpointType#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.mule.ide.config.stdio.InboundEndpointType#getSystem()
	 * @see #getInboundEndpointType()
	 * @generated
	 */
	EAttribute getInboundEndpointType_System();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.stdio.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Endpoint Type</em>'.
	 * @see org.mule.ide.config.stdio.OutboundEndpointType
	 * @generated
	 */
	EClass getOutboundEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.OutboundEndpointType#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.mule.ide.config.stdio.OutboundEndpointType#getSystem()
	 * @see #getOutboundEndpointType()
	 * @generated
	 */
	EAttribute getOutboundEndpointType_System();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.stdio.StdioConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see org.mule.ide.config.stdio.StdioConnectorType
	 * @generated
	 */
	EClass getStdioConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.StdioConnectorType#getMessageDelayTime <em>Message Delay Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Delay Time</em>'.
	 * @see org.mule.ide.config.stdio.StdioConnectorType#getMessageDelayTime()
	 * @see #getStdioConnectorType()
	 * @generated
	 */
	EAttribute getStdioConnectorType_MessageDelayTime();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.StdioConnectorType#getOutputMessage <em>Output Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Message</em>'.
	 * @see org.mule.ide.config.stdio.StdioConnectorType#getOutputMessage()
	 * @see #getStdioConnectorType()
	 * @generated
	 */
	EAttribute getStdioConnectorType_OutputMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.StdioConnectorType#getOutputMessageCode <em>Output Message Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Message Code</em>'.
	 * @see org.mule.ide.config.stdio.StdioConnectorType#getOutputMessageCode()
	 * @see #getStdioConnectorType()
	 * @generated
	 */
	EAttribute getStdioConnectorType_OutputMessageCode();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.StdioConnectorType#getPromptMessage <em>Prompt Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt Message</em>'.
	 * @see org.mule.ide.config.stdio.StdioConnectorType#getPromptMessage()
	 * @see #getStdioConnectorType()
	 * @generated
	 */
	EAttribute getStdioConnectorType_PromptMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.StdioConnectorType#getPromptMessageCode <em>Prompt Message Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt Message Code</em>'.
	 * @see org.mule.ide.config.stdio.StdioConnectorType#getPromptMessageCode()
	 * @see #getStdioConnectorType()
	 * @generated
	 */
	EAttribute getStdioConnectorType_PromptMessageCode();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.stdio.StdioConnectorType#getResourceBundle <em>Resource Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Bundle</em>'.
	 * @see org.mule.ide.config.stdio.StdioConnectorType#getResourceBundle()
	 * @see #getStdioConnectorType()
	 * @generated
	 */
	EAttribute getStdioConnectorType_ResourceBundle();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.stdio.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Type</em>'.
	 * @see org.mule.ide.config.stdio.SystemType
	 * @generated
	 */
	EEnum getSystemType();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.stdio.SystemType <em>System Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>System Type Object</em>'.
	 * @see org.mule.ide.config.stdio.SystemType
	 * @model instanceClass="org.mule.ide.config.stdio.SystemType"
	 *        extendedMetaData="name='system_._type:Object' baseType='system_._type'"
	 * @generated
	 */
	EDataType getSystemTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StdioFactory getStdioFactory();

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
		 * The meta object literal for the '{@link org.mule.ide.config.stdio.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.stdio.impl.DocumentRootImpl
		 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link org.mule.ide.config.stdio.impl.GlobalEndpointTypeImpl <em>Global Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.stdio.impl.GlobalEndpointTypeImpl
		 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getGlobalEndpointType()
		 * @generated
		 */
		EClass GLOBAL_ENDPOINT_TYPE = eINSTANCE.getGlobalEndpointType();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ENDPOINT_TYPE__SYSTEM = eINSTANCE.getGlobalEndpointType_System();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.stdio.impl.InboundEndpointTypeImpl <em>Inbound Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.stdio.impl.InboundEndpointTypeImpl
		 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getInboundEndpointType()
		 * @generated
		 */
		EClass INBOUND_ENDPOINT_TYPE = eINSTANCE.getInboundEndpointType();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_ENDPOINT_TYPE__SYSTEM = eINSTANCE.getInboundEndpointType_System();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.stdio.impl.OutboundEndpointTypeImpl <em>Outbound Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.stdio.impl.OutboundEndpointTypeImpl
		 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getOutboundEndpointType()
		 * @generated
		 */
		EClass OUTBOUND_ENDPOINT_TYPE = eINSTANCE.getOutboundEndpointType();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_ENDPOINT_TYPE__SYSTEM = eINSTANCE.getOutboundEndpointType_System();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl
		 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getStdioConnectorType()
		 * @generated
		 */
		EClass STDIO_CONNECTOR_TYPE = eINSTANCE.getStdioConnectorType();

		/**
		 * The meta object literal for the '<em><b>Message Delay Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME = eINSTANCE.getStdioConnectorType_MessageDelayTime();

		/**
		 * The meta object literal for the '<em><b>Output Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE = eINSTANCE.getStdioConnectorType_OutputMessage();

		/**
		 * The meta object literal for the '<em><b>Output Message Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE = eINSTANCE.getStdioConnectorType_OutputMessageCode();

		/**
		 * The meta object literal for the '<em><b>Prompt Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE = eINSTANCE.getStdioConnectorType_PromptMessage();

		/**
		 * The meta object literal for the '<em><b>Prompt Message Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE = eINSTANCE.getStdioConnectorType_PromptMessageCode();

		/**
		 * The meta object literal for the '<em><b>Resource Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE = eINSTANCE.getStdioConnectorType_ResourceBundle();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.stdio.SystemType <em>System Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.stdio.SystemType
		 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getSystemType()
		 * @generated
		 */
		EEnum SYSTEM_TYPE = eINSTANCE.getSystemType();

		/**
		 * The meta object literal for the '<em>System Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.stdio.SystemType
		 * @see org.mule.ide.config.stdio.impl.StdioPackageImpl#getSystemTypeObject()
		 * @generated
		 */
		EDataType SYSTEM_TYPE_OBJECT = eINSTANCE.getSystemTypeObject();

	}

} //StdioPackage
