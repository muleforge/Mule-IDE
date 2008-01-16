/*
 * $Id: MuleWizardProjectPage.java 3 2007-10-22 21:24:07Z ted.bashor $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.examples;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * First page of the wizard to create a new Mule project
 * 
 * @author Derek Adams, Jesper Steen Møller
 */
public class MuleExampleProjectPage extends WizardNewProjectCreationPage {

	/** Naming constant for project page */
	private static final String PAGE_PROJECT = "muleWizardProjectPage";
	
	private ProjectContentChooser contentChooser;

	public MuleExampleProjectPage() {
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
		
		// Bottom group - choose which sample to use
		contentChooser = new ProjectContentChooser(existing, SWT.NONE);
		contentChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	}

    protected boolean validatePage() {
    	boolean valid = super.validatePage();
    	return valid;
    }
    
	/**
	 * Gets the chosen sample project name or null of "empty" or none chosen.
	 * 
	 * @return the sample project description or null
	 */
	public String getSelectedSample() {
		return contentChooser.getChosenSample();
	}
	
	public class ProjectContentChooser extends Composite {

		private String[] allSamples = {"echo", "errorhandler", "hello", "hello-osgi", "loanbroker/bpm", "loanbroker/common", "loanbroker/common-tests", "loanbroker/credit-agency", "loanbroker/esb", "loanbroker/esn", "scripting", "stockquote", "webapp"};
		
		/** Dropdown that contains a list of sample projects */
		private Combo samples;
		private Button buttonUseSample;

		public ProjectContentChooser(Composite parent, int style) {
			super(parent, style);
			initialize();
		}
		
		public void initialize() {
			GridLayout gridLayout1 = new GridLayout();
			this.setLayout(gridLayout1);

			Group group = new Group(this, SWT.NONE);
			group.setText("Sample Content");
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
			
			/*
			buttonUseSample = new Button(group, SWT.CHECK | SWT.RIGHT);
			buttonUseSample
					.setText("Add content from a Mule distribution sample project");
			buttonUseSample.setSelection(true);
			GridData buttonData = new GridData();
			buttonData.horizontalSpan = 1;
			buttonUseSample.setLayoutData(buttonData);
			
			buttonUseSample.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					samples.setEnabled(buttonUseSample.getSelection());
				}
			});
			*/

			samples = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
			GridData comboData = new GridData(GridData.FILL_HORIZONTAL);
			//comboData.horizontalIndent = 16;
			samples.setLayoutData(comboData);
			
			if (allSamples == null) {
				buttonUseSample.setEnabled(false);
				buttonUseSample.setSelection(false);
				samples.setEnabled(false);
				return;
			}

			for (String sample : allSamples) {
				samples.add(sample);
			}
			
			samples.select(0);
		}


		/**
		 * Get the sample which is chosen.
		 * 
		 * @return the index of the sample, or -1 if empty project or no sample chosen
		 */
		public String getChosenSample() {
			//int index = buttonUseSample.getSelection() ? samples.getSelectionIndex() : -1;
			//return (index >= 0 ? allSamples[index] : null);
			return allSamples[samples.getSelectionIndex()];
		}
	}
}