package org.mule.ide.config.editor.editors;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorStatusCodes;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.l10n.EditorMessages;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.DeleteResourcesOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.eclipse.wst.xml.core.internal.provisional.contenttype.ContentTypeIdForXML;
import org.mule.ide.config.common.SyncResource;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.SedaModelType;
import org.mule.ide.config.editor.Activator;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.overview.OverviewPage;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramEditor;
import org.mule.ide.config.editor.services.part.CoreDiagramEditorUtil;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.editor.services.part.ServicesEditorPlugin;
import org.mule.ide.config.editor.services.part.ServicesPaletteManager;

/**
 * 
 */
// See also PDEFormEditor for functionality that we may want to add.
// TODO: implement IDiagramWorkbenchPart to turn on the ModelingAssitant. 
// Need to customize the current modeling assistant suggestions first.
public class MuleConfigEditor extends FormEditor 
	implements IResourceChangeListener, ISaveablePart2 {  

	public static final String ID = "org.mule.ide.config.editor.editors.MuleConfigEditor"; //$NON-NLS-1$
	
	private static final int OVERVIEW_PAGE_INDEX = 0;
	private static final int SERVICES_PAGE_INDEX = 1;
	private static final int SOURCE_PAGE_INDEX = 2;
	
	private StructuredTextEditor xmlEditor;
	
	// Editor for model element content, may be null.
	// TODO support multiple model elements in a config file.
	private CoreDiagramEditor servicesEditor;
	private IFile servicesDiagramFile;
	
	private TransactionalEditingDomain editingDomain;
	private ResourceSet resourceSet;
	private DocumentRoot documentRoot;

	// We may want to change how this is done, but for now maintain
	// a model dirty flag here by listening over entire mule element for
	// edit notifications.
	private boolean isModelDirty;
	private boolean isDiagramDirtyOnClose = false;
	
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
			createServicesPages();
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
	 * Creates services editor pages.
	 */
	void createServicesPages() {
    	final IFile sourceFile = ((IFileEditorInput) getEditorInput()).getFile();
        try {
    		EList<AbstractModelType> modelElementList = getMuleElement().getAbstractModel();
    		// TODO handle multiple model elements.  Create a Sevices page for each model.  For now just use the first one.
    		int modelIndex = 0;
			for (AbstractModelType model : modelElementList) {
				if (model instanceof SedaModelType) {
					servicesDiagramFile = getServicesDiagramFile(sourceFile, modelIndex);
			        createServicesPage(sourceFile, servicesDiagramFile, (SedaModelType) model, modelIndex+1);
					modelIndex++;
					break; // bail after the first one.
				}
			}
		} catch (PartInitException e) {
			servicesDiagramFile = null;
			Activator.getDefault().logError(
					"Error adding Services editor page", e);			
			ErrorDialog.openError(
				getSite().getShell(),
				"Error adding Services editor page",
				null,
				e.getStatus());
			return;
		}
	}
		
	/**
	 * Creates a services editor page.
	 */
	void createServicesPage(final IFile sourceFile, final IFile diagramFile, 
			final SedaModelType modelElement, int pageIndex) throws PartInitException {
    	if (servicesEditor != null) {
    		return;
    	}
		// TODO need to add handling of an existing but corrupted diagram file
		// that can result from a previous attempt to open a file and the 
    	// modelElement is set to be a proxy.
		if (! diagramFile.exists()) {
    		 try {
    			 WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
    				 protected void execute(IProgressMonitor monitor)
    							throws InvocationTargetException, CoreException, InterruptedException {
    					 createServicesDiagramFile(sourceFile, diagramFile, modelElement, monitor);
    				 }
    			 };
    			 getSite().getWorkbenchWindow().run(true, true, op);
    		 } catch (InvocationTargetException e) {
    			 String msg = "Error initializing Services editor.  Error creating services diagram file: "+diagramFile;
    			 throw new PartInitException(msg, e);
    		 } catch (InterruptedException e) {
    			 String msg = "Error initializing Services editor.  Error creating services diagram file: "+diagramFile;
    			 throw new PartInitException(msg, e);
    		 }
    	}
    	// Hack to turn off unloading of resources by the serviceEditor's CoreDocumentProvider.
    	// We currently remove the Services page when the <model> element is deleted in
    	// source, the page remove triggers a dispose in CoreDocumentProvider which unloads
    	// all resources in the resource set including the config file's resource which
    	// we are still using.
    	// Ultimately, should implement a version of DocumentProvider that works with our
    	// multi-page config editor.
    	ServicesEditorPlugin.getInstance().getDocumentProvider().setDoResourceUnload(false);
    	servicesEditor = new CoreDiagramEditor(this);
    	servicesEditor.setPaletteManager(new ServicesPaletteManager(documentRoot));
    	FileEditorInput diagramEditorInput = new FileEditorInput(diagramFile);
    	addPage(pageIndex, servicesEditor, diagramEditorInput);
    	setPageText(pageIndex, "Services");
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
	
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		if (pages.get(newPageIndex) == servicesEditor) {
			servicesEditor.updatePalette();
		}
	}
	
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);		
		//TODO check if there are other listeners to remove to prevent leaks...
		
		super.dispose();

		// We're turning off resource unloading in the servicesEditor's CoreDocumentProvider
        // so we need to do it ourselves.
		// See ServicesEditorPlugin.getInstance().getDocumentProvider().setDoResourceUnload(false);
		for (Iterator it = resourceSet.getResources().iterator(); it.hasNext();) {
			Resource resource = (Resource) it.next();
			resource.unload();
		}
	}
	
	public boolean isDirty() {
		if (xmlEditor.isDirty()) {
			return true;
		}
		return isModelDirty || isDiagramDirtyOnClose;
	}

    public boolean isSaveOnCloseNeeded() {
    	if (isDirty()) {
    		return true;
    	}
    	if (servicesEditor != null && servicesEditor.isDiagramDirty()) {
    		// Even after this call is made, SaveableHelper calls isDirty()
    		// to double check that the file is dirty.  So need make isDirty()
    		// return true while closing.
    		// TODO Optimize the save on close such that the EMF model isn't saved unnecessarily.
    		isDiagramDirtyOnClose = true;
    		return true;
    	}
        return false;
    }

    /**
	 * 
	 */
	public void doSave(IProgressMonitor monitor) {
		// SyncResourceImpl intercepts the EMF model save and calls save 
		// on the XML model unless the SAVE_OPTION_SUPRESS_TEXT_SAVE option is set.
		if (servicesEditor != null) {
			// Services editor saves both the config file and the diagram
			// visual information.
			servicesEditor.doSave(monitor);
		} else {
			doSaveConfigurationFile(monitor);
		}
		setModelDirty(false);
	}
	
	// Taken from CoreDocumentProvider.doSaveDocument()
	private void doSaveConfigurationFile(IProgressMonitor monitor) {
		List resources = resourceSet.getResources();
		try {
			monitor.beginTask(
					Messages.SaveConfigurationFileTask,
					resources.size() + 1);
			for (Iterator it = resources.iterator(); it.hasNext();) {
				Resource nextResource = (Resource) it.next();
				monitor.setTaskName(NLS.bind(
						Messages.SaveNextResourceTask,
						nextResource.getURI()));
				if (nextResource.isLoaded()
						&& !editingDomain.isReadOnly(nextResource)) {
					try {
						nextResource.save(CoreDiagramEditorUtil
								.getSaveOptions());
					} catch (IOException e) {
						//fireElementStateChangeFailed(element);
						
						// TODO could add a retry mechanism, see DiagramDocumentEditor.handleExceptionOnSave()
						IStatus status = new Status(IStatus.ERROR,
								ServicesEditorPlugin.ID,
								EditorStatusCodes.RESOURCE_FAILURE, e
										.getLocalizedMessage(), null);
						String title= EditorMessages.Editor_error_save_title;
						String msg= EditorMessages.Editor_error_save_message;
						Shell shell= getSite().getShell();
						ErrorDialog.openError(shell, title, msg, status);
					}
				}
				monitor.worked(1);
			}
			monitor.done();
			//info.setModificationStamp(computeModificationStamp(info));
		} catch (RuntimeException x) {
			//fireElementStateChangeFailed(element);
			throw x;
		} finally {
			//info.startResourceListening();
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
		
    	final IFile sourceFile = ((FileEditorInput) editorInput).getFile();
		final URI domainModelURI = 
			URI.createPlatformResourceURI(sourceFile.getFullPath().toString(), true);
		resourceSet = editingDomain.getResourceSet();
		Resource resource = resourceSet.getResource(domainModelURI, true);
		documentRoot = (DocumentRoot) resource.getContents().get(0);
		if (documentRoot == null) {
			throw new PartInitException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open in the Mule Configuration Editor.  Unrecognized file type."));
		}
		MuleType muleElement = documentRoot.getMule();
		if (muleElement == null) {
			throw new PartInitException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open in the Mule Configuration Editor.  Must have <mule> root element."));			
		}
		
		// TODO  if the user replaces the mule element into the source editor, we
		// need handle completely reinitializing
		
		try {
			if (resource instanceof SyncResource) {
				SyncResource syncResource = (SyncResource) resource;
				syncResource.setModelUpdateExecutor(new Executor() {
					
					public void execute(final Runnable toRun) {
						AbstractTransactionalCommand command = new AbstractTransactionalCommand(
								editingDomain,
								"XML Editing",
								Collections.singletonList(sourceFile)) {
							protected CommandResult doExecuteWithResult(
									IProgressMonitor monitor, IAdaptable info)
									throws ExecutionException {
								toRun.run();
								return CommandResult.newOKCommandResult();
							}
						};
						try {
							OperationHistoryFactory.getOperationHistory().execute(command,
									null, null);
						} catch (ExecutionException e) {
							ServicesEditorPlugin.getInstance().logError(
									"Unable to synchronize XML changes into domain model", e); //$NON-NLS-1$
						}					
					}
				});
			}
		} catch (WrappedException ex) {
			throw new PartInitException("Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		
		initializeConnections();
		initializeDirtyListener();
		initializeServicesListener();
		
		super.init(site, editorInput);
	}

    private void setModelDirty(boolean dirty) {
    	isModelDirty = dirty;
        firePropertyChange(IEditorPart.PROP_DIRTY);
    }
    
	private void initializeDirtyListener() {
		isModelDirty = false;
		
		// Need to listen at the DocumentRoot level to pick up namespace
		// changes, e.g. DocumentRoot.getXMLNSPrefixMap()
		documentRoot.eAdapters().add(new EContentAdapter() {
		    public void notifyChanged(Notification n) {
		    	if (! isModelDirty) {
			    	int eventType = n.getEventType();
			    	if (eventType == Notification.SET
			    			|| eventType == Notification.UNSET
			    			|| eventType == Notification.ADD
			    			|| eventType == Notification.REMOVE
			    			|| eventType == Notification.ADD_MANY
			    			|| eventType == Notification.REMOVE_MANY
			    			|| eventType == Notification.MOVE) {
			    		setModelDirty(true);
			    	}
		    	}
		    	super.notifyChanged(n);
		    }
		});
	}

	public int promptToSaveOnClose() {
		// Needed to implement this so that we can have silent save of the
		// diagram model on close.
		if (isDiagramDirtyOnClose) {
			return ISaveablePart2.YES;
		} else {
			return ISaveablePart2.DEFAULT;
		}
	}	

	private void initializeConnections() {
		MuleType mule = documentRoot.getMule();
		if (mule == null) return;  // Listen for a mule element to be added?
		
		/*
		Adapter modelListener = new AdapterImpl() {
			public boolean isAdapterForType(Object type) {
				return (type == MuleConfigEditor.class);
			}	
			public void notifyChanged(Notification msg) {
				if (msg.getEventType() == Notification.ADD) {
					Object feature = msg.getFeature();
					if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
				         FeatureMap.Entry entry = (FeatureMap.Entry) msg.getNewValue();
				         if (entry.getValue() instanceof SedaModelType) {
				        	 ((SedaModelType) entry.getValue()).initializeConnections();
				         }
					}
				}
			}
		};
		mule.eAdapters().add(modelListener);
		*/
		
		EList<AbstractModelType> models = mule.getAbstractModel();
		for (AbstractModelType model : models) {
			if (model instanceof SedaModelType) {
				((SedaModelType) model).initializeConnections(editingDomain);
			}
		}
	}
	
	/*
	 * Listen for add/remove of <model> elements.
	 * Create/Remove Services pages.
	 */
	private void initializeServicesListener() {
		MuleType mule = getMuleElement();
		mule.eAdapters().add(new AdapterImpl() {
			public void notifyChanged(Notification msg)
			{
				int eventType = msg.getEventType();
				if (eventType == Notification.ADD) {
					Object feature = msg.getFeature();
					if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
						FeatureMap.Entry entry = (FeatureMap.Entry) msg.getNewValue();
						if (checkElementType(entry.getValue())) {
							final SedaModelType model = (SedaModelType) entry.getValue();
							/*
							if (servicesEditor == null) {
								Display.getDefault().asyncExec(new Runnable() {

									public void run() {
										if (servicesEditor == null) {
											int modelIndex = 0;
									    	IFile sourceFile = ((IFileEditorInput) getEditorInput()).getFile();
											servicesDiagramFile = getServicesDiagramFile(sourceFile, modelIndex);
											try {
												createServicesPage(sourceFile, servicesDiagramFile, model, modelIndex+1);
											} catch (PartInitException e) {
												Activator.getDefault().logError("Error adding model element to diagram.", e);												
											}
										}
									}
									
								});
							}
							*/
						}
					}
				}
				  
				if (eventType == Notification.REMOVE) {
					Object feature = msg.getFeature();
					if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
						FeatureMap.Entry entry = (FeatureMap.Entry) msg.getOldValue();
						if (checkElementType(entry.getValue())) {
							if (servicesEditor != null) {
								EObject diagramElement = servicesEditor.getDiagramEditPart().getDiagramView().getElement();
								if (diagramElement == entry.getValue()) {
									removeServicesPage();
								}
							}
						}
					}
				}
			}
			  
			private boolean checkElementType(Object object) {
				return (object instanceof SedaModelType);
			}
		});
		
	}
	
	private void removeServicesPage() {
		removePage(1);
		servicesEditor = null;
		/*  Probably would be more efficient to just delete the diagram
		 *  element instead of wacking the whole file, but I haven't been
		 *  able to get the editor to reinitialize from an existing file
		 *  if a model element is added back.
		try {
			clearDiagramElement();
		} catch (CoreException e) {
			Activator.getDefault().logError("Error deleting model element from diagram.", e);
		}
		*/
		WorkspaceJob job = new WorkspaceJob("foo") {

			@Override
			public IStatus runInWorkspace(
					IProgressMonitor monitor)
					throws CoreException {
				deleteServicesDiagramFile(servicesDiagramFile, monitor);
				return Status.OK_STATUS;
			}
			
		};
		// Maybe should set a rule, but probably don't need one.
		job.schedule();
		/*
		 try {
			 WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
				 protected void execute(IProgressMonitor monitor)
							throws InvocationTargetException, CoreException, InterruptedException {
					 deleteServicesDiagramFile(servicesDiagramFile, monitor);
				 }
			 };
			 getSite().getWorkbenchWindow().run(true, true, op);
		 } catch (InvocationTargetException e) {
			 Activator.getDefault().logError("Error deleting services diagram file: "+servicesDiagramFile, e);
		 } catch (InterruptedException e) {
			 Activator.getDefault().logError("Error deleting services diagram file: "+servicesDiagramFile, e);
		 }
		 */		
	}
	
	public MuleType getMuleElement() {
		return documentRoot.getMule();
	}
	
	public DocumentRoot getDocumentRoot() {
		return documentRoot;
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
						if(((IFileEditorInput)xmlEditor.getEditorInput()).getFile().getProject().equals(event.getResource())){
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
		} if (page == servicesEditor) {
			site = new MultiPageEditorSite(this, page) {
				public String getId() {
					// Needed to make the palette extension work.
					return CoreDiagramEditor.ID;
				}
			};
		} else {
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
	public static IFile getServicesDiagramFile(IFile sourceFile, int modelIndex) {
		// Add an index suffix to the generated services diagram file,
		//  <project>/.settings/services_diagram/<relative_path>/<config_file_name>_0.services_diagram
		// so that eventually multiple model diagrams could be supported.
    	String relativePathString = sourceFile.getProjectRelativePath().toString();
    	if (relativePathString.endsWith(".xml")) {
    		relativePathString = relativePathString.substring(0, relativePathString.length() - ".xml".length());
    	}
    	relativePathString = relativePathString+"_"+modelIndex+".services_diagram";
    	IProject project = sourceFile.getProject();
    	IFile diagramFile = project.getFile(".settings/org.mule.ide.config.editor/services_diagram/"+relativePathString);
		return diagramFile;
	}

	/**
	 * Initializes a new services diagram file.
	 * 
	 * @param sourceFile Source mule configuration file
	 * @param diagramFile  Services diagram file location to use
	 * @param monitor
	 * @throws CoreException
	 */
	public void createServicesDiagramFile(IFile sourceFile, IFile diagramFile, final SedaModelType modelElement, IProgressMonitor monitor) 
			throws InvocationTargetException, CoreException {
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
		List<IFile> affectedFiles = new LinkedList<IFile>();
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		// Resource may already have an entry in the resource set, 
		// but no file on disk.
		Resource temp = resourceSet.getResource(diagramModelURI, false);
		if (temp == null) {
			temp = resourceSet.createResource(diagramModelURI);
		}
		final Resource diagramResource = temp;
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
				if (modelElement.eIsProxy()) {
					System.out.println("is proxy!?!?");
				}
				Diagram diagram = ViewService.createDiagram(
						modelElement,
						DefaultModelTypeEditPart.MODEL_ID,
						ServicesEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram == null) {
					return CommandResult.newErrorCommandResult("Error creating Diagram for model element");
				}
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
	
	private void deleteServicesDiagramFile(IFile diagramFile, IProgressMonitor monitor) 
			throws CoreException {
		try {
			DeleteResourcesOperation op = new DeleteResourcesOperation(new IResource[] {diagramFile},
					Messages.NewDiagramFile_CreateDiagramFile, true);
			IStatus result = OperationHistoryFactory.getOperationHistory().
				execute(op, monitor, WorkspaceUndoUtil.getUIInfoAdapter(getSite().getShell()));
			if (! result.isOK()) {
				throw new CoreException(result);				
			}
		} catch (ExecutionException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error deleting services diagram file", e));			
		}
		Resource diagramResource = getDiagramResource();
		diagramResource.unload();
	}
	
	/*
	private void setDiagramElement(final Resource diagramResource, final SedaModelType modelElement, IProgressMonitor monitor) throws CoreException {
		List<IFile> affectedFiles = new LinkedList<IFile>();
		affectedFiles.add(servicesDiagramFile);
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
	*/
	
	/*
	private void clearDiagramElement() throws CoreException {
		if (servicesDiagramFile == null || !servicesDiagramFile.exists()) {
			return;
		}
		List<IFile> affectedFiles = new LinkedList<IFile>();
		affectedFiles.add(servicesDiagramFile);
		final Resource diagramResource = getDiagramResource();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.NewDiagramFile_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				if (diagramResource.getContents().size() > 0) {
					diagramResource.getContents().remove(0);
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			IStatus result = OperationHistoryFactory.getOperationHistory().
				execute(command, new NullProgressMonitor(), WorkspaceUndoUtil.getUIInfoAdapter(getSite().getShell()));
			if (! result.isOK()) {
				throw new CoreException(result);				
			}
			diagramResource.save(CoreDiagramEditorUtil.getSaveOptions());
			diagramResource.unload();
		} catch (ExecutionException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error saving services diagram file", e));			
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error saving services diagram file", e));			
		}		
	}
	*/
		
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
	
	private Resource getDiagramResource() {
		URI diagramModelURI = URI.createPlatformResourceURI(servicesDiagramFile
				.getFullPath().toString(), true);
		return resourceSet.getResource(diagramModelURI, true);
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
