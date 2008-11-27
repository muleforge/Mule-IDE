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
 * A representation of the model object '<em><b>Replaced Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.ReplacedMethodType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ReplacedMethodType#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ReplacedMethodType#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ReplacedMethodType#getReplacer <em>Replacer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getReplacedMethodType()
 * @model extendedMetaData="name='replaced-method_._type' kind='elementOnly'"
 * @generated
 */
public interface ReplacedMethodType extends EObject {
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
	 * @see org.mule.ide.config.spring.SpringPackage#getReplacedMethodType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Arg Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.ArgTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Identifies an argument for a replaced method in the event of
	 * 	method overloading.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arg Type</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getReplacedMethodType_ArgType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='arg-type' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ArgTypeType> getArgType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the method whose implementation must be replaced by the
	 * 	IoC container. If this method is not overloaded, there is no need
	 * 	to use arg-type subelements. If this method is overloaded, arg-type
	 * 	subelements must be used for all override definitions for the method.
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getReplacedMethodType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ReplacedMethodType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Replacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Bean name of an implementation of the MethodReplacer interface in the
	 * 	current or ancestor factories. This may be a singleton or prototype
	 * 	bean. If it is a prototype, a new instance will be used for each
	 * 	method replacement. Singleton usage is the norm.
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacer</em>' attribute.
	 * @see #setReplacer(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getReplacedMethodType_Replacer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='replacer'"
	 * @generated
	 */
	String getReplacer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ReplacedMethodType#getReplacer <em>Replacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacer</em>' attribute.
	 * @see #getReplacer()
	 * @generated
	 */
	void setReplacer(String value);

} // ReplacedMethodType
