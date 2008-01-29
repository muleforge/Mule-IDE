/*
 * $Id: LoanBrokerApp.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.bpm;

import org.mule.api.MuleException;
import org.mule.examples.loanbroker.AbstractLoanBrokerApp;
import org.mule.transport.jdbc.util.MuleDerbyUtils;

/**
 * Executes the LoanBroker BPM example.
 */
public class LoanBrokerApp extends AbstractLoanBrokerApp
{
    public LoanBrokerApp(String config) throws Exception
    {
        super(config);
    }

    public static void main(String[] args) throws Exception
    {
        LoanBrokerApp loanBrokerApp = new LoanBrokerApp("loan-broker-bpm-mule-config.xml");
        loanBrokerApp.run(false);
    }

    protected void init() throws Exception
    {
        // before initialisation occurs, the database must be cleaned and a new one created
        MuleDerbyUtils.defaultDerbyCleanAndInit("derby.properties", "database.name");
        super.init();
    }
}
