package org.mule.ide.config.common;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Node;

public interface SyncAdapter extends Adapter {

	Class<SyncAdapter> ADAPTER_CLASS = SyncAdapter.class;

	/**
	 * Return the DOM node that the target of this adapter maps to. 
	 * If the target EMF object maps to more than one DOM node, this node is the top-most node.
	 */
	Node getNode();

	void setNode(Node aNode);

	/**
	 * Set to false and notification of changes from both the DOM node and the EMF object will be
	 * ignored.
	 */
	boolean isUpdateEnabled();

	/**
	 * Set to false and notification of changes from both the DOM node and the EMF object will be
	 * ignored.
	 */
	void setUpdateEnabled(boolean isEnabled);

	/**
	 * Updates the DOM tree for this adapter from the current values of the EMF Object. This method
	 * updates ALL the DOM nodes from all the EMF attributes.
	 */
	void updateDOM();

	/**
	 * Updates the EMF Object from the DOM tree. All the children of the DOM tree are updated into
	 * the EMF object.
	 */
	void updateEMF();

	EObject getEObject();

	/**
	 * Return true if EMF object is a proxy.
	 */
	boolean isEMFProxy();

	/**
	 * Remove the DOM adapters from the node AND all its child nodes, recursively.
	 */
	void removeAdapters(Node node);
}