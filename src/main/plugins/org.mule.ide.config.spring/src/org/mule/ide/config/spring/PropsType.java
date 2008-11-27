/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Props Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.PropsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.PropsType#getProp <em>Prop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getPropsType()
 * @model extendedMetaData="name='propsType' kind='elementOnly'"
 * @generated
 */
public interface PropsType extends BaseCollectionType {
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
	 * @see org.mule.ide.config.spring.SpringPackage#getPropsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.PropType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The string value of the property. Note that whitespace is trimmed
	 * 	off to avoid unwanted whitespace caused by typical XML formatting.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getPropsType_Prop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PropType> getProp();

} // PropsType
