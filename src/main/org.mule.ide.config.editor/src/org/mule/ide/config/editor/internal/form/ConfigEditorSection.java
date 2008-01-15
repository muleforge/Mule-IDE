package org.mule.ide.config.editor.internal.form;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * 
 * Copied from org.eclipse.pde.internal.ui.editor.PDESection
 *
 */
public abstract class ConfigEditorSection extends SectionPart
    // TODO
	// implements IModelChangedListener, IContextPart, IAdaptable {
    implements IAdaptable {

	private ConfigEditorFormPage fPage;

	public ConfigEditorSection(ConfigEditorFormPage page, Composite parent, int style) {
		this(page, parent, style, true);
	}

	public ConfigEditorSection(ConfigEditorFormPage page, Composite parent, int style, boolean titleBar) {
		super(parent, page.getManagedForm().getToolkit(),
				titleBar ? (ExpandableComposite.TITLE_BAR | style) : style);
		fPage = page;
		initialize(page.getManagedForm());
		getSection().clientVerticalSpacing = FormLayoutFactory.SECTION_HEADER_VERTICAL_SPACING;
		getSection().setData("part", this); //$NON-NLS-1$
	}

	protected abstract void createClient(Section section, FormToolkit toolkit);

	public ConfigEditorFormPage getPage() {
		return fPage;
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
