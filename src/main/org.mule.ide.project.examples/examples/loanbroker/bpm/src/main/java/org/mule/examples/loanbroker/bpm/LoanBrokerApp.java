/*
 * $Id: LoanBrokerApp.java 9520 2007-10-31 16:00:01Z dirk.olmes $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.bpm;

import org.mule.examples.loanbroker.AbstractLoanBrokerApp;
import org.mule.providers.jdbc.util.MuleDerbyUtils;
import org.mule.umo.UMOException;

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
