package org.mule.ide.config.core;


public interface PlaceholderSupport {
	/**
	 * Return whether this object is a placeholder element in the model
	 * which should not be serialized.
	 */
	public boolean isIDEPlaceholder();
	
	/**
	 * Flag this object as a placeholder element in the model
	 * which should not be serialized.
	 */
	public void setIDEPlaceholder();

}
