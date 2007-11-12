/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * MULE_LICENSE.txt file.
 */

package org.mule.ide.config.mulemodel.presentation.util;

import java.util.EventObject;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.wst.sse.ui.StructuredTextEditor;

public abstract class CommonMultiPageEditor extends MultiPageEditorPart implements IResourceChangeListener, IPropertyListener
{
  public static int SOURCE_PAGE_INDEX = 1;
  public static int DESIGN_PAGE_INDEX = 0;
  
  protected IContentOutlinePage fOutlinePage;
  protected StructuredTextEditor structuredTextEditor;
  protected CommonSelectionManager selectionProvider;
  
    public CommonMultiPageEditor()
  {
    super();
  }

  /* (non-Javadoc)
   * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor#getContributorId()
   */
  public abstract String getContributorId();
  
  
  /**
   * 
   */
  protected abstract void createActions();
  
  /* (non-Javadoc)
   * @see org.eclipse.ui.part.MultiPageEditorPart#createPages()
   */
  protected void createPages()
  {

  }

  /* (non-Javadoc)
   * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
   */
  public void doSave(IProgressMonitor monitor)
  {
//    getEditor(1).doSave(monitor); 
    structuredTextEditor.doSave(monitor);
  }

  /* (non-Javadoc)
   * @see org.eclipse.ui.part.EditorPart#doSaveAs()
   */
  public void doSaveAs()
  {
    IEditorPart editor = getEditor(1);
//    editor.doSaveAs();
    structuredTextEditor.doSaveAs();
    setInput(structuredTextEditor.getEditorInput());
    setPartName(editor.getTitle());
  }

  /* (non-Javadoc)
   * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
   */
  public boolean isSaveAsAllowed()
  {
    return true;
  }

  /* (non-Javadoc)
   * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org.eclipse.core.resources.IResourceChangeEvent)
   * 
   * Closes all project files on project close.
   */
  public void resourceChanged(final IResourceChangeEvent event)
  {
    if (event.getType() == IResourceChangeEvent.PRE_CLOSE)
    {
      Display.getDefault().asyncExec(new Runnable()
      {
        public void run()
        {
          IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
          for (int i = 0; i < pages.length; i++)
          {
            if (((FileEditorInput) structuredTextEditor.getEditorInput()).getFile().getProject().equals(event.getResource()))
            {
              IEditorPart editorPart = pages[i].findEditor(structuredTextEditor.getEditorInput());
              pages[i].closeEditor(editorPart, true);
            }
          }
        }
      });
    }
  }

  /* (non-Javadoc)
   * @see org.eclipse.gef.commands.CommandStackListener#commandStackChanged(java.util.EventObject)
   */
  public void commandStackChanged(EventObject event)
  {
    firePropertyChange(PROP_DIRTY);
  }
  
  /**
   * Indicates that a property has changed.
   * 
   * @param source
   *          the object whose property has changed
   * @param propId
   *          the id of the property which has changed; property ids are
   *          generally defined as constants on the source class
   */
  public void propertyChanged(Object source, int propId)
  {
    switch (propId)
    {
      // had to implement input changed "listener" so that
      // strucutedText could tell it containing editor that
      // the input has change, when a 'resource moved' event is
      // found.
      case IEditorPart.PROP_INPUT :
      case IEditorPart.PROP_DIRTY : {
        if (source == structuredTextEditor)
        {
          if (structuredTextEditor.getEditorInput() != getEditorInput())
          {
            setInput(structuredTextEditor.getEditorInput());
            // title should always change when input changes.
            // create runnable for following post call
            Runnable runnable = new Runnable()
            {
              public void run()
              {
                _firePropertyChange(IWorkbenchPart.PROP_TITLE);
              }
            };
            // Update is just to post things on the display queue
            // (thread). We have to do this to get the dirty
            // property to get updated after other things on the
            // queue are executed.
            postOnDisplayQue(runnable);
          }
        }
        break;
      }
      case IWorkbenchPart.PROP_TITLE : {
        // update the input if the title is changed
        if (source == structuredTextEditor)
        {
          if (structuredTextEditor.getEditorInput() != getEditorInput())
          {
            setInput(structuredTextEditor.getEditorInput());
          }
        }
        break;
      }
      default : {
        // propagate changes. Is this needed? Answer: Yes.
        if (source == structuredTextEditor)
        {
          firePropertyChange(propId);
        }
        break;
      }
    }
  }

