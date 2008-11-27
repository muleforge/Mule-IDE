/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverSetGroup <em>Abstract Entry Point Resolver Set Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractComponentType#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractComponentType()
 * @model extendedMetaData="name='abstractComponentType' kind='elementOnly'"
 * @generated
 */
public interface AbstractComponentType extends EObject {

	/**
	 * Returns the value of the '<em><b>Abstract Entry Point Resolver Set Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entry Point Resolver Set Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for entry point resolver set elements.
	 *                 These combine a group of entry point resolvers, trying them in turn until one succeeds.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Entry Point Resolver Set Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractComponentType_AbstractEntryPointResolverSetGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-entry-point-resolver-set:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractEntryPointResolverSetGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entry Point Resolver Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for entry point resolver set elements.
	 *                 These combine a group of entry point resolvers, trying them in turn until one succeeds.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Entry Point Resolver Set</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractComponentType_AbstractEntryPointResolverSet()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entry-point-resolver-set' namespace='##targetNamespace' group='abstract-entry-point-resolver-set:group'"
	 * @generated
	 */
	AbstractEntryPointResolverSetType getAbstractEntryPointResolverSet();

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
	 * @see org.mule.ide.config.core.CorePackage#getAbstractComponentType_AbstractEntryPointResolverGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-entry-point-resolver:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractEntryPointResolverGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entry Point Resolver</em>' containment reference isn't clear,
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
	 * @return the value of the '<em>Abstract Entry Point Resolver</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractComponentType_AbstractEntryPointResolver()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entry-point-resolver' namespace='##targetNamespace' group='abstract-entry-point-resolver:group'"
	 * @generated
	 */
	AbstractEntryPointResolverType getAbstractEntryPointResolver();
} // AbstractComponentType
