/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.tests.park.ParkFactory
 * @model kind="package"
 * @generated
 */
public interface ParkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "park";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:vehiclePark";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "park";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParkPackage eINSTANCE = org.mule.ide.config.tests.park.impl.ParkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mule.ide.config.tests.park.impl.DecalTypeImpl <em>Decal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.tests.park.impl.DecalTypeImpl
	 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getDecalType()
	 * @generated
	 */
	int DECAL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAL_TYPE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAL_TYPE__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Decal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.tests.park.impl.DocumentRootImpl
	 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abstract Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_VEHICLE = 3;

	/**
	 * The feature id for the '<em><b>Decal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECAL = 4;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAKE = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 6;

	/**
	 * The feature id for the '<em><b>Paint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAINT = 7;

	/**
	 * The feature id for the '<em><b>Park</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARK = 8;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VEHICLE = 9;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.tests.park.impl.ParkTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.tests.park.impl.ParkTypeImpl
	 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getParkType()
	 * @generated
	 */
	int PARK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Vehicle Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK_TYPE__ABSTRACT_VEHICLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Abstract Vehicle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK_TYPE__ABSTRACT_VEHICLE = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mule.ide.config.tests.park.impl.VehicleTypeImpl
	 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__MAKE = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Decal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__DECAL = 3;

	/**
	 * The feature id for the '<em><b>Paint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__PAINT = 4;

	/**
	 * The number of structural features of the '<em>Vehicle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.tests.park.DecalType <em>Decal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decal Type</em>'.
	 * @see org.mule.ide.config.tests.park.DecalType
	 * @generated
	 */
	EClass getDecalType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.DecalType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mule.ide.config.tests.park.DecalType#getValue()
	 * @see #getDecalType()
	 * @generated
	 */
	EAttribute getDecalType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.DecalType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.mule.ide.config.tests.park.DecalType#getColor()
	 * @see #getDecalType()
	 * @generated
	 */
	EAttribute getDecalType_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.DecalType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.mule.ide.config.tests.park.DecalType#getStyle()
	 * @see #getDecalType()
	 * @generated
	 */
	EAttribute getDecalType_Style();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.tests.park.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.tests.park.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.tests.park.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.mule.ide.config.tests.park.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.tests.park.DocumentRoot#getAbstractVehicle <em>Abstract Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Vehicle</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getAbstractVehicle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractVehicle();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.tests.park.DocumentRoot#getDecal <em>Decal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decal</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getDecal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Decal();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.DocumentRoot#getMake <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getMake()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Make();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.DocumentRoot#getPaint <em>Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paint</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getPaint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Paint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.tests.park.DocumentRoot#getPark <em>Park</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Park</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getPark()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Park();

	/**
	 * Returns the meta object for the containment reference '{@link org.mule.ide.config.tests.park.DocumentRoot#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle</em>'.
	 * @see org.mule.ide.config.tests.park.DocumentRoot#getVehicle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Vehicle();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.tests.park.ParkType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.mule.ide.config.tests.park.ParkType
	 * @generated
	 */
	EClass getParkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.tests.park.ParkType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.tests.park.ParkType#getGroup()
	 * @see #getParkType()
	 * @generated
	 */
	EAttribute getParkType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.tests.park.ParkType#getAbstractVehicleGroup <em>Abstract Vehicle Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Vehicle Group</em>'.
	 * @see org.mule.ide.config.tests.park.ParkType#getAbstractVehicleGroup()
	 * @see #getParkType()
	 * @generated
	 */
	EAttribute getParkType_AbstractVehicleGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.tests.park.ParkType#getAbstractVehicle <em>Abstract Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Vehicle</em>'.
	 * @see org.mule.ide.config.tests.park.ParkType#getAbstractVehicle()
	 * @see #getParkType()
	 * @generated
	 */
	EReference getParkType_AbstractVehicle();

	/**
	 * Returns the meta object for class '{@link org.mule.ide.config.tests.park.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Type</em>'.
	 * @see org.mule.ide.config.tests.park.VehicleType
	 * @generated
	 */
	EClass getVehicleType();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.VehicleType#getMake <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make</em>'.
	 * @see org.mule.ide.config.tests.park.VehicleType#getMake()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Make();

	/**
	 * Returns the meta object for the attribute '{@link org.mule.ide.config.tests.park.VehicleType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.mule.ide.config.tests.park.VehicleType#getModel()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Model();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.tests.park.VehicleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.mule.ide.config.tests.park.VehicleType#getGroup()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mule.ide.config.tests.park.VehicleType#getDecal <em>Decal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decal</em>'.
	 * @see org.mule.ide.config.tests.park.VehicleType#getDecal()
	 * @see #getVehicleType()
	 * @generated
	 */
	EReference getVehicleType_Decal();

	/**
	 * Returns the meta object for the attribute list '{@link org.mule.ide.config.tests.park.VehicleType#getPaint <em>Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paint</em>'.
	 * @see org.mule.ide.config.tests.park.VehicleType#getPaint()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Paint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParkFactory getParkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mule.ide.config.tests.park.impl.DecalTypeImpl <em>Decal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.tests.park.impl.DecalTypeImpl
		 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getDecalType()
		 * @generated
		 */
		EClass DECAL_TYPE = eINSTANCE.getDecalType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAL_TYPE__VALUE = eINSTANCE.getDecalType_Value();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAL_TYPE__COLOR = eINSTANCE.getDecalType_Color();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECAL_TYPE__STYLE = eINSTANCE.getDecalType_Style();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.tests.park.impl.DocumentRootImpl
		 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Abstract Vehicle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_VEHICLE = eINSTANCE.getDocumentRoot_AbstractVehicle();

		/**
		 * The meta object literal for the '<em><b>Decal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DECAL = eINSTANCE.getDocumentRoot_Decal();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAKE = eINSTANCE.getDocumentRoot_Make();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MODEL = eINSTANCE.getDocumentRoot_Model();

		/**
		 * The meta object literal for the '<em><b>Paint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PAINT = eINSTANCE.getDocumentRoot_Paint();

		/**
		 * The meta object literal for the '<em><b>Park</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARK = eINSTANCE.getDocumentRoot_Park();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VEHICLE = eINSTANCE.getDocumentRoot_Vehicle();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.tests.park.impl.ParkTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.tests.park.impl.ParkTypeImpl
		 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getParkType()
		 * @generated
		 */
		EClass PARK_TYPE = eINSTANCE.getParkType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARK_TYPE__GROUP = eINSTANCE.getParkType_Group();

		/**
		 * The meta object literal for the '<em><b>Abstract Vehicle Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARK_TYPE__ABSTRACT_VEHICLE_GROUP = eINSTANCE.getParkType_AbstractVehicleGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Vehicle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARK_TYPE__ABSTRACT_VEHICLE = eINSTANCE.getParkType_AbstractVehicle();

		/**
		 * The meta object literal for the '{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mule.ide.config.tests.park.impl.VehicleTypeImpl
		 * @see org.mule.ide.config.tests.park.impl.ParkPackageImpl#getVehicleType()
		 * @generated
		 */
		EClass VEHICLE_TYPE = eINSTANCE.getVehicleType();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__MAKE = eINSTANCE.getVehicleType_Make();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__MODEL = eINSTANCE.getVehicleType_Model();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__GROUP = eINSTANCE.getVehicleType_Group();

		/**
		 * The meta object literal for the '<em><b>Decal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TYPE__DECAL = eINSTANCE.getVehicleType_Decal();

		/**
		 * The meta object literal for the '<em><b>Paint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__PAINT = eINSTANCE.getVehicleType_Paint();

	}

} //ParkPackage
