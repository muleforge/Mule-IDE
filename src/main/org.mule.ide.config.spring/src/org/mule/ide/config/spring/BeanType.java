/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getConstructorArg <em>Constructor Arg</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getLookupMethod <em>Lookup Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getReplacedMethod <em>Replaced Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getAny <em>Any</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#isAutowireCandidate <em>Autowire Candidate</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getDependencyCheck <em>Dependency Check</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getDestroyMethod <em>Destroy Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getFactoryMethod <em>Factory Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getLazyInit <em>Lazy Init</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.BeanType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.spring.SpringPackage#getBeanType()
 * @model extendedMetaData="name='bean_._type' kind='elementOnly'"
 * @generated
 */
public interface BeanType extends IdentifiedType {
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
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getDescription <em>Description</em>}' containment reference.
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
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.MetaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Arbitrary metadata attached to a bean definition.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Meta()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='meta' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<MetaType> getMeta();

	/**
	 * Returns the value of the '<em><b>Constructor Arg</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.ConstructorArgType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				<![CDATA[
	 * 	Bean definitions can specify zero or more constructor arguments.
	 * 	This is an alternative to "autowire constructor".
	 * 	Arguments correspond to either a specific index of the constructor
	 * 	argument list or are supposed to be matched generically by type.
	 * 
	 * 	Note: A single generic argument value will just be used once, rather
	 * 	than potentially matched multiple times (as of Spring 1.1).
	 * 
	 * 	constructor-arg elements are also used in conjunction with the
	 * 	factory-method element to construct beans using static or instance
	 * 	factory methods.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constructor Arg</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_ConstructorArg()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constructor-arg' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<ConstructorArgType> getConstructorArg();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Bean definitions can have zero or more properties.
	 * 	Property elements correspond to JavaBean setter methods exposed
	 * 	by the bean classes. Spring supports primitives, references to other
	 * 	beans in the same or related factories, lists, maps and properties.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Lookup Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.LookupMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	A lookup method causes the IoC container to override the given method
	 * 	and return the bean with the name given in the bean attribute. This is
	 * 	a form of Method Injection. It is particularly useful as an alternative
	 * 	to implementing the BeanFactoryAware interface, in order to be able to
	 * 	make getBean() calls for non-singleton instances at runtime. In this
	 * 	case, Method Injection is a less invasive alternative.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lookup Method</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_LookupMethod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lookup-method' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<LookupMethodType> getLookupMethod();

	/**
	 * Returns the value of the '<em><b>Replaced Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.spring.ReplacedMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Similar to the lookup method mechanism, the replaced-method element
	 * 	is used to control IoC container method overriding: Method Injection.
	 * 	This mechanism allows the overriding of a method with arbitrary code.
	 * 			]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaced Method</em>' containment reference list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_ReplacedMethod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaced-method' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<ReplacedMethodType> getReplacedMethod();

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
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='strict' group='#group:2'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Is this bean "abstract", that is, not meant to be instantiated itself
	 * 	but rather just serving as parent for concrete child bean definitions?
	 * 	The default is "false". Specify "true" to tell the bean factory to not
	 * 	try to instantiate that particular bean in any case.
	 * 
	 * 	Note: This attribute will not be inherited by child bean definitions.
	 * 	Hence, it needs to be specified per abstract bean definition.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(boolean)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Abstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeanType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeanType#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Autowire</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.spring.AutowireType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Controls whether bean properties are "autowired".
	 * 	This is an automagical process in which bean references don't need
	 * 	to be coded explicitly in the XML bean definition file, but rather the
	 * 	Spring container works out dependencies.
	 * 
	 * 	There are 5 modes:
	 * 
	 * 	1. "no"
	 * 	The traditional Spring default. No automagical wiring. Bean references
	 * 	must be defined in the XML file via the <ref/> element (or "ref"
	 * 	attribute). We recommend this in most cases as it makes documentation
	 * 	more explicit.
	 * 
	 * 	2. "byName"
	 * 	Autowiring by property name. If a bean of class Cat exposes a dog
	 * 	property, Spring will try to set this to the value of the bean "dog"
	 * 	in the current container. If there is no matching bean by name, nothing
	 * 	special happens; use dependency-check="objects" to raise an error in
	 * 	that case.
	 * 
	 * 	3. "byType"
	 * 	Autowiring if there is exactly one bean of the property type in the
	 * 	container. If there is more than one, a fatal error is raised, and
	 * 	you cannot use byType autowiring for that bean. If there is none,
	 * 	nothing special happens; use dependency-check="objects" to raise an
	 * 	error in that case.
	 * 
	 * 	4. "constructor"
	 * 	Analogous to "byType" for constructor arguments. If there is not exactly
	 * 	one bean of the constructor argument type in the bean factory, a fatal
	 * 	error is raised.
	 * 
	 * 	5. "autodetect"
	 * 	Chooses "constructor" or "byType" through introspection of the bean
	 * 	class. If a default constructor is found, "byType" gets applied.
	 * 
	 * 	Note that explicit dependencies, i.e. "property" and "constructor-arg"
	 * 	elements, always override autowiring. Autowire behavior can be combined
	 * 	with dependency checking, which will be performed after all autowiring
	 * 	has been completed.
	 * 
	 * 	Note: This attribute will not be inherited by child bean definitions.
	 * 	Hence, it needs to be specified per concrete bean definition.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autowire</em>' attribute.
	 * @see org.mule.ide.config.spring.AutowireType
	 * @see #isSetAutowire()
	 * @see #unsetAutowire()
	 * @see #setAutowire(AutowireType)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Autowire()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='autowire'"
	 * @generated
	 */
	AutowireType getAutowire();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getAutowire <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autowire</em>' attribute.
	 * @see org.mule.ide.config.spring.AutowireType
	 * @see #isSetAutowire()
	 * @see #unsetAutowire()
	 * @see #getAutowire()
	 * @generated
	 */
	void setAutowire(AutowireType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeanType#getAutowire <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutowire()
	 * @see #getAutowire()
	 * @see #setAutowire(AutowireType)
	 * @generated
	 */
	void unsetAutowire();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeanType#getAutowire <em>Autowire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autowire</em>' attribute is set.
	 * @see #unsetAutowire()
	 * @see #getAutowire()
	 * @see #setAutowire(AutowireType)
	 * @generated
	 */
	boolean isSetAutowire();

	/**
	 * Returns the value of the '<em><b>Autowire Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Indicates whether or not this bean should be considered when looking
	 * 	for candidates to satisfy another bean's autowiring requirements.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autowire Candidate</em>' attribute.
	 * @see #isSetAutowireCandidate()
	 * @see #unsetAutowireCandidate()
	 * @see #setAutowireCandidate(boolean)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_AutowireCandidate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='autowire-candidate'"
	 * @generated
	 */
	boolean isAutowireCandidate();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#isAutowireCandidate <em>Autowire Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autowire Candidate</em>' attribute.
	 * @see #isSetAutowireCandidate()
	 * @see #unsetAutowireCandidate()
	 * @see #isAutowireCandidate()
	 * @generated
	 */
	void setAutowireCandidate(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeanType#isAutowireCandidate <em>Autowire Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutowireCandidate()
	 * @see #isAutowireCandidate()
	 * @see #setAutowireCandidate(boolean)
	 * @generated
	 */
	void unsetAutowireCandidate();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeanType#isAutowireCandidate <em>Autowire Candidate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autowire Candidate</em>' attribute is set.
	 * @see #unsetAutowireCandidate()
	 * @see #isAutowireCandidate()
	 * @see #setAutowireCandidate(boolean)
	 * @generated
	 */
	boolean isSetAutowireCandidate();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The fully qualified name of the bean's class, except if it pure serves as parent for child bean definitions.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Dependency Check</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.spring.DependencyCheckType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Controls whether or not to check whether all of this
	 * 	beans dependencies, expressed in its properties, are satisfied.
	 * 	The default is to perform no dependency checking.
	 * 
	 * 	"simple" type dependency checking includes primitives and String
	 * 	"object" includes collaborators (other beans in the factory)
	 * 	"all" includes both types of dependency checking
	 * 
	 * 	Note: This attribute will not be inherited by child bean definitions.
	 * 	Hence, it needs to be specified per concrete bean definition.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency Check</em>' attribute.
	 * @see org.mule.ide.config.spring.DependencyCheckType
	 * @see #isSetDependencyCheck()
	 * @see #unsetDependencyCheck()
	 * @see #setDependencyCheck(DependencyCheckType)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_DependencyCheck()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dependency-check'"
	 * @generated
	 */
	DependencyCheckType getDependencyCheck();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getDependencyCheck <em>Dependency Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Check</em>' attribute.
	 * @see org.mule.ide.config.spring.DependencyCheckType
	 * @see #isSetDependencyCheck()
	 * @see #unsetDependencyCheck()
	 * @see #getDependencyCheck()
	 * @generated
	 */
	void setDependencyCheck(DependencyCheckType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeanType#getDependencyCheck <em>Dependency Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDependencyCheck()
	 * @see #getDependencyCheck()
	 * @see #setDependencyCheck(DependencyCheckType)
	 * @generated
	 */
	void unsetDependencyCheck();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeanType#getDependencyCheck <em>Dependency Check</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dependency Check</em>' attribute is set.
	 * @see #unsetDependencyCheck()
	 * @see #getDependencyCheck()
	 * @see #setDependencyCheck(DependencyCheckType)
	 * @generated
	 */
	boolean isSetDependencyCheck();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The names of the beans that this bean depends on being initialized.
	 * 	The bean factory will guarantee that these beans get initialized
	 * 	before this bean.
	 * 
	 * 	Note that dependencies are normally expressed through bean properties
	 * 	or constructor arguments. This property should just be necessary for
	 * 	other kinds of dependencies like statics (*ugh*) or database preparation
	 * 	on startup.
	 * 
	 * 	Note: This attribute will not be inherited by child bean definitions.
	 * 	Hence, it needs to be specified per concrete bean definition.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute.
	 * @see #setDependsOn(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_DependsOn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='depends-on'"
	 * @generated
	 */
	String getDependsOn();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getDependsOn <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' attribute.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(String value);

	/**
	 * Returns the value of the '<em><b>Destroy Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the custom destroy method to invoke on bean factory
	 * 	shutdown. The method must have no arguments, but may throw any
	 * 	exception.
	 * 
	 * 	Note: Only invoked on beans whose lifecycle is under the full
	 * 	control of the factory - which is always the case for singletons,
	 * 	but not guaranteed for any other scope.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy Method</em>' attribute.
	 * @see #setDestroyMethod(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_DestroyMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='destroy-method'"
	 * @generated
	 */
	String getDestroyMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getDestroyMethod <em>Destroy Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy Method</em>' attribute.
	 * @see #getDestroyMethod()
	 * @generated
	 */
	void setDestroyMethod(String value);

	/**
	 * Returns the value of the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Alternative to class attribute for factory-method usage.
	 * 	If this is specified, no class attribute should be used.
	 * 	This must be set to the name of a bean in the current or
	 * 	ancestor factories that contains the relevant factory method.
	 * 	This allows the factory itself to be configured using Dependency
	 * 	Injection, and an instance (rather than static) method to be used.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factory Bean</em>' attribute.
	 * @see #setFactoryBean(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_FactoryBean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='factory-bean'"
	 * @generated
	 */
	String getFactoryBean();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getFactoryBean <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Bean</em>' attribute.
	 * @see #getFactoryBean()
	 * @generated
	 */
	void setFactoryBean(String value);

	/**
	 * Returns the value of the '<em><b>Factory Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of a factory method to use to create this object. Use
	 * 	constructor-arg elements to specify arguments to the factory method,
	 * 	if it takes arguments. Autowiring does not apply to factory methods.
	 * 
	 * 	If the "class" attribute is present, the factory method will be a static
	 * 	method on the class specified by the "class" attribute on this bean
	 * 	definition. Often this will be the same class as that of the constructed
	 * 	object - for example, when the factory method is used as an alternative
	 * 	to a constructor. However, it may be on a different class. In that case,
	 * 	the created object will *not* be of the class specified in the "class"
	 * 	attribute. This is analogous to FactoryBean behavior.
	 * 
	 * 	If the "factory-bean" attribute is present, the "class" attribute is not
	 * 	used, and the factory method will be an instance method on the object
	 * 	returned from a getBean call with the specified bean name. The factory
	 * 	bean may be defined as a singleton or a prototype.
	 * 
	 * 	The factory method can have any number of arguments. Autowiring is not
	 * 	supported. Use indexed constructor-arg elements in conjunction with the
	 * 	factory-method attribute.
	 * 
	 * 	Setter Injection can be used in conjunction with a factory method.
	 * 	Method Injection cannot, as the factory method returns an instance,
	 * 	which will be used when the container creates the bean.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factory Method</em>' attribute.
	 * @see #setFactoryMethod(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_FactoryMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='factory-method'"
	 * @generated
	 */
	String getFactoryMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getFactoryMethod <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Method</em>' attribute.
	 * @see #getFactoryMethod()
	 * @generated
	 */
	void setFactoryMethod(String value);

	/**
	 * Returns the value of the '<em><b>Init Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the custom initialization method to invoke after setting
	 * 	bean properties. The method must have no arguments, but may throw any
	 * 	exception.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Method</em>' attribute.
	 * @see #setInitMethod(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_InitMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='init-method'"
	 * @generated
	 */
	String getInitMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getInitMethod <em>Init Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Method</em>' attribute.
	 * @see #getInitMethod()
	 * @generated
	 */
	void setInitMethod(String value);

	/**
	 * Returns the value of the '<em><b>Lazy Init</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.spring.DefaultableBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Indicates whether or not this bean is to be lazily initialized.
	 * 	If false, it will be instantiated on startup by bean factories
	 * 	that perform eager initialization of singletons. The default is
	 * 	"false".
	 * 
	 * 	Note: This attribute will not be inherited by child bean definitions.
	 * 	Hence, it needs to be specified per concrete bean definition.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lazy Init</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @see #isSetLazyInit()
	 * @see #unsetLazyInit()
	 * @see #setLazyInit(DefaultableBoolean)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_LazyInit()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lazy-init'"
	 * @generated
	 */
	DefaultableBoolean getLazyInit();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getLazyInit <em>Lazy Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy Init</em>' attribute.
	 * @see org.mule.ide.config.spring.DefaultableBoolean
	 * @see #isSetLazyInit()
	 * @see #unsetLazyInit()
	 * @see #getLazyInit()
	 * @generated
	 */
	void setLazyInit(DefaultableBoolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.spring.BeanType#getLazyInit <em>Lazy Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLazyInit()
	 * @see #getLazyInit()
	 * @see #setLazyInit(DefaultableBoolean)
	 * @generated
	 */
	void unsetLazyInit();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.spring.BeanType#getLazyInit <em>Lazy Init</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lazy Init</em>' attribute is set.
	 * @see #unsetLazyInit()
	 * @see #getLazyInit()
	 * @see #setLazyInit(DefaultableBoolean)
	 * @generated
	 */
	boolean isSetLazyInit();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	Can be used to create one or more aliases illegal in an (XML) id.
	 * 	Multiple aliases can be separated by any number of spaces, commas,
	 * 	or semi-colons (or indeed any mixture of the three).
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The name of the parent bean definition.
	 * 
	 * 	Will use the bean class of the parent if none is specified, but can
	 * 	also override it. In the latter case, the child bean class must be
	 * 	compatible with the parent, i.e. accept the parent's property values
	 * 	and constructor argument values, if any.
	 * 
	 * 	A child bean definition will inherit constructor argument values,
	 * 	property values and method overrides from the parent, with the option
	 * 	to add new values. If init method, destroy method, factory bean and/or
	 * 	factory method are specified, they will override the corresponding
	 * 	parent settings.
	 * 
	 * 	The remaining settings will always be taken from the child definition:
	 * 	depends on, autowire mode, dependency check, scope, lazy init.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Parent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parent'"
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <![CDATA[
	 * 	The scope of this bean: typically "singleton" (one shared instance,
	 * 	which will be returned by all calls to getBean with the given id), or
	 * 	"prototype" (independent instance resulting from each call to getBean).
	 * 	Default is "singleton".
	 * 
	 * 	Singletons are most commonly used, and are ideal for multi-threaded
	 * 	service objects. Further scopes, such as "request" or "session", might
	 * 	be supported by extended bean factories (e.g. in a web environment).
	 * 
	 * 	Note: This attribute will not be inherited by child bean definitions.
	 * 	Hence, it needs to be specified per concrete bean definition.
	 * 
	 * 	Inner bean definitions inherit the singleton status of their containing
	 * 	bean definition, unless explicitly specified: The inner bean will be a
	 * 	singleton if the containing bean is a singleton, and a prototype if
	 * 	the containing bean has any other scope.
	 * 				]]>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_Scope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.spring.BeanType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.mule.ide.config.spring.SpringPackage#getBeanType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':23' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // BeanType
