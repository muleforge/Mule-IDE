/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.impl;

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

import org.mule.ide.config.jms.AcknowledgementModeType;
import org.mule.ide.config.jms.ActiveMqConnectorType;
import org.mule.ide.config.jms.CustomConnectorType;
import org.mule.ide.config.jms.DocumentRoot;
import org.mule.ide.config.jms.GenericConnectorType;
import org.mule.ide.config.jms.GlobalEndpointType;
import org.mule.ide.config.jms.InboundEndpointType;
import org.mule.ide.config.jms.JMSFactory;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.jms.JmsSelectorFilter;
import org.mule.ide.config.jms.OutboundEndpointType;
import org.mule.ide.config.jms.PropertyFilterType;
import org.mule.ide.config.jms.SpecificationType;
import org.mule.ide.config.jms.VendorJmsConnectorType;

import org.mule.ide.config.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JMSPackageImpl extends EPackageImpl implements JMSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeMqConnectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customConnectorTypeEClass = null;

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
	private EClass genericConnectorTypeEClass = null;

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
	private EClass jmsSelectorFilterEClass = null;

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
	private EClass propertyFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorJmsConnectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acknowledgementModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specificationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType acknowledgementModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specificationTypeObjectEDataType = null;

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
	 * @see org.mule.ide.config.jms.JMSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JMSPackageImpl() {
		super(eNS_URI, JMSFactory.eINSTANCE);
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
	public static JMSPackage init() {
		if (isInited) return (JMSPackage)EPackage.Registry.INSTANCE.getEPackage(JMSPackage.eNS_URI);

		// Obtain or create and register package
		JMSPackageImpl theJMSPackage = (JMSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JMSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new JMSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		SpringPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJMSPackage.createPackageContents();

		// Initialize created meta-data
		theJMSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJMSPackage.freeze();

		return theJMSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveMqConnectorType() {
		return activeMqConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveMqConnectorType_BrokerURL() {
		return (EAttribute)activeMqConnectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomConnectorType() {
		return customConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_AcknowledgementMode() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_CacheJmsSessions() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_ClientId() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_Durable() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_EagerConsumer() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_HonorQosHeaders() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_MaxRedelivery() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_NoLocal() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_Password() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_PersistentDelivery() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_RecoverJmsConnections() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_RedeliveryHandlerRef() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_Specification() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_Username() {
		return (EAttribute)customConnectorTypeEClass.getEStructuralFeatures().get(13);
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
	public EReference getDocumentRoot_ActivemqConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActivemqXaConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClientAckTransaction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Connector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InboundEndpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JmsmessageToObjectTransformer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectToJmsmessageTransformer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutboundEndpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transaction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeblogicConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WebsphereConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XaTransaction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericConnectorType() {
		return genericConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_AcknowledgementMode() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_CacheJmsSessions() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_ClientId() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_ConnectionFactoryRef() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_Durable() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_EagerConsumer() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_HonorQosHeaders() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_MaxRedelivery() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_NoLocal() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_Password() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_PersistentDelivery() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_RecoverJmsConnections() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_RedeliveryHandlerRef() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_Specification() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericConnectorType_Username() {
		return (EAttribute)genericConnectorTypeEClass.getEStructuralFeatures().get(14);
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
	public EAttribute getGlobalEndpointType_Group() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractTransformerGroup() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractTransformer() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Transformers() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_ResponseTransformers() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractTransactionGroup() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractTransaction() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractFilterGroup() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractFilter() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Selector() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractSecurityFilterGroup() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractSecurityFilter() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Properties() {
		return (EReference)globalEndpointTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Address() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ConnectorRef() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Encoding() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Queue() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Ref() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_RemoteSync() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_RemoteSyncTimeout() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ResponseTransformerRefs() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Synchronous() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Topic() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_TransformerRefs() {
		return (EAttribute)globalEndpointTypeEClass.getEStructuralFeatures().get(23);
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
	public EAttribute getInboundEndpointType_Group() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractTransformerGroup() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractTransformer() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Transformers() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_ResponseTransformers() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractTransactionGroup() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractTransaction() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractFilterGroup() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractFilter() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Selector() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractSecurityFilterGroup() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractSecurityFilter() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Properties() {
		return (EReference)inboundEndpointTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Address() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ConnectorRef() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Encoding() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Queue() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Ref() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_RemoteSync() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_RemoteSyncTimeout() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ResponseTransformerRefs() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Synchronous() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Topic() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_TransformerRefs() {
		return (EAttribute)inboundEndpointTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJmsSelectorFilter() {
		return jmsSelectorFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJmsSelectorFilter_Expression() {
		return (EAttribute)jmsSelectorFilterEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getOutboundEndpointType_Group() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractTransformerGroup() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractTransformer() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Transformers() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_ResponseTransformers() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractTransactionGroup() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractTransaction() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractFilterGroup() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractFilter() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Selector() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractSecurityFilterGroup() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractSecurityFilter() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Properties() {
		return (EReference)outboundEndpointTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Address() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ConnectorRef() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Encoding() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Queue() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Ref() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_RemoteSync() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_RemoteSyncTimeout() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ResponseTransformerRefs() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Synchronous() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Topic() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_TransformerRefs() {
		return (EAttribute)outboundEndpointTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyFilterType() {
		return propertyFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyFilterType_Expression() {
		return (EAttribute)propertyFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyFilterType_Pattern() {
		return (EAttribute)propertyFilterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyFilterType_PropertyClass() {
		return (EAttribute)propertyFilterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyFilterType_PropertyName() {
		return (EAttribute)propertyFilterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendorJmsConnectorType() {
		return vendorJmsConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_AcknowledgementMode() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_CacheJmsSessions() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_ClientId() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_ConnectionFactoryRef() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_Durable() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_EagerConsumer() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_HonorQosHeaders() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_MaxRedelivery() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_NoLocal() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_Password() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_PersistentDelivery() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_RecoverJmsConnections() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_RedeliveryHandlerRef() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_Specification() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorJmsConnectorType_Username() {
		return (EAttribute)vendorJmsConnectorTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcknowledgementModeType() {
		return acknowledgementModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecificationType() {
		return specificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAcknowledgementModeTypeObject() {
		return acknowledgementModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpecificationTypeObject() {
		return specificationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSFactory getJMSFactory() {
		return (JMSFactory)getEFactoryInstance();
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
		activeMqConnectorTypeEClass = createEClass(ACTIVE_MQ_CONNECTOR_TYPE);
		createEAttribute(activeMqConnectorTypeEClass, ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL);

		customConnectorTypeEClass = createEClass(CUSTOM_CONNECTOR_TYPE);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__CACHE_JMS_SESSIONS);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__CLIENT_ID);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__DURABLE);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__EAGER_CONSUMER);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__HONOR_QOS_HEADERS);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__MAX_REDELIVERY);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__NO_LOCAL);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__PASSWORD);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__PERSISTENT_DELIVERY);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__SPECIFICATION);
		createEAttribute(customConnectorTypeEClass, CUSTOM_CONNECTOR_TYPE__USERNAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CUSTOM_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INBOUND_ENDPOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OUTBOUND_ENDPOINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_FILTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WEBLOGIC_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WEBSPHERE_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XA_TRANSACTION);

		genericConnectorTypeEClass = createEClass(GENERIC_CONNECTOR_TYPE);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__CACHE_JMS_SESSIONS);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__CLIENT_ID);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__CONNECTION_FACTORY_REF);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__DURABLE);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__EAGER_CONSUMER);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__HONOR_QOS_HEADERS);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__MAX_REDELIVERY);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__NO_LOCAL);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__PASSWORD);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__PERSISTENT_DELIVERY);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__SPECIFICATION);
		createEAttribute(genericConnectorTypeEClass, GENERIC_CONNECTOR_TYPE__USERNAME);

		globalEndpointTypeEClass = createEClass(GLOBAL_ENDPOINT_TYPE);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__GROUP);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__TRANSFORMERS);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_TRANSACTION);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_FILTER);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SELECTOR);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER);
		createEReference(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__PROPERTIES);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ADDRESS);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__ENCODING);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__QUEUE);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__REF);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__TOPIC);
		createEAttribute(globalEndpointTypeEClass, GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS);

		inboundEndpointTypeEClass = createEClass(INBOUND_ENDPOINT_TYPE);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__GROUP);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__TRANSFORMERS);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SELECTOR);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER);
		createEReference(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__PROPERTIES);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ADDRESS);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__CONNECTOR_REF);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__ENCODING);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__QUEUE);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__REF);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__REMOTE_SYNC);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__SYNCHRONOUS);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__TOPIC);
		createEAttribute(inboundEndpointTypeEClass, INBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS);

		jmsSelectorFilterEClass = createEClass(JMS_SELECTOR_FILTER);
		createEAttribute(jmsSelectorFilterEClass, JMS_SELECTOR_FILTER__EXPRESSION);

		outboundEndpointTypeEClass = createEClass(OUTBOUND_ENDPOINT_TYPE);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__GROUP);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER_GROUP);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSFORMER);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__TRANSFORMERS);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMERS);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION_GROUP);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_TRANSACTION);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER_GROUP);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_FILTER);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SELECTOR);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER_GROUP);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ABSTRACT_SECURITY_FILTER);
		createEReference(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__PROPERTIES);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ADDRESS);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__ENCODING);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__QUEUE);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__REF);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__TOPIC);
		createEAttribute(outboundEndpointTypeEClass, OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS);

		propertyFilterTypeEClass = createEClass(PROPERTY_FILTER_TYPE);
		createEAttribute(propertyFilterTypeEClass, PROPERTY_FILTER_TYPE__EXPRESSION);
		createEAttribute(propertyFilterTypeEClass, PROPERTY_FILTER_TYPE__PATTERN);
		createEAttribute(propertyFilterTypeEClass, PROPERTY_FILTER_TYPE__PROPERTY_CLASS);
		createEAttribute(propertyFilterTypeEClass, PROPERTY_FILTER_TYPE__PROPERTY_NAME);

		vendorJmsConnectorTypeEClass = createEClass(VENDOR_JMS_CONNECTOR_TYPE);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__CACHE_JMS_SESSIONS);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__CLIENT_ID);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__CONNECTION_FACTORY_REF);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__DURABLE);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__EAGER_CONSUMER);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__HONOR_QOS_HEADERS);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__MAX_REDELIVERY);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__NO_LOCAL);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__PASSWORD);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__PERSISTENT_DELIVERY);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__SPECIFICATION);
		createEAttribute(vendorJmsConnectorTypeEClass, VENDOR_JMS_CONNECTOR_TYPE__USERNAME);

		// Create enums
		acknowledgementModeTypeEEnum = createEEnum(ACKNOWLEDGEMENT_MODE_TYPE);
		specificationTypeEEnum = createEEnum(SPECIFICATION_TYPE);

		// Create data types
		acknowledgementModeTypeObjectEDataType = createEDataType(ACKNOWLEDGEMENT_MODE_TYPE_OBJECT);
		specificationTypeObjectEDataType = createEDataType(SPECIFICATION_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activeMqConnectorTypeEClass.getESuperTypes().add(this.getVendorJmsConnectorType());
		customConnectorTypeEClass.getESuperTypes().add(theCorePackage.getCustomConnectorType());
		genericConnectorTypeEClass.getESuperTypes().add(theCorePackage.getConnectorType());
		globalEndpointTypeEClass.getESuperTypes().add(theCorePackage.getAbstractGlobalEndpointType());
		inboundEndpointTypeEClass.getESuperTypes().add(theCorePackage.getAbstractInboundEndpointType());
		outboundEndpointTypeEClass.getESuperTypes().add(theCorePackage.getAbstractOutboundEndpointType());
		propertyFilterTypeEClass.getESuperTypes().add(theCorePackage.getAbstractFilterType());
		vendorJmsConnectorTypeEClass.getESuperTypes().add(theCorePackage.getConnectorType());

		// Initialize classes and features; add operations and parameters
		initEClass(activeMqConnectorTypeEClass, ActiveMqConnectorType.class, "ActiveMqConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiveMqConnectorType_BrokerURL(), theXMLTypePackage.getString(), "brokerURL", null, 0, 1, ActiveMqConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customConnectorTypeEClass, CustomConnectorType.class, "CustomConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomConnectorType_AcknowledgementMode(), this.getAcknowledgementModeType(), "acknowledgementMode", "AUTO_ACKNOWLEDGE", 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_CacheJmsSessions(), theCorePackage.getSubstitutableBoolean(), "cacheJmsSessions", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_ClientId(), theXMLTypePackage.getString(), "clientId", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_Durable(), theCorePackage.getSubstitutableBoolean(), "durable", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_EagerConsumer(), theCorePackage.getSubstitutableBoolean(), "eagerConsumer", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_HonorQosHeaders(), theCorePackage.getSubstitutableBoolean(), "honorQosHeaders", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_MaxRedelivery(), theCorePackage.getSubstitutableInt(), "maxRedelivery", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_NoLocal(), theCorePackage.getSubstitutableBoolean(), "noLocal", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_PersistentDelivery(), theCorePackage.getSubstitutableBoolean(), "persistentDelivery", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_RecoverJmsConnections(), theCorePackage.getSubstitutableBoolean(), "recoverJmsConnections", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_RedeliveryHandlerRef(), theXMLTypePackage.getNMTOKEN(), "redeliveryHandlerRef", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_Specification(), this.getSpecificationType(), "specification", "1.0.2b", 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomConnectorType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, CustomConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ActivemqConnector(), this.getActiveMqConnectorType(), null, "activemqConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ActivemqXaConnector(), this.getActiveMqConnectorType(), null, "activemqXaConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClientAckTransaction(), theCorePackage.getBaseTransactionType(), null, "clientAckTransaction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Connector(), this.getGenericConnectorType(), null, "connector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CustomConnector(), this.getCustomConnectorType(), null, "customConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Endpoint(), this.getGlobalEndpointType(), null, "endpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InboundEndpoint(), this.getInboundEndpointType(), null, "inboundEndpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_JmsmessageToObjectTransformer(), theCorePackage.getAbstractTransformerType(), null, "jmsmessageToObjectTransformer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectToJmsmessageTransformer(), theCorePackage.getAbstractTransformerType(), null, "objectToJmsmessageTransformer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OutboundEndpoint(), this.getOutboundEndpointType(), null, "outboundEndpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyFilter(), this.getPropertyFilterType(), null, "propertyFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transaction(), theCorePackage.getBaseTransactionType(), null, "transaction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WeblogicConnector(), this.getVendorJmsConnectorType(), null, "weblogicConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WebsphereConnector(), this.getVendorJmsConnectorType(), null, "websphereConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XaTransaction(), theCorePackage.getBaseTransactionType(), null, "xaTransaction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(genericConnectorTypeEClass, GenericConnectorType.class, "GenericConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericConnectorType_AcknowledgementMode(), this.getAcknowledgementModeType(), "acknowledgementMode", "AUTO_ACKNOWLEDGE", 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_CacheJmsSessions(), theCorePackage.getSubstitutableBoolean(), "cacheJmsSessions", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_ClientId(), theXMLTypePackage.getString(), "clientId", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_ConnectionFactoryRef(), theXMLTypePackage.getNMTOKEN(), "connectionFactoryRef", null, 1, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_Durable(), theCorePackage.getSubstitutableBoolean(), "durable", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_EagerConsumer(), theCorePackage.getSubstitutableBoolean(), "eagerConsumer", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_HonorQosHeaders(), theCorePackage.getSubstitutableBoolean(), "honorQosHeaders", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_MaxRedelivery(), theCorePackage.getSubstitutableInt(), "maxRedelivery", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_NoLocal(), theCorePackage.getSubstitutableBoolean(), "noLocal", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_PersistentDelivery(), theCorePackage.getSubstitutableBoolean(), "persistentDelivery", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_RecoverJmsConnections(), theCorePackage.getSubstitutableBoolean(), "recoverJmsConnections", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_RedeliveryHandlerRef(), theXMLTypePackage.getNMTOKEN(), "redeliveryHandlerRef", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_Specification(), this.getSpecificationType(), "specification", "1.0.2b", 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericConnectorType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, GenericConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalEndpointTypeEClass, GlobalEndpointType.class, "GlobalEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalEndpointType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_AbstractTransformerGroup(), ecorePackage.getEFeatureMapEntry(), "abstractTransformerGroup", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_AbstractTransformer(), theCorePackage.getAbstractTransformerType(), null, "abstractTransformer", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_Transformers(), theCorePackage.getTransformersType(), null, "transformers", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_ResponseTransformers(), theCorePackage.getResponseTransformersType(), null, "responseTransformers", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_AbstractTransactionGroup(), ecorePackage.getEFeatureMapEntry(), "abstractTransactionGroup", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_AbstractTransaction(), theCorePackage.getAbstractTransactionType(), null, "abstractTransaction", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_AbstractFilterGroup(), ecorePackage.getEFeatureMapEntry(), "abstractFilterGroup", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_AbstractFilter(), theCorePackage.getAbstractFilterType(), null, "abstractFilter", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_Selector(), this.getJmsSelectorFilter(), null, "selector", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_AbstractSecurityFilterGroup(), ecorePackage.getEFeatureMapEntry(), "abstractSecurityFilterGroup", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_AbstractSecurityFilter(), theCorePackage.getAbstractSecurityFilterType(), null, "abstractSecurityFilter", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalEndpointType_Properties(), theCorePackage.getMapType(), null, "properties", null, 0, -1, GlobalEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_ConnectorRef(), theXMLTypePackage.getNMTOKEN(), "connectorRef", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Encoding(), theXMLTypePackage.getString(), "encoding", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Queue(), theXMLTypePackage.getString(), "queue", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Ref(), theXMLTypePackage.getNMTOKEN(), "ref", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_RemoteSync(), theCorePackage.getSubstitutableBoolean(), "remoteSync", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_RemoteSyncTimeout(), theCorePackage.getSubstitutableInt(), "remoteSyncTimeout", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_ResponseTransformerRefs(), theXMLTypePackage.getNMTOKENS(), "responseTransformerRefs", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Synchronous(), theCorePackage.getSubstitutableBoolean(), "synchronous", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_Topic(), theXMLTypePackage.getString(), "topic", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalEndpointType_TransformerRefs(), theXMLTypePackage.getNMTOKENS(), "transformerRefs", null, 0, 1, GlobalEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inboundEndpointTypeEClass, InboundEndpointType.class, "InboundEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInboundEndpointType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_AbstractTransformerGroup(), ecorePackage.getEFeatureMapEntry(), "abstractTransformerGroup", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_AbstractTransformer(), theCorePackage.getAbstractTransformerType(), null, "abstractTransformer", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_Transformers(), theCorePackage.getTransformersType(), null, "transformers", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_ResponseTransformers(), theCorePackage.getResponseTransformersType(), null, "responseTransformers", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_AbstractTransactionGroup(), ecorePackage.getEFeatureMapEntry(), "abstractTransactionGroup", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_AbstractTransaction(), theCorePackage.getAbstractTransactionType(), null, "abstractTransaction", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_AbstractFilterGroup(), ecorePackage.getEFeatureMapEntry(), "abstractFilterGroup", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_AbstractFilter(), theCorePackage.getAbstractFilterType(), null, "abstractFilter", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_Selector(), this.getJmsSelectorFilter(), null, "selector", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_AbstractSecurityFilterGroup(), ecorePackage.getEFeatureMapEntry(), "abstractSecurityFilterGroup", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_AbstractSecurityFilter(), theCorePackage.getAbstractSecurityFilterType(), null, "abstractSecurityFilter", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInboundEndpointType_Properties(), theCorePackage.getMapType(), null, "properties", null, 0, -1, InboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_ConnectorRef(), theXMLTypePackage.getNMTOKEN(), "connectorRef", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Encoding(), theXMLTypePackage.getString(), "encoding", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Queue(), theXMLTypePackage.getString(), "queue", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Ref(), theXMLTypePackage.getNMTOKEN(), "ref", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_RemoteSync(), theCorePackage.getSubstitutableBoolean(), "remoteSync", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_RemoteSyncTimeout(), theCorePackage.getSubstitutableInt(), "remoteSyncTimeout", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_ResponseTransformerRefs(), theXMLTypePackage.getNMTOKENS(), "responseTransformerRefs", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Synchronous(), theCorePackage.getSubstitutableBoolean(), "synchronous", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_Topic(), theXMLTypePackage.getString(), "topic", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundEndpointType_TransformerRefs(), theXMLTypePackage.getNMTOKENS(), "transformerRefs", null, 0, 1, InboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jmsSelectorFilterEClass, JmsSelectorFilter.class, "JmsSelectorFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJmsSelectorFilter_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1, JmsSelectorFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outboundEndpointTypeEClass, OutboundEndpointType.class, "OutboundEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutboundEndpointType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_AbstractTransformerGroup(), ecorePackage.getEFeatureMapEntry(), "abstractTransformerGroup", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_AbstractTransformer(), theCorePackage.getAbstractTransformerType(), null, "abstractTransformer", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_Transformers(), theCorePackage.getTransformersType(), null, "transformers", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_ResponseTransformers(), theCorePackage.getResponseTransformersType(), null, "responseTransformers", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_AbstractTransactionGroup(), ecorePackage.getEFeatureMapEntry(), "abstractTransactionGroup", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_AbstractTransaction(), theCorePackage.getAbstractTransactionType(), null, "abstractTransaction", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_AbstractFilterGroup(), ecorePackage.getEFeatureMapEntry(), "abstractFilterGroup", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_AbstractFilter(), theCorePackage.getAbstractFilterType(), null, "abstractFilter", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_Selector(), this.getJmsSelectorFilter(), null, "selector", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_AbstractSecurityFilterGroup(), ecorePackage.getEFeatureMapEntry(), "abstractSecurityFilterGroup", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_AbstractSecurityFilter(), theCorePackage.getAbstractSecurityFilterType(), null, "abstractSecurityFilter", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOutboundEndpointType_Properties(), theCorePackage.getMapType(), null, "properties", null, 0, -1, OutboundEndpointType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_ConnectorRef(), theXMLTypePackage.getNMTOKEN(), "connectorRef", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Encoding(), theXMLTypePackage.getString(), "encoding", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Queue(), theXMLTypePackage.getString(), "queue", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Ref(), theXMLTypePackage.getNMTOKEN(), "ref", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_RemoteSync(), theCorePackage.getSubstitutableBoolean(), "remoteSync", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_RemoteSyncTimeout(), theCorePackage.getSubstitutableInt(), "remoteSyncTimeout", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_ResponseTransformerRefs(), theXMLTypePackage.getNMTOKENS(), "responseTransformerRefs", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Synchronous(), theCorePackage.getSubstitutableBoolean(), "synchronous", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_Topic(), theXMLTypePackage.getString(), "topic", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundEndpointType_TransformerRefs(), theXMLTypePackage.getNMTOKENS(), "transformerRefs", null, 0, 1, OutboundEndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyFilterTypeEClass, PropertyFilterType.class, "PropertyFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyFilterType_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1, PropertyFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyFilterType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, PropertyFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyFilterType_PropertyClass(), theXMLTypePackage.getString(), "propertyClass", null, 0, 1, PropertyFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyFilterType_PropertyName(), theXMLTypePackage.getString(), "propertyName", null, 0, 1, PropertyFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorJmsConnectorTypeEClass, VendorJmsConnectorType.class, "VendorJmsConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendorJmsConnectorType_AcknowledgementMode(), this.getAcknowledgementModeType(), "acknowledgementMode", "AUTO_ACKNOWLEDGE", 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_CacheJmsSessions(), theCorePackage.getSubstitutableBoolean(), "cacheJmsSessions", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_ClientId(), theXMLTypePackage.getString(), "clientId", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_ConnectionFactoryRef(), theXMLTypePackage.getNMTOKEN(), "connectionFactoryRef", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_Durable(), theCorePackage.getSubstitutableBoolean(), "durable", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_EagerConsumer(), theCorePackage.getSubstitutableBoolean(), "eagerConsumer", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_HonorQosHeaders(), theCorePackage.getSubstitutableBoolean(), "honorQosHeaders", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_MaxRedelivery(), theCorePackage.getSubstitutableInt(), "maxRedelivery", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_NoLocal(), theCorePackage.getSubstitutableBoolean(), "noLocal", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_Password(), theXMLTypePackage.getString(), "password", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_PersistentDelivery(), theCorePackage.getSubstitutableBoolean(), "persistentDelivery", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_RecoverJmsConnections(), theCorePackage.getSubstitutableBoolean(), "recoverJmsConnections", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_RedeliveryHandlerRef(), theXMLTypePackage.getNMTOKEN(), "redeliveryHandlerRef", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_Specification(), this.getSpecificationType(), "specification", "1.0.2b", 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorJmsConnectorType_Username(), theXMLTypePackage.getString(), "username", null, 0, 1, VendorJmsConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(acknowledgementModeTypeEEnum, AcknowledgementModeType.class, "AcknowledgementModeType");
		addEEnumLiteral(acknowledgementModeTypeEEnum, AcknowledgementModeType.AUTOACKNOWLEDGE);
		addEEnumLiteral(acknowledgementModeTypeEEnum, AcknowledgementModeType.CLIENTACKNOWLEDGE);
		addEEnumLiteral(acknowledgementModeTypeEEnum, AcknowledgementModeType.DUPSOKACKNOWLEDGE);

		initEEnum(specificationTypeEEnum, SpecificationType.class, "SpecificationType");
		addEEnumLiteral(specificationTypeEEnum, SpecificationType._10_2B);
		addEEnumLiteral(specificationTypeEEnum, SpecificationType._11);

		// Initialize data types
		initEDataType(acknowledgementModeTypeObjectEDataType, AcknowledgementModeType.class, "AcknowledgementModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(specificationTypeObjectEDataType, SpecificationType.class, "SpecificationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (acknowledgementModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "acknowledgementMode_._type"
		   });		
		addAnnotation
		  (acknowledgementModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "acknowledgementMode_._type:Object",
			 "baseType", "acknowledgementMode_._type"
		   });		
		addAnnotation
		  (activeMqConnectorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "activeMqConnectorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActiveMqConnectorType_BrokerURL(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "brokerURL"
		   });		
		addAnnotation
		  (customConnectorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "custom-connector_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustomConnectorType_AcknowledgementMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "acknowledgementMode"
		   });		
		addAnnotation
		  (getCustomConnectorType_CacheJmsSessions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cacheJmsSessions"
		   });		
		addAnnotation
		  (getCustomConnectorType_ClientId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientId"
		   });		
		addAnnotation
		  (getCustomConnectorType_Durable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "durable"
		   });		
		addAnnotation
		  (getCustomConnectorType_EagerConsumer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eagerConsumer"
		   });		
		addAnnotation
		  (getCustomConnectorType_HonorQosHeaders(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "honorQosHeaders"
		   });		
		addAnnotation
		  (getCustomConnectorType_MaxRedelivery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxRedelivery"
		   });		
		addAnnotation
		  (getCustomConnectorType_NoLocal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "noLocal"
		   });		
		addAnnotation
		  (getCustomConnectorType_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password"
		   });		
		addAnnotation
		  (getCustomConnectorType_PersistentDelivery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "persistentDelivery"
		   });		
		addAnnotation
		  (getCustomConnectorType_RecoverJmsConnections(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "recoverJmsConnections"
		   });		
		addAnnotation
		  (getCustomConnectorType_RedeliveryHandlerRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "redeliveryHandler-ref"
		   });		
		addAnnotation
		  (getCustomConnectorType_Specification(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specification"
		   });		
		addAnnotation
		  (getCustomConnectorType_Username(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "username"
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
		  (getDocumentRoot_ActivemqConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activemq-connector",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-connector"
		   });		
		addAnnotation
		  (getDocumentRoot_ActivemqXaConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activemq-xa-connector",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-connector"
		   });		
		addAnnotation
		  (getDocumentRoot_ClientAckTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "client-ack-transaction",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction"
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
		  (getDocumentRoot_CustomConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "custom-connector",
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
		  (getDocumentRoot_JmsmessageToObjectTransformer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "jmsmessage-to-object-transformer",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer"
		   });		
		addAnnotation
		  (getDocumentRoot_ObjectToJmsmessageTransformer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object-to-jmsmessage-transformer",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer"
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
		  (getDocumentRoot_PropertyFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property-filter",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-filter"
		   });		
		addAnnotation
		  (getDocumentRoot_Transaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transaction",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction"
		   });		
		addAnnotation
		  (getDocumentRoot_WeblogicConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "weblogic-connector",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-connector"
		   });		
		addAnnotation
		  (getDocumentRoot_WebsphereConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "websphere-connector",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-connector"
		   });		
		addAnnotation
		  (getDocumentRoot_XaTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "xa-transaction",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction"
		   });		
		addAnnotation
		  (genericConnectorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "genericConnectorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGenericConnectorType_AcknowledgementMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "acknowledgementMode"
		   });		
		addAnnotation
		  (getGenericConnectorType_CacheJmsSessions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cacheJmsSessions"
		   });		
		addAnnotation
		  (getGenericConnectorType_ClientId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientId"
		   });		
		addAnnotation
		  (getGenericConnectorType_ConnectionFactoryRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connectionFactory-ref"
		   });		
		addAnnotation
		  (getGenericConnectorType_Durable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "durable"
		   });		
		addAnnotation
		  (getGenericConnectorType_EagerConsumer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eagerConsumer"
		   });		
		addAnnotation
		  (getGenericConnectorType_HonorQosHeaders(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "honorQosHeaders"
		   });		
		addAnnotation
		  (getGenericConnectorType_MaxRedelivery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxRedelivery"
		   });		
		addAnnotation
		  (getGenericConnectorType_NoLocal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "noLocal"
		   });		
		addAnnotation
		  (getGenericConnectorType_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password"
		   });		
		addAnnotation
		  (getGenericConnectorType_PersistentDelivery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "persistentDelivery"
		   });		
		addAnnotation
		  (getGenericConnectorType_RecoverJmsConnections(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "recoverJmsConnections"
		   });		
		addAnnotation
		  (getGenericConnectorType_RedeliveryHandlerRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "redeliveryHandler-ref"
		   });		
		addAnnotation
		  (getGenericConnectorType_Specification(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specification"
		   });		
		addAnnotation
		  (getGenericConnectorType_Username(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "username"
		   });		
		addAnnotation
		  (globalEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "globalEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGlobalEndpointType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractTransformerGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-transformer:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractTransformer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-transformer",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer:group"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Transformers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transformers",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_ResponseTransformers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "response-transformers",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractTransactionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-transaction:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-transaction",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction:group"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractFilterGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-filter:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-filter",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-filter:group"
		   });		
		addAnnotation
		  (getGlobalEndpointType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selector",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractSecurityFilterGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-security-filter:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_AbstractSecurityFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-security-filter",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-security-filter:group"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address"
		   });			
		addAnnotation
		  (getGlobalEndpointType_ConnectorRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connector-ref"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encoding"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Queue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "queue"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });			
		addAnnotation
		  (getGlobalEndpointType_RemoteSync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSync"
		   });			
		addAnnotation
		  (getGlobalEndpointType_RemoteSyncTimeout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSyncTimeout"
		   });			
		addAnnotation
		  (getGlobalEndpointType_ResponseTransformerRefs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "responseTransformer-refs"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Synchronous(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "synchronous"
		   });			
		addAnnotation
		  (getGlobalEndpointType_Topic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "topic"
		   });			
		addAnnotation
		  (getGlobalEndpointType_TransformerRefs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transformer-refs"
		   });		
		addAnnotation
		  (inboundEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "inboundEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInboundEndpointType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractTransformerGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-transformer:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractTransformer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-transformer",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer:group"
		   });			
		addAnnotation
		  (getInboundEndpointType_Transformers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transformers",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_ResponseTransformers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "response-transformers",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractTransactionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-transaction:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-transaction",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction:group"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractFilterGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-filter:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-filter",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-filter:group"
		   });		
		addAnnotation
		  (getInboundEndpointType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selector",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractSecurityFilterGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-security-filter:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_AbstractSecurityFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-security-filter",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-security-filter:group"
		   });			
		addAnnotation
		  (getInboundEndpointType_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInboundEndpointType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address"
		   });			
		addAnnotation
		  (getInboundEndpointType_ConnectorRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connector-ref"
		   });			
		addAnnotation
		  (getInboundEndpointType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encoding"
		   });			
		addAnnotation
		  (getInboundEndpointType_Queue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "queue"
		   });			
		addAnnotation
		  (getInboundEndpointType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });			
		addAnnotation
		  (getInboundEndpointType_RemoteSync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSync"
		   });			
		addAnnotation
		  (getInboundEndpointType_RemoteSyncTimeout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSyncTimeout"
		   });			
		addAnnotation
		  (getInboundEndpointType_ResponseTransformerRefs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "responseTransformer-refs"
		   });			
		addAnnotation
		  (getInboundEndpointType_Synchronous(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "synchronous"
		   });			
		addAnnotation
		  (getInboundEndpointType_Topic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "topic"
		   });			
		addAnnotation
		  (getInboundEndpointType_TransformerRefs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transformer-refs"
		   });			
		addAnnotation
		  (jmsSelectorFilterEClass, 
		   source, 
		   new String[] {
			 "name", "jmsSelectorFilter",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getJmsSelectorFilter_Expression(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expression"
		   });		
		addAnnotation
		  (outboundEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "outboundEndpointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOutboundEndpointType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractTransformerGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-transformer:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractTransformer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-transformer",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer:group"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Transformers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transformers",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_ResponseTransformers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "response-transformers",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractTransactionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-transaction:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-transaction",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction:group"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractFilterGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-filter:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-filter",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-filter:group"
		   });		
		addAnnotation
		  (getOutboundEndpointType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selector",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractSecurityFilterGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-security-filter:group",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_AbstractSecurityFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-security-filter",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "http://www.mulesource.org/schema/mule/core/2.0#abstract-security-filter:group"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "http://www.mulesource.org/schema/mule/core/2.0",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address"
		   });			
		addAnnotation
		  (getOutboundEndpointType_ConnectorRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connector-ref"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encoding"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Queue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "queue"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });			
		addAnnotation
		  (getOutboundEndpointType_RemoteSync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSync"
		   });			
		addAnnotation
		  (getOutboundEndpointType_RemoteSyncTimeout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSyncTimeout"
		   });			
		addAnnotation
		  (getOutboundEndpointType_ResponseTransformerRefs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "responseTransformer-refs"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Synchronous(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "synchronous"
		   });			
		addAnnotation
		  (getOutboundEndpointType_Topic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "topic"
		   });			
		addAnnotation
		  (getOutboundEndpointType_TransformerRefs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transformer-refs"
		   });		
		addAnnotation
		  (propertyFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "property-filter_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPropertyFilterType_Expression(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expression"
		   });		
		addAnnotation
		  (getPropertyFilterType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pattern"
		   });		
		addAnnotation
		  (getPropertyFilterType_PropertyClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "propertyClass"
		   });		
		addAnnotation
		  (getPropertyFilterType_PropertyName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "propertyName"
		   });		
		addAnnotation
		  (specificationTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "specification_._type"
		   });		
		addAnnotation
		  (specificationTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "specification_._type:Object",
			 "baseType", "specification_._type"
		   });		
		addAnnotation
		  (vendorJmsConnectorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "vendorJmsConnectorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_AcknowledgementMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "acknowledgementMode"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_CacheJmsSessions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cacheJmsSessions"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_ClientId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientId"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_ConnectionFactoryRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connectionFactory-ref"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_Durable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "durable"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_EagerConsumer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eagerConsumer"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_HonorQosHeaders(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "honorQosHeaders"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_MaxRedelivery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxRedelivery"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_NoLocal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "noLocal"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_PersistentDelivery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "persistentDelivery"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_RecoverJmsConnections(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "recoverJmsConnections"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_RedeliveryHandlerRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "redeliveryHandler-ref"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_Specification(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specification"
		   });		
		addAnnotation
		  (getVendorJmsConnectorType_Username(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "username"
		   });
	}
	private List<IGlobalElementType> connectorTypes = null;
	public List<IGlobalElementType> getConnectorTypes() {
		if (connectorTypes == null) {
			List<IGlobalElementType> results = new ArrayList<IGlobalElementType>();
			
			results.add(new DefaultGlobalElementType(
					getGenericConnectorType(),
					getDocumentRoot_Connector()));
			results.add(new DefaultGlobalElementType(
					getCustomConnectorType(),
					getDocumentRoot_CustomConnector()));
			results.add(new DefaultGlobalElementType(
					getActiveMqConnectorType(),
					getDocumentRoot_ActivemqConnector()));
			results.add(new DefaultGlobalElementType(
					getActiveMqConnectorType(),
					getDocumentRoot_ActivemqXaConnector()));
			results.add(new DefaultGlobalElementType(
					getVendorJmsConnectorType(),
					getDocumentRoot_WeblogicConnector()));
			results.add(new DefaultGlobalElementType(
					getVendorJmsConnectorType(),
					getDocumentRoot_WebsphereConnector()));
			
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
			List<IGlobalElementType> results = new ArrayList<IGlobalElementType>();
			
			results.add(new DefaultGlobalElementType(
					getPropertyFilterType(),
					getDocumentRoot_PropertyFilter()));

			filterTypes = results;
		}
		return filterTypes;	
	}
	
	private List<IGlobalElementType> transformerTypes = null;
	public List<IGlobalElementType> getTransformerTypes() {
		if (transformerTypes == null) {
			List<IGlobalElementType> results = new ArrayList<IGlobalElementType>();
			
			results.add(new DefaultGlobalElementType(
					CorePackage.eINSTANCE.getAbstractTransformerType(),
					getDocumentRoot_JmsmessageToObjectTransformer()));
			results.add(new DefaultGlobalElementType(
					CorePackage.eINSTANCE.getAbstractTransformerType(),
					getDocumentRoot_ObjectToJmsmessageTransformer()));

			transformerTypes = results;
		}
		return transformerTypes;	
	}

} //JMSPackageImpl
