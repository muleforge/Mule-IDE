/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.debug.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class DebugUIPlugin extends AbstractUIPlugin
{
    // The plug-in ID
    public static final String PLUGIN_ID = "org.mule.ide.debug.ui";

    // The shared instance
    private static DebugUIPlugin plugin;

    public DebugUIPlugin()
    {
        super();
    }

    public void start(BundleContext context) throws Exception
    {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context) throws Exception
    {
        plugin = null;
        super.stop(context);
    }

    public static DebugUIPlugin getDefault()
    {
        return plugin;
    }

    /**
     * Returns an image for the image file at the given plug-in relative path. Client
     * do not need to dispose this image. Images will be disposed automatically.
     * 
     * @generated
     * @param path the path
     * @return image instance
     */
    public Image getBundledImage(String path)
    {
        Image image = getImageRegistry().get(path);
        if (image == null)
        {
            getImageRegistry().put(path, getBundledImageDescriptor(path));
            image = getImageRegistry().get(path);
        }
        return image;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in relative
     * path.
     * 
     * @generated
     * @param path the path
     * @return the image descriptor
     */
    public static ImageDescriptor getBundledImageDescriptor(String path)
    {
        return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
    }
}
