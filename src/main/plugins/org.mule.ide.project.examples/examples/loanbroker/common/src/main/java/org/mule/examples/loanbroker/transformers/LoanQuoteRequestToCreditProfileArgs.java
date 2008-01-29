/*
 * $Id: LoanQuoteRequestToCreditProfileArgs.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.transformers;

import org.mule.api.transformer.TransformerException;
import org.mule.examples.loanbroker.messages.LoanBrokerQuoteRequest;
import org.mule.transformer.AbstractTransformer;

/**
 * Extracts the customer information from the request into an array of arguments used
 * to invoke the Credit Agency MuleSession bean
 */
public class LoanQuoteRequestToCreditProfileArgs extends AbstractTransformer
{

    public LoanQuoteRequestToCreditProfileArgs()
    {
        registerSourceType(LoanBrokerQuoteRequest.class);
        setReturnClass(Object[].class);
    }

    public Object doTransform(Object src, String encoding) throws TransformerException
    {
        LoanBrokerQuoteRequest request = (LoanBrokerQuoteRequest)src;
        Object[] args = new Object[2];
        args[0] = request.getCustomerRequest().getCustomer().getName();
        args[1] = new Integer(request.getCustomerRequest().getCustomer().getSsn());
        return args;
    }

}
