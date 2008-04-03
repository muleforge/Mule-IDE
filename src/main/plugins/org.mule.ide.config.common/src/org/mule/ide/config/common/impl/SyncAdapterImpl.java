package org.mule.ide.config.common.impl;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.wst.sse.core.internal.provisional.INodeAdapter;
import org.eclipse.wst.sse.core.internal.provisional.INodeNotifier;
import org.eclipse.wst.xml.core.internal.Logger;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncResource;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class SyncAdapterImpl extends AdapterImpl implements SyncAdapter, INodeAdapter {

	protected boolean DEBUG = true;
	
	protected boolean updateEnabled = true;
	
	protected SyncResource syncResource;

	protected IDOMNode domNode;

	protected EObject theObject;
	
	protected Map<EStructuralFeature, Element> featureToElementMap;
	
	/**
	 * Construct an Adapter given an EObject and a node
	 */
	public SyncAdapterImpl(EObject object, Node node, SyncResource resource) {
		super();
		this.syncResource = resource;
		this.theObject = object;
		domNode = node instanceof IDOMNode ? (IDOMNode)node : null;
	}

	public void wireAdapters() {
		getEObject().eAdapters().add(this);
		this.domNode.addAdapter(this);
	}

	public void unwireAdapters() {
		this.domNode.removeAdapter(this);
		theObject.eAdapters().remove(this);		
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
				default:
					notifType = "" + msg.getEventType(); //$NON-NLS-1$
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
//		if (msg.isTouch()) return; // Only do the work if state is changed
		
		debugEMFNotify(msg);

		boolean wasUpdatable = this.syncResource.isUpdateEnabled();
		try {
			this.syncResource.setUpdateEnabled(false);
	
			syncResource.notify(msg, getEObject(), getNode(), this);
		} finally {
			this.syncResource.setUpdateEnabled(wasUpdatable);
		}
	}
	
	public EObject getEObject() {
		return theObject;
	}

	public Node getNode() {
		return domNode;
	}

	public void setNode(Node node) {
		if (node instanceof IDOMNode)
			this.domNode = (IDOMNode)node;
	}

	/*
	 * This method is called when the DOM node changes. It attempts to update
	 * MOF object based on the changes.
	 */
	public void notifyChanged(INodeNotifier notifier, int eventType, Object changedFeature, Object oldValue, Object newValue, int pos) {
		if (!isUpdateInEffect())
			return;

		debugDOMNotify(notifier, eventType, changedFeature, oldValue, newValue);
		
		boolean wasUpdatable = this.syncResource.isUpdateEnabled();
		try {
			this.syncResource.setUpdateEnabled(false);

			this.syncResource.xmlNotify((Node)notifier, eventType, changedFeature, oldValue, newValue, pos, this);
		} finally {
			this.syncResource.setUpdateEnabled(wasUpdatable);
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
			System.out.println("DOM Change: " + notifType); //$NON-NLS-1$
			System.out.println("\tnotifier      : " + notifier); //$NON-NLS-1$
			System.out.println("\tchangedFeature: " + changedFeature); //$NON-NLS-1$
			System.out.println("\toldValue      : " + oldValue); //$NON-NLS-1$
			System.out.println("\tnewValue      : " + newValue); //$NON-NLS-1$
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

	public Element getFeatureElement(EStructuralFeature ef) {
		return featureToElementMap == null ? null : featureToElementMap.get(ef);
	}

	public void clearFeatureElement(EStructuralFeature f) {
		if (featureToElementMap != null) {
			featureToElementMap.remove(f);
		}
	}

	public void setFeatureElement(EStructuralFeature f, Element e) {
		if (e != null) {
			if (featureToElementMap == null) {
				featureToElementMap = new TreeMap<EStructuralFeature, Element>(COMPARATOR_INSTANCE);				
			}
			featureToElementMap.put(f, e);
		} else {
			clearFeatureElement(f);		
		}
	}

	static class FeatureComparator implements Comparator<EStructuralFeature> {

		public int compare(EStructuralFeature o1, EStructuralFeature o2){
			return o1.getFeatureID() - o2.getFeatureID();
		}
		
	};
	private static final FeatureComparator COMPARATOR_INSTANCE = new FeatureComparator();

}
