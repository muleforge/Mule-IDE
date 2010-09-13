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
import org.mule.ide.common.projectfactory.IdeProjectFactory;
import org.mule.ide.config.simple.wizards.InvalidMuleIdeProject;
import org.mule.ide.project.MuleIdeProject;
import org.osgi.framework.BundleContext;

public class SimpleConfigPlugin extends AbstractUIPlugin
{
    public static final String PLUGIN_ID = "org.mule.ide.config.simple";

    // The shared instance
    private static SimpleConfigPlugin plugin;

    private IdeProjectFactory<MuleIdeProject> projectFactory;

    public static SimpleConfigPlugin getDefault()
    {
        return plugin;
    }

    @Override
    public void start(BundleContext context) throws Exception
    {
        super.start(context);
        plugin = this;

        // Instantiate the project factory eagerly here so that the common code plugin, which
        // provides the factory, is initialized
        projectFactory = new IdeProjectFactory<MuleIdeProject>(MuleIdeProject.class);
        projectFactory.setInvalidProjectClass(InvalidMuleIdeProject.class);
    }

    public IdeProjectFactory<MuleIdeProject> getProjectFactory()
    {
        return projectFactory;
    }
}
