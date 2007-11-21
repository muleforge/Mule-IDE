/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Router Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.NestedRouterCollectionType#getAbstractBindingGroup <em>Abstract Binding Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.NestedRouterCollectionType#getAbstractBinding <em>Abstract Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getNestedRouterCollectionType()
 * @model extendedMetaData="name='nestedRouterCollectionType' kind='elementOnly'"
 * @generated
 */
public interface NestedRouterCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Binding Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Binding Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Binding Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getNestedRouterCollectionType_AbstractBindingGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-binding:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractBindingGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Binding</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getNestedRouterCollectionType_AbstractBinding()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-binding' namespace='##targetNamespace' group='abstract-binding:group'"
	 * @generated
	 */
	EList<AbstractBindingType> getAbstractBinding();

} // NestedRouterCollectionType
