/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.ui.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.mule.ide.core.distribution.IMuleDistribution;
import org.mule.ide.core.distribution.IMuleSample;
import org.mule.ide.ui.panels.ProjectContentChooser;
import org.mule.ide.ui.project.MuleClasspathChooserPanel;

/**
 * First page of the wizard to create a new Mule project
 * 
 * @author Derek Adams, Jesper Steen Møller
 */
public class MuleWizardProjectPage extends WizardNewProjectCreationPage {

	/** Widgets needed to choose the initial project content */
	private ProjectContentChooser contentChooser;
	private MuleClasspathChooserPanel classpathChooser;

	private IMuleDistribution chosenDistribution;

	/** Naming constant for project page */
	private static final String PAGE_PROJECT = "muleWizardProjectPage";

	public MuleWizardProjectPage() {
		super(PAGE_PROJECT);
		setTitle("Mule Project");
		setDescription("Create a new Mule project.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewProjectCreationPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		Composite existing = (Composite) getControl();
		//existing.setLayout(new RowLayout(SWT.VERTICAL));
		// Top group - choose which distribution to use
		classpathChooser = new MuleClasspathChooserPanel(existing, SWT.NONE, true);
		classpathChooser.reset(null, "");
		classpathChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		classpathChooser.addDistributionChangeListener(new MuleClasspathChooserPanel.IDistributionChangeListener() {
			public void distributionChanged(IMuleDistribution newDist) {
				setDistributionSamples(newDist);
				chosenDistribution = newDist;
	            boolean valid = validatePage();
	            setPageComplete(valid);
			}
		});
		
		// Bottom group - choose which sample to use
		contentChooser = new ProjectContentChooser(existing, SWT.NONE);
		contentChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		chosenDistribution = classpathChooser.getChosenDistribution();
		setDistributionSamples(chosenDistribution);
	}

    protected boolean validatePage() {
    	boolean valid = super.validatePage();
    	if (valid) {
    		if (chosenDistribution == null) {
    			setErrorMessage(null);
    			setMessage("A Mule distribution must be configured");
    			return false;
    		}
    	}
    	return valid;
    }
    
	/**
	 * Gets the chosen sample project name or null of "empty" or none chosen.
	 * 
	 * @return the sample project description or null
	 */
	public IMuleSample getSelectedSample() {
		return contentChooser.getChosenSample();
	}

	
	/**
	 * Sets the list of samples based on the selected distribution, or null
	 * 
	 * @param newDist The newly selected distribution
	 */
	private void setDistributionSamples(IMuleDistribution newDist) {
		contentChooser.setDistribution(newDist);
	}

	public IMuleDistribution getMuleDistribution() {
		return chosenDistribution != null ? chosenDistribution : classpathChooser.getChosenDistribution();
	}

	public String getDistributionHint() {
		return classpathChooser.getDistributionHint();
	}
}