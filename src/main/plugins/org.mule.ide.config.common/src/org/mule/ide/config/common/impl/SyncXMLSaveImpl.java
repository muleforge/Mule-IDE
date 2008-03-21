package org.mule.ide.config.common.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.DOMHandler;
import org.eclipse.emf.ecore.xmi.NameInfo;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.DefaultDOMHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.NameInfoImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncResource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class SyncXMLSaveImpl extends XMLSaveImpl implements XMLSave {

	public class FeatureCursor {

		public FeatureCursor(Element parent) {
			this.parentElement = parent;
		}

		public Element parentElement;
		public Element firstElement;
		public Node previousNode;
		public Element lastElement;
		public Node nextNode;

		public Element currentElement = null;
		boolean pastTheEnd = false;

		public Element reuseElement(NameInfo nameInfo) {
			return createElement(nameInfo, true);
		}

		public Element insertElement(NameInfo nameInfo) {
			return createElement(nameInfo, false);
		}

		private Element createElement(NameInfo nameInfo, boolean tryReuse) {
			// Try to match first
			if (tryReuse) {
				while (currentElement != null) {
					Element candidate = currentElement;
					if (nameInfo.getNamespaceURI().equals(
							currentElement.getNamespaceURI())
							&& nameInfo.getLocalPart().equals(
									currentElement.getLocalName())) {
						// Fine, we can reuse this element...
						advance();
						return candidate;
					} else {
						advance();
						parentElement.removeChild(candidate);
					}
				}
			}

			// Was there no element?
			Element newE = parentElement.getOwnerDocument().createElementNS(
					nameInfo.getNamespaceURI(), nameInfo.getQualifiedName());
			parentElement.insertBefore(newE, nextNode);
			SyncUtilities.indent(newE);
			return newE;
		}

		/**
		 * Advance 'currentElement' to next interesting element. currentElement
		 * must be non-null.
		 */
		private void advance() {
			advanceFrom(currentElement);
		}

		private void advanceFrom(Node cursor) {
			if (cursor != null) do {
				cursor = cursor.getNextSibling();
				if (cursor != null && cursor.getNodeType() == Node.ELEMENT_NODE) {
					currentElement = (Element) cursor;
					return;
				}
			} while (cursor != null && cursor != nextNode);
			// None found before end, so no current
			currentElement = null;
		}

		/**
		 * Advance 'currentElement' to next element. currentElement
		 * must be non-null.
		 */
		private void simpleAdvance() {
			Node cursor = currentElement;
			if (cursor != null) do {
				cursor = cursor.getNextSibling();
				if (cursor != null && cursor.getNodeType() == Node.ELEMENT_NODE) {
					currentElement = (Element) cursor;
					return;
				}
			} while (cursor != null);
			// None found before end, so no current
			currentElement = null;
		}

		/**
		 * Simply remove all traces of the remaining nodes.
		 */
		public void removeRemainingNodes() {
			Node cursor = currentElement;
			while (cursor != null && cursor != nextNode) {
				Node old = cursor;
				cursor = cursor.getNextSibling();
				parentElement.removeChild(old);
			}
		}

		/**
		 * Simply the current node (if it exists).
		 */
		public void removeCurrentNode() {
			if (currentElement != null && currentElement != nextNode) {
				Node toDelete = currentElement;
				advanceFrom(toDelete);
				parentElement.removeChild(toDelete);
			}
		}
	}

	public SyncXMLSaveImpl(XMLHelper helper) {
		super(helper);
		handler = new DefaultDOMHandlerImpl() { 
			@Override
			public void recordValues(Node text, EObject o,
					EStructuralFeature f, Object value) {
			
				if (text != null) {
					super.recordValues(text, o, f, value);
				}

				Node textParent = text == null ? null : text instanceof Attr ? ((Attr)text).getOwnerElement() : text.getParentNode();
			
				SyncAdapter adapter = findAdapter(o);
				if (adapter == null && xmlResource instanceof SyncResource) {
					adapter = new SyncAdapterImpl(o, textParent, (SyncResource) xmlResource);
					adapter.wireAdapters();
				}
				if (adapter != null) {
					if (text != null && text.getNodeType() == Node.ELEMENT_NODE) {
						if (! f.isTransient()) adapter.setFeatureElement(f, (Element) text);
					} else {
						adapter.clearFeatureElement(f);
					}
				}

				if (value instanceof EObject && f instanceof EReference) {
					EObject theChild = (EObject) value;
					// TODO - we should ensure this only happens for contained objects?
					if (((EReference) f).isContainment()) {
						if (EcoreUtil.getExistingAdapter(theChild, SyncAdapter.class) == null) {
							adapter = new SyncAdapterImpl(theChild, text,
									(SyncResource) xmlResource);
							adapter.wireAdapters();
						}
					}
				}
			}
		};
	}

	@Override
	public Document save(XMLResource resource, Document doc, Map<?, ?> options,
			DOMHandler handler) {
		if (resource instanceof SyncResourceImpl) {
			// TODO What's special here?
		}

		return super.save(resource, doc, options, handler);
	}

	public void setContext(XMLResource resource, Node newCurrentNode) {
		HashMap<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_SKIP_ESCAPE, Boolean.TRUE);
		init(resource, options);
		this.toDOM = true;
		this.currentNode = newCurrentNode;
		this.xmlResource = resource;
		this.document = newCurrentNode.getOwnerDocument();
	}

	void notifySetOrReplaceSingle(Notification msg, EObject o, Node node,
			SyncAdapter adapter) {
		EClass eClass = o.eClass();
		int contentKind = extendedMetaData == null ? ExtendedMetaData.UNSPECIFIED_CONTENT
				: extendedMetaData.getContentKind(eClass);

		EStructuralFeature feature = (EStructuralFeature)msg.getFeature();

		EStructuralFeature[] features = featureTable.getFeatures(eClass);
		int[] featureKinds = featureTable.getKinds(eClass, features);

		int i = -1;

		for (int j = 0; j < features.length && i < 0; ++j) {
			if (features[j].equals(feature))
				i = j;
		}
		EStructuralFeature targetFeature = feature;
		if (i < 0) {
			if (extendedMetaData != null) {
				targetFeature = extendedMetaData.getAffiliation(o.eClass(), feature);
				if (targetFeature != null && targetFeature != feature) {
//					System.out.println("Feature " + feature + " maps to " + targetFeature );

					EStructuralFeature group = extendedMetaData.getGroup(targetFeature);
					if (group != null)
					{
//						System.out.println("This is in group " + group);
					}
					targetFeature = group;
//					do {
//						EStructuralFeature realGroup = extendedMetaData.getGroup(group);
//						if (targetFeature == realGroup || realGroup == null) break;
//						targetFeature = realGroup;
//					} while (true);
		        } else {
		        	targetFeature = feature;
		        }
				for (int j = 0; j < features.length && i < 0; ++j) {
					if (features[j].equals(targetFeature))
						i = j;
				}
			}
			if (i < 0) {
//				System.out.println("Jeg vil drukne mig i atlanterhavet -- det er fastslået");
				return;
			}
		}		
		boolean checkElement = false;

		int kind = featureKinds[i];
		EStructuralFeature f = features[i];

		if (f.isTransient() && targetFeature.isTransient())
			return;
		
		if (!shouldSaveFeature(o, f)) {
			notifyUnSetSingle(msg, o, node, adapter);
			return;
		}

		if (msg.isTouch()) {
			// OK, usually we don't do this, BUT:
			boolean allowTouch = 
				extendedMetaData.getFeatureKind(f) == ExtendedMetaData.ELEMENT_FEATURE &&
				! f.isMany() &&
				adapter.getFeatureElement(targetFeature) == null;
			
				if (! allowTouch) return;
		}
		
		switch (kind) {
		case TRANSIENT:
			checkElement = true;
			break;
			
		case DATATYPE_ELEMENT_SINGLE: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceDataTypeElementSingleSimple(o, f);
				return;
			} else {
				checkElement = true;
			}
			break;
		}
		case DATATYPE_SINGLE: {
			saveDataTypeSingle(o, f);
			return;
		}
		case DATATYPE_SINGLE_NILLABLE: {
			if (!isNil(o, f)) {
				saveDataTypeSingle(o, f);
			} else {
				clearAttribute(o, f);
			}
			return;
		}
		case OBJECT_ATTRIBUTE_SINGLE: {
			saveEObjectSingle(o, f);
			return;
		}
		case OBJECT_ATTRIBUTE_MANY: {
			saveEObjectMany(o, f);
			return;
		}
		case OBJECT_ATTRIBUTE_IDREF_SINGLE: {
			saveIDRefSingle(o, f);
			return;
		}
		case OBJECT_ATTRIBUTE_IDREF_MANY: {
			saveIDRefMany(o, f);
			return;
		}
		case OBJECT_HREF_SINGLE_UNSETTABLE: {
			if (isNil(o, f)) {
				clearAttribute(o, f);
				return;
			}
			// drop through
		}
		case OBJECT_HREF_SINGLE: {
			if (useEncodedAttributeStyle) {
				saveEObjectSingle(o, f);
			} else {
				switch (sameDocSingle(o, f)) {
				case SAME_DOC: {
					saveIDRefSingle(o, f);
					return;
				}
				case CROSS_DOC: {
					checkElement = true;
					break;
				}
				default: {
				}
				}
			}
			break;
		}
		case OBJECT_HREF_MANY_UNSETTABLE: {
			if (isEmpty(o, f)) {
				saveManyEmpty(o, f);
				return;
			}
			// Drop through
		}
		case OBJECT_HREF_MANY: {
			if (useEncodedAttributeStyle) {
				saveEObjectMany(o, f);
				return;
			} else {
				switch (sameDocMany(o, f)) {
				case SAME_DOC: {
					saveIDRefMany(o, f);
					return;
				}
				case CROSS_DOC: {
					checkElement = true;
					break;
				}
				default: {
				}
				}
			}
			break;
		}
		case OBJECT_ELEMENT_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_SINGLE: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceElementReferenceSingleSimple(o, f);
				return;
			} else {
				checkElement = true;
			}
			break;
		}
		case OBJECT_ELEMENT_MANY: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceElementReferenceManySimple(o, f);
				return;
			} else {
				checkElement = true;
			}
			break;
		}
		case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_IDREF_SINGLE: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceElementIDRefSingleSimple(o, f);
				return;
			} else {
				checkElement = true;
			}
			break;
		}
		case OBJECT_ELEMENT_IDREF_MANY: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceElementIDRefManySimple(o, f);
				return;
			} else {
				checkElement = true;
			}
			break;
		}
		case DATATYPE_ATTRIBUTE_MANY: {
			saveDataTypeAttributeMany(o, f);
			break;
		}
		case OBJECT_CONTAIN_MANY_UNSETTABLE:
		case DATATYPE_MANY: {
			if (isEmpty(o, f)) {
				saveManyEmpty(o, f);
				return;
			} else {
				checkElement = true;
			}
			break;
		}
		case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
		case OBJECT_CONTAIN_SINGLE:
		case OBJECT_CONTAIN_MANY:
		case ELEMENT_FEATURE_MAP: {
			checkElement = true;
			break;
		}
		case ATTRIBUTE_FEATURE_MAP: {
			addAttributeFeatureMap(o, f);
			return;
		}
		default: {
		}
		}

		// processAttributeExtensions(o);

		if (!checkElement) {
			setSimpleContents(o, f);
		} else {
			FeatureCursor fc = locateFeature(adapter, features, i, f);

			switch (kind) {
			case DATATYPE_SINGLE_NILLABLE: {
				// saveNil(o, f);
				updateNilElement(o, f, fc);
				break;
			}
			case ELEMENT_FEATURE_MAP: {
				updateElementFeatureMap(o, f, fc);
				// saveElementFeatureMap(o, f);
				break;
			}
			case DATATYPE_MANY: {
				updateDataTypeMany(o, f, fc);
				// saveDataTypeMany(o, f);
				break;
			}
			case DATATYPE_ELEMENT_SINGLE: {
				updateDataTypeElementSingle(o, f, fc);
				// saveDataTypeElementSingle(o, f);
				break;
			}
			case OBJECT_CONTAIN_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					updateNilElement(o, f, fc);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_CONTAIN_SINGLE: {
				// saveContainedSingle(o, f);
				updateContainedSingle(o, f, fc);
				break;
			}
			case OBJECT_CONTAIN_MANY_UNSETTABLE:
			case OBJECT_CONTAIN_MANY: {
				saveContainedMany(o, f);
				updateContainedMany(o, f, fc);
				break;
			}
			case OBJECT_HREF_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					updateNilElement(o, f, fc);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_HREF_SINGLE: {
				updateHRefSingle(o, f, fc);
				// saveHRefSingle(o, f);
				break;
			}
			case OBJECT_HREF_MANY_UNSETTABLE:
			case OBJECT_HREF_MANY: {
				updateHRefMany(o, f, fc);
				// saveHRefMany(o, f);
				break;
			}
			case OBJECT_ELEMENT_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					updateNilElement(o, f, fc);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_ELEMENT_SINGLE: {
				saveElementReferenceSingle(o, f);
				break;
			}
			case OBJECT_ELEMENT_MANY: {
				saveElementReferenceMany(o, f);
				break;
			}
			case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					saveNil(o, f);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_ELEMENT_IDREF_SINGLE: {
				saveElementIDRefSingle(o, f);
				break;
			}
			case OBJECT_ELEMENT_IDREF_MANY: {
				saveElementIDRefMany(o, f);
				break;
			}
			}
		}
	}

	private void updateDataTypeMany(EObject o, EStructuralFeature f,
			FeatureCursor fc) {

		// TODO Auto-generated method stub

	}

	protected void updateContainedSingle(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		InternalEObject value = (InternalEObject) helper.getValue(o, f);
		if (value != null) {
			if (value.eDirectResource() != null || value.eIsProxy()) {
				updateHRefSingle(value, f, fc);
			} else {
				Element newElement = insertObjectElement((EObject) value, f, fc);
				handler.recordValues(newElement, o, f, value);
			}
		}
		fc.removeRemainingNodes();
	}

	protected Element insertObjectElement(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		EClass eClass = o.eClass();
		EClassifier eType = f.getEType();

		if (extendedMetaData != null && eClass != eType) {
			// Check if it's an anonymous type.
			//
			String name = extendedMetaData.getName(eClass);
			if (name.endsWith("_._type")) {
				String elementName = name.substring(0, name.indexOf("_._"));
				String prefix = helper.getPrefix(eClass.getEPackage());
				String uri = helper.getNamespaceURI(prefix);

				NameInfo ni = new NameInfoImpl();
				ni.setLocalPart(elementName);
				ni.setQualifiedName("".equals(prefix) ? name : prefix + ":"
						+ name);
				ni.setNamespaceURI(uri);

				currentNode = fc.insertElement(ni);
				saveElementID(o);
				SyncUtilities.indent(currentNode);
				return (Element) currentNode;
			}
		}

		if (map != null) {
			XMLResource.XMLInfo info = map.getInfo(eClass);
			if (info != null
					&& info.getXMLRepresentation() == XMLResource.XMLInfo.ELEMENT) {
				helper.populateNameInfo(nameInfo, eClass);
				fc.insertElement(nameInfo);
				updateElementID(o, fc);
				return (Element) currentNode;
			}
		}
		boolean isAnyType = false;
		if (o instanceof AnyType) {
			isAnyType = true;
			helper.pushContext();
			for (FeatureMap.Entry entry : ((AnyType) o).getAnyAttribute()) {
				if (ExtendedMetaData.XMLNS_URI.equals(extendedMetaData
						.getNamespace(entry.getEStructuralFeature()))) {
					String uri = (String) entry.getValue();
					helper.addPrefix(extendedMetaData.getName(entry
							.getEStructuralFeature()), uri == null ? "" : uri);
				}
			}
		}

		helper.populateNameInfo(nameInfo, f);
		Element resultNode = fc.insertElement(nameInfo);
		currentNode = resultNode;

		if (saveTypeInfo ? xmlTypeInfo.shouldSaveType(eClass, eType, f)
				: eClass != eType
						&& (eClass != anyType || extendedMetaData == null
								|| eType != EcorePackage.Literals.EOBJECT || extendedMetaData
								.getFeatureKind(f) == ExtendedMetaData.UNSPECIFIED_FEATURE)) {
			if (eClass == anySimpleType) {
				saveTypeAttribute(((SimpleAnyType) o).getInstanceType());
			} else {
				saveTypeAttribute(eClass);
			}
		}

		updateElementID(o, fc);
		if (isAnyType) {
			helper.popContext();
		}
		return resultNode;
	}

	protected void updateContainedMany(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		@SuppressWarnings("unchecked")
		List<? extends InternalEObject> values = ((InternalEList<? extends InternalEObject>) helper
				.getValue(o, f)).basicList();
		int size = values.size();
		for (int i = 0; i < size; i++) {
			InternalEObject value = values.get(i);
			if (value != null) {
				Element newElement = insertObjectElement(value, f, fc);
				if (i == 0)
					handler.recordValues(newElement, o, f, value);
			}
		}
		fc.removeRemainingNodes();
	}

	private void updateHRefMany(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		// TODO Auto-generated method stub

	}

	private void updateHRefSingle(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		// TODO Auto-generated method stub

	}

	private void updateContainedElement(EObject o, Object value,
			EStructuralFeature f, FeatureCursor fc) {
		if (value == null) {
			updateNilElement(o, f, fc);
		} else {
			String svalue = getDatatypeValue(value, f, false);

			helper.populateNameInfo(nameInfo, f);
			Element elem = fc.reuseElement(nameInfo);
			// Element elem =
			// document.createElementNS(nameInfo.getNamespaceURI(),
			// nameInfo.getQualifiedName());
			replaceText(elem, svalue, true);
			fc.removeRemainingNodes();
			handler.recordValues(elem, o, f, value);
		}
	}

	private void updateDataTypeElementSingle(EObject o, Object value,
			EStructuralFeature f, FeatureCursor fc) {
		if (value == null) {
			updateNilElement(o, f, fc);
		} else {
			String svalue = getDatatypeValue(value, f, false);

			helper.populateNameInfo(nameInfo, f);
			Element elem = fc.reuseElement(nameInfo);
			// Element elem =
			// document.createElementNS(nameInfo.getNamespaceURI(),
			// nameInfo.getQualifiedName());
			replaceText(elem, svalue, true);
			fc.removeRemainingNodes();
			handler.recordValues(elem, o, f, value);
		}
	}

	private void updateDataTypeElementSingle(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		updateDataTypeElementSingle(o, helper.getValue(o, f), f, fc);
	}

	//
	// private void updateDataTypeElementSingle(EObject o, EStructuralFeature f,
	// FeatureCursor fc) {
	//
	// Element elem = fc.reuseElement(nameInfo);
	// // Element elem =
	// // document.createElementNS(nameInfo.getNamespaceURI(),
	// // nameInfo.getQualifiedName());
	// replaceText(elem, svalue, true);
	// fc.removeRemainingNodes();
	// handler.recordValues(elem, o, f, value);
	//
	// updateElement(o, helper.getValue(o, f), f, fc);
	//
	// }
	//
	private void updateElementFeatureMap(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		// TODO Auto-generated method stub

	}

	private FeatureCursor locateFeature(SyncAdapter adapter,
			EStructuralFeature[] features, int i, EStructuralFeature f) {

		FeatureCursor fc = new FeatureCursor((Element) currentNode);

		fc.firstElement = fc.currentElement = adapter.getFeatureElement(f);
		fc.lastElement = null;
		fc.previousNode = null;
		if (fc.firstElement != null) {
			fc.previousNode = fc.firstElement.getPreviousSibling();
		} else {
			for (int j = i - 1; j >= 0 && fc.previousNode == null; j--) {
				fc.previousNode = adapter.getFeatureElement(features[j]);
			}
		}
		for (int j = i + 1; j < features.length && fc.nextNode == null; j++) {
			fc.nextNode = adapter.getFeatureElement(features[j]);
		}
		if (fc.firstElement != null) {
			if (fc.nextNode != null)
				fc.lastElement = getPreviousElement(fc.nextNode);
			else
				fc.lastElement = getLastElementUnder(fc.firstElement
						.getParentNode());
		}
		return fc;
	}

	private Element getLastElementUnder(Node parentNode) {
		if (parentNode == null)
			return null;
		Node cursor = parentNode.getLastChild();
		while (cursor != null) {
			if (cursor.getNodeType() == Node.ELEMENT_NODE)
				return (Element) cursor;
			cursor = cursor.getPreviousSibling();
		}
		return null;
	}

	private Element getPreviousElement(Node current) {
		if (current == null)
			return null;

		Node cursor = current;
		while (cursor != null) {
			cursor = cursor.getPreviousSibling();
			if (cursor.getNodeType() == Node.ELEMENT_NODE)
				return (Element) cursor;
		}
		return null;
	}

	private boolean setSimpleContents(EObject o, EStructuralFeature feature) {

		if (map == null) {
			return false;
		}

		XMLResource.XMLInfo info = map.getInfo(feature);
		if (info != null
				&& info.getXMLRepresentation() == XMLResource.XMLInfo.CONTENT) {
			Object value = helper.getValue(o, feature);
			String svalue = getDatatypeValue(value, feature, false);

			Node node = replaceText(currentNode, svalue, false);
			handler.recordValues(node, o, feature, value);

			return true;
		}
		return false;
	}

	private void addAttributeFeatureMap(EObject o, EStructuralFeature f) {
		
	}

	public void notifyUnSetSingle(Notification msg, EObject o, Node node,
			SyncAdapter adapter) {
		EClass eClass = o.eClass();
		int contentKind = extendedMetaData == null ? ExtendedMetaData.UNSPECIFIED_CONTENT
				: extendedMetaData.getContentKind(eClass);

		EStructuralFeature feature = (EStructuralFeature)msg.getFeature();
		EStructuralFeature targetFeature = feature;

		EStructuralFeature[] features = featureTable.getFeatures(eClass);
		int[] featureKinds = featureTable.getKinds(eClass, features);

		int i = -1;
		for (int j = 0; j < features.length && i < 0; ++j) {
			if (features[j].equals(msg.getFeature()))
				i = j;
		}
		if (i < 0) {
			if (extendedMetaData != null) {
				targetFeature = extendedMetaData.getAffiliation(o.eClass(), feature);
				if (targetFeature != null && targetFeature != feature) {
//					System.out.println("Feature " + feature + " maps to " + targetFeature );

					EStructuralFeature group = extendedMetaData.getGroup(targetFeature);
					if (group != null)
					{
//						System.out.println("This is in group " + group);
					}
					targetFeature = group;
		        } else {
		        	targetFeature = feature;
		        }
				for (int j = 0; j < features.length && i < 0; ++j) {
					if (features[j].equals(targetFeature))
						i = j;
				}
			}
			if (i < 0) {
//				System.out.println("Jeg vil drukne mig i atlanterhavet -- det er fastslået");
				return;
			}
		}		

		int kind = featureKinds[i];

		if (kind == TRANSIENT)
			return;

		switch (kind) {
		case OBJECT_ELEMENT_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_SINGLE:
		case OBJECT_ELEMENT_MANY:
		case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_IDREF_SINGLE:
		case OBJECT_ELEMENT_IDREF_MANY:
		case DATATYPE_ELEMENT_SINGLE:
		case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
		case OBJECT_CONTAIN_SINGLE:
		case OBJECT_CONTAIN_MANY:
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				removeElementValue(currentNode);
			} else {
				// Zap all the individual nodes
				FeatureCursor fc = locateFeature(adapter, features, i, targetFeature);
				fc.removeRemainingNodes();
				adapter.clearFeatureElement(targetFeature);
			}
			break;

		case DATATYPE_SINGLE:
		case DATATYPE_SINGLE_NILLABLE:
		case OBJECT_ATTRIBUTE_SINGLE:
		case OBJECT_ATTRIBUTE_MANY:
		case OBJECT_ATTRIBUTE_IDREF_SINGLE:
		case OBJECT_ATTRIBUTE_IDREF_MANY:
		case OBJECT_HREF_SINGLE_UNSETTABLE:
		case OBJECT_HREF_SINGLE:
		case OBJECT_HREF_MANY_UNSETTABLE:
		case OBJECT_HREF_MANY:
		case DATATYPE_ATTRIBUTE_MANY:
		case OBJECT_CONTAIN_MANY_UNSETTABLE:
		case DATATYPE_MANY:
			clearAttribute(o, feature);
			break;

		case ELEMENT_FEATURE_MAP:
			// Hmmmm...
			break;

		case ATTRIBUTE_FEATURE_MAP:
			clearAttributeFeatureMap(o, feature, targetFeature);
		}
	}

	private SyncAdapter findAdapter(EObject o) {
		for (Adapter a : o.eAdapters()) {
			if (a instanceof SyncAdapter) {
				return (SyncAdapter) a; // TODO - should we check the resource?
			}
		}
		return null;
	}

	protected void clearAttribute(EObject o, EStructuralFeature f) {
		if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
			// As it should be!
			Element element = (Element) currentNode;
			helper.populateNameInfo(nameInfo, f);
			element.removeAttributeNS(nameInfo.getNamespaceURI(), nameInfo
					.getLocalPart());
			handler.recordValues(null, o, f, null);
		}
	}

	private void clearAttributeFeatureMap(EObject o, EStructuralFeature f, EStructuralFeature targetFeature) {
		// TODO Auto-generated method stub

	}

	protected void updateElementID(EObject o, FeatureCursor fc) {
		String id = helper.getID(o);
		if (id != null) {
			Attr attr = document.createAttributeNS(idAttributeNS,
					idAttributeName);
			attr.setNodeValue(id);
			((Element) currentNode).setAttributeNodeNS(attr);
			handler.recordValues(attr, o, null, o);
		}
		saveFeatures(o);
	}

	protected void replaceDataTypeElementSingleSimple(EObject o,
			EStructuralFeature f) {
		Object value = helper.getValue(o, f);
		String svalue = getDatatypeValue(value, f, false);

		Node text = replaceText(currentNode, svalue, false);
		handler.recordValues(text, o, f, value);
	}

	private Node replaceText(Node parent, String svalue) {
		return replaceText(parent, svalue, false);
	}

	private Node replaceText(Node parent, String svalue,
			boolean removeOtherNodes) {
		if (svalue == null) {
			removeElementValue(parent);
			return null;
		}
		Node child = parent.getFirstChild();
		Node text = null;
		while (child != null) {
			Node nodeToRemove = null;
			switch (child.getNodeType()) {
			case Node.TEXT_NODE:
			case Node.CDATA_SECTION_NODE:
				if (text == null)
					(text = child).setNodeValue(svalue);
				else
					nodeToRemove = child;
				break;
			case Node.ENTITY_REFERENCE_NODE:
				nodeToRemove = child;
				break;
			default:
				if (removeOtherNodes)
					nodeToRemove = child;
				break;
			}
			child = child.getNextSibling();
			if (nodeToRemove != null)
				parent.removeChild(nodeToRemove);
		}
		if (text == null) {
			text = parent.getOwnerDocument().createTextNode(svalue);
			parent.appendChild(text);
		}
		return text;
	}

	protected void replaceElementReferenceSingleSimple(EObject o,
			EStructuralFeature f) {
		EObject value = (EObject) helper.getValue(o, f);
		String svalue = helper.getHREF(value);
		if (svalue != null) {
			svalue = convertURI(svalue);
		}
		Node text = replaceText(currentNode, svalue, true);
		if (text != null)
			handler.recordValues(text, o, f, value);
	}

	protected void replaceElementReferenceManySimple(EObject o,
			EStructuralFeature f) {
		@SuppressWarnings("unchecked")
		InternalEList<? extends EObject> values = (InternalEList<? extends EObject>) helper
				.getValue(o, f);

		StringBuffer result = new StringBuffer();
		int size = values.size();
		String href = null;
		boolean failure = false;
		for (int i = 0; i < size; i++) {
			href = helper.getHREF(values.basicGet(i));
			if (href == null) {
				failure = true;
			} else {
				href = convertURI(href);
				result.append(href);
				result.append(' ');
			}
		}
		String svalue = result.substring(0, result.length() - 1);
		if (failure && (svalue = svalue.trim()).length() == 0)
			svalue = null;

		Node text = replaceText(currentNode, svalue, true);
		handler.recordValues(text, o, f, values);
	}

	private static void removeElementValue(Node node) {
		Node child = node.getFirstChild();
		while (child != null) {
			Node nodeToRemove = null;
			switch (child.getNodeType()) {
			case Node.TEXT_NODE:
			case Node.CDATA_SECTION_NODE:
				nodeToRemove = child;
				break;
			}
			child = child.getNextSibling();
			if (nodeToRemove != null)
				node.removeChild(nodeToRemove);
		}
	}

	protected void replaceElementIDRefSingleSimple(EObject o,
			EStructuralFeature f) {
		EObject value = (EObject) helper.getValue(o, f);
		String svalue = helper.getIDREF(value);

		replaceText(currentNode, svalue, false);
	}

	protected void updateNilElement(EObject o, EStructuralFeature f,
			FeatureCursor fc) {
		// TODO: declareXSI = true;

		helper.populateNameInfo(nameInfo, f);
		Element elem = fc.reuseElement(nameInfo);
		
		// Element elem = document.createElementNS(nameInfo.getNamespaceURI(),
		// nameInfo.getQualifiedName());
		while (elem.hasChildNodes()) {
			elem.removeChild(elem.getFirstChild());
		}
		elem.setAttributeNS(ExtendedMetaData.XSI_URI, XSI_NIL, "true");
		handler.recordValues(elem, o, f, null);
		fc.removeRemainingNodes();
	}

	protected void replaceElementIDRefManySimple(EObject o, EStructuralFeature f) {
		@SuppressWarnings("unchecked")
		InternalEList<? extends EObject> values = (InternalEList<? extends EObject>) helper
				.getValue(o, f);

		StringBuffer result = new StringBuffer();
		boolean failure = false;
		for (int i = 0, size = values.size(); i < size; i++) {
			String idref = helper.getIDREF(values.basicGet(i));
			if (idref == null) {
				failure = true;
			} else {
				result.append(idref);
				result.append(' ');
			}
		}
		String svalue = result.substring(0, result.length() - 1);
		if (failure && (svalue = svalue.trim()).length() == 0) {
			svalue = null;
		}

		Node text = replaceText(currentNode, svalue, false);
		handler.recordValues(text, o, f, values);
	}

	public void notifyRemovedFromList(Notification msg, EObject object,
			Node node, SyncAdapter adapter) {
		EClass eClass = object.eClass();

		int contentKind = extendedMetaData == null ? ExtendedMetaData.UNSPECIFIED_CONTENT
				: extendedMetaData.getContentKind(eClass);

		EStructuralFeature feature = (EStructuralFeature)msg.getFeature();
		EStructuralFeature targetFeature = feature;

		// Special fix for XML Namespace prefix map (marked transient, but specifically serialized)
		EReference xmlnsPrefixMapFeature = extendedMetaData.getXMLNSPrefixMapFeature(eClass);
		if (feature == xmlnsPrefixMapFeature)
		{
			BasicEMap.Entry<String, String> entry = (BasicEMap.Entry<String, String>)msg.getOldValue();
		
			Element e = (Element)node;
			e.removeAttribute("xmlns:" + entry.getKey());
			return;
		}

		
		EStructuralFeature[] features = featureTable.getFeatures(eClass);
		int[] featureKinds = featureTable.getKinds(eClass, features);

		int i = -1;
		for (int j = 0; j < features.length && i < 0; ++j) {
			if (features[j].equals(msg.getFeature()))
				i = j;
		}
		if (i < 0) {
			if (extendedMetaData != null) {
				targetFeature = extendedMetaData.getAffiliation(object.eClass(), feature);
				if (targetFeature != null && targetFeature != feature) {
					EStructuralFeature group = extendedMetaData.getGroup(targetFeature);
					targetFeature = group;
		        } else {
		        	targetFeature = feature;
		        }
				for (int j = 0; j < features.length && i < 0; ++j) {
					if (features[j].equals(targetFeature))
						i = j;
				}
			}
			if (i < 0) {
//				System.out.println("Peblingesøen, det kunne ikke være mere korrekt, Brådtgaard -- det er fastslået");
				return;
			}
		}
		
		int kind = featureKinds[i];

		if (kind == TRANSIENT)
			return;

		switch (kind) {
		case OBJECT_ELEMENT_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_SINGLE:
		case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_IDREF_SINGLE:
		case DATATYPE_ELEMENT_SINGLE:
		case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
		case OBJECT_CONTAIN_SINGLE:
		case DATATYPE_SINGLE:
		case DATATYPE_SINGLE_NILLABLE:
		case OBJECT_HREF_SINGLE_UNSETTABLE:
		case OBJECT_HREF_SINGLE:
		case OBJECT_ATTRIBUTE_SINGLE:
		case OBJECT_ATTRIBUTE_IDREF_SINGLE:
			// TODO - Perhaps just exclude from the switch
//			System.out.println("How can you remove a single instance?");
			break;

		case OBJECT_ATTRIBUTE_MANY:
		case OBJECT_ATTRIBUTE_IDREF_MANY:
		case DATATYPE_ATTRIBUTE_MANY:
			notifySetOrReplaceSingle(msg, object, node, adapter);
			break;

		case OBJECT_ELEMENT_MANY:
		case OBJECT_ELEMENT_IDREF_MANY:
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				notifySetOrReplaceSingle(msg, object, node, adapter);
				return;
			}
			// Drop though
		case OBJECT_CONTAIN_MANY:
		case OBJECT_HREF_MANY_UNSETTABLE:
		case OBJECT_HREF_MANY:
		case OBJECT_CONTAIN_MANY_UNSETTABLE:
		case DATATYPE_MANY:
		case ELEMENT_FEATURE_MAP: {
			// locate individual nodes...
			FeatureCursor fc = locateFeature(adapter, features, i, targetFeature);
			for (int ii = 0; ii < msg.getPosition(); ++ii)
				fc.simpleAdvance();

			fc.removeCurrentNode();
			if (msg.getPosition() == 0)
				handler.recordValues(null, object, targetFeature, msg.getOldValue());
			break;
		}

		case ATTRIBUTE_FEATURE_MAP:
//			System.out.println("*** What to do about this one?");
			break;
		}

		
	}

	public void notifyAddedToList(Notification msg, EObject object, Node node,
			SyncAdapter adapter) {

		EClass eClass = object.eClass();

		int contentKind = extendedMetaData == null ? ExtendedMetaData.UNSPECIFIED_CONTENT
				: extendedMetaData.getContentKind(eClass);

		EStructuralFeature feature = (EStructuralFeature)msg.getFeature();
		EStructuralFeature targetFeature = feature;

		// Special fix for XML Namespace prefix map (marked transient, but specifically serialized)
		EReference xmlnsPrefixMapFeature = extendedMetaData.getXMLNSPrefixMapFeature(eClass);
		if (feature == xmlnsPrefixMapFeature)
		{
			BasicEMap.Entry<String, String> entry = (BasicEMap.Entry<String, String>)msg.getNewValue();
		
			Element e = (Element)node;
			e.setAttribute("xmlns:" + entry.getKey(), entry.getValue());
			return;
		}
		
		EStructuralFeature[] features = featureTable.getFeatures(eClass);
		int[] featureKinds = featureTable.getKinds(eClass, features);

		int i = -1;
		for (int j = 0; j < features.length && i < 0; ++j) {
			if (features[j].equals(msg.getFeature()))
				i = j;
		}
		if (i < 0) {
			if (extendedMetaData != null) {
				targetFeature = extendedMetaData.getAffiliation(object.eClass(), feature);
				if (targetFeature != null && targetFeature != feature) {
//					System.out.println("Feature " + feature + " maps to " + targetFeature );

					EStructuralFeature group = extendedMetaData.getGroup(targetFeature);
					if (group != null)
					{
//						System.out.println("This is in group " + group);
					}
					targetFeature = group;
		        } else {
		        	targetFeature = feature;
		        }
				for (int j = 0; j < features.length && i < 0; ++j) {
					if (features[j].equals(targetFeature))
						i = j;
				}
			}
			if (i < 0) {
//				System.out.println("Jeg vil drukne mig i atlanterhavet -- det er fastslået");
				return;
			}
		}
		
		
		int kind = featureKinds[i];

		if (kind == TRANSIENT)
			return;

		switch (kind) {
		case OBJECT_ELEMENT_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_SINGLE:
		case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_IDREF_SINGLE:
		case DATATYPE_ELEMENT_SINGLE:
		case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
		case OBJECT_CONTAIN_SINGLE:
		case DATATYPE_SINGLE:
		case DATATYPE_SINGLE_NILLABLE:
		case OBJECT_HREF_SINGLE_UNSETTABLE:
		case OBJECT_HREF_SINGLE:
		case OBJECT_ATTRIBUTE_SINGLE:
		case OBJECT_ATTRIBUTE_IDREF_SINGLE:
			// TODO - Perhaps just exclude from the switch
//			System.out.println("How can you add to a single instance?");
			break;

		case OBJECT_ATTRIBUTE_MANY:
		case OBJECT_ATTRIBUTE_IDREF_MANY:
		case DATATYPE_ATTRIBUTE_MANY:
			notifySetOrReplaceSingle(msg, object, node, adapter);
			break;

		case OBJECT_ELEMENT_MANY:
		case OBJECT_ELEMENT_IDREF_MANY:
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				notifySetOrReplaceSingle(msg, object, node, adapter);
				return;
			}
			// Drop though
		case OBJECT_CONTAIN_MANY:
		case OBJECT_HREF_MANY_UNSETTABLE:
		case OBJECT_HREF_MANY:
		case OBJECT_CONTAIN_MANY_UNSETTABLE:
		case DATATYPE_MANY: {
			// locate individual nodes...
			FeatureCursor fc = locateFeature(adapter, features, i, targetFeature);
			for (int ii = 0; ii < msg.getPosition(); ++ii)
				fc.simpleAdvance();

			Element newElement = insertObjectElement((EObject) msg
					.getNewValue(), feature, fc);
			if (msg.getPosition() == 0)
				handler.recordValues(newElement, (EObject) msg.getNewValue(), targetFeature,
						(EObject) msg.getNewValue());
			break;
		}

		case ELEMENT_FEATURE_MAP:
			// Simple check - does the object already exist?
			FeatureMap.Entry fme = (FeatureMap.Entry)msg.getNewValue();
			feature = fme.getEStructuralFeature();
			
			// locate individual nodes...
			FeatureCursor fc = locateFeature(adapter, features, i, feature);
			for (int ii = 0; ii < msg.getPosition(); ++ii)
				fc.simpleAdvance();

			Element newElement = null;
			if (fme.getValue() instanceof EObject) {
				EObject value = (EObject)fme.getValue();

				SyncAdapter childAdapter = (SyncAdapter)EcoreUtil.getExistingAdapter(value, SyncAdapter.class);
				if (childAdapter != null && childAdapter.getNode() != null) {
					fc.parentElement.insertBefore(newElement = (Element)childAdapter.getNode(), fc.nextNode);
				} else {
					newElement = insertObjectElement(value, feature, fc);
					if (childAdapter != null) {
						childAdapter.setNode(newElement);
					} else {
						childAdapter = new SyncAdapterImpl((EObject)value,  (IDOMNode)newElement, (SyncResource) xmlResource);
					}
					childAdapter.wireAdapters();
				}
			} else {
				newElement = insertValueElement(fme.getValue(), feature, fc);
			}
			if (msg.getPosition() == 0) {
				handler.recordValues(newElement, object, targetFeature, msg.getNewValue());
			}
			break;

		case ATTRIBUTE_FEATURE_MAP:
//			System.out.println("*** What to do about this one?");
			break;
		}
	}

	protected Element insertValueElement(Object value,
			EStructuralFeature feature, FeatureCursor fc) {

		helper.populateNameInfo(nameInfo, feature);
		Element resultNode = fc.insertElement(nameInfo);
	
		String svalue = getDatatypeValue(value, feature, false);

		replaceText(resultNode, svalue, true);

		return resultNode;
	}
	
}
