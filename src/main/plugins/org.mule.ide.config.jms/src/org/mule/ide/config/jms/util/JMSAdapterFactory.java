/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.AbstractTransactionType;
import org.mule.ide.config.core.ConnectorType;

import org.mule.ide.config.jms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.jms.JMSPackage
 * @generated
 */
public class JMSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JMSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JMSPackage.eINSTANCE;
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
	protected JMSSwitch<Adapter> modelSwitch =
		new JMSSwitch<Adapter>() {
			@Override
			public Adapter caseActiveMqConnectorType(ActiveMqConnectorType object) {
				return createActiveMqConnectorTypeAdapter();
			}
			@Override
			public Adapter caseCustomConnectorType(CustomConnectorType object) {
				return createCustomConnectorTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGenericConnectorType(GenericConnectorType object) {
				return createGenericConnectorTypeAdapter();
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
			public Adapter caseJmsSelectorFilter(JmsSelectorFilter object) {
				return createJmsSelectorFilterAdapter();
			}
			@Override
			public Adapter caseOutboundEndpointType(OutboundEndpointType object) {
				return createOutboundEndpointTypeAdapter();
			}
			@Override
			public Adapter casePropertyFilterType(PropertyFilterType object) {
				return createPropertyFilterTypeAdapter();
			}
			@Override
			public Adapter caseVendorJmsConnectorType(VendorJmsConnectorType object) {
				return createVendorJmsConnectorTypeAdapter();
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
			public Adapter caseCustomConnectorType_1(org.mule.ide.config.core.CustomConnectorType object) {
				return createCustomConnectorType_1Adapter();
			}
			@Override
			public Adapter caseAbstractGlobalEndpointType(AbstractGlobalEndpointType object) {
				return createAbstractGlobalEndpointTypeAdapter();
			}
			@Override
			public Adapter caseAbstractInboundEndpointType(AbstractInboundEndpointType object) {
				return createAbstractInboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseAbstractOutboundEndpointType(AbstractOutboundEndpointType object) {
				return createAbstractOutboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFilterType(AbstractFilterType object) {
				return createAbstractFilterTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.ActiveMqConnectorType <em>Active Mq Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.ActiveMqConnectorType
	 * @generated
	 */
	public Adapter createActiveMqConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.CustomConnectorType <em>Custom Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.CustomConnectorType
	 * @generated
	 */
	public Adapter createCustomConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.GenericConnectorType <em>Generic Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.GenericConnectorType
	 * @generated
	 */
	public Adapter createGenericConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.GlobalEndpointType
	 * @generated
	 */
	public Adapter createGlobalEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.InboundEndpointType
	 * @generated
	 */
	public Adapter createInboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.JmsSelectorFilter <em>Jms Selector Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.JmsSelectorFilter
	 * @generated
	 */
	public Adapter createJmsSelectorFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.OutboundEndpointType
	 * @generated
	 */
	public Adapter createOutboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.PropertyFilterType <em>Property Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.PropertyFilterType
	 * @generated
	 */
	public Adapter createPropertyFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.jms.VendorJmsConnectorType <em>Vendor Jms Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.jms.VendorJmsConnectorType
	 * @generated
	 */
	public Adapter createVendorJmsConnectorTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomConnectorType <em>Custom Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomConnectorType
	 * @generated
	 */
	public Adapter createCustomConnectorType_1Adapter() {
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
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractFilterType <em>Abstract Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractFilterType
	 * @generated
	 */
	public Adapter createAbstractFilterTypeAdapter() {
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

} //JMSAdapterFactory
