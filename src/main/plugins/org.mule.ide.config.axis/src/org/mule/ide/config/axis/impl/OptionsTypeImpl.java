/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.OptionsType;

import org.mule.ide.config.core.KeyValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getAllowedMethods <em>Allowed Methods</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getExtraClasses <em>Extra Classes</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getWsdlInputSchema <em>Wsdl Input Schema</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getWsdlPortType <em>Wsdl Port Type</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getWsdlServiceElement <em>Wsdl Service Element</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getWsdlServicePort <em>Wsdl Service Port</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getWsdlSoapActionMode <em>Wsdl Soap Action Mode</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.OptionsTypeImpl#getWsdlTargetNamespace <em>Wsdl Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionsTypeImpl extends EObjectImpl implements OptionsType {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueType> option;

	/**
	 * The default value of the '{@link #getAllowedMethods() <em>Allowed Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_METHODS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedMethods() <em>Allowed Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods()
	 * @generated
	 * @ordered
	 */
	protected String allowedMethods = ALLOWED_METHODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraClasses() <em>Extra Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraClasses()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_CLASSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraClasses() <em>Extra Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraClasses()
	 * @generated
	 * @ordered
	 */
	protected String extraClasses = EXTRA_CLASSES_EDEFAULT;

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
	 * The default value of the '{@link #getWsdlInputSchema() <em>Wsdl Input Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlInputSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_INPUT_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlInputSchema() <em>Wsdl Input Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlInputSchema()
	 * @generated
	 * @ordered
	 */
	protected String wsdlInputSchema = WSDL_INPUT_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlPortType() <em>Wsdl Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlPortType()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlPortType() <em>Wsdl Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlPortType()
	 * @generated
	 * @ordered
	 */
	protected String wsdlPortType = WSDL_PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlServiceElement() <em>Wsdl Service Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlServiceElement()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_SERVICE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlServiceElement() <em>Wsdl Service Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlServiceElement()
	 * @generated
	 * @ordered
	 */
	protected String wsdlServiceElement = WSDL_SERVICE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlServicePort() <em>Wsdl Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlServicePort()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_SERVICE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlServicePort() <em>Wsdl Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlServicePort()
	 * @generated
	 * @ordered
	 */
	protected String wsdlServicePort = WSDL_SERVICE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlSoapActionMode() <em>Wsdl Soap Action Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlSoapActionMode()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_SOAP_ACTION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlSoapActionMode() <em>Wsdl Soap Action Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlSoapActionMode()
	 * @generated
	 * @ordered
	 */
	protected String wsdlSoapActionMode = WSDL_SOAP_ACTION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlTargetNamespace() <em>Wsdl Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlTargetNamespace() <em>Wsdl Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String wsdlTargetNamespace = WSDL_TARGET_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxisPackage.Literals.OPTIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueType> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<KeyValueType>(KeyValueType.class, this, AxisPackage.OPTIONS_TYPE__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedMethods() {
		return allowedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedMethods(String newAllowedMethods) {
		String oldAllowedMethods = allowedMethods;
		allowedMethods = newAllowedMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__ALLOWED_METHODS, oldAllowedMethods, allowedMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtraClasses() {
		return extraClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraClasses(String newExtraClasses) {
		String oldExtraClasses = extraClasses;
		extraClasses = newExtraClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__EXTRA_CLASSES, oldExtraClasses, extraClasses));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlInputSchema() {
		return wsdlInputSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlInputSchema(String newWsdlInputSchema) {
		String oldWsdlInputSchema = wsdlInputSchema;
		wsdlInputSchema = newWsdlInputSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__WSDL_INPUT_SCHEMA, oldWsdlInputSchema, wsdlInputSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlPortType() {
		return wsdlPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlPortType(String newWsdlPortType) {
		String oldWsdlPortType = wsdlPortType;
		wsdlPortType = newWsdlPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__WSDL_PORT_TYPE, oldWsdlPortType, wsdlPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlServiceElement() {
		return wsdlServiceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlServiceElement(String newWsdlServiceElement) {
		String oldWsdlServiceElement = wsdlServiceElement;
		wsdlServiceElement = newWsdlServiceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_ELEMENT, oldWsdlServiceElement, wsdlServiceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlServicePort() {
		return wsdlServicePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlServicePort(String newWsdlServicePort) {
		String oldWsdlServicePort = wsdlServicePort;
		wsdlServicePort = newWsdlServicePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_PORT, oldWsdlServicePort, wsdlServicePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlSoapActionMode() {
		return wsdlSoapActionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlSoapActionMode(String newWsdlSoapActionMode) {
		String oldWsdlSoapActionMode = wsdlSoapActionMode;
		wsdlSoapActionMode = newWsdlSoapActionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE, oldWsdlSoapActionMode, wsdlSoapActionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlTargetNamespace() {
		return wsdlTargetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlTargetNamespace(String newWsdlTargetNamespace) {
		String oldWsdlTargetNamespace = wsdlTargetNamespace;
		wsdlTargetNamespace = newWsdlTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.OPTIONS_TYPE__WSDL_TARGET_NAMESPACE, oldWsdlTargetNamespace, wsdlTargetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxisPackage.OPTIONS_TYPE__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
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
			case AxisPackage.OPTIONS_TYPE__OPTION:
				return getOption();
			case AxisPackage.OPTIONS_TYPE__ALLOWED_METHODS:
				return getAllowedMethods();
			case AxisPackage.OPTIONS_TYPE__EXTRA_CLASSES:
				return getExtraClasses();
			case AxisPackage.OPTIONS_TYPE__SCOPE:
				return getScope();
			case AxisPackage.OPTIONS_TYPE__WSDL_INPUT_SCHEMA:
				return getWsdlInputSchema();
			case AxisPackage.OPTIONS_TYPE__WSDL_PORT_TYPE:
				return getWsdlPortType();
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_ELEMENT:
				return getWsdlServiceElement();
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_PORT:
				return getWsdlServicePort();
			case AxisPackage.OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE:
				return getWsdlSoapActionMode();
			case AxisPackage.OPTIONS_TYPE__WSDL_TARGET_NAMESPACE:
				return getWsdlTargetNamespace();
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
			case AxisPackage.OPTIONS_TYPE__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends KeyValueType>)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__ALLOWED_METHODS:
				setAllowedMethods((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__EXTRA_CLASSES:
				setExtraClasses((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__SCOPE:
				setScope((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_INPUT_SCHEMA:
				setWsdlInputSchema((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_PORT_TYPE:
				setWsdlPortType((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_ELEMENT:
				setWsdlServiceElement((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_PORT:
				setWsdlServicePort((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE:
				setWsdlSoapActionMode((String)newValue);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_TARGET_NAMESPACE:
				setWsdlTargetNamespace((String)newValue);
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
			case AxisPackage.OPTIONS_TYPE__OPTION:
				getOption().clear();
				return;
			case AxisPackage.OPTIONS_TYPE__ALLOWED_METHODS:
				setAllowedMethods(ALLOWED_METHODS_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__EXTRA_CLASSES:
				setExtraClasses(EXTRA_CLASSES_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_INPUT_SCHEMA:
				setWsdlInputSchema(WSDL_INPUT_SCHEMA_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_PORT_TYPE:
				setWsdlPortType(WSDL_PORT_TYPE_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_ELEMENT:
				setWsdlServiceElement(WSDL_SERVICE_ELEMENT_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_PORT:
				setWsdlServicePort(WSDL_SERVICE_PORT_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE:
				setWsdlSoapActionMode(WSDL_SOAP_ACTION_MODE_EDEFAULT);
				return;
			case AxisPackage.OPTIONS_TYPE__WSDL_TARGET_NAMESPACE:
				setWsdlTargetNamespace(WSDL_TARGET_NAMESPACE_EDEFAULT);
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
			case AxisPackage.OPTIONS_TYPE__OPTION:
				return option != null && !option.isEmpty();
			case AxisPackage.OPTIONS_TYPE__ALLOWED_METHODS:
				return ALLOWED_METHODS_EDEFAULT == null ? allowedMethods != null : !ALLOWED_METHODS_EDEFAULT.equals(allowedMethods);
			case AxisPackage.OPTIONS_TYPE__EXTRA_CLASSES:
				return EXTRA_CLASSES_EDEFAULT == null ? extraClasses != null : !EXTRA_CLASSES_EDEFAULT.equals(extraClasses);
			case AxisPackage.OPTIONS_TYPE__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case AxisPackage.OPTIONS_TYPE__WSDL_INPUT_SCHEMA:
				return WSDL_INPUT_SCHEMA_EDEFAULT == null ? wsdlInputSchema != null : !WSDL_INPUT_SCHEMA_EDEFAULT.equals(wsdlInputSchema);
			case AxisPackage.OPTIONS_TYPE__WSDL_PORT_TYPE:
				return WSDL_PORT_TYPE_EDEFAULT == null ? wsdlPortType != null : !WSDL_PORT_TYPE_EDEFAULT.equals(wsdlPortType);
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_ELEMENT:
				return WSDL_SERVICE_ELEMENT_EDEFAULT == null ? wsdlServiceElement != null : !WSDL_SERVICE_ELEMENT_EDEFAULT.equals(wsdlServiceElement);
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_PORT:
				return WSDL_SERVICE_PORT_EDEFAULT == null ? wsdlServicePort != null : !WSDL_SERVICE_PORT_EDEFAULT.equals(wsdlServicePort);
			case AxisPackage.OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE:
				return WSDL_SOAP_ACTION_MODE_EDEFAULT == null ? wsdlSoapActionMode != null : !WSDL_SOAP_ACTION_MODE_EDEFAULT.equals(wsdlSoapActionMode);
			case AxisPackage.OPTIONS_TYPE__WSDL_TARGET_NAMESPACE:
				return WSDL_TARGET_NAMESPACE_EDEFAULT == null ? wsdlTargetNamespace != null : !WSDL_TARGET_NAMESPACE_EDEFAULT.equals(wsdlTargetNamespace);
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
		result.append(" (allowedMethods: ");
		result.append(allowedMethods);
		result.append(", extraClasses: ");
		result.append(extraClasses);
		result.append(", scope: ");
		result.append(scope);
		result.append(", wsdlInputSchema: ");
		result.append(wsdlInputSchema);
		result.append(", wsdlPortType: ");
		result.append(wsdlPortType);
		result.append(", wsdlServiceElement: ");
		result.append(wsdlServiceElement);
		result.append(", wsdlServicePort: ");
		result.append(wsdlServicePort);
		result.append(", wsdlSoapActionMode: ");
		result.append(wsdlSoapActionMode);
		result.append(", wsdlTargetNamespace: ");
		result.append(wsdlTargetNamespace);
		result.append(')');
		return result.toString();
	}

} //OptionsTypeImpl
