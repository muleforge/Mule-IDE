/*
 * $Id: JettyTestCase.java 10200 2008-01-03 12:17:09Z tcarlson $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.webapp;

import org.mule.MuleServer;
import org.mule.umo.UMOManagementContext;

import junit.framework.TestCase;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * This tests runs in Maven's "integration-test" phase, after the .war has been built.  
 * It starts up the .war inside Jetty and runs tests against the Mule instance.
 * Note that the MuleClient does not work in this case because we have no access to the
 * ManagementContext (which is inside the Jetty container).
*/
public class JettyTestCase extends TestCase // TODO MULE-2768
{
    public static final String WEBAPP_WAR_FILE = "./target/mule-examples.war";
    public static final String WEBAPP_CONTEXT_PATH = "/mule-examples";
    public static final int JETTY_PORT = 8090;
    
    private Server jetty = null;
    
    // @Override
    protected void setUp() throws Exception 
    {
        super.setUp();

        if (jetty == null)
        {
            jetty = new Server(JETTY_PORT);
            jetty.addHandler(new WebAppContext(WEBAPP_WAR_FILE, WEBAPP_CONTEXT_PATH));
    
            jetty.start();
        }
    }

    // @Override
    protected void tearDown() throws Exception 
    {
        if (jetty != null)
        {
            jetty.stop();
        }
        super.tearDown();
    }

    public void testSanity() throws Exception
    {
        // empty
    }

    // This test fails, I'm not sure how we could get the ManagementContext from the Web Container.
    //public void testManagementContextAvailable() throws Exception
    //{
    //    UMOManagementContext mc = MuleServer.getManagementContext();
    //    assertNotNull("ManagementContext should have been set by MuleXmlConfigurationBuilder", mc);
    //    assertTrue("ManagementContext not initialised", mc.isInitialised());
    //    assertTrue("ManagementContext not started", mc.isStarted());
    //}
    
    // TODO Add the tests from AbstractWebappTestCase, but without using the MuleClient because
    // MuleClient needs the ManagementContext (at least for sending to vm endpoints).
}
