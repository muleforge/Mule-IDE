/**
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * MULE_LICENSE.txt file.
 */

package org.mule.ide.project.internal.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.mule.ide.project.MuleProjectPlugin;

/**
 * Preference page for Mule settings.
 */
public class MulePreferencesPage extends PreferencePage implements IWorkbenchPreferencePage {

	// Runtime directory selection
	private MuleRuntimePreferencePanel runtimePanel;

	public MulePreferencesPage() {
		setPreferenceStore(MuleProjectPlugin.getInstance().getPreferenceStore());
		setDescription("Add Mule installation directories and select the default distribution to use with Mule projects.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createContents(Composite parent) {
		runtimePanel = new MuleRuntimePreferencePanel(this, parent, SWT.NONE);
		runtimePanel.initializeFromPreferences();
		return runtimePanel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	public boolean performOk() {
		runtimePanel.saveToPreferences();
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#setErrorMessage(java.lang.String)
	 */
	public void setErrorMessage(String newMessage) {
		setValid(newMessage == null);
		super.setErrorMessage(newMessage);
	}
}