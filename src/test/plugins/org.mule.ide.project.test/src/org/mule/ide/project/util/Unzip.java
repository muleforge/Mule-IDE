/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Unzip {

	private ZipFile zipFile;
	private File destinationDirectory;

	public Unzip(File file) throws IOException {
		super();
		zipFile = new ZipFile(file);
	}

	public void unpack(File unpackDirectory) throws IOException {
		destinationDirectory = unpackDirectory;
		
		Enumeration<? extends ZipEntry> entries = zipFile.entries();
		while (entries.hasMoreElements()) {
			ZipEntry entry = entries.nextElement();
			unpackEntry(entry);
		}
	}

	private void unpackEntry(ZipEntry entry) throws IOException {
		if (entry.isDirectory()) {
			FileUtils.createDirectory(destinationDirectory, entry.getName());
		}
		else {
			unpackFileEntry(entry);
		}
	}

	private void unpackFileEntry(ZipEntry entry) throws IOException {
		InputStream input = zipFile.getInputStream(entry);
		
		File outputFile = new File(destinationDirectory, entry.getName());
        FileOutputStream output = new FileOutputStream(outputFile);

        while (input.available() > 0) {
            output.write(input.read());
        }

        output.close();
        input.close();
	}
}
