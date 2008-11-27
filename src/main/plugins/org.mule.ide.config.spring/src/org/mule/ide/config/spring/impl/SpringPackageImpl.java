/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mule.ide.config.spring.AliasType;
import org.mule.ide.config.spring.ArgTypeType;
import org.mule.ide.config.spring.AutowireType;
import org.mule.ide.config.spring.BaseCollectionType;
import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.BeansType;
import org.mule.ide.config.spring.ConstructorArgType;
import org.mule.ide.config.spring.DefaultAutowireType;
import org.mule.ide.config.spring.DefaultDependencyCheckType;
import org.mule.ide.config.spring.DefaultableBoolean;
import org.mule.ide.config.spring.DependencyCheckType;
import org.mule.ide.config.spring.DescriptionType;
import org.mule.ide.config.spring.DocumentRoot;
import org.mule.ide.config.spring.EntryType;
import org.mule.ide.config.spring.IdentifiedType;
import org.mule.ide.config.spring.IdrefType;
import org.mule.ide.config.spring.ImportType;
import org.mule.ide.config.spring.KeyType;
import org.mule.ide.config.spring.ListOrSetType;
import org.mule.ide.config.spring.LookupMethodType;
import org.mule.ide.config.spring.MapType;
import org.mule.ide.config.spring.MetaType;
import org.mule.ide.config.spring.NullType;
import org.mule.ide.config.spring.PropType;
import org.mule.ide.config.spring.PropertyType;
import org.mule.ide.config.spring.PropsType;
import org.mule.ide.config.spring.RefType;
import org.mule.ide.config.spring.ReplacedMethodType;
import org.mule.ide.config.spring.SpringFactory;
import org.mule.ide.config.spring.SpringPackage;
import org.mule.ide.config.spring.TypedCollectionType;
import org.mule.ide.config.spring.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpringPackageImpl extends EPackageImpl implements SpringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beansTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorArgTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idrefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOrSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replacedMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum autowireTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultableBooleanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultAutowireTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultDependencyCheckTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependencyCheckTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType autowireTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultableBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultAutowireTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultDependencyCheckTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dependencyCheckTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mule.ide.config.spring.SpringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpringPackageImpl() {
		super(eNS_URI, SpringFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpringPackage init() {
		if (isInited) return (SpringPackage)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI);

		// Obtain or create and register package
		SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SpringPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpringPackage.createPackageContents();

		// Initialize created meta-data
		theSpringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpringPackage.freeze();

		return theSpringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasType() {
		return aliasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Alias() {
		return (EAttribute)aliasTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Name() {
		return (EAttribute)aliasTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgTypeType() {
		return argTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgTypeType_Mixed() {
		return (EAttribute)argTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgTypeType_Match() {
		return (EAttribute)argTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseCollectionType() {
		return baseCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCollectionType_Merge() {
		return (EAttribute)baseCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeansType() {
		return beansTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeansType_Description() {
		return (EReference)beansTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_Group() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeansType_Import() {
		return (EReference)beansTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeansType_Alias() {
		return (EReference)beansTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeansType_Bean() {
		return (EReference)beansTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_Any() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_DefaultAutowire() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_DefaultDependencyCheck() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_DefaultDestroyMethod() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_DefaultInitMethod() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_DefaultLazyInit() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeansType_DefaultMerge() {
		return (EAttribute)beansTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeanType() {
		return beanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanType_Description() {
		return (EReference)beanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Group() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanType_Meta() {
		return (EReference)beanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanType_ConstructorArg() {
		return (EReference)beanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanType_Property() {
		return (EReference)beanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanType_LookupMethod() {
		return (EReference)beanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanType_ReplacedMethod() {
		return (EReference)beanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Any() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Abstract() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Autowire() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_AutowireCandidate() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Class() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_DependencyCheck() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_DependsOn() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_DestroyMethod() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_FactoryBean() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_FactoryMethod() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_InitMethod() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_LazyInit() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Name() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Parent() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_Scope() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanType_AnyAttribute() {
		return (EAttribute)beanTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorArgType() {
		return constructorArgTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Description() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Bean() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Ref() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Idref() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Value() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Null() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_List() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Set() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Map() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorArgType_Props() {
		return (EReference)constructorArgTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorArgType_Any() {
		return (EAttribute)constructorArgTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorArgType_Index() {
		return (EAttribute)constructorArgTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorArgType_Ref1() {
		return (EAttribute)constructorArgTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorArgType_Type() {
		return (EAttribute)constructorArgTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorArgType_Value1() {
		return (EAttribute)constructorArgTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Mixed() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Alias() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArgType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bean() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Beans() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConstructorArg() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Entry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Idref() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Import() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Key() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_List() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LookupMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Map() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Meta() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Null() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Prop() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Property() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Props() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ref() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReplacedMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Set() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Value() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryType() {
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Key() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Group() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Bean() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Ref() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Idref() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Value() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Null() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_List() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Set() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Map() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Props() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Any() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Key1() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_KeyRef() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Value1() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_ValueRef() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedType() {
		return identifiedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedType_Id() {
		return (EAttribute)identifiedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdrefType() {
		return idrefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdrefType_Bean() {
		return (EAttribute)idrefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdrefType_Local() {
		return (EAttribute)idrefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportType() {
		return importTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportType_Resource() {
		return (EAttribute)importTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyType() {
		return keyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyType_Group() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Bean() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Ref() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Idref() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Value() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Null() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_List() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Set() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Map() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyType_Props() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyType_Any() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOrSetType() {
		return listOrSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOrSetType_Group() {
		return (EAttribute)listOrSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Bean() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Ref() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Idref() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Value() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Null() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_List() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Set() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Map() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOrSetType_Props() {
		return (EReference)listOrSetTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOrSetType_Any() {
		return (EAttribute)listOrSetTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupMethodType() {
		return lookupMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupMethodType_Bean() {
		return (EAttribute)lookupMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupMethodType_Name() {
		return (EAttribute)lookupMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapType() {
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapType_Group() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapType_Entry() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapType_KeyType() {
		return (EAttribute)mapTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaType() {
		return metaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaType_Key() {
		return (EAttribute)metaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaType_Value() {
		return (EAttribute)metaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullType() {
		return nullTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullType_Mixed() {
		return (EAttribute)nullTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Description() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Meta() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Bean() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Ref() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Idref() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Value() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Null() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_List() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Set() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Map() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Props() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Any() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Name() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Ref1() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value1() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropsType() {
		return propsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropsType_Group() {
		return (EAttribute)propsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropsType_Prop() {
		return (EReference)propsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropType() {
		return propTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropType_Mixed() {
		return (EAttribute)propTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropType_Key() {
		return (EAttribute)propTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefType() {
		return refTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType_Bean() {
		return (EAttribute)refTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType_Local() {
		return (EAttribute)refTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefType_Parent() {
		return (EAttribute)refTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplacedMethodType() {
		return replacedMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplacedMethodType_Group() {
		return (EAttribute)replacedMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplacedMethodType_ArgType() {
		return (EReference)replacedMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplacedMethodType_Name() {
		return (EAttribute)replacedMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplacedMethodType_Replacer() {
		return (EAttribute)replacedMethodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedCollectionType() {
		return typedCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedCollectionType_ValueType() {
		return (EAttribute)typedCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Mixed() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Type() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAutowireType() {
		return autowireTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultableBoolean() {
		return defaultableBooleanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultAutowireType() {
		return defaultAutowireTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultDependencyCheckType() {
		return defaultDependencyCheckTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDependencyCheckType() {
		return dependencyCheckTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAutowireTypeObject() {
		return autowireTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultableBooleanObject() {
		return defaultableBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultAutowireTypeObject() {
		return defaultAutowireTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultDependencyCheckTypeObject() {
		return defaultDependencyCheckTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDependencyCheckTypeObject() {
		return dependencyCheckTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringFactory getSpringFactory() {
		return (SpringFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aliasTypeEClass = createEClass(ALIAS_TYPE);
		createEAttribute(aliasTypeEClass, ALIAS_TYPE__ALIAS);
		createEAttribute(aliasTypeEClass, ALIAS_TYPE__NAME);

		argTypeTypeEClass = createEClass(ARG_TYPE_TYPE);
		createEAttribute(argTypeTypeEClass, ARG_TYPE_TYPE__MIXED);
		createEAttribute(argTypeTypeEClass, ARG_TYPE_TYPE__MATCH);

		baseCollectionTypeEClass = createEClass(BASE_COLLECTION_TYPE);
		createEAttribute(baseCollectionTypeEClass, BASE_COLLECTION_TYPE__MERGE);

		beansTypeEClass = createEClass(BEANS_TYPE);
		createEReference(beansTypeEClass, BEANS_TYPE__DESCRIPTION);
		createEAttribute(beansTypeEClass, BEANS_TYPE__GROUP);
		createEReference(beansTypeEClass, BEANS_TYPE__IMPORT);
		createEReference(beansTypeEClass, BEANS_TYPE__ALIAS);
		createEReference(beansTypeEClass, BEANS_TYPE__BEAN);
		createEAttribute(beansTypeEClass, BEANS_TYPE__ANY);
		createEAttribute(beansTypeEClass, BEANS_TYPE__DEFAULT_AUTOWIRE);
		createEAttribute(beansTypeEClass, BEANS_TYPE__DEFAULT_DEPENDENCY_CHECK);
		createEAttribute(beansTypeEClass, BEANS_TYPE__DEFAULT_DESTROY_METHOD);
		createEAttribute(beansTypeEClass, BEANS_TYPE__DEFAULT_INIT_METHOD);
		createEAttribute(beansTypeEClass, BEANS_TYPE__DEFAULT_LAZY_INIT);
		createEAttribute(beansTypeEClass, BEANS_TYPE__DEFAULT_MERGE);

		beanTypeEClass = createEClass(BEAN_TYPE);
		createEReference(beanTypeEClass, BEAN_TYPE__DESCRIPTION);
		createEAttribute(beanTypeEClass, BEAN_TYPE__GROUP);
		createEReference(beanTypeEClass, BEAN_TYPE__META);
		createEReference(beanTypeEClass, BEAN_TYPE__CONSTRUCTOR_ARG);
		createEReference(beanTypeEClass, BEAN_TYPE__PROPERTY);
		createEReference(beanTypeEClass, BEAN_TYPE__LOOKUP_METHOD);
		createEReference(beanTypeEClass, BEAN_TYPE__REPLACED_METHOD);
		createEAttribute(beanTypeEClass, BEAN_TYPE__ANY);
		createEAttribute(beanTypeEClass, BEAN_TYPE__ABSTRACT);
		createEAttribute(beanTypeEClass, BEAN_TYPE__AUTOWIRE);
		createEAttribute(beanTypeEClass, BEAN_TYPE__AUTOWIRE_CANDIDATE);
		createEAttribute(beanTypeEClass, BEAN_TYPE__CLASS);
		createEAttribute(beanTypeEClass, BEAN_TYPE__DEPENDENCY_CHECK);
		createEAttribute(beanTypeEClass, BEAN_TYPE__DEPENDS_ON);
		createEAttribute(beanTypeEClass, BEAN_TYPE__DESTROY_METHOD);
		createEAttribute(beanTypeEClass, BEAN_TYPE__FACTORY_BEAN);
		createEAttribute(beanTypeEClass, BEAN_TYPE__FACTORY_METHOD);
		createEAttribute(beanTypeEClass, BEAN_TYPE__INIT_METHOD);
		createEAttribute(beanTypeEClass, BEAN_TYPE__LAZY_INIT);
		createEAttribute(beanTypeEClass, BEAN_TYPE__NAME);
		createEAttribute(beanTypeEClass, BEAN_TYPE__PARENT);
		createEAttribute(beanTypeEClass, BEAN_TYPE__SCOPE);
		createEAttribute(beanTypeEClass, BEAN_TYPE__ANY_ATTRIBUTE);

		constructorArgTypeEClass = createEClass(CONSTRUCTOR_ARG_TYPE);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__DESCRIPTION);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__BEAN);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__REF);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__IDREF);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__VALUE);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__NULL);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__LIST);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__SET);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__MAP);
		createEReference(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__PROPS);
		createEAttribute(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__ANY);
		createEAttribute(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__INDEX);
		createEAttribute(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__REF1);
		createEAttribute(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__TYPE);
		createEAttribute(constructorArgTypeEClass, CONSTRUCTOR_ARG_TYPE__VALUE1);

		descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__MIXED);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALIAS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ARG_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BEAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BEANS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONSTRUCTOR_ARG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDREF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOOKUP_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__META);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NULL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPLACED_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE);

		entryTypeEClass = createEClass(ENTRY_TYPE);
		createEReference(entryTypeEClass, ENTRY_TYPE__KEY);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__GROUP);
		createEReference(entryTypeEClass, ENTRY_TYPE__BEAN);
		createEReference(entryTypeEClass, ENTRY_TYPE__REF);
		createEReference(entryTypeEClass, ENTRY_TYPE__IDREF);
		createEReference(entryTypeEClass, ENTRY_TYPE__VALUE);
		createEReference(entryTypeEClass, ENTRY_TYPE__NULL);
		createEReference(entryTypeEClass, ENTRY_TYPE__LIST);
		createEReference(entryTypeEClass, ENTRY_TYPE__SET);
		createEReference(entryTypeEClass, ENTRY_TYPE__MAP);
		createEReference(entryTypeEClass, ENTRY_TYPE__PROPS);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__ANY);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__KEY1);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__KEY_REF);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__VALUE1);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__VALUE_REF);

		identifiedTypeEClass = createEClass(IDENTIFIED_TYPE);
		createEAttribute(identifiedTypeEClass, IDENTIFIED_TYPE__ID);

		idrefTypeEClass = createEClass(IDREF_TYPE);
		createEAttribute(idrefTypeEClass, IDREF_TYPE__BEAN);
		createEAttribute(idrefTypeEClass, IDREF_TYPE__LOCAL);

		importTypeEClass = createEClass(IMPORT_TYPE);
		createEAttribute(importTypeEClass, IMPORT_TYPE__RESOURCE);

		keyTypeEClass = createEClass(KEY_TYPE);
		createEAttribute(keyTypeEClass, KEY_TYPE__GROUP);
		createEReference(keyTypeEClass, KEY_TYPE__BEAN);
		createEReference(keyTypeEClass, KEY_TYPE__REF);
		createEReference(keyTypeEClass, KEY_TYPE__IDREF);
		createEReference(keyTypeEClass, KEY_TYPE__VALUE);
		createEReference(keyTypeEClass, KEY_TYPE__NULL);
		createEReference(keyTypeEClass, KEY_TYPE__LIST);
		createEReference(keyTypeEClass, KEY_TYPE__SET);
		createEReference(keyTypeEClass, KEY_TYPE__MAP);
		createEReference(keyTypeEClass, KEY_TYPE__PROPS);
		createEAttribute(keyTypeEClass, KEY_TYPE__ANY);

		listOrSetTypeEClass = createEClass(LIST_OR_SET_TYPE);
		createEAttribute(listOrSetTypeEClass, LIST_OR_SET_TYPE__GROUP);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__BEAN);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__REF);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__IDREF);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__VALUE);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__NULL);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__LIST);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__SET);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__MAP);
		createEReference(listOrSetTypeEClass, LIST_OR_SET_TYPE__PROPS);
		createEAttribute(listOrSetTypeEClass, LIST_OR_SET_TYPE__ANY);

		lookupMethodTypeEClass = createEClass(LOOKUP_METHOD_TYPE);
		createEAttribute(lookupMethodTypeEClass, LOOKUP_METHOD_TYPE__BEAN);
		createEAttribute(lookupMethodTypeEClass, LOOKUP_METHOD_TYPE__NAME);

		mapTypeEClass = createEClass(MAP_TYPE);
		createEAttribute(mapTypeEClass, MAP_TYPE__GROUP);
		createEReference(mapTypeEClass, MAP_TYPE__ENTRY);
		createEAttribute(mapTypeEClass, MAP_TYPE__KEY_TYPE);

		metaTypeEClass = createEClass(META_TYPE);
		createEAttribute(metaTypeEClass, META_TYPE__KEY);
		createEAttribute(metaTypeEClass, META_TYPE__VALUE);

		nullTypeEClass = createEClass(NULL_TYPE);
		createEAttribute(nullTypeEClass, NULL_TYPE__MIXED);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__DESCRIPTION);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__META);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__BEAN);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__REF);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__IDREF);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__VALUE);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__NULL);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__LIST);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__SET);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__MAP);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__PROPS);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__ANY);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__REF1);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE1);

		propsTypeEClass = createEClass(PROPS_TYPE);
		createEAttribute(propsTypeEClass, PROPS_TYPE__GROUP);
		createEReference(propsTypeEClass, PROPS_TYPE__PROP);

		propTypeEClass = createEClass(PROP_TYPE);
		createEAttribute(propTypeEClass, PROP_TYPE__MIXED);
		createEAttribute(propTypeEClass, PROP_TYPE__KEY);

		refTypeEClass = createEClass(REF_TYPE);
		createEAttribute(refTypeEClass, REF_TYPE__BEAN);
		createEAttribute(refTypeEClass, REF_TYPE__LOCAL);
		createEAttribute(refTypeEClass, REF_TYPE__PARENT);

		replacedMethodTypeEClass = createEClass(REPLACED_METHOD_TYPE);
		createEAttribute(replacedMethodTypeEClass, REPLACED_METHOD_TYPE__GROUP);
		createEReference(replacedMethodTypeEClass, REPLACED_METHOD_TYPE__ARG_TYPE);
		createEAttribute(replacedMethodTypeEClass, REPLACED_METHOD_TYPE__NAME);
		createEAttribute(replacedMethodTypeEClass, REPLACED_METHOD_TYPE__REPLACER);

		typedCollectionTypeEClass = createEClass(TYPED_COLLECTION_TYPE);
		createEAttribute(typedCollectionTypeEClass, TYPED_COLLECTION_TYPE__VALUE_TYPE);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__MIXED);
		createEAttribute(valueTypeEClass, VALUE_TYPE__TYPE);

		// Create enums
		autowireTypeEEnum = createEEnum(AUTOWIRE_TYPE);
		defaultableBooleanEEnum = createEEnum(DEFAULTABLE_BOOLEAN);
		defaultAutowireTypeEEnum = createEEnum(DEFAULT_AUTOWIRE_TYPE);
		defaultDependencyCheckTypeEEnum = createEEnum(DEFAULT_DEPENDENCY_CHECK_TYPE);
		dependencyCheckTypeEEnum = createEEnum(DEPENDENCY_CHECK_TYPE);

		// Create data types
		autowireTypeObjectEDataType = createEDataType(AUTOWIRE_TYPE_OBJECT);
		defaultableBooleanObjectEDataType = createEDataType(DEFAULTABLE_BOOLEAN_OBJECT);
		defaultAutowireTypeObjectEDataType = createEDataType(DEFAULT_AUTOWIRE_TYPE_OBJECT);
		defaultDependencyCheckTypeObjectEDataType = createEDataType(DEFAULT_DEPENDENCY_CHECK_TYPE_OBJECT);
		dependencyCheckTypeObjectEDataType = createEDataType(DEPENDENCY_CHECK_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		beanTypeEClass.getESuperTypes().add(this.getIdentifiedType());
		listOrSetTypeEClass.getESuperTypes().add(this.getTypedCollectionType());
		mapTypeEClass.getESuperTypes().add(this.getTypedCollectionType());
		propsTypeEClass.getESuperTypes().add(this.getBaseCollectionType());
		typedCollectionTypeEClass.getESuperTypes().add(this.getBaseCollectionType());

		// Initialize classes and features; add operations and parameters
		initEClass(aliasTypeEClass, AliasType.class, "AliasType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAliasType_Alias(), theXMLTypePackage.getString(), "alias", null, 1, 1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAliasType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argTypeTypeEClass, ArgTypeType.class, "ArgTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgTypeType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ArgTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgTypeType_Match(), theXMLTypePackage.getString(), "match", null, 0, 1, ArgTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseCollectionTypeEClass, BaseCollectionType.class, "BaseCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseCollectionType_Merge(), this.getDefaultableBoolean(), "merge", "default", 0, 1, BaseCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beansTypeEClass, BeansType.class, "BeansType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeansType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeansType_Import(), this.getImportType(), null, "import", null, 0, -1, BeansType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBeansType_Alias(), this.getAliasType(), null, "alias", null, 0, -1, BeansType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBeansType_Bean(), this.getBeanType(), null, "bean", null, 0, -1, BeansType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, BeansType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_DefaultAutowire(), this.getDefaultAutowireType(), "defaultAutowire", "no", 0, 1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_DefaultDependencyCheck(), this.getDefaultDependencyCheckType(), "defaultDependencyCheck", "none", 0, 1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_DefaultDestroyMethod(), theXMLTypePackage.getString(), "defaultDestroyMethod", null, 0, 1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_DefaultInitMethod(), theXMLTypePackage.getString(), "defaultInitMethod", null, 0, 1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_DefaultLazyInit(), theXMLTypePackage.getBoolean(), "defaultLazyInit", "false", 0, 1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeansType_DefaultMerge(), theXMLTypePackage.getBoolean(), "defaultMerge", "false", 0, 1, BeansType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanTypeEClass, BeanType.class, "BeanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeanType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeanType_Meta(), this.getMetaType(), null, "meta", null, 0, -1, BeanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBeanType_ConstructorArg(), this.getConstructorArgType(), null, "constructorArg", null, 0, -1, BeanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBeanType_Property(), this.getPropertyType(), null, "property", null, 0, -1, BeanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBeanType_LookupMethod(), this.getLookupMethodType(), null, "lookupMethod", null, 0, -1, BeanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBeanType_ReplacedMethod(), this.getReplacedMethodType(), null, "replacedMethod", null, 0, -1, BeanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, BeanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Abstract(), theXMLTypePackage.getBoolean(), "abstract", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Autowire(), this.getAutowireType(), "autowire", "default", 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_AutowireCandidate(), theXMLTypePackage.getBoolean(), "autowireCandidate", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_DependencyCheck(), this.getDependencyCheckType(), "dependencyCheck", "default", 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_DependsOn(), theXMLTypePackage.getString(), "dependsOn", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_DestroyMethod(), theXMLTypePackage.getString(), "destroyMethod", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_FactoryBean(), theXMLTypePackage.getString(), "factoryBean", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_FactoryMethod(), theXMLTypePackage.getString(), "factoryMethod", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_InitMethod(), theXMLTypePackage.getString(), "initMethod", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_LazyInit(), this.getDefaultableBoolean(), "lazyInit", "default", 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Parent(), theXMLTypePackage.getString(), "parent", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_Scope(), theXMLTypePackage.getString(), "scope", null, 0, 1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, BeanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorArgTypeEClass, ConstructorArgType.class, "ConstructorArgType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructorArgType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Bean(), this.getBeanType(), null, "bean", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Ref(), this.getRefType(), null, "ref", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Idref(), this.getIdrefType(), null, "idref", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Value(), this.getValueType(), null, "value", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Null(), this.getNullType(), null, "null", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_List(), this.getListOrSetType(), null, "list", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Set(), this.getListOrSetType(), null, "set", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Map(), this.getMapType(), null, "map", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorArgType_Props(), this.getPropsType(), null, "props", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructorArgType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructorArgType_Index(), theXMLTypePackage.getString(), "index", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructorArgType_Ref1(), theXMLTypePackage.getString(), "ref1", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructorArgType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructorArgType_Value1(), theXMLTypePackage.getString(), "value1", null, 0, 1, ConstructorArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Alias(), this.getAliasType(), null, "alias", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ArgType(), this.getArgTypeType(), null, "argType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bean(), this.getBeanType(), null, "bean", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Beans(), this.getBeansType(), null, "beans", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConstructorArg(), this.getConstructorArgType(), null, "constructorArg", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), this.getDescriptionType(), null, "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Entry(), this.getEntryType(), null, "entry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Idref(), this.getIdrefType(), null, "idref", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Import(), this.getImportType(), null, "import", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Key(), this.getKeyType(), null, "key", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_List(), this.getListOrSetType(), null, "list", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LookupMethod(), this.getLookupMethodType(), null, "lookupMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Map(), this.getMapType(), null, "map", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Meta(), this.getMetaType(), null, "meta", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Null(), this.getNullType(), null, "null", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Prop(), this.getPropType(), null, "prop", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Props(), this.getPropsType(), null, "props", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ref(), this.getRefType(), null, "ref", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReplacedMethod(), this.getReplacedMethodType(), null, "replacedMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Set(), this.getListOrSetType(), null, "set", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Value(), this.getValueType(), null, "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType_Key(), this.getKeyType(), null, "key", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Bean(), this.getBeanType(), null, "bean", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Ref(), this.getRefType(), null, "ref", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Idref(), this.getIdrefType(), null, "idref", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Value(), this.getValueType(), null, "value", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Null(), this.getNullType(), null, "null", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_List(), this.getListOrSetType(), null, "list", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Set(), this.getListOrSetType(), null, "set", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Map(), this.getMapType(), null, "map", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Props(), this.getPropsType(), null, "props", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, EntryType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Key1(), theXMLTypePackage.getString(), "key1", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_KeyRef(), theXMLTypePackage.getString(), "keyRef", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Value1(), theXMLTypePackage.getString(), "value1", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_ValueRef(), theXMLTypePackage.getString(), "valueRef", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedTypeEClass, IdentifiedType.class, "IdentifiedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, IdentifiedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idrefTypeEClass, IdrefType.class, "IdrefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdrefType_Bean(), theXMLTypePackage.getString(), "bean", null, 0, 1, IdrefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdrefType_Local(), theXMLTypePackage.getIDREF(), "local", null, 0, 1, IdrefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importTypeEClass, ImportType.class, "ImportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportType_Resource(), theXMLTypePackage.getString(), "resource", null, 1, 1, ImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyTypeEClass, KeyType.class, "KeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Bean(), this.getBeanType(), null, "bean", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Ref(), this.getRefType(), null, "ref", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Idref(), this.getIdrefType(), null, "idref", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Value(), this.getValueType(), null, "value", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Null(), this.getNullType(), null, "null", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_List(), this.getListOrSetType(), null, "list", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Set(), this.getListOrSetType(), null, "set", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Map(), this.getMapType(), null, "map", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Props(), this.getPropsType(), null, "props", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KeyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(listOrSetTypeEClass, ListOrSetType.class, "ListOrSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListOrSetType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ListOrSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Bean(), this.getBeanType(), null, "bean", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Ref(), this.getRefType(), null, "ref", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Idref(), this.getIdrefType(), null, "idref", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Value(), this.getValueType(), null, "value", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Null(), this.getNullType(), null, "null", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_List(), this.getListOrSetType(), null, "list", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Set(), this.getListOrSetType(), null, "set", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Map(), this.getMapType(), null, "map", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOrSetType_Props(), this.getPropsType(), null, "props", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getListOrSetType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ListOrSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(lookupMethodTypeEClass, LookupMethodType.class, "LookupMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookupMethodType_Bean(), theXMLTypePackage.getString(), "bean", null, 0, 1, LookupMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMethodType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, LookupMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapTypeEClass, MapType.class, "MapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_Entry(), this.getEntryType(), null, "entry", null, 0, -1, MapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapType_KeyType(), theXMLTypePackage.getString(), "keyType", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaTypeEClass, MetaType.class, "MetaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaType_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, MetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, MetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullTypeEClass, NullType.class, "NullType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, NullType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Meta(), this.getMetaType(), null, "meta", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Bean(), this.getBeanType(), null, "bean", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Ref(), this.getRefType(), null, "ref", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Idref(), this.getIdrefType(), null, "idref", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Value(), this.getValueType(), null, "value", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Null(), this.getNullType(), null, "null", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_List(), this.getListOrSetType(), null, "list", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Set(), this.getListOrSetType(), null, "set", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Map(), this.getMapType(), null, "map", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_Props(), this.getPropsType(), null, "props", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Ref1(), theXMLTypePackage.getString(), "ref1", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Value1(), theXMLTypePackage.getString(), "value1", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propsTypeEClass, PropsType.class, "PropsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PropsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropsType_Prop(), this.getPropType(), null, "prop", null, 0, -1, PropsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propTypeEClass, PropType.class, "PropType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, PropType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropType_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, PropType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refTypeEClass, RefType.class, "RefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefType_Bean(), theXMLTypePackage.getString(), "bean", null, 0, 1, RefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefType_Local(), theXMLTypePackage.getIDREF(), "local", null, 0, 1, RefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefType_Parent(), theXMLTypePackage.getString(), "parent", null, 0, 1, RefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replacedMethodTypeEClass, ReplacedMethodType.class, "ReplacedMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplacedMethodType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ReplacedMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplacedMethodType_ArgType(), this.getArgTypeType(), null, "argType", null, 0, -1, ReplacedMethodType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplacedMethodType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ReplacedMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplacedMethodType_Replacer(), theXMLTypePackage.getString(), "replacer", null, 0, 1, ReplacedMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedCollectionTypeEClass, TypedCollectionType.class, "TypedCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedCollectionType_ValueType(), theXMLTypePackage.getString(), "valueType", null, 0, 1, TypedCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(autowireTypeEEnum, AutowireType.class, "AutowireType");
		addEEnumLiteral(autowireTypeEEnum, AutowireType.DEFAULT);
		addEEnumLiteral(autowireTypeEEnum, AutowireType.NO);
		addEEnumLiteral(autowireTypeEEnum, AutowireType.BY_NAME);
		addEEnumLiteral(autowireTypeEEnum, AutowireType.BY_TYPE);
		addEEnumLiteral(autowireTypeEEnum, AutowireType.CONSTRUCTOR);
		addEEnumLiteral(autowireTypeEEnum, AutowireType.AUTODETECT);

		initEEnum(defaultableBooleanEEnum, DefaultableBoolean.class, "DefaultableBoolean");
		addEEnumLiteral(defaultableBooleanEEnum, DefaultableBoolean.DEFAULT);
		addEEnumLiteral(defaultableBooleanEEnum, DefaultableBoolean.TRUE);
		addEEnumLiteral(defaultableBooleanEEnum, DefaultableBoolean.FALSE);

		initEEnum(defaultAutowireTypeEEnum, DefaultAutowireType.class, "DefaultAutowireType");
		addEEnumLiteral(defaultAutowireTypeEEnum, DefaultAutowireType.NO);
		addEEnumLiteral(defaultAutowireTypeEEnum, DefaultAutowireType.BY_NAME);
		addEEnumLiteral(defaultAutowireTypeEEnum, DefaultAutowireType.BY_TYPE);
		addEEnumLiteral(defaultAutowireTypeEEnum, DefaultAutowireType.CONSTRUCTOR);
		addEEnumLiteral(defaultAutowireTypeEEnum, DefaultAutowireType.AUTODETECT);

		initEEnum(defaultDependencyCheckTypeEEnum, DefaultDependencyCheckType.class, "DefaultDependencyCheckType");
		addEEnumLiteral(defaultDependencyCheckTypeEEnum, DefaultDependencyCheckType.NONE);
		addEEnumLiteral(defaultDependencyCheckTypeEEnum, DefaultDependencyCheckType.SIMPLE);
		addEEnumLiteral(defaultDependencyCheckTypeEEnum, DefaultDependencyCheckType.OBJECTS);
		addEEnumLiteral(defaultDependencyCheckTypeEEnum, DefaultDependencyCheckType.ALL);

		initEEnum(dependencyCheckTypeEEnum, DependencyCheckType.class, "DependencyCheckType");
		addEEnumLiteral(dependencyCheckTypeEEnum, DependencyCheckType.DEFAULT);
		addEEnumLiteral(dependencyCheckTypeEEnum, DependencyCheckType.NONE);
		addEEnumLiteral(dependencyCheckTypeEEnum, DependencyCheckType.SIMPLE);
		addEEnumLiteral(dependencyCheckTypeEEnum, DependencyCheckType.OBJECTS);
		addEEnumLiteral(dependencyCheckTypeEEnum, DependencyCheckType.ALL);

		// Initialize data types
		initEDataType(autowireTypeObjectEDataType, AutowireType.class, "AutowireTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(defaultableBooleanObjectEDataType, DefaultableBoolean.class, "DefaultableBooleanObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(defaultAutowireTypeObjectEDataType, DefaultAutowireType.class, "DefaultAutowireTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(defaultDependencyCheckTypeObjectEDataType, DefaultDependencyCheckType.class, "DefaultDependencyCheckTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dependencyCheckTypeObjectEDataType, DependencyCheckType.class, "DependencyCheckTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (aliasTypeEClass, 
		   source, 
		   new String[] {
			 "name", "alias_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getAliasType_Alias(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alias"
		   });			
		addAnnotation
		  (getAliasType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (argTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "arg-type_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getArgTypeType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getArgTypeType_Match(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "match"
		   });		
		addAnnotation
		  (autowireTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "autowire_._type"
		   });		
		addAnnotation
		  (autowireTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "autowire_._type:Object",
			 "baseType", "autowire_._type"
		   });		
		addAnnotation
		  (baseCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "baseCollectionType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getBaseCollectionType_Merge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "merge"
		   });		
		addAnnotation
		  (beansTypeEClass, 
		   source, 
		   new String[] {
			 "name", "beans_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getBeansType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBeansType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getBeansType_Import(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "import",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getBeansType_Alias(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alias",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getBeansType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getBeansType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "strict",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getBeansType_DefaultAutowire(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-autowire"
		   });			
		addAnnotation
		  (getBeansType_DefaultDependencyCheck(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-dependency-check"
		   });			
		addAnnotation
		  (getBeansType_DefaultDestroyMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-destroy-method"
		   });			
		addAnnotation
		  (getBeansType_DefaultInitMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-init-method"
		   });			
		addAnnotation
		  (getBeansType_DefaultLazyInit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-lazy-init"
		   });			
		addAnnotation
		  (getBeansType_DefaultMerge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-merge"
		   });		
		addAnnotation
		  (beanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bean_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getBeanType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBeanType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });			
		addAnnotation
		  (getBeanType_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getBeanType_ConstructorArg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constructor-arg",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getBeanType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getBeanType_LookupMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup-method",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getBeanType_ReplacedMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "replaced-method",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getBeanType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":8",
			 "processing", "strict",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getBeanType_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "abstract"
		   });			
		addAnnotation
		  (getBeanType_Autowire(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autowire"
		   });			
		addAnnotation
		  (getBeanType_AutowireCandidate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autowire-candidate"
		   });			
		addAnnotation
		  (getBeanType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });			
		addAnnotation
		  (getBeanType_DependencyCheck(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dependency-check"
		   });			
		addAnnotation
		  (getBeanType_DependsOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "depends-on"
		   });			
		addAnnotation
		  (getBeanType_DestroyMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "destroy-method"
		   });			
		addAnnotation
		  (getBeanType_FactoryBean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "factory-bean"
		   });			
		addAnnotation
		  (getBeanType_FactoryMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "factory-method"
		   });			
		addAnnotation
		  (getBeanType_InitMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "init-method"
		   });			
		addAnnotation
		  (getBeanType_LazyInit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lazy-init"
		   });			
		addAnnotation
		  (getBeanType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getBeanType_Parent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parent"
		   });			
		addAnnotation
		  (getBeanType_Scope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scope"
		   });		
		addAnnotation
		  (getBeanType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":23",
			 "processing", "lax"
		   });		
		addAnnotation
		  (constructorArgTypeEClass, 
		   source, 
		   new String[] {
			 "name", "constructor-arg_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getConstructorArgType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Idref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Null(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getConstructorArgType_Props(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "props",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConstructorArgType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":10",
			 "processing", "strict"
		   });			
		addAnnotation
		  (getConstructorArgType_Index(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "index"
		   });			
		addAnnotation
		  (getConstructorArgType_Ref1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });			
		addAnnotation
		  (getConstructorArgType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });			
		addAnnotation
		  (getConstructorArgType_Value1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (defaultableBooleanEEnum, 
		   source, 
		   new String[] {
			 "name", "defaultable-boolean"
		   });		
		addAnnotation
		  (defaultableBooleanObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "defaultable-boolean:Object",
			 "baseType", "defaultable-boolean"
		   });		
		addAnnotation
		  (defaultAutowireTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "default-autowire_._type"
		   });		
		addAnnotation
		  (defaultAutowireTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "default-autowire_._type:Object",
			 "baseType", "default-autowire_._type"
		   });		
		addAnnotation
		  (defaultDependencyCheckTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "default-dependency-check_._type"
		   });		
		addAnnotation
		  (defaultDependencyCheckTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "default-dependency-check_._type:Object",
			 "baseType", "default-dependency-check_._type"
		   });		
		addAnnotation
		  (dependencyCheckTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "dependency-check_._type"
		   });		
		addAnnotation
		  (dependencyCheckTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "dependency-check_._type:Object",
			 "baseType", "dependency-check_._type"
		   });		
		addAnnotation
		  (descriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "description_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDescriptionType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Alias(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alias",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ArgType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "arg-type",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Bean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Beans(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "beans",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ConstructorArg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constructor-arg",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Entry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Idref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Import(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "import",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LookupMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lookup-method",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Null(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Prop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "prop",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Props(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "props",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ReplacedMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "replaced-method",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (entryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "entryType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getEntryType_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getEntryType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Idref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idref",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Null(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Props(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "props",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getEntryType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":11",
			 "processing", "strict",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getEntryType_Key1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });			
		addAnnotation
		  (getEntryType_KeyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key-ref"
		   });			
		addAnnotation
		  (getEntryType_Value1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });			
		addAnnotation
		  (getEntryType_ValueRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value-ref"
		   });			
		addAnnotation
		  (identifiedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "identifiedType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getIdentifiedType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (idrefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "idref_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getIdrefType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bean"
		   });			
		addAnnotation
		  (getIdrefType_Local(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "local"
		   });		
		addAnnotation
		  (importTypeEClass, 
		   source, 
		   new String[] {
			 "name", "import_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getImportType_Resource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resource"
		   });		
		addAnnotation
		  (keyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "key_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getKeyType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getKeyType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_Idref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idref",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_Null(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getKeyType_Props(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "props",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":10",
			 "processing", "strict",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (listOrSetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "listOrSetType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListOrSetType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Idref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idref",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Null(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getListOrSetType_Props(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "props",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getListOrSetType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":12",
			 "processing", "strict",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (lookupMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "lookup-method_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getLookupMethodType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bean"
		   });			
		addAnnotation
		  (getLookupMethodType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (mapTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mapType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMapType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });			
		addAnnotation
		  (getMapType_Entry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });			
		addAnnotation
		  (getMapType_KeyType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key-type"
		   });		
		addAnnotation
		  (metaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "metaType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getMetaType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });			
		addAnnotation
		  (getMetaType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (nullTypeEClass, 
		   source, 
		   new String[] {
			 "name", "null_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getNullType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (propertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "propertyType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPropertyType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Idref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Null(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPropertyType_Props(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "props",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":11",
			 "processing", "strict"
		   });			
		addAnnotation
		  (getPropertyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getPropertyType_Ref1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });			
		addAnnotation
		  (getPropertyType_Value1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (propsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "propsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPropsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getPropsType_Prop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "prop",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (propTypeEClass, 
		   source, 
		   new String[] {
			 "name", "prop_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getPropType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getPropType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (refTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ref_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getRefType_Bean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bean"
		   });			
		addAnnotation
		  (getRefType_Local(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "local"
		   });			
		addAnnotation
		  (getRefType_Parent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parent"
		   });		
		addAnnotation
		  (replacedMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "replaced-method_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReplacedMethodType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getReplacedMethodType_ArgType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "arg-type",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getReplacedMethodType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getReplacedMethodType_Replacer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "replacer"
		   });		
		addAnnotation
		  (typedCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "typedCollectionType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getTypedCollectionType_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value-type"
		   });		
		addAnnotation
		  (valueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "value_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getValueType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getValueType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });
	}

} //SpringPackageImpl
