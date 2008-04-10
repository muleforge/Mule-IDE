package org.mule.ide.config.core;


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
public interface PlaceholderSupport {
	/**
	 * Return whether this object is a placeholder element in the model
	 * which should not be serialized.
	 */
	public boolean isIDEPlaceholder();

}
