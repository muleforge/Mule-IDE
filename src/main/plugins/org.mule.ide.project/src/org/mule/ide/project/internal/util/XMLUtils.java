/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtils {
    /**
     * XPath re-invented to be maximally compatible.
     * About as popular as reinventing the wheel. Bugger!
     * 
     * @param element to use as a starting point 
     * @param path simple "xpath-like" expression, sans namespaces (uses only local part)
     * @return NodeList of matching nodes
     */
    public static NodeList queryDomNodes(Element element, String path) {
    	final List<Node> nodeList = new ArrayList<Node>(10);
    	String steps[] = path.split("/");
        collectResults(element, steps, 0, nodeList);
    	
        return new NodeList() {
        	public int getLength() {
        		return nodeList.size();
        	}
        	public Node item(int index) {
        		if (index < 0 || index >= nodeList.size()) {
        			return null;
        		}
        		return nodeList.get(index);
        	}
        };
    }

    public static NodeList queryDomNodes(Document doc, String path) {
    	return queryDomNodes(doc.getDocumentElement(), path);
    }

    public static String queryDomString(Element elm, String path) {
    	NodeList nl = queryDomNodes(elm, path);
    	if (nl.getLength() == 0) return null;
    	return text(nl.item(0));
    }

    public static String text(Node node) {
		StringBuffer sb = new StringBuffer();
		Node n = node.getFirstChild();
		while (n != null) {
			if (n.getNodeType()==Node.TEXT_NODE || n.getNodeType()==Node.CDATA_SECTION_NODE)
				sb.append(n.getNodeValue());
			n = n.getNextSibling();
		}
		return sb.toString();
	}

	public static String queryDomString(Document doc, String path) {
    	return queryDomString(doc.getDocumentElement(), path);
    }

	public static List<Node> findChildNodes(Node node, String childName) {
		List<Node> result = new ArrayList<Node>();
		
		NodeList childNodes = node.getChildNodes();
		int length = childNodes.getLength();
		for (int i = 0; i < length; i++) {
			Node child = childNodes.item(i);
			if (child.getNodeName().equals(childName)) {
				result.add(child);
			}
		}
		
		return result;
	}

	public static String attributeValue(Node node, String attributeName) {
		NamedNodeMap attributes = node.getAttributes();
		Node matchingNode = attributes.getNamedItem(attributeName);
		if (matchingNode != null) {
			return matchingNode.getNodeValue();
		}
		return null;
	}
	
	private static void collectResults(Element element, String[] path, int index, Collection<Node> destination) {
    	// If we matched all the way to the leaf of the path, add the element to the destination....
    	String elemName = element.getNodeName();
    	int lastColon = elemName.lastIndexOf(':');
    	if (lastColon > 0) {
    		elemName = elemName.substring(0, lastColon);
    	}
        if (! elemName.equals(path[index])) return; // No match in this subtree

        if (index >= path.length-1) {
    		destination.add(element);
    		return;
    	}
        
        // OK, we have a match on the path so far, now check rest of the path (possibly none)
        Node child = element.getFirstChild();
        while (child != null) {
        	if (child.getNodeType() == Node.ELEMENT_NODE) {
        		// Recursive step, try t
        		collectResults((Element)child, path, index+1, destination);
        	}
        	child = child.getNextSibling();
        }
    }
}
