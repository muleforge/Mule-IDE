/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MethodEntryPointResolverType#getIncludeEntryPoint <em>Include Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getMethodEntryPointResolverType()
 * @model extendedMetaData="name='methodEntryPointResolverType' kind='elementOnly'"
 * @generated
 */
public interface MethodEntryPointResolverType extends BaseEntryPointResolverType {
	/**
	 * Returns the value of the '<em><b>Include Entry Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.MethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Entry Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A possible method for delivery.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Entry Point</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getMethodEntryPointResolverType_IncludeEntryPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='include-entry-point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MethodType> getIncludeEntryPoint();

} // MethodEntryPointResolverType
