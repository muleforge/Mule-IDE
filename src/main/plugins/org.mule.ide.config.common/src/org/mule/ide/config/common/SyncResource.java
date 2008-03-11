package org.mule.ide.config.common;

import java.util.concurrent.Executor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public interface SyncResource extends XMLResource {
	
	boolean isUpdateEnabled();
	
	void notify(Notification msg, EObject object, Node where, SyncAdapter adapter);

	void xmlNotify(Node notifier, int eventType, Object changedFeature, Object oldValue, Object newValue, int pos, SyncAdapter adapter);
	
	public Document getDocument();

	void setUpdateEnabled(boolean enabled);
	
	void setModelUpdateExecutor(Executor executor);
	
	public final static String SAVE_OPTION_SUPRESS_TEXT_SAVE = "SUPRESS_TEXT_SAVE";
	
	
}
