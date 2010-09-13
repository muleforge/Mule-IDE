/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime.samples;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.mule.ide.project.internal.util.UrlUtils;
import org.mule.ide.project.runtime.IMuleSampleProject;

/**
 * The MuleSampleFactory knows which {@link IMuleSampleProject} to instantiate for a
 * given <code>artifactId</code>.
 */
public class MuleSampleFactory
{
    private static final Map<String, IMuleSampleFactory> Factories;

    static
    {
        Factories = new HashMap<String, IMuleSampleFactory>();
        Factories.put("mule-example-errorhandler", new ErrorhandlerSampleFactory());
    }

    public static IMuleSampleProject create(String artifactId, String name, String description,
        File dir)
    {
        IMuleSampleFactory sampleFactory = Factories.get(artifactId);
        if (sampleFactory != null)
        {
            return sampleFactory.createSampleProject(artifactId, name, description, dir);
        }

        return new MuleSampleProject(artifactId, name, description, dir);
    }

    private interface IMuleSampleFactory
    {
        IMuleSampleProject createSampleProject(String artifactid, String name,
           String description, File dir);
    }
    
    private static class ErrorhandlerSampleFactory implements IMuleSampleFactory
    {
        private static final String AMQ_DOWNLOAD_URL = "http://people.apache.org/repo/m2-incubating-repository/org/apache/activemq/activemq-core/4.1.0-incubator/activemq-core-4.1.0-incubator.jar";
        private static final String CONCURRENT_DOWNLOAD_URL = "http://repo1.maven.org/maven2/concurrent/concurrent/1.3.4/concurrent-1.3.4.jar";
        
        public IMuleSampleProject createSampleProject(String artifactId, String name, 
            String description, File dir)
        {
            MuleSampleProject sample = new MuleSampleProject(artifactId, name, description, dir);

            URL activemqUrl = UrlUtils.urlFromString(AMQ_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(activemqUrl);
            
            URL concurrentUrl = UrlUtils.urlFromString(CONCURRENT_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(concurrentUrl);

            return sample;
        }
    }
}
