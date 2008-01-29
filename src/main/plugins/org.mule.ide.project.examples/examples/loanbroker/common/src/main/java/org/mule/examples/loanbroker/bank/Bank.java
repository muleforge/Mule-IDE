/*
 * $Id: Bank.java 10529 2008-01-25 05:58:36Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.bank;

import org.mule.api.config.ConfigurationException;
import org.mule.api.endpoint.Endpoint;
import org.mule.api.service.Service;
import org.mule.api.service.ServiceAware;
import org.mule.config.i18n.MessageFactory;
import org.mule.examples.loanbroker.LocaleMessage;
import org.mule.examples.loanbroker.messages.LoanBrokerQuoteRequest;
import org.mule.examples.loanbroker.messages.LoanQuote;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <code>Bank</code> is a representation of a bank from which to obtain loan
 * quotes.
 */

public class Bank implements ServiceAware, Serializable, BankService
{
    /**
     * Serial version
     */
    private static final long serialVersionUID = 4108271137166107769L;

    /**
     * logger used by this class
     */
    protected static final Log logger = LogFactory.getLog(Bank.class);

    private String bankName;
    private double primeRate;
    
    /**
     * Incoming endpoint for the bank, this is used to create a static recipient list based on a list of banks.
     */
    private String endpoint;

    public Bank()
    {
        this.primeRate = Math.random() * 10;
    }

    public Bank(String bankname)
    {
        this();
        this.bankName = bankname;

        // For simplicity, the endpoint for the bank is the same as the bank's name.
        this.endpoint = bankName;
    }

    // TODO This method doesn't help us with the Static Recipient list because the list of banks is created 
    // programatically in DefaultLenderService (they should be looked up from the config/registry).
    public void setService(Service service) throws ConfigurationException 
    {
        this.bankName = service.getName(); 

        List endpoints = service.getInboundRouter().getEndpoints();
        if ((endpoints == null) || (endpoints.size() != 1))
        {
            throw new ConfigurationException(MessageFactory.createStaticMessage("Bank is expected to have exactly 1 incoming endpoint."));
        }
        // TODO This gives us the endpoint the bank is listening on, but the endpoint for sending to the bank 
        // is different in the ESB config ("Bank1In" vs. "Bank1")
        this.endpoint = ((Endpoint) endpoints.get(0)).getName();
    }

    public LoanQuote getLoanQuote(LoanBrokerQuoteRequest request)
    {
        LoanQuote quote = new LoanQuote();
        quote.setBankName(getBankName());
        quote.setInterestRate(primeRate);
        logger.info(LocaleMessage.receivedRate(quote));

        return quote;
    }

    public String getBankName()
    {
        return bankName;
    }

    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }

    public double getPrimeRate()
    {
        return primeRate;
    }

    public void setPrimeRate(double primeRate)
    {
        this.primeRate = primeRate;
    }

    public String getEndpoint()
    {
        return endpoint;
    }
    public void setEndpoint(String endpoint)
    {
        this.endpoint = endpoint;
    }
}
