/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.mule.ide.config.tests.park.InsuranceType;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.PersonType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.impl.InsuranceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.InsuranceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.InsuranceTypeImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.InsuranceTypeImpl#getHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsuranceTypeImpl extends EObjectImpl implements InsuranceType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected PersonType client;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> history;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkPackage.Literals.INSURANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.INSURANCE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.INSURANCE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (PersonType)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParkPackage.INSURANCE_TYPE__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(PersonType newClient) {
		PersonType oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.INSURANCE_TYPE__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHistory() {
		if (history == null) {
			history = new EDataTypeUniqueEList<String>(String.class, this, ParkPackage.INSURANCE_TYPE__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParkPackage.INSURANCE_TYPE__ID:
				return getId();
			case ParkPackage.INSURANCE_TYPE__NAME:
				return getName();
			case ParkPackage.INSURANCE_TYPE__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case ParkPackage.INSURANCE_TYPE__HISTORY:
				return getHistory();
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
			case ParkPackage.INSURANCE_TYPE__ID:
				setId((String)newValue);
				return;
			case ParkPackage.INSURANCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case ParkPackage.INSURANCE_TYPE__CLIENT:
				setClient((PersonType)newValue);
				return;
			case ParkPackage.INSURANCE_TYPE__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends String>)newValue);
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
			case ParkPackage.INSURANCE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ParkPackage.INSURANCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ParkPackage.INSURANCE_TYPE__CLIENT:
				setClient((PersonType)null);
				return;
			case ParkPackage.INSURANCE_TYPE__HISTORY:
				getHistory().clear();
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
			case ParkPackage.INSURANCE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ParkPackage.INSURANCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ParkPackage.INSURANCE_TYPE__CLIENT:
				return client != null;
			case ParkPackage.INSURANCE_TYPE__HISTORY:
				return history != null && !history.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", history: ");
		result.append(history);
		result.append(')');
		return result.toString();
	}

} //InsuranceTypeImpl
