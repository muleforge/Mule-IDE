/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.BaseCollectionType#getMerge <em>Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getBaseCollectionType()
 * @model extendedMetaData="name='baseCollectionType' kind='empty'"
 * @generated
 */
public interface BaseCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Merge</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.spring.DefaultableBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Enables/disables merging for collections when using parent/child beans.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merge</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @see #isSetMerge()
	 * @see #unsetMerge()
	 * @see #setMerge(DefaultableBoolean)
	 * @see org.mule.ide.config.spring.SpringPackage#getBaseCollectionType_Merge()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='merge'"
	 * @generated
	 */
	DefaultableBoolean getMerge();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BaseCollectionType#getMerge <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @see #isSetMerge()
	 * @see #unsetMerge()
	 * @see #getMerge()
	 * @generated
	 */
	void setMerge(DefaultableBoolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BaseCollectionType#getMerge <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMerge()
	 * @see #getMerge()
	 * @see #setMerge(DefaultableBoolean)
	 * @generated
	 */
	void unsetMerge();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BaseCollectionType#getMerge <em>Merge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merge</em>' attribute is set.
	 * @see #unsetMerge()
	 * @see #getMerge()
	 * @see #setMerge(DefaultableBoolean)
	 * @generated
	 */
	boolean isSetMerge();

} // BaseCollectionType
