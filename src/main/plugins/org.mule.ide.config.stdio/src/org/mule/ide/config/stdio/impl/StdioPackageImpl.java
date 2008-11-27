/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio.impl;

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

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DefaultGlobalElementType;
import org.mule.ide.config.core.IGlobalElementTypeProvider.IGlobalElementType;

import org.mule.ide.config.spring.SpringPackage;

import org.mule.ide.config.stdio.DocumentRoot;
import org.mule.ide.config.stdio.GlobalEndpointType;
import org.mule.ide.config.stdio.InboundEndpointType;
import org.mule.ide.config.stdio.OutboundEndpointType;
import org.mule.ide.config.stdio.StdioConnectorType;
import org.mule.ide.config.stdio.StdioFactory;
import org.mule.ide.config.stdio.StdioPackage;
import org.mule.ide.config.stdio.SystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StdioPackageImpl extends EPackageImpl implements StdioPackage {
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
	private EClass outboundEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdioConnectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType systemTypeObjectEDataType = null;

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
	 * @see org.mule.ide.config.stdio.StdioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StdioPackageImpl() {
		super(eNS_URI, StdioFactory.eINSTANCE);
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
	public static StdioPackage init() {
		if (isInited) return (StdioPackage)EPackage.Registry.INSTANCE.getEPackage(StdioPackage.eNS_URI);

		// Obtain or create and register package
		StdioPackageImpl theStdioPackage = (StdioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof StdioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new StdioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		SpringPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStdioPackage.createPackageContents();

		// Initialize created meta-data
		theStdioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStdioPackage.freeze();

		return theStdioPackage;
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
	public EReference getDocumentRoot_Connector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InboundEndpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutboundEndpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getGlobalEndpointType_System() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInboundEndpointType_System() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getOutboundEndpointType_System() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStdioConnectorType() {
		return stdioConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdioConnectorType_MessageDelayTime() {
		return (EAttribute)stdioConnectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdioConnectorType_OutputMessage() {
		return (EAttribute)stdioConnectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdioConnectorType_OutputMessageCode() {
		return (EAttribute)stdioConnectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdioConnectorType_PromptMessage() {
		return (EAttribute)stdioConnectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdioConnectorType_PromptMessageCode() {
		return (EAttribute)stdioConnectorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdioConnectorType_ResourceBundle() {
		return (EAttribute)stdioConnectorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemType() {
		return systemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSystemTypeObject() {
		return systemTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdioFactory getStdioFactory() {
		return (StdioFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INBOUND_ENDPOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OUTBOUND_ENDPOINT);

		globalEndpointTypeEClass = createEClass(GLOBAL_ENDPOINT_TYPE);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SYSTEM);

		inboundEndpointTypeEClass = createEClass(INBOUND_ENDPOINT_TYPE);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SYSTEM);

		outboundEndpointTypeEClass = createEClass(OUTBOUND_ENDPOINT_TYPE);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SYSTEM);

		stdioConnectorTypeEClass = createEClass(STDIO_CONNECTOR_TYPE);
		createEAttribute(stdioConnectorTypeEClass, STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME);
		createEAttribute(stdioConnectorTypeEClass, STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE);
		createEAttribute(stdioConnectorTypeEClass, STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE);
		createEAttribute(stdioConnectorTypeEClass, STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE);
		createEAttribute(stdioConnectorTypeEClass, STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE);
		createEAttribute(stdioConnectorTypeEClass, STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE);

		// Create enums
		systemTypeEEnum = createEEnum(SYSTEM_TYPE);

		// Create data types
		systemTypeObjectEDataType = createEDataType(SYSTEM_TYPE_OBJECT);
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
		globalEndpointTypeEClass.getESuperTypes().add(theCorePackage.getGlobalEndpointType());
		inboundEndpointTypeEClass.getESuperTypes().add(theCorePackage.getInboundEndpointType());
		outboundEndpointTypeEClass.getESuperTypes().add(theCorePackage.getOutboundEndpointType());
		stdioConnectorTypeEClass.getESuperTypes().add(theCorePackage.getConnectorType());

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Connector(), this.getStdioConnectorType(), null, "connector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Endpoint(), this.getGlobalEndpointType(), null, "endpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InboundEndpoint(), this.getInboundEndpointType(), null, "inboundEndpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OutboundEndpoint(), this.getOutboundEndpointType(), null, "outboundEndpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(globalEndpointTypeEClass, GlobalEndpointType.class, "GlobalEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalEndpointType_System(), this.getSystemType(), "system", "IN", 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inboundEndpointTypeEClass, InboundEndpointType.class, "InboundEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInboundEndpointType_System(), this.getSystemType(), "system", "IN", 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outboundEndpointTypeEClass, OutboundEndpointType.class, "OutboundEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutboundEndpointType_System(), this.getSystemType(), "system", "IN", 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stdioConnectorTypeEClass, StdioConnectorType.class, "StdioConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStdioConnectorType_MessageDelayTime(), theCorePackage.getSubstitutableLong(), "messageDelayTime", null, 0, 1, StdioConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStdioConnectorType_OutputMessage(), theXMLTypePackage.getString(), "outputMessage", null, 0, 1, StdioConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStdioConnectorType_OutputMessageCode(), theXMLTypePackage.getString(), "outputMessageCode", null, 0, 1, StdioConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStdioConnectorType_PromptMessage(), theXMLTypePackage.getString(), "promptMessage", null, 0, 1, StdioConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStdioConnectorType_PromptMessageCode(), theXMLTypePackage.getString(), "promptMessageCode", null, 0, 1, StdioConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStdioConnectorType_ResourceBundle(), theXMLTypePackage.getString(), "resourceBundle", null, 0, 1, StdioConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(systemTypeEEnum, SystemType.class, "SystemType");
		addEEnumLiteral(systemTypeEEnum, SystemType.IN);
		addEEnumLiteral(systemTypeEEnum, SystemType.OUT);
		addEEnumLiteral(systemTypeEEnum, SystemType.ERR);

		// Initialize data types
		initEDataType(systemTypeObjectEDataType, SystemType.class, "SystemTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getGlobalEndpointType_System(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "system"
		   });		
		addAnnotation
		  (inboundEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "inboundEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInboundEndpointType_System(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "system"
		   });		
		addAnnotation
		  (outboundEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "outboundEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOutboundEndpointType_System(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "system"
		   });		
		addAnnotation
		  (stdioConnectorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "stdioConnectorType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getStdioConnectorType_MessageDelayTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "messageDelayTime"
		   });			
		addAnnotation
		  (getStdioConnectorType_OutputMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "outputMessage"
		   });			
		addAnnotation
		  (getStdioConnectorType_OutputMessageCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "outputMessageCode"
		   });			
		addAnnotation
		  (getStdioConnectorType_PromptMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "promptMessage"
		   });			
		addAnnotation
		  (getStdioConnectorType_PromptMessageCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "promptMessageCode"
		   });			
		addAnnotation
		  (getStdioConnectorType_ResourceBundle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resourceBundle"
		   });		
		addAnnotation
		  (systemTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "system_._type"
		   });		
		addAnnotation
		  (systemTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "system_._type:Object",
			 "baseType", "system_._type"
		   });
	}

	private List<IGlobalElementType> connectorTypes = null;
	public List<IGlobalElementType> getConnectorTypes() {
		if (connectorTypes == null) {
			List<IGlobalElementType> results = new ArrayList<IGlobalElementType>();
			
			results.add(new DefaultGlobalElementType(
					getStdioConnectorType(),
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
		if (filterTypes == null) {
			filterTypes = Collections.emptyList();
		}
		return filterTypes;	
	}
	
	private List<IGlobalElementType> transformerTypes = null;
	public List<IGlobalElementType> getTransformerTypes() {
		if (transformerTypes == null) {
			transformerTypes = Collections.emptyList();
		}
		return transformerTypes;	
	}
	
} //StdioPackageImpl
