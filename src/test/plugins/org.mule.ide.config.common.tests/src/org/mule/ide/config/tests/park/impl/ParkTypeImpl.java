/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.ParkType;
import org.mule.ide.config.tests.park.PersonType;
import org.mule.ide.config.tests.park.VehicleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.impl.ParkTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.ParkTypeImpl#getAbstractVehicleGroup <em>Abstract Vehicle Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.ParkTypeImpl#getAbstractVehicle <em>Abstract Vehicle</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.ParkTypeImpl#getPersonsGroup <em>Persons Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.ParkTypeImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParkTypeImpl extends EObjectImpl implements ParkType {
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
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkPackage.Literals.PARK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ParkPackage.PARK_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractVehicleGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(ParkPackage.Literals.PARK_TYPE__ABSTRACT_VEHICLE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleType> getAbstractVehicle() {
		return getAbstractVehicleGroup().list(ParkPackage.Literals.PARK_TYPE__ABSTRACT_VEHICLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonsGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(ParkPackage.Literals.PARK_TYPE__PERSONS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<PersonType>(PersonType.class, this, ParkPackage.PARK_TYPE__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParkPackage.PARK_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE_GROUP:
				return ((InternalEList<?>)getAbstractVehicleGroup()).basicRemove(otherEnd, msgs);
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE:
				return ((InternalEList<?>)getAbstractVehicle()).basicRemove(otherEnd, msgs);
			case ParkPackage.PARK_TYPE__PERSONS_GROUP:
				return ((InternalEList<?>)getPersonsGroup()).basicRemove(otherEnd, msgs);
			case ParkPackage.PARK_TYPE__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
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
			case ParkPackage.PARK_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE_GROUP:
				if (coreType) return getAbstractVehicleGroup();
				return ((FeatureMap.Internal)getAbstractVehicleGroup()).getWrapper();
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE:
				return getAbstractVehicle();
			case ParkPackage.PARK_TYPE__PERSONS_GROUP:
				if (coreType) return getPersonsGroup();
				return ((FeatureMap.Internal)getPersonsGroup()).getWrapper();
			case ParkPackage.PARK_TYPE__PERSONS:
				return getPersons();
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
			case ParkPackage.PARK_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE_GROUP:
				((FeatureMap.Internal)getAbstractVehicleGroup()).set(newValue);
				return;
			case ParkPackage.PARK_TYPE__PERSONS_GROUP:
				((FeatureMap.Internal)getPersonsGroup()).set(newValue);
				return;
			case ParkPackage.PARK_TYPE__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends PersonType>)newValue);
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
			case ParkPackage.PARK_TYPE__GROUP:
				getGroup().clear();
				return;
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE_GROUP:
				getAbstractVehicleGroup().clear();
				return;
			case ParkPackage.PARK_TYPE__PERSONS_GROUP:
				getPersonsGroup().clear();
				return;
			case ParkPackage.PARK_TYPE__PERSONS:
				getPersons().clear();
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
			case ParkPackage.PARK_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE_GROUP:
				return !getAbstractVehicleGroup().isEmpty();
			case ParkPackage.PARK_TYPE__ABSTRACT_VEHICLE:
				return !getAbstractVehicle().isEmpty();
			case ParkPackage.PARK_TYPE__PERSONS_GROUP:
				return !getPersonsGroup().isEmpty();
			case ParkPackage.PARK_TYPE__PERSONS:
				return persons != null && !persons.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ParkTypeImpl
