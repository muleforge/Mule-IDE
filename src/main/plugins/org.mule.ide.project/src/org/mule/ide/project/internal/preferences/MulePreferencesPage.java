/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
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

	protected Control createContents(Composite parent) {
		runtimePanel = new MuleRuntimePreferencePanel(this, parent, SWT.NONE);
		runtimePanel.initializeFromPreferences();
		return runtimePanel;
	}

	public void init(IWorkbench workbench) {
		// no initialization necessary
	}
	
	public boolean performOk() {
		runtimePanel.saveToPreferences();
		return true;
	}

	public void setErrorMessage(String newMessage) {
		setValid(newMessage == null);
		super.setErrorMessage(newMessage);
	}
}