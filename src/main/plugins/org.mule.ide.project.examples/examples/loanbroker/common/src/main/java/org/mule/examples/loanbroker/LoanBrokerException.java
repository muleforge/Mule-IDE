/*
 * $Id: LoanBrokerException.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.loanbroker;

import org.mule.api.DefaultMuleException;

/**
 * Exception related to the LoanBroker example app.
 */
public class LoanBrokerException extends DefaultMuleException
{
    private static final long serialVersionUID = -1669865702115931005L;

    public LoanBrokerException(String message)
    {
        super(message);
    }

    public LoanBrokerException(Exception e)
    {
        super(e);
    }
}
