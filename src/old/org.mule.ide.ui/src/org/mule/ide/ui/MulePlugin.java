/**
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * MULE_LICENSE.txt file.
 */

package org.mule.ide.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.mule.ide.core.MuleCorePlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class MulePlugin extends AbstractUIPlugin {

	static public final String PLUGIN_ID = "org.mule.ide.ui";

	// The shared instance.
	private static MulePlugin plugin;

	public IPreferenceStore myPreferenceStore;

	/**
	 * Returns the preference store for this UI plug-in, which is the same as the core plug-in's.
	 * 
	 * @return the preference store
	 */

	public IPreferenceStore getPreferenceStore() {
		if (myPreferenceStore == null) {
			myPreferenceStore = new ScopedPreferenceStore(new InstanceScope(), MuleCorePlugin.getDefault()
					.getBundle().getSymbolicName());
		}
		return myPreferenceStore;
	}

	/**
	 * The constructor.
	 */
	public MulePlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static MulePlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path.
	 * 
	 * @param path the path
	 * @return the image descriptor
	 */
	private ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.mule.ide.ui", path);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#initializeImageRegistry(org.eclipse.jface.resource.ImageRegistry)
	 */
	protected void initializeImageRegistry(ImageRegistry reg) {
		super.initializeImageRegistry(reg);
		reg.put(IMuleImages.KEY_MULE_LOGO, getImageDescriptor(IMuleImages.PATH_MULE_LOGO));
		reg.put(IMuleImages.KEY_MULE_CONFIG, getImageDescriptor(IMuleImages.PATH_MULE_CONFIG));
		reg.put(IMuleImages.KEY_MULE_WIZARD_BANNER, getImageDescriptor(IMuleImages.PATH_MULE_WIZARD_BANNER));
	}

	/**
	 * Get the image registered under the given key.
	 * 
	 * @param key the key
	 * @return the image
	 */
	public Image getImage(String key) {
		return getImageRegistry().get(key);
	}

	/**
     * Create a status of a given type.
     *
     * @param type the IStatus constant
     * @param message the message
     * @param exception the exception (may be null)
     * @return the status
     */
    public IStatus createStatus(int type, String message, Throwable exception) {
        return new Status(type, PLUGIN_ID, 0, message, exception);
    }

	/**
	 * Show an error dialog with the given message.
	 * 
	 * @param message the message
	 */
	public void showError(String message, IStatus status) {
		if (getWorkbench().getActiveWorkbenchWindow() != null) {
			ErrorDialog.openError(getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", message,
					status);
		}
	}
}