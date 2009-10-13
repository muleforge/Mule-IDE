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
import java.util.HashMap;
import java.util.Map;

import org.mule.ide.project.runtime.IMuleSampleProject;

/**
 * The MuleSampleFactory knows which {@link IMuleSampleProject} to instantiate for 
 * a given <code>artifactId</code>.
 */
public class MuleSampleFactory {
	private static Map<String, IMuleSampleFactory> factories;
	
	private interface IMuleSampleFactory {
		IMuleSampleProject createSampleProject(MuleRuntime runtime, String name, 
			String description, File dir);
	}
	
	static {
		factories = new HashMap<String, IMuleSampleFactory>();
		factories.put("mule-example-errorhandler", new IMuleSampleFactory() {
			public IMuleSampleProject createSampleProject(MuleRuntime runtime, String name, 
					String description, File dir) {
				return new ErrorhandlerSampleProject(runtime, name, description, dir);
			}
		});
		factories.put("mule-example-webapp", new IMuleSampleFactory() {
			public IMuleSampleProject createSampleProject(MuleRuntime runtime,
					String name, String description, File dir) {
				return new WebappSampleProject(runtime, name, description, dir);
			}
		});
	}
	
	public static IMuleSampleProject create(String artifactid, MuleRuntime runtime, 
		String name, String description, File dir) {
		
		IMuleSampleFactory sampleFactory = factories.get(artifactid);
		if (sampleFactory != null) {
			return sampleFactory.createSampleProject(runtime, name, description, dir);
		}
		
		return new MuleSampleProject(runtime, name, description, dir);
	}
}
