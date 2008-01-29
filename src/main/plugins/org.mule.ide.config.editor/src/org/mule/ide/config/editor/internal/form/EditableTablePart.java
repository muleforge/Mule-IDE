package org.mule.ide.config.editor.internal.form;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * 
 * Copied from org.eclipse.pde.internal.ui.parts.EditableTablePart
 *
 */
public class EditableTablePart extends TablePart {
	private boolean editable;
	private Action renameAction;
	
	// TODO
	/*
	class RenameAction extends Action {
		public RenameAction() {
			super(PDEUIMessages.EditableTablePart_renameAction); 
		}
		public void run() {
			doRename();
		}
	}
	*/

	class NameModifier implements ICellModifier {
		public boolean canModify(Object object, String property) {
			return true;
		}
		public void modify(Object object, String property, Object value) {
			entryModified(object, value.toString());
		}
		public Object getValue(Object object, String property) {
			return object.toString();
		}
	}
	/**
	 * Constructor for EditableTablePart.
	 * @param buttonLabels
	 */
	public EditableTablePart(String[] buttonLabels) {
		super(buttonLabels);
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	// TODO
	/*
	public IAction getRenameAction() {
		if (renameAction==null) renameAction = new RenameAction();
		return renameAction;
	}
	*/

	protected StructuredViewer createStructuredViewer(
		Composite parent,
		int style,
		FormToolkit toolkit) {
		TableViewer tableViewer =
			(TableViewer) super.createStructuredViewer(parent, style, toolkit);
		return tableViewer;
	}

	// TOD
	/*
	private void doRename() {
		TableViewer viewer = getTableViewer();
		IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();
		if (selection.size()==1 && isEditable()) {
			Object obj = selection.getFirstElement();
			String oldName = obj.toString();
			RenameDialog dialog = new RenameDialog(getControl().getShell(), oldName);
			dialog.create();
			dialog.getShell().setText(PDEUIMessages.EditableTablePart_renameTitle); 
			dialog.getShell().setSize(300, 150);
			if (dialog.open() == Window.OK) {
				entryModified(obj, dialog.getNewName());
			}
		}
	}
	*/
	
	protected void entryModified(Object entry, String value) {
	}
}