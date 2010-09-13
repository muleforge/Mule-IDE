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
        Factories.put("mule-example-bookstore", new BookstoreExampleFactory());
        Factories.put("mule-example-errorhandler", new ErrorhandlerExampleFactory());
        Factories.put("mule-example-scripting", new ScriptingExampleFactory());
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
    
    private static class BookstoreExampleFactory implements IMuleSampleFactory
    {
        private static final String JETTY_JSP_DOWNLOAD_URL = "http://repo1.maven.org/maven2/org/mortbay/jetty/jsp-2.1-jetty/6.1.20/jsp-2.1-jetty-6.1.20.jar";
        private static final String JSP_GLASSFISH_DOWNLOAD_URL = "http://repo1.maven.org/maven2/org/mortbay/jetty/jsp-2.1-glassfish/9.1.1.B60.25.p2/jsp-2.1-glassfish-9.1.1.B60.25.p2.jar";
        private static final String JSP_API_DOWNLOAD_URL = "http://repo1.maven.org/maven2/org/mortbay/jetty/jsp-api-2.1-glassfish/9.1.1.B60.25.p2/jsp-api-2.1-glassfish-9.1.1.B60.25.p2.jar";
        private static final String JDT_CORE_DOWNLOAD_URL = "http://repo2.maven.org/maven2/org/eclipse/jdt/core/3.1.1/core-3.1.1.jar";
        
        public IMuleSampleProject createSampleProject(String artifactId, String name, 
            String description, File dir)
        {
            MuleSampleProject sample = new MuleSampleProject(artifactId, name, description, dir);

            URL jettyJspSupport = UrlUtils.urlFromString(JETTY_JSP_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(jettyJspSupport);

            URL jspGlassfish = UrlUtils.urlFromString(JSP_GLASSFISH_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(jspGlassfish);

            URL jspApi= UrlUtils.urlFromString(JSP_API_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(jspApi);

            URL jdtCore = UrlUtils.urlFromString(JDT_CORE_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(jdtCore);

            return sample;
        }
    }
    
    private static class ErrorhandlerExampleFactory implements IMuleSampleFactory
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
    
    private static class ScriptingExampleFactory implements IMuleSampleFactory
    {
        private static final String JYTHON_DOWNLOAD_URL = "http://repo1.maven.org/maven2/org/python/jython/2.2.1/jython-2.2.1.jar";
        private static final String JYTHON_SCRIPTING_DOWNLOAD_URL = "http://dist.codehaus.org/mule/dependencies/maven2/javax/script/jython-engine/1.1/jython-engine-1.1-jdk14.jar";
        
        public IMuleSampleProject createSampleProject(String artifactId, String name, 
            String description, File dir)
        {
            MuleSampleProject sample = new MuleSampleProject(artifactId, name, description, dir);
            
            URL jythonUrl = UrlUtils.urlFromString(JYTHON_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(jythonUrl);
            
            URL scriptingUrl = UrlUtils.urlFromString(JYTHON_SCRIPTING_DOWNLOAD_URL);
            sample.addLibraryDownloadedFrom(scriptingUrl);
            
            return sample;
        }
    }
}
