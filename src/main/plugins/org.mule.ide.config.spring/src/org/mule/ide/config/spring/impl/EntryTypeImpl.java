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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.EntryType;
import org.mule.ide.config.spring.IdrefType;
import org.mule.ide.config.spring.KeyType;
import org.mule.ide.config.spring.ListOrSetType;
import org.mule.ide.config.spring.MapType;
import org.mule.ide.config.spring.NullType;
import org.mule.ide.config.spring.PropsType;
import org.mule.ide.config.spring.RefType;
import org.mule.ide.config.spring.SpringPackage;
import org.mule.ide.config.spring.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getProps <em>Props</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getKey1 <em>Key1</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getKeyRef <em>Key Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.EntryTypeImpl#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryTypeImpl extends EObjectImpl implements EntryType {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected KeyType key;

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
	 * The default value of the '{@link #getKey1() <em>Key1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey1() <em>Key1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1()
	 * @generated
	 * @ordered
	 */
	protected String key1 = KEY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyRef() <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyRef() <em>Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyRef()
	 * @generated
	 * @ordered
	 */
	protected String keyRef = KEY_REF_EDEFAULT;

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
	 * The default value of the '{@link #getValueRef() <em>Value Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected String valueRef = VALUE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(KeyType newKey, NotificationChain msgs) {
		KeyType oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ENTRY_TYPE__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(KeyType newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ENTRY_TYPE__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ENTRY_TYPE__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ENTRY_TYPE__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SpringPackage.ENTRY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanType> getBean() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__BEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefType> getRef() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdrefType> getIdref() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__IDREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueType> getValue() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NullType> getNull() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__NULL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListOrSetType> getList() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListOrSetType> getSet() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropsType> getProps() {
		return getGroup().list(SpringPackage.Literals.ENTRY_TYPE__PROPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SpringPackage.Literals.ENTRY_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey1() {
		return key1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey1(String newKey1) {
		String oldKey1 = key1;
		key1 = newKey1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ENTRY_TYPE__KEY1, oldKey1, key1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyRef() {
		return keyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyRef(String newKeyRef) {
		String oldKeyRef = keyRef;
		keyRef = newKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ENTRY_TYPE__KEY_REF, oldKeyRef, keyRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ENTRY_TYPE__VALUE1, oldValue1, value1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueRef() {
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRef(String newValueRef) {
		String oldValueRef = valueRef;
		valueRef = newValueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ENTRY_TYPE__VALUE_REF, oldValueRef, valueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.ENTRY_TYPE__KEY:
				return basicSetKey(null, msgs);
			case SpringPackage.ENTRY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__REF:
				return ((InternalEList<?>)getRef()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__IDREF:
				return ((InternalEList<?>)getIdref()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__NULL:
				return ((InternalEList<?>)getNull()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__SET:
				return ((InternalEList<?>)getSet()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
			case SpringPackage.ENTRY_TYPE__ANY:
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
			case SpringPackage.ENTRY_TYPE__KEY:
				return getKey();
			case SpringPackage.ENTRY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpringPackage.ENTRY_TYPE__BEAN:
				return getBean();
			case SpringPackage.ENTRY_TYPE__REF:
				return getRef();
			case SpringPackage.ENTRY_TYPE__IDREF:
				return getIdref();
			case SpringPackage.ENTRY_TYPE__VALUE:
				return getValue();
			case SpringPackage.ENTRY_TYPE__NULL:
				return getNull();
			case SpringPackage.ENTRY_TYPE__LIST:
				return getList();
			case SpringPackage.ENTRY_TYPE__SET:
				return getSet();
			case SpringPackage.ENTRY_TYPE__MAP:
				return getMap();
			case SpringPackage.ENTRY_TYPE__PROPS:
				return getProps();
			case SpringPackage.ENTRY_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpringPackage.ENTRY_TYPE__KEY1:
				return getKey1();
			case SpringPackage.ENTRY_TYPE__KEY_REF:
				return getKeyRef();
			case SpringPackage.ENTRY_TYPE__VALUE1:
				return getValue1();
			case SpringPackage.ENTRY_TYPE__VALUE_REF:
				return getValueRef();
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
			case SpringPackage.ENTRY_TYPE__KEY:
				setKey((KeyType)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpringPackage.ENTRY_TYPE__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__REF:
				getRef().clear();
				getRef().addAll((Collection<? extends RefType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__IDREF:
				getIdref().clear();
				getIdref().addAll((Collection<? extends IdrefType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends ValueType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__NULL:
				getNull().clear();
				getNull().addAll((Collection<? extends NullType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListOrSetType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__SET:
				getSet().clear();
				getSet().addAll((Collection<? extends ListOrSetType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends PropsType>)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpringPackage.ENTRY_TYPE__KEY1:
				setKey1((String)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__KEY_REF:
				setKeyRef((String)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__VALUE1:
				setValue1((String)newValue);
				return;
			case SpringPackage.ENTRY_TYPE__VALUE_REF:
				setValueRef((String)newValue);
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
			case SpringPackage.ENTRY_TYPE__KEY:
				setKey((KeyType)null);
				return;
			case SpringPackage.ENTRY_TYPE__GROUP:
				getGroup().clear();
				return;
			case SpringPackage.ENTRY_TYPE__BEAN:
				getBean().clear();
				return;
			case SpringPackage.ENTRY_TYPE__REF:
				getRef().clear();
				return;
			case SpringPackage.ENTRY_TYPE__IDREF:
				getIdref().clear();
				return;
			case SpringPackage.ENTRY_TYPE__VALUE:
				getValue().clear();
				return;
			case SpringPackage.ENTRY_TYPE__NULL:
				getNull().clear();
				return;
			case SpringPackage.ENTRY_TYPE__LIST:
				getList().clear();
				return;
			case SpringPackage.ENTRY_TYPE__SET:
				getSet().clear();
				return;
			case SpringPackage.ENTRY_TYPE__MAP:
				getMap().clear();
				return;
			case SpringPackage.ENTRY_TYPE__PROPS:
				getProps().clear();
				return;
			case SpringPackage.ENTRY_TYPE__ANY:
				getAny().clear();
				return;
			case SpringPackage.ENTRY_TYPE__KEY1:
				setKey1(KEY1_EDEFAULT);
				return;
			case SpringPackage.ENTRY_TYPE__KEY_REF:
				setKeyRef(KEY_REF_EDEFAULT);
				return;
			case SpringPackage.ENTRY_TYPE__VALUE1:
				setValue1(VALUE1_EDEFAULT);
				return;
			case SpringPackage.ENTRY_TYPE__VALUE_REF:
				setValueRef(VALUE_REF_EDEFAULT);
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
			case SpringPackage.ENTRY_TYPE__KEY:
				return key != null;
			case SpringPackage.ENTRY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SpringPackage.ENTRY_TYPE__BEAN:
				return !getBean().isEmpty();
			case SpringPackage.ENTRY_TYPE__REF:
				return !getRef().isEmpty();
			case SpringPackage.ENTRY_TYPE__IDREF:
				return !getIdref().isEmpty();
			case SpringPackage.ENTRY_TYPE__VALUE:
				return !getValue().isEmpty();
			case SpringPackage.ENTRY_TYPE__NULL:
				return !getNull().isEmpty();
			case SpringPackage.ENTRY_TYPE__LIST:
				return !getList().isEmpty();
			case SpringPackage.ENTRY_TYPE__SET:
				return !getSet().isEmpty();
			case SpringPackage.ENTRY_TYPE__MAP:
				return !getMap().isEmpty();
			case SpringPackage.ENTRY_TYPE__PROPS:
				return !getProps().isEmpty();
			case SpringPackage.ENTRY_TYPE__ANY:
				return !getAny().isEmpty();
			case SpringPackage.ENTRY_TYPE__KEY1:
				return KEY1_EDEFAULT == null ? key1 != null : !KEY1_EDEFAULT.equals(key1);
			case SpringPackage.ENTRY_TYPE__KEY_REF:
				return KEY_REF_EDEFAULT == null ? keyRef != null : !KEY_REF_EDEFAULT.equals(keyRef);
			case SpringPackage.ENTRY_TYPE__VALUE1:
				return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
			case SpringPackage.ENTRY_TYPE__VALUE_REF:
				return VALUE_REF_EDEFAULT == null ? valueRef != null : !VALUE_REF_EDEFAULT.equals(valueRef);
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
		result.append(", key1: ");
		result.append(key1);
		result.append(", keyRef: ");
		result.append(keyRef);
		result.append(", value1: ");
		result.append(value1);
		result.append(", valueRef: ");
		result.append(valueRef);
		result.append(')');
		return result.toString();
	}

} //EntryTypeImpl
