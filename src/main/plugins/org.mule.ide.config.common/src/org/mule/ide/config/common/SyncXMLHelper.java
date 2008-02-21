package org.mule.ide.config.common;

import org.w3c.dom.Element;

public interface SyncXMLHelper {
	void resetPrefixContext();
	
	void setPrefixContext(Element element);
	
	void setCurrentElement(Element element);
	
}
