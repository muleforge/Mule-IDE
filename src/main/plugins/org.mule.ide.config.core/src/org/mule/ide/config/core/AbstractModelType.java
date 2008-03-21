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
 * A representation of the model object '<em><b>Abstract Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverSetGroup <em>Abstract Entry Point Resolver Set Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolverGroup <em>Abstract Entry Point Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractServiceGroup <em>Abstract Service Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType()
 * @model extendedMetaData="name='abstractModelType' kind='elementOnly'"
 * @generated
 */
public interface AbstractModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an exception strategy element.
	 *                 Exception strategies define how Mule should react to errors.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Exception Strategy Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractExceptionStrategyGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-exception-strategy:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractExceptionStrategyGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an exception strategy element.
	 *                 Exception strategies define how Mule should react to errors.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Exception Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractExceptionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-exception-strategy' namespace='##targetNamespace' group='abstract-exception-strategy:group'"
	 * @generated
	 */
	AbstractExceptionStrategyType getAbstractExceptionStrategy();

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
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractEntryPointResolverSetGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractEntryPointResolverSet()
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
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractEntryPointResolverGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractEntryPointResolver()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entry-point-resolver' namespace='##targetNamespace' group='abstract-entry-point-resolver:group'"
	 * @generated
	 */
	AbstractEntryPointResolverType getAbstractEntryPointResolver();

	/**
	 * Returns the value of the '<em><b>Abstract Service Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Service Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for a service element.
	 *                 Services combine message routing with a Java (typically) component.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Service Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractServiceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-service:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractServiceGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for a service element.
	 *                 Services combine message routing with a Java (typically) component.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Service</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractService()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-service' namespace='##targetNamespace' group='abstract-service:group'"
	 * @generated
	 */
	EList<AbstractServiceType> getAbstractService();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The name used to identify this model.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_Name()
	 * @model dataType="org.mule.ide.config.core.NonBlankString"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractModelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractModelType
