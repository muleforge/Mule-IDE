/*
 * $Id: MuleClasspathUtils.java 1 2007-08-16 16:30:25Z quoc $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.internal.runtime.MuleClasspathInitializer;
import org.mule.ide.project.runtime.IMuleBundle;

/**
 * Utility functions for establishing the Mule classpath
 * 
 * @author Derek Adams
 */
public class MuleClasspathUtils {

	public static IClasspathEntry createMuleClasspathContainer(String hint, Collection<IMuleBundle> selectedBundles) {
		IPath path = new Path(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER);
		path = path.append(collectionToCommaString(selectedBundles));
		if (hint != null)
			path = path.append(hint);
		
		return JavaCore.newContainerEntry(path);
	}
	
    /**
     * Checks whether a jar is the main Mule jar.
     *
     * @param fileName
     * @return
     */
    protected static boolean isMuleJar(String fileName) {
        if ((fileName.startsWith("mule-")) && (fileName.endsWith(".jar"))) {
            return true;
        }
        return false;
    }
    
	public static Set<String> commaStringToSet(String bundleSelectString2) {
		Set<String> selection = new HashSet<String>();
		StringTokenizer st = new StringTokenizer(bundleSelectString2, ",");
		while (st.hasMoreTokens()) selection.add(st.nextToken().trim());
		return selection;
	}

	public static String collectionToCommaString(Collection<IMuleBundle> bundles) {
		StringBuffer sb = new StringBuffer();
		for (IMuleBundle bundle : bundles) {
			if (sb.length() > 0) sb.append(',');
			sb.append(bundle.getPathifiedName());
		}
		return sb.toString();
	}

}