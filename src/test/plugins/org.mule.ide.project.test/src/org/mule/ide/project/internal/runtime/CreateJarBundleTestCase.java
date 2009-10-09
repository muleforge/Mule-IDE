package org.mule.ide.project.internal.runtime;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.util.FileUtils;
import org.mule.ide.project.util.Unzip;

public class CreateJarBundleTestCase {
	private static File TempDir = null;
	
	@BeforeClass
	public static void unpackMuleTestDistribution() throws Exception {
		TempDir = FileUtils.createTempDirectory();
		
		File distributionFile = new File("test-resources", "mule-test-distro.zip");
		assertTrue(distributionFile.exists());
		
		new Unzip(distributionFile).unpack(TempDir);
	}

	@AfterClass
	public static void deleteMuleDistro() throws IOException {
		FileUtils.deleteRecursively(TempDir);
	}
	
	@Test
	public void regularMuleBundle() {
		IMuleBundle regularBundle = getMuleBundle("mule-module-xml");
		assertNotNull(regularBundle);
		assertFalse(regularBundle.isSpringConfigBundle());
	}
	
	@Test
	public void springConfigMuleBundle() {
		IMuleBundle springConfigBundle = getMuleBundle("mule-module-spring-config");
		assertNotNull(springConfigBundle);
		assertTrue(springConfigBundle.isSpringConfigBundle());
	}
	
	private IMuleBundle getMuleBundle(String name) {
		File distroDir = new File(TempDir, "mule");
		IMuleRuntime runtime = new MuleRuntime(distroDir);
		return runtime.getMuleLibrary(name);
	}
}
