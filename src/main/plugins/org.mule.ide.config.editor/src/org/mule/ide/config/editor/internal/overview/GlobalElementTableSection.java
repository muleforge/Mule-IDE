package org.mule.ide.config.editor.internal.overview;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Activator;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.actions.SortAction;
import org.mule.ide.config.editor.internal.elements.DefaultTableProvider;
import org.mule.ide.config.editor.internal.form.FormLayoutFactory;
import org.mule.ide.config.editor.internal.form.TablePart;
import org.mule.ide.config.editor.internal.form.TableSection;

/**
 * Derived from org.eclipse.pde.internal.ui.editor.plugin.RequiresSection
 */
public abstract class GlobalElementTableSection extends TableSection 
	implements IPropertyChangeListener {
	//implements IModelChangedListener, IPluginModelListener, IPropertyChangeListener {
    
	private static final int ADD_INDEX = 0;
    private static final int REMOVE_INDEX = 1;
    private static final int UP_INDEX = 2;
    private static final int DOWN_INDEX = 3;
    
    private static final String[] BUTTON_LABELS = 
    	{ Messages.TableSection_Add, Messages.TableSection_Remove, Messages.TableSection_Up, Messages.TableSection_Down };
    
	private TableViewer fViewer;
	private Action fAddAction;
	private Action fRemoveAction;
    private Action fSortAction;
    
    private int fInsertIndex;

	private EList<? extends EObject> fElements;
	private GlobalElementNotificationAdapter notificationAdapter;
	
	public GlobalElementTableSection(OverviewPage page, Composite parent, int style) {
		super(page, parent, style, BUTTON_LABELS);
		getTablePart().setEditable(false);
		resetInsertIndex();
	}

	public void createClient(Section section, FormToolkit toolkit) {
		Composite container = createClientContainer(section, 2, toolkit);
		createViewerPartControl(container, SWT.MULTI, 2, toolkit);
		TablePart tablePart = getTablePart();
		fViewer = tablePart.getTableViewer();

		fViewer.setContentProvider(getContentProvider());
		fViewer.setLabelProvider(Activator.getDefault().getOverviewLabelProvider());
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

	public boolean setInitialSelection() {
		if (!getSection().isExpanded()) {
			return false;
		}
        if (!getViewerSelection().isEmpty()) {
        	return true;
        }
    	Object firstElement = fViewer.getElementAt(0);
    	if (firstElement != null) {
    		fViewer.setSelection(new StructuredSelection(firstElement), true);
    		return true;
    	}
		return false;
	}
	
	protected IContentProvider getContentProvider() {
		return new GlobalElementsContentProvider();
	}
	
	protected TableViewer getViewer() {
		return fViewer;
	}
	
	private void createSectionToolbar(Section section, FormToolkit toolkit) {
		ToolBarManager toolBarManager = new ToolBarManager(SWT.FLAT);
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
		
		// Add sort action to the tool bar
		fSortAction = new SortAction(fViewer, 
				Messages.TableSection_SortAlpha, null, null, this);
		toolBarManager.add(fSortAction);
		
		toolBarManager.update(true);

		section.setTextClient(toolbar);
	}

	protected void selectionChanged(IStructuredSelection sel) {
		// Forward selection event to parent.
		((OverviewPage) getPage()).setSelection(sel);
		updateButtons();
	}
	
	private void updateButtons() {
		Table table = getTablePart().getTableViewer().getTable();
		TableItem[] selection = table.getSelection();
		boolean hasSelection = selection.length > 0;
		TablePart tablePart = getTablePart();
        tablePart.setButtonEnabled(ADD_INDEX, isEditable());
        updateUpDownButtons();
        tablePart.setButtonEnabled(REMOVE_INDEX, isEditable() && hasSelection);
	}
	
	private void updateUpDownButtons() {
		TablePart tablePart = getTablePart();
		if (fSortAction.isChecked()) {
			tablePart.setButtonEnabled(UP_INDEX, false);
			tablePart.setButtonEnabled(DOWN_INDEX, false);
			return;
		}
		Table table = getTablePart().getTableViewer().getTable();
		TableItem[] selection = table.getSelection();
		boolean hasSelection = selection.length > 0;
		boolean canMove = table.getItemCount() > 1 && selection.length == 1;
		
		tablePart.setButtonEnabled(
				UP_INDEX,
				canMove && isEditable() && hasSelection && table.getSelectionIndex() > 0);
		tablePart.setButtonEnabled(
				DOWN_INDEX,
				canMove
					&& hasSelection && isEditable()
					&& table.getSelectionIndex() < table.getItemCount() - 1);
	}

	protected void handleDoubleClick(IStructuredSelection sel) {
		//handleOpen(sel);
	}

	protected void buttonSelected(int index) {
		switch (index) {
			case ADD_INDEX:
				handleAdd();
				break;
            case REMOVE_INDEX:
                handleRemove();
                break;
 			case UP_INDEX:
				handleUp();
				break;
			case DOWN_INDEX:
				handleDown();
                break;
		} 
	}

	public void dispose() {
		if (fElements != null) {
			for (EObject element : fElements) {
				element.eAdapters().remove(getNotificationAdapter());
			}
		}
		fElements = null;
		super.dispose();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.editor.PDESection#doGlobalAction(java.lang.String)
	 */
	public boolean doGlobalAction(String actionId) {

		if (!isEditable()) { return false; }
		
		if (actionId.equals(ActionFactory.DELETE.getId())) {
			handleRemove();
			return true;
		}
		if (actionId.equals(ActionFactory.CUT.getId())) {
			// delete here and let the editor transfer
			// the selection to the clipboard
			handleRemove();
			return false;
		}
		if (actionId.equals(ActionFactory.PASTE.getId())) {
			doPaste();
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.editor.StructuredViewerSection#canPaste(java.lang.Object, java.lang.Object[])
	 */
	protected boolean canPaste(Object targetObject, Object[] sourceObjects) {
		// TODO
		return false;
		/*
		HashSet existingImportsSet = null;
		// Only import objects that are not already existing imports can be
		// pasted
	   	for (int i = 0; i < sourceObjects.length; i++) {
	   		// Only import objects allowed
			if ((sourceObjects[i] instanceof ImportObject) == false) {
				return false;
			}
			// Get the current import objects and store them for searching
			// purposes
			if (existingImportsSet == null) {
				existingImportsSet = 
					PluginSelectionDialog.getExistingImports(getModel(), false);
			}
			// Only import object that do not exist are allowed
			ImportObject importObject = (ImportObject)sourceObjects[i];
			if (existingImportsSet.contains(importObject.getImport().getId())) {
				return false;
			}
	   	}
		return true;
		*/
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.editor.StructuredViewerSection#doPaste(java.lang.Object, java.lang.Object[])
	 */
	protected void doPaste(Object targetObject, Object[] sourceObjects) {
		// TODO
		/*
		// Get the model
		IPluginModelBase model = getModel();
		IPluginBase pluginBase = model.getPluginBase();
		try {
			// Paste all source objects
			for (int i = 0; i < sourceObjects.length; i++) {
				Object sourceObject = sourceObjects[i];
				if (sourceObject instanceof ImportObject) {
					// Import object
					ImportObject importObject = (ImportObject) sourceObject;
					// Adjust all the source object transient field values to
					// acceptable values
					// TODO: MP: CCP: Remove unnecessary reconnected Plugin attributes
					// This may not be necessary.  The model object is discarded when
					// the import object wrapping the plugin import object is converted 
					// into a require bundle object					
					importObject.reconnect(model);
					// Add the import object to the plugin
					pluginBase.add(importObject.getImport());
				}
			}
		} catch (CoreException e) {
			PDEPlugin.logException(e);
		}
		*/
	}

	protected void fillContextMenu(IMenuManager manager) {
		ISelection selection = fViewer.getSelection();
		manager.add(fAddAction);
		manager.add(new Separator());
		getPage().contextMenuAboutToShow(manager);
		
		if (!selection.isEmpty())
			manager.add(fRemoveAction);
		
		//getPage().getConfigEditor().getContributor().contextMenuAboutToShow(
		//	manager);
		
		// TODO Show in Properties view
		
		//manager.add(new Separator());
        //if (fPropertiesAction != null && !fViewer.getSelection().isEmpty()) {
        //    manager.add(new Separator());
        //    manager.add(fPropertiesAction);
        //}
	}

	private void handleRemove() {
		IStructuredSelection selection = getViewerSelection();
		if (selection.isEmpty()) {
			return;
		}	
		handleRemove(selection.toList());
        updateButtons();
	}
	
	protected abstract void handleRemove(List elements);
	
	protected abstract void handleAdd();
	
	private void handleUp() {
		int index = getTablePart().getTableViewer().getTable().getSelectionIndex();
		if (index < 1)
			return;
		swap(index, index - 1);
	}
	
	private void handleDown() {
		Table table = getTablePart().getTableViewer().getTable();
		int index = table.getSelectionIndex();
		if (index == table.getItemCount() - 1)
			return;
		swap(index, index + 1);		
	}
	
	public void swap(int index1, int index2) {
		Table table = getTablePart().getTableViewer().getTable();
		// TODO
		/*
		IPluginImport dep1 = ((ImportObject)table.getItem(index1).getData()).getImport();
		IPluginImport dep2 = ((ImportObject)table.getItem(index2).getData()).getImport();

		try {
			IPluginModelBase model = (IPluginModelBase) getPage().getModel();
			IPluginBase pluginBase = model.getPluginBase();
			pluginBase.swap(dep1, dep2);
		} catch (CoreException e) {
			PDEPlugin.logException(e);
		}
		*/		
	}

	public void initialize() {
		MuleType mule = getMuleElement();
		fViewer.setInput(mule);
        updateButtons();
        addModelListener();
	}
	
	protected abstract void addModelListener();
    	
	private void makeActions() {
		fAddAction = new Action(Messages.TableSection_Add) { 
			public void run() {
				handleAdd();
			}
		};
		fRemoveAction = new Action(Messages.TableSection_Remove) { 
			public void run() {
				handleRemove();
		        updateButtons();
			}
		};
		/*
        if (isBundle()) {
            fPropertiesAction = new Action(Messages.RequiresSection_properties) { 
                public void run() {
                    handleOpenProperties();
                }
            };
        }
        */
	}
	
	public void refresh() {
		if (fElements != null) {
			for (EObject element : fElements) {
				element.eAdapters().remove(getNotificationAdapter());
			}
		}
		fElements = null;
		fViewer.refresh();
		super.refresh();
	}
	
	public void setFocus() {
		if (fViewer != null)
			fViewer.getTable().setFocus();
	}
	
	protected boolean createCount() { return true; }

	public void propertyChange(PropertyChangeEvent event) {
		if (fSortAction.equals(event.getSource()) && IAction.RESULT.equals(event.getProperty())) {
			updateUpDownButtons();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.editor.StructuredViewerSection#isDragAndDropEnabled()
	 */
	protected boolean isDragAndDropEnabled() {
		return false;
	}
	
    /* (non-Javadoc)
     * @see org.eclipse.pde.internal.ui.editor.StructuredViewerSection#canDragMove(java.lang.Object[])
     */
    public boolean canDragMove(Object[] sourceObjects) {
		if (validateDragMoveSanity(sourceObjects) == false) {
			return false;
		} else if (isTreeViewerSorted()) {
			return false;
		}
    	return true;
    }
    
    /**
     * @param sourceObjects
     * @return
     */
    private boolean validateDragMoveSanity(Object[] sourceObjects) {
    	// Validate source
		if (sourceObjects == null) {
			// No objects
			return false;
		} else if (sourceObjects.length != 1) {
			// Multiple selection not supported
			return false;
		//} else if ((sourceObjects[0] instanceof ImportObject) == false) {
		//	// Must be the right type
		//	return false;
		}    	
		return true;
    }    
	
	/**
	 * @param targetObject
	 * @param sourceObjects
	 * @return
	 */
	private boolean validateDropMoveSanity(Object targetObject, Object[] sourceObjects) {
		// Validate target object
		//if ((targetObject instanceof ImportObject) == false) {
		//	return false;
		//}
		// Validate source objects
		if (validateDragMoveSanity(sourceObjects) == false) {
			return false;
		}
		return true;
	}    
    
	/**
	 * @param sourceImportObject
	 * @param targetImportObject
	 * @return
	 */
	/*
	private boolean validateDropMoveModel(ImportObject sourceImportObject, ImportObject targetImportObject) {
		// Objects have to be from the same model
		IPluginModelBase sourceModel = sourceImportObject.getImport().getPluginModel();
		IPluginModelBase targetModel = targetImportObject.getImport().getPluginModel();	
		if (sourceModel.equals(targetModel) == false) {
			return false;
		} else if ((getModel().getPluginBase() instanceof BundlePluginBase) == false) {
			return false;
		}
		return true;
	}  	
	*/
	
    /* (non-Javadoc)
     * @see org.eclipse.pde.internal.ui.editor.StructuredViewerSection#canDropMove(java.lang.Object, java.lang.Object[], int)
     */
    public boolean canDropMove(Object targetObject, Object[] sourceObjects,
    		int targetLocation) {
		// Sanity check
		if (validateDropMoveSanity(targetObject, sourceObjects) == false) {
			return false;
		}
		// Multiple selection not supported
		/*
		ImportObject sourceImportObject = (ImportObject)sourceObjects[0];
		ImportObject targetImportObject = (ImportObject)targetObject;
		IPluginImport sourcePluginImport = sourceImportObject.getImport();
		IPluginImport targetPluginImport = targetImportObject.getImport();
		// Validate model
		if (validateDropMoveModel(sourceImportObject, targetImportObject) == false) {
			return false;
		}
		// Get the bundle plug-in base
		BundlePluginBase bundlePluginBase = (BundlePluginBase)getModel().getPluginBase();
		// Validate move
		if (targetLocation == ViewerDropAdapter.LOCATION_BEFORE) {
			// Get the previous import of the target 
			IPluginImport previousImport = 
				bundlePluginBase.getPreviousImport(targetPluginImport);
			// Ensure the previous element is not the source
			if (sourcePluginImport.equals(previousImport)) {
				return false;
			}
			return true;
		} else if (targetLocation == ViewerDropAdapter.LOCATION_AFTER) {
			// Get the next import of the target 
			IPluginImport nextImport = 
				bundlePluginBase.getNextImport(targetPluginImport);
			// Ensure the next import is not the source
			if (sourcePluginImport.equals(nextImport)) {
				return false;
			}
			return true;
		} else if (targetLocation == ViewerDropAdapter.LOCATION_ON) {
			// Not supported
			return false;
		}
		*/
    	return false;    	
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.pde.internal.ui.editor.StructuredViewerSection#doDropMove(java.lang.Object, java.lang.Object[], int)
     */
    public void doDropMove(Object targetObject, Object[] sourceObjects,
    		int targetLocation) {
		// Sanity check
		if (validateDropMoveSanity(targetObject, sourceObjects) == false) {
			Display.getDefault().beep();
			return;
		}
		/*
		// Multiple selection not supported
		ImportObject sourceImportObject = (ImportObject)sourceObjects[0];
		ImportObject targetImportObject = (ImportObject)targetObject;
		IPluginImport sourcePluginImport = sourceImportObject.getImport();
		IPluginImport targetPluginImport = targetImportObject.getImport();		
		// Validate move
		if ((targetLocation == ViewerDropAdapter.LOCATION_BEFORE) ||
				(targetLocation == ViewerDropAdapter.LOCATION_AFTER)) {
			// Do move
			doDropMove(sourceImportObject, sourcePluginImport,
					targetPluginImport, targetLocation);
		} else if (targetLocation == ViewerDropAdapter.LOCATION_ON) {
			// Not supported
		}
		*/
    }

	/**
	 * @param sourceImportObject
	 * @param sourcePluginImport
	 * @param targetPluginImport
	 * @param targetLocation
	 */
    /*
	private void doDropMove(ImportObject sourceImportObject,
			IPluginImport sourcePluginImport, IPluginImport targetPluginImport,
			int targetLocation) {
		// Remove the original source object
		// Normally we remove the original source object after inserting the
		// serialized source object; however, the imports are removed via ID
		// and having both objects with the same ID co-existing will confound
		// the remove operation
		doDragRemove();
		// Get the bundle plug-in base
		BundlePluginBase bundlePluginBase = (BundlePluginBase)getModel().getPluginBase();
		// Get the index of the target
		int index = bundlePluginBase.getIndexOf(targetPluginImport);
		// Ensure the target index was found
		if (index == -1) {
			return;
		}
		// Determine the location index
		int targetIndex = index;
		if (targetLocation == ViewerDropAdapter.LOCATION_AFTER) {
			targetIndex++;
		}
		// Adjust all the source object transient field values to
		// acceptable values
		sourceImportObject.reconnect(getModel());
		// Store index so that the import can be inserted properly into
		// the table viewer
		setEnpointInsertIndex(targetIndex);
		// Add source as sibling of target	
		bundlePluginBase.add(sourcePluginImport, targetIndex);	
		// Reset the index
		resetImportInsertIndex();
	}
	*/
    
    /**
     * 
     */
    private void resetInsertIndex() {
    	fInsertIndex = -1;
    }
    
    /**
     * @param index
     */
    private void setInsertIndex(int index) {
    	fInsertIndex = index;
    }
    
    /**
     * @return
     */
    private int getInsertIndex() {
    	return fInsertIndex;
    }

    /**
     * 
     */
    private void doDragRemove() {
    	/*
		// Get the bundle plug-in base
    	BundlePluginBase bundlePluginBase = (BundlePluginBase)getModel().getPluginBase();
		// Retrieve the original non-serialized source objects dragged initially
		Object[] sourceObjects = getDragSourceObjects();
		// Validate source objects
		if (validateDragMoveSanity(sourceObjects) == false) {
			return;
		}
		IPluginImport sourcePluginImport = 
			((ImportObject)sourceObjects[0]).getImport();
		try {
			bundlePluginBase.remove(sourcePluginImport);
		} catch (CoreException e) {
			PDEPlugin.logException(e);
		}    
		*/	
    }
    
	/**
	 * @return
	 */
	private boolean isTreeViewerSorted() {
		if (fSortAction == null) {
			return false;
		}
		return fSortAction.isChecked();
	}    

	protected abstract EList<? extends EObject> getGlobalElements();
	
	protected abstract GlobalElementNotificationAdapter createNotificationAdapter();
	
	protected GlobalElementNotificationAdapter getNotificationAdapter() {
		if (notificationAdapter == null) {
			notificationAdapter = createNotificationAdapter();
		}
		return notificationAdapter;
	}
	
	class GlobalElementsContentProvider extends DefaultTableProvider {
		public Object[] getElements(Object parent) {
			if (fElements == null) {
				fElements = getGlobalElements();
				for (EObject element : fElements) {
					element.eAdapters().add(getNotificationAdapter());
				}
			}
			return fElements.toArray();
		}
	}

	/**
	 * Provides notification handling for add/remove/change of mule child 
	 * substitution elements.
	 */
	protected abstract class GlobalElementNotificationAdapter extends AdapterImpl {
		public void notifyChanged(Notification msg) {
			int eventType = msg.getEventType();
			
			if (eventType == Notification.ADD) {
				Object feature = msg.getFeature();
				if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
			         FeatureMap.Entry entry = (FeatureMap.Entry) msg.getNewValue();
			         if (checkElementType(entry.getValue())) {
			        	 refresh();
			        	 return;
			         }
				}
			}

			if (eventType == Notification.REMOVE) {
				Object feature = msg.getFeature();
				if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
			         FeatureMap.Entry entry = (FeatureMap.Entry) msg.getOldValue();
			         if (checkElementType(entry.getValue())) {
			        	 refresh();
			        	 return;
			         }
				}
			}

			if (eventType == Notification.SET) {
				Object notifier = msg.getNotifier();
				if (checkElementType(notifier)) {
					getViewer().update(notifier, null);
					return;
				}
			}
		}

		protected abstract boolean checkElementType(Object object);
	}
}
