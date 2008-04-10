package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.mule.ide.config.core.PlaceholderSupport;

/**
 * Support for placeholder instances of model objects.
 * Placeholders are used when the graphical editor wants to 
 * display a model object which does not exist in source.
 * 
 * Instances of this object will be initialized in the 
 * "placeholder" state.  If any feature is set,
 * then it will transition into "non-placeholder" state.
 * 
 * Note that transitioning back into the placeholder state
 * is not supported.  In this situation, a new placeholder 
 * instance should be created and replace the previous one. 
 */
public class PlaceholderSupportEObjectImpl extends EObjectImpl implements
		PlaceholderSupport {

	private boolean isIDEPlaceholder = false;
	private IDEPlaceholderListener placeholderListener = null;
	
	public PlaceholderSupportEObjectImpl() {
		super();
		
		// Initialize in the placeholder state
		setIDEPlaceholder();
	}
	
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
	private void setIDEPlaceholder() {
		if (isIDEPlaceholder) return;
		
		isIDEPlaceholder = true;
		if (placeholderListener == null) {
			placeholderListener = new IDEPlaceholderListener();
			// Note - we must add it at the beginning so the next
			// adapters in the chain can see when we're gone
			eAdapters().add(0, placeholderListener);
		}
	}
	
	/*
	 * If any feature on this object is set then assume this is
	 * no longer a placeholder.
	 * Needs synchronization?
	 * TODO Probably need to figure out Undo handling
	 */
	private void unsetIDEPlaceholder() {
		isIDEPlaceholder = false;
		if (placeholderListener != null) {
			eAdapters().remove(placeholderListener);
			placeholderListener = null;
		}
		this.eContainer.eSet(this.eContainingFeature(), this);
	}

	class IDEPlaceholderListener extends AdapterImpl {
		public void notifyChanged(Notification msg) {
			int eventType = msg.getEventType();
			if (eventType == Notification.ADD || eventType == Notification.ADD_MANY
					|| eventType == Notification.SET ) {
				unsetIDEPlaceholder();
			}
		}
	}
	
}
