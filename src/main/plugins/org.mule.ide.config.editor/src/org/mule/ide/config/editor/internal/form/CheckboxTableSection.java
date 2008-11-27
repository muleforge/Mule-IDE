package org.mule.ide.config.editor.internal.form;

import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Activator;

public abstract class CheckboxTableSection extends StructuredViewerSection {

	private CheckboxTableViewer fViewer;
	
	protected class PartAdapter extends CheckboxTablePart {
		public PartAdapter(String[] buttonLabels) {
			super(buttonLabels);
		}
		public void selectionChanged(IStructuredSelection selection) {
			getManagedForm().fireSelectionChanged(CheckboxTableSection.this, selection);
			CheckboxTableSection.this.selectionChanged(selection);
		}
		protected void elementChecked(Object element, boolean checked) {
			CheckboxTableSection.this.elementChecked(element, checked);
		}	
	}
	
	public CheckboxTableSection(ConfigEditorFormPage formPage, Composite parent, int style, String[] buttonLabels) {
		super(formPage, parent, style, buttonLabels);
	}
	
	@Override
	protected StructuredViewerPart createViewerPart(String[] buttonLabels) {
		return new PartAdapter(buttonLabels);
	}

	@Override
	protected void createClient(Section section, FormToolkit toolkit) {
		Composite container = createClientContainer(section, 2, toolkit);
		createViewerPartControl(container, SWT.MULTI, 2, toolkit);
		CheckboxTablePart tablePart = getTablePart();
		fViewer = tablePart.getTableViewer();

		fViewer.setContentProvider(createContentProvider());
		fViewer.setLabelProvider(getLabelProvider());
		toolkit.paintBordersFor(container);
		makeActions();
		section.setClient(container);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.minimumWidth = 250;
		gd.grabExcessVerticalSpace = true;
		section.setLayout(FormLayoutFactory.createClearGridLayout(false, 1));
		section.setLayoutData(gd);
		createSectionToolbar(section, toolkit);
		initialize();
	}

	/**
	 * Set input on viewer and initialize any model listeners.
	 * 
	 * @param fViewer
	 */
	protected abstract void initialize();
	
	public CheckboxTableViewer getTableViewer() {
		return fViewer;
	}
	
	public void uncheckAll() {
		fViewer.setCheckedElements(new Object[0]);
	}

	protected CheckboxTablePart getTablePart() {
		return (CheckboxTablePart) fViewerPart;
	}

	protected void expansionStateChanging(boolean expanding) {
		if (!expanding) {
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			getSection().setLayoutData(gd);
		} else {
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.grabExcessVerticalSpace = true;
			getSection().setLayoutData(gd);
		}

		super.expansionStateChanging(expanding);
	}

	protected void makeActions() {
	}
	
	protected void createSectionToolbar(Section section, FormToolkit toolkit) {
	}
	
	protected abstract IContentProvider createContentProvider();
	
	protected abstract ITableLabelProvider getLabelProvider();

	protected void selectionChanged(IStructuredSelection selection) {
	}

	protected void elementChecked(Object element, boolean checked) {
	}
}
