package org.mule.ide.config.common.impl;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.xml.core.internal.Logger;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class SyncUtilities {

	public static final String DEFAULT_NEWLINE = System.getProperty("line.separator"); //$NON-NLS-1$
	public static final String DEFAULT_INDENT = "\t"; //$NON-NLS-1$
	
	protected static void indent(Node node) {
		String indentString = calcIndentString(node);
	
		indentOpenTag(indentString, node);
	
		indentCloseTab(indentString, node);
	}

	protected static String getDocumentNewline(Node node) {
		// If not a IStructuredDocument then take the default.
		if (node instanceof IDOMNode) {
			IDOMNode xmlNode = (IDOMNode) node;
			IStructuredDocument document = xmlNode.getStructuredDocument();
			if (document != null) {
				return document.getLineDelimiter();
			}
		}
		return DEFAULT_NEWLINE;
	}

	protected static void indentCloseTab(String indentString, Node node) {
		Text ws = node.getOwnerDocument().createTextNode(getDocumentNewline(node) + indentString); //$NON-NLS-1$
		insertBefore(node, ws, null);
	}

	protected static void indentOpenTag(String indentString, Node node) {
		Node parent = node.getParentNode();
		Text ws = node.getOwnerDocument().createTextNode(getDocumentNewline(node) + indentString); //$NON-NLS-1$
		insertAfter(parent, ws, getPreviousNonText(node));
	}

	public static void insertAfter(Node parent, Node newNode, Node refNode) {
		Node beforeNode = null;
		if (refNode != null) {
			beforeNode = refNode.getNextSibling();
		}
		if (refNode == null)
			insertBefore(parent, newNode, parent.getFirstChild());
		else
			insertBefore(parent, newNode, beforeNode);
	}

	static public void insertBefore(Node parent, Node newNode, Node refNode) {
		if (newNode.getNodeType() == Node.TEXT_NODE) {
			Text textNewNode = (Text) newNode;
	
			// If the insert before node is text, join it with the new node.
			if (refNode != null && refNode.getNodeType() == Node.TEXT_NODE) {
				Text textRefNode = (Text) refNode;
				textRefNode.setData(textNewNode.getData() + textRefNode.getData());
				return;
			}

			// If the node we are inserting after is text,
			// join it with the new node.
			Node insertAfterNode = (refNode == null) ? parent.getLastChild() : refNode.getPreviousSibling();
			if (insertAfterNode != null && insertAfterNode.getNodeType() == Node.TEXT_NODE) {
				Text textInsertAfterNode = (Text) insertAfterNode;
				textInsertAfterNode.setData(textInsertAfterNode.getData() + textNewNode.getData());
				return;
			}
		}
		// There is no text node to join to, simple insert the node.
		parent.insertBefore(newNode, refNode);
	}

	protected static String calcIndentString(Node node) {
		Node parent = node.getParentNode();
	
		String indentString = getDocumentNewline(node);
	
		// Find indentation string for this node based on its sibling or
		// parent
		Node previousSibling = getPreviousNonText(node);
		if (previousSibling != null) {
			indentString = getIndentString(previousSibling);
		}
		else {
			String parentIndentString = getIndentString(parent);
			indentString = parentIndentString + DEFAULT_INDENT;
		}
		return indentString;
	}

	protected static String getIndentString(Node node) {
		IStructuredDocument flatModel = ((IDOMNode) node).getStructuredDocument();
		int nodeStartOff = ((IDOMNode) node).getStartOffset();
	
		int startOff = Math.max(0, nodeStartOff - 100);
		int endOff = nodeStartOff;
	
		try {
			String text = flatModel.get(startOff, endOff - startOff);
	
			int inx = text.length() - 1;
			if (inx >= 0) {
				for (; inx >= 0; inx--) {
					char ch = text.charAt(inx);
					if (Character.isWhitespace(ch) && ch != '\n' && ch != '\r') {
						continue;
					}
					inx++;
					break;
				}
	
				return text.substring(inx);
			}
		}
		catch (BadLocationException ex) {
			Logger.logException(ex);
		}
		return ""; //$NON-NLS-1$
	}

	public static Node getPreviousNonText(Node node) {
		if (node == null)
			return null;
		Node sibling = node.getPreviousSibling();
		while (sibling != null && sibling.getNodeType() == Node.TEXT_NODE)
			sibling = sibling.getPreviousSibling();
		return sibling;
	}

}
