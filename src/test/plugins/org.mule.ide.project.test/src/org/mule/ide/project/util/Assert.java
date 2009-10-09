package org.mule.ide.project.util;

import java.io.File;

public class Assert extends org.junit.Assert {
	public static void assertExists(File file) {
		assertTrue(file.exists());
	}
}
