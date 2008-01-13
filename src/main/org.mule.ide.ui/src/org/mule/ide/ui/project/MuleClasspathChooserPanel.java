/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.ui.project;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.mule.ide.core.MuleClasspathUtils;
import org.mule.ide.core.distribution.IMuleBundle;
import org.mule.ide.core.distribution.IMuleDistribution;
import org.mule.ide.core.distribution.MuleDistributionClasspathInitializer;
import org.mule.ide.core.distribution.MuleDistributionFactory;
import org.mule.ide.ui.IMuleIDEConstants;
import org.mule.ide.ui.preferences.IPreferenceConstants;
import org.mule.ide.ui.preferences.MulePreferences;

public class MuleClasspathChooserPanel extends Composite implements IMuleIDEConstants {

	private Group groupDistribution = null;
	private Group groupModule = null;
	private Button radioUseDefault = null;
	private Button radioSpecifyDistribution = null;
	private Combo comboDistribution = null;
	private Link linkPrefs = null;
	private Table tableSelectedModules = null;
	private boolean omitModuleSelection = false;

	Map path2DistributionCache = new HashMap();  //  @jve:decl-index=0:
	private Button buttonSelectAll = null;
	private Button buttonDeSelectAll = null;

	//String distributions[] = new String[] { };  //  @jve:decl-index=0:
	//int selectedDistribution = -1, defaultDistribution = -1;
	
	String selectedPath = null;
	
	public MuleClasspathChooserPanel(Composite parent, int style, boolean omitModuleSelection) {
		super(parent, style);
		this.omitModuleSelection = omitModuleSelection;
		initialize();
	}

	private void initialize() {
		//this.setSize(new Point(356, 249));
		GridLayout gridLayout1 = new GridLayout();
		//gridLayout1.verticalSpacing = 5;
		createGroupDistribution();
		this.setLayout(gridLayout1);
		if (! omitModuleSelection) {
			createGroupModule();
		}
	}
	
	private IMuleDistribution getDistribution(String path) {
		if (path2DistributionCache.containsKey(path))
			return (IMuleDistribution)path2DistributionCache.get(path);
		IMuleDistribution newDist = MuleDistributionFactory.getInstance().createMuleDistribution(new File(path));
		path2DistributionCache.put(path, newDist);
		return newDist;
	}
	
	/*
	 * null newPath indicates no distributions available.
	 */
	private void setDistributionSelection(String newPath) {
		assert( newPath != null || comboDistribution.getItemCount() == 0);
		
		if (newPath == null) {
			if (selectedPath != null) {
				selectedPath = null;
				fireDistributionChanged(null);  // changed to no distribution
			}
			return;
		}
		
		String pathifiedNewPath = pathify(newPath);
		String items[] = comboDistribution.getItems();
		for (int i=0; i<items.length; ++i) {
			if (pathifiedNewPath.equals(pathify(comboDistribution.getItem(i)))) {
				comboDistribution.select(i);
				if (selectedPath != null && pathifiedNewPath.equals(pathify(selectedPath))) {
					return;  // do nothing if previously selected
				}
				selectedPath = comboDistribution.getItem(i);
				IMuleDistribution dist = getDistribution(selectedPath);
				fireDistributionChanged(dist);  // distribution changed
				return;
			}
		}
		
		// TODO:  Throw error if no match found?
	}
	
	private void resetBundleTable(IMuleDistribution newDist) {
		Set oldSel = getModuleSelection();
		initializeBundleTable(newDist);
		setModuleSelection(oldSel);
	}

	private void initializeBundleTable(IMuleDistribution dist) {
		tableSelectedModules.setRedraw(false);
		try {
			tableSelectedModules.removeAll();
			if (dist != null) {
				IMuleBundle modules[] = dist.getMuleModules();
				for (int i = 0; i < modules.length; ++i) {
					new TableItem(tableSelectedModules,SWT.CHECK).setText(modules[i].getName());
				}
				IMuleBundle transports[] = dist.getMuleTransports();
				for (int i = 0; i < transports.length; ++i) {
					new TableItem(tableSelectedModules,SWT.CHECK).setText(transports[i].getName());
				}
			} 
		} finally {
			tableSelectedModules.setRedraw(true);
		}
	}

	private void setModuleSelection(Set selectionToSet) {
		int itemCount = tableSelectedModules.getItemCount();
		for (int i = 0; i < itemCount; ++i) {
			TableItem item = tableSelectedModules.getItem(i);
			item.setChecked(selectionToSet.contains(item.getText()));
		}
	}

	private String pathify(String hint) {
		return MuleDistributionClasspathInitializer.pathify(hint);
	}

	public void initializeWidgets(IPath originalPath) {
		// element 0 in the originalPath is always the name of the Mule classpath container
		String hint = null;
		String bundleSelectString = ""; 
		if (originalPath != null && originalPath.segmentCount() > 2) {
			hint = originalPath.segment(2); 
		}
		if (originalPath != null && originalPath.segmentCount() > 1) {
			bundleSelectString = originalPath.segment(1);
		}
		reset(hint, bundleSelectString);
		
	}

