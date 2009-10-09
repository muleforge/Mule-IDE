/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.runtime.IMuleSampleProject;

public class MuleRuntime implements IMuleRuntime {
	private static final String JAR_SUFFIX = ".jar";

	// Map of pathified bundle name to IMuleBundle
	private TreeMap<String, IMuleBundle> mapNameToBundle = null;
	// Map of artifactID to IMuleBundle
	private Map<String, IMuleBundle> mapArtifactIdToBundle = null;
	private File rootDirectory;
	private String version = null;
	
	private List<IMuleBundle> defaultLibraries = null;
	
	public MuleRuntime(File rootDirectory) {
		assert(validateRuntimeDirectory(rootDirectory).isOK()) : "Invalid runtime directory.";
		
		this.rootDirectory = rootDirectory;
	}
	
	public static IStatus validateRuntimeDirectory(File rootDirectory) {
		assert(rootDirectory != null);
		if (! rootDirectory.canRead()) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "Mule runtime directory cannot be read: " + rootDirectory);	
		}
		if (! rootDirectory.isDirectory()) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "Mule runtime location must be a directory: " + rootDirectory);	
		}

		File libDir = new File(rootDirectory, "lib");
		if ((libDir.isDirectory() == false) || (libDir.canRead() == false)) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "Library directory missing from " + rootDirectory);
		}
		File bootLibDir = new File(libDir, "boot");
		if ((bootLibDir.isDirectory() == false) || (bootLibDir.canRead() == false)) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "lib/boot directory missing from " + rootDirectory);
		}
		File muleLibDir = new File(libDir, "mule");
		if ((muleLibDir.isDirectory() == false) || (muleLibDir.canRead() == false)) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "lib/mule directory missing from " + rootDirectory);
		}
		File optLibDir = new File(libDir, "opt");
		if ((optLibDir.isDirectory() == false) || (optLibDir.canRead() == false)) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "lib/opt directory missing from " + rootDirectory);
		}
		File userLibDir = new File(libDir, "user");
		if ((userLibDir.isDirectory() == false) || (userLibDir.canRead() == false)) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "lib/user directory missing from " + rootDirectory);
		}

		File srcDir = new File(rootDirectory, "src");
		if ((srcDir.isDirectory() == false) || (srcDir.canRead() == false)) {
			return new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, "Source directory missing from " + rootDirectory);
		}
		
		return Status.OK_STATUS;
	}
	
	public File getDirectory() {
		return rootDirectory;
	}
	
	public String getVersion() {
		initializeLibraryMap();
		
		for (String artifactId : mapArtifactIdToBundle.keySet()) {
			if (artifactId.startsWith("mule-core-")) {
				IMuleBundle muleBundle = mapArtifactIdToBundle.get(artifactId);
				version = muleBundle.getVersion();
				if (version != null) {
					break;
				}
			}
		}
		return version;
	}
	
	public File getSourceZip() {
		File sourceDir = new File(getDirectory(), "src");
		String sourceFilename = "mule-" + getVersion() + "-src.zip";
		File sourceFile = new File(sourceDir, sourceFilename);
		if (sourceFile.exists()) {
			return sourceFile;
		}
		return null;
	}

	public List<IMuleSampleProject> getSampleProjects() {
		List<IMuleSampleProject> results = new ArrayList<IMuleSampleProject>();

		File[] allSamples;
		File examplesDir = new File(getDirectory(), "examples");
		allSamples = examplesDir.listFiles();
		
		for (int i = 0; i < allSamples.length; ++i) {
			gatherSamples(allSamples[i], results);
		}
		
		Collections.sort(results, MuleSampleProject.CompareByName);
		return results;
	}
	
	public Collection<IMuleBundle> getSampleProjectDependencies(IMuleSampleProject project) {
		HashSet<IMuleBundle> dependencies = new HashSet<IMuleBundle>();
		// Quick and dirty hack to get dependencies based on artifactIds in the sample project's
		// pom.xml.  Eventually should be computing the transitive closure of libs based on
		// manifest.mf classpath.
		/*  
		 * We're currently putting everything in lib/mule and lib/opt on the cp by default
		 * so don't bother parsing the pom.
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(false);
			dbf.setNamespaceAware(true);
			File pomFile = new File(project.getDirectory(), "pom.xml");
			if (! pomFile.exists()) return dependencies;
			Document doc = dbf.newDocumentBuilder().parse(pomFile);

			NodeList depNodes = XMLUtils.queryDomNodes(doc, "project/dependencies/dependency/artifactId");
			if (depNodes.getLength() > 0) {
				for (int i=0; i < depNodes.getLength(); ++i) {
					String artifactId = XMLUtils.text(depNodes.item(i));
					IMuleBundle bundle = getMuleBundleByArtifactId(artifactId);
					if (bundle != null) {
						dependencies.add(bundle);
					}
				}
			}
		} catch (SAXException e) {
			// OK: We swallow this exception - thereby ignoring any parse errors in the XML
		} catch (IOException e) {
			// OK: Same goes for missing files
		} catch (ParserConfigurationException e) {
			// OK: This is so unlikely that it's not worth catching here.
		}
		*/
		dependencies.addAll(getDefaultLibraries());
		return dependencies;		
	}
	
	/*
	private IMuleBundle getMuleBundleByArtifactId(String artifactId) {
		if (mapArtifactIdToBundle == null) {
			initializeLibraryMap();
		}
		return mapArtifactIdToBundle.get(artifactId);
	}
	*/
	
	public IMuleBundle getMuleLibrary(String name) {		
		initializeLibraryMap();

		if (name.startsWith("mule_") == false) {
			name = "mule_" + name;
		}
		
		String version = getVersion();
		if (name.endsWith(version) == false) {
			name = name + "-" + version + ".jar";
		}
		
		return this.getLibrary(name);
	}
	
	public IMuleBundle getLibrary(String name) {
		initializeLibraryMap();
		return mapNameToBundle.get(name);				
	}
	
	public Collection<IMuleBundle> getMuleLibraries() {
		initializeLibraryMap();
		
		Collection<IMuleBundle> muleLibs = new HashSet<IMuleBundle>();
		for (IMuleBundle bundle : mapNameToBundle.values()) {
			if (bundle.getFile().getName().startsWith(IMuleRuntime.MULE_BUNDLE_PREFIX)) {
				muleLibs.add(bundle);
			}
		}
		
		return muleLibs;
	}
		
	/**
	 * Filter out examples etc.
	 */
    public Collection<IMuleBundle> getMuleModulesAndTransports() {
        Collection<IMuleBundle> muleLibs = getMuleLibraries();
        
        List<IMuleBundle> modulesAndTransports = new ArrayList<IMuleBundle>();
        for (IMuleBundle bundle : muleLibs) {
            String fileName = bundle.getFile().getName();
            if (fileName.startsWith(IMuleBundle.MULE_MODULE_PREFIX) ||
                fileName.startsWith(IMuleBundle.MULE_TRANSPORT_PREFIX)) {
                modulesAndTransports.add(bundle);
            }
        }
        
        return modulesAndTransports;
    }

	public Collection<IMuleBundle> getDefaultLibraries() {
		initializeLibraryMap();
		
		/*
		ArrayList<IMuleBundle> result = new ArrayList<IMuleBundle>();
		File f = new File(getDirectory(), "lib/mule/mule-core-2.0.0.jar");
		if (f.exists()) {
			result.add(mapNameToBundle.get(MuleClasspathInitializer.pathify(f)));
		}
		f = new File(getDirectory(), "lib/opt/jcl104-over-slf4j-1.4.3.jar");
		if (f.exists()) {
			result.add(mapNameToBundle.get(MuleClasspathInitializer.pathify(f)));
		}
		Set<String> artifactIds = mapArtifactIdToBundle.keySet();
		for (String artifactId : artifactIds) {
			if (artifactId.startsWith("commons-")) {
				result.add(mapArtifactIdToBundle.get(artifactId));				
			}
		}
		*/
		return defaultLibraries;
	}

	private synchronized void initializeLibraryMap() {
		if (mapNameToBundle == null) {
			mapNameToBundle = new TreeMap<String, IMuleBundle>();
			mapArtifactIdToBundle = new HashMap<String, IMuleBundle>();
			defaultLibraries = new ArrayList<IMuleBundle>(100);
			
			cacheDirectory("lib/mule");
			cacheDirectory("lib/boot");
			cacheDirectory("lib/opt");
			cacheDirectory("lib/user");
		}
	}
	
	private void cacheDirectory(String dirSuffix) {
		File muleLibDir = new File(getDirectory(), dirSuffix);
		if (muleLibDir.exists() && muleLibDir.isDirectory()) {
			File[] files = muleLibDir.listFiles();
			for (File jar : files) {
				if (shouldBeCached(jar)) {
					String key = cacheLibFile(jar);
					if (key != null) {
						defaultLibraries.add(mapNameToBundle.get(key));
					}
				}
			}
		}
	}
	
	private boolean shouldBeCached(File file) {
		// The directory may be cluttered with other files, e.g. the infamous .DS_Store file on Mac
		return file.getName().endsWith(JAR_SUFFIX);
	}

	private String cacheLibFile(File lib) {
		String lookupKey = null;
		String libFileName = lib.getName();
		if (libFileName.endsWith(JAR_SUFFIX)) {
			IMuleBundle jarBundle = createMuleBundle(this, lib);
			
			lookupKey = jarBundle.getPathifiedName();
			mapNameToBundle.put(lookupKey, jarBundle);
			
			String artifactId = libFileName.substring(0, libFileName.length() - JAR_SUFFIX.length());
			mapArtifactIdToBundle.put(artifactId, jarBundle);				
		}	
		return lookupKey;
	}
	
	private IMuleBundle createMuleBundle(IMuleRuntime runtime, File jarFile) {
	    Pom pom = Pom.loadFromJar(jarFile);
	    
	    if (pom != null) {
	    	boolean isMuleModulesGroupId = pom.getGroupId().equals(IMuleBundle.MULE_MODULES_GROUP_ID);
	    	boolean isSpringConfigArtifactId = pom.getArtifactId().equals(IMuleBundle.MULE_MODULE_SPRING_CONFIG);
		    if (isMuleModulesGroupId && isSpringConfigArtifactId) {
		        return new SpringConfigMuleBundle(this, jarFile);
		    }
	    }
	    
	    return new JarBundle(this, jarFile);
	}
	
	/*
	protected InputStream getCoreJarStream(String relativePath) throws IOException {
		IFileBasedBundle coreBundle = lookupMuleModule(CORE_BUNDLE_NAME);
		return coreBundle.getArchiveStream(relativePath);
	}

	public IMuleBundle getCoreModule() {
		return getMuleModule(CORE_BUNDLE_NAME);
	}

	protected InputStream getSpringModuleStream(String relativePath) throws IOException {
		IFileBasedBundle springBundle = lookupMuleModule(SPRING_MODULE_NAME);
		return springBundle.getArchiveStream(relativePath);
	}

	public IClasspathEntry[] getClasspath(IMuleBundle[] bundles) {
		IMuleBundle allBundles[] = getTransitiveMuleDependencies(bundles);
		File[] dependentJars = getLibrariesDependencies(allBundles);
		int total = allBundles.length + dependentJars.length;
		int idx = 0;
		IClasspathEntry entries[] = new IClasspathEntry[total];
		for (int i=0; i < allBundles.length; ++i, ++idx) {
			IPath sourcePath = null;
			File source = allBundles[i].getSourcePath();
			if (source != null) sourcePath = new Path(source.getAbsolutePath());
			entries[idx] = JavaCore.newLibraryEntry(getMuleLibraryPath(allBundles[i].getName()), sourcePath, null);
		}
		for (int j=0; j < dependentJars.length; ++j, ++idx) {
			entries[idx] = JavaCore.newLibraryEntry(new Path(dependentJars[j].getAbsolutePath()), null, null);
		}
		return entries;
	}
	
	private IPath getMuleLibraryPath(String name) {
		return new Path(getMuleLibraryFile(name).getAbsolutePath());
	}

	private File getMuleLibraryFile(String name) {
		return new File(getLocation(),"lib/mule/mule-" + name + getMuleModuleSuffix());
	}

	private Map stemToFileMap = null;
	
	private String trimVersion(String jarName) {
		if (! jarName.endsWith(".jar")) return jarName;
		int pos = jarName.length() - 4;
		while (pos > 1 && Character.isDigit(jarName.charAt(pos-1)) || jarName.charAt(pos-1)=='.') pos--;
		
		return jarName.substring(0, pos);
	}
	
	private File getOptLibraryFile(String name) {
		if (stemToFileMap == null) {
			stemToFileMap = new HashMap();
			File optLibs[] = new File(getLocation(),"lib/opt").listFiles();
			for (int i=0; i < optLibs.length; ++i) stemToFileMap.put(trimVersion(optLibs[i].getName()), optLibs[i]);
			
			File muleLibs[] = new File(getLocation(),"lib/mule").listFiles();
			for (int i=0; i < muleLibs.length; ++i) stemToFileMap.put(trimVersion(muleLibs[i].getName()), muleLibs[i]);
			try
			{
				File userLibs[] = new File(getLocation(),"lib/user").listFiles();
				for (int i=0; i < userLibs.length; ++i) stemToFileMap.put(trimVersion(userLibs[i].getName()), userLibs[i]);
			}
			catch (Throwable t)
			{
				MuleCorePlugin.getDefault().logException("Can't read Mule distro 'user' library folder", t);
			}
		}
		return (File)stemToFileMap.get(trimVersion(name));
	}
	*/

	private void gatherSamples(File dir, List<IMuleSampleProject> results) {
		File pomFile = new File(dir, "pom.xml");
		if (! pomFile.exists()) {
			return;
		}

		// the code above makes sure that the file exists.
		Pom pom = Pom.loadFromFile(pomFile);
		
		Iterator<String> moduleIter = pom.getSubmodules();
		if (moduleIter.hasNext()) {
			// do not add samples with sub-modules (e.g. the loanbroker) as we cannot make
			// proper eclipse projects out of it
			
//			while (moduleIter.hasNext()) {
//				String subModule = moduleIter.next();
//				gatherSamples(new File(dir, subModule), results);
//			}			
		}
		else {
			String artifactId = pom.getArtifactId();
			IMuleSampleProject sampleProject = MuleSampleFactory.create(artifactId, this, 
				pom.getName(), pom.getDescription(), dir);
			results.add(sampleProject);
		}
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(128);
		buf.append("<MuleRuntime@");
		buf.append(System.identityHashCode(this));
		buf.append(" ");
		buf.append(getDirectory().getName());
		buf.append(">");
		return buf.toString();
	}
	
	/*
	public File[] getLibrariesDependencies(IMuleBundle[] bundles) {
		Set libs = new TreeSet();
		for (int i = 0; i < bundles.length; ++i) {
			try {
				String[] optJars = bundles[i].getOtherDependencies();
				for (int j = 0; j < optJars.length; ++j) libs.add(optJars[j]);
			} catch (IOException ioe) { }  //IGNORE
		}
		// We now have all the names, now filter for version mismatches (getOptLibraryFile
		// handles this)
		Set files = new TreeSet();
		for (Iterator it = libs.iterator(); it.hasNext(); )
			files.add(getOptLibraryFile((String)it.next()));
		return (File[]) files.toArray(new File[files.size()]);
	}
	

	public IMuleBundle[] getMuleModules() {
		if (muleModules == null) {
			initializeBundles();
		}
		return muleModules;
	}
	
	IMuleBundle muleTransports[] = null;
	IMuleBundle muleModules[] = null;
	
	protected File findCoreJarPath() throws FileNotFoundException {
		File cores[] = new File(getLocation(), "lib/mule/").listFiles(new FilenameFilter() {
			public boolean accept(File dir, String file) {
				return file.startsWith("mule-core-") && file.endsWith(".jar");
			}});
		if (cores == null || cores.length != 1) throw new FileNotFoundException("No Core jar");
		return cores[0];
	}
	public void initializeBundles() {
		List transports = new LinkedList();
		List modules = new LinkedList();
	
		String commonSuffix = getVersion() + ".jar";

		File[] allModules = new File(getLocation(), "lib/mule").listFiles();
		for (int i = 0; i < allModules.length; ++i) {
			String filePart = allModules[i].getName(); 
			if (filePart.startsWith("mule-transport-") && filePart.endsWith(commonSuffix)) {
				transports.add(getMuleModule(fileToModule(filePart)));
			} else if (filePart.startsWith("mule-module-") && filePart.endsWith(commonSuffix)) {
				modules.add(getMuleModule(fileToModule(filePart)));
			}
		}
		muleTransports = (IMuleBundle[]) transports.toArray(new IMuleBundle[transports.size()]);
		muleModules = (IMuleBundle[]) modules.toArray(new IMuleBundle[modules.size()]);
	}
	
	public IMuleBundle[] getTransitiveMuleDependencies(IMuleBundle[] bundles) {
		List q = new LinkedList();
		for (int i = 0; i < bundles.length; ++i) q.add(bundles[i]);
		
		Set libs = new HashSet();
		while (q.size() > 0) {
			IMuleBundle consider = (IMuleBundle)q.remove(0);
			if (libs.add(consider)) {
				try {
					IMuleBundle[] directDependencies = consider.getMuleDependencies();
					for (int i = 0; i < directDependencies.length; ++i) {
						if (! libs.contains(directDependencies[i]))
						{
							q.add(directDependencies[i]);
						}
					}
				} catch (IOException ioe) { } // IGNORE
			}
		}
		return (IMuleBundle[])libs.toArray(new IMuleBundle[libs.size()]);
	}
	
	public IFileBasedBundle createMuleBundle(final String bundleName) {
		
		return new FullJarBundle(bundleName);
		
	}
	
	private String fileToModule(String fullName) {
		String suffix = getMuleModuleSuffix();
		if (suffix.length() + MULE_BUNDLE_PREFIX.length() >= fullName.length())
			throw new IllegalArgumentException(fullName + " can't be a valid Mule module name");
		return fullName.substring(MULE_BUNDLE_PREFIX.length(), fullName.length()-suffix.length());
	}
	
	private String getMuleModuleSuffix() {
		return  "-" + getVersion() + ".jar";
	}
	*/

	/*
	private IFileBasedBundle getMuleModule(String moduleName) {
		IFileBasedBundle bundle = (IFileBasedBundle)nameToBundle.get(moduleName);
		if (bundle == null) {
			bundle = createMuleBundle(moduleName);
			nameToBundle.put(moduleName, bundle);
		}
		return bundle;
	}
	*/
	
	/*
	private IFileBasedBundle lookupMuleModule(String moduleName) {
		return (IFileBasedBundle)nameToBundle.get(moduleName);
	}

	protected File getCoreJarPath() throws FileNotFoundException {
		return getMuleLibraryFile(CORE_BUNDLE_NAME);
	}

	public IMuleBundle[] getMuleTransports() {
		if (muleTransports == null) {
			initializeBundles();
		}
		return muleTransports;
	}
	*/
	
	/*
	interface IFileBasedBundle extends IMuleBundle {
		public InputStream getArchiveStream(String path) throws IOException;
	}
	*/

	/*
	class FullJarBundle implements IFileBasedBundle {

		private final String name;

		private List muleDependencies;

		private List otherDependencies;

		private FullJarBundle(String name) {
			this.name = name;
		}

		protected File getBundleJarFile() throws FileNotFoundException {
			File jarLocation = getMuleLibraryFile(name);
			if (! jarLocation.exists() || ! jarLocation.canRead()) throw new FileNotFoundException("Can't read expected JAR: " + jarLocation.getAbsolutePath());
			return jarLocation;
		}

		public String getName() {
			return name;
		}

		private void loadDependencies() throws IOException {
			muleDependencies = new ArrayList();
			otherDependencies = new ArrayList();
		
			Manifest mf = new Manifest(getArchiveStream("META-INF/MANIFEST.MF"));
			String deps = mf.getMainAttributes().getValue(Attributes.Name.CLASS_PATH);
			StringTokenizer st = new StringTokenizer(deps, " ");
			while (st.hasMoreTokens()) {
				String dep = st.nextToken();
				if (dep.startsWith(MULE_BUNDLE_PREFIX) && dep.endsWith(getVersion() + ".jar")) {
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

		public IMuleBundle[] getMuleDependencies() throws IOException {
			if (muleDependencies == null)
			{
				loadDependencies();
			}
			return (IMuleBundle[]) muleDependencies.toArray(new IMuleBundle[muleDependencies.size()]);
		}

		public String[] getOtherDependencies() throws IOException {
			if (otherDependencies == null)
			{
				loadDependencies();
			}
			return (String[]) otherDependencies.toArray(new String[otherDependencies.size()]);
		}

		public boolean equals(Object obj) {
			if (! (obj instanceof IFileBasedBundle)) return false;
			return getName() == ((IFileBasedBundle)obj).getName();
		}

		public int hashCode() {
			return getName().hashCode();
		}

		public String toString() {
			return MULE_BUNDLE_PREFIX + getName() + getMuleModuleSuffix();
		}
		
		public File getSourcePath() {
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
			return null;
		}
	}
	*/
	
	/*
	class FullJarSample extends FullJarBundle implements IMuleSample {

		private String description;
		
		private IMuleBundle dependencies[];

		private File root;
		
		public FullJarSample(String name, String description, IMuleBundle dependencies[], File root) {
			super(name);
			this.description = description;
			this.dependencies = dependencies;
			this.root = root;
		}
		
		public String getDescription() {
			return this.description;
		}
		
		protected File getBundleJarFile() throws FileNotFoundException {
			throw new UnsupportedOperationException("FullJarSample does not live in a single bundle");
		}

		public IMuleBundle[] getMuleDependencies() throws IOException {
			return dependencies;
		}
		
		public String[] getOtherDependencies() throws IOException {
			return new String[0];
		}

		public File[] getConfigFiles() {
			File conf = new File(root, "conf");
			
			if (conf.exists() && conf.isDirectory()) {
				return conf.listFiles(); 
			}
			return new File[0];
		}

		public File[] getSourceFolders() {
			Collection c = new LinkedList();
			File srcJava = new File(root, "src/main/java");
			if (srcJava.exists()) {
				c.add(srcJava);
			}
			File srcResources = new File(root, "src/main/resources");
			if (srcResources.exists()) {
				c.add(srcResources);
			}
			return (File[]) c.toArray(new File[c.size()]);
		} 
		
	}
	*/
}
