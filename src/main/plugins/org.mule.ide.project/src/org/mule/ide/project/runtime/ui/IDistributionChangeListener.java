/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime.ui;

import org.mule.ide.project.runtime.IMuleRuntime;

public interface IDistributionChangeListener
{
    /**
     * @param newDistribution New distribution. <code>null</code> if there was a previously
     *         selected distribution and now there are none available.
     */
    void distributionChanged(IMuleRuntime newDistribution);
}