/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.BaseEntryPointResolverType#isAcceptVoidMethods <em>Accept Void Methods</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseEntryPointResolverType#isTransformFirst <em>Transform First</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getBaseEntryPointResolverType()
 * @model extendedMetaData="name='baseEntryPointResolverType' kind='empty'"
 * @generated
 */
public interface BaseEntryPointResolverType extends AbstractEntryPointResolverType {
	/**
	 * Returns the value of the '<em><b>Accept Void Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Void Methods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Should the resolver call void methods?
	 *                             By default, void methods are not considered as possible candidates for message delivery.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accept Void Methods</em>' attribute.
	 * @see #isSetAcceptVoidMethods()
	 * @see #unsetAcceptVoidMethods()
	 * @see #setAcceptVoidMethods(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getBaseEntryPointResolverType_AcceptVoidMethods()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='acceptVoidMethods'"
	 * @generated
	 */
	boolean isAcceptVoidMethods();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isAcceptVoidMethods <em>Accept Void Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Void Methods</em>' attribute.
	 * @see #isSetAcceptVoidMethods()
	 * @see #unsetAcceptVoidMethods()
	 * @see #isAcceptVoidMethods()
	 * @generated
	 */
	void setAcceptVoidMethods(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isAcceptVoidMethods <em>Accept Void Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptVoidMethods()
	 * @see #isAcceptVoidMethods()
	 * @see #setAcceptVoidMethods(boolean)
	 * @generated
	 */
	void unsetAcceptVoidMethods();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isAcceptVoidMethods <em>Accept Void Methods</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accept Void Methods</em>' attribute is set.
	 * @see #unsetAcceptVoidMethods()
	 * @see #isAcceptVoidMethods()
	 * @see #setAcceptVoidMethods(boolean)
	 * @generated
	 */
	boolean isSetAcceptVoidMethods();

	/**
	 * Returns the value of the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Should the message be transformer before being delivered to the component?
	 *                             By default, messages are transformed.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform First</em>' attribute.
	 * @see #isSetTransformFirst()
	 * @see #unsetTransformFirst()
	 * @see #setTransformFirst(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getBaseEntryPointResolverType_TransformFirst()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='transformFirst'"
	 * @generated
	 */
	boolean isTransformFirst();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isTransformFirst <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform First</em>' attribute.
	 * @see #isSetTransformFirst()
	 * @see #unsetTransformFirst()
	 * @see #isTransformFirst()
	 * @generated
	 */
	void setTransformFirst(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isTransformFirst <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransformFirst()
	 * @see #isTransformFirst()
	 * @see #setTransformFirst(boolean)
	 * @generated
	 */
	void unsetTransformFirst();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.BaseEntryPointResolverType#isTransformFirst <em>Transform First</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transform First</em>' attribute is set.
	 * @see #unsetTransformFirst()
	 * @see #isTransformFirst()
	 * @see #setTransformFirst(boolean)
	 * @generated
	 */
	boolean isSetTransformFirst();

} // BaseEntryPointResolverType