	/**
	 * Reset the panel's contents to the chosen distribution and bundle selection.
	 * If hint is provided and is not found amoung configured distributions, default
	 * distribution will be used.
	 * 
	 * @param hint  Path to select.  Null for default. 
	 * @param bundleSelectString
	 */
	public void reset(String hint, String bundleSelectString) {
		
		String[] distributions = MulePreferences.getDistributions();
		
		// Check that the configured distributions contains a match for
		// the requested path.  If not default will be used.
		if (hint != null) {
			boolean match = false;
			String temp = pathify(hint);
			for (int i=0; i<distributions.length; ++i) {
				if (temp.equals(pathify(distributions[i]))) {
					match = true;
					break;
				}
			}
			if (! match) {
				hint = null;
			}
		}
		
		// (Re)populate the combo
		comboDistribution.removeAll();
		for (int i=0; i<distributions.length; ++i) {
			comboDistribution.add(distributions[i]);
		}
		
		radioUseDefault.setSelection(hint == null);
		radioSpecifyDistribution.setSelection(hint != null);

		// Disable project specific choice if there are no distributions available.
		radioSpecifyDistribution.setEnabled(distributions.length > 0);			

		// Disable combo if use default is selected, or there are no distributions available.
		comboDistribution.setEnabled(radioSpecifyDistribution.getSelection() && distributions.length > 0);
		
		if (hint == null) {
			setDistributionSelection(getDefaultDistributionPath());
		} else {
			setDistributionSelection(hint);
		}
		
		if (! omitModuleSelection) {
			initializeBundleTable(getChosenDistribution());
			setModuleSelection(MuleClasspathUtils.commaStringToSet(bundleSelectString));
			
			if (listener == null) addDistributionChangeListener(new IDistributionChangeListener() {
				public void distributionChanged(IMuleDistribution newDist) {
					resetBundleTable(newDist);
				}
			});
		}
	}
	
	private String getDefaultDistributionPath() {
		int defaultIndex = MulePreferences.getDefaultDistribution();  
		String[] distributions = MulePreferences.getDistributions();
		if (defaultIndex >= distributions.length) {
			// unfortunately, getDefaultDistribution() returns 0 if pref is undefined
			return null;
		} else {
			return distributions[defaultIndex];
		}
	}
	
	public Set getModuleSelection() {
		Set selection = new HashSet();
		if (tableSelectedModules != null) {
			int itemCount = tableSelectedModules.getItemCount();
			for (int i = 0; i < itemCount; ++i) {
				TableItem item = tableSelectedModules.getItem(i);
				if (item.getChecked()) selection.add(item.getText());
			}
		}
		return selection;
	}
	
