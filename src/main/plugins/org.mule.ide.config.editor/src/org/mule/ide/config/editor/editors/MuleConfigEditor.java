package org.mule.ide.config.editor.editors;


import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.eclipse.wst.xml.core.internal.provisional.contenttype.ContentTypeIdForXML;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Activator;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.overview.OverviewPage;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramEditor;
import org.mule.ide.config.editor.services.part.CoreDiagramEditorUtil;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.editor.services.part.ServicesEditorPlugin;

/**
 * 
 */
// See also PDEFormEditor for functionality that we may want to add.
public class MuleConfigEditor extends FormEditor implements IResourceChangeListener {

	public static final String ID = "org.mule.ide.config.editor.editors.MuleConfigEditor"; //$NON-NLS-1$
	
	private static final int OVERVIEW_PAGE_INDEX = 0;
	private static final int SERVICES_PAGE_INDEX = 1;
	private static final int SOURCE_PAGE_INDEX = 2;
	
	private StructuredTextEditor xmlEditor;
	
	// Editor for model element content, may be null.
	private CoreDiagramEditor servicesEditor;
	
	private TransactionalEditingDomain editingDomain;
	private ResourceSet resourceSet;
	private DocumentRoot documentRoot;

	/**
	 * Mule configuration file editor
	 */
	public MuleConfigEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	@Override
	protected void addPages() {
        try {
			createOverviewPage();
			createServicesPage();
			createSourcePage();
		} catch (PartInitException e) {
			Activator.getDefault().logError(
					"Error creating editor page", e);			
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating editor page",
				null,
				e.getStatus());
			return;
		}
		if (servicesEditor != null) {
			setActiveEditor(servicesEditor);
		}
	}
	
	/**
	 * Creates the overview page
	 */
	void createOverviewPage() throws PartInitException {
		addPage(new OverviewPage(this), null);
	}
	
	/**
	 * Creates the services editor page.
	 */
	void createServicesPage() throws PartInitException {
    	final IFile sourceFile = ((FileEditorInput) getEditorInput()).getFile();
    	final IFile diagramFile = getServicesDiagramFile(sourceFile);
    	if (! diagramFile.exists()) {
    		 try {
    			 WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
    				 protected void execute(IProgressMonitor monitor)
    							throws InvocationTargetException, CoreException, InterruptedException {
    					 generateServicesDiagramFile(sourceFile, diagramFile, monitor);
    				 }
    			 };
    			 getSite().getWorkbenchWindow().run(true, true, op);
    		 } catch (InvocationTargetException e) {
    			 Activator.getDefault().logError(
    					 "Failed to initialze services diagram file: "+diagramFile, e);			
    			 return;
    		 } catch (InterruptedException e) {
    			 Activator.getDefault().logError(
    					 "Failed to initialze services diagram file: "+diagramFile, e);			
    			 return;
    		 }
    	}
    	servicesEditor = new CoreDiagramEditor();
    	FileEditorInput diagramEditorInput = new FileEditorInput(diagramFile);
    	int index = addPage(servicesEditor, diagramEditorInput);
    	setPageText(index, "Services");
	}
	
	/**
	 * Creates an xml source editor page.
	 */
	void createSourcePage() throws PartInitException {
		xmlEditor = new StructuredTextEditor();  
		xmlEditor.setEditorPart(this);
		int index = addPage(xmlEditor, getEditorInput());
		setPageText(index, "Source");
	}
	
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	
	/**
	 * 
	 */
	public void doSave(IProgressMonitor monitor) {
		IEditorPart activeEditor = getActiveEditor();
		if (activeEditor != null) {
			// TODO temporarily, only perform save on active page's editor
			activeEditor.doSave(monitor);
		}
	}
	
	public void doSaveAs() {
		// TODO handle multi file saveas
		//IEditorPart editor = getActiveEditor();
		//editor.doSaveAs();
		//setInput(editor.getEditorInput());
	}
	
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(SOURCE_PAGE_INDEX);
		IDE.gotoMarker(getEditor(SOURCE_PAGE_INDEX), marker);
	}
	
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		
		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.mule.ide.config.editor.services.EditingDomain");
		
		setPartName(editorInput.getName());
		
    	IFile sourceFile = ((FileEditorInput) editorInput).getFile();
		URI domainModelURI = 
			URI.createPlatformResourceURI(sourceFile.getFullPath().toString(), true);
		resourceSet = editingDomain.getResourceSet();
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			documentRoot = (DocumentRoot) resource.getContents().get(0);
		} catch (WrappedException ex) {
			throw new PartInitException("Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		if (documentRoot == null) {
			throw new PartInitException("Unable to load resource: " + domainModelURI); //$NON-NLS-1$
		}
		
		super.init(site, editorInput);
	}
	
	public MuleType getMuleElement() {
		return documentRoot.getMule();
	}
	
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)xmlEditor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(xmlEditor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
	}

	/**
	 * @see org.eclipse.ui.part.MultiPageEditorPart#createSite(org.eclipse.ui.IEditorPart)
	 */
	protected IEditorSite createSite(IEditorPart page) {
		IEditorSite site = null;
		if (page == xmlEditor) {
			site = new MultiPageEditorSite(this, page) {
				public String getId() {
					// Sets this ID so nested editor is configured for XML source
					return ContentTypeIdForXML.ContentTypeID_XML + ".source"; //$NON-NLS-1$;
				}
			};
		}
		else {
			site = super.createSite(page);
		}
		return site;
	}
	
	/**
	 * The services diagram file is stored under the project .settings directory.
	 * 
	 * @param sourceFile  the mule config file
	 * @return IFile
	 */
	public static IFile getServicesDiagramFile(IFile sourceFile) {
    	IPath sourceFullPath = sourceFile.getFullPath();
    	String relativePathString = sourceFullPath.lastSegment();
    	relativePathString = relativePathString.replace(".xml", ".services_diagram");
    	IProject project = sourceFile.getProject();
    	IFile diagramFile = project.getFile(".settings/org.mule.ide.config.editor/services_diagram/"+relativePathString);
		return diagramFile;
	}

	/**
	 * Initializes a new services diagram file based on the content of an existing
	 * mule configuration file.
	 * 
	 * @param sourceFile Source mule configuration file
	 * @param diagramFile  Services diagram file location to use
	 * @param monitor
	 * @throws CoreException
	 */
	public void generateServicesDiagramFile(IFile sourceFile, IFile diagramFile, IProgressMonitor monitor) 
			throws InvocationTargetException, CoreException {
		EObject muleElement = (EObject) documentRoot.eGet(CorePackage.eINSTANCE.getDocumentRoot_Mule());
		if (muleElement == null) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Configuration file has no <mule> element."));			
		}
		EList modelElementList = (EList) muleElement.eGet(CorePackage.eINSTANCE.getDocumentRoot_Model());
		final EObject modelElement;
		if (modelElementList.size() > 0) {
			// TODO handle multiple model elements.  For now just use the first one.
			modelElement = (EObject) modelElementList.get(0);
		} else {
			// TODO No model element should not be an error condition
			throw new InvocationTargetException(new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Configuration file has no <model> element.")));			
		}
		try {
			CreateFileOperation op = new CreateFileOperation(diagramFile,
					null, null,
					Messages.NewDiagramFile_CreateDiagramFile);
			IStatus result = OperationHistoryFactory.getOperationHistory().
				execute(op, monitor, WorkspaceUndoUtil.getUIInfoAdapter(getSite().getShell()));
			if (! result.isOK()) {
				throw new CoreException(result);				
			}
		} catch (ExecutionException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error creating services diagram file", e));			
		}
		CoreDiagramEditorUtil.setCharset(diagramFile);
		List affectedFiles = new LinkedList();
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.NewDiagramFile_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				int diagramVID = CoreVisualIDRegistry
						.getDiagramVisualID(modelElement);
				if (diagramVID != DefaultModelTypeEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult(Messages.NewDiagramFile_IncorrectRootError);
				}
				Diagram diagram = ViewService.createDiagram(
						modelElement,
						DefaultModelTypeEditPart.MODEL_ID,
						ServicesEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			IStatus result = OperationHistoryFactory.getOperationHistory().
				execute(command, monitor, WorkspaceUndoUtil.getUIInfoAdapter(getSite().getShell()));
			if (! result.isOK()) {
				throw new CoreException(result);				
			}
			diagramResource.save(CoreDiagramEditorUtil.getSaveOptions());
		} catch (ExecutionException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error saving services diagram file", e));			
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error saving services diagram file", e));			
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.FormEditor#createToolkit(org.eclipse.swt.widgets.Display)
	 */
	@Override
	protected FormToolkit createToolkit(Display display) {
		// Create a toolkit that shares colors between editors.
		return new FormToolkit(Activator.getDefault().getFormColors(display));
	}

	public void contributeToToolbar(IToolBarManager manager) {
	}	

	/*  TODO need to revisit:  when an OverviewPage section widget called setSelection here,
	 * getSite().getSelectionProvider().setSelection() caused an infinite loop. 
	public void setSelection(ISelection selection) {
		getSite().getSelectionProvider().setSelection(selection);
		getContributor().updateSelectableActions(selection);
	}
	
	public ISelection getSelection() {
		return getSite().getSelectionProvider().getSelection();
	}
	
	public MuleConfigEditorContributor getContributor() {
		return (MuleConfigEditorContributor) getEditorSite().getActionBarContributor();
	}
	*/
	
}