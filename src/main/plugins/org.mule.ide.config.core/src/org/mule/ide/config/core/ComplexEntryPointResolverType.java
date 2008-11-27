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
 * A representation of the model object '<em><b>Complex Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ComplexEntryPointResolverType#getIncludeEntryPoint <em>Include Entry Point</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ComplexEntryPointResolverType#isEnableDiscovery <em>Enable Discovery</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getComplexEntryPointResolverType()
 * @model extendedMetaData="name='complexEntryPointResolverType' kind='elementOnly'"
 * @generated
 */
public interface ComplexEntryPointResolverType extends ReflectionEntryPointResolverType {
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
	 * @see org.mule.ide.config.core.CorePackage#getComplexEntryPointResolverType_IncludeEntryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-entry-point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MethodType> getIncludeEntryPoint();

	/**
	 * Returns the value of the '<em><b>Enable Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Discovery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Discovery</em>' attribute.
	 * @see #isSetEnableDiscovery()
	 * @see #unsetEnableDiscovery()
	 * @see #setEnableDiscovery(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getComplexEntryPointResolverType_EnableDiscovery()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='enableDiscovery'"
	 * @generated
	 */
	boolean isEnableDiscovery();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ComplexEntryPointResolverType#isEnableDiscovery <em>Enable Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Discovery</em>' attribute.
	 * @see #isSetEnableDiscovery()
	 * @see #unsetEnableDiscovery()
	 * @see #isEnableDiscovery()
	 * @generated
	 */
	void setEnableDiscovery(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ComplexEntryPointResolverType#isEnableDiscovery <em>Enable Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableDiscovery()
	 * @see #isEnableDiscovery()
	 * @see #setEnableDiscovery(boolean)
	 * @generated
	 */
	void unsetEnableDiscovery();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ComplexEntryPointResolverType#isEnableDiscovery <em>Enable Discovery</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Discovery</em>' attribute is set.
	 * @see #unsetEnableDiscovery()
	 * @see #isEnableDiscovery()
	 * @see #setEnableDiscovery(boolean)
	 * @generated
	 */
	boolean isSetEnableDiscovery();

} // ComplexEntryPointResolverType
