/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.debug.launching;

public interface IMuleLaunchConstants
{
    /**
     * Identifier for the Local Mule Server launch configuration type. must match the
     * id in plugin.xml
     */
    public static final String ID_MULE_LOCAL_SERVER = "org.mule.ide.debug.launching.localMuleServer";

    /** Attribute that holds the selected Mule project */
    static final String ATTR_MULE_EXEC_CLASS = "org.mule.MuleExecClass";

    /** Default class to execute for a Mule launch */
    static final String DEFAULT_MULE_EXEC_CLASS = "org.mule.MuleServer";

    /** Attribute that holds the selected Mule config set id */
    static final String ATTR_MULE_CONFIG_SET = "org.mule.MuleConfigSet";

    /** Attribute that holds the selected Mule Runtime id */
    static final String ATTR_MULE_RUNTIME_ID = "org.mule.MuleRuntimeId";
}
