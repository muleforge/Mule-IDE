/*
 * $Id: MulePreferences.java 1 2007-08-16 16:30:25Z quoc $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project;

import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;

import org.mule.ide.project.internal.runtime.MuleRuntime;
import org.mule.ide.project.runtime.IMuleRuntime;

/**
 * Preferences for various Mule settings.
 * 
 * @author dadams, jsmoller
 */
public class MulePreferences {

	public static final String MULE_PREFERENCES_ID = "org.mule.ide.preferences.MulePreferencePage";

	/** Prefix for Mule installation roots */
	public static final String EXTERNAL_MULE_ROOT_PREFIX = "externalMuleRoot.";

	/** Location of external Mule installation root */
	public static final String EXTERNAL_MULE_ROOT_COUNT = "externalMuleRootCount";

	/** Number of the default Mule installation root */
	public static final String DEFAULT_EXTERNAL_MULE_ROOT = "defaultExternalMuleRoot";

	private static Map<File, IMuleRuntime> mapFileToRuntime = new WeakHashMap<File, IMuleRuntime>();
	
	public static String[] getDistributionPaths() {
		int n = getIntPreference(EXTERNAL_MULE_ROOT_COUNT);
		String distributions[] = new String[n];
		for (int i = 0; i < n; ++i) {
			distributions[i] = getStringPreference(EXTERNAL_MULE_ROOT_PREFIX + i);
		}
		return distributions;
	}
	
	public static int getDefaultDistributionIndex() {
		return getIntPreference(DEFAULT_EXTERNAL_MULE_ROOT);
	}

	public static void setDistributions(String[] distributions, int selected) {
		int oldMax = getIntPreference(EXTERNAL_MULE_ROOT_COUNT);
		
		setIntPreference(EXTERNAL_MULE_ROOT_COUNT, distributions.length);
		int i = 0;
		for (; i < distributions.length; ++i) {
			setStringPreference(EXTERNAL_MULE_ROOT_PREFIX + i, distributions[i]);
		}
		for (; i < oldMax; ++i) {
			clearPreferenceValue(EXTERNAL_MULE_ROOT_PREFIX + i);
		}
		setIntPreference(DEFAULT_EXTERNAL_MULE_ROOT, selected);
		
		clearRuntimeCache();
	}
	
	public static String getDefaultDistributionPath() {
		int defaultIndex = getDefaultDistributionIndex();  
		String[] distributions = getDistributionPaths();
		if (defaultIndex < 0 || defaultIndex >= distributions.length) {
			// unfortunately, getDefaultDistributionIndex() returns 0 if pref is undefined
			return null;
		} else {
			return distributions[defaultIndex];
		}		
	}
	
	public static IMuleRuntime getDefaultMuleRuntime() {
		String defaultPath = getDefaultDistributionPath();  
		if (defaultPath == null) {
			// unfortunately, getDefaultDistributionIndex() returns 0 if pref is undefined
			return null;
		} else {
			return getMuleRuntime(defaultPath);
		}		
	}
	
	/**
	 * Gets a instance of IMuleRuntime for the given root directory.
	 * 
	 * @param path
	 * @return null if the dir is not a valid mule distribution directory.
	 * Otherwise
	 */
	public static IMuleRuntime getMuleRuntime(String path) {
		assert (path != null);
		File file = new File(path);
		IMuleRuntime runtime = mapFileToRuntime.get(file);
		if (runtime == null) {
			// I don't believe that synchronization is too critical, since 
			// the runtime is a read only data structure...
			if (! MuleRuntime.validateRuntimeDirectory(file).isOK()) {
				return null;
			}
			runtime = new MuleRuntime(file);
			mapFileToRuntime.put(file, runtime);
		}
		return runtime;
	}
	
	public static void clearRuntimeCache() {
		mapFileToRuntime.clear();
	}

	/**
	 * Get an integer preference value from the preference service.
	 * 
	 * @param key the preference key
	 * @param defaultValue the fallback value
	 * @return the value or 0 if not found
	 */
	protected static int getIntPreference(String key) {
		return MuleProjectPlugin.getInstance().getPreferenceStore().getInt(key);
	}

	/**
	 * Set an integer preference value to the preference service.
	 * 
	 * @param key the preference key
	 * @param value the new value for the preference
	 */
	protected static void setIntPreference(String key, int value) {
		MuleProjectPlugin.getInstance().getPreferenceStore().setValue(key, value);
	}
	
	/**
	 * Get a String preference value from the preference service.
	 * 
	 * @param key the preference key
	 * @return the value or null if not found
	 */
	protected static String getStringPreference(String key) {
		return MuleProjectPlugin.getInstance().getPreferenceStore().getString(key);
	}

	/**
	 * Sets a string preference in instance scope.
	 * 
	 * @param key the preference key
	 * @param value the preference value
	 */
	protected static void setStringPreference(String key, String value) {
		MuleProjectPlugin.getInstance().getPreferenceStore().setValue(key, value);
	}

	/**
	 * Clear a string preference value in instance scope.
	 * 
	 * @param key the preference key
	 */
	protected static void clearPreferenceValue(String key) {
		MuleProjectPlugin.getInstance().getPreferenceStore().setToDefault(key);
	}
	
}
