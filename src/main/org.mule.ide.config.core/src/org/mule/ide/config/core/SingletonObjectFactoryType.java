/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.SingletonObjectFactoryType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SingletonObjectFactoryType#getInstanceRef <em>Instance Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSingletonObjectFactoryType()
 * @model extendedMetaData="name='singletonObjectFactoryType' kind='elementOnly'"
 * @generated
 */
public interface SingletonObjectFactoryType extends AbstractObjectFactoryType {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getSingletonObjectFactoryType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SingletonObjectFactoryType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Instance Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Singleton object instance to use
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Ref</em>' attribute.
	 * @see #setInstanceRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getSingletonObjectFactoryType_InstanceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='instance-ref'"
	 * @generated
	 */
	String getInstanceRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SingletonObjectFactoryType#getInstanceRef <em>Instance Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Ref</em>' attribute.
	 * @see #getInstanceRef()
	 * @generated
	 */
	void setInstanceRef(String value);

} // SingletonObjectFactoryType
