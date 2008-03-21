/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflection Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ReflectionEntryPointResolverType#getExcludeObjectMethods <em>Exclude Object Methods</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ReflectionEntryPointResolverType#getExcludeEntryPoint <em>Exclude Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getReflectionEntryPointResolverType()
 * @model extendedMetaData="name='reflectionEntryPointResolverType' kind='elementOnly'"
 * @generated
 */
public interface ReflectionEntryPointResolverType extends BaseEntryPointResolverType {
	/**
	 * Returns the value of the '<em><b>Exclude Object Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Object Methods</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 If specified, methods in the Java Object interface are not included in
	 *                                 the list of possible methods that can receive the message.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Object Methods</em>' containment reference.
	 * @see #setExcludeObjectMethods(EObject)
	 * @see org.mule.ide.config.core.CorePackage#getReflectionEntryPointResolverType_ExcludeObjectMethods()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-object-methods' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getExcludeObjectMethods();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ReflectionEntryPointResolverType#getExcludeObjectMethods <em>Exclude Object Methods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Object Methods</em>' containment reference.
	 * @see #getExcludeObjectMethods()
	 * @generated
	 */
	void setExcludeObjectMethods(EObject value);

	/**
	 * Returns the value of the '<em><b>Exclude Entry Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.MethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Entry Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Explicitly exclude a named method from receiving the message.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Entry Point</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getReflectionEntryPointResolverType_ExcludeEntryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-entry-point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MethodType> getExcludeEntryPoint();

} // ReflectionEntryPointResolverType
