package org.mule.ide.config.simple.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.mule.ide.project.runtime.IMuleBundle;

public class MuleXmlFile {

	public static InputStream generateXmlFile(List<IMuleBundle> muleArtifacts) {
		StringBuilder buf = new StringBuilder(128);
		buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");

		appendCoreNamespace(buf, muleArtifacts);
		appendNamespaces(buf, muleArtifacts);
		appendSchemaLocations(buf, muleArtifacts);
		
		buf.append("</mule>\n");
		
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
		buf.append("\"\n");
	}

	private static void appendNamespaces(StringBuilder buf, List<IMuleBundle> muleArtifacts) {
		buf.append("      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
		
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
				buf.append("\n");
			}
		}
	}

	private static void appendSchemaLocations(StringBuilder buf, List<IMuleBundle> muleArtifacts) {
		buf.append("      xsi:schemaLocation=\"");
		
		for (IMuleBundle bundle : muleArtifacts) {
			// only include the core namespace from the spring-config bundle
			if (bundle.getFile().getName().contains(IMuleBundle.MULE_MODULE_SPRING_CONFIG)) {
				String coreNamespaceUrl = findCoreUrl(bundle.getNamespaceUrls());
				buf.append("\n          ");
				buf.append(namespaceIdFromUrl(coreNamespaceUrl));
				buf.append(" ");
				buf.append(coreNamespaceUrl);
			}
			else {
				for (String url : bundle.getNamespaceUrls()) {
					buf.append("\n          ");
					buf.append(namespaceIdFromUrl(url));
					buf.append(" ");
					buf.append(url);
				}
			}
		}
		
		buf.append("\">\n\n");
	}

	private static String namespaceIdFromUrl(String url) {
		// the namespace id is the same URL but without the final filename.xsd
		int index = url.lastIndexOf('/');
		return url.substring(0, index);
	}

	private static String namespaceShortNameFromUrl(String url) {
		String[] urlElements = url.split("/");
		return urlElements[urlElements.length - 3];
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
