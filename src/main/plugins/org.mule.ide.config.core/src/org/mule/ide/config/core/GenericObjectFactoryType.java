/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getInstanceRef <em>Instance Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GenericObjectFactoryType#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType()
 * @model extendedMetaData="name='genericObjectFactoryType' kind='elementOnly'"
 * @generated
 */
public interface GenericObjectFactoryType extends AbstractObjectFactoryType {
	/**
	 * Returns the value of the '<em><b>Abstract Pooling Profile Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pooling profile to use if scope="pooled"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Pooling Profile Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_AbstractPoolingProfileGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-pooling-profile:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractPoolingProfileGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pooling profile to use if scope="pooled"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Pooling Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_AbstractPoolingProfile()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-pooling-profile' namespace='##targetNamespace' group='abstract-pooling-profile:group'"
	 * @generated
	 */
	AbstractPoolingProfileType getAbstractPoolingProfile();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_Class()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GenericObjectFactoryType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Custom factory bean
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factory Ref</em>' attribute.
	 * @see #setFactoryRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_FactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='factory-ref'"
	 * @generated
	 */
	String getFactoryRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GenericObjectFactoryType#getFactoryRef <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Ref</em>' attribute.
	 * @see #getFactoryRef()
	 * @generated
	 */
	void setFactoryRef(String value);

	/**
	 * Returns the value of the '<em><b>Instance Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Singleton object instance to use
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Ref</em>' attribute.
	 * @see #setInstanceRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_InstanceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='instance-ref'"
	 * @generated
	 */
	String getInstanceRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GenericObjectFactoryType#getInstanceRef <em>Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Ref</em>' attribute.
	 * @see #getInstanceRef()
	 * @generated
	 */
	void setInstanceRef(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"prototype"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.ScopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creation strategy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.mule.ide.config.core.ScopeType
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(ScopeType)
	 * @see org.mule.ide.config.core.CorePackage#getGenericObjectFactoryType_Scope()
	 * @model default="prototype" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	ScopeType getScope();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GenericObjectFactoryType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.mule.ide.config.core.ScopeType
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ScopeType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.GenericObjectFactoryType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.GenericObjectFactoryType#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType)
	 * @generated
	 */
	boolean isSetScope();

} // GenericObjectFactoryType
