/*
 * $Id: BankQuotesAggregationLogic.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker.routers;

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.examples.loanbroker.LocaleMessage;
import org.mule.examples.loanbroker.messages.LoanQuote;
import org.mule.routing.inbound.EventGroup;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BankQuotesAggregationLogic
{
    /**
     * logger used by this class
     */
    protected static final Log logger = LogFactory.getLog(BankQuotesAggregationLogic.class);
    
    public static MuleMessage aggregateEvents(EventGroup events) throws Exception
    {
        LoanQuote lowestQuote = null;
        LoanQuote quote = null;
        MuleEvent event = null;

        for (Iterator iterator = events.iterator(); iterator.hasNext();)
        {
            event = (MuleEvent)iterator.next();
            Object o = event.transformMessage();
            if(o instanceof LoanQuote)
            {
                quote = (LoanQuote)o;
            }
            else
            {
                throw new IllegalArgumentException("Object received by Aggregator is not of expected type. Wanted: "
                        + LoanQuote.class.getName() + " Got: " + o);
            }
            logger.info(LocaleMessage.processingQuote(quote));

            if (lowestQuote == null)
            {
                lowestQuote = quote;
            }
            else
            {
                if (quote.getInterestRate() < lowestQuote.getInterestRate())
                {
                    lowestQuote = quote;
                }
            }
        }

        logger.info(LocaleMessage.lowestQuote(lowestQuote));
        return new DefaultMuleMessage(lowestQuote, event.getMessage());
    }
}
