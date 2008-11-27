/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
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
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.internal.runtime.MuleClasspathInitializer;
import org.mule.ide.project.internal.util.MuleClasspathUtils;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleRuntimeChooserPanel extends Composite {

	private Group groupDistribution = null;
	private Group groupModule = null;
	private Button radioUseDefault = null;
	private Button radioSpecifyDistribution = null;
	private Combo comboDistribution = null;
	private Link linkPrefs = null;
	private Table tableLibraries = null;
	private TableViewer tableViewerLibraries = null;
	private boolean omitModuleSelection = false;

	private Button buttonSelectAll = null;
	private Button buttonDeSelectAll = null;

	IMuleBundle[] allLibraries = null;
	//String distributions[] = new String[] { };  //  @jve:decl-index=0:
	//int selectedDistribution = -1, defaultDistribution = -1;
	
	String selectedPath = null;
	
	public MuleRuntimeChooserPanel(Composite parent, int style, boolean omitModuleSelection) {
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
		initialize(null);
	}
	
	/*
	 * null newPath indicates no distributions available.
	 */
	private void setDistributionSelection(String newPath) {
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
				IMuleRuntime dist = MulePreferences.getMuleRuntime(selectedPath);
				fireDistributionChanged(dist);  // distribution changed
				return;
			}
		}
		
		// TODO:  Throw error if no match found?
	}
	
	private void resetBundleTable(IMuleRuntime newDist) {
		Collection<IMuleBundle> oldSel = getLibrarySelection();
		initializeBundleTable(newDist);
		
		// Convert to pathified name strings, and try to match in the new runtime.
		ArrayList<String> oldSelStrings = new ArrayList<String>(oldSel.size());
		for (IMuleBundle bundle :  oldSel) {
			oldSelStrings.add(bundle.getPathifiedName());
		}
		setLibrarySelection(oldSelStrings);
	}

	private void initializeBundleTable(IMuleRuntime runtime) {
		tableViewerLibraries.setInput(runtime);
	}
	
	private void setLibrarySelection(Collection<String> selectionToSet) {
		int itemCount = tableLibraries.getItemCount();
		for (int i = 0; i < itemCount; ++i) {
			TableItem item = tableLibraries.getItem(i);
			if (selectionToSet.contains(allLibraries[i].getPathifiedName())) {
				item.setChecked(true);
			} else {
				item.setChecked(false);				
			}
		}
	}

	private String pathify(String hint) {
		return MuleClasspathInitializer.pathify(hint);
	}

	public void initialize(IPath originalPath) {
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
		
		String[] distributions = MulePreferences.getDistributionPaths();
		
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
			setDistributionSelection(MulePreferences.getDefaultDistributionPath());
		} else {
			setDistributionSelection(hint);
		}
		
		if (! omitModuleSelection) {
			initializeBundleTable(getRuntime());
			setLibrarySelection(MuleClasspathUtils.commaStringToSet(bundleSelectString));
			
			if (listener == null) addDistributionChangeListener(new IDistributionChangeListener() {
				public void distributionChanged(IMuleRuntime newDist) {
					resetBundleTable(newDist);
				}
			});
		}
	}
	
	public Collection<IMuleBundle> getLibrarySelection() {
		ArrayList<IMuleBundle> selection = new ArrayList<IMuleBundle>();
		if (tableLibraries != null) {
			int itemCount = tableLibraries.getItemCount();
			for (int i = 0; i < itemCount; ++i) {
				TableItem item = tableLibraries.getItem(i);
				if (item.getChecked()) {
					selection.add(allLibraries[i]);
				}
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
		groupDistribution.setText("&Mule distribution");
		groupDistribution.setLayoutData(gdGroup);
		groupDistribution.setLayout(layoutGroup);
		
		GridData gdUseDefault = new GridData();
		gdUseDefault.grabExcessHorizontalSpace = false;
		radioUseDefault = new Button(groupDistribution, SWT.RADIO);
		radioUseDefault.setText("&Use default Mule distribution");
		radioUseDefault.setLayoutData(gdUseDefault);
		radioUseDefault.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				if (radioUseDefault.getSelection()) {
					// Set the combo to display the default path
					comboDistribution.setEnabled(false);
					setDistributionSelection(MulePreferences.getDefaultDistributionPath());
				}
			}
		});		
		
		GridData gdPrefs = new GridData();
		gdPrefs.horizontalAlignment = org.eclipse.swt.layout.GridData.END;
		linkPrefs = new Link(groupDistribution, SWT.NONE);
		linkPrefs.setText("<a>Configure Default...</a>");
		linkPrefs.setLayoutData(gdPrefs);
		linkPrefs.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				PreferencesUtil.createPreferenceDialogOn(getShell(), MulePreferences.MULE_PREFERENCES_ID, null, null).open();
				if (radioUseDefault.getSelection()) {
					reset(null, MuleClasspathUtils.collectionToCommaString(getLibrarySelection()));
				} else {
					// If specified, try to reselect the previously selected path
					reset(selectedPath, MuleClasspathUtils.collectionToCommaString(getLibrarySelection()));
				}
			}
		});
		
		GridData gdSpecify = new GridData();
		gdSpecify.horizontalSpan = 2;
		radioSpecifyDistribution = new Button(groupDistribution, SWT.RADIO);
		radioSpecifyDistribution.setText("Use a project &specific Mule distribution:");
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
		tableViewerLibraries = new TableViewer(groupModule, SWT.BORDER | SWT.CHECK);
		tableViewerLibraries.setContentProvider(new ArrayContentProvider() {
		    public Object[] getElements(Object inputElement) {
		    	IMuleRuntime runtime = (IMuleRuntime) inputElement;
		    	Collection<IMuleBundle> libs = runtime.getMuleLibraries();
		    	allLibraries = libs.toArray(new IMuleBundle[libs.size()]);
		    	return allLibraries;
		    }			
		});
		tableViewerLibraries.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				IMuleBundle bundle = (IMuleBundle) element;
				File f = bundle.getFile();
				StringBuffer buf = new StringBuffer(f.getName());
				buf.append("    [lib");
				buf.append(File.separatorChar);
				buf.append(f.getParentFile().getName());
				buf.append("]");
				return buf.toString();
			}			
		});
		tableLibraries = tableViewerLibraries.getTable();
		tableLibraries.setHeaderVisible(false);
		tableLibraries.setToolTipText("Check the modules and transport to include in the Mule classpath for this project");
		tableLibraries.setLayoutData(gridData1);
		tableLibraries.setLinesVisible(false);
		buttonDeSelectAll = new Button(groupModule, SWT.NONE);
		buttonDeSelectAll.setText("Select &All");
		buttonDeSelectAll.setLayoutData(gridData3);
		buttonDeSelectAll
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						for (int i=0; i < tableLibraries.getItemCount(); ++i ) {
							tableLibraries.getItem(i).setChecked(true);
						}
					}
				});
		buttonSelectAll = new Button(groupModule, SWT.NONE);
		buttonSelectAll.setText("&Deselect All");
		buttonSelectAll.setLayoutData(gridData4);
		buttonSelectAll
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						for (int i=0; i < tableLibraries.getItemCount(); ++i ) {
							tableLibraries.getItem(i).setChecked(false);
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

	public boolean useDefaultDistribution() {
		return radioUseDefault.getSelection();
	}

	public interface IDistributionChangeListener {
		/**
		 * 
		 * @param newDistribution  New distribution.  Null if there
		 * was a previously selected distribution and now there are
		 * none available.
		 */
		void distributionChanged(IMuleRuntime newDistribution);
	}	
	
	private IDistributionChangeListener listener = null;  //  @jve:decl-index=0:
	public void addDistributionChangeListener(IDistributionChangeListener newLstener) {
		if (this.listener != null) throw new IllegalStateException("listener already added");
		this.listener = newLstener;
	}
	
	void fireDistributionChanged(IMuleRuntime newMuleDistribution) {
		if (listener != null) listener.distributionChanged(newMuleDistribution);		
	}

	/**
	 * Returns a string suitable for using as the runtime identifier
	 * for a mule classpath container.
	 * 
	 * @return null if default runtime should be used, or none available.
	 */
	public String getRuntimeHint() {
		if (radioUseDefault.getSelection()) return null;
		return pathify(selectedPath);
	}
	
	/**
	 * 
	 */
	public IMuleRuntime getRuntime() {
		return selectedPath != null ? MulePreferences.getMuleRuntime(selectedPath) : null;
	}
	
	public void setReadOnly(boolean readOnly) {
		if (readOnly) {
			radioUseDefault.setEnabled(false);
			radioSpecifyDistribution.setEnabled(false);
			comboDistribution.setEnabled(false);
		}
	}
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
