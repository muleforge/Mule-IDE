/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensible Entry Point Resolver Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ExtensibleEntryPointResolverSet#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ExtensibleEntryPointResolverSet#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getExtensibleEntryPointResolverSet()
 * @model extendedMetaData="name='extensibleEntryPointResolverSet' kind='elementOnly'"
 * @generated
 */
public interface ExtensibleEntryPointResolverSet extends AbstractEntryPointResolverSetType {
	/**
	 * Returns the value of the '<em><b>Abstract Entry Point Resolver Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entry Point Resolver Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an entry point resolver element.
	 *                 Entry point resolvers define how payloads are delivered to Java code
	 *                 (ie they choose the method to call).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Entry Point Resolver Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getExtensibleEntryPointResolverSet_AbstractEntryPointResolverGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-entry-point-resolver:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractEntryPointResolverGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractEntryPointResolverType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entry Point Resolver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an entry point resolver element.
	 *                 Entry point resolvers define how payloads are delivered to Java code
	 *                 (ie they choose the method to call).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Entry Point Resolver</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getExtensibleEntryPointResolverSet_AbstractEntryPointResolver()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entry-point-resolver' namespace='##targetNamespace' group='abstract-entry-point-resolver:group'"
	 * @generated
	 */
	EList<AbstractEntryPointResolverType> getAbstractEntryPointResolver();

} // ExtensibleEntryPointResolverSet
