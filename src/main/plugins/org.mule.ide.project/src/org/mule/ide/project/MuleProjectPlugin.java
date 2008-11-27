package org.mule.ide.project;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class MuleProjectPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mule.ide.project";

    /** Unique for the Mule classpath container. This matches the id in the 
     * classpathContainerInitializer extension in plugin.xml */
    public static final String ID_MULE_CLASSPATH_CONTAINER = "org.mule.ide.project.muleClasspath";

	// The shared instance
	private static MuleProjectPlugin plugin;
	
	/**
	 * The constructor
	 */
	public MuleProjectPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		MulePreferences.clearRuntimeCache();
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static MuleProjectPlugin getInstance() {
		return plugin;
	}
	
	/**
	 * 
	 */
	public void logError(String error) {
		logError(error, null);
	}

	/**
	 * 
	 */
	public void logError(String error, Throwable throwable) {
		if (error == null && throwable != null) {
			error = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK,
						error, throwable));
		debug(error, throwable);
	}
	
	/**
	 * 
	 */
	private void debug(String message, Throwable throwable) {
		if (!isDebugging()) {
			return;
		}
		if (message != null) {
			System.err.println(message);
		}
		if (throwable != null) {
			throwable.printStackTrace();
		}
	}

}
