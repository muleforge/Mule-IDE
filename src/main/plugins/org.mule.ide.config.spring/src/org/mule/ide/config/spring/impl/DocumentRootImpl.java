/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.spring.AliasType;
import org.mule.ide.config.spring.ArgTypeType;
import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.BeansType;
import org.mule.ide.config.spring.ConstructorArgType;
import org.mule.ide.config.spring.DescriptionType;
import org.mule.ide.config.spring.DocumentRoot;
import org.mule.ide.config.spring.EntryType;
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
import org.mule.ide.config.spring.SpringPackage;
import org.mule.ide.config.spring.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getBeans <em>Beans</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getConstructorArg <em>Constructor Arg</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getLookupMethod <em>Lookup Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getProps <em>Props</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getReplacedMethod <em>Replaced Method</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpringPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasType getAlias() {
		return (AliasType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__ALIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias(AliasType newAlias, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__ALIAS, newAlias, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(AliasType newAlias) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__ALIAS, newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgTypeType getArgType() {
		return (ArgTypeType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgType(ArgTypeType newArgType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE, newArgType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgType(ArgTypeType newArgType) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE, newArgType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanType getBean() {
		return (BeanType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__BEAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBean(BeanType newBean, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__BEAN, newBean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBean(BeanType newBean) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__BEAN, newBean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeansType getBeans() {
		return (BeansType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__BEANS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeans(BeansType newBeans, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__BEANS, newBeans, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeans(BeansType newBeans) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__BEANS, newBeans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorArgType getConstructorArg() {
		return (ConstructorArgType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructorArg(ConstructorArgType newConstructorArg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG, newConstructorArg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructorArg(ConstructorArgType newConstructorArg) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG, newConstructorArg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType getEntry() {
		return (EntryType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(EntryType newEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__ENTRY, newEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(EntryType newEntry) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__ENTRY, newEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdrefType getIdref() {
		return (IdrefType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__IDREF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdref(IdrefType newIdref, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__IDREF, newIdref, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdref(IdrefType newIdref) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__IDREF, newIdref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType getImport() {
		return (ImportType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(ImportType newImport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(ImportType newImport) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType getKey() {
		return (KeyType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(KeyType newKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__KEY, newKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(KeyType newKey) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrSetType getList() {
		return (ListOrSetType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListOrSetType newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__LIST, newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(ListOrSetType newList) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMethodType getLookupMethod() {
		return (LookupMethodType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookupMethod(LookupMethodType newLookupMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD, newLookupMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookupMethod(LookupMethodType newLookupMethod) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD, newLookupMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMap() {
		return (MapType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__MAP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(MapType newMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__MAP, newMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(MapType newMap) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__MAP, newMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaType getMeta() {
		return (MetaType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__META, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeta(MetaType newMeta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__META, newMeta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(MetaType newMeta) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__META, newMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullType getNull() {
		return (NullType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__NULL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNull(NullType newNull, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__NULL, newNull, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNull(NullType newNull) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__NULL, newNull);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropType getProp() {
		return (PropType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__PROP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProp(PropType newProp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__PROP, newProp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProp(PropType newProp) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__PROP, newProp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropsType getProps() {
		return (PropsType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__PROPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProps(PropsType newProps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__PROPS, newProps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProps(PropsType newProps) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__PROPS, newProps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefType getRef() {
		return (RefType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRef(RefType newRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__REF, newRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(RefType newRef) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__REF, newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplacedMethodType getReplacedMethod() {
		return (ReplacedMethodType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplacedMethod(ReplacedMethodType newReplacedMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD, newReplacedMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedMethod(ReplacedMethodType newReplacedMethod) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD, newReplacedMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrSetType getSet() {
		return (ListOrSetType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(ListOrSetType newSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__SET, newSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(ListOrSetType newSet) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__SET, newSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValue() {
		return (ValueType)getMixed().get(SpringPackage.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.Literals.DOCUMENT_ROOT__VALUE, newValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueType newValue) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SpringPackage.DOCUMENT_ROOT__ALIAS:
				return basicSetAlias(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ARG_TYPE:
				return basicSetArgType(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				return basicSetBean(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__BEANS:
				return basicSetBeans(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CONSTRUCTOR_ARG:
				return basicSetConstructorArg(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ENTRY:
				return basicSetEntry(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__IDREF:
				return basicSetIdref(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__KEY:
				return basicSetKey(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__LOOKUP_METHOD:
				return basicSetLookupMethod(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__MAP:
				return basicSetMap(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__META:
				return basicSetMeta(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__NULL:
				return basicSetNull(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROP:
				return basicSetProp(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROPS:
				return basicSetProps(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REF:
				return basicSetRef(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REPLACED_METHOD:
				return basicSetReplacedMethod(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SET:
				return basicSetSet(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__VALUE:
				return basicSetValue(null, msgs);
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
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SpringPackage.DOCUMENT_ROOT__ALIAS:
				return getAlias();
			case SpringPackage.DOCUMENT_ROOT__ARG_TYPE:
				return getArgType();
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				return getBean();
			case SpringPackage.DOCUMENT_ROOT__BEANS:
				return getBeans();
			case SpringPackage.DOCUMENT_ROOT__CONSTRUCTOR_ARG:
				return getConstructorArg();
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case SpringPackage.DOCUMENT_ROOT__ENTRY:
				return getEntry();
			case SpringPackage.DOCUMENT_ROOT__IDREF:
				return getIdref();
			case SpringPackage.DOCUMENT_ROOT__IMPORT:
				return getImport();
			case SpringPackage.DOCUMENT_ROOT__KEY:
				return getKey();
			case SpringPackage.DOCUMENT_ROOT__LIST:
				return getList();
			case SpringPackage.DOCUMENT_ROOT__LOOKUP_METHOD:
				return getLookupMethod();
			case SpringPackage.DOCUMENT_ROOT__MAP:
				return getMap();
			case SpringPackage.DOCUMENT_ROOT__META:
				return getMeta();
			case SpringPackage.DOCUMENT_ROOT__NULL:
				return getNull();
			case SpringPackage.DOCUMENT_ROOT__PROP:
				return getProp();
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case SpringPackage.DOCUMENT_ROOT__PROPS:
				return getProps();
			case SpringPackage.DOCUMENT_ROOT__REF:
				return getRef();
			case SpringPackage.DOCUMENT_ROOT__REPLACED_METHOD:
				return getReplacedMethod();
			case SpringPackage.DOCUMENT_ROOT__SET:
				return getSet();
			case SpringPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ALIAS:
				setAlias((AliasType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ARG_TYPE:
				setArgType((ArgTypeType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				setBean((BeanType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEANS:
				setBeans((BeansType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONSTRUCTOR_ARG:
				setConstructorArg((ConstructorArgType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ENTRY:
				setEntry((EntryType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__IDREF:
				setIdref((IdrefType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__IMPORT:
				setImport((ImportType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__KEY:
				setKey((KeyType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__LIST:
				setList((ListOrSetType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOOKUP_METHOD:
				setLookupMethod((LookupMethodType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__MAP:
				setMap((MapType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__META:
				setMeta((MetaType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__NULL:
				setNull((NullType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROP:
				setProp((PropType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPS:
				setProps((PropsType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REF:
				setRef((RefType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REPLACED_METHOD:
				setReplacedMethod((ReplacedMethodType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET:
				setSet((ListOrSetType)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__VALUE:
				setValue((ValueType)newValue);
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
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SpringPackage.DOCUMENT_ROOT__ALIAS:
				setAlias((AliasType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ARG_TYPE:
				setArgType((ArgTypeType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				setBean((BeanType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEANS:
				setBeans((BeansType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONSTRUCTOR_ARG:
				setConstructorArg((ConstructorArgType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ENTRY:
				setEntry((EntryType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__IDREF:
				setIdref((IdrefType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__IMPORT:
				setImport((ImportType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__KEY:
				setKey((KeyType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__LIST:
				setList((ListOrSetType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOOKUP_METHOD:
				setLookupMethod((LookupMethodType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__MAP:
				setMap((MapType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__META:
				setMeta((MetaType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__NULL:
				setNull((NullType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROP:
				setProp((PropType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPS:
				setProps((PropsType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REF:
				setRef((RefType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REPLACED_METHOD:
				setReplacedMethod((ReplacedMethodType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET:
				setSet((ListOrSetType)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__VALUE:
				setValue((ValueType)null);
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
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SpringPackage.DOCUMENT_ROOT__ALIAS:
				return getAlias() != null;
			case SpringPackage.DOCUMENT_ROOT__ARG_TYPE:
				return getArgType() != null;
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				return getBean() != null;
			case SpringPackage.DOCUMENT_ROOT__BEANS:
				return getBeans() != null;
			case SpringPackage.DOCUMENT_ROOT__CONSTRUCTOR_ARG:
				return getConstructorArg() != null;
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case SpringPackage.DOCUMENT_ROOT__ENTRY:
				return getEntry() != null;
			case SpringPackage.DOCUMENT_ROOT__IDREF:
				return getIdref() != null;
			case SpringPackage.DOCUMENT_ROOT__IMPORT:
				return getImport() != null;
			case SpringPackage.DOCUMENT_ROOT__KEY:
				return getKey() != null;
			case SpringPackage.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case SpringPackage.DOCUMENT_ROOT__LOOKUP_METHOD:
				return getLookupMethod() != null;
			case SpringPackage.DOCUMENT_ROOT__MAP:
				return getMap() != null;
			case SpringPackage.DOCUMENT_ROOT__META:
				return getMeta() != null;
			case SpringPackage.DOCUMENT_ROOT__NULL:
				return getNull() != null;
			case SpringPackage.DOCUMENT_ROOT__PROP:
				return getProp() != null;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case SpringPackage.DOCUMENT_ROOT__PROPS:
				return getProps() != null;
			case SpringPackage.DOCUMENT_ROOT__REF:
				return getRef() != null;
			case SpringPackage.DOCUMENT_ROOT__REPLACED_METHOD:
				return getReplacedMethod() != null;
			case SpringPackage.DOCUMENT_ROOT__SET:
				return getSet() != null;
			case SpringPackage.DOCUMENT_ROOT__VALUE:
				return getValue() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
