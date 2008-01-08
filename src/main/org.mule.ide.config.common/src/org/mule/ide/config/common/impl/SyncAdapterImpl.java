package org.mule.ide.config.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.mule.ide.config.common.SyncAdapter;
import org.w3c.dom.Node;


public class SyncAdapterImpl extends AdapterImpl implements SyncAdapter {

	protected boolean DEBUG = true;
	
	protected boolean updateEnabled = true;

	protected Node domNode;

	/**
	 * Construct an Adapter given an EObject and a node
	 */
	public SyncAdapterImpl(Notifier object, Node node) {
		super();
		setTarget(object);
		domNode = node;
		addEMFAdapter();
		addDOMAdapter();
	}

	private void addDOMAdapter() {
		// TODO Auto-generated method stub
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

	public boolean isAdapterForType(Object type) {
		return SyncAdapter.ADAPTER_CLASS == type;
	}

	protected void addEMFAdapter() {
		target.eAdapters().add(this);
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

	public EObject getEObject() {
		// Wouldn't this usuablly be "getTarget"
		return null;
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
}
