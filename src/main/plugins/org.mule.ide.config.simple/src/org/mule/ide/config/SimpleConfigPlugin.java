package org.mule.ide.config;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mule.ide.common.projectfactory.IdeProjectFactory;
import org.mule.ide.config.simple.wizards.InvalidMuleIdeProject;
import org.mule.ide.config.simple.wizards.MuleIdeProject;
import org.osgi.framework.BundleContext;

public class SimpleConfigPlugin extends AbstractUIPlugin {

    // The shared instance
    private static SimpleConfigPlugin plugin;

    private IdeProjectFactory<MuleIdeProject> projectFactory;
    
    public static SimpleConfigPlugin getDefault() {
        return plugin;
    }

    public SimpleConfigPlugin() {
        super();
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;

        // Instantiate the project factory eagerly here so that the common code plugin, which 
        // provides the factory, is initialized
        projectFactory = new IdeProjectFactory<MuleIdeProject>(MuleIdeProject.class);
        projectFactory.setInvalidProjectClass(InvalidMuleIdeProject.class);
    }
    
    public IdeProjectFactory<MuleIdeProject> getProjectFactory() {
        return projectFactory;
    }
}