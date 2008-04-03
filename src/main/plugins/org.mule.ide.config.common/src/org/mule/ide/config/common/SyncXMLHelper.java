package org.mule.ide.config.common;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.w3c.dom.Element;

public interface SyncXMLHelper extends XMLHelper {
	
	void setCurrentElement(Element element);

	void flushReloaderContext();
}
