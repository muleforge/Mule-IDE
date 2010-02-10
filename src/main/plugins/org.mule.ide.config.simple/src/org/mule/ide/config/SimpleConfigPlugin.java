/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.config;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mule.ide.common.CommonCodePlugin;
import org.osgi.framework.BundleContext;

public class SimpleConfigPlugin extends AbstractUIPlugin
{
    public SimpleConfigPlugin()
    {
        super();
    }

    @Override
    public void start(BundleContext context) throws Exception
    {
        super.start(context);

        // this plugin needs the common code plugin to work properly. Make sure it's
        // loaded.
        CommonCodePlugin.getDefault();
    }
}
