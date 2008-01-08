package org.mule.ide.config.common.impl;

import java.util.Map;

import org.eclipse.emf.ecore.xmi.DOMHandler;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.w3c.dom.Document;

public class SyncXMLSaveImpl extends XMLSaveImpl implements XMLSave {

	public SyncXMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	public Document save(XMLResource resource, Document doc, Map<?, ?> options,
			DOMHandler handler) {
		if (resource instanceof SyncResourceImpl) {
			
		}
		
		// TODO Auto-generated method stub
		return super.save(resource, doc, options, handler);
	}
}
