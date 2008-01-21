package org.mule.ide.config.common.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.mule.ide.config.common.SyncHandler;
import org.mule.ide.config.common.SyncResource;
import org.w3c.dom.Node;

public class SyncSAXXMLHandler extends SAXXMLHandler implements SyncHandler {

	protected Node currentNode;
	
	protected Set<EObject> addedObjects = new HashSet<EObject>(); 
	
	public SyncSAXXMLHandler(XMLResource xmlResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmlResource, helper, options);
		
		if (!(xmlResource instanceof SyncResource)) {
			throw new RuntimeException("SyncSAXXMLHandler expects a SyncResource resource");
		}
	}

	@Override
	public void setCurrentNode(Node node) {
		this.currentNode = node;
	}

	@Override
	protected void processObject(EObject object) {
		super.processObject(object);
		adapt(object);
	}
	
	private EObject adapt(EObject object) {
		if (object instanceof Resource) return null;
		
		Adapter newAdapter = createAdapter(object, currentNode);
		EList<Adapter> adapters = ((SyncResource)xmlResource).eAdapters();
		adapters.add(newAdapter);
		
		addedObjects.add(object);
		return object;
	}

	private Adapter createAdapter(EObject object, Node currentNode) {
		return new SyncAdapterImpl(object, (IDOMNode)currentNode, (SyncResource)xmlResource);
	}
}
