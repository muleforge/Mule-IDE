package org.mule.ide.config.common.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.DOMHandler;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.DefaultDOMHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class SyncXMLSaveImpl extends XMLSaveImpl implements XMLSave {

	public SyncXMLSaveImpl(XMLHelper helper) {
		super(helper);
		handler = new DefaultDOMHandlerImpl();
	}

	@Override
	public Document save(XMLResource resource, Document doc, Map<?, ?> options,
			DOMHandler handler) {
		if (resource instanceof SyncResourceImpl) {

		}

		// TODO Auto-generated method stub
		return super.save(resource, doc, options, handler);
	}

	public void setContext(XMLResource resource, Node newCurrentNode) {
		HashMap<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		init(resource, options);
		this.toDOM = true;
		this.currentNode = newCurrentNode;
		this.document = newCurrentNode.getOwnerDocument();
	}

	void setOrReplaceSimple(Notification msg, EObject o, Node node) {
		EClass eClass = o.eClass();
		int contentKind = extendedMetaData == null ? ExtendedMetaData.UNSPECIFIED_CONTENT
				: extendedMetaData.getContentKind(eClass);

		EStructuralFeature[] features = featureTable.getFeatures(eClass);
		int[] featureKinds = featureTable.getKinds(eClass, features);

		int i = -1;

		for (int j = 0; j < features.length && i < 0; ++j) {
			if (features[j].equals(msg.getFeature()))
				i = j;
		}
		if (i < 0) {
			// TODO - how?
			return;
		}

		int kind = featureKinds[i];
		EStructuralFeature f = features[i];

		if (kind == TRANSIENT)
			return;
		if (!shouldSaveFeature(o, f)) {
			unSetSimple(msg, o, node);
			return;
		}
		
		switch (kind) {
		case DATATYPE_ELEMENT_SINGLE: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceDataTypeElementSingleSimple(o, f);
			}
			break;
		}
		case DATATYPE_SINGLE: {
			saveDataTypeSingle(o, f);
		}
		case DATATYPE_SINGLE_NILLABLE: {
			if (!isNil(o, f)) {
				saveDataTypeSingle(o, f);
			} else {
				clearAttribute(o, f);
			}
			break;
		}
		case OBJECT_ATTRIBUTE_SINGLE: {
			saveEObjectSingle(o, f);
		}
		case OBJECT_ATTRIBUTE_MANY: {
			saveEObjectMany(o, f);
		}
		case OBJECT_ATTRIBUTE_IDREF_SINGLE: {
			saveIDRefSingle(o, f);
		}
		case OBJECT_ATTRIBUTE_IDREF_MANY: {
			saveIDRefMany(o, f);
		}
		case OBJECT_HREF_SINGLE_UNSETTABLE: {
			if (isNil(o, f)) {
				clearAttribute(o, f);
				break;
			}
			// it's intentional to keep going
		}
		case OBJECT_HREF_SINGLE: {
			if (useEncodedAttributeStyle) {
				saveEObjectSingle(o, f);
			} else {
				switch (sameDocSingle(o, f)) {
				case SAME_DOC: {
					saveIDRefSingle(o, f);
				}
				case CROSS_DOC: {
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
			}
			// It's intentional to keep going.
		}
		case OBJECT_HREF_MANY: {
			if (useEncodedAttributeStyle) {
				saveEObjectMany(o, f);
			} else {
				switch (sameDocMany(o, f)) {
				case SAME_DOC: {
					saveIDRefMany(o, f);
				}
				case CROSS_DOC: {
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
			}
			break;
		}
		case OBJECT_ELEMENT_MANY: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceElementReferenceManySimple(o, f);
			}
			break;
		}
		case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
		case OBJECT_ELEMENT_IDREF_SINGLE: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceElementIDRefSingleSimple(o, f);
			}
			break;
		}
		case OBJECT_ELEMENT_IDREF_MANY: {
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				replaceElementIDRefManySimple(o, f);
			}
			break;
		}
		case DATATYPE_ATTRIBUTE_MANY: {
			break;
		}
		case OBJECT_CONTAIN_MANY_UNSETTABLE:
		case DATATYPE_MANY: {
			if (isEmpty(o, f)) {
				saveManyEmpty(o, f);
			}
			break;
		}
		case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
		case OBJECT_CONTAIN_SINGLE:
		case OBJECT_CONTAIN_MANY:
		case ELEMENT_FEATURE_MAP: {
			break;
		}
		case ATTRIBUTE_FEATURE_MAP: {
			saveAttributeFeatureMap(o, f);
		}
		default: {
		}
		}
	}

	public void unSetSimple(Notification msg, EObject o, Node node) {
		EClass eClass = o.eClass();
		int contentKind = extendedMetaData == null ? ExtendedMetaData.UNSPECIFIED_CONTENT
				: extendedMetaData.getContentKind(eClass);

		EStructuralFeature[] features = featureTable.getFeatures(eClass);
		int[] featureKinds = featureTable.getKinds(eClass, features);

		int i = -1;
		for (int j = 0; j < features.length && i < 0; ++j) {
			if (features[j].equals(msg.getFeature()))
				i = j;
		}
		if (i < 0) {
			// TODO - how?
			return;
		}

		int kind = featureKinds[i];
		EStructuralFeature f = features[i];

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
			if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
				removeElementValue(currentNode);
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
			clearAttribute(o, f);
			break;

		case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
		case OBJECT_CONTAIN_SINGLE:
		case OBJECT_CONTAIN_MANY:
		case ELEMENT_FEATURE_MAP:
			break;

		case ATTRIBUTE_FEATURE_MAP:
			clearAttributeFeatureMap(o, f);
		}
	}

	protected void clearAttribute(EObject o, EStructuralFeature f) {
		if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
			// As it should be!
			Element element = (Element) currentNode;
			helper.populateNameInfo(nameInfo, f);
			element.removeAttributeNS(nameInfo.getNamespaceURI(), nameInfo
					.getLocalPart());
			recordNewValues(null, o, f, null);
		}
	}

	private void clearAttributeFeatureMap(EObject o, EStructuralFeature f) {
		// TODO Auto-generated method stub

	}

	protected void replaceDataTypeElementSingleSimple(EObject o,
			EStructuralFeature f) {
		Object value = helper.getValue(o, f);
		String svalue = getDatatypeValue(value, f, false);

		Node text = replaceText(currentNode, svalue);
		recordNewValues(text, o, f, value);
	}

	private void recordNewValues(Node text, EObject o, EStructuralFeature f,
			Object value) {
		if (text != null) {
			handler.recordValues(text, o, f, value);
		} else {
			// TODO Clear out the value for "o, f"
		}
	}

	private Node replaceText(Node parent, String svalue) {
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
			}
			child = child.getNextSibling();
			if (nodeToRemove != null)
				currentNode.removeChild(nodeToRemove);
		}
		if (text == null) {
			text = document.createTextNode(svalue);
			currentNode.appendChild(text);
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
		Node text = replaceText(currentNode, svalue);
		if (text != null)
			recordNewValues(text, o, f, value);
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
		
		Node text = replaceText(currentNode, svalue);
		recordNewValues(text, o, f, values);
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

	protected void replaceElementIDRefSingleSimple(EObject o, EStructuralFeature f) {
		EObject value = (EObject) helper.getValue(o, f);
		String svalue = helper.getIDREF(value);

		replaceText(currentNode, svalue);
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

		Node text = replaceText(currentNode, svalue);
		recordNewValues(text, o, f, values);
	}

}
