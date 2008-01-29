/*
 * $Id: JBpmFunctionalTestCase.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.bpm;

import org.mule.api.config.ConfigurationBuilder;
import org.mule.api.config.ConfigurationException;
import org.mule.config.i18n.MessageFactory;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.examples.loanbroker.tests.AbstractAsynchronousLoanBrokerTestCase;
import org.mule.transport.bpm.BPMS;
import org.mule.transport.bpm.ProcessConnector;
import org.mule.transport.jdbc.util.MuleDerbyUtils;


public class JBpmFunctionalTestCase extends AbstractAsynchronousLoanBrokerTestCase
{
    /** For unit tests, we assume a virgin database, therefore the process ID is assumed to be = 1 */
    public static final long PROCESS_ID = 1;

    protected void suitePreSetUp() throws Exception
    {
        // set the derby.system.home system property to make sure that all derby databases are
        // created in maven's target directory
        
        MuleDerbyUtils.defaultDerbyCleanAndInit("derby.properties", "database.name");

        super.suitePreSetUp();
    }

    protected ConfigurationBuilder getBuilder() throws Exception 
    {
        return new SpringXmlConfigurationBuilder(getConfigResources());
    }
    
    // @Override
    protected String getConfigResources()
    {
        return "loan-broker-bpm-mule-config.xml";
    }

    // @Override
    public void testSingleLoanRequest() throws Exception
    {
        super.testSingleLoanRequest();
        
        ProcessConnector connector =
            (ProcessConnector) muleContext.getRegistry().lookupConnector("jBpmConnector");
        if (connector == null)
        {
            throw new ConfigurationException(MessageFactory.createStaticMessage("Unable to look up jBpmConnector from Mule registry."));
        }
        BPMS bpms = connector.getBpms();
        // TODO MULE-1558 The following assert is throwing a 
        //   org.hibernate.LazyInitializationException: could not initialize proxy - the owning MuleSession was closed
        // See http://forum.springframework.org/archive/index.php/t-24800.html
        //assertEquals("loanApproved", bpms.getState(bpms.lookupProcess(new Long(PROCESS_ID))));
    }
    
    public void testLotsOfLoanRequests() throws Exception
    {
        super.testLotsOfLoanRequests();
        
        //without this sleep, the test still succeeds but throws a series of exceptions
        //probably Spring would not have enough time to close db connections before
        //database itself is shut down while jvm start disposing
        Thread.sleep(100);
    }
}
