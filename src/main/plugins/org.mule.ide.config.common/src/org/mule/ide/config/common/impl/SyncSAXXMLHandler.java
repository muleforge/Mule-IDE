package org.mule.ide.config.common.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncHandler;
import org.mule.ide.config.common.SyncResource;
import org.mule.ide.config.common.SyncXMLHelper;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.helpers.AttributesImpl;

public class SyncSAXXMLHandler extends SAXXMLHandler implements SyncHandler {

	protected Node currentNode;

	class ReloaderFrame {
		public Set<EStructuralFeature> affectedFeatures;
		public EObject currentObject;
		public EStructuralFeature currentFeature;
		public int currentIndex;
	}

	protected Stack<ReloaderFrame> frames;

	protected boolean wasReusedObject = false;
	protected EStructuralFeature currentFeature;
	protected int currentIndex;
	protected Set<EStructuralFeature> affectedFeatures;

	private boolean reloading;

	public SyncSAXXMLHandler(XMLResource xmlResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmlResource, helper, options);

		if (!(xmlResource instanceof SyncResource)) {
			throw new RuntimeException(
					"SyncSAXXMLHandler expects a SyncResource resource");
		}
	}

	public void reset() {
		currentNode = null;

		reloading = false;

		frames = new Stack<ReloaderFrame>();

		currentFeature = null;
		currentIndex = 0;
	}

	public void initReload(Element e, EObject anchor) {
		reloading = true;
		setCurrentNode(e);
		objects.push(anchor);
		elements.push(e.getNodeName());
//		documentRoot = anchor.eResource().getContents().get(0);
		((SyncXMLHelperImpl) helper).initReload(e, anchor);
	}

	public void setCurrentNode(Node node) {
		this.currentNode = node;
		if (helper instanceof SyncXMLHelper && node != null
				&& node.getNodeType() == Node.ELEMENT_NODE) {
			((SyncXMLHelper) helper).setCurrentElement((Element) node);
		}
	}

	@Override
	protected void processObject(EObject object) {
		super.processObject(object);
		adapt(object);
	}

	private EObject adapt(EObject object) {
		if (object instanceof Resource)
			return null;

		if (EcoreUtil.getExistingAdapter(object, SyncAdapter.class) == null) {

			Node domNode = currentNode;
			if (objects.isEmpty() || objects.get(0) == object) {
				domNode = domNode.getOwnerDocument();
			}
			
			SyncAdapter newAdapter = createAdapter(object, domNode);
			newAdapter.wireAdapters();
		}
		return object;
	}

	private SyncAdapter createAdapter(EObject object, Node currentNode) {
		return new SyncAdapterImpl(object, currentNode,
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

		// This happens when processing an element with simple content that has
		// elements content even though it shouldn't.
		//
		if (peekObject == null) {
			types.push(ERROR_TYPE);
			error(new FeatureNotFoundException(name, null, getLocation(),
					getLineNumber(), getColumnNumber()));
			return;
		}

		if (currentNode != null && currentNode instanceof Element) {
			EStructuralFeature feature = getFeature(peekObject, prefix, name,
					true);
			SyncAdapter sync = (SyncAdapter) EcoreUtil.getExistingAdapter(
					peekObject, SyncAdapter.class);
			if (feature != null) {
				EStructuralFeature groupFeature = this.extendedMetaData
						.getGroup(feature);
				while (groupFeature != null && groupFeature != null) {
					feature = groupFeature;
					groupFeature = this.extendedMetaData.getGroup(feature);
				}
			}
			if (sync != null && feature != null && !feature.isTransient()) {
				if (feature.isMany()) {
					Collection<?> c = (Collection<?>) peekObject.eGet(feature);
					if (c == null ? true : c.isEmpty())
						sync.setFeatureElement(feature, (Element) currentNode);
				} else {
					sync.setFeatureElement(feature, (Element) currentNode);
				}
			}
		}
		super.handleFeature(prefix, name);
	}

	protected EObject createObject(EFactory eFactory, EClassifier type,
			boolean documentRoot) {
		EObject obj = super.createObject(eFactory, type, documentRoot);
		if (obj != null) {
			adapt(obj);
		}
		return obj;
	}

	@Deprecated
	protected EObject createObjectFromFactory(EFactory factory, String typeName) {
		EObject o = super.createObjectFromFactory(factory, typeName);
		if (o != null)
			adapt(o);
		return o;
	}

	@Override
	protected void setFeatureValue(EObject object, EStructuralFeature feature,
			Object value, int position) {
		super.setFeatureValue(object, feature, value, position);
	}

	public void updateAttribute(EObject object, String attrName,
			String attrValue) {
		setAttribValue(object, attrName, attrValue);
	}

	public void removeAttribute(EObject obj, String name) {
		int index = name.indexOf(':', 0);

		// We use null here instead of "" because an attribute without a prefix
		// is considered to have the null target namespace...
		String prefix = null;
		String localName = name;
		if (index != -1) {
			prefix = name.substring(0, index);
			localName = name.substring(index + 1);
		}
		EStructuralFeature feature = getFeature(obj, prefix, localName, false);
		if (feature != null) {
			obj.eUnset(feature);
		}
	}

	public void startAnchorElement(EObject anchor, AttributesImpl attrs) {
		helper.pushContext();
		setAttributes(attrs);
		handleObjectAttribs(anchor);
				
		// check for simple feature
		if (extendedMetaData != null) {
			EStructuralFeature simpleFeature = extendedMetaData
					.getSimpleFeature(anchor.eClass());
			if (simpleFeature != null) {
				isSimpleFeature = true;
				isIDREF = simpleFeature instanceof EReference;
				objects.push(null);
				mixedTargets.push(null);
				types.push(simpleFeature);
				text = new StringBuffer();
			} else {
				types.push(OBJECT_TYPE);
			}
		}

	}

}