  public CommonSelectionManager getSelectionManager()
  {
    if (selectionProvider == null)
    {
      selectionProvider = new CommonSelectionManager(this);
    }
    return selectionProvider;
  }
  
  /*
   * This method is just to make firePropertyChanged accessbible from some
   * (anonomous) inner classes.
   */
  protected void _firePropertyChange(int property)
  {
    super.firePropertyChange(property);
  }
  
  /**
   * Posts the update code "behind" the running operation.
   */
  protected void postOnDisplayQue(Runnable runnable)
  {
    IWorkbench workbench = PlatformUI.getWorkbench();
    IWorkbenchWindow[] windows = workbench.getWorkbenchWindows();
    if (windows != null && windows.length > 0)
    {
      Display display = windows[0].getShell().getDisplay();
      display.asyncExec(runnable);
    }
    else
      runnable.run();
  }

  /**
   * The <code>MultiPageEditorPart</code> implementation of this
   * <code>IWorkbenchPart</code> method disposes all nested editors.
   * Subclasses may extend.
   */
  public void dispose()
  {
    ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    
    if (structuredTextEditor != null) {
      structuredTextEditor.removePropertyListener(this);
    }
    structuredTextEditor = null;
    fOutlinePage = null;
    selectionProvider = null;
    
    super.dispose();
  }

  /*
   * (non-Javadoc) Method declared on IEditorPart
   */
  public void gotoMarker(IMarker marker)
  {
    setActivePage(0);
    IDE.gotoMarker(getEditor(0), marker);
  }

  /**
   * The <code>MultiPageEditorExample</code> implementation of this method
   * checks that the input is an instance of <code>IFileEditorInput</code>.
   */
  public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException
  {
//    if (!(editorInput instanceof IFileEditorInput))
//      throw new PartInitException("Invalid Input: Must be IFileEditorInput"); //$NON-NLS-1$
    super.init(site, editorInput);
    
    initializeActionRegistry();
    
    String title = null;
    if (getEditorInput() != null) {
      title = getEditorInput().getName();
    }
    setPartName(title);
  }

  protected void initializeActionRegistry()
  {
    createActions();
  }
  
   public Object getAdapter(Class type)
  {
//    if (type == CommandStack.class)
//      return getCommandStack();
//    if (type == ActionRegistry.class)
//      return getActionRegistry();
    
    return super.getAdapter(type);
  }

  public StructuredTextEditor getTextEditor()
  {
    return structuredTextEditor;
  }
 
  
  protected Composite createGraphPageComposite()
  {
    Composite parent = new Composite(getContainer(), SWT.NONE);    
    parent.setLayout(new FillLayout());
    return parent;
  }
  
  protected void createTreePage()
  {
    Composite parent = createGraphPageComposite();
    
    
    configureGraphicalViewer();
    hookGraphicalViewer();    
    int index = addPage(parent);
    setPageText(index, Messages._UI_LABEL_DESIGN);
  }

  protected void createSourcePage()
  {
    structuredTextEditor = new StructuredTextEditor();
    try
    {
      int index = addPage(structuredTextEditor, getEditorInput());
      setPageText(index, Messages._UI_LABEL_SOURCE);
      structuredTextEditor.update();
      structuredTextEditor.setEditorPart(this);
      structuredTextEditor.addPropertyListener(this);
      firePropertyChange(PROP_TITLE);
    }
    catch (PartInitException e)
    {
      ErrorDialog.openError(getSite().getShell(), "Error creating nested text editor", null, e.getStatus()); //$NON-NLS-1$
    }
  }
  
  protected void hookGraphicalViewer()
  {
  }    
  
  protected abstract void configureGraphicalViewer();
}
