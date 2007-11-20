/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mule.ide.config.spring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpringFactoryImpl extends EFactoryImpl implements SpringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpringFactory init() {
		try {
			SpringFactory theSpringFactory = (SpringFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.springframework.org/schema/beans"); 
			if (theSpringFactory != null) {
				return theSpringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpringPackage.ALIAS_TYPE: return createAliasType();
			case SpringPackage.ARG_TYPE_TYPE: return createArgTypeType();
			case SpringPackage.BASE_COLLECTION_TYPE: return createBaseCollectionType();
			case SpringPackage.BEANS_TYPE: return createBeansType();
			case SpringPackage.BEAN_TYPE: return createBeanType();
			case SpringPackage.CONSTRUCTOR_ARG_TYPE: return createConstructorArgType();
			case SpringPackage.DESCRIPTION_TYPE: return createDescriptionType();
			case SpringPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SpringPackage.ENTRY_TYPE: return createEntryType();
			case SpringPackage.IDREF_TYPE: return createIdrefType();
			case SpringPackage.IMPORT_TYPE: return createImportType();
			case SpringPackage.KEY_TYPE: return createKeyType();
			case SpringPackage.LIST_OR_SET_TYPE: return createListOrSetType();
			case SpringPackage.LOOKUP_METHOD_TYPE: return createLookupMethodType();
			case SpringPackage.MAP_TYPE: return createMapType();
			case SpringPackage.META_TYPE: return createMetaType();
			case SpringPackage.NULL_TYPE: return createNullType();
			case SpringPackage.PROPERTY_TYPE: return createPropertyType();
			case SpringPackage.PROPS_TYPE: return createPropsType();
			case SpringPackage.PROP_TYPE: return createPropType();
			case SpringPackage.REF_TYPE: return createRefType();
			case SpringPackage.REPLACED_METHOD_TYPE: return createReplacedMethodType();
			case SpringPackage.TYPED_COLLECTION_TYPE: return createTypedCollectionType();
			case SpringPackage.VALUE_TYPE: return createValueType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpringPackage.AUTOWIRE_TYPE:
				return createAutowireTypeFromString(eDataType, initialValue);
			case SpringPackage.DEFAULTABLE_BOOLEAN:
				return createDefaultableBooleanFromString(eDataType, initialValue);
			case SpringPackage.DEFAULT_AUTOWIRE_TYPE:
				return createDefaultAutowireTypeFromString(eDataType, initialValue);
			case SpringPackage.DEFAULT_DEPENDENCY_CHECK_TYPE:
				return createDefaultDependencyCheckTypeFromString(eDataType, initialValue);
			case SpringPackage.DEPENDENCY_CHECK_TYPE:
				return createDependencyCheckTypeFromString(eDataType, initialValue);
			case SpringPackage.AUTOWIRE_TYPE_OBJECT:
				return createAutowireTypeObjectFromString(eDataType, initialValue);
			case SpringPackage.DEFAULTABLE_BOOLEAN_OBJECT:
				return createDefaultableBooleanObjectFromString(eDataType, initialValue);
			case SpringPackage.DEFAULT_AUTOWIRE_TYPE_OBJECT:
				return createDefaultAutowireTypeObjectFromString(eDataType, initialValue);
			case SpringPackage.DEFAULT_DEPENDENCY_CHECK_TYPE_OBJECT:
				return createDefaultDependencyCheckTypeObjectFromString(eDataType, initialValue);
			case SpringPackage.DEPENDENCY_CHECK_TYPE_OBJECT:
				return createDependencyCheckTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpringPackage.AUTOWIRE_TYPE:
				return convertAutowireTypeToString(eDataType, instanceValue);
			case SpringPackage.DEFAULTABLE_BOOLEAN:
				return convertDefaultableBooleanToString(eDataType, instanceValue);
			case SpringPackage.DEFAULT_AUTOWIRE_TYPE:
				return convertDefaultAutowireTypeToString(eDataType, instanceValue);
			case SpringPackage.DEFAULT_DEPENDENCY_CHECK_TYPE:
				return convertDefaultDependencyCheckTypeToString(eDataType, instanceValue);
			case SpringPackage.DEPENDENCY_CHECK_TYPE:
				return convertDependencyCheckTypeToString(eDataType, instanceValue);
			case SpringPackage.AUTOWIRE_TYPE_OBJECT:
				return convertAutowireTypeObjectToString(eDataType, instanceValue);
			case SpringPackage.DEFAULTABLE_BOOLEAN_OBJECT:
				return convertDefaultableBooleanObjectToString(eDataType, instanceValue);
			case SpringPackage.DEFAULT_AUTOWIRE_TYPE_OBJECT:
				return convertDefaultAutowireTypeObjectToString(eDataType, instanceValue);
			case SpringPackage.DEFAULT_DEPENDENCY_CHECK_TYPE_OBJECT:
				return convertDefaultDependencyCheckTypeObjectToString(eDataType, instanceValue);
			case SpringPackage.DEPENDENCY_CHECK_TYPE_OBJECT:
				return convertDependencyCheckTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasType createAliasType() {
		AliasTypeImpl aliasType = new AliasTypeImpl();
		return aliasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgTypeType createArgTypeType() {
		ArgTypeTypeImpl argTypeType = new ArgTypeTypeImpl();
		return argTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseCollectionType createBaseCollectionType() {
		BaseCollectionTypeImpl baseCollectionType = new BaseCollectionTypeImpl();
		return baseCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeansType createBeansType() {
		BeansTypeImpl beansType = new BeansTypeImpl();
		return beansType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanType createBeanType() {
		BeanTypeImpl beanType = new BeanTypeImpl();
		return beanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorArgType createConstructorArgType() {
		ConstructorArgTypeImpl constructorArgType = new ConstructorArgTypeImpl();
		return constructorArgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdrefType createIdrefType() {
		IdrefTypeImpl idrefType = new IdrefTypeImpl();
		return idrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType createImportType() {
		ImportTypeImpl importType = new ImportTypeImpl();
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType createKeyType() {
		KeyTypeImpl keyType = new KeyTypeImpl();
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrSetType createListOrSetType() {
		ListOrSetTypeImpl listOrSetType = new ListOrSetTypeImpl();
		return listOrSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMethodType createLookupMethodType() {
		LookupMethodTypeImpl lookupMethodType = new LookupMethodTypeImpl();
		return lookupMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaType createMetaType() {
		MetaTypeImpl metaType = new MetaTypeImpl();
		return metaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullType createNullType() {
		NullTypeImpl nullType = new NullTypeImpl();
		return nullType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropsType createPropsType() {
		PropsTypeImpl propsType = new PropsTypeImpl();
		return propsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropType createPropType() {
		PropTypeImpl propType = new PropTypeImpl();
		return propType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefType createRefType() {
		RefTypeImpl refType = new RefTypeImpl();
		return refType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplacedMethodType createReplacedMethodType() {
		ReplacedMethodTypeImpl replacedMethodType = new ReplacedMethodTypeImpl();
		return replacedMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedCollectionType createTypedCollectionType() {
		TypedCollectionTypeImpl typedCollectionType = new TypedCollectionTypeImpl();
		return typedCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutowireType createAutowireTypeFromString(EDataType eDataType, String initialValue) {
		AutowireType result = AutowireType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutowireTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultableBoolean createDefaultableBooleanFromString(EDataType eDataType, String initialValue) {
		DefaultableBoolean result = DefaultableBoolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultableBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAutowireType createDefaultAutowireTypeFromString(EDataType eDataType, String initialValue) {
		DefaultAutowireType result = DefaultAutowireType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultAutowireTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDependencyCheckType createDefaultDependencyCheckTypeFromString(EDataType eDataType, String initialValue) {
		DefaultDependencyCheckType result = DefaultDependencyCheckType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultDependencyCheckTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyCheckType createDependencyCheckTypeFromString(EDataType eDataType, String initialValue) {
		DependencyCheckType result = DependencyCheckType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependencyCheckTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutowireType createAutowireTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAutowireTypeFromString(SpringPackage.Literals.AUTOWIRE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutowireTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAutowireTypeToString(SpringPackage.Literals.AUTOWIRE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultableBoolean createDefaultableBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultableBooleanFromString(SpringPackage.Literals.DEFAULTABLE_BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultableBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultableBooleanToString(SpringPackage.Literals.DEFAULTABLE_BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAutowireType createDefaultAutowireTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultAutowireTypeFromString(SpringPackage.Literals.DEFAULT_AUTOWIRE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultAutowireTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultAutowireTypeToString(SpringPackage.Literals.DEFAULT_AUTOWIRE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDependencyCheckType createDefaultDependencyCheckTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultDependencyCheckTypeFromString(SpringPackage.Literals.DEFAULT_DEPENDENCY_CHECK_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultDependencyCheckTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultDependencyCheckTypeToString(SpringPackage.Literals.DEFAULT_DEPENDENCY_CHECK_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyCheckType createDependencyCheckTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDependencyCheckTypeFromString(SpringPackage.Literals.DEPENDENCY_CHECK_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependencyCheckTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDependencyCheckTypeToString(SpringPackage.Literals.DEPENDENCY_CHECK_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringPackage getSpringPackage() {
		return (SpringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpringPackage getPackage() {
		return SpringPackage.eINSTANCE;
	}

} //SpringFactoryImpl
