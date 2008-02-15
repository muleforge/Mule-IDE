/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.PropertiesContainerContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Container Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.PropertiesContainerContextTypeImpl#isEnableTemplates <em>Enable Templates</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PropertiesContainerContextTypeImpl#isIncludeSystemProperties <em>Include System Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PropertiesContainerContextTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesContainerContextTypeImpl extends BaseContainerContextTypeImpl implements PropertiesContainerContextType {
	/**
	 * The default value of the '{@link #isEnableTemplates() <em>Enable Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableTemplates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_TEMPLATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableTemplates() <em>Enable Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableTemplates()
	 * @generated
	 * @ordered
	 */
	protected boolean enableTemplates = ENABLE_TEMPLATES_EDEFAULT;

	/**
	 * This is true if the Enable Templates attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableTemplatesESet;

	/**
	 * The default value of the '{@link #isIncludeSystemProperties() <em>Include System Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSystemProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SYSTEM_PROPERTIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeSystemProperties() <em>Include System Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSystemProperties()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSystemProperties = INCLUDE_SYSTEM_PROPERTIES_EDEFAULT;

	/**
	 * This is true if the Include System Properties attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeSystemPropertiesESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "properties";

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesContainerContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPropertiesContainerContextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableTemplates() {
		return enableTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableTemplates(boolean newEnableTemplates) {
		boolean oldEnableTemplates = enableTemplates;
		enableTemplates = newEnableTemplates;
		boolean oldEnableTemplatesESet = enableTemplatesESet;
		enableTemplatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__ENABLE_TEMPLATES, oldEnableTemplates, enableTemplates, !oldEnableTemplatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableTemplates() {
		boolean oldEnableTemplates = enableTemplates;
		boolean oldEnableTemplatesESet = enableTemplatesESet;
		enableTemplates = ENABLE_TEMPLATES_EDEFAULT;
		enableTemplatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__ENABLE_TEMPLATES, oldEnableTemplates, ENABLE_TEMPLATES_EDEFAULT, oldEnableTemplatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableTemplates() {
		return enableTemplatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeSystemProperties() {
		return includeSystemProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeSystemProperties(boolean newIncludeSystemProperties) {
		boolean oldIncludeSystemProperties = includeSystemProperties;
		includeSystemProperties = newIncludeSystemProperties;
		boolean oldIncludeSystemPropertiesESet = includeSystemPropertiesESet;
		includeSystemPropertiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__INCLUDE_SYSTEM_PROPERTIES, oldIncludeSystemProperties, includeSystemProperties, !oldIncludeSystemPropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeSystemProperties() {
		boolean oldIncludeSystemProperties = includeSystemProperties;
		boolean oldIncludeSystemPropertiesESet = includeSystemPropertiesESet;
		includeSystemProperties = INCLUDE_SYSTEM_PROPERTIES_EDEFAULT;
		includeSystemPropertiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__INCLUDE_SYSTEM_PROPERTIES, oldIncludeSystemProperties, INCLUDE_SYSTEM_PROPERTIES_EDEFAULT, oldIncludeSystemPropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeSystemProperties() {
		return includeSystemPropertiesESet;
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__ENABLE_TEMPLATES:
				return isEnableTemplates() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__INCLUDE_SYSTEM_PROPERTIES:
				return isIncludeSystemProperties() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__NAME:
				return getName();
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
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__ENABLE_TEMPLATES:
				setEnableTemplates(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__INCLUDE_SYSTEM_PROPERTIES:
				setIncludeSystemProperties(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__NAME:
				setName((String)newValue);
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
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__ENABLE_TEMPLATES:
				unsetEnableTemplates();
				return;
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__INCLUDE_SYSTEM_PROPERTIES:
				unsetIncludeSystemProperties();
				return;
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__NAME:
				unsetName();
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
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__ENABLE_TEMPLATES:
				return isSetEnableTemplates();
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__INCLUDE_SYSTEM_PROPERTIES:
				return isSetIncludeSystemProperties();
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE__NAME:
				return isSetName();
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
		result.append(" (enableTemplates: ");
		if (enableTemplatesESet) result.append(enableTemplates); else result.append("<unset>");
		result.append(", includeSystemProperties: ");
		if (includeSystemPropertiesESet) result.append(includeSystemProperties); else result.append("<unset>");
		result.append(", name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PropertiesContainerContextTypeImpl
