package org.mule.ide.config.common.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncHandler;
import org.mule.ide.config.common.SyncResource;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class SyncSAXXMLHandler extends SAXXMLHandler implements SyncHandler {

	protected Node currentNode;

	protected Set<EObject> addedObjects = new HashSet<EObject>();

	public SyncSAXXMLHandler(XMLResource xmlResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmlResource, helper, options);

		if (!(xmlResource instanceof SyncResource)) {
			throw new RuntimeException(
					"SyncSAXXMLHandler expects a SyncResource resource");
		}
	}

	public void setCurrentNode(Node node) {
		this.currentNode = node;
	}

	@Override
	protected void processObject(EObject object) {
		super.processObject(object);
		adapt(object);
	}

	private EObject adapt(EObject object) {
		if (object instanceof Resource)
			return null;

		SyncAdapter newAdapter = createAdapter(object, currentNode);
		newAdapter.wireAdapters();

		addedObjects.add(object);
		return object;
	}

	private SyncAdapter createAdapter(EObject object, Node currentNode) {
		return new SyncAdapterImpl(object, (IDOMNode) currentNode,
				(SyncResource) xmlResource);
	}

	@Override
	protected void handleObjectAttribs(EObject obj) {
		
		// TODO: Break in and record the feature nodes.
		
		if (attribs != null) {
			InternalEObject internalEObject = (InternalEObject) obj;
			for (int i = 0, size = attribs.getLength(); i < size; ++i) {
				String name = attribs.getQName(i);
				if (name.equals(idAttribute)) {
					xmlResource.setID(internalEObject, attribs.getValue(i));
				} else if (name.equals(hrefAttribute)
						&& (!recordUnknownFeature || types.peek() != UNKNOWN_FEATURE_TYPE)) {
					handleProxy(internalEObject, attribs.getValue(i));
				} else if (!name.startsWith(XMLResource.XML_NS)
						&& !notFeatures.contains(name)) {
					setAttribValue(obj, name, attribs.getValue(i));
				}
			}
		}
	}

	@Override
	protected void handleFeature(String prefix, String name) {
	    EObject peekObject = objects.peekEObject();

	    // This happens when processing an element with simple content that has elements content even though it shouldn't.
	    //
	    if (peekObject == null)
	    {
	      types.push(ERROR_TYPE);
	      error
	        (new FeatureNotFoundException
	          (name,
	           null,
	           getLocation(),
	           getLineNumber(),
	           getColumnNumber()));
	      return;
	    }

	    if (currentNode != null && currentNode instanceof Element) {
	    	EStructuralFeature feature = getFeature(peekObject, prefix, name, true);
	    	SyncAdapter sync = (SyncAdapter)EcoreUtil.getExistingAdapter(peekObject, SyncAdapter.class);
	    	if (sync != null) sync.setFeatureElement(feature, (Element)currentNode);
	    }
	    super.handleFeature(prefix, name);
	}
	
	protected EObject createObject(EFactory eFactory, EClassifier type, boolean documentRoot) {
		EObject obj = super.createObject(eFactory, type, documentRoot);
		if (obj != null) {
			adapt(obj);
		}
		return obj;
	}

}
