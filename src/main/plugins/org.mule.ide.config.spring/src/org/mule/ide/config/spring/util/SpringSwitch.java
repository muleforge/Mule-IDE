/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.spring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.spring.SpringPackage
 * @generated
 */
public class SpringSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringSwitch() {
		if (modelPackage == null) {
			modelPackage = SpringPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SpringPackage.ALIAS_TYPE: {
				AliasType aliasType = (AliasType)theEObject;
				T result = caseAliasType(aliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.ARG_TYPE_TYPE: {
				ArgTypeType argTypeType = (ArgTypeType)theEObject;
				T result = caseArgTypeType(argTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.BASE_COLLECTION_TYPE: {
				BaseCollectionType baseCollectionType = (BaseCollectionType)theEObject;
				T result = caseBaseCollectionType(baseCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.BEANS_TYPE: {
				BeansType beansType = (BeansType)theEObject;
				T result = caseBeansType(beansType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.BEAN_TYPE: {
				BeanType beanType = (BeanType)theEObject;
				T result = caseBeanType(beanType);
				if (result == null) result = caseIdentifiedType(beanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.CONSTRUCTOR_ARG_TYPE: {
				ConstructorArgType constructorArgType = (ConstructorArgType)theEObject;
				T result = caseConstructorArgType(constructorArgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.ENTRY_TYPE: {
				EntryType entryType = (EntryType)theEObject;
				T result = caseEntryType(entryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.IDENTIFIED_TYPE: {
				IdentifiedType identifiedType = (IdentifiedType)theEObject;
				T result = caseIdentifiedType(identifiedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.IDREF_TYPE: {
				IdrefType idrefType = (IdrefType)theEObject;
				T result = caseIdrefType(idrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.IMPORT_TYPE: {
				ImportType importType = (ImportType)theEObject;
				T result = caseImportType(importType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.KEY_TYPE: {
				KeyType keyType = (KeyType)theEObject;
				T result = caseKeyType(keyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.LIST_OR_SET_TYPE: {
				ListOrSetType listOrSetType = (ListOrSetType)theEObject;
				T result = caseListOrSetType(listOrSetType);
				if (result == null) result = caseTypedCollectionType(listOrSetType);
				if (result == null) result = caseBaseCollectionType(listOrSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.LOOKUP_METHOD_TYPE: {
				LookupMethodType lookupMethodType = (LookupMethodType)theEObject;
				T result = caseLookupMethodType(lookupMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.MAP_TYPE: {
				MapType mapType = (MapType)theEObject;
				T result = caseMapType(mapType);
				if (result == null) result = caseTypedCollectionType(mapType);
				if (result == null) result = caseBaseCollectionType(mapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.META_TYPE: {
				MetaType metaType = (MetaType)theEObject;
				T result = caseMetaType(metaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.NULL_TYPE: {
				NullType nullType = (NullType)theEObject;
				T result = caseNullType(nullType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.PROPS_TYPE: {
				PropsType propsType = (PropsType)theEObject;
				T result = casePropsType(propsType);
				if (result == null) result = caseBaseCollectionType(propsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.PROP_TYPE: {
				PropType propType = (PropType)theEObject;
				T result = casePropType(propType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.REF_TYPE: {
				RefType refType = (RefType)theEObject;
				T result = caseRefType(refType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.REPLACED_METHOD_TYPE: {
				ReplacedMethodType replacedMethodType = (ReplacedMethodType)theEObject;
				T result = caseReplacedMethodType(replacedMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.TYPED_COLLECTION_TYPE: {
				TypedCollectionType typedCollectionType = (TypedCollectionType)theEObject;
				T result = caseTypedCollectionType(typedCollectionType);
				if (result == null) result = caseBaseCollectionType(typedCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasType(AliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arg Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arg Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgTypeType(ArgTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseCollectionType(BaseCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beans Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beans Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeansType(BeansType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanType(BeanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Arg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Arg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorArgType(ConstructorArgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType(EntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedType(IdentifiedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdrefType(IdrefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportType(ImportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyType(KeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Or Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Or Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOrSetType(ListOrSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupMethodType(LookupMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapType(MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaType(MetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullType(NullType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Props Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Props Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropsType(PropsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prop Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prop Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropType(PropType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefType(RefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replaced Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replaced Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacedMethodType(ReplacedMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedCollectionType(TypedCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SpringSwitch
