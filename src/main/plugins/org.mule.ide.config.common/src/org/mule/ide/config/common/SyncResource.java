package org.mule.ide.config.common;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public interface SyncResource extends Resource {
	
	boolean isUpdateEnabled();
	
	void notify(Notification msg, EObject object, Node where);
	
	public Document getDocument();
	
}
