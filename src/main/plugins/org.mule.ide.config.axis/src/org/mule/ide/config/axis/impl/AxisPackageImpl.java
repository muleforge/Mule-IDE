/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mule.ide.config.axis.AxisConnectorType;
import org.mule.ide.config.axis.AxisFactory;
import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.BeanTypeType;
import org.mule.ide.config.axis.DocumentRoot;
import org.mule.ide.config.axis.GlobalEndpointType;
import org.mule.ide.config.axis.InboundEndpointType;
import org.mule.ide.config.axis.ModeType;
import org.mule.ide.config.axis.OptionsType;
import org.mule.ide.config.axis.OutboundEndpointType;
import org.mule.ide.config.axis.SoapMethodType;
import org.mule.ide.config.axis.SoapParameterType;
import org.mule.ide.config.axis.SoapReturnType;
import org.mule.ide.config.axis.SoapServiceType;
import org.mule.ide.config.axis.StyleType;
import org.mule.ide.config.axis.UseType;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DefaultGlobalElementType;
import org.mule.ide.config.core.IGlobalElementTypeProvider.IGlobalElementType;

import org.mule.ide.config.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AxisPackageImpl extends EPackageImpl implements AxisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisConnectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inboundEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soapMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soapParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soapReturnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soapServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum useTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType useTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mule.ide.config.axis.AxisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AxisPackageImpl() {
		super(eNS_URI, AxisFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AxisPackage init() {
		if (isInited) return (AxisPackage)EPackage.Registry.INSTANCE.getEPackage(AxisPackage.eNS_URI);

		// Obtain or create and register package
		AxisPackageImpl theAxisPackage = (AxisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AxisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AxisPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		SpringPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAxisPackage.createPackageContents();

		// Initialize created meta-data
		theAxisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAxisPackage.freeze();

		return theAxisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxisConnectorType() {
		return axisConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisConnectorType_BeanType() {
		return (EReference)axisConnectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisConnectorType_SupportedScheme() {
		return (EReference)axisConnectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisConnectorType_AxisRef() {
		return (EAttribute)axisConnectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisConnectorType_ClientConfig() {
		return (EAttribute)axisConnectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisConnectorType_ClientProviderRef() {
		return (EAttribute)axisConnectorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisConnectorType_DoAutoTypes() {
		return (EAttribute)axisConnectorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisConnectorType_ServerConfig() {
		return (EAttribute)axisConnectorTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisConnectorType_ServerProviderRef() {
		return (EAttribute)axisConnectorTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisConnectorType_TreatMapAsNamedParams() {
		return (EAttribute)axisConnectorTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeanTypeType() {
		return beanTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanTypeType_Interface() {
		return (EAttribute)beanTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BeanType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Connector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InboundEndpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutboundEndpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalEndpointType() {
		return globalEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Options() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_BeanType() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_SoapService() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_SoapMethod() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Property1() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Properties1() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ClientConfig() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ServiceNamespace() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_SoapAction() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_SOAPAction1() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Style() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Use() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_WsdlFile() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInboundEndpointType() {
		return inboundEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Options() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_BeanType() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_SoapService() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_SoapMethod() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Property1() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Properties1() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ClientConfig() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ServiceNamespace() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_SoapAction() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_SOAPAction1() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Style() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Use() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_WsdlFile() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsType() {
		return optionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsType_Option() {
		return (EReference)optionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_AllowedMethods() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_ExtraClasses() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_Scope() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_WsdlInputSchema() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_WsdlPortType() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_WsdlServiceElement() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_WsdlServicePort() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_WsdlSoapActionMode() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsType_WsdlTargetNamespace() {
		return (EAttribute)optionsTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundEndpointType() {
		return outboundEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_SoapService() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_SoapMethod() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Property1() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Properties1() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ClientConfig() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ServiceNamespace() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_SoapAction() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_SOAPAction1() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Style() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Use() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoapMethodType() {
		return soapMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoapMethodType_SoapParameter() {
		return (EReference)soapMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoapMethodType_SoapReturn() {
		return (EReference)soapMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapMethodType_Method() {
		return (EAttribute)soapMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoapParameterType() {
		return soapParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapParameterType_Mode() {
		return (EAttribute)soapParameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapParameterType_Parameter() {
		return (EAttribute)soapParameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapParameterType_Type() {
		return (EAttribute)soapParameterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoapReturnType() {
		return soapReturnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapReturnType_Type() {
		return (EAttribute)soapReturnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoapServiceType() {
		return soapServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoapServiceType_Interface() {
		return (EAttribute)soapServiceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeType() {
		return modeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleType() {
		return styleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUseType() {
		return useTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModeTypeObject() {
		return modeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleTypeObject() {
		return styleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUseTypeObject() {
		return useTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisFactory getAxisFactory() {
		return (AxisFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		axisConnectorTypeEClass = createEClass(AXIS_CONNECTOR_TYPE);
		createEReference(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__BEAN_TYPE);
		createEReference(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__SUPPORTED_SCHEME);
		createEAttribute(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__AXIS_REF);
		createEAttribute(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__CLIENT_CONFIG);
		createEAttribute(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__CLIENT_PROVIDER_REF);
		createEAttribute(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__DO_AUTO_TYPES);
		createEAttribute(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__SERVER_CONFIG);
		createEAttribute(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__SERVER_PROVIDER_REF);
		createEAttribute(axisConnectorTypeEClass, AXIS_CONNECTOR_TYPE__TREAT_MAP_AS_NAMED_PARAMS);

		beanTypeTypeEClass = createEClass(BEAN_TYPE_TYPE);
		createEAttribute(beanTypeTypeEClass, BEAN_TYPE_TYPE__INTERFACE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BEAN_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INBOUND_ENDPOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OUTBOUND_ENDPOINT);

		globalEndpointTypeEClass = createEClass(GLOBAL_ENDPOINT_TYPE);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__OPTIONS);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__BEAN_TYPE);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SOAP_SERVICE);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SOAP_METHOD);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__PROPERTY1);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__PROPERTIES1);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__CLIENT_CONFIG);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SERVICE_NAMESPACE);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SOAP_ACTION);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SOAP_ACTION1);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__STYLE);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__USE);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__WSDL_FILE);

		inboundEndpointTypeEClass = createEClass(INBOUND_ENDPOINT_TYPE);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__OPTIONS);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__BEAN_TYPE);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SOAP_SERVICE);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SOAP_METHOD);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__PROPERTY1);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__PROPERTIES1);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SOAP_ACTION);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SOAP_ACTION1);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__STYLE);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__USE);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__WSDL_FILE);

		optionsTypeEClass = createEClass(OPTIONS_TYPE);
		createEReference(optionsTypeEClass, OPTIONS_TYPE__OPTION);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__ALLOWED_METHODS);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__EXTRA_CLASSES);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__SCOPE);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__WSDL_INPUT_SCHEMA);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__WSDL_PORT_TYPE);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__WSDL_SERVICE_ELEMENT);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__WSDL_SERVICE_PORT);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE);
		createEAttribute(optionsTypeEClass, OPTIONS_TYPE__WSDL_TARGET_NAMESPACE);

		outboundEndpointTypeEClass = createEClass(OUTBOUND_ENDPOINT_TYPE);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SOAP_SERVICE);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SOAP_METHOD);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__PROPERTY1);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__PROPERTIES1);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__CLIENT_CONFIG);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SOAP_ACTION);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SOAP_ACTION1);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__STYLE);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__USE);

		soapMethodTypeEClass = createEClass(SOAP_METHOD_TYPE);
		createEReference(soapMethodTypeEClass, SOAP_METHOD_TYPE__SOAP_PARAMETER);
		createEReference(soapMethodTypeEClass, SOAP_METHOD_TYPE__SOAP_RETURN);
		createEAttribute(soapMethodTypeEClass, SOAP_METHOD_TYPE__METHOD);

		soapParameterTypeEClass = createEClass(SOAP_PARAMETER_TYPE);
		createEAttribute(soapParameterTypeEClass, SOAP_PARAMETER_TYPE__MODE);
		createEAttribute(soapParameterTypeEClass, SOAP_PARAMETER_TYPE__PARAMETER);
		createEAttribute(soapParameterTypeEClass, SOAP_PARAMETER_TYPE__TYPE);

		soapReturnTypeEClass = createEClass(SOAP_RETURN_TYPE);
		createEAttribute(soapReturnTypeEClass, SOAP_RETURN_TYPE__TYPE);

		soapServiceTypeEClass = createEClass(SOAP_SERVICE_TYPE);
		createEAttribute(soapServiceTypeEClass, SOAP_SERVICE_TYPE__INTERFACE);

		// Create enums
		modeTypeEEnum = createEEnum(MODE_TYPE);
		styleTypeEEnum = createEEnum(STYLE_TYPE);
		useTypeEEnum = createEEnum(USE_TYPE);

		// Create data types
		modeTypeObjectEDataType = createEDataType(MODE_TYPE_OBJECT);
		styleTypeObjectEDataType = createEDataType(STYLE_TYPE_OBJECT);
		useTypeObjectEDataType = createEDataType(USE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		axisConnectorTypeEClass.getESuperTypes().add(theCorePackage.getConnectorType());
		globalEndpointTypeEClass.getESuperTypes().add(theCorePackage.getGlobalEndpointType());
		inboundEndpointTypeEClass.getESuperTypes().add(theCorePackage.getInboundEndpointType());
		outboundEndpointTypeEClass.getESuperTypes().add(theCorePackage.getOutboundEndpointType());

		// Initialize classes and features; add operations and parameters
		initEClass(axisConnectorTypeEClass, AxisConnectorType.class, "AxisConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxisConnectorType_BeanType(), this.getBeanTypeType(), null, "beanType", null, 0, -1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisConnectorType_SupportedScheme(), theCorePackage.getValueType(), null, "supportedScheme", null, 0, -1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisConnectorType_AxisRef(), theXMLTypePackage.getString(), "axisRef", null, 0, 1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisConnectorType_ClientConfig(), theXMLTypePackage.getString(), "clientConfig", null, 0, 1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisConnectorType_ClientProviderRef(), theXMLTypePackage.getString(), "clientProviderRef", null, 0, 1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisConnectorType_DoAutoTypes(), theCorePackage.getSubstitutableBoolean(), "doAutoTypes", null, 0, 1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisConnectorType_ServerConfig(), theXMLTypePackage.getString(), "serverConfig", null, 0, 1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisConnectorType_ServerProviderRef(), theXMLTypePackage.getString(), "serverProviderRef", null, 0, 1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisConnectorType_TreatMapAsNamedParams(), theCorePackage.getSubstitutableBoolean(), "treatMapAsNamedParams", null, 0, 1, AxisConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanTypeTypeEClass, BeanTypeType.class, "BeanTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeanTypeType_Interface(), theXMLTypePackage.getString(), "interface", null, 0, 1, BeanTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BeanType(), this.getBeanTypeType(), null, "beanType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Connector(), this.getAxisConnectorType(), null, "connector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Endpoint(), this.getGlobalEndpointType(), null, "endpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InboundEndpoint(), this.getInboundEndpointType(), null, "inboundEndpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OutboundEndpoint(), this.getOutboundEndpointType(), null, "outboundEndpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(globalEndpointTypeEClass, GlobalEndpointType.class, "GlobalEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalEndpointType_Options(), this.getOptionsType(), null, "options", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_BeanType(), this.getBeanTypeType(), null, "beanType", null, 0, -1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_SoapService(), this.getSoapServiceType(), null, "soapService", null, 0, -1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_SoapMethod(), this.getSoapMethodType(), null, "soapMethod", null, 0, -1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_Property1(), theCorePackage.getKeyValueType(), null, "property1", null, 0, -1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_Properties1(), theCorePackage.getMapType(), null, "properties1", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_ClientConfig(), theXMLTypePackage.getString(), "clientConfig", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_ServiceNamespace(), theXMLTypePackage.getString(), "serviceNamespace", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_SoapAction(), theXMLTypePackage.getString(), "soapAction", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_SOAPAction1(), theXMLTypePackage.getString(), "sOAPAction1", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Style(), this.getStyleType(), "style", "RPC", 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Use(), this.getUseType(), "use", "ENCODED", 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_WsdlFile(), theXMLTypePackage.getString(), "wsdlFile", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inboundEndpointTypeEClass, InboundEndpointType.class, "InboundEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInboundEndpointType_Options(), this.getOptionsType(), null, "options", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_BeanType(), this.getBeanTypeType(), null, "beanType", null, 0, -1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_SoapService(), this.getSoapServiceType(), null, "soapService", null, 0, -1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_SoapMethod(), this.getSoapMethodType(), null, "soapMethod", null, 0, -1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_Property1(), theCorePackage.getKeyValueType(), null, "property1", null, 0, -1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_Properties1(), theCorePackage.getMapType(), null, "properties1", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_ClientConfig(), theXMLTypePackage.getString(), "clientConfig", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_ServiceNamespace(), theXMLTypePackage.getString(), "serviceNamespace", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_SoapAction(), theXMLTypePackage.getString(), "soapAction", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_SOAPAction1(), theXMLTypePackage.getString(), "sOAPAction1", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Style(), this.getStyleType(), "style", "RPC", 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Use(), this.getUseType(), "use", "ENCODED", 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_WsdlFile(), theXMLTypePackage.getString(), "wsdlFile", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsTypeEClass, OptionsType.class, "OptionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionsType_Option(), theCorePackage.getKeyValueType(), null, "option", null, 0, -1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_AllowedMethods(), theXMLTypePackage.getString(), "allowedMethods", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_ExtraClasses(), theXMLTypePackage.getString(), "extraClasses", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_Scope(), theXMLTypePackage.getString(), "scope", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_WsdlInputSchema(), theXMLTypePackage.getString(), "wsdlInputSchema", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_WsdlPortType(), theXMLTypePackage.getString(), "wsdlPortType", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_WsdlServiceElement(), theXMLTypePackage.getString(), "wsdlServiceElement", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_WsdlServicePort(), theXMLTypePackage.getString(), "wsdlServicePort", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_WsdlSoapActionMode(), theXMLTypePackage.getString(), "wsdlSoapActionMode", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionsType_WsdlTargetNamespace(), theXMLTypePackage.getString(), "wsdlTargetNamespace", null, 0, 1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outboundEndpointTypeEClass, OutboundEndpointType.class, "OutboundEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutboundEndpointType_SoapService(), this.getSoapServiceType(), null, "soapService", null, 0, -1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_SoapMethod(), this.getSoapMethodType(), null, "soapMethod", null, 0, -1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_Property1(), theCorePackage.getKeyValueType(), null, "property1", null, 0, -1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_Properties1(), theCorePackage.getMapType(), null, "properties1", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_ClientConfig(), theXMLTypePackage.getString(), "clientConfig", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_ServiceNamespace(), theXMLTypePackage.getString(), "serviceNamespace", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_SoapAction(), theXMLTypePackage.getString(), "soapAction", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_SOAPAction1(), theXMLTypePackage.getString(), "sOAPAction1", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Style(), this.getStyleType(), "style", "RPC", 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Use(), this.getUseType(), "use", "ENCODED", 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soapMethodTypeEClass, SoapMethodType.class, "SoapMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoapMethodType_SoapParameter(), this.getSoapParameterType(), null, "soapParameter", null, 0, -1, SoapMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoapMethodType_SoapReturn(), this.getSoapReturnType(), null, "soapReturn", null, 0, 1, SoapMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoapMethodType_Method(), theXMLTypePackage.getString(), "method", null, 1, 1, SoapMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soapParameterTypeEClass, SoapParameterType.class, "SoapParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoapParameterType_Mode(), this.getModeType(), "mode", "IN", 0, 1, SoapParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoapParameterType_Parameter(), theXMLTypePackage.getString(), "parameter", null, 1, 1, SoapParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoapParameterType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, SoapParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soapReturnTypeEClass, SoapReturnType.class, "SoapReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoapReturnType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, SoapReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soapServiceTypeEClass, SoapServiceType.class, "SoapServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoapServiceType_Interface(), theXMLTypePackage.getString(), "interface", null, 0, 1, SoapServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeTypeEEnum, ModeType.class, "ModeType");
		addEEnumLiteral(modeTypeEEnum, ModeType.IN);
		addEEnumLiteral(modeTypeEEnum, ModeType.OUT);
		addEEnumLiteral(modeTypeEEnum, ModeType.INOUT);

		initEEnum(styleTypeEEnum, StyleType.class, "StyleType");
		addEEnumLiteral(styleTypeEEnum, StyleType.RPC);
		addEEnumLiteral(styleTypeEEnum, StyleType.DOCUMENT);
		addEEnumLiteral(styleTypeEEnum, StyleType.MESSAGE);
		addEEnumLiteral(styleTypeEEnum, StyleType.WRAPPED);

		initEEnum(useTypeEEnum, UseType.class, "UseType");
		addEEnumLiteral(useTypeEEnum, UseType.ENCODED);
		addEEnumLiteral(useTypeEEnum, UseType.LITERAL);

		// Initialize data types
		initEDataType(modeTypeObjectEDataType, ModeType.class, "ModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleTypeObjectEDataType, StyleType.class, "StyleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(useTypeObjectEDataType, UseType.class, "UseTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (axisConnectorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "axisConnectorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAxisConnectorType_BeanType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAxisConnectorType_SupportedScheme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supported-scheme",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getAxisConnectorType_AxisRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "axis-ref"
		   });			
		addAnnotation
		  (getAxisConnectorType_ClientConfig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientConfig"
		   });			
		addAnnotation
		  (getAxisConnectorType_ClientProviderRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientProvider-ref"
		   });			
		addAnnotation
		  (getAxisConnectorType_DoAutoTypes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "doAutoTypes"
		   });			
		addAnnotation
		  (getAxisConnectorType_ServerConfig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serverConfig"
		   });			
		addAnnotation
		  (getAxisConnectorType_ServerProviderRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serverProvider-ref"
		   });			
		addAnnotation
		  (getAxisConnectorType_TreatMapAsNamedParams(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "treatMapAsNamedParams"
		   });		
		addAnnotation
		  (beanTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bean-type_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBeanTypeType_Interface(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "interface"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_BeanType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean-type",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Connector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connector",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-connector"
		   });		
		addAnnotation
		  (getDocumentRoot_Endpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "endpoint",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-global-endpoint"
		   });		
		addAnnotation
		  (getDocumentRoot_InboundEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inbound-endpoint",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-inbound-endpoint"
		   });		
		addAnnotation
		  (getDocumentRoot_OutboundEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "outbound-endpoint",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-outbound-endpoint"
		   });		
		addAnnotation
		  (globalEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "globalEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGlobalEndpointType_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGlobalEndpointType_BeanType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGlobalEndpointType_SoapService(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGlobalEndpointType_SoapMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-method",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Property1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Properties1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0"
		   });		
		addAnnotation
		  (getGlobalEndpointType_ClientConfig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientConfig"
		   });		
		addAnnotation
		  (getGlobalEndpointType_ServiceNamespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serviceNamespace"
		   });		
		addAnnotation
		  (getGlobalEndpointType_SoapAction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "soapAction"
		   });		
		addAnnotation
		  (getGlobalEndpointType_SOAPAction1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SOAPAction"
		   });		
		addAnnotation
		  (getGlobalEndpointType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getGlobalEndpointType_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use"
		   });		
		addAnnotation
		  (getGlobalEndpointType_WsdlFile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlFile"
		   });		
		addAnnotation
		  (inboundEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "inboundEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInboundEndpointType_Options(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "options",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInboundEndpointType_BeanType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bean-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInboundEndpointType_SoapService(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInboundEndpointType_SoapMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-method",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getInboundEndpointType_Property1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0"
		   });			
		addAnnotation
		  (getInboundEndpointType_Properties1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0"
		   });		
		addAnnotation
		  (getInboundEndpointType_ClientConfig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientConfig"
		   });		
		addAnnotation
		  (getInboundEndpointType_ServiceNamespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serviceNamespace"
		   });		
		addAnnotation
		  (getInboundEndpointType_SoapAction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "soapAction"
		   });		
		addAnnotation
		  (getInboundEndpointType_SOAPAction1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SOAPAction"
		   });		
		addAnnotation
		  (getInboundEndpointType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getInboundEndpointType_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use"
		   });		
		addAnnotation
		  (getInboundEndpointType_WsdlFile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlFile"
		   });		
		addAnnotation
		  (modeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "mode_._type"
		   });		
		addAnnotation
		  (modeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mode_._type:Object",
			 "baseType", "mode_._type"
		   });		
		addAnnotation
		  (optionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "options_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOptionsType_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "option",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOptionsType_AllowedMethods(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "allowedMethods"
		   });		
		addAnnotation
		  (getOptionsType_ExtraClasses(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extraClasses"
		   });		
		addAnnotation
		  (getOptionsType_Scope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scope"
		   });		
		addAnnotation
		  (getOptionsType_WsdlInputSchema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlInputSchema"
		   });		
		addAnnotation
		  (getOptionsType_WsdlPortType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlPortType"
		   });		
		addAnnotation
		  (getOptionsType_WsdlServiceElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlServiceElement"
		   });		
		addAnnotation
		  (getOptionsType_WsdlServicePort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlServicePort"
		   });		
		addAnnotation
		  (getOptionsType_WsdlSoapActionMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlSoapActionMode"
		   });		
		addAnnotation
		  (getOptionsType_WsdlTargetNamespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wsdlTargetNamespace"
		   });		
		addAnnotation
		  (outboundEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "outboundEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOutboundEndpointType_SoapService(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOutboundEndpointType_SoapMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-method",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Property1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Properties1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0"
		   });		
		addAnnotation
		  (getOutboundEndpointType_ClientConfig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientConfig"
		   });		
		addAnnotation
		  (getOutboundEndpointType_ServiceNamespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serviceNamespace"
		   });		
		addAnnotation
		  (getOutboundEndpointType_SoapAction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "soapAction"
		   });		
		addAnnotation
		  (getOutboundEndpointType_SOAPAction1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SOAPAction"
		   });		
		addAnnotation
		  (getOutboundEndpointType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getOutboundEndpointType_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use"
		   });		
		addAnnotation
		  (soapMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "soap-method_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSoapMethodType_SoapParameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoapMethodType_SoapReturn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soap-return",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoapMethodType_Method(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method"
		   });		
		addAnnotation
		  (soapParameterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "soap-parameter_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSoapParameterType_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode"
		   });		
		addAnnotation
		  (getSoapParameterType_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parameter"
		   });		
		addAnnotation
		  (getSoapParameterType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (soapReturnTypeEClass, 
		   source, 
		   new String[] {
			 "name", "soap-return_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSoapReturnType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (soapServiceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "soap-service_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSoapServiceType_Interface(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "interface"
		   });		
		addAnnotation
		  (styleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "style_._type"
		   });		
		addAnnotation
		  (styleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "style_._type:Object",
			 "baseType", "style_._type"
		   });		
		addAnnotation
		  (useTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "use_._type"
		   });		
		addAnnotation
		  (useTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "use_._type:Object",
			 "baseType", "use_._type"
		   });
	}

	private List<IGlobalElementType> connectorTypes = null;
	public List<IGlobalElementType> getConnectorTypes() {
		if (connectorTypes == null) {
			List<IGlobalElementType> results = new ArrayList<IGlobalElementType>();
			
			results.add(new DefaultGlobalElementType(
					getAxisConnectorType(),
					getDocumentRoot_Connector()));
			
			connectorTypes = results;
		}
		return connectorTypes;
	}
	
	private List<IGlobalElementType> endpointTypes = null;
	public List<IGlobalElementType> getEndpointTypes() {
		if (endpointTypes == null) {
			List<IGlobalElementType> results = new ArrayList<IGlobalElementType>();
			
			results.add(new DefaultGlobalElementType(
					getGlobalEndpointType(),
					getDocumentRoot_Endpoint()));

			endpointTypes = results;
		}
		return endpointTypes;	
	}
	
	private List<IGlobalElementType> filterTypes = null;
	public List<IGlobalElementType> getFilterTypes() {
		return Collections.emptyList();	
	}
	
	private List<IGlobalElementType> transformerTypes = null;
	public List<IGlobalElementType> getTransformerTypes() {
		return Collections.emptyList();	
	}

} //AxisPackageImpl
