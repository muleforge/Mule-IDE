/*
 * $Id: TransformersMule2669TestCase.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.issues;

import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.examples.loanbroker.bank.Bank;
import org.mule.examples.loanbroker.messages.LoanBrokerQuoteRequest;
import org.mule.extras.client.MuleClient;
import org.mule.tck.FunctionalTestCase;

import java.util.Iterator;
import java.util.Set;

public class TransformersMule2669TestCase extends FunctionalTestCase
{

    protected String getConfigResources()
    {
        return "transformers-mule-2669.xml";
    }

    public void testTransformers() throws MuleException
    {
        MuleClient client = new MuleClient();
        LoanBrokerQuoteRequest request = new LoanBrokerQuoteRequest();
        request.setLenders(new Bank[0]);
        MuleMessage response = client.send("jms://in?connector=default", request, null);
        assertNotNull(response);
        assertNull(response.getExceptionPayload());
        Set propertyNames = response.getPropertyNames();
        assertTrue(propertyNames.size() > 0);
        Iterator names = propertyNames.iterator();
        while (names.hasNext())
        {
            logger.debug(names.next());
        }
        assertTrue(propertyNames.contains("recipients"));
    }

}
