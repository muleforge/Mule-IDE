package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;

public class JarBundle implements IMuleBundle {

	private final IMuleRuntime runtime;
	private final File jar;
	private List muleDependencies;
	private List otherDependencies;

	public JarBundle(IMuleRuntime runtime, File jar) {
		this.runtime = runtime;
		this.jar = jar;
	}

	public File getFile() {
		return jar;
	}

	public String getPathifiedName() {
		return MuleClasspathInitializer.pathify(jar);
	}

	/*
	private void loadDependencies() throws IOException {
		muleDependencies = new ArrayList();
		otherDependencies = new ArrayList();
	
		Manifest mf = new Manifest(getArchiveStream("META-INF/MANIFEST.MF"));
		String deps = mf.getMainAttributes().getValue(Attributes.Name.CLASS_PATH);
		StringTokenizer st = new StringTokenizer(deps, " ");
		while (st.hasMoreTokens()) {
			String dep = st.nextToken();
			if (dep.startsWith(IMuleRuntime.MULE_BUNDLE_PREFIX) && dep.endsWith(runtime.getVersion() + ".jar")) {
				IFileBasedBundle muleModule = lookupMuleModule(fileToModule(dep));
				if (muleModule != null) {
					muleDependencies.add(muleModule);
				}
			} else {
				otherDependencies.add(dep);
			}
		}
	}

	public InputStream getArchiveStream(String path) throws IOException {
		final JarFile jar = new JarFile(getBundleJarFile());
		ZipEntry entry = jar.getEntry(path);
		if (entry == null) throw new FileNotFoundException("No '" + path + "' found in " + getBundleJarFile());
		
		InputStream jarInputStream = jar.getInputStream(entry);
		return new DecoratingInputStream(jarInputStream) {
			public void close() throws IOException {
				super.close();
				jar.close();
			}
		};
	}
	*/

	public Set<IMuleBundle> getDependencies() {
		//TODO
		return null;
	}

	public String[] getOtherDependencies() throws IOException {
		if (otherDependencies == null)
		{
			//loadDependencies();
		}
		return (String[]) otherDependencies.toArray(new String[otherDependencies.size()]);
	}

	public boolean equals(Object obj) {
		if (! (obj instanceof JarBundle)) return false;
		return getFile().equals(((JarBundle)obj).getFile());
	}

	public int hashCode() {
		return getFile().hashCode();
	}

	public String toString() {
		return getFile().toString();
	}
	
	public File getSourcePath() {
		/*
		if (getName().equals(CORE_BUNDLE_NAME))
		{
			return new File(getLocation(), "src/core/target/mule-core-" + getVersion() + "-sources.jar");
		}
		else if (getName().startsWith(MODULE_PREFIX))
		{
			String moduleName = getName().substring(MODULE_PREFIX.length());
			return new File(getLocation(), "src/modules/" + moduleName + "/target/mule-" + getName() + "-" + getVersion() + "-sources.jar");
		}
		else if (getName().startsWith(TRANSPORT_PREFIX)) {
			String transportName = getName().substring(TRANSPORT_PREFIX.length());
			return new File(getLocation(), "src/transports/" + transportName + "/target/mule-" + getName() + "-" + getVersion() + "-sources.jar"); 
		}
		*/
		if (jar.getName().startsWith(IMuleRuntime.MULE_BUNDLE_PREFIX)) {
			return runtime.getSourceZip();
		}
		return null;
	}

}
