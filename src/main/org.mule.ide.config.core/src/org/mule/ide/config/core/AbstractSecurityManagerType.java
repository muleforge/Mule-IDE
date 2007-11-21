/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Security Manager Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 This is an empty holder that can be extended by modules that want to
 *                 provide security managers. Typically it will contain elements called
 *                 module:type-security-provider which extend securityProviderType
 *                 where "module" might be "acegi" and "type" might de "delegate", for example.
 *                 Alternatively (or in addition) it may contain encryption strategies,
 *                 which should follow a similar scheme and extend encryptionStrategyType.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractSecurityManagerType#getId <em>Id</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractSecurityManagerType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractSecurityManagerType()
 * @model extendedMetaData="name='abstractSecurityManagerType' kind='empty'"
 * @generated
 */
public interface AbstractSecurityManagerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"_muleSecurityManager"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(Object)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractSecurityManagerType_Id()
	 * @model default="_muleSecurityManager" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	Object getId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(Object value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(Object)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(Object)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"_muleSecurityManager"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(Object)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractSecurityManagerType_Name()
	 * @model default="_muleSecurityManager" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(Object)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AbstractSecurityManagerType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(Object)
	 * @generated
	 */
	boolean isSetName();

} // AbstractSecurityManagerType
