/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.axis.*;

import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.ConnectorType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.axis.AxisPackage
 * @generated
 */
public class AxisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AxisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AxisPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisSwitch<Adapter> modelSwitch =
		new AxisSwitch<Adapter>() {
			@Override
			public Adapter caseAxisConnectorType(AxisConnectorType object) {
				return createAxisConnectorTypeAdapter();
			}
			@Override
			public Adapter caseBeanTypeType(BeanTypeType object) {
				return createBeanTypeTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGlobalEndpointType(GlobalEndpointType object) {
				return createGlobalEndpointTypeAdapter();
			}
			@Override
			public Adapter caseInboundEndpointType(InboundEndpointType object) {
				return createInboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseOptionsType(OptionsType object) {
				return createOptionsTypeAdapter();
			}
			@Override
			public Adapter caseOutboundEndpointType(OutboundEndpointType object) {
				return createOutboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseSoapMethodType(SoapMethodType object) {
				return createSoapMethodTypeAdapter();
			}
			@Override
			public Adapter caseSoapParameterType(SoapParameterType object) {
				return createSoapParameterTypeAdapter();
			}
			@Override
			public Adapter caseSoapReturnType(SoapReturnType object) {
				return createSoapReturnTypeAdapter();
			}
			@Override
			public Adapter caseSoapServiceType(SoapServiceType object) {
				return createSoapServiceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractConnectorType(AbstractConnectorType object) {
				return createAbstractConnectorTypeAdapter();
			}
			@Override
			public Adapter caseConnectorType(ConnectorType object) {
				return createConnectorTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGlobalEndpointType(AbstractGlobalEndpointType object) {
				return createAbstractGlobalEndpointTypeAdapter();
			}
			@Override
			public Adapter caseGlobalEndpointType_1(org.mule.ide.config.core.GlobalEndpointType object) {
				return createGlobalEndpointType_1Adapter();
			}
			@Override
			public Adapter caseAbstractInboundEndpointType(AbstractInboundEndpointType object) {
				return createAbstractInboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseInboundEndpointType_1(org.mule.ide.config.core.InboundEndpointType object) {
				return createInboundEndpointType_1Adapter();
			}
			@Override
			public Adapter caseAbstractOutboundEndpointType(AbstractOutboundEndpointType object) {
				return createAbstractOutboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseOutboundEndpointType_1(org.mule.ide.config.core.OutboundEndpointType object) {
				return createOutboundEndpointType_1Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.AxisConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.AxisConnectorType
	 * @generated
	 */
	public Adapter createAxisConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.BeanTypeType <em>Bean Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.BeanTypeType
	 * @generated
	 */
	public Adapter createBeanTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.GlobalEndpointType
	 * @generated
	 */
	public Adapter createGlobalEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.InboundEndpointType
	 * @generated
	 */
	public Adapter createInboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.OptionsType <em>Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.OptionsType
	 * @generated
	 */
	public Adapter createOptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.OutboundEndpointType
	 * @generated
	 */
	public Adapter createOutboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.SoapMethodType <em>Soap Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.SoapMethodType
	 * @generated
	 */
	public Adapter createSoapMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.SoapParameterType <em>Soap Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.SoapParameterType
	 * @generated
	 */
	public Adapter createSoapParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.SoapReturnType <em>Soap Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.SoapReturnType
	 * @generated
	 */
	public Adapter createSoapReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.axis.SoapServiceType <em>Soap Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.axis.SoapServiceType
	 * @generated
	 */
	public Adapter createSoapServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractConnectorType <em>Abstract Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractConnectorType
	 * @generated
	 */
	public Adapter createAbstractConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractGlobalEndpointType <em>Abstract Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractGlobalEndpointType
	 * @generated
	 */
	public Adapter createAbstractGlobalEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.GlobalEndpointType
	 * @generated
	 */
	public Adapter createGlobalEndpointType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractInboundEndpointType <em>Abstract Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractInboundEndpointType
	 * @generated
	 */
	public Adapter createAbstractInboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.InboundEndpointType
	 * @generated
	 */
	public Adapter createInboundEndpointType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractOutboundEndpointType <em>Abstract Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractOutboundEndpointType
	 * @generated
	 */
	public Adapter createAbstractOutboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.OutboundEndpointType
	 * @generated
	 */
	public Adapter createOutboundEndpointType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AxisAdapterFactory
