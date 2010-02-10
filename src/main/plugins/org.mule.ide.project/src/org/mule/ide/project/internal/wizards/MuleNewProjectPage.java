/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.wizards;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.runtime.IMuleSampleProject;
import org.mule.ide.project.runtime.ui.IDistributionChangeListener;
import org.mule.ide.project.runtime.ui.MuleRuntimeChooserPanel;

/**
 * First page of the wizard to create a new Mule project
 */
public class MuleNewProjectPage extends WizardNewProjectCreationPage
{
    /** Naming constant for project page */
    private static final String PAGE_PROJECT = "muleWizardProjectPage";

    private SampleChooserPanel sampleChooser;
    private MuleRuntimeChooserPanel runtimeChooser;

    public MuleNewProjectPage()
    {
        super(PAGE_PROJECT);
        setTitle("Mule Project");
        setDescription("Create a new Mule project.");
    }

    public void createControl(Composite parent)
    {
        super.createControl(parent);
        Composite existing = (Composite) getControl();

        // Middle group - choose runtime
        runtimeChooser = new MuleRuntimeChooserPanel(existing, SWT.NONE, true);
        runtimeChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        runtimeChooser.addDistributionChangeListener(new IDistributionChangeListener()
        {
            public void distributionChanged(IMuleRuntime newDistribution)
            {
                sampleChooser.setRuntime(newDistribution);
                boolean valid = validatePage();
                setPageComplete(valid);
            }
        });

        // Bottom group - choose which sample to use
        sampleChooser = new SampleChooserPanel(existing, SWT.NONE);
        sampleChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

        sampleChooser.setRuntime(MulePreferences.getDefaultMuleRuntime());
    }

    protected boolean validatePage()
    {
        boolean valid = super.validatePage();
        if (valid)
        {
            if (getRuntime() == null)
            {
                setErrorMessage(null);
                setMessage("A Mule Runtime directory must be configured.");
                return false;
            }
        }
        return valid;
    }

    /**
     * Returns a string suitable for using as the runtime identifier for a mule
     * classpath container.
     * 
     * @return null if default runtime should be used, or none available.
     */
    public String getRuntimeHint()
    {
        return runtimeChooser.getRuntimeHint();
    }

    public IMuleRuntime getRuntime()
    {
        return runtimeChooser.getRuntime();
    }

    /**
     * Gets the chosen sample project name or null of "empty" or none chosen.
     * 
     * @return the sample project description or null
     */
    public IMuleSampleProject getSelectedSample()
    {
        return sampleChooser.getChosenSample();
    }

    class SampleChooserPanel extends Composite
    {

        private Combo comboSamples;
        private Button buttonUseSample;
        private List<IMuleSampleProject> sampleProjects;

        public SampleChooserPanel(Composite parent, int style)
        {
            super(parent, style);
            initialize();
        }

        private void initialize()
        {
            GridLayout gridLayout1 = new GridLayout();
            this.setLayout(gridLayout1);

            Group group = new Group(this, SWT.NONE);
            group.setText("Sample content");
            GridData gdGroup = new GridData();
            gdGroup.grabExcessHorizontalSpace = true;
            gdGroup.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
            GridLayout layout = new GridLayout();
            layout.numColumns = 1;
            layout.marginTop = 5;
            layout.marginBottom = 5;
            layout.marginLeft = 5;
            layout.marginRight = 5;
            group.setLayoutData(gdGroup);
            group.setLayout(layout);

            buttonUseSample = new Button(group, SWT.CHECK | SWT.RIGHT);
            buttonUseSample.setText("Add sample project content");
            buttonUseSample.setSelection(false);
            GridData buttonData = new GridData();
            buttonData.horizontalSpan = 1;
            buttonUseSample.setLayoutData(buttonData);

            buttonUseSample.addSelectionListener(new SelectionAdapter()
            {
                public void widgetSelected(SelectionEvent e)
                {
                    comboSamples.setEnabled(buttonUseSample.getSelection());
                }
            });

            comboSamples = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
            GridData comboData = new GridData(GridData.FILL_HORIZONTAL);
            comboData.horizontalIndent = 16;
            comboSamples.setLayoutData(comboData);
            comboSamples.setEnabled(false);
        }

        public void setRuntime(IMuleRuntime runtime)
        {
            sampleProjects = null;
            if (runtime == null)
            {
                clearSamples();
                return;
            }

            sampleProjects = runtime.getSampleProjects();
            if (sampleProjects.isEmpty())
            {
                clearSamples();
                return;
            }

            // clear out all choices. The list of choices may have been populated
            // before when choosing a different Mule runtime
            comboSamples.removeAll();
            for (IMuleSampleProject sampleProject : sampleProjects)
            {
                comboSamples.add(sampleProject.getName());
            }
            comboSamples.select(0);
            buttonUseSample.setEnabled(true);
        }

        private void clearSamples()
        {
            buttonUseSample.setEnabled(false);
            buttonUseSample.setSelection(false);
            comboSamples.setEnabled(false);
            comboSamples.removeAll();
        }

        /**
         * Get the sample which is chosen.
         * 
         * @return the index of the sample, or -1 if empty project or no sample
         *         chosen
         */
        public IMuleSampleProject getChosenSample()
        {
            int index = buttonUseSample.getSelection() ? comboSamples.getSelectionIndex() : -1;
            return (index >= 0 ? sampleProjects.get(index) : null);
            // return allSamples[samples.getSelectionIndex()];
        }
    }
}
