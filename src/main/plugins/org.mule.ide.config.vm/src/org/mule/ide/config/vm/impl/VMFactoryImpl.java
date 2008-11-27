/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.vm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mule.ide.config.vm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VMFactoryImpl extends EFactoryImpl implements VMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VMFactory init() {
		try {
			VMFactory theVMFactory = (VMFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mulesource.org/schema/mule/vm/2.0"); 
			if (theVMFactory != null) {
				return theVMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VMPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case VMPackage.GLOBAL_ENDPOINT_TYPE: return createGlobalEndpointType();
			case VMPackage.INBOUND_ENDPOINT_TYPE: return createInboundEndpointType();
			case VMPackage.OUTBOUND_ENDPOINT_TYPE: return createOutboundEndpointType();
			case VMPackage.VM_CONNECTOR_TYPE: return createVmConnectorType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalEndpointType createGlobalEndpointType() {
		GlobalEndpointTypeImpl globalEndpointType = new GlobalEndpointTypeImpl();
		return globalEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundEndpointType createInboundEndpointType() {
		InboundEndpointTypeImpl inboundEndpointType = new InboundEndpointTypeImpl();
		return inboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundEndpointType createOutboundEndpointType() {
		OutboundEndpointTypeImpl outboundEndpointType = new OutboundEndpointTypeImpl();
		return outboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmConnectorType createVmConnectorType() {
		VmConnectorTypeImpl vmConnectorType = new VmConnectorTypeImpl();
		return vmConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMPackage getVMPackage() {
		return (VMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VMPackage getPackage() {
		return VMPackage.eINSTANCE;
	}

} //VMFactoryImpl
