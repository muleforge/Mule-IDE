package org.mule.ide.config.editor.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.mule.ide.config.editor.Activator;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.editors.MuleConfigEditor;

/**
 * 
 */
public class MuleConfigNewWizard extends Wizard implements INewWizard {

	/**
	 * 
	 */
	private IWorkbench workbench;

	/**
	 * 
	 */
	protected IStructuredSelection selection;

	/**
	 * 
	 */
	protected MuleConfigNewWizardPage domainModelFilePage;

	/**
	 * 
	 */
	private boolean openNewlyCreatedDiagramEditor = true;
	
	private IFile newFile = null;

	/**
	 * 
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * 
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * 
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * 
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * 
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.NewFileWizard_Title);
		setDefaultPageImageDescriptor(Activator
				.getBundledImageDescriptor("icons/wizban/NewConfigWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * 
	 */
	public void addPages() {
		domainModelFilePage = new MuleConfigNewWizardPage(
				"DomainModelFile", getSelection(), "xml"); //$NON-NLS-1$ //$NON-NLS-2$
		domainModelFilePage
				.setTitle(Messages.NewFileWizard_FilePageTitle);
		domainModelFilePage
				.setDescription(Messages.NewFileWizard_FilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * 
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				monitor.beginTask("Creating " + domainModelFilePage.getFileName(), 2);
				newFile = domainModelFilePage.createNewFile();
				monitor.worked(1);
				if (isOpenNewlyCreatedDiagramEditor() && newFile != null) {
					monitor.setTaskName("Opening file ...");
					getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							IWorkbenchPage page =
								PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
							try {
								page.openEditor(new FileEditorInput(newFile), MuleConfigEditor.ID);
							} catch (PartInitException e) {
								ErrorDialog.openError(getContainer().getShell(),
										Messages.NewFileWizard_OpenEditorError,
										null, e.getStatus());
							}
						}
					});
					monitor.worked(1);
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.NewFileWizard_Error, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				Activator.getDefault().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return newFile != null;
	}

}
