/*
 * $Id: AxisLoanBrokerAsynchronousFunctionalTestCase.java 8077 2007-08-27 20:15:25Z aperepel $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.esn;

import org.mule.examples.loanbroker.tests.AbstractAsynchronousLoanBrokerTestCase;


public class AxisLoanBrokerAsynchronousFunctionalTestCase extends AbstractAsynchronousLoanBrokerTestCase
{
    // @Override
    protected String getConfigResources()
    {
        return "loan-broker-async-config.xml, loan-broker-axis-endpoints-config.xml";
    }

    // @Override
    protected int getNumberOfRequests()
    {
        return 10;
    }
}
