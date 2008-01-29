/*
 * $Id: LoanBrokerApp.java 8077 2007-08-27 20:15:25Z aperepel $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.esb;

import org.mule.examples.loanbroker.AbstractLoanBrokerApp;
import org.mule.examples.loanbroker.LocaleMessage;

import java.io.IOException;

/**
 * Runs the LoanBroker ESB example application.
 */

public class LoanBrokerApp extends AbstractLoanBrokerApp
{
    public LoanBrokerApp(String config) throws Exception
    {
        super(config);
    }

    public static void main(String[] args) throws Exception
    {
        LoanBrokerApp loanBrokerApp = null;
        loanBrokerApp = new LoanBrokerApp(getInteractiveConfig());
        loanBrokerApp.run(false);
    }

    protected static String getInteractiveConfig() throws IOException
    {
        int response = 0;
        
        System.out.println("******************\n"
            + LocaleMessage.esbWelcome()
            + "\n******************");
        response = readCharacter();
        if (response == '1')
        {
            System.out.println(LocaleMessage.loadingEndpointEjb());
            return "loan-broker-esb-mule-config.xml";
        }
        else
        {
            System.out.println(LocaleMessage.loadingManagedEjb());
            return "loan-broker-esb-mule-config-with-ejb-container.xml";
        }
    }
}
