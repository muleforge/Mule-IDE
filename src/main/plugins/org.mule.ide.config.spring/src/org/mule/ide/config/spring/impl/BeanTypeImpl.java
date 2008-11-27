/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.spring.AutowireType;
import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.ConstructorArgType;
import org.mule.ide.config.spring.DefaultableBoolean;
import org.mule.ide.config.spring.DependencyCheckType;
import org.mule.ide.config.spring.DescriptionType;
import org.mule.ide.config.spring.LookupMethodType;
import org.mule.ide.config.spring.MetaType;
import org.mule.ide.config.spring.PropertyType;
import org.mule.ide.config.spring.ReplacedMethodType;
import org.mule.ide.config.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getConstructorArg <em>Constructor Arg</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getLookupMethod <em>Lookup Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getReplacedMethod <em>Replaced Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#isAutowireCandidate <em>Autowire Candidate</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getDependencyCheck <em>Dependency Check</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getDestroyMethod <em>Destroy Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getFactoryMethod <em>Factory Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getLazyInit <em>Lazy Init</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.BeanTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanTypeImpl extends IdentifiedTypeImpl implements BeanType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutowire()
	 * @generated
	 * @ordered
	 */
	protected static final AutowireType AUTOWIRE_EDEFAULT = AutowireType.DEFAULT;

	/**
	 * The cached value of the '{@link #getAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutowire()
	 * @generated
	 * @ordered
	 */
	protected AutowireType autowire = AUTOWIRE_EDEFAULT;

	/**
	 * This is true if the Autowire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autowireESet;

	/**
	 * The default value of the '{@link #isAutowireCandidate() <em>Autowire Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowireCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOWIRE_CANDIDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutowireCandidate() <em>Autowire Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowireCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean autowireCandidate = AUTOWIRE_CANDIDATE_EDEFAULT;

	/**
	 * This is true if the Autowire Candidate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autowireCandidateESet;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependencyCheck() <em>Dependency Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyCheck()
	 * @generated
	 * @ordered
	 */
	protected static final DependencyCheckType DEPENDENCY_CHECK_EDEFAULT = DependencyCheckType.DEFAULT;

	/**
	 * The cached value of the '{@link #getDependencyCheck() <em>Dependency Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyCheck()
	 * @generated
	 * @ordered
	 */
	protected DependencyCheckType dependencyCheck = DEPENDENCY_CHECK_EDEFAULT;

	/**
	 * This is true if the Dependency Check attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dependencyCheckESet;

	/**
	 * The default value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected String dependsOn = DEPENDS_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestroyMethod() <em>Destroy Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTROY_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestroyMethod() <em>Destroy Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyMethod()
	 * @generated
	 * @ordered
	 */
	protected String destroyMethod = DESTROY_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_BEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected String factoryBean = FACTORY_BEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactoryMethod() <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryMethod() <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryMethod()
	 * @generated
	 * @ordered
	 */
	protected String factoryMethod = FACTORY_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitMethod() <em>Init Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitMethod() <em>Init Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMethod()
	 * @generated
	 * @ordered
	 */
	protected String initMethod = INIT_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLazyInit() <em>Lazy Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazyInit()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultableBoolean LAZY_INIT_EDEFAULT = DefaultableBoolean.DEFAULT;

	/**
	 * The cached value of the '{@link #getLazyInit() <em>Lazy Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazyInit()
	 * @generated
	 * @ordered
	 */
	protected DefaultableBoolean lazyInit = LAZY_INIT_EDEFAULT;

	/**
	 * This is true if the Lazy Init attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lazyInitESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.BEAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.BEAN_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.BEAN_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SpringPackage.BEAN_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaType> getMeta() {
		return getGroup().list(SpringPackage.Literals.BEAN_TYPE__META);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstructorArgType> getConstructorArg() {
		return getGroup().list(SpringPackage.Literals.BEAN_TYPE__CONSTRUCTOR_ARG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		return getGroup().list(SpringPackage.Literals.BEAN_TYPE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LookupMethodType> getLookupMethod() {
		return getGroup().list(SpringPackage.Literals.BEAN_TYPE__LOOKUP_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplacedMethodType> getReplacedMethod() {
		return getGroup().list(SpringPackage.Literals.BEAN_TYPE__REPLACED_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SpringPackage.Literals.BEAN_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		boolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BEAN_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutowireType getAutowire() {
		return autowire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutowire(AutowireType newAutowire) {
		AutowireType oldAutowire = autowire;
		autowire = newAutowire == null ? AUTOWIRE_EDEFAULT : newAutowire;
		boolean oldAutowireESet = autowireESet;
		autowireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__AUTOWIRE, oldAutowire, autowire, !oldAutowireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutowire() {
		AutowireType oldAutowire = autowire;
		boolean oldAutowireESet = autowireESet;
		autowire = AUTOWIRE_EDEFAULT;
		autowireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BEAN_TYPE__AUTOWIRE, oldAutowire, AUTOWIRE_EDEFAULT, oldAutowireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutowire() {
		return autowireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutowireCandidate() {
		return autowireCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutowireCandidate(boolean newAutowireCandidate) {
		boolean oldAutowireCandidate = autowireCandidate;
		autowireCandidate = newAutowireCandidate;
		boolean oldAutowireCandidateESet = autowireCandidateESet;
		autowireCandidateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__AUTOWIRE_CANDIDATE, oldAutowireCandidate, autowireCandidate, !oldAutowireCandidateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutowireCandidate() {
		boolean oldAutowireCandidate = autowireCandidate;
		boolean oldAutowireCandidateESet = autowireCandidateESet;
		autowireCandidate = AUTOWIRE_CANDIDATE_EDEFAULT;
		autowireCandidateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BEAN_TYPE__AUTOWIRE_CANDIDATE, oldAutowireCandidate, AUTOWIRE_CANDIDATE_EDEFAULT, oldAutowireCandidateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutowireCandidate() {
		return autowireCandidateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyCheckType getDependencyCheck() {
		return dependencyCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyCheck(DependencyCheckType newDependencyCheck) {
		DependencyCheckType oldDependencyCheck = dependencyCheck;
		dependencyCheck = newDependencyCheck == null ? DEPENDENCY_CHECK_EDEFAULT : newDependencyCheck;
		boolean oldDependencyCheckESet = dependencyCheckESet;
		dependencyCheckESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__DEPENDENCY_CHECK, oldDependencyCheck, dependencyCheck, !oldDependencyCheckESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDependencyCheck() {
		DependencyCheckType oldDependencyCheck = dependencyCheck;
		boolean oldDependencyCheckESet = dependencyCheckESet;
		dependencyCheck = DEPENDENCY_CHECK_EDEFAULT;
		dependencyCheckESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BEAN_TYPE__DEPENDENCY_CHECK, oldDependencyCheck, DEPENDENCY_CHECK_EDEFAULT, oldDependencyCheckESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDependencyCheck() {
		return dependencyCheckESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(String newDependsOn) {
		String oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__DEPENDS_ON, oldDependsOn, dependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestroyMethod() {
		return destroyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyMethod(String newDestroyMethod) {
		String oldDestroyMethod = destroyMethod;
		destroyMethod = newDestroyMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__DESTROY_METHOD, oldDestroyMethod, destroyMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryBean() {
		return factoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryBean(String newFactoryBean) {
		String oldFactoryBean = factoryBean;
		factoryBean = newFactoryBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__FACTORY_BEAN, oldFactoryBean, factoryBean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryMethod() {
		return factoryMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryMethod(String newFactoryMethod) {
		String oldFactoryMethod = factoryMethod;
		factoryMethod = newFactoryMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__FACTORY_METHOD, oldFactoryMethod, factoryMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitMethod() {
		return initMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitMethod(String newInitMethod) {
		String oldInitMethod = initMethod;
		initMethod = newInitMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__INIT_METHOD, oldInitMethod, initMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultableBoolean getLazyInit() {
		return lazyInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazyInit(DefaultableBoolean newLazyInit) {
		DefaultableBoolean oldLazyInit = lazyInit;
		lazyInit = newLazyInit == null ? LAZY_INIT_EDEFAULT : newLazyInit;
		boolean oldLazyInitESet = lazyInitESet;
		lazyInitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__LAZY_INIT, oldLazyInit, lazyInit, !oldLazyInitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLazyInit() {
		DefaultableBoolean oldLazyInit = lazyInit;
		boolean oldLazyInitESet = lazyInitESet;
		lazyInit = LAZY_INIT_EDEFAULT;
		lazyInitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.BEAN_TYPE__LAZY_INIT, oldLazyInit, LAZY_INIT_EDEFAULT, oldLazyInitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLazyInit() {
		return lazyInitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_TYPE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpringPackage.BEAN_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.BEAN_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case SpringPackage.BEAN_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_TYPE__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_TYPE__CONSTRUCTOR_ARG:
				return ((InternalEList<?>)getConstructorArg()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_TYPE__LOOKUP_METHOD:
				return ((InternalEList<?>)getLookupMethod()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_TYPE__REPLACED_METHOD:
				return ((InternalEList<?>)getReplacedMethod()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.BEAN_TYPE__DESCRIPTION:
				return getDescription();
			case SpringPackage.BEAN_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpringPackage.BEAN_TYPE__META:
				return getMeta();
			case SpringPackage.BEAN_TYPE__CONSTRUCTOR_ARG:
				return getConstructorArg();
			case SpringPackage.BEAN_TYPE__PROPERTY:
				return getProperty();
			case SpringPackage.BEAN_TYPE__LOOKUP_METHOD:
				return getLookupMethod();
			case SpringPackage.BEAN_TYPE__REPLACED_METHOD:
				return getReplacedMethod();
			case SpringPackage.BEAN_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpringPackage.BEAN_TYPE__ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case SpringPackage.BEAN_TYPE__AUTOWIRE:
				return getAutowire();
			case SpringPackage.BEAN_TYPE__AUTOWIRE_CANDIDATE:
				return isAutowireCandidate() ? Boolean.TRUE : Boolean.FALSE;
			case SpringPackage.BEAN_TYPE__CLASS:
				return getClass_();
			case SpringPackage.BEAN_TYPE__DEPENDENCY_CHECK:
				return getDependencyCheck();
			case SpringPackage.BEAN_TYPE__DEPENDS_ON:
				return getDependsOn();
			case SpringPackage.BEAN_TYPE__DESTROY_METHOD:
				return getDestroyMethod();
			case SpringPackage.BEAN_TYPE__FACTORY_BEAN:
				return getFactoryBean();
			case SpringPackage.BEAN_TYPE__FACTORY_METHOD:
				return getFactoryMethod();
			case SpringPackage.BEAN_TYPE__INIT_METHOD:
				return getInitMethod();
			case SpringPackage.BEAN_TYPE__LAZY_INIT:
				return getLazyInit();
			case SpringPackage.BEAN_TYPE__NAME:
				return getName();
			case SpringPackage.BEAN_TYPE__PARENT:
				return getParent();
			case SpringPackage.BEAN_TYPE__SCOPE:
				return getScope();
			case SpringPackage.BEAN_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpringPackage.BEAN_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case SpringPackage.BEAN_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpringPackage.BEAN_TYPE__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends MetaType>)newValue);
				return;
			case SpringPackage.BEAN_TYPE__CONSTRUCTOR_ARG:
				getConstructorArg().clear();
				getConstructorArg().addAll((Collection<? extends ConstructorArgType>)newValue);
				return;
			case SpringPackage.BEAN_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case SpringPackage.BEAN_TYPE__LOOKUP_METHOD:
				getLookupMethod().clear();
				getLookupMethod().addAll((Collection<? extends LookupMethodType>)newValue);
				return;
			case SpringPackage.BEAN_TYPE__REPLACED_METHOD:
				getReplacedMethod().clear();
				getReplacedMethod().addAll((Collection<? extends ReplacedMethodType>)newValue);
				return;
			case SpringPackage.BEAN_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpringPackage.BEAN_TYPE__ABSTRACT:
				setAbstract(((Boolean)newValue).booleanValue());
				return;
			case SpringPackage.BEAN_TYPE__AUTOWIRE:
				setAutowire((AutowireType)newValue);
				return;
			case SpringPackage.BEAN_TYPE__AUTOWIRE_CANDIDATE:
				setAutowireCandidate(((Boolean)newValue).booleanValue());
				return;
			case SpringPackage.BEAN_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__DEPENDENCY_CHECK:
				setDependencyCheck((DependencyCheckType)newValue);
				return;
			case SpringPackage.BEAN_TYPE__DEPENDS_ON:
				setDependsOn((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__DESTROY_METHOD:
				setDestroyMethod((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__FACTORY_BEAN:
				setFactoryBean((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__FACTORY_METHOD:
				setFactoryMethod((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__INIT_METHOD:
				setInitMethod((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__LAZY_INIT:
				setLazyInit((DefaultableBoolean)newValue);
				return;
			case SpringPackage.BEAN_TYPE__NAME:
				setName((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__PARENT:
				setParent((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__SCOPE:
				setScope((String)newValue);
				return;
			case SpringPackage.BEAN_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpringPackage.BEAN_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case SpringPackage.BEAN_TYPE__GROUP:
				getGroup().clear();
				return;
			case SpringPackage.BEAN_TYPE__META:
				getMeta().clear();
				return;
			case SpringPackage.BEAN_TYPE__CONSTRUCTOR_ARG:
				getConstructorArg().clear();
				return;
			case SpringPackage.BEAN_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case SpringPackage.BEAN_TYPE__LOOKUP_METHOD:
				getLookupMethod().clear();
				return;
			case SpringPackage.BEAN_TYPE__REPLACED_METHOD:
				getReplacedMethod().clear();
				return;
			case SpringPackage.BEAN_TYPE__ANY:
				getAny().clear();
				return;
			case SpringPackage.BEAN_TYPE__ABSTRACT:
				unsetAbstract();
				return;
			case SpringPackage.BEAN_TYPE__AUTOWIRE:
				unsetAutowire();
				return;
			case SpringPackage.BEAN_TYPE__AUTOWIRE_CANDIDATE:
				unsetAutowireCandidate();
				return;
			case SpringPackage.BEAN_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__DEPENDENCY_CHECK:
				unsetDependencyCheck();
				return;
			case SpringPackage.BEAN_TYPE__DEPENDS_ON:
				setDependsOn(DEPENDS_ON_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__DESTROY_METHOD:
				setDestroyMethod(DESTROY_METHOD_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__FACTORY_BEAN:
				setFactoryBean(FACTORY_BEAN_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__FACTORY_METHOD:
				setFactoryMethod(FACTORY_METHOD_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__INIT_METHOD:
				setInitMethod(INIT_METHOD_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__LAZY_INIT:
				unsetLazyInit();
				return;
			case SpringPackage.BEAN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__PARENT:
				setParent(PARENT_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case SpringPackage.BEAN_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpringPackage.BEAN_TYPE__DESCRIPTION:
				return description != null;
			case SpringPackage.BEAN_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SpringPackage.BEAN_TYPE__META:
				return !getMeta().isEmpty();
			case SpringPackage.BEAN_TYPE__CONSTRUCTOR_ARG:
				return !getConstructorArg().isEmpty();
			case SpringPackage.BEAN_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case SpringPackage.BEAN_TYPE__LOOKUP_METHOD:
				return !getLookupMethod().isEmpty();
			case SpringPackage.BEAN_TYPE__REPLACED_METHOD:
				return !getReplacedMethod().isEmpty();
			case SpringPackage.BEAN_TYPE__ANY:
				return !getAny().isEmpty();
			case SpringPackage.BEAN_TYPE__ABSTRACT:
				return isSetAbstract();
			case SpringPackage.BEAN_TYPE__AUTOWIRE:
				return isSetAutowire();
			case SpringPackage.BEAN_TYPE__AUTOWIRE_CANDIDATE:
				return isSetAutowireCandidate();
			case SpringPackage.BEAN_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case SpringPackage.BEAN_TYPE__DEPENDENCY_CHECK:
				return isSetDependencyCheck();
			case SpringPackage.BEAN_TYPE__DEPENDS_ON:
				return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
			case SpringPackage.BEAN_TYPE__DESTROY_METHOD:
				return DESTROY_METHOD_EDEFAULT == null ? destroyMethod != null : !DESTROY_METHOD_EDEFAULT.equals(destroyMethod);
			case SpringPackage.BEAN_TYPE__FACTORY_BEAN:
				return FACTORY_BEAN_EDEFAULT == null ? factoryBean != null : !FACTORY_BEAN_EDEFAULT.equals(factoryBean);
			case SpringPackage.BEAN_TYPE__FACTORY_METHOD:
				return FACTORY_METHOD_EDEFAULT == null ? factoryMethod != null : !FACTORY_METHOD_EDEFAULT.equals(factoryMethod);
			case SpringPackage.BEAN_TYPE__INIT_METHOD:
				return INIT_METHOD_EDEFAULT == null ? initMethod != null : !INIT_METHOD_EDEFAULT.equals(initMethod);
			case SpringPackage.BEAN_TYPE__LAZY_INIT:
				return isSetLazyInit();
			case SpringPackage.BEAN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpringPackage.BEAN_TYPE__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
			case SpringPackage.BEAN_TYPE__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case SpringPackage.BEAN_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", autowire: ");
		if (autowireESet) result.append(autowire); else result.append("<unset>");
		result.append(", autowireCandidate: ");
		if (autowireCandidateESet) result.append(autowireCandidate); else result.append("<unset>");
		result.append(", class: ");
		result.append(class_);
		result.append(", dependencyCheck: ");
		if (dependencyCheckESet) result.append(dependencyCheck); else result.append("<unset>");
		result.append(", dependsOn: ");
		result.append(dependsOn);
		result.append(", destroyMethod: ");
		result.append(destroyMethod);
		result.append(", factoryBean: ");
		result.append(factoryBean);
		result.append(", factoryMethod: ");
		result.append(factoryMethod);
		result.append(", initMethod: ");
		result.append(initMethod);
		result.append(", lazyInit: ");
		if (lazyInitESet) result.append(lazyInit); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", parent: ");
		result.append(parent);
		result.append(", scope: ");
		result.append(scope);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //BeanTypeImpl
