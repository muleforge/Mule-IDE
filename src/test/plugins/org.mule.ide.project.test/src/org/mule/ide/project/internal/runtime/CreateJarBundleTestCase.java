package org.mule.ide.project.internal.runtime;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mule.ide.project.util.FileUtils;

public class CreateJarBundleTestCase {
	private static File TempDir = null;
	
	@BeforeClass
	public static void unpackMuleTestDistribution() throws Exception {
		TempDir = FileUtils.createTempDirectory();
		
		File distributionFile = new File("test-resources", "mule-test-distro.zip");
		assertTrue(distributionFile.exists());
		ZipFile distributionZip = new ZipFile(distributionFile);
		
		unpack(distributionZip);
	}
	
	private static void unpack(ZipFile zipFile) throws IOException {
		Enumeration<? extends ZipEntry> entries = zipFile.entries();
		while (entries.hasMoreElements()) {
			ZipEntry entry = entries.nextElement();
			
			if (entry.isDirectory()) {
				FileUtils.createDirectory(TempDir, entry.getName());
			}
		}
	}

	@AfterClass
	public static void deleteMuleDistro() throws IOException {
		FileUtils.deleteRecursively(TempDir);
	}
	
	@Test
	public void regularMuleBundle() {
		fail();
	}
	
	@Test
	public void springConfigMuleBundle() {
		fail();
	}
}
