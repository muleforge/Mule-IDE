package org.mule.ide.config.common.impl;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;

public class SyncXMLLoadImpl extends XMLLoadImpl implements XMLLoad {

	public SyncXMLLoadImpl(XMLHelper helper) {
		super(helper);
	}
	
	
	
}
