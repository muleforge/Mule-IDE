/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getValue <em>Value</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getNull <em>Null</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getList <em>List</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getSet <em>Set</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getMap <em>Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getProps <em>Props</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.KeyType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getKeyType()
 * @model extendedMetaData="name='key_._type' kind='elementOnly'"
 * @generated
 */
public interface KeyType extends EObject {
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
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.BeanType}.
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
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BeanType> getBean();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.RefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Defines a reference to another bean in this factory or an external
	 * 	factory (parent or included factory).
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Ref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RefType> getRef();

	/**
	 * Returns the value of the '<em><b>Idref</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.IdrefType}.
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
	 * @return the value of the '<em>Idref</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Idref()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IdrefType> getIdref();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.ValueType}.
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
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Value()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueType> getValue();

	/**
	 * Returns the value of the '<em><b>Null</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.NullType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Denotes a Java null value. Necessary because an empty "value" tag
	 * 	will resolve to an empty String, which will not be resolved to a
	 * 	null value unless a special PropertyEditor does so.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Null()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='null' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NullType> getNull();

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.ListOrSetType}.
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
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ListOrSetType> getList();

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.ListOrSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A set can contain multiple inner bean, ref, collection, or value
	 * 	elements. Java sets are untyped, pending generics support in Java5,
	 * 	although references will be strongly typed.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Set()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ListOrSetType> getSet();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.MapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A mapping from a key to an object. Maps may be empty.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Map()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MapType> getMap();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.PropsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Props elements differ from map elements in that values must be strings.
	 * 	Props may be empty.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Props()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='props' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PropsType> getProps();

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
	 * @see org.mule.ide.config.spring.SpringPackage#getKeyType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='strict' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // KeyType
