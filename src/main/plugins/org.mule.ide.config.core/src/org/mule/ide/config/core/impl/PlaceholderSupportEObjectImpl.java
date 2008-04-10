package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.mule.ide.config.core.PlaceholderSupport;

public class PlaceholderSupportEObjectImpl extends EObjectImpl implements
		PlaceholderSupport {

	private boolean isIDEPlaceholder = false;
	private IDEPlaceholderListener placeholderListener = null;
	
	/**
	 * Return whether this object is a placeholder element in the model
	 * which should not be serialized.
	 */
	public boolean isIDEPlaceholder() {
		return isIDEPlaceholder;
	}
	
	/**
	 * Flag this object as a placeholder element in the model
	 * which should not be serialized.
	 */
	public void setIDEPlaceholder() {
		if (isIDEPlaceholder) return;
		
		isIDEPlaceholder = true;
		if (placeholderListener == null) {
			placeholderListener = new IDEPlaceholderListener();
			// Note - we must add it at the beginning so the next
			// adapters in the chain can see when we're gone
			eAdapters().add(0, placeholderListener);
		}
		if (this.eContainer != null)
			this.eContainer.eSet(this.eContainingFeature(), this);
	}
	
	/*
	 * If any feature on this object is set then assume this is
	 * no longer a placeholder.
	 * Needs synchronization?
	 * TODO Probably need to figure out Undo handling
	 */
	private void unsetIDEPlaceholder() {
		isIDEPlaceholder = false;
		this.eContainer.eSet(this.eContainingFeature(), this);
	}

	class IDEPlaceholderListener extends AdapterImpl {
		public void notifyChanged(Notification msg) {
			boolean hasChildren = !((EObject)msg.getNotifier()).eContents().isEmpty();
			if (hasChildren && isIDEPlaceholder()) { 
				unsetIDEPlaceholder();
			} else if (!hasChildren && !isIDEPlaceholder()){
				setIDEPlaceholder();
			}
		}
	}
	
}
