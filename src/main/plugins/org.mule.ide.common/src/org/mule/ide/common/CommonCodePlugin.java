/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.common;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class CommonCodePlugin extends AbstractUIPlugin
{
    // The plug-in ID
    public static final String PLUGIN_ID = "org.mule.ide.common";

    private static CommonCodePlugin plugin;

    public CommonCodePlugin()
    {
        super();
    }

    @Override
    public void start(BundleContext context) throws Exception
    {
        super.start(context);
        plugin = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception
    {
        plugin = null;
        super.stop(context);
    }

    public static CommonCodePlugin getDefault()
    {
        return plugin;
    }
}
