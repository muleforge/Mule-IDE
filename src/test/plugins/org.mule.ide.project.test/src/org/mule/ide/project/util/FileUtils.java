package org.mule.ide.project.util;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	public static File createTempDirectory() throws IOException {
		File tempFile = File.createTempFile("temp", ".tmp");
		deleteFile(tempFile);
		
		if (tempFile.mkdir() == false) {
			throw new IOException("could not create temp directory " + tempFile.getCanonicalPath());
		}
		return tempFile;
	}

	public static void deleteFile(File file) throws IOException {
		if (file == null) {
			return;
		}
		
		if (file.delete() == false) {
			throw new IOException("could not delete " + file.getCanonicalPath());
		}
	}

	public static void deleteRecursively(File fileOrDirectory) throws IOException {
		if (fileOrDirectory.isDirectory()) {
			File[] contents = fileOrDirectory.listFiles();
			for (File file : contents) {
				deleteRecursively(file);
			}
		}
		else {
			deleteFile(fileOrDirectory);
		}
	}

	public static void createDirectory(File parent, String name) throws IOException {
		File dirFile = new File(parent, name);
		if (dirFile.mkdir() == false) {
			throw new IOException("could not create " + dirFile.getCanonicalPath());
		}
	}
}
