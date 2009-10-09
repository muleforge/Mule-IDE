/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.mule.ide.project.internal.util.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Pom {
	private Document document;

	public static Pom loadFromJar(File jarFile) {
		InputStream pomStream = findPomFile(jarFile);
		if (pomStream != null) {
			return loadFromStream(pomStream);
		}
		return null;
	}
	
	private static InputStream findPomFile(File file) {
		try {
			JarFile jarFile = new JarFile(file);
			Enumeration<JarEntry> entries = jarFile.entries();
			while (entries.hasMoreElements()) {
				JarEntry entry = entries.nextElement();				
				if (entry.getName().endsWith("pom.xml") &&
				    entry.getName().contains("META-INF")) {
					return jarFile.getInputStream(entry);
				}
			}
			return null;
		}
		catch (IOException iox) {
			String message = "Error loading pom.xml from " + file.getAbsolutePath();
			throw new RuntimeException(message, iox);
		}
	}
	
	/**
	 * Load from <code>pomFile</code> wrapping any exception in a {@link RuntimeException}.
	 */
	public static Pom loadFromFile(File pomFile) {
		try {
			InputStream stream = new FileInputStream(pomFile);
			return loadFromStream(stream);
		} catch (FileNotFoundException fnfe) {
			throw new RuntimeException(fnfe);
		}
	}

	/**
	 * Load the pom from <code>inputStream</code> and close the stream when done.
	 */
	public static Pom loadFromStream(InputStream inputStream) {
		Pom pom = null;
		
		try {
			pom = new Pom(inputStream);
		} catch (SAXException e) {
			// Swallow this exception - thereby ignoring any parse errors in the XML
			// The POM must be valid otherwise building with Maven would not work either.
		} catch (IOException e) {
			// Same goes for missing files
		} catch (ParserConfigurationException e) {
			// This is so unlikely that it's not worth catching here.
		}
		finally {
			try {
				inputStream.close();
			}
			catch (IOException iox) {
			}
		}
		return pom;
	}
	
	private Pom(InputStream inputStream) throws SAXException, IOException, ParserConfigurationException {
		super();
		
		// parse the pom file right away so we have the document ready
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		dbf.setNamespaceAware(true);
		document = dbf.newDocumentBuilder().parse(inputStream);
	}
	
    public String getGroupId() {
        String groupId = XMLUtils.queryDomString(document, "project/parent/groupId");
        if (groupId == null) {
        	groupId = XMLUtils.queryDomString(document, "project/groupId");
        }
        return groupId;
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
