/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.mule.ide.common.IdeProject;
import org.mule.ide.common.projectfactory.IdeProjectFactory;
import org.mule.ide.project.internal.runtime.ProjectPreferences;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleIdeProject extends IdeProject
{
    public static final String PREFERENCES_FILENAME = ".muleide";

    private ProjectPreferences preferences;

    /**
     * This constructor is used by {@link IdeProjectFactory}
     */
    public MuleIdeProject(IJavaProject project)
    {
        super(project);
    }

    public boolean isMuleProject()
    {
        try
        {
            return hasClasspathContainerWithFirstPathElement(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER);
        }
        catch (JavaModelException jme)
        {
            return false;
        }
    }

    public IMuleRuntime getMuleRuntime()
    {
        try
        {
            IClasspathEntry entry = findClasspathEntryWithFirstPathSegment(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER);
            IPath entryPath = entry.getPath();
            if (entryPath.segmentCount() == 2)
            {
                // this is the default Mule Runtime
                return MulePreferences.getDefaultMuleRuntime();
            }
            else
            {
                // this is the Mule library, extract the version from it
                String muleRuntimePath = entryPath.lastSegment();
                return MulePreferences.getMuleRuntime(muleRuntimePath);
            }
        }
        catch (JavaModelException jme)
        {
            // TODO: better error handling in the code calling this method
            throw new IllegalStateException(jme);
        }
    }

    public ProjectPreferences getPreferences()
    {
        if (preferences == null)
        {
            loadPreferences();
        }
        return preferences;
    }

    private void loadPreferences()
    {
        preferences = new ProjectPreferences(this);

        preferences.loadFromFile(preferencesFile());
    }

    public void storePreferences()
    {
        getPreferences().storeToFile(preferencesFile());
    }

    private File preferencesFile()
    {
        return new File(getFilesystemPath(), PREFERENCES_FILENAME);
    }

    public List<IResource> allXmlFiles() throws CoreException
    {
        List<IResource> xmlFiles = new ArrayList<IResource>();
        addXmlFilesFrom(getJavaProject().getProject(), xmlFiles);
        return xmlFiles;
    }

    private void addXmlFilesFrom(IContainer container, List<IResource> resourceList) throws CoreException
    {
        for (IResource resource : container.members())
        {
            if (resource.getType() == IResource.FOLDER)
            {
                IFolder folder = (IFolder)resource;
                if (isBuildOutputFolder(folder))
                {
                    continue;
                }

                addXmlFilesFrom(folder, resourceList);
                continue;
            }

            String fileExtension = resource.getFileExtension();
            if ((fileExtension != null) && (fileExtension.toLowerCase().equals("xml")))
            {
                resourceList.add(resource);
            }
        }
    }

    private boolean isBuildOutputFolder(IFolder folder) throws JavaModelException
    {
        IPath path = folder.getFullPath();
        return getBuildOutputFolders().contains(path);
    }

    public Set<IPackageFragmentRoot> getPackageFragmentRootsContainingSourceFiles() throws JavaModelException
    {
        Set<IPackageFragmentRoot> sourceFragmentRoots = new HashSet<IPackageFragmentRoot>();
        for (IPackageFragmentRoot root : getJavaProject().getPackageFragmentRoots())
        {
            // do not even attempt to package binary resources, i.e. other jars
            if (root.getKind() != IPackageFragmentRoot.K_BINARY)
            {
                sourceFragmentRoots.add(root);
            }
        }
        return sourceFragmentRoots;
    }

    /**
     * The hot deployment builder is only enabled for Mule 3.x and above
     */
    public boolean shouldRunHotDeploymentBuilder()
    {
        String version = getMuleRuntime().getVersion();
        String firstVersionCharacter = version.substring(0, 1);
        int majorVersion = Integer.parseInt(firstVersionCharacter);
        return majorVersion > 2;
    }
}
