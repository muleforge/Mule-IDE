/**
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * MULE_LICENSE.txt file.
 */

package org.mule.ide.core.jobs;

import org.mule.ide.core.MuleCorePlugin;
import org.mule.ide.core.model.IMuleConfiguration;
import org.mule.ide.core.model.IMuleModel;

import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Background job for refreshing the content model from the Mule configuration files.
 */
public class RefreshMuleConfigurationsJob extends Job {

    /** The model to refresh */
    private IMuleModel model;

    /** Indicates whether all configs should be reloaded */
    private boolean reloadAll;

    /**
     * Background job for refreshing the Mule EMF models from the config files. If the reloadAll
     * parameter is not specified, only the config files that have not already been loaded will be
     * processed. If reloadAll is true, all config files will be reloaded.
     *
     * @param model the Mule model
     * @param reloadAll flag indicating whether to force reload on all configs
     */
    public RefreshMuleConfigurationsJob(IMuleModel model, boolean reloadAll) {
        super("Refreshing Mule configuration files");
        this.model = model;
        this.reloadAll = reloadAll;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.core.internal.jobs.InternalJob#run(org.eclipse.core.runtime.IProgressMonitor)
     */
    protected IStatus run(IProgressMonitor monitor) {
        MultiStatus status = MuleCorePlugin.getDefault().createMultiStatus(
                "Errors loading Mule configuration files.");
        int numConfigs = model.getMuleConfigurations().size();
        Iterator it = model.getMuleConfigurations().iterator();
        monitor.beginTask("Refreshing Mule configuration files...", numConfigs);
        while (it.hasNext()) {
            // Getting the config forces a refresh if not initialized.
            IMuleConfiguration config = (IMuleConfiguration) it.next();
            if (this.reloadAll) {
                IStatus refreshResult = config.refresh();
                if (!refreshResult.isOK()) {
                    status.add(refreshResult);
                }
            }
            monitor.worked(1);
        }

        // Log any errors to the Eclipse log.
        if (!status.isOK()) {
            MuleCorePlugin.getDefault().getLog().log(status);
        }

        // Do not pop up error dialog.
        return Status.OK_STATUS;
    }
}