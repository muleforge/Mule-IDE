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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.mule.ide.project.MuleIdeProject;

public class ConfigurationFiles extends Composite implements ICheckStateListener
{
    private MuleIdeProject project;
    private CheckboxTableViewer configFiles;

    private static final Comparator<IResource> SortByProjectRelativePath = new Comparator<IResource>()
    {
        public int compare(IResource resource1, IResource resource2)
        {
            String path1 = resource1.getProjectRelativePath().toString();
            String path2 = resource2.getProjectRelativePath().toString();
            return path1.compareTo(path2);
        }
    };

    public ConfigurationFiles(Composite parent, MuleIdeProject project) throws CoreException
    {
        super(parent, SWT.NULL);
        this.project = project;
        initWidgets(parent);
    }

    private void initWidgets(Composite parent) throws CoreException
    {
        GridLayout mainLayout = new GridLayout();
        this.setLayout(mainLayout);
        this.setLayoutData(new GridData(GridData.FILL_BOTH));

        configFiles = CheckboxTableViewer.newCheckList(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
        configFiles.setLabelProvider(new ConfigLabelProvider());
        configFiles.addCheckStateListener(this);

        Table configTable = configFiles.getTable();
        configTable.setLayoutData(new GridData(GridData.FILL_BOTH));
        configTable.setFont(parent.getFont());

        populateConfigTable();
    }

    private void populateConfigTable() throws CoreException
    {
        List<IResource> allXmlFiles = project.allXmlFiles();
        Collections.sort(allXmlFiles, SortByProjectRelativePath);

        IResource configuredConfigFile = project.getPreferences().getConfigFile();
        for (IResource xmlFile : allXmlFiles)
        {
            configFiles.add(xmlFile);

            boolean checked = xmlFile.equals(configuredConfigFile);
            configFiles.setChecked(xmlFile, checked);
        }
    }

    public void checkStateChanged(CheckStateChangedEvent event)
    {
        IResource selectedFile = (IResource)event.getElement();

        // TODO MULEIDE-202 for now we only support a single config file
        project.getPreferences().setConfigFile(selectedFile.getProjectRelativePath());

        configFiles.setCheckedElements(new Object[0]);
        configFiles.setChecked(selectedFile, true);
    }

    private class ConfigLabelProvider extends LabelProvider
    {
        @Override
        public String getText(Object element)
        {
            IResource resource = (IResource)element;
            return resource.getProjectRelativePath().toString();
        }
    }
}
