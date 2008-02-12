package org.mule.ide.config.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wst.sse.core.internal.provisional.INodeAdapter;
import org.eclipse.wst.sse.core.internal.provisional.INodeNotifier;
import org.eclipse.wst.xml.core.internal.Logger;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncResource;
import org.w3c.dom.Node;


public class SyncAdapterImpl extends AdapterImpl implements SyncAdapter, INodeAdapter {

	protected boolean DEBUG = false;
	
	protected boolean updateEnabled = true;
	
	protected SyncResource syncResource;

	protected IDOMNode domNode;

	protected EObject theObject;
	
	/**
	 * Construct an Adapter given an EObject and a node
	 */
	public SyncAdapterImpl(EObject object, IDOMNode node, SyncResource resource) {
		super();
		this.syncResource = resource;
		this.theObject = object;
		domNode = node;
		addEMFAdapter();
		addDOMAdapter();
	}

	private void addDOMAdapter() {
		// Spejlblank
	}

	/**
	 * If false then notification of changes from the EMF object will be ignored.
	 */
	public boolean isUpdateEnabled() {
		return updateEnabled;
	}

	/**
	 * Set to false and notification of changes from the EMF object will be ignored.
	 */
	public void setUpdateEnabled(boolean isEnabled) {
		updateEnabled = isEnabled;
	}

	/**
	 * If false then notification of changes from the EMF object will be ignored.
	 */
	public boolean isUpdateInEffect() {
		return updateEnabled && syncResource.isUpdateEnabled();
	}

	
	public boolean isAdapterForType(Object type) {
		return SyncAdapter.ADAPTER_CLASS == type;
	}

	protected void addEMFAdapter() {
		getEObject().eAdapters().add(this);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(chopClassName(this));
		sb.append('(');
		sb.append(getNode().getNodeName());
		sb.append(',');
		sb.append(chopClassName(getTarget()));
		sb.append(')');
		return sb.toString();
	}

	protected String chopClassName(Object obj) {
		if (obj != null) {
			String name = obj.getClass().getName();
			int i = name.lastIndexOf('.');
			return name.substring(i + 1, name.length());
		}
		return null;
	}

	/*
	 * Prints out a EMF notification for debugging
	 */
	protected void debugEMFNotify(Notification msg) {
		if (DEBUG) {
			String notifType = ""; //$NON-NLS-1$
			switch (msg.getEventType()) {
				case Notification.ADD :
					notifType = "ADD"; //$NON-NLS-1$
					break;
				case Notification.REMOVE :
					notifType = "REMOVE"; //$NON-NLS-1$
					break;
				case Notification.ADD_MANY :
					notifType = "ADD_MANY"; //$NON-NLS-1$
					break;
				case Notification.REMOVE_MANY :
					notifType = "REMOVE_MANY"; //$NON-NLS-1$
					break;
				case Notification.SET : {
					if (msg.getPosition() == Notification.NO_INDEX)
						notifType = "REPLACE"; //$NON-NLS-1$
					else
						notifType = "SET"; //$NON-NLS-1$
					break;
				}
				case Notification.UNSET :
					notifType = "UNSET"; //$NON-NLS-1$
					break;
			}

			System.out.println("EMF Change: " + notifType); //$NON-NLS-1$
			System.out.println("\tnotifier      : " + msg.getNotifier()); //$NON-NLS-1$
			System.out.println("\tchangedFeature: " + msg.getFeature()); //$NON-NLS-1$
			System.out.println("\toldValue      : " + msg.getOldValue()); //$NON-NLS-1$
			System.out.println("\tnewValue      : " + msg.getNewValue()); //$NON-NLS-1$
		}
	}

	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		
		if (! isUpdateInEffect()) return;
		
		debugEMFNotify(msg);

		syncResource.notify(msg, getEObject(), getNode());
	}
	
	public EObject getEObject() {
		return theObject;
	}

	public Node getNode() {
		return domNode;
	}

	public boolean isEMFProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeAdapters(Node node) {
		// TODO Auto-generated method stub
	}

	public void setNode(Node node) {
		// TODO Auto-generated method stub
	}

	public void updateDOM() {
		// TODO Auto-generated method stub
	}

	public void updateEMF() {
		// Not sure we are going to be using this for M2
	}
	
	/*
	 * This method is called when the DOM node changes. It attempts to update
	 * MOF object based on the changes.
	 */
	public void notifyChanged(INodeNotifier notifier, int eventType, Object changedFeature, Object oldValue, Object newValue, int pos) {

		if (!isUpdateInEffect())
			return;

		debugDOMNotify(notifier, eventType, changedFeature, oldValue, newValue);

		if (notifier != getNode() && eventType != INodeNotifier.CHANGE) {
			// This is the case where the notification was sent from a
			// sub node. Use the notifiers name to determine which
			// MOF feature to update.
		}
		else {
			// Update everything on STRUCTURE_CHANGE or CONTENT_CHANGE.
			// Other event types occur too often.
			if (eventType == INodeNotifier.STRUCTURE_CHANGED || eventType == INodeNotifier.CONTENT_CHANGED) {
				//updateMOF();
			}
			// Update just the attribute that changed.
			else if (eventType == INodeNotifier.CHANGE) {
			}
		}
	}

	/*
	 * Prints out a DOM notification for debugging.
	 */
	protected void debugDOMNotify(INodeNotifier notifier, int eventType, Object changedFeature, Object oldValue, Object newValue) {
		if (DEBUG) {
			String notifType = ""; //$NON-NLS-1$
			switch (eventType) {
				case INodeNotifier.ADD :
					notifType = "ADD"; //$NON-NLS-1$
					break;
				case INodeNotifier.REMOVE :
					notifType = "REMOVE"; //$NON-NLS-1$
					break;
				case INodeNotifier.CHANGE :
					notifType = "CHANGE"; //$NON-NLS-1$
					break;
				case INodeNotifier.CONTENT_CHANGED :
					notifType = "CONTENT_CHANGED"; //$NON-NLS-1$
					break;
				case INodeNotifier.STRUCTURE_CHANGED :
					notifType = "STRUCTURE_CHANGE"; //$NON-NLS-1$
					break;
			}
			Logger.log(Logger.INFO_DEBUG, "DOM Change: " + notifType); //$NON-NLS-1$
			Logger.log(Logger.INFO_DEBUG, "\tnotifier      : " + notifier); //$NON-NLS-1$
			Logger.log(Logger.INFO_DEBUG, "\tchangedFeature: " + changedFeature); //$NON-NLS-1$
			Logger.log(Logger.INFO_DEBUG, "\toldValue      : " + oldValue); //$NON-NLS-1$
			Logger.log(Logger.INFO_DEBUG, "\tnewValue      : " + newValue); //$NON-NLS-1$
		}
	}

	protected void disableUndoManagementIfNecessary() {
		IDOMModel model = this.domNode.getModel();
		if (model != null && model.getUndoManager() != null)
			model.disableUndoManagement();
	}

	protected void enableUndoManagement() {
		IDOMModel model = this.domNode.getModel();
		if (model != null && model.getUndoManager() != null)
			model.enableUndoManagement();
	}
	
	protected void postUpdateDOMFeature(Node node, EObject emfObject) {
		enableUndoManagement();
	}

	protected void preUpdateDOMFeature(Node node, EObject emfObject) {
		disableUndoManagementIfNecessary();
	}

	protected void primAddDOMAdapter(Node aNode, SyncAdapter anAdapter) {
		domNode.addAdapter((SyncAdapterImpl) anAdapter);
	}

}
