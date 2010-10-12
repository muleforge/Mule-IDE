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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;

public class MuleProjectPropertiesPage extends PropertyPage
{
    public MuleProjectPropertiesPage()
    {
        super();
    }

    @Override
    protected Control createContents(Composite parent)
    {
        noDefaultAndApplyButton();
//        createHotDeploymentNameWidgets(parent);

        return parent;
    }

    private void createHotDeploymentNameWidgets(Composite parent)
    {
        Composite composite = new Composite(parent, SWT.NULL);

        GridLayout mainLayout = new GridLayout();
        mainLayout.numColumns = 2;
        composite.setLayout(mainLayout);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));

        Label label = new Label(composite, SWT.NONE);
        label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        label.setText("Hot deployment name");

        Text text = new Text(composite, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
        text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
    }
}
