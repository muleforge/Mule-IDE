/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.ui.panels;

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
import org.mule.ide.core.distribution.IMuleDistribution;
import org.mule.ide.core.distribution.IMuleSample;

/**
 * Allows the choice of initial project content.
 * 
 * @author dadams, jmoller, tbashor
 */
public class ProjectContentChooser extends Composite {

	private IMuleSample[] allSamples;
	
	private Button buttonUseSample;

	/** Dropdown that contains a list of sample projects */
	private Combo samples;

	public ProjectContentChooser(Composite parent, int style) {
		super(parent, style);
		initialize();
	}
	
	public void setDistribution(IMuleDistribution distribution) {
		if (isDisposed()) return;
		
		// Store previous selection
		String prevSample = null;
		if (buttonUseSample.getSelection()) {
			int selectionIndex = samples.getSelectionIndex();
			prevSample = selectionIndex > 0 ? samples.getItem(selectionIndex) : null;			
		}
		
		samples.removeAll();

		allSamples = distribution != null ? distribution.getSuppliedSamples() : null;
		
		if (allSamples == null) {
			buttonUseSample.setEnabled(false);
			buttonUseSample.setSelection(false);
			samples.setEnabled(false);
			return;
		}

		int prevSampleIndex = -1;
		for (int i=0; i < allSamples.length; ++i) {
			String sample = allSamples[i].getName();
			samples.add(sample);
			if (sample.equals(prevSample)) {
				prevSampleIndex = i;
			}
		}
		if (prevSampleIndex > 0) {
			samples.select(prevSampleIndex);
		} else {
			if (allSamples.length > 0) {
				samples.select(0);
			}
		}

		buttonUseSample.setEnabled(true);
		buttonUseSample.setSelection(prevSampleIndex > 0);
		samples.setEnabled(buttonUseSample.getSelection());
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
		
		buttonUseSample = new Button(group, SWT.CHECK | SWT.RIGHT);
		buttonUseSample
				.setText("Add content from a Mule distribution sample project");
		buttonUseSample.setSelection(false);
		GridData buttonData = new GridData();
		buttonData.horizontalSpan = 1;
		buttonUseSample.setLayoutData(buttonData);
		
		buttonUseSample.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				samples.setEnabled(buttonUseSample.getSelection());
			}
		});

		samples = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridData comboData = new GridData(GridData.FILL_HORIZONTAL);
		comboData.horizontalIndent = 16;
		samples.setLayoutData(comboData);
		
		
	}


	/**
	 * Get the sample which is chosen.
	 * 
	 * @return the index of the sample, or -1 if empty project or no sample chosen
	 */
	public IMuleSample getChosenSample() {
		int index = buttonUseSample.getSelection() ? samples.getSelectionIndex() : -1;
		return (index > 0 ? allSamples[index] : null);
	}
}