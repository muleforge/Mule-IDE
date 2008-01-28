/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.spring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.spring.SpringPackage
 * @generated
 */
public class SpringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpringPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringSwitch<Adapter> modelSwitch =
		new SpringSwitch<Adapter>() {
			@Override
			public Adapter caseAliasType(AliasType object) {
				return createAliasTypeAdapter();
			}
			@Override
			public Adapter caseArgTypeType(ArgTypeType object) {
				return createArgTypeTypeAdapter();
			}
			@Override
			public Adapter caseBaseCollectionType(BaseCollectionType object) {
				return createBaseCollectionTypeAdapter();
			}
			@Override
			public Adapter caseBeansType(BeansType object) {
				return createBeansTypeAdapter();
			}
			@Override
			public Adapter caseBeanType(BeanType object) {
				return createBeanTypeAdapter();
			}
			@Override
			public Adapter caseConstructorArgType(ConstructorArgType object) {
				return createConstructorArgTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseIdentifiedType(IdentifiedType object) {
				return createIdentifiedTypeAdapter();
			}
			@Override
			public Adapter caseIdrefType(IdrefType object) {
				return createIdrefTypeAdapter();
			}
			@Override
			public Adapter caseImportType(ImportType object) {
				return createImportTypeAdapter();
			}
			@Override
			public Adapter caseKeyType(KeyType object) {
				return createKeyTypeAdapter();
			}
			@Override
			public Adapter caseListOrSetType(ListOrSetType object) {
				return createListOrSetTypeAdapter();
			}
			@Override
			public Adapter caseLookupMethodType(LookupMethodType object) {
				return createLookupMethodTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseMetaType(MetaType object) {
				return createMetaTypeAdapter();
			}
			@Override
			public Adapter caseNullType(NullType object) {
				return createNullTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter casePropsType(PropsType object) {
				return createPropsTypeAdapter();
			}
			@Override
			public Adapter casePropType(PropType object) {
				return createPropTypeAdapter();
			}
			@Override
			public Adapter caseRefType(RefType object) {
				return createRefTypeAdapter();
			}
			@Override
			public Adapter caseReplacedMethodType(ReplacedMethodType object) {
				return createReplacedMethodTypeAdapter();
			}
			@Override
			public Adapter caseTypedCollectionType(TypedCollectionType object) {
				return createTypedCollectionTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.AliasType
	 * @generated
	 */
	public Adapter createAliasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.ArgTypeType <em>Arg Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.ArgTypeType
	 * @generated
	 */
	public Adapter createArgTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.BaseCollectionType <em>Base Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.BaseCollectionType
	 * @generated
	 */
	public Adapter createBaseCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.BeansType <em>Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.BeansType
	 * @generated
	 */
	public Adapter createBeansTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.BeanType <em>Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.BeanType
	 * @generated
	 */
	public Adapter createBeanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.ConstructorArgType <em>Constructor Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.ConstructorArgType
	 * @generated
	 */
	public Adapter createConstructorArgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.IdentifiedType <em>Identified Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.IdentifiedType
	 * @generated
	 */
	public Adapter createIdentifiedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.IdrefType <em>Idref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.IdrefType
	 * @generated
	 */
	public Adapter createIdrefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.ImportType
	 * @generated
	 */
	public Adapter createImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.KeyType
	 * @generated
	 */
	public Adapter createKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.ListOrSetType <em>List Or Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.ListOrSetType
	 * @generated
	 */
	public Adapter createListOrSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.LookupMethodType <em>Lookup Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.LookupMethodType
	 * @generated
	 */
	public Adapter createLookupMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.MetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.MetaType
	 * @generated
	 */
	public Adapter createMetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.NullType <em>Null Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.NullType
	 * @generated
	 */
	public Adapter createNullTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.PropsType <em>Props Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.PropsType
	 * @generated
	 */
	public Adapter createPropsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.PropType <em>Prop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.PropType
	 * @generated
	 */
	public Adapter createPropTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.RefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.RefType
	 * @generated
	 */
	public Adapter createRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.ReplacedMethodType <em>Replaced Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.ReplacedMethodType
	 * @generated
	 */
	public Adapter createReplacedMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.TypedCollectionType <em>Typed Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.TypedCollectionType
	 * @generated
	 */
	public Adapter createTypedCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpringAdapterFactory
