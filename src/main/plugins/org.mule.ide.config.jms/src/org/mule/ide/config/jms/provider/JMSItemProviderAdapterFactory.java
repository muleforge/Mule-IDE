/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.mule.ide.config.jms.util.JMSAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JMSItemProviderAdapterFactory extends JMSAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.ActiveMqConnectorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveMqConnectorTypeItemProvider activeMqConnectorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.ActiveMqConnectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActiveMqConnectorTypeAdapter() {
		if (activeMqConnectorTypeItemProvider == null) {
			activeMqConnectorTypeItemProvider = new ActiveMqConnectorTypeItemProvider(this);
		}

		return activeMqConnectorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.CustomConnectorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomConnectorTypeItemProvider customConnectorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.CustomConnectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomConnectorTypeAdapter() {
		if (customConnectorTypeItemProvider == null) {
			customConnectorTypeItemProvider = new CustomConnectorTypeItemProvider(this);
		}

		return customConnectorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.GenericConnectorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericConnectorTypeItemProvider genericConnectorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.GenericConnectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericConnectorTypeAdapter() {
		if (genericConnectorTypeItemProvider == null) {
			genericConnectorTypeItemProvider = new GenericConnectorTypeItemProvider(this);
		}

		return genericConnectorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.GlobalEndpointType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalEndpointTypeItemProvider globalEndpointTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.GlobalEndpointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalEndpointTypeAdapter() {
		if (globalEndpointTypeItemProvider == null) {
			globalEndpointTypeItemProvider = new GlobalEndpointTypeItemProvider(this);
		}

		return globalEndpointTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.InboundEndpointType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InboundEndpointTypeItemProvider inboundEndpointTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.InboundEndpointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInboundEndpointTypeAdapter() {
		if (inboundEndpointTypeItemProvider == null) {
			inboundEndpointTypeItemProvider = new InboundEndpointTypeItemProvider(this);
		}

		return inboundEndpointTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.JmsSelectorFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JmsSelectorFilterItemProvider jmsSelectorFilterItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.JmsSelectorFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJmsSelectorFilterAdapter() {
		if (jmsSelectorFilterItemProvider == null) {
			jmsSelectorFilterItemProvider = new JmsSelectorFilterItemProvider(this);
		}

		return jmsSelectorFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.JmsTransactionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JmsTransactionTypeItemProvider jmsTransactionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.JmsTransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJmsTransactionTypeAdapter() {
		if (jmsTransactionTypeItemProvider == null) {
			jmsTransactionTypeItemProvider = new JmsTransactionTypeItemProvider(this);
		}

		return jmsTransactionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.OutboundEndpointType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutboundEndpointTypeItemProvider outboundEndpointTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.OutboundEndpointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutboundEndpointTypeAdapter() {
		if (outboundEndpointTypeItemProvider == null) {
			outboundEndpointTypeItemProvider = new OutboundEndpointTypeItemProvider(this);
		}

		return outboundEndpointTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.PropertyFilterType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyFilterTypeItemProvider propertyFilterTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.PropertyFilterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyFilterTypeAdapter() {
		if (propertyFilterTypeItemProvider == null) {
			propertyFilterTypeItemProvider = new PropertyFilterTypeItemProvider(this);
		}

		return propertyFilterTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mule.ide.config.jms.VendorJmsConnectorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendorJmsConnectorTypeItemProvider vendorJmsConnectorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mule.ide.config.jms.VendorJmsConnectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVendorJmsConnectorTypeAdapter() {
		if (vendorJmsConnectorTypeItemProvider == null) {
			vendorJmsConnectorTypeItemProvider = new VendorJmsConnectorTypeItemProvider(this);
		}

		return vendorJmsConnectorTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (activeMqConnectorTypeItemProvider != null) activeMqConnectorTypeItemProvider.dispose();
		if (customConnectorTypeItemProvider != null) customConnectorTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (genericConnectorTypeItemProvider != null) genericConnectorTypeItemProvider.dispose();
		if (globalEndpointTypeItemProvider != null) globalEndpointTypeItemProvider.dispose();
		if (inboundEndpointTypeItemProvider != null) inboundEndpointTypeItemProvider.dispose();
		if (jmsSelectorFilterItemProvider != null) jmsSelectorFilterItemProvider.dispose();
		if (jmsTransactionTypeItemProvider != null) jmsTransactionTypeItemProvider.dispose();
		if (outboundEndpointTypeItemProvider != null) outboundEndpointTypeItemProvider.dispose();
		if (propertyFilterTypeItemProvider != null) propertyFilterTypeItemProvider.dispose();
		if (vendorJmsConnectorTypeItemProvider != null) vendorJmsConnectorTypeItemProvider.dispose();
	}

}
