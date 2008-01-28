/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beans Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getImport <em>Import</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getAny <em>Any</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getDefaultAutowire <em>Default Autowire</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getDefaultDependencyCheck <em>Default Dependency Check</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getDefaultDestroyMethod <em>Default Destroy Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#getDefaultInitMethod <em>Default Init Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#isDefaultLazyInit <em>Default Lazy Init</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeansType#isDefaultMerge <em>Default Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getBeansType()
 * @model extendedMetaData="name='beans_._type' kind='elementOnly'"
 * @generated
 */
public interface BeansType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Contains informative text describing the purpose of the enclosing
	 * 	element.
	 * 	Used primarily for user documentation of XML bean definition documents.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeansType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.ImportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Specifies an XML bean definition resource to import.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_Import()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.AliasType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Defines an alias for a bean (which can reside in a different definition
	 * 	resource).
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_Alias()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AliasType> getAlias();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.BeanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Defines a single (usually named) bean.
	 * 
	 * 	A bean definition may contain nested tags for constructor arguments,
	 * 	property values, lookup methods, and replaced methods. Mixing constructor
	 * 	injection and setter injection on the same bean is explicitly supported.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BeanType> getBean();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='strict' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Default Autowire</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.spring.DefaultAutowireType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The default 'autowire' value; see the documentation for the
	 * 	'autowire' attribute of the '<bean>/' element. 
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Autowire</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultAutowireType
	 * @see #isSetDefaultAutowire()
	 * @see #unsetDefaultAutowire()
	 * @see #setDefaultAutowire(DefaultAutowireType)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_DefaultAutowire()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='default-autowire'"
	 * @generated
	 */
	DefaultAutowireType getDefaultAutowire();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultAutowire <em>Default Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Autowire</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultAutowireType
	 * @see #isSetDefaultAutowire()
	 * @see #unsetDefaultAutowire()
	 * @see #getDefaultAutowire()
	 * @generated
	 */
	void setDefaultAutowire(DefaultAutowireType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultAutowire <em>Default Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultAutowire()
	 * @see #getDefaultAutowire()
	 * @see #setDefaultAutowire(DefaultAutowireType)
	 * @generated
	 */
	void unsetDefaultAutowire();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultAutowire <em>Default Autowire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Autowire</em>' attribute is set.
	 * @see #unsetDefaultAutowire()
	 * @see #getDefaultAutowire()
	 * @see #setDefaultAutowire(DefaultAutowireType)
	 * @generated
	 */
	boolean isSetDefaultAutowire();

	/**
	 * Returns the value of the '<em><b>Default Dependency Check</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.spring.DefaultDependencyCheckType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The default 'dependency-check' value; see the documentation for the
	 * 	'dependency-check' attribute of the '<bean>/' element. 
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Dependency Check</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
	 * @see #isSetDefaultDependencyCheck()
	 * @see #unsetDefaultDependencyCheck()
	 * @see #setDefaultDependencyCheck(DefaultDependencyCheckType)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_DefaultDependencyCheck()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='default-dependency-check'"
	 * @generated
	 */
	DefaultDependencyCheckType getDefaultDependencyCheck();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultDependencyCheck <em>Default Dependency Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Dependency Check</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultDependencyCheckType
	 * @see #isSetDefaultDependencyCheck()
	 * @see #unsetDefaultDependencyCheck()
	 * @see #getDefaultDependencyCheck()
	 * @generated
	 */
	void setDefaultDependencyCheck(DefaultDependencyCheckType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultDependencyCheck <em>Default Dependency Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultDependencyCheck()
	 * @see #getDefaultDependencyCheck()
	 * @see #setDefaultDependencyCheck(DefaultDependencyCheckType)
	 * @generated
	 */
	void unsetDefaultDependencyCheck();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultDependencyCheck <em>Default Dependency Check</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Dependency Check</em>' attribute is set.
	 * @see #unsetDefaultDependencyCheck()
	 * @see #getDefaultDependencyCheck()
	 * @see #setDefaultDependencyCheck(DefaultDependencyCheckType)
	 * @generated
	 */
	boolean isSetDefaultDependencyCheck();

	/**
	 * Returns the value of the '<em><b>Default Destroy Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The default 'destroy-method' value; see the documentation for the
	 * 	'destroy-method' attribute of the '<bean>/' element. 
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Destroy Method</em>' attribute.
	 * @see #setDefaultDestroyMethod(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_DefaultDestroyMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default-destroy-method'"
	 * @generated
	 */
	String getDefaultDestroyMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultDestroyMethod <em>Default Destroy Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Destroy Method</em>' attribute.
	 * @see #getDefaultDestroyMethod()
	 * @generated
	 */
	void setDefaultDestroyMethod(String value);

	/**
	 * Returns the value of the '<em><b>Default Init Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The default 'init-method' value; see the documentation for the
	 * 	'init-method' attribute of the '<bean>/' element. 
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Init Method</em>' attribute.
	 * @see #setDefaultInitMethod(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_DefaultInitMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default-init-method'"
	 * @generated
	 */
	String getDefaultInitMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeansType#getDefaultInitMethod <em>Default Init Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Init Method</em>' attribute.
	 * @see #getDefaultInitMethod()
	 * @generated
	 */
	void setDefaultInitMethod(String value);

	/**
	 * Returns the value of the '<em><b>Default Lazy Init</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The default 'lazy-init' value; see the documentation for the
	 * 	'lazy-init' attribute of the '<bean>/' element. 
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Lazy Init</em>' attribute.
	 * @see #isSetDefaultLazyInit()
	 * @see #unsetDefaultLazyInit()
	 * @see #setDefaultLazyInit(boolean)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_DefaultLazyInit()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='default-lazy-init'"
	 * @generated
	 */
	boolean isDefaultLazyInit();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeansType#isDefaultLazyInit <em>Default Lazy Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Lazy Init</em>' attribute.
	 * @see #isSetDefaultLazyInit()
	 * @see #unsetDefaultLazyInit()
	 * @see #isDefaultLazyInit()
	 * @generated
	 */
	void setDefaultLazyInit(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeansType#isDefaultLazyInit <em>Default Lazy Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultLazyInit()
	 * @see #isDefaultLazyInit()
	 * @see #setDefaultLazyInit(boolean)
	 * @generated
	 */
	void unsetDefaultLazyInit();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeansType#isDefaultLazyInit <em>Default Lazy Init</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Lazy Init</em>' attribute is set.
	 * @see #unsetDefaultLazyInit()
	 * @see #isDefaultLazyInit()
	 * @see #setDefaultLazyInit(boolean)
	 * @generated
	 */
	boolean isSetDefaultLazyInit();

	/**
	 * Returns the value of the '<em><b>Default Merge</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The default 'merge' value; see the documentation for the
	 * 	'merge' attribute of the various collection elements. 
	 * 					]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Merge</em>' attribute.
	 * @see #isSetDefaultMerge()
	 * @see #unsetDefaultMerge()
	 * @see #setDefaultMerge(boolean)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeansType_DefaultMerge()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='default-merge'"
	 * @generated
	 */
	boolean isDefaultMerge();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeansType#isDefaultMerge <em>Default Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Merge</em>' attribute.
	 * @see #isSetDefaultMerge()
	 * @see #unsetDefaultMerge()
	 * @see #isDefaultMerge()
	 * @generated
	 */
	void setDefaultMerge(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeansType#isDefaultMerge <em>Default Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultMerge()
	 * @see #isDefaultMerge()
	 * @see #setDefaultMerge(boolean)
	 * @generated
	 */
	void unsetDefaultMerge();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeansType#isDefaultMerge <em>Default Merge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Merge</em>' attribute is set.
	 * @see #unsetDefaultMerge()
	 * @see #isDefaultMerge()
	 * @see #setDefaultMerge(boolean)
	 * @generated
	 */
	boolean isSetDefaultMerge();

} // BeansType
