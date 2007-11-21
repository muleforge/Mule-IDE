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

import org.mule.ide.config.core.CorePackage;
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
 *   <li>{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl#getDeleteProperties <em>Delete Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl#getAddProperties <em>Add Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MessagePropertiesTransformerTypeImpl#isOverwrite <em>Overwrite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessagePropertiesTransformerTypeImpl extends AbstractTransformerTypeImpl implements MessagePropertiesTransformerType {
	/**
	 * The cached value of the '{@link #getDeleteProperties() <em>Delete Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteProperties()
	 * @generated
	 * @ordered
	 */
	protected ListOrSetType deleteProperties;

	/**
	 * The cached value of the '{@link #getAddProperties() <em>Add Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddProperties()
	 * @generated
	 * @ordered
	 */
	protected MapType addProperties;

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
	public ListOrSetType getDeleteProperties() {
		return deleteProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteProperties(ListOrSetType newDeleteProperties, NotificationChain msgs) {
		ListOrSetType oldDeleteProperties = deleteProperties;
		deleteProperties = newDeleteProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES, oldDeleteProperties, newDeleteProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteProperties(ListOrSetType newDeleteProperties) {
		if (newDeleteProperties != deleteProperties) {
			NotificationChain msgs = null;
			if (deleteProperties != null)
				msgs = ((InternalEObject)deleteProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES, null, msgs);
			if (newDeleteProperties != null)
				msgs = ((InternalEObject)newDeleteProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES, null, msgs);
			msgs = basicSetDeleteProperties(newDeleteProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES, newDeleteProperties, newDeleteProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getAddProperties() {
		return addProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddProperties(MapType newAddProperties, NotificationChain msgs) {
		MapType oldAddProperties = addProperties;
		addProperties = newAddProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES, oldAddProperties, newAddProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddProperties(MapType newAddProperties) {
		if (newAddProperties != addProperties) {
			NotificationChain msgs = null;
			if (addProperties != null)
				msgs = ((InternalEObject)addProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES, null, msgs);
			if (newAddProperties != null)
				msgs = ((InternalEObject)newAddProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES, null, msgs);
			msgs = basicSetAddProperties(newAddProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES, newAddProperties, newAddProperties));
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES:
				return basicSetDeleteProperties(null, msgs);
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES:
				return basicSetAddProperties(null, msgs);
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES:
				return getDeleteProperties();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES:
				return getAddProperties();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES:
				setDeleteProperties((ListOrSetType)newValue);
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES:
				setAddProperties((MapType)newValue);
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES:
				setDeleteProperties((ListOrSetType)null);
				return;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES:
				setAddProperties((MapType)null);
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
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__DELETE_PROPERTIES:
				return deleteProperties != null;
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE__ADD_PROPERTIES:
				return addProperties != null;
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
