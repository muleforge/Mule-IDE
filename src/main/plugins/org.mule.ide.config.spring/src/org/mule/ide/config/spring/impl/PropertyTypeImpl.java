/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.DescriptionType;
import org.mule.ide.config.spring.IdrefType;
import org.mule.ide.config.spring.ListOrSetType;
import org.mule.ide.config.spring.MapType;
import org.mule.ide.config.spring.MetaType;
import org.mule.ide.config.spring.NullType;
import org.mule.ide.config.spring.PropertyType;
import org.mule.ide.config.spring.PropsType;
import org.mule.ide.config.spring.RefType;
import org.mule.ide.config.spring.SpringPackage;
import org.mule.ide.config.spring.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getProps <em>Props</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.PropertyTypeImpl#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyTypeImpl extends EObjectImpl implements PropertyType {
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
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected MetaType meta;

	/**
	 * The cached value of the '{@link #getBean() <em>Bean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected BeanType bean;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected RefType ref;

	/**
	 * The cached value of the '{@link #getIdref() <em>Idref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdref()
	 * @generated
	 * @ordered
	 */
	protected IdrefType idref;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueType value;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected NullType null_;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected ListOrSetType list;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected ListOrSetType set;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected MapType map;

	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected PropsType props;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	 * The default value of the '{@link #getRef1() <em>Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef1()
	 * @generated
	 * @ordered
	 */
	protected static final String REF1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef1() <em>Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef1()
	 * @generated
	 * @ordered
	 */
	protected String ref1 = REF1_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected String value1 = VALUE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.PROPERTY_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaType getMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeta(MetaType newMeta, NotificationChain msgs) {
		MetaType oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__META, oldMeta, newMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(MetaType newMeta) {
		if (newMeta != meta) {
			NotificationChain msgs = null;
			if (meta != null)
				msgs = ((InternalEObject)meta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__META, null, msgs);
			if (newMeta != null)
				msgs = ((InternalEObject)newMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__META, null, msgs);
			msgs = basicSetMeta(newMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__META, newMeta, newMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanType getBean() {
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBean(BeanType newBean, NotificationChain msgs) {
		BeanType oldBean = bean;
		bean = newBean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__BEAN, oldBean, newBean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBean(BeanType newBean) {
		if (newBean != bean) {
			NotificationChain msgs = null;
			if (bean != null)
				msgs = ((InternalEObject)bean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__BEAN, null, msgs);
			if (newBean != null)
				msgs = ((InternalEObject)newBean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__BEAN, null, msgs);
			msgs = basicSetBean(newBean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__BEAN, newBean, newBean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefType getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRef(RefType newRef, NotificationChain msgs) {
		RefType oldRef = ref;
		ref = newRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__REF, oldRef, newRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(RefType newRef) {
		if (newRef != ref) {
			NotificationChain msgs = null;
			if (ref != null)
				msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__REF, null, msgs);
			if (newRef != null)
				msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__REF, null, msgs);
			msgs = basicSetRef(newRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__REF, newRef, newRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdrefType getIdref() {
		return idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdref(IdrefType newIdref, NotificationChain msgs) {
		IdrefType oldIdref = idref;
		idref = newIdref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__IDREF, oldIdref, newIdref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdref(IdrefType newIdref) {
		if (newIdref != idref) {
			NotificationChain msgs = null;
			if (idref != null)
				msgs = ((InternalEObject)idref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__IDREF, null, msgs);
			if (newIdref != null)
				msgs = ((InternalEObject)newIdref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__IDREF, null, msgs);
			msgs = basicSetIdref(newIdref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__IDREF, newIdref, newIdref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
		ValueType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullType getNull() {
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNull(NullType newNull, NotificationChain msgs) {
		NullType oldNull = null_;
		null_ = newNull;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__NULL, oldNull, newNull);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNull(NullType newNull) {
		if (newNull != null_) {
			NotificationChain msgs = null;
			if (null_ != null)
				msgs = ((InternalEObject)null_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__NULL, null, msgs);
			if (newNull != null)
				msgs = ((InternalEObject)newNull).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__NULL, null, msgs);
			msgs = basicSetNull(newNull, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__NULL, newNull, newNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrSetType getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListOrSetType newList, NotificationChain msgs) {
		ListOrSetType oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(ListOrSetType newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrSetType getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(ListOrSetType newSet, NotificationChain msgs) {
		ListOrSetType oldSet = set;
		set = newSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__SET, oldSet, newSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(ListOrSetType newSet) {
		if (newSet != set) {
			NotificationChain msgs = null;
			if (set != null)
				msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__SET, null, msgs);
			if (newSet != null)
				msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__SET, null, msgs);
			msgs = basicSetSet(newSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__SET, newSet, newSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(MapType newMap, NotificationChain msgs) {
		MapType oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__MAP, oldMap, newMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(MapType newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__MAP, null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__MAP, null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropsType getProps() {
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProps(PropsType newProps, NotificationChain msgs) {
		PropsType oldProps = props;
		props = newProps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__PROPS, oldProps, newProps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProps(PropsType newProps) {
		if (newProps != props) {
			NotificationChain msgs = null;
			if (props != null)
				msgs = ((InternalEObject)props).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__PROPS, null, msgs);
			if (newProps != null)
				msgs = ((InternalEObject)newProps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.PROPERTY_TYPE__PROPS, null, msgs);
			msgs = basicSetProps(newProps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__PROPS, newProps, newProps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, SpringPackage.PROPERTY_TYPE__ANY);
		}
		return any;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef1() {
		return ref1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef1(String newRef1) {
		String oldRef1 = ref1;
		ref1 = newRef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__REF1, oldRef1, ref1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue1() {
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1(String newValue1) {
		String oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROPERTY_TYPE__VALUE1, oldValue1, value1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.PROPERTY_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case SpringPackage.PROPERTY_TYPE__META:
				return basicSetMeta(null, msgs);
			case SpringPackage.PROPERTY_TYPE__BEAN:
				return basicSetBean(null, msgs);
			case SpringPackage.PROPERTY_TYPE__REF:
				return basicSetRef(null, msgs);
			case SpringPackage.PROPERTY_TYPE__IDREF:
				return basicSetIdref(null, msgs);
			case SpringPackage.PROPERTY_TYPE__VALUE:
				return basicSetValue(null, msgs);
			case SpringPackage.PROPERTY_TYPE__NULL:
				return basicSetNull(null, msgs);
			case SpringPackage.PROPERTY_TYPE__LIST:
				return basicSetList(null, msgs);
			case SpringPackage.PROPERTY_TYPE__SET:
				return basicSetSet(null, msgs);
			case SpringPackage.PROPERTY_TYPE__MAP:
				return basicSetMap(null, msgs);
			case SpringPackage.PROPERTY_TYPE__PROPS:
				return basicSetProps(null, msgs);
			case SpringPackage.PROPERTY_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.PROPERTY_TYPE__DESCRIPTION:
				return getDescription();
			case SpringPackage.PROPERTY_TYPE__META:
				return getMeta();
			case SpringPackage.PROPERTY_TYPE__BEAN:
				return getBean();
			case SpringPackage.PROPERTY_TYPE__REF:
				return getRef();
			case SpringPackage.PROPERTY_TYPE__IDREF:
				return getIdref();
			case SpringPackage.PROPERTY_TYPE__VALUE:
				return getValue();
			case SpringPackage.PROPERTY_TYPE__NULL:
				return getNull();
			case SpringPackage.PROPERTY_TYPE__LIST:
				return getList();
			case SpringPackage.PROPERTY_TYPE__SET:
				return getSet();
			case SpringPackage.PROPERTY_TYPE__MAP:
				return getMap();
			case SpringPackage.PROPERTY_TYPE__PROPS:
				return getProps();
			case SpringPackage.PROPERTY_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpringPackage.PROPERTY_TYPE__NAME:
				return getName();
			case SpringPackage.PROPERTY_TYPE__REF1:
				return getRef1();
			case SpringPackage.PROPERTY_TYPE__VALUE1:
				return getValue1();
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
			case SpringPackage.PROPERTY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__META:
				setMeta((MetaType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__BEAN:
				setBean((BeanType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__REF:
				setRef((RefType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__IDREF:
				setIdref((IdrefType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__VALUE:
				setValue((ValueType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__NULL:
				setNull((NullType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__LIST:
				setList((ListOrSetType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__SET:
				setSet((ListOrSetType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__MAP:
				setMap((MapType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__PROPS:
				setProps((PropsType)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__NAME:
				setName((String)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__REF1:
				setRef1((String)newValue);
				return;
			case SpringPackage.PROPERTY_TYPE__VALUE1:
				setValue1((String)newValue);
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
			case SpringPackage.PROPERTY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__META:
				setMeta((MetaType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__BEAN:
				setBean((BeanType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__REF:
				setRef((RefType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__IDREF:
				setIdref((IdrefType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__VALUE:
				setValue((ValueType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__NULL:
				setNull((NullType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__LIST:
				setList((ListOrSetType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__SET:
				setSet((ListOrSetType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__MAP:
				setMap((MapType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__PROPS:
				setProps((PropsType)null);
				return;
			case SpringPackage.PROPERTY_TYPE__ANY:
				getAny().clear();
				return;
			case SpringPackage.PROPERTY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpringPackage.PROPERTY_TYPE__REF1:
				setRef1(REF1_EDEFAULT);
				return;
			case SpringPackage.PROPERTY_TYPE__VALUE1:
				setValue1(VALUE1_EDEFAULT);
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
			case SpringPackage.PROPERTY_TYPE__DESCRIPTION:
				return description != null;
			case SpringPackage.PROPERTY_TYPE__META:
				return meta != null;
			case SpringPackage.PROPERTY_TYPE__BEAN:
				return bean != null;
			case SpringPackage.PROPERTY_TYPE__REF:
				return ref != null;
			case SpringPackage.PROPERTY_TYPE__IDREF:
				return idref != null;
			case SpringPackage.PROPERTY_TYPE__VALUE:
				return value != null;
			case SpringPackage.PROPERTY_TYPE__NULL:
				return null_ != null;
			case SpringPackage.PROPERTY_TYPE__LIST:
				return list != null;
			case SpringPackage.PROPERTY_TYPE__SET:
				return set != null;
			case SpringPackage.PROPERTY_TYPE__MAP:
				return map != null;
			case SpringPackage.PROPERTY_TYPE__PROPS:
				return props != null;
			case SpringPackage.PROPERTY_TYPE__ANY:
				return any != null && !any.isEmpty();
			case SpringPackage.PROPERTY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpringPackage.PROPERTY_TYPE__REF1:
				return REF1_EDEFAULT == null ? ref1 != null : !REF1_EDEFAULT.equals(ref1);
			case SpringPackage.PROPERTY_TYPE__VALUE1:
				return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
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
		result.append(" (any: ");
		result.append(any);
		result.append(", name: ");
		result.append(name);
		result.append(", ref1: ");
		result.append(ref1);
		result.append(", value1: ");
		result.append(value1);
		result.append(')');
		return result.toString();
	}

} //PropertyTypeImpl
