package org.mule.ide.config.common.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLDefaultHandler;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.mule.ide.config.common.SyncHandler;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

public class SyncXMLLoadImpl extends XMLLoadImpl implements XMLLoad {

	private static final boolean DEBUG = false;

	public SyncXMLLoadImpl(XMLHelper helper) {
		super(helper);
	}

	protected Node currentNode;

	@Override
	protected void traverse(Node node, AttributesProxy attributesProxy,
			DefaultHandler handler, LexicalHandler lexicalHandler)
			throws SAXException {
		Node oldCurrent = currentNode;
		if (handler instanceof SyncHandler) {
			SyncHandler sh = (SyncHandler) handler;

			sh.setCurrentNode(node);
			super.traverse(node, attributesProxy, handler, lexicalHandler);
			sh.setCurrentNode(oldCurrent);
		}
	}

	protected DefaultHandler makeDefaultHandler() {
		return new SyncSAXXMLHandler(resource, helper, options);
	}

	public void reload(Node node, EObject targetObject, SyncXMLHelperImpl helper) {
		dump(targetObject);
		
		this.helper = helper;
		try {
			AttributesProxy2 attributesProxy = new AttributesProxy2();

			DefaultHandler handler;
			XMLParserPool pool = (XMLParserPool) options
					.get(XMLResource.OPTION_USE_PARSER_POOL);
			if (pool != null) {
				handler = (DefaultHandler) pool.getDefaultHandler(resource,
						this, helper, options);
			} else {
				handler = makeDefaultHandler();
			}
			LexicalHandler lexicalHandler = null;

			if (Boolean.TRUE.equals(options
					.get(XMLResource.OPTION_USE_LEXICAL_HANDLER))) {
				lexicalHandler = (LexicalHandler) handler;
			}
			try {
				((SyncSAXXMLHandler) handler).initReload((Element) node,
						targetObject);

				traverseElementContents((Element) node, targetObject, attributesProxy, handler,
						lexicalHandler);
			} catch (SAXException e) {
				// ignore
			}

			if (pool != null) {
				pool
						.releaseDefaultHandler((XMLDefaultHandler) handler,
								options);
			}

			handler = null;
			lexicalHandler = null;
		} finally {
			((SyncXMLHelperImpl) helper).reloadDone();
		}
		if (DEBUG) dump(targetObject);
	}

	private void dump(EObject container) {
		dump(0, container);
	}

	private void dump(int i, EObject container) {
		EList<EObject> contents = container.eContents();
		if (contents.isEmpty()) {
			System.out.println(indent(i) + container.eClass().getName() + "[ ]");
		} else {
			System.out.println(indent(i) + container.eClass().getName() + "[ ...");
			for (EObject obj : contents){
				dump(i+1, obj);
			}
			System.out.println(indent(i) + "]");
		}
	}

	/**
	 * @param i
	 */
	private String indent(int i) {
		return "                                             ".substring(0,i);
	}

	/**
	 * Special case: re-loading the element in question
	 */
	protected void traverseElementContents(Element element, EObject anchor,
			AttributesProxy2 attributesProxy, DefaultHandler handler,
			LexicalHandler lexicalHandler) throws SAXException {
		((SyncSAXXMLHandler) handler).setCurrentNode(element);
		// temporary structure to hold node's attributes + namespaces in scope
		AttributesImpl attrs = new AttributesImpl();

		// record node's attributes
		if (element.hasAttributes()) {
			NamedNodeMap attributes = element.getAttributes();
			for (int i = 0; i < attributes.getLength(); i++) {
				Node attr = attributes.item(i);
				String namespaceURI = attr.getNamespaceURI();
				if (namespaceURI == null) {
					namespaceURI = "";
				}
				if (ExtendedMetaData.XMLNS_URI.equals(namespaceURI)) {
					// add non-duplicate namespace declaration
					if (attrs.getIndex(attr.getNodeName()) < 0) {
						attrs.addAttribute("", "", attr.getNodeName(), "CDATA",
								attr.getNodeValue());
						if (namespaceAware) {
							handler.startPrefixMapping(attr.getLocalName(),
									attr.getNodeValue());
							helper.addPrefix(attr.getLocalName(), attr
									.getNodeValue());
						}
					}
				} else {
					attrs.addAttribute(namespaceURI, attr.getLocalName(), attr
							.getNodeName(), "CDATA", attr.getNodeValue());
				}
			}
		}

		Node parent = element.getParentNode();
		// record namespaces in scope
		while (parent != null && parent.getNodeType() != Node.DOCUMENT_NODE) {
			if (parent.hasAttributes()) {
				NamedNodeMap attributes = parent.getAttributes();
				for (int i = 0; i < attributes.getLength(); i++) {
					Node attr = attributes.item(i);
					// add non-duplicate namespace declaration
					if (ExtendedMetaData.XMLNS_URI.equals(attr
							.getNamespaceURI())
							&& attrs.getIndex(attr.getNodeName()) < 0) {
						attrs.addAttribute("", "", attr.getNodeName(), "CDATA",
								attr.getNodeValue());
						if (namespaceAware) {
							handler.startPrefixMapping(attr.getLocalName(),
									attr.getNodeValue());
						}
					}
				}
			}
			parent = parent.getParentNode();
		}

		// traverse element node
		String namespaceURI = element.getNamespaceURI();
		if (namespaceURI == null) {
			namespaceURI = "";
		} else {
			attrs.addAttribute("", "", ExtendedMetaData.XMLNS_PREFIX, "CDATA", namespaceURI);
			if (namespaceAware) {
				handler.startPrefixMapping("", namespaceURI);
			}
		}
		String localName = element.getLocalName();
		String qname = element.getNodeName();

//		handler.startElement(namespaceURI, localName, qname, attrs);
		((SyncSAXXMLHandler)handler).startAnchorElement(anchor, attrs);
		Node child = element.getFirstChild();
		while (child != null) {
			traverse2(child, attributesProxy, handler, lexicalHandler);
			child = child.getNextSibling();
		}
		handler.endElement(namespaceURI, localName, qname);
	}

