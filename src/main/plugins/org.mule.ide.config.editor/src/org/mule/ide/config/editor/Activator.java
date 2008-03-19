package org.mule.ide.config.editor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mule.ide.config.editor.internal.overview.OverviewLabelProvider;
import org.mule.ide.config.editor.services.part.ServicesEditorPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mule.ide.config.editor";

	// The shared instance
	private static Activator plugin;

	// Shared colors for all forms
	private FormColors fFormColors;

	private ILabelProvider fLabelProvider;
	private ILabelProvider fOverviewLabelProvider;
	
	private Collection<EPackage> fMuleEcorePackages;
	private TreeMap<String, EPackage> fMuleEcorePackageMap;

	/**
	 * The constructor
	 */
	public Activator() {
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
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @generated
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * Respects images residing in any plug-in. If path is relative,
	 * then this bundle is looked up for the image, otherwise, for absolute 
	 * path, first segment is taken as id of plug-in with image
	 *
	 * @generated
	 * @param path the path to image, either absolute (with plug-in id as first segment), or relative for bundled images
	 * @return the image descriptor
	 */
	public static ImageDescriptor findImageDescriptor(String path) {
		final IPath p = new Path(path);
		if (p.isAbsolute() && p.segmentCount() > 1) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0), p
					.removeFirstSegments(1).makeAbsolute().toString());
		} else {
			return getBundledImageDescriptor(p.makeAbsolute().toString());
		}
	}

	/**
	 * Returns an image for the image file at the given plug-in relative path.
	 * Client do not need to dispose this image. Images will be disposed automatically.
	 *
	 * @generated
	 * @param path the path
	 * @return image instance
	 */
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}


	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * @generated
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
	public void logInfo(String message) {
		logInfo(message, null);
	}

	/**
	 * 
	 */
	public void logInfo(String message, Throwable throwable) {
		if (message == null && throwable != null) {
			message = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.INFO, PLUGIN_ID, IStatus.OK,
						message, throwable));
		debug(message, throwable);
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
	
	public FormColors getFormColors(Display display) {
		if (fFormColors == null) {
			fFormColors = new FormColors(display);
			fFormColors.markShared();
		}
		return fFormColors;
	}

	public ILabelProvider getLabelProvider() {
		if (fLabelProvider == null) {
			// Note that we may want a separate label provider for Overview
			// and Services page, but for now, use the same one...
			AdapterFactory adapterFactory = ServicesEditorPlugin.getInstance().getItemProvidersAdapterFactory();
			fLabelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		}
		return fLabelProvider;
	}

	public ILabelProvider getOverviewLabelProvider() {
		if (fOverviewLabelProvider == null) {
			AdapterFactory adapterFactory = ServicesEditorPlugin.getInstance().getItemProvidersAdapterFactory();
			fOverviewLabelProvider = new OverviewLabelProvider(adapterFactory);
		}
		return fOverviewLabelProvider;
	}
	
	public static final String MULE_URI_PREFIX = "http://www.mulesource.org/schema/";
	public static final String MULE_SPRING_BEANS_URI_PREFIX = "http://www.springframework.org/schema/beans";
	
	/**
	 * Gets the set of EPackages in the EPackage Registry that are
	 * recognized in the config editor.
	 * 
	 * Set will be sorted alphabetically by namespace prefix.
	 * 
	 * @return Collection<EPackage>
	 */
	// TODO Need to implement a real extension point for registering mule 
	//      model extensions.  For now we're just using URI prefixes.
	public Collection<EPackage> getMuleEcorePackages() {
		if (fMuleEcorePackages == null) {
			initMuleEcorePackages();
		}
		return fMuleEcorePackages;
	}

	public Map<String, EPackage> getMuleEcorePackageMap() {
		if (fMuleEcorePackageMap == null) {
			initMuleEcorePackages();
		}
		return fMuleEcorePackageMap;
	}
	
	private void initMuleEcorePackages() {
		// Sort by nsPrefix
		TreeMap<String, EPackage> temp = new TreeMap<String, EPackage>();
		//Set<Map.Entry<String,Object>> entries = EPackage.Registry.INSTANCE.entrySet();
		//for (Map.Entry<String,Object> entry : entries) {
		Set<String> uris = EPackage.Registry.INSTANCE.keySet();
		for (String uri : uris) {
			if (uri == null) continue;
			if (uri.startsWith(MULE_URI_PREFIX) ||
					uri.startsWith(MULE_SPRING_BEANS_URI_PREFIX)) {
				EPackage p = EPackage.Registry.INSTANCE.getEPackage(uri);
				if (p != null) {
					temp.put(p.getNsPrefix(), p);
				}
				/*
				if (entry.getValue() instanceof EPackage) {
					EPackage p = (EPackage) entry.getValue();
					temp.put(p.getNsPrefix(), p);
				}
				*/
			}
		}
		fMuleEcorePackageMap = temp;
		fMuleEcorePackages = temp.values();		
	}
}
