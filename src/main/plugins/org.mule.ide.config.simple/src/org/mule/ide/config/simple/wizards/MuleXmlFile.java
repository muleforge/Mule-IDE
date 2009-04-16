/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.config.simple.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mule.ide.project.runtime.IMuleBundle;

public class MuleXmlFile {
	private static final String LINE_SEP = System.getProperty("line.separator");
	private static final Set<String> RESERVED_WORDS;
	
	static {
		RESERVED_WORDS = new HashSet<String>();
		RESERVED_WORDS.add("xml");
		RESERVED_WORDS.add("xmlns");
	}
	
	public static InputStream generateXmlFile(List<IMuleBundle> muleArtifacts) {
		StringBuilder buf = new StringBuilder(128);
		buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		buf.append(LINE_SEP);

		appendCoreNamespace(buf, muleArtifacts);
		appendNamespaces(buf, muleArtifacts);
		appendSchemaLocations(buf, muleArtifacts);
		
		buf.append("</mule>");
		buf.append(LINE_SEP);
		
		return new ByteArrayInputStream(buf.toString().getBytes());
	}

	private static void appendCoreNamespace(StringBuilder buf, List<IMuleBundle> muleArtifacts) {
		// find mule-module-spring-config
		IMuleBundle springConfigBundle = null;
		for (IMuleBundle bundle : muleArtifacts) {
			if (bundle.getFile().getName().contains(IMuleBundle.MULE_MODULE_SPRING_CONFIG)) {
				springConfigBundle = bundle;
				break;
			}
		}
		
		// find mule-core.xsd and make it the default namespace for the document
		String coreUrl = findCoreUrl(springConfigBundle.getNamespaceUrls());		
		buf.append("<mule xmlns=\"");
		buf.append(namespaceIdFromUrl(coreUrl));
		buf.append("\"");
		buf.append(LINE_SEP);
	}

	private static void appendNamespaces(StringBuilder buf, List<IMuleBundle> muleArtifacts) {
		buf.append("      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
		buf.append(LINE_SEP);
		
		for (IMuleBundle bundle : muleArtifacts) {
			// mule-module-spring-config contains the core namespace and is the core namespace
			// of the generated xml file
			if (bundle.getFile().getName().contains(IMuleBundle.MULE_MODULE_SPRING_CONFIG)) {
				continue;
			}
			
			String[] namespaceUrls = bundle.getNamespaceUrls();
			for (String url : namespaceUrls) {
				buf.append("      xmlns:");
				buf.append(namespaceShortNameFromUrl(url));
				buf.append("=\"");
				buf.append(namespaceIdFromUrl(url));
				buf.append("\"");
				buf.append(LINE_SEP);
			}
		}
	}

	private static void appendSchemaLocations(StringBuilder buf, List<IMuleBundle> muleArtifacts) {
		buf.append("      xsi:schemaLocation=\"");
		
		for (IMuleBundle bundle : muleArtifacts) {
			// only include the core namespace from the spring-config bundle
			if (bundle.getFile().getName().contains(IMuleBundle.MULE_MODULE_SPRING_CONFIG)) {
				String coreNamespaceUrl = findCoreUrl(bundle.getNamespaceUrls());
				buf.append(LINE_SEP);
				buf.append("          ");
				buf.append(namespaceIdFromUrl(coreNamespaceUrl));
				buf.append(" ");
				buf.append(coreNamespaceUrl);
			}
			else {
				for (String url : bundle.getNamespaceUrls()) {
					buf.append(LINE_SEP);
					buf.append("          ");
					buf.append(namespaceIdFromUrl(url));
					buf.append(" ");
					buf.append(url);
				}
			}
		}
		
		buf.append("\">");
		buf.append(LINE_SEP);
		buf.append(LINE_SEP);
	}

	private static String namespaceIdFromUrl(String url) {
		// the namespace id is the same URL but without the final filename.xsd
		int index = url.lastIndexOf('/');
		return url.substring(0, index);
	}

	/**
	 * Extracts the short name that's used as schema prefix from the URL.
	 */
	private static String namespaceShortNameFromUrl(String url) {
		String[] urlElements = url.split("/");
		String shortName = urlElements[urlElements.length - 3].toLowerCase();
		
		// check if the detected short name clashes with the xml namespace spec
		if (RESERVED_WORDS.contains(shortName) || shortName.startsWith("xml")) {
			shortName = "mule-" + shortName;
		}
		return shortName;
	}
	
	private static String findCoreUrl(String[] namespaceUrls) {
		// find mule-core.xsd
		String coreUrl = null;
		for (String url : namespaceUrls) {
			if (url.contains("mule.xsd")) {
				coreUrl = url;
				break;
			}
		}
		return coreUrl;
	}
}
