package org.mule.ide.config.common;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public interface SyncResource extends XMLResource {
	
	boolean isUpdateEnabled();
	
	void notify(Notification msg, EObject object, Node where, SyncAdapter adapter);
	
	public Document getDocument();

	void setUpdateEnabled(boolean enabled);
	
	public final static String SAVE_OPTION_SUPRESS_TEXT_SAVE = "SUPRESS_TEXT_SAVE";
}
