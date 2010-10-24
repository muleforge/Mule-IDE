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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;
import org.mule.ide.common.projectfactory.IdeProjectFactory;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectPlugin;

public class MuleProjectPropertiesPage extends PropertyPage
{
    private MuleIdeProject project;
    private Text hotDeploymentName;

    public MuleProjectPropertiesPage()
    {
        super();
    }

    @Override
    protected Control createContents(Composite parent)
    {
        initProjectReference();
        createHotDeploymentNameWidgets(parent);
        createConfigFileWidgets(parent);

        return parent;
    }

    private void initProjectReference()
    {
        IdeProjectFactory<MuleIdeProject> factory = MuleProjectPlugin.getInstance().getProjectFactory();

        IAdaptable element = getElement();
        project = factory.create(element);
    }

    private void createHotDeploymentNameWidgets(Composite parent)
    {
        Composite composite = new Composite(parent, SWT.NULL);

        GridLayout mainLayout = new GridLayout();
        mainLayout.numColumns = 2;
        composite.setLayout(mainLayout);
        composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Label label = new Label(composite, SWT.NONE);
        label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        label.setText("Hot deployment name");

        hotDeploymentName = new Text(composite, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
        hotDeploymentName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        hotDeploymentName.setText(project.getPreferences().getHotDeploymentName());
    }

    private void createConfigFileWidgets(Composite parent)
    {
        Composite composite = new Composite(parent, SWT.NULL);

        composite.setLayout(new GridLayout());
//        composite.setLayoutData(new GridData(GridData.FILL_BOTH));

        Label label = new Label(composite, SWT.NONE);
        label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        label.setText("Mule configurations");

        try
        {
            new ConfigurationFiles(parent, project);
        }
        catch (CoreException ce)
        {
            throw new RuntimeException(ce);
        }
    }

    @Override
    public boolean performOk()
    {
        project.getPreferences().setHotDeploymentName(hotDeploymentName.getText());
        project.storePreferences();

        return super.performOk();
    }
}
