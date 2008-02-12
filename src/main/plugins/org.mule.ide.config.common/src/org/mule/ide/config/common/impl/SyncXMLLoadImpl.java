package org.mule.ide.config.common.impl;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.mule.ide.config.common.SyncHandler;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

public class SyncXMLLoadImpl extends XMLLoadImpl implements XMLLoad {

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
			SyncHandler sh = (SyncHandler)handler;
		
			sh.setCurrentNode(node);
			super.traverse(node, attributesProxy, handler, lexicalHandler);
			sh.setCurrentNode(oldCurrent);
		}
	}
	
	  protected DefaultHandler makeDefaultHandler()
	  {
	    return new SyncSAXXMLHandler(resource, helper, options);
	  }

	
}
