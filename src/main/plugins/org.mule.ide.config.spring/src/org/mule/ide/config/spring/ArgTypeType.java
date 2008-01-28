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
 * A representation of the model object '<em><b>Arg Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.ArgTypeType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.ArgTypeType#getMatch <em>Match</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getArgTypeType()
 * @model extendedMetaData="name='arg-type_._type' kind='mixed'"
 * @generated
 */
public interface ArgTypeType extends EObject {
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
	 * @see org.mule.ide.config.spring.SpringPackage#getArgTypeType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Specification of the type of an overloaded method argument as a String.
	 * 	For convenience, this may be a substring of the FQN. E.g. all the
	 * 	following would match "java.lang.String":
	 * 	- java.lang.String
	 * 	- String
	 * 	- Str
	 * 
	 * 	As the number of arguments will be checked also, this convenience
	 * 	can often be used to save typing.
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see #setMatch(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getArgTypeType_Match()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='match'"
	 * @generated
	 */
	String getMatch();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.ArgTypeType#getMatch <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(String value);

} // ArgTypeType