	/**
	 * This method initializes groupDistribution	
	 *
	 */
	private void createGroupDistribution() {
		GridLayout layoutGroup = new GridLayout();
		layoutGroup.numColumns = 2;
		layoutGroup.horizontalSpacing = 0;
		layoutGroup.marginTop = 5;
		layoutGroup.marginBottom = 5;
		layoutGroup.marginLeft = 5;
		layoutGroup.marginRight = 5;
		GridData gdGroup = new GridData();
		gdGroup.grabExcessHorizontalSpace = true;
		gdGroup.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		groupDistribution = new Group(this, SWT.NONE);
		groupDistribution.setText(ResourceBundle.getBundle(MESSAGEFILENAME, locale).getString("MuleDistribution"));
		groupDistribution.setLayoutData(gdGroup);
		groupDistribution.setLayout(layoutGroup);
		
		GridData gdUseDefault = new GridData();
		gdUseDefault.grabExcessHorizontalSpace = false;
		radioUseDefault = new Button(groupDistribution, SWT.RADIO);
		radioUseDefault.setText(ResourceBundle.getBundle(MESSAGEFILENAME, locale).getString("UseDefaultDist"));
		radioUseDefault.setLayoutData(gdUseDefault);
		radioUseDefault
		.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				if (radioUseDefault.getSelection()) {
					// Set the combo to display the default path
					comboDistribution.setEnabled(false);
					setDistributionSelection(getDefaultDistributionPath());
				}
			}
		});		
		
		GridData gdPrefs = new GridData();
		gdPrefs.horizontalAlignment = org.eclipse.swt.layout.GridData.END;
		linkPrefs = new Link(groupDistribution, SWT.NONE);
		linkPrefs.setText(ResourceBundle.getBundle(MESSAGEFILENAME, locale).getString("ConfigDefault"));
		linkPrefs.setLayoutData(gdPrefs);
		linkPrefs.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				PreferencesUtil.createPreferenceDialogOn(getShell(), IPreferenceConstants.DISTRIBUTION_PREFERENCES_ID, null, null).open();
				if (radioUseDefault.getSelection()) {
					reset(null, MuleClasspathUtils.collectionToCommaString(getModuleSelection()));
				} else {
					// If specified, try to reselect the previously selected path
					reset(selectedPath, MuleClasspathUtils.collectionToCommaString(getModuleSelection()));
				}
			}
		});
		
		GridData gdSpecify = new GridData();
		gdSpecify.horizontalSpan = 2;
		radioSpecifyDistribution = new Button(groupDistribution, SWT.RADIO);
		radioSpecifyDistribution.setText(ResourceBundle.getBundle(MESSAGEFILENAME, locale).getString("UseSpecific"));
		radioSpecifyDistribution.setLayoutData(gdSpecify);
		createComboDistribution();
		radioSpecifyDistribution
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						if (radioSpecifyDistribution.getSelection()) {
							comboDistribution.setEnabled(true);
						}
					}
				});
	}

	/**
	 * This method initializes groupModule	
	 *
	 */
	private void createGroupModule() {
		GridData gridData4 = new GridData();
		gridData4.widthHint = -1;
		gridData4.verticalAlignment = GridData.BEGINNING;
		gridData4.horizontalAlignment = GridData.FILL;
		GridData gridData3 = new GridData();
		gridData3.widthHint = -1;
		gridData3.verticalAlignment = GridData.CENTER;
		gridData3.horizontalAlignment = GridData.FILL;
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.numColumns = 2;
		gridLayout2.marginTop = 5;
		gridLayout2.marginBottom = 5;
		gridLayout2.marginLeft = 5;
		gridLayout2.marginRight = 5;
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.grabExcessVerticalSpace = true;
		gridData1.verticalSpan = 2;
		gridData1.heightHint = 100;
		gridData1.widthHint = 100;
		gridData1.verticalAlignment = GridData.FILL;
		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData2.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData2.grabExcessVerticalSpace = true;
		groupModule = new Group(this, SWT.NONE);
		groupModule.setText("Mule modules and &transports");
		groupModule.setLayout(gridLayout2);
		groupModule.setLayoutData(gridData2);
		tableSelectedModules = new Table(groupModule, SWT.BORDER | SWT.CHECK);
		tableSelectedModules.setHeaderVisible(false);
		tableSelectedModules.setToolTipText(ResourceBundle.getBundle(MESSAGEFILENAME, locale).getString("CheckIncludes"));
		tableSelectedModules.setLayoutData(gridData1);
		tableSelectedModules.setLinesVisible(false);
		buttonDeSelectAll = new Button(groupModule, SWT.NONE);
		buttonDeSelectAll.setText(ResourceBundle.getBundle(MESSAGEFILENAME, locale).getString("SelectAll"));
		buttonDeSelectAll.setLayoutData(gridData3);
		buttonDeSelectAll
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						for (int i=0; i < tableSelectedModules.getItemCount(); ++i ) {
							tableSelectedModules.getItem(i).setChecked(true);
						}
					}
				});
		buttonSelectAll = new Button(groupModule, SWT.NONE);
		buttonSelectAll.setText(ResourceBundle.getBundle(MESSAGEFILENAME, locale).getString("DeselectAll"));
		buttonSelectAll.setLayoutData(gridData4);
		buttonSelectAll
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						for (int i=0; i < tableSelectedModules.getItemCount(); ++i ) {
							tableSelectedModules.getItem(i).setChecked(false);
						}
					}
				});
	}

	/**
	 * This method initializes comboDistribution	
	 *
	 */
	private void createComboDistribution() {
		GridData gd3 = new GridData();
		gd3.horizontalIndent = 16;
		gd3.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gd3.widthHint = 200;
		gd3.horizontalSpan = 2;
		gd3.grabExcessHorizontalSpace = true;
		comboDistribution = new Combo(groupDistribution, SWT.DROP_DOWN | SWT.READ_ONLY);
		comboDistribution.setText("");
		comboDistribution.setLayoutData(gd3);
		comboDistribution.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				setDistributionSelection(comboDistribution.getItem(comboDistribution.getSelectionIndex()));
			}
		});

	}

	// TODO:  Might be better to eliminate this and just have getChosenDistribution()
	public String getDistributionHint() {
		if (radioUseDefault.getSelection()) return null;
		return pathify(selectedPath);
	}

	public interface IDistributionChangeListener {
		/**
		 * 
		 * @param newDistribution  New distribution.  Null if there
		 * was a previously selected distribution and now there are
		 * none available.
		 */
		void distributionChanged(IMuleDistribution newDistribution);
	}	
	
	private IDistributionChangeListener listener = null;  //  @jve:decl-index=0:
	public void addDistributionChangeListener(IDistributionChangeListener newLstener) {
		if (this.listener != null) throw new IllegalStateException("listener already added");
		this.listener = newLstener;
	}
	
	void fireDistributionChanged(IMuleDistribution newMuleDistribution) {
		if (listener != null) listener.distributionChanged(newMuleDistribution);		
	}

	public IMuleDistribution getChosenDistribution() {
		return selectedPath != null ? getDistribution(selectedPath) : null;
	}
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
