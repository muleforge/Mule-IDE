/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.mule.ide.config.common.impl.SyncResourceImpl;
import org.mule.ide.config.common.impl.SyncXMLSaveImpl;
import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.PlaceholderSupport;
import org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl;
import org.mule.ide.config.core.impl.InboundCollectionTypeImpl;
import org.mule.ide.config.core.impl.OutboundCollectionTypeImpl;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.util.CoreResourceFactoryImpl
 * customization
 *   - use SyncResourceImpl
 */
public class CoreResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public CoreResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public Map<Object, Object> getDefaultLoadOptions() {
		Map<Object, Object> defaults = super.getDefaultLoadOptions();
		defaults.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		return defaults;
	}
	
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		super.doLoad(inputStream, options);
		createPlaceholders();
	}

	@Override
	public void doLoad(Node node, Map<?, ?> options) throws IOException {
		super.doLoad(node, options);
		createPlaceholders();
	}
	
	private void createPlaceholders() {
		// TODO factor this out, probably into a ResourceHandler
		EList<EObject> contents = getContents();
		MuleType mule = ((DocumentRoot) contents.get(0)).getMule();
		if (mule == null) return;
		
		EList<AbstractModelType> models = mule.getAbstractModel();
		for (AbstractModelType model : models) {
			EList<AbstractServiceType> services = model.getAbstractService();
			for (AbstractServiceType service : services) {
				if (service instanceof BaseServiceType) {
					addIDEPlaceholders((BaseServiceType) service);
				}
			}
		}
	}
	
	// TODO factor this out into something used by 
	private void addIDEPlaceholders(BaseServiceType service) {
		EClass collectionClass;
		EReference collectionContainer;
		EObject result;
		
		if (service.getInbound() == null) {
			collectionClass = CorePackage.eINSTANCE
					.getInboundCollectionType();
			collectionContainer = CorePackage.eINSTANCE
					.getBaseServiceType_Inbound();
			result = collectionClass.getEPackage().getEFactoryInstance().create(collectionClass);
			((InboundCollectionTypeImpl) result).setIDEPlaceholder();
			service.eSet(collectionContainer, result);
		}
		
		if (service.getAsyncReply() == null) {
			collectionClass = CorePackage.eINSTANCE
					.getAsyncReplyCollectionType();
			collectionContainer = CorePackage.eINSTANCE
					.getBaseServiceType_AsyncReply();
			result = collectionClass.getEPackage().getEFactoryInstance().create(collectionClass);
			((AsyncReplyCollectionTypeImpl) result).setIDEPlaceholder();
			service.eSet(collectionContainer, result);
		}
		
		if (service.getOutbound() == null) {
			collectionClass = CorePackage.eINSTANCE
					.getOutboundCollectionType();
			collectionContainer = CorePackage.eINSTANCE
					.getBaseServiceType_Outbound();
			result = collectionClass.getEPackage().getEFactoryInstance().create(collectionClass);
			((OutboundCollectionTypeImpl) result).setIDEPlaceholder();
			service.eSet(collectionContainer, result);
		}
	}

	protected XMLSave createXMLSave()
	{
		// TODO factor this out, probably into a ResourceHandler
		return new CustomXMLSaveImpl(createXMLHelper());
	}

	/*
	 * Customize the save impl to look for ide "placeholder" elements
	 * in the model.  Prune those out.
	 */
	class CustomXMLSaveImpl extends XMLSaveImpl {
		
		CustomXMLSaveImpl(XMLHelper helper) {
			super(helper);
		}
		
		protected boolean shouldSaveFeature(EObject o, EStructuralFeature f)
		{
			Object child = o.eGet(f);
			if (child instanceof PlaceholderSupport) {
				return ! ((PlaceholderSupport)child).isIDEPlaceholder();
			}
			/*	
			 			EClass eClass = o.eClass();
			
			// Ted's implementation:
			if (CorePackage.eINSTANCE.getBaseServiceType().isSuperTypeOf(eClass)) {
				if (f.equals(CorePackage.eINSTANCE.getBaseServiceType_Inbound())
						&& ((BaseServiceTypeImpl) o).getInbound() != null
						&& ((InboundCollectionTypeImpl) ((BaseServiceTypeImpl) o).getInbound()).isIDEPlaceholder()) {
					return false;
				}
				if (f.equals(CorePackage.eINSTANCE.getBaseServiceType_AsyncReply())
						&& ((BaseServiceTypeImpl) o).getAsyncReply() != null
						&& ((AsyncReplyCollectionTypeImpl) ((BaseServiceTypeImpl) o).getAsyncReply()).isIDEPlaceholder()) {
					return false;
				}
				if (f.equals(CorePackage.eINSTANCE.getBaseServiceType_Outbound())
						&& ((BaseServiceTypeImpl) o).getOutbound() != null
						&& ((OutboundCollectionTypeImpl) ((BaseServiceTypeImpl) o).getOutbound()).isIDEPlaceholder()) {
					return false;
				}
			}
	*/		    
			return super.shouldSaveFeature(o, f);
		}
	}
	
} //CoreResourceImpl
