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
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntrypointResolverGroup <em>Abstract Entrypoint Resolver Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractEntrypointResolver <em>Abstract Entrypoint Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractServiceGroup <em>Abstract Service Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractModelType#getClass_ <em>Class</em>}</li>
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
	 * @return the value of the '<em>Abstract Exception Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractExceptionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-exception-strategy' namespace='##targetNamespace' group='abstract-exception-strategy:group'"
	 * @generated
	 */
	AbstractExceptionStrategyType getAbstractExceptionStrategy();

	/**
	 * Returns the value of the '<em><b>Abstract Entrypoint Resolver Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entrypoint Resolver Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Entrypoint Resolver Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractEntrypointResolverGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-entrypoint-resolver:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractEntrypointResolverGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entrypoint Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Entrypoint Resolver</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractEntrypointResolver()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entrypoint-resolver' namespace='##targetNamespace' group='abstract-entrypoint-resolver:group'"
	 * @generated
	 */
	AbstractEntrypointResolverType getAbstractEntrypointResolver();

	/**
	 * Returns the value of the '<em><b>Abstract Service Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Service Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>Abstract Service</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_AbstractService()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-service' namespace='##targetNamespace' group='abstract-service:group'"
	 * @generated
	 */
	EList<AbstractServiceType> getAbstractService();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_Class()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractModelType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractModelType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
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
