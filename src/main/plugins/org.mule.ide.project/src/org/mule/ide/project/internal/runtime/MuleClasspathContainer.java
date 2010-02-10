/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import java.util.Arrays;
import java.util.Comparator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleClasspathContainer implements IClasspathContainer
{
    private IPath path;
    private IMuleRuntime runtime;
    private IClasspathEntry[] classpathEntries;

    public MuleClasspathContainer(IPath path, IMuleRuntime runtime, IClasspathEntry[] entries)
    {
        super();
        this.path = path;
        this.runtime = runtime;
        this.classpathEntries = sort(entries);
    }

    private IClasspathEntry[] sort(IClasspathEntry[] entries)
    {
        IClasspathEntry[] sorted = new IClasspathEntry[entries.length];
        System.arraycopy(entries, 0, sorted, 0, entries.length);

        Arrays.sort(sorted, new CompareFilenames());
        return sorted;
    }

    public IClasspathEntry[] getClasspathEntries()
    {
        return classpathEntries;
    }

    public String getDescription()
    {
        return "Mule Libraries [" + runtime.getDirectory().getName() + "]";
    }

    public int getKind()
    {
        return K_APPLICATION;
    }

    public IPath getPath()
    {
        return path;
    }

    @Override
    public String toString()
    {
        return getDescription();
    }

    private static class CompareFilenames implements Comparator<IClasspathEntry>
    {
        public int compare(IClasspathEntry entry1, IClasspathEntry entry2)
        {
            String filename1 = filename(entry1);
            String filename2 = filename(entry2);

            return filename1.compareTo(filename2);
        }

        private String filename(IClasspathEntry entry)
        {
            return entry.getPath().lastSegment().toLowerCase();
        }
    }
}
