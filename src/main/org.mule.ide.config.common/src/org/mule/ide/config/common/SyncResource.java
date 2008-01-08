package org.mule.ide.config.common;

import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;

public interface SyncResource extends Resource {
	
	public Document getDocument();
	
}
