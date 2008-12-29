package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.mule.ide.project.internal.util.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Pom {
	private Document document;

	public Pom(File pomFile) {
		super();
		
		// parse the pom file right away so we have the document ready
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		dbf.setNamespaceAware(true);
		
		try {
			document = dbf.newDocumentBuilder().parse(pomFile);
		} catch (SAXException e) {
			// OK: We swallow this exception - thereby ignoring any parse errors in the XML
			//     The POM must be valid otherwise building with Maven would not work either.
		} catch (IOException e) {
			// OK: Same goes for missing files
		} catch (ParserConfigurationException e) {
			// OK: This is so unlikely that it's not worth catching here.
		}
	}
	
	public String getArtifactId() {
		return XMLUtils.queryDomString(document, "project/artifactId");
	}
	
	public String getName() {
		return XMLUtils.queryDomString(document, "project/name");
	}

	public String getDescription() {
		return XMLUtils.queryDomString(document, "project/description");
	}

	public Iterator<String> getSubmodules() {
		NodeList nl = XMLUtils.queryDomNodes(document, "project/modules/module");
		if (nl.getLength() > 0) {
			return new NodeListIterator<String>(nl);
		}
		return new EmptyIterator<String>();
	}
	
	private class NodeListIterator<T> implements Iterator<T> {
		private NodeList nodeList;
		private int index;

		public NodeListIterator(NodeList nodeList) {
			super();
			this.nodeList = nodeList;
			this.index = 0;
		}

		public boolean hasNext() {
			return index < nodeList.getLength();
		}

		@SuppressWarnings("unchecked")
		public T next() {
			return (T) XMLUtils.text(nodeList.item(index++));
		}

		public void remove() {
			throw new UnsupportedOperationException("remove not supported");
		}
	}
	
	private class EmptyIterator<T> implements Iterator<T> {
		public boolean hasNext() {
			return false;
		}

		public T next() {
			return null;
		}

		public void remove() {
			throw new UnsupportedOperationException("remove not supported");
		}
	}
}