	protected void traverse2(Node node, AttributesProxy2 attributesProxy,
			DefaultHandler handler, LexicalHandler lexicalHandler)
			throws SAXException {

		if (node == null) {
			return;
		}
		((SyncSAXXMLHandler) handler).setCurrentNode(node);

		short type = node.getNodeType();
		switch (type) {
		case Node.DOCUMENT_NODE: {
			throw new IllegalStateException(
					"Document level should never be reparsed!");
		}
		case Node.ELEMENT_NODE: {
			attributesProxy.setAttributes(node.getAttributes());
			if (namespaceAware) {
				NamedNodeMap attributes = node.getAttributes();
				for (int i = 0; i < attributes.getLength(); i++) {
					Node attr = attributes.item(i);
					String namespaceURI = attr.getNamespaceURI();
					if (ExtendedMetaData.XMLNS_URI.equals(namespaceURI)) {
						handler.startPrefixMapping(attr.getLocalName(), attr
								.getNodeValue());
					}
				}
			}
			String namespaceURI = node.getNamespaceURI();
			if (namespaceURI == null) {
				namespaceURI = "";
			}
			String localName = node.getLocalName();
			String qname = node.getNodeName();

			handler.startElement(namespaceURI, localName, qname,
					attributesProxy);

			Node child = node.getFirstChild();
			while (child != null) {
				traverse2(child, attributesProxy, handler, lexicalHandler);
				child = child.getNextSibling();
			}
			handler.endElement(namespaceURI, localName, qname);
			break;
		}

		case Node.CDATA_SECTION_NODE: {
			if (lexicalHandler != null) {
				lexicalHandler.startCDATA();
			}
			char[] chars = ((CDATASection) node).getData().toCharArray();
			handler.characters(chars, 0, chars.length);
			if (lexicalHandler != null) {
				lexicalHandler.endCDATA();
			}
			break;
		}
		case Node.TEXT_NODE: {
			char[] chars = node.getNodeValue().toCharArray();
			handler.characters(chars, 0, chars.length);
			break;
		}
		case Node.COMMENT_NODE: {
			if (lexicalHandler != null) {
				char[] chars = ((Comment) node).getData().toCharArray();
				lexicalHandler.comment(chars, 0, chars.length);
			}
			break;
		}
		case Node.PROCESSING_INSTRUCTION_NODE: {
			ProcessingInstruction pi = (ProcessingInstruction) node;
			handler.processingInstruction(pi.getTarget(), pi.getData());
			break;
		}
		}
	}

	protected static final class AttributesProxy2 implements Attributes {
		/** DOM attributes. */
		protected NamedNodeMap attributes;

		/** Sets the DOM attributes. */
		public void setAttributes(NamedNodeMap attributes) {
			this.attributes = attributes;
		}

		public int getLength() {
			return attributes.getLength();
		}

		public String getQName(int index) {
			Node node = attributes.item(index);
			return (node != null) ? node.getNodeName() : null;
		}

		public String getURI(int index) {
			Node node = attributes.item(index);
			if (node != null) {
				String namespaceURI = node.getNamespaceURI();
				if (ExtendedMetaData.XMLNS_URI.equals(namespaceURI)) {
					return "";
				}
				return namespaceURI;
			}
			return null;
		}

		public String getLocalName(int index) {
			Node node = attributes.item(index);
			if (node != null) {
				String prefix = node.getPrefix();
				if (ExtendedMetaData.XMLNS_PREFIX.equals(prefix)) {
					return "";
				}
				return node.getLocalName();
			}
			return null;
		}

		public String getType(int i) {
			return "CDATA";
		}

		public String getType(String name) {
			return "CDATA";
		}

		public String getType(String uri, String localName) {
			return "CDATA";
		}

		public String getValue(int i) {
			Node node = attributes.item(i);
			return (node != null) ? node.getNodeValue() : null;
		}

		public String getValue(String name) {
			Node node = attributes.getNamedItem(name);
			return (node != null) ? node.getNodeValue() : null;
		}

		public String getValue(String uri, String localName) {
			Node node = attributes.getNamedItemNS(uri, localName);
			return (node != null) ? node.getNodeValue() : null;
		}

		public int getIndex(String qName) {
			Node node = attributes.getNamedItem(qName);
			if (node != null) {
				for (int i = 0; i < attributes.getLength(); i++) {
					Node item = attributes.item(i);
					if (item == node) {
						return i;
					}
				}
			}
			return -1;
		}

		public int getIndex(String uri, String localPart) {
			Node node = attributes.getNamedItemNS(uri, localPart);
			if (node != null) {
				for (int i = 0; i < attributes.getLength(); i++) {
					Node item = attributes.item(i);
					if (item == node) {
						return i;
					}
				}
			}
			return -1;
		}
	} // class AttributesProxy2

}
