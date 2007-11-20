/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.mule.ide.config.spring.SpringFactory
 * @model kind="package"
 * @generated
 */
public interface SpringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.springframework.org/schema/beans";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpringPackage eINSTANCE = org.mule.ide.config.spring.impl.SpringPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.AliasTypeImpl <em>Alias Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.AliasTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getAliasType()
	 * @generated
	 */
	int ALIAS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.ArgTypeTypeImpl <em>Arg Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.ArgTypeTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getArgTypeType()
	 * @generated
	 */
	int ARG_TYPE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE_TYPE__MATCH = 1;

	/**
	 * The number of structural features of the '<em>Arg Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.BaseCollectionTypeImpl <em>Base Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.BaseCollectionTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getBaseCollectionType()
	 * @generated
	 */
	int BASE_COLLECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COLLECTION_TYPE__MERGE = 0;

	/**
	 * The number of structural features of the '<em>Base Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_COLLECTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.BeansTypeImpl <em>Beans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.BeansTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getBeansType()
	 * @generated
	 */
	int BEANS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__BEAN = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Default Autowire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__DEFAULT_AUTOWIRE = 6;

	/**
	 * The feature id for the '<em><b>Default Dependency Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__DEFAULT_DEPENDENCY_CHECK = 7;

	/**
	 * The feature id for the '<em><b>Default Destroy Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__DEFAULT_DESTROY_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Default Init Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__DEFAULT_INIT_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Default Lazy Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__DEFAULT_LAZY_INIT = 10;

	/**
	 * The feature id for the '<em><b>Default Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE__DEFAULT_MERGE = 11;

	/**
	 * The number of structural features of the '<em>Beans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.IdentifiedTypeImpl <em>Identified Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.IdentifiedTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getIdentifiedType()
	 * @generated
	 */
	int IDENTIFIED_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identified Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.BeanTypeImpl <em>Bean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.BeanTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getBeanType()
	 * @generated
	 */
	int BEAN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__ID = IDENTIFIED_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__DESCRIPTION = IDENTIFIED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__GROUP = IDENTIFIED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__META = IDENTIFIED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constructor Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__CONSTRUCTOR_ARG = IDENTIFIED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__PROPERTY = IDENTIFIED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lookup Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__LOOKUP_METHOD = IDENTIFIED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Replaced Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__REPLACED_METHOD = IDENTIFIED_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__ANY = IDENTIFIED_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__ABSTRACT = IDENTIFIED_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Autowire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__AUTOWIRE = IDENTIFIED_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Autowire Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__AUTOWIRE_CANDIDATE = IDENTIFIED_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__CLASS = IDENTIFIED_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dependency Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__DEPENDENCY_CHECK = IDENTIFIED_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__DEPENDS_ON = IDENTIFIED_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Destroy Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__DESTROY_METHOD = IDENTIFIED_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__FACTORY_BEAN = IDENTIFIED_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Factory Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__FACTORY_METHOD = IDENTIFIED_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Init Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__INIT_METHOD = IDENTIFIED_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Lazy Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__LAZY_INIT = IDENTIFIED_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__NAME = IDENTIFIED_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__PARENT = IDENTIFIED_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__SCOPE = IDENTIFIED_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE__ANY_ATTRIBUTE = IDENTIFIED_TYPE_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Bean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_TYPE_FEATURE_COUNT = IDENTIFIED_TYPE_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.ConstructorArgTypeImpl <em>Constructor Arg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.ConstructorArgTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getConstructorArgType()
	 * @generated
	 */
	int CONSTRUCTOR_ARG_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__BEAN = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__REF = 2;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__IDREF = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__NULL = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__SET = 7;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__MAP = 8;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__PROPS = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__ANY = 10;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__INDEX = 11;

	/**
	 * The feature id for the '<em><b>Ref1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__REF1 = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE__VALUE1 = 14;

	/**
	 * The number of structural features of the '<em>Constructor Arg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARG_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.DescriptionTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 6;

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
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.DocumentRootImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

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
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARG_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEAN = 5;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEANS = 6;

	/**
	 * The feature id for the '<em><b>Constructor Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTRUCTOR_ARG = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDREF = 10;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORT = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY = 12;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST = 13;

	/**
	 * The feature id for the '<em><b>Lookup Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOKUP_METHOD = 14;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAP = 15;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__META = 16;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NULL = 17;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROP = 18;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPS = 20;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REF = 21;

	/**
	 * The feature id for the '<em><b>Replaced Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPLACED_METHOD = 22;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 24;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.EntryTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__BEAN = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__IDREF = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__NULL = 6;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__LIST = 7;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__SET = 8;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__MAP = 9;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__PROPS = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Key1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__KEY1 = 12;

	/**
	 * The feature id for the '<em><b>Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__KEY_REF = 13;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__VALUE1 = 14;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__VALUE_REF = 15;

	/**
	 * The number of structural features of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.IdrefTypeImpl <em>Idref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.IdrefTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getIdrefType()
	 * @generated
	 */
	int IDREF_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDREF_TYPE__BEAN = 0;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDREF_TYPE__LOCAL = 1;

	/**
	 * The number of structural features of the '<em>Idref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDREF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.ImportTypeImpl <em>Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.ImportTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.KeyTypeImpl <em>Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.KeyTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__BEAN = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__REF = 2;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__IDREF = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__NULL = 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__LIST = 6;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__SET = 7;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__MAP = 8;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__PROPS = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__ANY = 10;

	/**
	 * The number of structural features of the '<em>Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.TypedCollectionTypeImpl <em>Typed Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.TypedCollectionTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getTypedCollectionType()
	 * @generated
	 */
	int TYPED_COLLECTION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_COLLECTION_TYPE__MERGE = BASE_COLLECTION_TYPE__MERGE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_COLLECTION_TYPE__VALUE_TYPE = BASE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_COLLECTION_TYPE_FEATURE_COUNT = BASE_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.ListOrSetTypeImpl <em>List Or Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.ListOrSetTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getListOrSetType()
	 * @generated
	 */
	int LIST_OR_SET_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__MERGE = TYPED_COLLECTION_TYPE__MERGE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__VALUE_TYPE = TYPED_COLLECTION_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__GROUP = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__BEAN = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__REF = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__IDREF = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__VALUE = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__NULL = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__LIST = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__SET = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__MAP = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__PROPS = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE__ANY = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>List Or Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OR_SET_TYPE_FEATURE_COUNT = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.LookupMethodTypeImpl <em>Lookup Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.LookupMethodTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getLookupMethodType()
	 * @generated
	 */
	int LOOKUP_METHOD_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_METHOD_TYPE__BEAN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_METHOD_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Lookup Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_METHOD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.MapTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__MERGE = TYPED_COLLECTION_TYPE__MERGE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__VALUE_TYPE = TYPED_COLLECTION_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__GROUP = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__ENTRY = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__KEY_TYPE = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = TYPED_COLLECTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.MetaTypeImpl <em>Meta Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.MetaTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getMetaType()
	 * @generated
	 */
	int META_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Meta Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.NullTypeImpl <em>Null Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.NullTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getNullType()
	 * @generated
	 */
	int NULL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Null Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.PropertyTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__META = 1;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__BEAN = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__IDREF = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NULL = 6;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__LIST = 7;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SET = 8;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__MAP = 9;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PROPS = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 12;

	/**
	 * The feature id for the '<em><b>Ref1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__REF1 = 13;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE1 = 14;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.PropsTypeImpl <em>Props Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.PropsTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getPropsType()
	 * @generated
	 */
	int PROPS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_TYPE__MERGE = BASE_COLLECTION_TYPE__MERGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_TYPE__GROUP = BASE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_TYPE__PROP = BASE_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Props Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_TYPE_FEATURE_COUNT = BASE_COLLECTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.PropTypeImpl <em>Prop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.PropTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getPropType()
	 * @generated
	 */
	int PROP_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_TYPE__KEY = 1;

	/**
	 * The number of structural features of the '<em>Prop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.RefTypeImpl <em>Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.RefTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getRefType()
	 * @generated
	 */
	int REF_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TYPE__BEAN = 0;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TYPE__LOCAL = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TYPE__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl <em>Replaced Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getReplacedMethodType()
	 * @generated
	 */
	int REPLACED_METHOD_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACED_METHOD_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Arg Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACED_METHOD_TYPE__ARG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACED_METHOD_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Replacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACED_METHOD_TYPE__REPLACER = 3;

	/**
	 * The number of structural features of the '<em>Replaced Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACED_METHOD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.impl.ValueTypeImpl
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.AutowireType <em>Autowire Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.AutowireType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getAutowireType()
	 * @generated
	 */
	int AUTOWIRE_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.DefaultableBoolean <em>Defaultable Boolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultableBoolean()
	 * @generated
	 */
	int DEFAULTABLE_BOOLEAN = 26;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.DefaultAutowireType <em>Default Autowire Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DefaultAutowireType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultAutowireType()
	 * @generated
	 */
	int DEFAULT_AUTOWIRE_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.DefaultDependencyCheckType <em>Default Dependency Check Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultDependencyCheckType()
	 * @generated
	 */
	int DEFAULT_DEPENDENCY_CHECK_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.spring.DependencyCheckType <em>Dependency Check Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DependencyCheckType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDependencyCheckType()
	 * @generated
	 */
	int DEPENDENCY_CHECK_TYPE = 29;

	/**
	 * The meta object id for the '<em>Autowire Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.AutowireType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getAutowireTypeObject()
	 * @generated
	 */
	int AUTOWIRE_TYPE_OBJECT = 30;

	/**
	 * The meta object id for the '<em>Defaultable Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultableBooleanObject()
	 * @generated
	 */
	int DEFAULTABLE_BOOLEAN_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Default Autowire Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DefaultAutowireType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultAutowireTypeObject()
	 * @generated
	 */
	int DEFAULT_AUTOWIRE_TYPE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Default Dependency Check Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultDependencyCheckTypeObject()
	 * @generated
	 */
	int DEFAULT_DEPENDENCY_CHECK_TYPE_OBJECT = 33;

	/**
	 * The meta object id for the '<em>Dependency Check Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.spring.DependencyCheckType
	 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDependencyCheckTypeObject()
	 * @generated
	 */
	int DEPENDENCY_CHECK_TYPE_OBJECT = 34;


	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Type</em>'.
	 * @see org.mule.ide.config.spring.AliasType
	 * @generated
	 */
	EClass getAliasType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.AliasType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.mule.ide.config.spring.AliasType#getAlias()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.AliasType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.spring.AliasType#getName()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.ArgTypeType <em>Arg Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arg Type Type</em>'.
	 * @see org.mule.ide.config.spring.ArgTypeType
	 * @generated
	 */
	EClass getArgTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.ArgTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.spring.ArgTypeType#getMixed()
	 * @see #getArgTypeType()
	 * @generated
	 */
	EAttribute getArgTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ArgTypeType#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match</em>'.
	 * @see org.mule.ide.config.spring.ArgTypeType#getMatch()
	 * @see #getArgTypeType()
	 * @generated
	 */
	EAttribute getArgTypeType_Match();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.BaseCollectionType <em>Base Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Collection Type</em>'.
	 * @see org.mule.ide.config.spring.BaseCollectionType
	 * @generated
	 */
	EClass getBaseCollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BaseCollectionType#getMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge</em>'.
	 * @see org.mule.ide.config.spring.BaseCollectionType#getMerge()
	 * @see #getBaseCollectionType()
	 * @generated
	 */
	EAttribute getBaseCollectionType_Merge();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.BeansType <em>Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beans Type</em>'.
	 * @see org.mule.ide.config.spring.BeansType
	 * @generated
	 */
	EClass getBeansType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.BeansType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getDescription()
	 * @see #getBeansType()
	 * @generated
	 */
	EReference getBeansType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.BeansType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getGroup()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeansType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getImport()
	 * @see #getBeansType()
	 * @generated
	 */
	EReference getBeansType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeansType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getAlias()
	 * @see #getBeansType()
	 * @generated
	 */
	EReference getBeansType_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeansType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getBean()
	 * @see #getBeansType()
	 * @generated
	 */
	EReference getBeansType_Bean();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.BeansType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getAny()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeansType#getDefaultAutowire <em>Default Autowire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Autowire</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getDefaultAutowire()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_DefaultAutowire();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeansType#getDefaultDependencyCheck <em>Default Dependency Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Dependency Check</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getDefaultDependencyCheck()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_DefaultDependencyCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeansType#getDefaultDestroyMethod <em>Default Destroy Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Destroy Method</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getDefaultDestroyMethod()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_DefaultDestroyMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeansType#getDefaultInitMethod <em>Default Init Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Init Method</em>'.
	 * @see org.mule.ide.config.spring.BeansType#getDefaultInitMethod()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_DefaultInitMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeansType#isDefaultLazyInit <em>Default Lazy Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Lazy Init</em>'.
	 * @see org.mule.ide.config.spring.BeansType#isDefaultLazyInit()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_DefaultLazyInit();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeansType#isDefaultMerge <em>Default Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Merge</em>'.
	 * @see org.mule.ide.config.spring.BeansType#isDefaultMerge()
	 * @see #getBeansType()
	 * @generated
	 */
	EAttribute getBeansType_DefaultMerge();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.BeanType <em>Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Type</em>'.
	 * @see org.mule.ide.config.spring.BeanType
	 * @generated
	 */
	EClass getBeanType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.BeanType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getDescription()
	 * @see #getBeanType()
	 * @generated
	 */
	EReference getBeanType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.BeanType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getGroup()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeanType#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getMeta()
	 * @see #getBeanType()
	 * @generated
	 */
	EReference getBeanType_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeanType#getConstructorArg <em>Constructor Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructor Arg</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getConstructorArg()
	 * @see #getBeanType()
	 * @generated
	 */
	EReference getBeanType_ConstructorArg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeanType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getProperty()
	 * @see #getBeanType()
	 * @generated
	 */
	EReference getBeanType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeanType#getLookupMethod <em>Lookup Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup Method</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getLookupMethod()
	 * @see #getBeanType()
	 * @generated
	 */
	EReference getBeanType_LookupMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.BeanType#getReplacedMethod <em>Replaced Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replaced Method</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getReplacedMethod()
	 * @see #getBeanType()
	 * @generated
	 */
	EReference getBeanType_ReplacedMethod();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.BeanType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getAny()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.mule.ide.config.spring.BeanType#isAbstract()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getAutowire <em>Autowire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autowire</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getAutowire()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Autowire();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#isAutowireCandidate <em>Autowire Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autowire Candidate</em>'.
	 * @see org.mule.ide.config.spring.BeanType#isAutowireCandidate()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_AutowireCandidate();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getClass_()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getDependencyCheck <em>Dependency Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Check</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getDependencyCheck()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_DependencyCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getDependsOn()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_DependsOn();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getDestroyMethod <em>Destroy Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destroy Method</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getDestroyMethod()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_DestroyMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getFactoryBean <em>Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Bean</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getFactoryBean()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_FactoryBean();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getFactoryMethod <em>Factory Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Method</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getFactoryMethod()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_FactoryMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getInitMethod <em>Init Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Method</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getInitMethod()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_InitMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getLazyInit <em>Lazy Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy Init</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getLazyInit()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_LazyInit();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getName()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getParent()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.BeanType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getScope()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_Scope();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.BeanType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.mule.ide.config.spring.BeanType#getAnyAttribute()
	 * @see #getBeanType()
	 * @generated
	 */
	EAttribute getBeanType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.ConstructorArgType <em>Constructor Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Arg Type</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType
	 * @generated
	 */
	EClass getConstructorArgType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getDescription()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getBean()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Bean();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getRef()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Idref</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getIdref()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Idref();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getValue()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getNull()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Null();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getList()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getSet()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Set();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getMap()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Map();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.ConstructorArgType#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Props</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getProps()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EReference getConstructorArgType_Props();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.ConstructorArgType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getAny()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EAttribute getConstructorArgType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ConstructorArgType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getIndex()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EAttribute getConstructorArgType_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ConstructorArgType#getRef1 <em>Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref1</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getRef1()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EAttribute getConstructorArgType_Ref1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ConstructorArgType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getType()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EAttribute getConstructorArgType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ConstructorArgType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org.mule.ide.config.spring.ConstructorArgType#getValue1()
	 * @see #getConstructorArgType()
	 * @generated
	 */
	EAttribute getConstructorArgType_Value1();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.mule.ide.config.spring.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.spring.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.spring.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.spring.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getAlias()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg Type</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getArgType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ArgType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getBean()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bean();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beans</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getBeans()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Beans();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getConstructorArg <em>Constructor Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constructor Arg</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getConstructorArg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConstructorArg();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Idref</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getIdref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Idref();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getImport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getLookupMethod <em>Lookup Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Method</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getLookupMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LookupMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Map();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getMeta()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Meta();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getNull()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Null();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prop</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getProp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Prop();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Props</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getProps()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Props();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getReplacedMethod <em>Replaced Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replaced Method</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getReplacedMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReplacedMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Set();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.mule.ide.config.spring.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Value();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see org.mule.ide.config.spring.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.EntryType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getKey()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Key();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.EntryType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getGroup()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getBean()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Bean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getRef()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idref</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getIdref()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Idref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getValue()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getNull()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Null();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getList()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getSet()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getMap()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.EntryType#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getProps()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Props();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.EntryType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getAny()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.EntryType#getKey1 <em>Key1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key1</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getKey1()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Key1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.EntryType#getKeyRef <em>Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Ref</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getKeyRef()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_KeyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.EntryType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getValue1()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Value1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.EntryType#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Ref</em>'.
	 * @see org.mule.ide.config.spring.EntryType#getValueRef()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_ValueRef();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.IdentifiedType <em>Identified Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Type</em>'.
	 * @see org.mule.ide.config.spring.IdentifiedType
	 * @generated
	 */
	EClass getIdentifiedType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.IdentifiedType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.mule.ide.config.spring.IdentifiedType#getId()
	 * @see #getIdentifiedType()
	 * @generated
	 */
	EAttribute getIdentifiedType_Id();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.IdrefType <em>Idref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idref Type</em>'.
	 * @see org.mule.ide.config.spring.IdrefType
	 * @generated
	 */
	EClass getIdrefType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.IdrefType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.IdrefType#getBean()
	 * @see #getIdrefType()
	 * @generated
	 */
	EAttribute getIdrefType_Bean();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.IdrefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see org.mule.ide.config.spring.IdrefType#getLocal()
	 * @see #getIdrefType()
	 * @generated
	 */
	EAttribute getIdrefType_Local();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type</em>'.
	 * @see org.mule.ide.config.spring.ImportType
	 * @generated
	 */
	EClass getImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ImportType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.mule.ide.config.spring.ImportType#getResource()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_Resource();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Type</em>'.
	 * @see org.mule.ide.config.spring.KeyType
	 * @generated
	 */
	EClass getKeyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.KeyType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getGroup()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getBean()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Bean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getRef()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idref</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getIdref()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Idref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getValue()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getNull()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Null();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getList()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getSet()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getMap()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.KeyType#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getProps()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Props();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.KeyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.spring.KeyType#getAny()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_Any();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.ListOrSetType <em>List Or Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Or Set Type</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType
	 * @generated
	 */
	EClass getListOrSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.ListOrSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getGroup()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EAttribute getListOrSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getBean()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Bean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getRef()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idref</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getIdref()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Idref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getValue()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getNull()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Null();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getList()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getSet()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getMap()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ListOrSetType#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getProps()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EReference getListOrSetType_Props();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.ListOrSetType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.spring.ListOrSetType#getAny()
	 * @see #getListOrSetType()
	 * @generated
	 */
	EAttribute getListOrSetType_Any();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.LookupMethodType <em>Lookup Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Method Type</em>'.
	 * @see org.mule.ide.config.spring.LookupMethodType
	 * @generated
	 */
	EClass getLookupMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.LookupMethodType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.LookupMethodType#getBean()
	 * @see #getLookupMethodType()
	 * @generated
	 */
	EAttribute getLookupMethodType_Bean();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.LookupMethodType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.spring.LookupMethodType#getName()
	 * @see #getLookupMethodType()
	 * @generated
	 */
	EAttribute getLookupMethodType_Name();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see org.mule.ide.config.spring.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.MapType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.MapType#getGroup()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.MapType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.mule.ide.config.spring.MapType#getEntry()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_Entry();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.MapType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Type</em>'.
	 * @see org.mule.ide.config.spring.MapType#getKeyType()
	 * @see #getMapType()
	 * @generated
	 */
	EAttribute getMapType_KeyType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.MetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Type</em>'.
	 * @see org.mule.ide.config.spring.MetaType
	 * @generated
	 */
	EClass getMetaType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.MetaType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.mule.ide.config.spring.MetaType#getKey()
	 * @see #getMetaType()
	 * @generated
	 */
	EAttribute getMetaType_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.MetaType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mule.ide.config.spring.MetaType#getValue()
	 * @see #getMetaType()
	 * @generated
	 */
	EAttribute getMetaType_Value();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.NullType <em>Null Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Type</em>'.
	 * @see org.mule.ide.config.spring.NullType
	 * @generated
	 */
	EClass getNullType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.NullType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.spring.NullType#getMixed()
	 * @see #getNullType()
	 * @generated
	 */
	EAttribute getNullType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.mule.ide.config.spring.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getDescription()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getMeta()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Meta();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getBean()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Bean();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getRef()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Idref</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getIdref()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Idref();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getNull()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Null();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getList()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getSet()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Set();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getMap()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Map();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.spring.PropertyType#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Props</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getProps()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Props();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.PropertyType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getAny()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.PropertyType#getRef1 <em>Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref1</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getRef1()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Ref1();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.PropertyType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org.mule.ide.config.spring.PropertyType#getValue1()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value1();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.PropsType <em>Props Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Props Type</em>'.
	 * @see org.mule.ide.config.spring.PropsType
	 * @generated
	 */
	EClass getPropsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.PropsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.PropsType#getGroup()
	 * @see #getPropsType()
	 * @generated
	 */
	EAttribute getPropsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.PropsType#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see org.mule.ide.config.spring.PropsType#getProp()
	 * @see #getPropsType()
	 * @generated
	 */
	EReference getPropsType_Prop();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.PropType <em>Prop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prop Type</em>'.
	 * @see org.mule.ide.config.spring.PropType
	 * @generated
	 */
	EClass getPropType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.PropType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.spring.PropType#getMixed()
	 * @see #getPropType()
	 * @generated
	 */
	EAttribute getPropType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.PropType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.mule.ide.config.spring.PropType#getKey()
	 * @see #getPropType()
	 * @generated
	 */
	EAttribute getPropType_Key();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.RefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Type</em>'.
	 * @see org.mule.ide.config.spring.RefType
	 * @generated
	 */
	EClass getRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.RefType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see org.mule.ide.config.spring.RefType#getBean()
	 * @see #getRefType()
	 * @generated
	 */
	EAttribute getRefType_Bean();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.RefType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see org.mule.ide.config.spring.RefType#getLocal()
	 * @see #getRefType()
	 * @generated
	 */
	EAttribute getRefType_Local();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.RefType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.mule.ide.config.spring.RefType#getParent()
	 * @see #getRefType()
	 * @generated
	 */
	EAttribute getRefType_Parent();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.ReplacedMethodType <em>Replaced Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replaced Method Type</em>'.
	 * @see org.mule.ide.config.spring.ReplacedMethodType
	 * @generated
	 */
	EClass getReplacedMethodType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.ReplacedMethodType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.spring.ReplacedMethodType#getGroup()
	 * @see #getReplacedMethodType()
	 * @generated
	 */
	EAttribute getReplacedMethodType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.spring.ReplacedMethodType#getArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg Type</em>'.
	 * @see org.mule.ide.config.spring.ReplacedMethodType#getArgType()
	 * @see #getReplacedMethodType()
	 * @generated
	 */
	EReference getReplacedMethodType_ArgType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ReplacedMethodType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mule.ide.config.spring.ReplacedMethodType#getName()
	 * @see #getReplacedMethodType()
	 * @generated
	 */
	EAttribute getReplacedMethodType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ReplacedMethodType#getReplacer <em>Replacer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacer</em>'.
	 * @see org.mule.ide.config.spring.ReplacedMethodType#getReplacer()
	 * @see #getReplacedMethodType()
	 * @generated
	 */
	EAttribute getReplacedMethodType_Replacer();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.TypedCollectionType <em>Typed Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Collection Type</em>'.
	 * @see org.mule.ide.config.spring.TypedCollectionType
	 * @generated
	 */
	EClass getTypedCollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.TypedCollectionType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.mule.ide.config.spring.TypedCollectionType#getValueType()
	 * @see #getTypedCollectionType()
	 * @generated
	 */
	EAttribute getTypedCollectionType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.spring.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.mule.ide.config.spring.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.spring.ValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.spring.ValueType#getMixed()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.spring.ValueType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mule.ide.config.spring.ValueType#getType()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Type();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.spring.AutowireType <em>Autowire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Autowire Type</em>'.
	 * @see org.mule.ide.config.spring.AutowireType
	 * @generated
	 */
	EEnum getAutowireType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.spring.DefaultableBoolean <em>Defaultable Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Defaultable Boolean</em>'.
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @generated
	 */
	EEnum getDefaultableBoolean();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.spring.DefaultAutowireType <em>Default Autowire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Autowire Type</em>'.
	 * @see org.mule.ide.config.spring.DefaultAutowireType
	 * @generated
	 */
	EEnum getDefaultAutowireType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.spring.DefaultDependencyCheckType <em>Default Dependency Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Dependency Check Type</em>'.
	 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
	 * @generated
	 */
	EEnum getDefaultDependencyCheckType();

	/**
	 * Returns the meta object for enum '{@link org.mule.ide.config.spring.DependencyCheckType <em>Dependency Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Check Type</em>'.
	 * @see org.mule.ide.config.spring.DependencyCheckType
	 * @generated
	 */
	EEnum getDependencyCheckType();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.spring.AutowireType <em>Autowire Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Autowire Type Object</em>'.
	 * @see org.mule.ide.config.spring.AutowireType
	 * @model instanceClass="org.mule.ide.config.spring.AutowireType"
	 *        extendedMetaData="name='autowire_._type:Object' baseType='autowire_._type'"
	 * @generated
	 */
	EDataType getAutowireTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.spring.DefaultableBoolean <em>Defaultable Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Defaultable Boolean Object</em>'.
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @model instanceClass="org.mule.ide.config.spring.DefaultableBoolean"
	 *        extendedMetaData="name='defaultable-boolean:Object' baseType='defaultable-boolean'"
	 * @generated
	 */
	EDataType getDefaultableBooleanObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.spring.DefaultAutowireType <em>Default Autowire Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Autowire Type Object</em>'.
	 * @see org.mule.ide.config.spring.DefaultAutowireType
	 * @model instanceClass="org.mule.ide.config.spring.DefaultAutowireType"
	 *        extendedMetaData="name='default-autowire_._type:Object' baseType='default-autowire_._type'"
	 * @generated
	 */
	EDataType getDefaultAutowireTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.spring.DefaultDependencyCheckType <em>Default Dependency Check Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Dependency Check Type Object</em>'.
	 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
	 * @model instanceClass="org.mule.ide.config.spring.DefaultDependencyCheckType"
	 *        extendedMetaData="name='default-dependency-check_._type:Object' baseType='default-dependency-check_._type'"
	 * @generated
	 */
	EDataType getDefaultDependencyCheckTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.mule.ide.config.spring.DependencyCheckType <em>Dependency Check Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dependency Check Type Object</em>'.
	 * @see org.mule.ide.config.spring.DependencyCheckType
	 * @model instanceClass="org.mule.ide.config.spring.DependencyCheckType"
	 *        extendedMetaData="name='dependency-check_._type:Object' baseType='dependency-check_._type'"
	 * @generated
	 */
	EDataType getDependencyCheckTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpringFactory getSpringFactory();

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
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.AliasTypeImpl <em>Alias Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.AliasTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getAliasType()
		 * @generated
		 */
		EClass ALIAS_TYPE = eINSTANCE.getAliasType();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS_TYPE__ALIAS = eINSTANCE.getAliasType_Alias();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS_TYPE__NAME = eINSTANCE.getAliasType_Name();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.ArgTypeTypeImpl <em>Arg Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.ArgTypeTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getArgTypeType()
		 * @generated
		 */
		EClass ARG_TYPE_TYPE = eINSTANCE.getArgTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARG_TYPE_TYPE__MIXED = eINSTANCE.getArgTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARG_TYPE_TYPE__MATCH = eINSTANCE.getArgTypeType_Match();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.BaseCollectionTypeImpl <em>Base Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.BaseCollectionTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getBaseCollectionType()
		 * @generated
		 */
		EClass BASE_COLLECTION_TYPE = eINSTANCE.getBaseCollectionType();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_COLLECTION_TYPE__MERGE = eINSTANCE.getBaseCollectionType_Merge();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.BeansTypeImpl <em>Beans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.BeansTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getBeansType()
		 * @generated
		 */
		EClass BEANS_TYPE = eINSTANCE.getBeansType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEANS_TYPE__DESCRIPTION = eINSTANCE.getBeansType_Description();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__GROUP = eINSTANCE.getBeansType_Group();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEANS_TYPE__IMPORT = eINSTANCE.getBeansType_Import();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEANS_TYPE__ALIAS = eINSTANCE.getBeansType_Alias();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEANS_TYPE__BEAN = eINSTANCE.getBeansType_Bean();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__ANY = eINSTANCE.getBeansType_Any();

		/**
		 * The meta object literal for the '<em><b>Default Autowire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__DEFAULT_AUTOWIRE = eINSTANCE.getBeansType_DefaultAutowire();

		/**
		 * The meta object literal for the '<em><b>Default Dependency Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__DEFAULT_DEPENDENCY_CHECK = eINSTANCE.getBeansType_DefaultDependencyCheck();

		/**
		 * The meta object literal for the '<em><b>Default Destroy Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__DEFAULT_DESTROY_METHOD = eINSTANCE.getBeansType_DefaultDestroyMethod();

		/**
		 * The meta object literal for the '<em><b>Default Init Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__DEFAULT_INIT_METHOD = eINSTANCE.getBeansType_DefaultInitMethod();

		/**
		 * The meta object literal for the '<em><b>Default Lazy Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__DEFAULT_LAZY_INIT = eINSTANCE.getBeansType_DefaultLazyInit();

		/**
		 * The meta object literal for the '<em><b>Default Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEANS_TYPE__DEFAULT_MERGE = eINSTANCE.getBeansType_DefaultMerge();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.BeanTypeImpl <em>Bean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.BeanTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getBeanType()
		 * @generated
		 */
		EClass BEAN_TYPE = eINSTANCE.getBeanType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_TYPE__DESCRIPTION = eINSTANCE.getBeanType_Description();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__GROUP = eINSTANCE.getBeanType_Group();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_TYPE__META = eINSTANCE.getBeanType_Meta();

		/**
		 * The meta object literal for the '<em><b>Constructor Arg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_TYPE__CONSTRUCTOR_ARG = eINSTANCE.getBeanType_ConstructorArg();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_TYPE__PROPERTY = eINSTANCE.getBeanType_Property();

		/**
		 * The meta object literal for the '<em><b>Lookup Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_TYPE__LOOKUP_METHOD = eINSTANCE.getBeanType_LookupMethod();

		/**
		 * The meta object literal for the '<em><b>Replaced Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_TYPE__REPLACED_METHOD = eINSTANCE.getBeanType_ReplacedMethod();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__ANY = eINSTANCE.getBeanType_Any();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__ABSTRACT = eINSTANCE.getBeanType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Autowire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__AUTOWIRE = eINSTANCE.getBeanType_Autowire();

		/**
		 * The meta object literal for the '<em><b>Autowire Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__AUTOWIRE_CANDIDATE = eINSTANCE.getBeanType_AutowireCandidate();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__CLASS = eINSTANCE.getBeanType_Class();

		/**
		 * The meta object literal for the '<em><b>Dependency Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__DEPENDENCY_CHECK = eINSTANCE.getBeanType_DependencyCheck();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__DEPENDS_ON = eINSTANCE.getBeanType_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Destroy Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__DESTROY_METHOD = eINSTANCE.getBeanType_DestroyMethod();

		/**
		 * The meta object literal for the '<em><b>Factory Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__FACTORY_BEAN = eINSTANCE.getBeanType_FactoryBean();

		/**
		 * The meta object literal for the '<em><b>Factory Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__FACTORY_METHOD = eINSTANCE.getBeanType_FactoryMethod();

		/**
		 * The meta object literal for the '<em><b>Init Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__INIT_METHOD = eINSTANCE.getBeanType_InitMethod();

		/**
		 * The meta object literal for the '<em><b>Lazy Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__LAZY_INIT = eINSTANCE.getBeanType_LazyInit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__NAME = eINSTANCE.getBeanType_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__PARENT = eINSTANCE.getBeanType_Parent();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__SCOPE = eINSTANCE.getBeanType_Scope();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getBeanType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.ConstructorArgTypeImpl <em>Constructor Arg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.ConstructorArgTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getConstructorArgType()
		 * @generated
		 */
		EClass CONSTRUCTOR_ARG_TYPE = eINSTANCE.getConstructorArgType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__DESCRIPTION = eINSTANCE.getConstructorArgType_Description();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__BEAN = eINSTANCE.getConstructorArgType_Bean();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__REF = eINSTANCE.getConstructorArgType_Ref();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__IDREF = eINSTANCE.getConstructorArgType_Idref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__VALUE = eINSTANCE.getConstructorArgType_Value();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__NULL = eINSTANCE.getConstructorArgType_Null();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__LIST = eINSTANCE.getConstructorArgType_List();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__SET = eINSTANCE.getConstructorArgType_Set();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__MAP = eINSTANCE.getConstructorArgType_Map();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_ARG_TYPE__PROPS = eINSTANCE.getConstructorArgType_Props();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARG_TYPE__ANY = eINSTANCE.getConstructorArgType_Any();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARG_TYPE__INDEX = eINSTANCE.getConstructorArgType_Index();

		/**
		 * The meta object literal for the '<em><b>Ref1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARG_TYPE__REF1 = eINSTANCE.getConstructorArgType_Ref1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARG_TYPE__TYPE = eINSTANCE.getConstructorArgType_Type();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARG_TYPE__VALUE1 = eINSTANCE.getConstructorArgType_Value1();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.DescriptionTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDescriptionType()
		 * @generated
		 */
		EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__MIXED = eINSTANCE.getDescriptionType_Mixed();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.DocumentRootImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALIAS = eINSTANCE.getDocumentRoot_Alias();

		/**
		 * The meta object literal for the '<em><b>Arg Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ARG_TYPE = eINSTANCE.getDocumentRoot_ArgType();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BEAN = eINSTANCE.getDocumentRoot_Bean();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BEANS = eINSTANCE.getDocumentRoot_Beans();

		/**
		 * The meta object literal for the '<em><b>Constructor Arg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONSTRUCTOR_ARG = eINSTANCE.getDocumentRoot_ConstructorArg();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTRY = eINSTANCE.getDocumentRoot_Entry();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IDREF = eINSTANCE.getDocumentRoot_Idref();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY = eINSTANCE.getDocumentRoot_Key();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIST = eINSTANCE.getDocumentRoot_List();

		/**
		 * The meta object literal for the '<em><b>Lookup Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOOKUP_METHOD = eINSTANCE.getDocumentRoot_LookupMethod();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MAP = eINSTANCE.getDocumentRoot_Map();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__META = eINSTANCE.getDocumentRoot_Meta();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NULL = eINSTANCE.getDocumentRoot_Null();

		/**
		 * The meta object literal for the '<em><b>Prop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROP = eINSTANCE.getDocumentRoot_Prop();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPS = eINSTANCE.getDocumentRoot_Props();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REF = eINSTANCE.getDocumentRoot_Ref();

		/**
		 * The meta object literal for the '<em><b>Replaced Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REPLACED_METHOD = eINSTANCE.getDocumentRoot_ReplacedMethod();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SET = eINSTANCE.getDocumentRoot_Set();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.EntryTypeImpl <em>Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.EntryTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getEntryType()
		 * @generated
		 */
		EClass ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__KEY = eINSTANCE.getEntryType_Key();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__GROUP = eINSTANCE.getEntryType_Group();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__BEAN = eINSTANCE.getEntryType_Bean();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__REF = eINSTANCE.getEntryType_Ref();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__IDREF = eINSTANCE.getEntryType_Idref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__VALUE = eINSTANCE.getEntryType_Value();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__NULL = eINSTANCE.getEntryType_Null();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__LIST = eINSTANCE.getEntryType_List();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__SET = eINSTANCE.getEntryType_Set();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__MAP = eINSTANCE.getEntryType_Map();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__PROPS = eINSTANCE.getEntryType_Props();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__ANY = eINSTANCE.getEntryType_Any();

		/**
		 * The meta object literal for the '<em><b>Key1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__KEY1 = eINSTANCE.getEntryType_Key1();

		/**
		 * The meta object literal for the '<em><b>Key Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__KEY_REF = eINSTANCE.getEntryType_KeyRef();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__VALUE1 = eINSTANCE.getEntryType_Value1();

		/**
		 * The meta object literal for the '<em><b>Value Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__VALUE_REF = eINSTANCE.getEntryType_ValueRef();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.IdentifiedTypeImpl <em>Identified Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.IdentifiedTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getIdentifiedType()
		 * @generated
		 */
		EClass IDENTIFIED_TYPE = eINSTANCE.getIdentifiedType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_TYPE__ID = eINSTANCE.getIdentifiedType_Id();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.IdrefTypeImpl <em>Idref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.IdrefTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getIdrefType()
		 * @generated
		 */
		EClass IDREF_TYPE = eINSTANCE.getIdrefType();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDREF_TYPE__BEAN = eINSTANCE.getIdrefType_Bean();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDREF_TYPE__LOCAL = eINSTANCE.getIdrefType_Local();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.ImportTypeImpl <em>Import Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.ImportTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getImportType()
		 * @generated
		 */
		EClass IMPORT_TYPE = eINSTANCE.getImportType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__RESOURCE = eINSTANCE.getImportType_Resource();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.KeyTypeImpl <em>Key Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.KeyTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getKeyType()
		 * @generated
		 */
		EClass KEY_TYPE = eINSTANCE.getKeyType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__GROUP = eINSTANCE.getKeyType_Group();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__BEAN = eINSTANCE.getKeyType_Bean();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__REF = eINSTANCE.getKeyType_Ref();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__IDREF = eINSTANCE.getKeyType_Idref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__VALUE = eINSTANCE.getKeyType_Value();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__NULL = eINSTANCE.getKeyType_Null();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__LIST = eINSTANCE.getKeyType_List();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__SET = eINSTANCE.getKeyType_Set();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__MAP = eINSTANCE.getKeyType_Map();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__PROPS = eINSTANCE.getKeyType_Props();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__ANY = eINSTANCE.getKeyType_Any();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.ListOrSetTypeImpl <em>List Or Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.ListOrSetTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getListOrSetType()
		 * @generated
		 */
		EClass LIST_OR_SET_TYPE = eINSTANCE.getListOrSetType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OR_SET_TYPE__GROUP = eINSTANCE.getListOrSetType_Group();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__BEAN = eINSTANCE.getListOrSetType_Bean();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__REF = eINSTANCE.getListOrSetType_Ref();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__IDREF = eINSTANCE.getListOrSetType_Idref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__VALUE = eINSTANCE.getListOrSetType_Value();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__NULL = eINSTANCE.getListOrSetType_Null();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__LIST = eINSTANCE.getListOrSetType_List();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__SET = eINSTANCE.getListOrSetType_Set();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__MAP = eINSTANCE.getListOrSetType_Map();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OR_SET_TYPE__PROPS = eINSTANCE.getListOrSetType_Props();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OR_SET_TYPE__ANY = eINSTANCE.getListOrSetType_Any();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.LookupMethodTypeImpl <em>Lookup Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.LookupMethodTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getLookupMethodType()
		 * @generated
		 */
		EClass LOOKUP_METHOD_TYPE = eINSTANCE.getLookupMethodType();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_METHOD_TYPE__BEAN = eINSTANCE.getLookupMethodType_Bean();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_METHOD_TYPE__NAME = eINSTANCE.getLookupMethodType_Name();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.MapTypeImpl <em>Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.MapTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getMapType()
		 * @generated
		 */
		EClass MAP_TYPE = eINSTANCE.getMapType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__GROUP = eINSTANCE.getMapType_Group();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__ENTRY = eINSTANCE.getMapType_Entry();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TYPE__KEY_TYPE = eINSTANCE.getMapType_KeyType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.MetaTypeImpl <em>Meta Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.MetaTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getMetaType()
		 * @generated
		 */
		EClass META_TYPE = eINSTANCE.getMetaType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_TYPE__KEY = eINSTANCE.getMetaType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_TYPE__VALUE = eINSTANCE.getMetaType_Value();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.NullTypeImpl <em>Null Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.NullTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getNullType()
		 * @generated
		 */
		EClass NULL_TYPE = eINSTANCE.getNullType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_TYPE__MIXED = eINSTANCE.getNullType_Mixed();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.PropertyTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__DESCRIPTION = eINSTANCE.getPropertyType_Description();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__META = eINSTANCE.getPropertyType_Meta();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__BEAN = eINSTANCE.getPropertyType_Bean();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__REF = eINSTANCE.getPropertyType_Ref();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__IDREF = eINSTANCE.getPropertyType_Idref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__NULL = eINSTANCE.getPropertyType_Null();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__LIST = eINSTANCE.getPropertyType_List();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__SET = eINSTANCE.getPropertyType_Set();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__MAP = eINSTANCE.getPropertyType_Map();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__PROPS = eINSTANCE.getPropertyType_Props();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__ANY = eINSTANCE.getPropertyType_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Ref1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__REF1 = eINSTANCE.getPropertyType_Ref1();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE1 = eINSTANCE.getPropertyType_Value1();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.PropsTypeImpl <em>Props Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.PropsTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getPropsType()
		 * @generated
		 */
		EClass PROPS_TYPE = eINSTANCE.getPropsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPS_TYPE__GROUP = eINSTANCE.getPropsType_Group();

		/**
		 * The meta object literal for the '<em><b>Prop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPS_TYPE__PROP = eINSTANCE.getPropsType_Prop();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.PropTypeImpl <em>Prop Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.PropTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getPropType()
		 * @generated
		 */
		EClass PROP_TYPE = eINSTANCE.getPropType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROP_TYPE__MIXED = eINSTANCE.getPropType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROP_TYPE__KEY = eINSTANCE.getPropType_Key();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.RefTypeImpl <em>Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.RefTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getRefType()
		 * @generated
		 */
		EClass REF_TYPE = eINSTANCE.getRefType();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_TYPE__BEAN = eINSTANCE.getRefType_Bean();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_TYPE__LOCAL = eINSTANCE.getRefType_Local();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_TYPE__PARENT = eINSTANCE.getRefType_Parent();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl <em>Replaced Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getReplacedMethodType()
		 * @generated
		 */
		EClass REPLACED_METHOD_TYPE = eINSTANCE.getReplacedMethodType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACED_METHOD_TYPE__GROUP = eINSTANCE.getReplacedMethodType_Group();

		/**
		 * The meta object literal for the '<em><b>Arg Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACED_METHOD_TYPE__ARG_TYPE = eINSTANCE.getReplacedMethodType_ArgType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACED_METHOD_TYPE__NAME = eINSTANCE.getReplacedMethodType_Name();

		/**
		 * The meta object literal for the '<em><b>Replacer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACED_METHOD_TYPE__REPLACER = eINSTANCE.getReplacedMethodType_Replacer();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.TypedCollectionTypeImpl <em>Typed Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.TypedCollectionTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getTypedCollectionType()
		 * @generated
		 */
		EClass TYPED_COLLECTION_TYPE = eINSTANCE.getTypedCollectionType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_COLLECTION_TYPE__VALUE_TYPE = eINSTANCE.getTypedCollectionType_ValueType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.impl.ValueTypeImpl
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__MIXED = eINSTANCE.getValueType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__TYPE = eINSTANCE.getValueType_Type();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.AutowireType <em>Autowire Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.AutowireType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getAutowireType()
		 * @generated
		 */
		EEnum AUTOWIRE_TYPE = eINSTANCE.getAutowireType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.DefaultableBoolean <em>Defaultable Boolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DefaultableBoolean
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultableBoolean()
		 * @generated
		 */
		EEnum DEFAULTABLE_BOOLEAN = eINSTANCE.getDefaultableBoolean();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.DefaultAutowireType <em>Default Autowire Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DefaultAutowireType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultAutowireType()
		 * @generated
		 */
		EEnum DEFAULT_AUTOWIRE_TYPE = eINSTANCE.getDefaultAutowireType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.DefaultDependencyCheckType <em>Default Dependency Check Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultDependencyCheckType()
		 * @generated
		 */
		EEnum DEFAULT_DEPENDENCY_CHECK_TYPE = eINSTANCE.getDefaultDependencyCheckType();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.spring.DependencyCheckType <em>Dependency Check Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DependencyCheckType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDependencyCheckType()
		 * @generated
		 */
		EEnum DEPENDENCY_CHECK_TYPE = eINSTANCE.getDependencyCheckType();

		/**
		 * The meta object literal for the '<em>Autowire Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.AutowireType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getAutowireTypeObject()
		 * @generated
		 */
		EDataType AUTOWIRE_TYPE_OBJECT = eINSTANCE.getAutowireTypeObject();

		/**
		 * The meta object literal for the '<em>Defaultable Boolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DefaultableBoolean
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultableBooleanObject()
		 * @generated
		 */
		EDataType DEFAULTABLE_BOOLEAN_OBJECT = eINSTANCE.getDefaultableBooleanObject();

		/**
		 * The meta object literal for the '<em>Default Autowire Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DefaultAutowireType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultAutowireTypeObject()
		 * @generated
		 */
		EDataType DEFAULT_AUTOWIRE_TYPE_OBJECT = eINSTANCE.getDefaultAutowireTypeObject();

		/**
		 * The meta object literal for the '<em>Default Dependency Check Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDefaultDependencyCheckTypeObject()
		 * @generated
		 */
		EDataType DEFAULT_DEPENDENCY_CHECK_TYPE_OBJECT = eINSTANCE.getDefaultDependencyCheckTypeObject();

		/**
		 * The meta object literal for the '<em>Dependency Check Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.spring.DependencyCheckType
		 * @see org.mule.ide.config.spring.impl.SpringPackageImpl#getDependencyCheckTypeObject()
		 * @generated
		 */
		EDataType DEPENDENCY_CHECK_TYPE_OBJECT = eINSTANCE.getDependencyCheckTypeObject();

	}

} //SpringPackage
