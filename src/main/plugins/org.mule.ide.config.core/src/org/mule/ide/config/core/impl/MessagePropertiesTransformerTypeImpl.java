/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.KeyType;
import org.mule.ide.config.core.KeyValueType;
import org.mule.ide.config.core.ListOrSetType;
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.MessagePropertiesTransformerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Properties Transformer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl#getDeleteMessageProperty <em>Delete Message Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl#getAddMessageProperty <em>Add Message Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl#getAddMessageProperties <em>Add Message Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl#isOverwrite <em>Overwrite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessagePropertiesTransformerTypeImpl extends AbstractTransformerTypeImpl implements MessagePropertiesTransformerType {
	/**
	 * The cached value of the '{@link #getDeleteMessageProperty() <em>Delete Message Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteMessageProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyType> deleteMessageProperty;

	/**
	 * The cached value of the '{@link #getAddMessageProperty() <em>Add Message Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddMessageProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueType> addMessageProperty;

	/**
	 * The cached value of the '{@link #getAddMessageProperties() <em>Add Message Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddMessageProperties()
	 * @generated
	 * @ordered
	 */
	protected MapType addMessageProperties;

	/**
	 * The default value of the '{@link #isOverwrite() <em>Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERWRITE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOverwrite() <em>Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwrite()
	 * @generated
	 * @ordered
	 */
	protected boolean overwrite = OVERWRITE_EDEFAULT;

	/**
	 * This is true if the Overwrite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overwriteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagePropertiesTransformerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getMessagePropertiesTransformerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyType> getDeleteMessageProperty() {
		if (deleteMessageProperty == null) {
			deleteMessageProperty = new EObjectContainmentEList<KeyType>(KeyType.class, this, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_MESSAGE_PROPERTY);
		}
		return deleteMessageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueType> getAddMessageProperty() {
		if (addMessageProperty == null) {
			addMessageProperty = new EObjectContainmentEList<KeyValueType>(KeyValueType.class, this, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTY);
		}
		return addMessageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getAddMessageProperties() {
		return addMessageProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddMessageProperties(MapType newAddMessageProperties, NotificationChain msgs) {
		MapType oldAddMessageProperties = addMessageProperties;
		addMessageProperties = newAddMessageProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES, oldAddMessageProperties, newAddMessageProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddMessageProperties(MapType newAddMessageProperties) {
		if (newAddMessageProperties != addMessageProperties) {
			NotificationChain msgs = null;
			if (addMessageProperties != null)
				msgs = ((InternalEObject)addMessageProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES, null, msgs);
			if (newAddMessageProperties != null)
				msgs = ((InternalEObject)newAddMessageProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES, null, msgs);
			msgs = basicSetAddMessageProperties(newAddMessageProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES, newAddMessageProperties, newAddMessageProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverwrite() {
		return overwrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverwrite(boolean newOverwrite) {
		boolean oldOverwrite = overwrite;
		overwrite = newOverwrite;
		boolean oldOverwriteESet = overwriteESet;
		overwriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE, oldOverwrite, overwrite, !oldOverwriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverwrite() {
		boolean oldOverwrite = overwrite;
		boolean oldOverwriteESet = overwriteESet;
		overwrite = OVERWRITE_EDEFAULT;
		overwriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE, oldOverwrite, OVERWRITE_EDEFAULT, oldOverwriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverwrite() {
		return overwriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_MESSAGE_PROPERTY:
				return ((InternalEList<?>)getDeleteMessageProperty()).basicRemove(otherEnd, msgs);
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTY:
				return ((InternalEList<?>)getAddMessageProperty()).basicRemove(otherEnd, msgs);
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES:
				return basicSetAddMessageProperties(null, msgs);
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_MESSAGE_PROPERTY:
				return getDeleteMessageProperty();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTY:
				return getAddMessageProperty();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES:
				return getAddMessageProperties();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE:
				return isOverwrite() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_MESSAGE_PROPERTY:
				getDeleteMessageProperty().clear();
				getDeleteMessageProperty().addAll((Collection<? extends KeyType>)newValue);
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTY:
				getAddMessageProperty().clear();
				getAddMessageProperty().addAll((Collection<? extends KeyValueType>)newValue);
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES:
				setAddMessageProperties((MapType)newValue);
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE:
				setOverwrite(((Boolean)newValue).booleanValue());
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_MESSAGE_PROPERTY:
				getDeleteMessageProperty().clear();
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTY:
				getAddMessageProperty().clear();
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES:
				setAddMessageProperties((MapType)null);
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE:
				unsetOverwrite();
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_MESSAGE_PROPERTY:
				return deleteMessageProperty != null && !deleteMessageProperty.isEmpty();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTY:
				return addMessageProperty != null && !addMessageProperty.isEmpty();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_MESSAGE_PROPERTIES:
				return addMessageProperties != null;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__OVERWRITE:
				return isSetOverwrite();
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
		result.append(" (overwrite: ");
		if (overwriteESet) result.append(overwrite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MessagePropertiesTransformerTypeImpl
