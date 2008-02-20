/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.tests.park.DecalType;
import org.mule.ide.config.tests.park.InsuranceType;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.PersonType;
import org.mule.ide.config.tests.park.VehicleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getMake <em>Make</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getDecal <em>Decal</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getPaint <em>Paint</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getLicensePlate <em>License Plate</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getNicknames <em>Nicknames</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getCurrentInsurance <em>Current Insurance</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getPolicyHistory <em>Policy History</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getCurrentOwner <em>Current Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleTypeImpl extends EObjectImpl implements VehicleType {
	/**
	 * The default value of the '{@link #getMake() <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMake()
	 * @generated
	 * @ordered
	 */
	protected static final String MAKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMake() <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMake()
	 * @generated
	 * @ordered
	 */
	protected String make = MAKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

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
	 * The default value of the '{@link #getLicensePlate() <em>License Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePlate()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_PLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicensePlate() <em>License Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePlate()
	 * @generated
	 * @ordered
	 */
	protected String licensePlate = LICENSE_PLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNicknames() <em>Nicknames</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNicknames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nicknames;

	/**
	 * The cached value of the '{@link #getCurrentInsurance() <em>Current Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentInsurance()
	 * @generated
	 * @ordered
	 */
	protected InsuranceType currentInsurance;

	/**
	 * The cached value of the '{@link #getPolicyHistory() <em>Policy History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<InsuranceType> policyHistory;

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
	 * The cached value of the '{@link #getCurrentOwner() <em>Current Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentOwner()
	 * @generated
	 * @ordered
	 */
	protected PersonType currentOwner;

	/**
	 * This is true if the Current Owner containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentOwnerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkPackage.Literals.VEHICLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMake() {
		return make;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMake(String newMake) {
		String oldMake = make;
		make = newMake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__MAKE, oldMake, make));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ParkPackage.VEHICLE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecalType> getDecal() {
		return getGroup().list(ParkPackage.Literals.VEHICLE_TYPE__DECAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPaint() {
		return getGroup().list(ParkPackage.Literals.VEHICLE_TYPE__PAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicensePlate() {
		return licensePlate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensePlate(String newLicensePlate) {
		String oldLicensePlate = licensePlate;
		licensePlate = newLicensePlate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__LICENSE_PLATE, oldLicensePlate, licensePlate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNicknames() {
		if (nicknames == null) {
			nicknames = new EDataTypeUniqueEList<String>(String.class, this, ParkPackage.VEHICLE_TYPE__NICKNAMES);
		}
		return nicknames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceType getCurrentInsurance() {
		return currentInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentInsurance(InsuranceType newCurrentInsurance, NotificationChain msgs) {
		InsuranceType oldCurrentInsurance = currentInsurance;
		currentInsurance = newCurrentInsurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE, oldCurrentInsurance, newCurrentInsurance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentInsurance(InsuranceType newCurrentInsurance) {
		if (newCurrentInsurance != currentInsurance) {
			NotificationChain msgs = null;
			if (currentInsurance != null)
				msgs = ((InternalEObject)currentInsurance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE, null, msgs);
			if (newCurrentInsurance != null)
				msgs = ((InternalEObject)newCurrentInsurance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE, null, msgs);
			msgs = basicSetCurrentInsurance(newCurrentInsurance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE, newCurrentInsurance, newCurrentInsurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsuranceType> getPolicyHistory() {
		if (policyHistory == null) {
			policyHistory = new EObjectContainmentEList<InsuranceType>(InsuranceType.class, this, ParkPackage.VEHICLE_TYPE__POLICY_HISTORY);
		}
		return policyHistory;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType getCurrentOwner() {
		return currentOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentOwner(PersonType newCurrentOwner, NotificationChain msgs) {
		PersonType oldCurrentOwner = currentOwner;
		currentOwner = newCurrentOwner;
		boolean oldCurrentOwnerESet = currentOwnerESet;
		currentOwnerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__CURRENT_OWNER, oldCurrentOwner, newCurrentOwner, !oldCurrentOwnerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentOwner(PersonType newCurrentOwner) {
		if (newCurrentOwner != currentOwner) {
			NotificationChain msgs = null;
			if (currentOwner != null)
				msgs = ((InternalEObject)currentOwner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParkPackage.VEHICLE_TYPE__CURRENT_OWNER, null, msgs);
			if (newCurrentOwner != null)
				msgs = ((InternalEObject)newCurrentOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParkPackage.VEHICLE_TYPE__CURRENT_OWNER, null, msgs);
			msgs = basicSetCurrentOwner(newCurrentOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCurrentOwnerESet = currentOwnerESet;
			currentOwnerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__CURRENT_OWNER, newCurrentOwner, newCurrentOwner, !oldCurrentOwnerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCurrentOwner(NotificationChain msgs) {
		PersonType oldCurrentOwner = currentOwner;
		currentOwner = null;
		boolean oldCurrentOwnerESet = currentOwnerESet;
		currentOwnerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ParkPackage.VEHICLE_TYPE__CURRENT_OWNER, oldCurrentOwner, null, oldCurrentOwnerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentOwner() {
		if (currentOwner != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)currentOwner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParkPackage.VEHICLE_TYPE__CURRENT_OWNER, null, msgs);
			msgs = basicUnsetCurrentOwner(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCurrentOwnerESet = currentOwnerESet;
			currentOwnerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ParkPackage.VEHICLE_TYPE__CURRENT_OWNER, null, null, oldCurrentOwnerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentOwner() {
		return currentOwnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParkPackage.VEHICLE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ParkPackage.VEHICLE_TYPE__DECAL:
				return ((InternalEList<?>)getDecal()).basicRemove(otherEnd, msgs);
			case ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE:
				return basicSetCurrentInsurance(null, msgs);
			case ParkPackage.VEHICLE_TYPE__POLICY_HISTORY:
				return ((InternalEList<?>)getPolicyHistory()).basicRemove(otherEnd, msgs);
			case ParkPackage.VEHICLE_TYPE__CURRENT_OWNER:
				return basicUnsetCurrentOwner(msgs);
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				return getMake();
			case ParkPackage.VEHICLE_TYPE__MODEL:
				return getModel();
			case ParkPackage.VEHICLE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ParkPackage.VEHICLE_TYPE__DECAL:
				return getDecal();
			case ParkPackage.VEHICLE_TYPE__PAINT:
				return getPaint();
			case ParkPackage.VEHICLE_TYPE__LICENSE_PLATE:
				return getLicensePlate();
			case ParkPackage.VEHICLE_TYPE__NICKNAMES:
				return getNicknames();
			case ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE:
				return getCurrentInsurance();
			case ParkPackage.VEHICLE_TYPE__POLICY_HISTORY:
				return getPolicyHistory();
			case ParkPackage.VEHICLE_TYPE__ID:
				return getId();
			case ParkPackage.VEHICLE_TYPE__CURRENT_OWNER:
				return getCurrentOwner();
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				setMake((String)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__MODEL:
				setModel((String)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__DECAL:
				getDecal().clear();
				getDecal().addAll((Collection<? extends DecalType>)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__PAINT:
				getPaint().clear();
				getPaint().addAll((Collection<? extends String>)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__LICENSE_PLATE:
				setLicensePlate((String)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__NICKNAMES:
				getNicknames().clear();
				getNicknames().addAll((Collection<? extends String>)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE:
				setCurrentInsurance((InsuranceType)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__POLICY_HISTORY:
				getPolicyHistory().clear();
				getPolicyHistory().addAll((Collection<? extends InsuranceType>)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__ID:
				setId((String)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__CURRENT_OWNER:
				setCurrentOwner((PersonType)newValue);
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				setMake(MAKE_EDEFAULT);
				return;
			case ParkPackage.VEHICLE_TYPE__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case ParkPackage.VEHICLE_TYPE__GROUP:
				getGroup().clear();
				return;
			case ParkPackage.VEHICLE_TYPE__DECAL:
				getDecal().clear();
				return;
			case ParkPackage.VEHICLE_TYPE__PAINT:
				getPaint().clear();
				return;
			case ParkPackage.VEHICLE_TYPE__LICENSE_PLATE:
				setLicensePlate(LICENSE_PLATE_EDEFAULT);
				return;
			case ParkPackage.VEHICLE_TYPE__NICKNAMES:
				getNicknames().clear();
				return;
			case ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE:
				setCurrentInsurance((InsuranceType)null);
				return;
			case ParkPackage.VEHICLE_TYPE__POLICY_HISTORY:
				getPolicyHistory().clear();
				return;
			case ParkPackage.VEHICLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ParkPackage.VEHICLE_TYPE__CURRENT_OWNER:
				unsetCurrentOwner();
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				return MAKE_EDEFAULT == null ? make != null : !MAKE_EDEFAULT.equals(make);
			case ParkPackage.VEHICLE_TYPE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case ParkPackage.VEHICLE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ParkPackage.VEHICLE_TYPE__DECAL:
				return !getDecal().isEmpty();
			case ParkPackage.VEHICLE_TYPE__PAINT:
				return !getPaint().isEmpty();
			case ParkPackage.VEHICLE_TYPE__LICENSE_PLATE:
				return LICENSE_PLATE_EDEFAULT == null ? licensePlate != null : !LICENSE_PLATE_EDEFAULT.equals(licensePlate);
			case ParkPackage.VEHICLE_TYPE__NICKNAMES:
				return nicknames != null && !nicknames.isEmpty();
			case ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE:
				return currentInsurance != null;
			case ParkPackage.VEHICLE_TYPE__POLICY_HISTORY:
				return policyHistory != null && !policyHistory.isEmpty();
			case ParkPackage.VEHICLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ParkPackage.VEHICLE_TYPE__CURRENT_OWNER:
				return isSetCurrentOwner();
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
		result.append(" (make: ");
		result.append(make);
		result.append(", model: ");
		result.append(model);
		result.append(", group: ");
		result.append(group);
		result.append(", licensePlate: ");
		result.append(licensePlate);
		result.append(", nicknames: ");
		result.append(nicknames);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //VehicleTypeImpl
