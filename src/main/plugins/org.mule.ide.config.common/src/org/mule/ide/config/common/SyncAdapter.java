package org.mule.ide.config.common;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.w3c.dom.Element;
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

	void wireAdapters();

	void unwireAdapters();

	Element getFeatureElement(EStructuralFeature ef);

	void clearFeatureElement(EStructuralFeature f);
	
	void setFeatureElement(EStructuralFeature f, Element e);

}