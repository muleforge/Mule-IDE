/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class MuleProjectPlugin extends AbstractUIPlugin
{
    /**
     * The plug-in ID
     */
    public static final String PLUGIN_ID = "org.mule.ide.project";

    /**
     * Unique for the Mule classpath container. This matches the id in the
     * classpathContainerInitializer extension in plugin.xml
     */
    public static final String ID_MULE_CLASSPATH_CONTAINER = "org.mule.ide.project.muleClasspath";

    // The shared instance
    private static MuleProjectPlugin plugin;

    public MuleProjectPlugin()
    {
        super();
    }

    @Override
    public void start(BundleContext context) throws Exception
    {
        super.start(context);
        plugin = this;
        MulePreferences.initRuntimeCache();
    }

    @Override
    public void stop(BundleContext context) throws Exception
    {
        plugin = null;
        MulePreferences.clearRuntimeCache();
        super.stop(context);
    }

    public static MuleProjectPlugin getInstance()
    {
        return plugin;
    }

    public void logError(String error)
    {
        logError(error, null);
    }

    public void logError(String error, Throwable throwable)
    {
        if (error == null && throwable != null)
        {
            error = throwable.getMessage();
        }
        getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, error, throwable));
        debug(error, throwable);
    }

    private void debug(String message, Throwable throwable)
    {
        if (!isDebugging())
        {
            return;
        }
        if (message != null)
        {
            System.err.println(message);
        }
        if (throwable != null)
        {
            throwable.printStackTrace();
        }
    }
}
