/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getBeans <em>Beans</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getConstructorArg <em>Constructor Arg</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getKey <em>Key</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getList <em>List</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getLookupMethod <em>Lookup Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getMap <em>Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getNull <em>Null</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getProp <em>Prop</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getProps <em>Props</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getReplacedMethod <em>Replaced Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getSet <em>Set</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.DocumentRoot#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Defines an alias for a bean (which can reside in a different definition
	 * 	resource).
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(AliasType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Alias()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasType getAlias();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(AliasType value);

	/**
	 * Returns the value of the '<em><b>Arg Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Identifies an argument for a replaced method in the event of
	 * 	method overloading.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arg Type</em>' containment reference.
	 * @see #setArgType(ArgTypeType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_ArgType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='arg-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgTypeType getArgType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getArgType <em>Arg Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg Type</em>' containment reference.
	 * @see #getArgType()
	 * @generated
	 */
	void setArgType(ArgTypeType value);

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Defines a single (usually named) bean.
	 * 
	 * 	A bean definition may contain nested tags for constructor arguments,
	 * 	property values, lookup methods, and replaced methods. Mixing constructor
	 * 	injection and setter injection on the same bean is explicitly supported.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference.
	 * @see #setBean(BeanType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Bean()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanType getBean();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getBean <em>Bean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' containment reference.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(BeanType value);

	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The top level (typically root) element. Allows the definition
	 * 	of default values for all nested bean definitions.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference.
	 * @see #setBeans(BeansType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Beans()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='beans' namespace='##targetNamespace'"
	 * @generated
	 */
	BeansType getBeans();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getBeans <em>Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beans</em>' containment reference.
	 * @see #getBeans()
	 * @generated
	 */
	void setBeans(BeansType value);

	/**
	 * Returns the value of the '<em><b>Constructor Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				<![CDATA[
	 * 	Bean definitions can specify zero or more constructor arguments.
	 * 	This is an alternative to "autowire constructor".
	 * 	Arguments correspond to either a specific index of the constructor
	 * 	argument list or are supposed to be matched generically by type.
	 * 
	 * 	Note: A single generic argument value will just be used once, rather
	 * 	than potentially matched multiple times (as of Spring 1.1).
	 * 
	 * 	constructor-arg elements are also used in conjunction with the
	 * 	factory-method element to construct beans using static or instance
	 * 	factory methods.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constructor Arg</em>' containment reference.
	 * @see #setConstructorArg(ConstructorArgType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_ConstructorArg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructor-arg' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstructorArgType getConstructorArg();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getConstructorArg <em>Constructor Arg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Arg</em>' containment reference.
	 * @see #getConstructorArg()
	 * @generated
	 */
	void setConstructorArg(ConstructorArgType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Contains informative text describing the purpose of the enclosing
	 * 	element.
	 * 	Used primarily for user documentation of XML bean definition documents.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A map entry can be an inner bean, ref, value, or collection.
	 * 	The key of the entry is given by the "key" attribute or child element.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(EntryType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Entry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryType getEntry();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(EntryType value);

	/**
	 * Returns the value of the '<em><b>Idref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The id of another bean in this factory or an external factory
	 * 	(parent or included factory).
	 * 	While a regular 'value' element could instead be used for the
	 * 	same effect, using idref in this case allows validation of local
	 * 	bean ids by the XML parser, and name completion by supporting tools.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idref</em>' containment reference.
	 * @see #setIdref(IdrefType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Idref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idref' namespace='##targetNamespace'"
	 * @generated
	 */
	IdrefType getIdref();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getIdref <em>Idref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idref</em>' containment reference.
	 * @see #getIdref()
	 * @generated
	 */
	void setIdref(IdrefType value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Specifies an XML bean definition resource to import.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import</em>' containment reference.
	 * @see #setImport(ImportType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Import()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportType getImport();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getImport <em>Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' containment reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(ImportType value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A key element can contain an inner bean, ref, value, or collection.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(KeyType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Key()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyType getKey();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(KeyType value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A list can contain multiple inner bean, ref, collection, or value
	 * 	elements. Java lists are untyped, pending generics support in Java5,
	 * 	although references will be strongly typed. A list can also map to
	 * 	an array type. The necessary conversion is automatically performed
	 * 	by the BeanFactory.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(ListOrSetType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOrSetType getList();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(ListOrSetType value);

	/**
	 * Returns the value of the '<em><b>Lookup Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A lookup method causes the IoC container to override the given method
	 * 	and return the bean with the name given in the bean attribute. This is
	 * 	a form of Method Injection. It is particularly useful as an alternative
	 * 	to implementing the BeanFactoryAware interface, in order to be able to
	 * 	make getBean() calls for non-singleton instances at runtime. In this
	 * 	case, Method Injection is a less invasive alternative.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lookup Method</em>' containment reference.
	 * @see #setLookupMethod(LookupMethodType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_LookupMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lookup-method' namespace='##targetNamespace'"
	 * @generated
	 */
	LookupMethodType getLookupMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getLookupMethod <em>Lookup Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup Method</em>' containment reference.
	 * @see #getLookupMethod()
	 * @generated
	 */
	void setLookupMethod(LookupMethodType value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A mapping from a key to an object. Maps may be empty.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(MapType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Map()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getMap();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(MapType value);

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Arbitrary metadata attached to a bean definition.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference.
	 * @see #setMeta(MetaType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Meta()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='meta' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaType getMeta();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getMeta <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' containment reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(MetaType value);

	/**
	 * Returns the value of the '<em><b>Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Denotes a Java null value. Necessary because an empty "value" tag
	 * 	will resolve to an empty String, which will not be resolved to a
	 * 	null value unless a special PropertyEditor does so.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null</em>' containment reference.
	 * @see #setNull(NullType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Null()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='null' namespace='##targetNamespace'"
	 * @generated
	 */
	NullType getNull();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getNull <em>Null</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null</em>' containment reference.
	 * @see #getNull()
	 * @generated
	 */
	void setNull(NullType value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The string value of the property. Note that whitespace is trimmed
	 * 	off to avoid unwanted whitespace caused by typical XML formatting.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference.
	 * @see #setProp(PropType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Prop()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 * @generated
	 */
	PropType getProp();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getProp <em>Prop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop</em>' containment reference.
	 * @see #getProp()
	 * @generated
	 */
	void setProp(PropType value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
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
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Props elements differ from map elements in that values must be strings.
	 * 	Props may be empty.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Props</em>' containment reference.
	 * @see #setProps(PropsType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Props()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='props' namespace='##targetNamespace'"
	 * @generated
	 */
	PropsType getProps();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getProps <em>Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' containment reference.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(PropsType value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Defines a reference to another bean in this factory or an external
	 * 	factory (parent or included factory).
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(RefType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Ref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefType getRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefType value);

	/**
	 * Returns the value of the '<em><b>Replaced Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Similar to the lookup method mechanism, the replaced-method element
	 * 	is used to control IoC container method overriding: Method Injection.
	 * 	This mechanism allows the overriding of a method with arbitrary code.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaced Method</em>' containment reference.
	 * @see #setReplacedMethod(ReplacedMethodType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_ReplacedMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaced-method' namespace='##targetNamespace'"
	 * @generated
	 */
	ReplacedMethodType getReplacedMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getReplacedMethod <em>Replaced Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced Method</em>' containment reference.
	 * @see #getReplacedMethod()
	 * @generated
	 */
	void setReplacedMethod(ReplacedMethodType value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A set can contain multiple inner bean, ref, collection, or value
	 * 	elements. Java sets are untyped, pending generics support in Java5,
	 * 	although references will be strongly typed.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(ListOrSetType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Set()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOrSetType getSet();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(ListOrSetType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Contains a string representation of a property value.
	 * 	The property may be a string, or may be converted to the required
	 * 	type using the JavaBeans PropertyEditor machinery. This makes it
	 * 	possible for application developers to write custom PropertyEditor
	 * 	implementations that can convert strings to arbitrary target objects.
	 * 
	 * 	Note that this is recommended for simple objects only. Configure
	 * 	more complex objects by populating JavaBean properties with
	 * 	references to other beans.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueType)
	 * @see org.mule.ide.config.spring.SpringPackage#getDocumentRoot_Value()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.DocumentRoot#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

} // DocumentRoot
