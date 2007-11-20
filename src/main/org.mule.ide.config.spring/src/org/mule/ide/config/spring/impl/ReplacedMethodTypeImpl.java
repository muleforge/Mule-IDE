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

import org.mule.ide.config.spring.ArgTypeType;
import org.mule.ide.config.spring.ReplacedMethodType;
import org.mule.ide.config.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replaced Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.ReplacedMethodTypeImpl#getReplacer <em>Replacer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplacedMethodTypeImpl extends EObjectImpl implements ReplacedMethodType {
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
	 * The default value of the '{@link #getReplacer() <em>Replacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacer()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacer() <em>Replacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacer()
	 * @generated
	 * @ordered
	 */
	protected String replacer = REPLACER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplacedMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.REPLACED_METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SpringPackage.REPLACED_METHOD_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgTypeType> getArgType() {
		return getGroup().list(SpringPackage.Literals.REPLACED_METHOD_TYPE__ARG_TYPE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REPLACED_METHOD_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacer() {
		return replacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacer(String newReplacer) {
		String oldReplacer = replacer;
		replacer = newReplacer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REPLACED_METHOD_TYPE__REPLACER, oldReplacer, replacer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.REPLACED_METHOD_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpringPackage.REPLACED_METHOD_TYPE__ARG_TYPE:
				return ((InternalEList<?>)getArgType()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.REPLACED_METHOD_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpringPackage.REPLACED_METHOD_TYPE__ARG_TYPE:
				return getArgType();
			case SpringPackage.REPLACED_METHOD_TYPE__NAME:
				return getName();
			case SpringPackage.REPLACED_METHOD_TYPE__REPLACER:
				return getReplacer();
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
			case SpringPackage.REPLACED_METHOD_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpringPackage.REPLACED_METHOD_TYPE__ARG_TYPE:
				getArgType().clear();
				getArgType().addAll((Collection<? extends ArgTypeType>)newValue);
				return;
			case SpringPackage.REPLACED_METHOD_TYPE__NAME:
				setName((String)newValue);
				return;
			case SpringPackage.REPLACED_METHOD_TYPE__REPLACER:
				setReplacer((String)newValue);
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
			case SpringPackage.REPLACED_METHOD_TYPE__GROUP:
				getGroup().clear();
				return;
			case SpringPackage.REPLACED_METHOD_TYPE__ARG_TYPE:
				getArgType().clear();
				return;
			case SpringPackage.REPLACED_METHOD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpringPackage.REPLACED_METHOD_TYPE__REPLACER:
				setReplacer(REPLACER_EDEFAULT);
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
			case SpringPackage.REPLACED_METHOD_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SpringPackage.REPLACED_METHOD_TYPE__ARG_TYPE:
				return !getArgType().isEmpty();
			case SpringPackage.REPLACED_METHOD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpringPackage.REPLACED_METHOD_TYPE__REPLACER:
				return REPLACER_EDEFAULT == null ? replacer != null : !REPLACER_EDEFAULT.equals(replacer);
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
		result.append(", name: ");
		result.append(name);
		result.append(", replacer: ");
		result.append(replacer);
		result.append(')');
		return result.toString();
	}

} //ReplacedMethodTypeImpl
