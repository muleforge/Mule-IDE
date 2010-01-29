package org.mule.ide.common;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class CommonCodePlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mule.ide.common";

	private static CommonCodePlugin plugin;
	
	public CommonCodePlugin() {
	    super();
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

    @Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static CommonCodePlugin getDefault() {
		return plugin;
	}
}
