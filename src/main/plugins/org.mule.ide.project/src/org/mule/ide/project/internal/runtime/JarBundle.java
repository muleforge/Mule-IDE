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

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.eclipse.core.runtime.IPath;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.runtime.Namespace;

public class JarBundle implements IMuleBundle
{
    private final IMuleRuntime runtime;
    private final File jar;
    private String version;
    private Pom pom = null;
    private Namespace[] namespaces;

    public JarBundle(IMuleRuntime runtime, File jar)
    {
        this.runtime = runtime;
        this.jar = jar;
        this.version = null;
    }

    public File getFile()
    {
        return jar;
    }

    public String getPathifiedName()
    {
        return MuleClasspathInitializer.pathify(jar);
    }

    /*
     * private void loadDependencies() throws IOException { muleDependencies = new
     * ArrayList(); otherDependencies = new ArrayList(); Manifest mf = new
     * Manifest(getArchiveStream("META-INF/MANIFEST.MF")); String deps =
     * mf.getMainAttributes().getValue(Attributes.Name.CLASS_PATH); StringTokenizer
     * st = new StringTokenizer(deps, " "); while (st.hasMoreTokens()) { String dep =
     * st.nextToken(); if (dep.startsWith(IMuleRuntime.MULE_BUNDLE_PREFIX) &&
     * dep.endsWith(runtime.getVersion() + ".jar")) { IFileBasedBundle muleModule =
     * lookupMuleModule(fileToModule(dep)); if (muleModule != null) {
     * muleDependencies.add(muleModule); } } else { otherDependencies.add(dep); } } }
     * public InputStream getArchiveStream(String path) throws IOException { final
     * JarFile jar = new JarFile(getBundleJarFile()); ZipEntry entry =
     * jar.getEntry(path); if (entry == null) throw new FileNotFoundException("No '"
     * + path + "' found in " + getBundleJarFile()); InputStream jarInputStream =
     * jar.getInputStream(entry); return new DecoratingInputStream(jarInputStream) {
     * public void close() throws IOException { super.close(); jar.close(); } }; }
     */

    public Set<IMuleBundle> getDependencies()
    {
        // TODO
        return null;
    }

    // public String[] getOtherDependencies() throws IOException {
    // if (otherDependencies == null) {
    // //loadDependencies();
    // }
    // return otherDependencies.toArray(new String[otherDependencies.size()]);
    // }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof JarBundle))
        {
            return false;
        }
        return this.getFile().equals(((JarBundle) obj).getFile());
    }

    public int hashCode()
    {
        return this.getFile().hashCode();
    }

    public String toString()
    {
        return this.getFile().toString();
    }

    public IPath getSourcePath()
    {
        if (jar.getName().startsWith(IMuleRuntime.MULE_BUNDLE_PREFIX) == false)
        {
            return null;
        }

        if (isEnterpriseArtifact())
        {
            return runtime.getEnterpriseSourceZip();
        }
        else
        {
            return runtime.getCommunitySourceZip();
        }
    }

    // ee transports/modules match the pattern mule-xxx-ee-0.0.0.jar 
    private boolean isEnterpriseArtifact()
    {
        String filename = jar.getName();
        return (filename.startsWith(IMuleRuntime.MULE_BUNDLE_PREFIX) && filename.contains("-ee-"));
    }

    public String getVersion()
    {
        if (version == null)
        {
            try
            {
                JarFile jarFile = new JarFile(jar);
                Manifest manifest = jarFile.getManifest();
                version = manifest.getMainAttributes().getValue("Implementation-Version");
            }
            catch (IOException iox)
            {
                version = null;
            }
        }
        return version;
    }

    public String getDisplayName()
    {
        String name = getPom().getName();
        if (name == null)
        {
            // This may show up in the new config file wizard, then again this gives
            // users
            // a clue as to what's wrong inside their lib directory
            name = "Missing <name> element in pom.xml inside " + jar.getName();
        }
        return name;
    }

    private Pom getPom()
    {
        if (pom == null)
        {
            pom = Pom.loadFromJar(this.getFile());
        }
        return pom;
    }

    public Namespace[] getNamespaces()
    {
        if (namespaces == null)
        {
            try
            {
                namespaces = new NamespaceLoader().load(getFile());
            }
            catch (IOException iox)
            {
                String message = "cannot load jar file " + getFile().getAbsolutePath();
                throw new IllegalStateException(message, iox);
            }
        }
        return namespaces;
    }

    public boolean isSpringConfigBundle()
    {
        return false;
    }

    public boolean isModuleOrTransport()
    {
        boolean isModuleOrTransport = false;

        if (filenameHasModuleOrTransportPrefix())
        {
            // users may put custom jar files into the lib dir which match the
            // filename scheme but
            // which are still invalid files, e.g. mule-module-xxx-sources.jar etc.
            if (getPom() != null)
            {
                isModuleOrTransport = true;
            }
        }

        return isModuleOrTransport;
    }

    private boolean filenameHasModuleOrTransportPrefix()
    {
        String fileName = jar.getName();
        return fileName.startsWith(MULE_MODULE_PREFIX) || fileName.startsWith(MULE_TRANSPORT_PREFIX);
    }
}
