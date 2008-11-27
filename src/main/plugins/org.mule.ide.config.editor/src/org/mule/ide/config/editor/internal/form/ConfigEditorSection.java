package org.mule.ide.config.editor.internal.form;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.MuleType;

/**
 * 
 * Copied from org.eclipse.pde.internal.ui.editor.PDESection
 *
 */
public abstract class ConfigEditorSection extends SectionPart
    implements IAdaptable {

	private ConfigEditorFormPage fPage;
	
	protected ToolBarManager toolBarManager;

	public ConfigEditorSection(ConfigEditorFormPage page, Composite parent, int style) {
		super(parent, page.getManagedForm().getToolkit(), style);
		fPage = page;
		initialize(page.getManagedForm());
		getSection().clientVerticalSpacing = FormLayoutFactory.SECTION_HEADER_VERTICAL_SPACING;
		getSection().setData("part", this); //$NON-NLS-1$
		// Add a ToolBarManager to each section even though it may not be used
		// in order to have consistent look.
		createToolBarManager(getSection(), page.getManagedForm().getToolkit());
	}

	protected void createToolBarManager(Section section, FormToolkit toolkit) {
		toolBarManager = new ToolBarManager(SWT.FLAT);
		ToolBar toolbar = toolBarManager.createControl(section);
		final Cursor handCursor = new Cursor(Display.getCurrent(), SWT.CURSOR_HAND);
		toolbar.setCursor(handCursor);
		// Cursor needs to be explicitly disposed
		toolbar.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				if ((handCursor != null) &&
						(handCursor.isDisposed() == false)) {
					handCursor.dispose();
				}
			}
		});	
		
		section.setTextClient(toolbar);
	}

	protected abstract void createClient(Section section, FormToolkit toolkit);

	public ConfigEditorFormPage getPage() {
		return fPage;
	}

	public MuleType getMuleElement() {
		return fPage.getMuleElement();
	}

	public EditingDomain getEditingDomain() {
		return fPage.getEditingDomain();
	}
	
	public boolean doGlobalAction(String actionId) {
		return false;
	}

	// TODO
	//public void modelChanged(IModelChangedEvent e) {
	//	if (e.getChangeType() == IModelChangedEvent.WORLD_CHANGED)
	//		markStale();
	//}

	public void fireSaveNeeded() {
		markDirty();
		// TODO
		//if (getContextId() != null)
		//	getPage().getConfigEditor().fireSaveNeeded(getContextId(), false);
	}

	public boolean isEditable() {
		// getAggregateModel() can (though never should) return null
		// TODO
		//IBaseModel model = getPage().getPDEEditor().getAggregateModel();
		//return model == null ? false : model.isEditable();
		return true;
	}

	/**
	 * @param selection
	 * @return
	 */
	public boolean canCopy(ISelection selection) {
		// Sub-classes to override
		return false;
	}

	/**
	 * @param selection
	 * @return
	 */
	public boolean canCut(ISelection selection) {
		// Sub-classes to override
		return false;
	}	
	
	public boolean canPaste(Clipboard clipboard) {
		return false;
	}

	public void cancelEdit() {
		super.refresh();
	}

	public Object getAdapter(Class adapter) {
		return null;
	}
}
