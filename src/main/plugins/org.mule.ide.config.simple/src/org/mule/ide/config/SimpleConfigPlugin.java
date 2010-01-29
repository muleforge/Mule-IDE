package org.mule.ide.config;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mule.ide.common.CommonCodePlugin;
import org.osgi.framework.BundleContext;

public class SimpleConfigPlugin extends AbstractUIPlugin {

    public SimpleConfigPlugin() {
        super();
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);

        // this plugin needs the common code plugin to work properly. Make sure it's loaded.
        CommonCodePlugin.getDefault();
    }
}