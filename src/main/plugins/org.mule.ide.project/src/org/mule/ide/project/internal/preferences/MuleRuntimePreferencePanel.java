/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.preferences;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.internal.runtime.MuleRuntime;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleRuntimePreferencePanel extends Composite
{

    private Group distroGroup = null;
    private Table tableRuntimes = null;
    private Button buttonAddDir = null;
    // private Button buttonAddJar = null;
    private Button buttonRemove = null;
    private Group selectedDistroInfo = null;
    private Label label1 = null;
    private Text textDistributionDescription = null;
    private Label label2 = null;
    private Text textDistributionVersion = null;

    private ArrayList<String> pathList = new ArrayList<String>(); // @jve:decl-index=0:
    public DialogPage parentPage;

    private int defaultIndex = -1;

    public MuleRuntimePreferencePanel(DialogPage page, Composite parent, int style)
    {
        super(parent, style);
        this.parentPage = page;
        initialize();
    }

    private void initialize()
    {
        createDistroGroup();
        createSelectedDistroInfo();
        setSize(new Point(300, 200));
        setLayout(new GridLayout());
    }

    /**
     * This method initializes distroGroup
     */
    private void createDistroGroup()
    {
        distroGroup = new Group(this, SWT.NONE);
        distroGroup.setText("Mule &Distributions:");
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        distroGroup.setLayout(gridLayout);
        GridData gridData = new GridData();
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
        gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        distroGroup.setLayoutData(gridData);

        tableRuntimes = new Table(distroGroup, SWT.CHECK | SWT.BORDER);
        tableRuntimes.setHeaderVisible(false);
        gridData = new GridData();
        gridData.verticalSpan = 3;
        gridData.grabExcessVerticalSpace = true;
        gridData.grabExcessHorizontalSpace = true;
        gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
        gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
        tableRuntimes.setLayoutData(gridData);
        tableRuntimes.setLinesVisible(false);
        tableRuntimes.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter()
        {
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent event)
            {
                if (event.detail == SWT.CHECK)
                {
                    TableItem oldItem = tableRuntimes.getItem(defaultIndex);
                    if (oldItem != event.item) oldItem.setChecked(false);
                    ((TableItem) (event.item)).setChecked(true);
                    setNewDefault(tableRuntimes.indexOf((TableItem) (event.item)));
                }
                else
                {
                    // Must be selection
                    showMuleVersion(tableRuntimes.indexOf((TableItem) (event.item)));
                }
            }
        });
        buttonAddDir = new Button(distroGroup, SWT.NONE);
        buttonAddDir.setText("&Add...");
        gridData = new GridData(GridData.FILL, SWT.CENTER, false, false);
        buttonAddDir.setLayoutData(gridData);
        buttonAddDir.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter()
        {
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
            {
                handleAddButton();
            }
        });
        /*
         * buttonAddJar = new Button(distroGroup, SWT.NONE);
         * buttonAddJar.setText("Add Mule &JAR/RAR"); gridData = new
         * GridData(GridData.FILL, SWT.CENTER, false, false);
         * buttonAddJar.setLayoutData(gridData); buttonAddJar
         * .addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
         * public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
         * addJarDistribution(); } });
         */
        buttonRemove = new Button(distroGroup, SWT.NONE);
        buttonRemove.setText("&Remove");
        gridData = new GridData(GridData.FILL, SWT.CENTER, false, false);
        buttonRemove.setLayoutData(gridData);
        buttonRemove.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter()
        {
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
            {
                handleRemoveButton();
            }
        });
    }

    /**
     * This method initializes selectedDistroInfo
     */
    private void createSelectedDistroInfo()
    {
        GridData gridData6 = new GridData();
        gridData6.grabExcessHorizontalSpace = true;
        gridData6.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
        GridData gridData5 = new GridData();
        gridData5.grabExcessHorizontalSpace = true;
        gridData5.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
        GridLayout gridLayout1 = new GridLayout();
        gridLayout1.numColumns = 2;
        GridData gridData4 = new GridData();
        gridData4.grabExcessHorizontalSpace = true;
        gridData4.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
        gridData4.grabExcessVerticalSpace = false;
        selectedDistroInfo = new Group(this, SWT.NONE);
        selectedDistroInfo.setLayoutData(gridData4);
        selectedDistroInfo.setLayout(gridLayout1);
        selectedDistroInfo.setText("Information:");
        label1 = new Label(selectedDistroInfo, SWT.NONE);
        label1.setText("Path:");
        textDistributionDescription = new Text(selectedDistroInfo, SWT.READ_ONLY);
        textDistributionDescription.setLayoutData(gridData5);
        label2 = new Label(selectedDistroInfo, SWT.NONE);
        label2.setText("Version:");
        textDistributionVersion = new Text(selectedDistroInfo, SWT.READ_ONLY);
        textDistributionVersion.setLayoutData(gridData6);
    }

    /**
     * Browse for the external root.
     */
    private void handleAddButton()
    {
        DirectoryDialog dialog = new DirectoryDialog(parentPage.getShell());
        dialog.setText("Choose the root of an unpacked Mule Distribution");
        doAddRuntimeDirectory(dialog.open());
    }

    private void addDistributionRoot(String filePath)
    {
        pathList.add(filePath);
        TableItem it = new TableItem(tableRuntimes, SWT.NONE);
        it.setText(filePath);
        if (defaultIndex < 0)
        {
            setNewDefault(tableRuntimes.indexOf(it));
        }
    }

    /**
     * Initialize the values from the preferences store.
     */
    public void initializeFromPreferences()
    {
        String[] distributions = MulePreferences.getDistributionPaths();
        defaultIndex = MulePreferences.getDefaultDistributionIndex();
        pathList.clear();
        tableRuntimes.clearAll();
        for (int i = 0; i < distributions.length; ++i)
        {
            TableItem ti = new TableItem(tableRuntimes, SWT.CHECK);
            ti.setChecked(i == defaultIndex);
            ti.setText(distributions[i]);
            pathList.add(distributions[i]);
        }
        tableRuntimes.select(defaultIndex);
        showMuleVersion(defaultIndex);
    }

    private void handleRemoveButton()
    {
        int idx = tableRuntimes.getSelectionIndex();
        if (idx >= 0 && idx < pathList.size())
        {
            tableRuntimes.remove(idx);
            pathList.remove(idx);
        }
        showMuleVersion(-1);
        if (defaultIndex == idx)
        {
            setNewDefault(-1);
        }
        else if (defaultIndex > idx)
        {
            defaultIndex--;
        }
    }

    /**
     * Save the values into the preference store.
     */
    public void saveToPreferences()
    {
        MulePreferences.setDistributions((String[]) (pathList.toArray(new String[pathList.size()])),
            defaultIndex);
    }

    private void setNewDefault(int idx)
    {
        // clear old checkmark
        if (idx != defaultIndex && defaultIndex > 0 && idx < tableRuntimes.getItemCount())
            tableRuntimes.getItem(defaultIndex).setChecked(false);

        defaultIndex = idx;
        if (idx > 0 && idx < tableRuntimes.getItemCount())
        {
            tableRuntimes.getItem(defaultIndex).setChecked(true);
        }
        tableRuntimes.select(defaultIndex);
        boolean ok = showMuleVersion(defaultIndex);
        defaultIndex = idx;

        if (!ok)
        {
            parentPage.setErrorMessage("The Mule installation or distribution at this location cannot be recognized");
        }
        else
        {
            parentPage.setErrorMessage(null);
        }
    }

    public boolean showMuleVersion(int idx)
    {

        if (idx >= 0 && idx < pathList.size())
        {
            IMuleRuntime dist = MulePreferences.getMuleRuntime((String) pathList.get(idx));
            if (dist != null)
            {
                this.textDistributionVersion.setText(dist.getVersion());
                this.textDistributionDescription.setText(dist.getDirectory().toString());
                return true;
            }
            else
            {
                this.textDistributionVersion.setText("Error");
                this.textDistributionDescription.setText("The selected Mule distribution cannot be used with Mule IDE");
                return false;
            }
        }
        else
        {
            this.textDistributionVersion.setText("");
            this.textDistributionDescription.setText("");
        }
        return true;
    }

    private void doAddRuntimeDirectory(String filepath)
    {
        if (filepath == null) return;

        File path = new File(filepath);
        try
        {
            filepath = path.getCanonicalPath();
        }
        catch (IOException ioe)
        {
            // Do nothing?
        }

        if (pathList.contains(filepath))
        {
            MessageDialog.openInformation(parentPage.getShell(), "Existing Mule Runtime",
                "Runtime directory has already been configured.");
            return;
        }

        IStatus status = MuleRuntime.validateRuntimeDirectory(path);
        if (!status.isOK())
        {
            MessageDialog.openError(parentPage.getShell(), "Invalid Mule Runtime Directory",
                status.getMessage());
            return;
        }

        addDistributionRoot(filepath);
        parentPage.setMessage(null);
    }
}
