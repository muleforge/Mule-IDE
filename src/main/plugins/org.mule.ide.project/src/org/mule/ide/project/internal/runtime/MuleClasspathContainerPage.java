/*
 * $Id: MuleClasspathContainerPage.java 1 2007-08-16 16:30:25Z quoc $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.ui.wizards.IClasspathContainerPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.mule.ide.project.internal.util.MuleClasspathUtils;
import org.mule.ide.project.internal.wizards.MuleRuntimeChooserPanel;

public class MuleClasspathContainerPage extends WizardPage implements
		IClasspathContainerPage {

	private IClasspathEntry selection;

	public MuleClasspathContainerPage() {
		super("Mule Classpath");
		this.setTitle("Mule Distribution and Modules");
		this.setDescription("Please choose the Mule distribution to use for this project, and choose which modules and transports to include");
		//this.setImageDescriptor(MulePlugin.getDefault().getImageRegistry().getDescriptor(
		//		IMuleImages.KEY_MULE_WIZARD_BANNER));
	}
	
	public boolean finish() {
		String hint = chooserPanel.getRuntimeHint();
		selection = MuleClasspathUtils.createMuleClasspathContainer(hint, chooserPanel.getLibrarySelection());
		return true;
	}

	public IClasspathEntry getSelection() {
		return selection;
	}

	public void setSelection(IClasspathEntry containerEntry) {
		this.selection = containerEntry;
	}

	MuleRuntimeChooserPanel chooserPanel; 
	
	public void createControl(Composite parent) {
		chooserPanel = new MuleRuntimeChooserPanel(parent, SWT.NONE, false);
		setControl(chooserPanel);
	}

	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			chooserPanel.initialize(getSelection() != null ? getSelection().getPath() : null);
		}
	}
}