/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pooling Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.PoolingProfileType#getExhaustedAction <em>Exhausted Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PoolingProfileType#getInitialisationPolicy <em>Initialisation Policy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PoolingProfileType#getMaxActive <em>Max Active</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PoolingProfileType#getMaxIdle <em>Max Idle</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PoolingProfileType#getMaxWait <em>Max Wait</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getPoolingProfileType()
 * @model extendedMetaData="name='poolingProfileType' kind='empty'"
 * @generated
 */
public interface PoolingProfileType extends AbstractPoolingProfileType {
	/**
	 * Returns the value of the '<em><b>Exhausted Action</b></em>' attribute.
	 * The default value is <code>"WHEN_EXHAUSTED_GROW"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.ExhaustedActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exhausted Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exhausted Action</em>' attribute.
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @see #isSetExhaustedAction()
	 * @see #unsetExhaustedAction()
	 * @see #setExhaustedAction(ExhaustedActionType)
	 * @see org.mule.ide.config.core.CorePackage#getPoolingProfileType_ExhaustedAction()
	 * @model default="WHEN_EXHAUSTED_GROW" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='exhaustedAction'"
	 * @generated
	 */
	ExhaustedActionType getExhaustedAction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getExhaustedAction <em>Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exhausted Action</em>' attribute.
	 * @see org.mule.ide.config.core.ExhaustedActionType
	 * @see #isSetExhaustedAction()
	 * @see #unsetExhaustedAction()
	 * @see #getExhaustedAction()
	 * @generated
	 */
	void setExhaustedAction(ExhaustedActionType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getExhaustedAction <em>Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExhaustedAction()
	 * @see #getExhaustedAction()
	 * @see #setExhaustedAction(ExhaustedActionType)
	 * @generated
	 */
	void unsetExhaustedAction();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getExhaustedAction <em>Exhausted Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exhausted Action</em>' attribute is set.
	 * @see #unsetExhaustedAction()
	 * @see #getExhaustedAction()
	 * @see #setExhaustedAction(ExhaustedActionType)
	 * @generated
	 */
	boolean isSetExhaustedAction();

	/**
	 * Returns the value of the '<em><b>Initialisation Policy</b></em>' attribute.
	 * The default value is <code>"INITIALISE_ONE"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.InitialisationPolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialisation Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialisation Policy</em>' attribute.
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @see #isSetInitialisationPolicy()
	 * @see #unsetInitialisationPolicy()
	 * @see #setInitialisationPolicy(InitialisationPolicyType)
	 * @see org.mule.ide.config.core.CorePackage#getPoolingProfileType_InitialisationPolicy()
	 * @model default="INITIALISE_ONE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='initialisationPolicy'"
	 * @generated
	 */
	InitialisationPolicyType getInitialisationPolicy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getInitialisationPolicy <em>Initialisation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialisation Policy</em>' attribute.
	 * @see org.mule.ide.config.core.InitialisationPolicyType
	 * @see #isSetInitialisationPolicy()
	 * @see #unsetInitialisationPolicy()
	 * @see #getInitialisationPolicy()
	 * @generated
	 */
	void setInitialisationPolicy(InitialisationPolicyType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getInitialisationPolicy <em>Initialisation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialisationPolicy()
	 * @see #getInitialisationPolicy()
	 * @see #setInitialisationPolicy(InitialisationPolicyType)
	 * @generated
	 */
	void unsetInitialisationPolicy();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getInitialisationPolicy <em>Initialisation Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initialisation Policy</em>' attribute is set.
	 * @see #unsetInitialisationPolicy()
	 * @see #getInitialisationPolicy()
	 * @see #setInitialisationPolicy(InitialisationPolicyType)
	 * @generated
	 */
	boolean isSetInitialisationPolicy();

	/**
	 * Returns the value of the '<em><b>Max Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Active</em>' attribute.
	 * @see #setMaxActive(String)
	 * @see org.mule.ide.config.core.CorePackage#getPoolingProfileType_MaxActive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxActive'"
	 * @generated
	 */
	String getMaxActive();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getMaxActive <em>Max Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Active</em>' attribute.
	 * @see #getMaxActive()
	 * @generated
	 */
	void setMaxActive(String value);

	/**
	 * Returns the value of the '<em><b>Max Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Idle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Idle</em>' attribute.
	 * @see #setMaxIdle(String)
	 * @see org.mule.ide.config.core.CorePackage#getPoolingProfileType_MaxIdle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxIdle'"
	 * @generated
	 */
	String getMaxIdle();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getMaxIdle <em>Max Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Idle</em>' attribute.
	 * @see #getMaxIdle()
	 * @generated
	 */
	void setMaxIdle(String value);

	/**
	 * Returns the value of the '<em><b>Max Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Wait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Wait</em>' attribute.
	 * @see #setMaxWait(String)
	 * @see org.mule.ide.config.core.CorePackage#getPoolingProfileType_MaxWait()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxWait'"
	 * @generated
	 */
	String getMaxWait();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PoolingProfileType#getMaxWait <em>Max Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Wait</em>' attribute.
	 * @see #getMaxWait()
	 * @generated
	 */
	void setMaxWait(String value);

} // PoolingProfileType
