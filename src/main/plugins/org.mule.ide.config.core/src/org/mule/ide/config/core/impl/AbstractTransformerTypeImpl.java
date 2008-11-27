/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Transformer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractTransformerTypeImpl#isIgnoreBadInput <em>Ignore Bad Input</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractTransformerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.AbstractTransformerTypeImpl#getReturnClass <em>Return Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractTransformerTypeImpl extends EObjectImpl implements AbstractTransformerType {
	/**
	 * The default value of the '{@link #isIgnoreBadInput() <em>Ignore Bad Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreBadInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_BAD_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreBadInput() <em>Ignore Bad Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreBadInput()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreBadInput = IGNORE_BAD_INPUT_EDEFAULT;

	/**
	 * This is true if the Ignore Bad Input attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreBadInputESet;

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
	 * The default value of the '{@link #getReturnClass() <em>Return Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnClass()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnClass() <em>Return Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnClass()
	 * @generated
	 * @ordered
	 */
	protected String returnClass = RETURN_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTransformerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAbstractTransformerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreBadInput() {
		return ignoreBadInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreBadInput(boolean newIgnoreBadInput) {
		boolean oldIgnoreBadInput = ignoreBadInput;
		ignoreBadInput = newIgnoreBadInput;
		boolean oldIgnoreBadInputESet = ignoreBadInputESet;
		ignoreBadInputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT, oldIgnoreBadInput, ignoreBadInput, !oldIgnoreBadInputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreBadInput() {
		boolean oldIgnoreBadInput = ignoreBadInput;
		boolean oldIgnoreBadInputESet = ignoreBadInputESet;
		ignoreBadInput = IGNORE_BAD_INPUT_EDEFAULT;
		ignoreBadInputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT, oldIgnoreBadInput, IGNORE_BAD_INPUT_EDEFAULT, oldIgnoreBadInputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreBadInput() {
		return ignoreBadInputESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_TRANSFORMER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnClass() {
		return returnClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnClass(String newReturnClass) {
		String oldReturnClass = returnClass;
		returnClass = newReturnClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS, oldReturnClass, returnClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT:
				return isIgnoreBadInput() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__NAME:
				return getName();
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS:
				return getReturnClass();
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
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT:
				setIgnoreBadInput(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS:
				setReturnClass((String)newValue);
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
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT:
				unsetIgnoreBadInput();
				return;
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS:
				setReturnClass(RETURN_CLASS_EDEFAULT);
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
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__IGNORE_BAD_INPUT:
				return isSetIgnoreBadInput();
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE__RETURN_CLASS:
				return RETURN_CLASS_EDEFAULT == null ? returnClass != null : !RETURN_CLASS_EDEFAULT.equals(returnClass);
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
		result.append(" (ignoreBadInput: ");
		if (ignoreBadInputESet) result.append(ignoreBadInput); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", returnClass: ");
		result.append(returnClass);
		result.append(')');
		return result.toString();
	}

} //AbstractTransformerTypeImpl
