/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Arg Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getValue <em>Value</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getNull <em>Null</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getList <em>List</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getSet <em>Set</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getMap <em>Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getProps <em>Props</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getAny <em>Any</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getIndex <em>Index</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getType <em>Type</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ConstructorArgType#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType()
 * @model extendedMetaData="name='constructor-arg_._type' kind='elementOnly'"
 * @generated
 */
public interface ConstructorArgType extends EObject {
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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Bean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanType getBean();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getBean <em>Bean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' containment reference.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(BeanType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Ref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefType getRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Idref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='idref' namespace='##targetNamespace'"
	 * @generated
	 */
	IdrefType getIdref();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getIdref <em>Idref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idref</em>' containment reference.
	 * @see #getIdref()
	 * @generated
	 */
	void setIdref(IdrefType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Null()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='null' namespace='##targetNamespace'"
	 * @generated
	 */
	NullType getNull();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getNull <em>Null</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null</em>' containment reference.
	 * @see #getNull()
	 * @generated
	 */
	void setNull(NullType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_List()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOrSetType getList();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(ListOrSetType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Set()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOrSetType getSet();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(ListOrSetType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getMap();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(MapType value);

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
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Props()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='props' namespace='##targetNamespace'"
	 * @generated
	 */
	PropsType getProps();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getProps <em>Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' containment reference.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(PropsType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The exact index of thr argument in the constructor argument list.
	 * 	Only needed to avoid ambiguities, e.g. in case of 2 arguments of
	 * 	the exact same type.
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Ref1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A short-cut alternative to a nested "<ref bean='...'/>" element.
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref1</em>' attribute.
	 * @see #setRef1(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Ref1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef1();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getRef1 <em>Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref1</em>' attribute.
	 * @see #getRef1()
	 * @generated
	 */
	void setRef1(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The exact type of the constructor argument. Only needed to avoid
	 * 	ambiguities, e.g. in case of 2 single argument constructors
	 * 	that can both be converted from a String.
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A short-cut alternative to a nested "<value>...<value/>"
	 * 	element.
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getConstructorArgType_Value1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue1();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ConstructorArgType#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(String value);

} // ConstructorArgType