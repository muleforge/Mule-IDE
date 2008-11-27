package org.mule.ide.config.editor.internal.form;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.forms.AbstractFormPart;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.editors.MuleConfigEditor;

/**
 * Copied from pde internal class org.eclipse.pde.internal.ui.editor.PDEFormPage
 * 
 * Forwards selection events from contained sections.
 */
public abstract class ConfigEditorFormPage extends FormPage 
		implements ISelectionProvider {

	private boolean fNewStyleHeader=true;
	private Control fLastFocusControl;
	
	private boolean fStale;

	private ArrayList<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	//private IContentOutlinePage contentOutlinePage;
	private ISelection currentSelection;

	public ConfigEditorFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		fLastFocusControl = null;
		fStale = false;
	}

	public ConfigEditorFormPage(FormEditor editor, String id, String title, boolean newStyleHeader) {
		this(editor, id, title);
		fNewStyleHeader = newStyleHeader;
	}

	/**
	 * 
	 */
	protected void markStale() {
		fStale = true;
	}
	
	/**
	 * @return
	 */
	protected boolean isStale() {
		return fStale;
	}
	
	/**
	 * 
	 */
	protected void refresh() {
		fStale = false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormPage#setActive(boolean)
	 */
	public void setActive(boolean active) {
		super.setActive(active);
		if (active && isStale()) {
			refresh();
		}
	}	
	
	public void dispose() {
		Control c = getPartControl();
		if (c!=null && !c.isDisposed()) {
			Menu menu = c.getMenu();
			if (menu!=null)
				resetMenu(menu, c);
		}
		super.dispose();
	}
	
	private void resetMenu(Menu menu, Control c) {
		if (c instanceof Composite) {
			Composite comp = (Composite)c;
			Control [] children = comp.getChildren();
			for (int i=0; i<children.length; i++) {
				resetMenu(menu, children[i]);
			}
		}
		Menu cmenu = c.getMenu();
		if (cmenu!=null && cmenu.equals(menu)) {
			c.setMenu(null);
		}
	}

	protected void createFormContent(IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		//FormColors colors = toolkit.getColors();
		//form.getForm().setSeparatorColor(colors.getColor(FormColors.TB_BORDER));
		if (fNewStyleHeader) {
			//createNewStyleHeader(form, colors);
			toolkit.decorateFormHeading(form.getForm());
		}

		// TODO
		/*
		IToolBarManager manager = form.getToolBarManager();
		
		getConfigEditor().contributeToToolbar(manager);
		
		final String href = getHelpResource();
		if (href != null) {
			Action helpAction = new Action("help") { //$NON-NLS-1$
				public void run() {
					BusyIndicator.showWhile(form.getDisplay(), new Runnable() {
						public void run() {
							PlatformUI.getWorkbench().getHelpSystem().displayHelpResource(href);
						}
					});
				}
			};
			helpAction.setToolTipText(PDEUIMessages.PDEFormPage_help); 
			helpAction.setImageDescriptor(PDEPluginImages.DESC_HELP);
			manager.add(helpAction);
		}
		*/
		
		//check to see if our form parts are contributing actions
		IFormPart[] parts = managedForm.getParts();
		for(int i = 0; i < parts.length; i++) {
			if(parts[i] instanceof IAdaptable) {
				IAdaptable adapter = (IAdaptable) parts[i];
				IAction[] actions = 
					(IAction[]) adapter.getAdapter(IAction[].class);
				if(actions != null) {
					for(int j = 0; j < actions.length; j++) {
						form.getToolBarManager().add(actions[j]);
					}
				}
			}
		}
		form.updateToolBar();
	}

	public MuleConfigEditor getConfigEditor() {
		return (MuleConfigEditor) getEditor();
	}
	
	protected String getHelpResource() {
		return null;
	}
	
	public MuleType getMuleElement() {
		return getConfigEditor().getMuleElement();
	}
	
	public EditingDomain getEditingDomain() {
		return getConfigEditor().getEditingDomain();
	}
	
	public void contextMenuAboutToShow(IMenuManager menu) {
	}

	protected Control getFocusControl() {
		IManagedForm form = getManagedForm();
		if (form == null)
			return null;
		Control control = form.getForm();
		if (control == null || control.isDisposed())
			return null;
		Display display = control.getDisplay();
		Control focusControl = display.getFocusControl();
		if (focusControl == null || focusControl.isDisposed())
			return null;
		return focusControl;
	}
	
	/*
	public boolean performGlobalAction(String actionId) {
		Control focusControl = getFocusControl();
		if (focusControl == null)
			return false;

		if (canPerformDirectly(actionId, focusControl))
			return true;
		AbstractFormPart focusPart = getFocusSection();
		if (focusPart!=null) {
			if (focusPart instanceof PDESection)
				return ((PDESection)focusPart).doGlobalAction(actionId);
			if (focusPart instanceof PDEDetails)
				return ((PDEDetails)focusPart).doGlobalAction(actionId);
		}
		return false;
	}
	*/

	/*
	public boolean canPaste(Clipboard clipboard) {
		AbstractFormPart focusPart = getFocusSection();
		if (focusPart != null) {
			if (focusPart instanceof PDESection) {
				return ((PDESection)focusPart).canPaste(clipboard);
			}
			if (focusPart instanceof PDEDetails) {
				return ((PDEDetails)focusPart).canPaste(clipboard);
			}
		}
		return false;
	}
	*/

	/**
	 * @param selection
	 * @return
	 */
	/*
	public boolean canCopy(ISelection selection) {
		AbstractFormPart focusPart = getFocusSection();
		if (focusPart != null) {
			if (focusPart instanceof PDESection) {
				return ((PDESection)focusPart).canCopy(selection);
			}
			if (focusPart instanceof PDEDetails) {
				return ((PDEDetails)focusPart).canCopy(selection);
			}
		}
		return false;		
	}
	*/
	
	/**
	 * @param selection
	 * @return
	 */
	/*
	public boolean canCut(ISelection selection) {
		AbstractFormPart focusPart = getFocusSection();
		if (focusPart != null) {
			if (focusPart instanceof PDESection) {
				return ((PDESection)focusPart).canCut(selection);
			}
			if (focusPart instanceof PDEDetails) {
				return ((PDEDetails)focusPart).canCut(selection);
			}
		}
		return false;		
	}
	*/	
	
	private AbstractFormPart getFocusSection() {
		Control focusControl = getFocusControl();
		if (focusControl == null)
			return null;
		Composite parent = focusControl.getParent();
		AbstractFormPart targetPart = null;
		while (parent != null) {
			Object data = parent.getData("part"); //$NON-NLS-1$
			if (data != null && data instanceof AbstractFormPart) {
				targetPart = (AbstractFormPart) data;
				break;
			}
			parent = parent.getParent();
		}
		return targetPart;
	}

	protected boolean canPerformDirectly(String id, Control control) {
		if (control instanceof Text) {
			Text text = (Text) control;
			if (id.equals(ActionFactory.CUT.getId())) {
				text.cut();
				return true;
			}
			if (id.equals(ActionFactory.COPY.getId())) {
				text.copy();
				return true;
			}
			if (id.equals(ActionFactory.PASTE.getId())) {
				text.paste();
				return true;
			}
			if (id.equals(ActionFactory.SELECT_ALL.getId())) {
				text.selectAll();
				return true;
			}
			if (id.equals(ActionFactory.DELETE.getId())) {
				int count = text.getSelectionCount();
				if (count == 0) {
					int caretPos = text.getCaretPosition();
					text.setSelection(caretPos, caretPos + 1);
				}
				text.insert(""); //$NON-NLS-1$
				return true;
			}
		}
		return false;
	}	
	
	/*
	public void cancelEdit() {
		IFormPart [] parts = getManagedForm().getParts();
		for (int i=0; i<parts.length; i++) {
			IFormPart part = parts[i];
			if (part instanceof IContextPart)
				((IContextPart)part).cancelEdit();
		}
	}
	*/
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormPage#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		// Dynamically add focus listeners to all the forms children in order
		// to track the last focus control
		IManagedForm managedForm = getManagedForm();
		if (managedForm != null) {
			addLastFocusListeners(managedForm.getForm());
		}
	}
	
	/**
	 * Programatically and recursively add focus listeners to the specified
	 * composite and its children that track the last control to have focus 
	 * before a page change or the editor lost focus
	 * 
	 * @param composite
	 */
	public void addLastFocusListeners(Composite composite) {
		Control[] controls = composite.getChildren();
		for (int i = 0; i < controls.length; i++) {
			Control control = controls[i];
			// Add a focus listener if the control is any one of the below types
			// Note that the controls listed below represent all the controls
			// currently in use by all form pages in PDE.  In the future,
			// more controls will have to be added.
			// Could not add super class categories of controls because it 
			// would include things like tool bars that we don't want to track
			// focus for.
			if ((control instanceof Text) ||
					(control instanceof Button) ||
					(control instanceof Combo) || 
					(control instanceof CCombo) ||
					(control instanceof Tree) ||
					(control instanceof Table) ||
					(control instanceof Spinner) ||
					(control instanceof Link) ||
					(control instanceof List) ||
					(control instanceof TabFolder) ||
					(control instanceof CTabFolder) ||
					(control instanceof Hyperlink) ||
					(control instanceof FilteredTree)
					) {
				addLastFocusListener(control);
			}
			if (control instanceof Composite) {
				// Recursively add focus listeners to this composites children
				addLastFocusListeners((Composite)control);
			}
		}
	}
	
	/**
	 * Add a focus listener to the specified control that tracks the last 
	 * control to have focus on this page.
	 * When focus is gained by this control, it registers itself as the last
	 * control to have focus.  The last control to have focus is stored in order
	 * to be restored after a page change or editor loses focus.
	 * 
	 * @param control
	 */
	private void addLastFocusListener(final Control control) {
		control.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				// NO-OP
			}
			public void focusLost(FocusEvent e) {
				fLastFocusControl = control;
			}
		});
	}
	
	/**
	 * Set the focus on the last control to have focus before a page change
	 * or the editor lost focus.
	 */
	public void updateFormSelection() {
		if ((fLastFocusControl != null) && 
				(fLastFocusControl.isDisposed() == false)) {
			// Set focus on the control
			fLastFocusControl.setFocus();
			// If the control is a Text widget, select its contents
			if (fLastFocusControl instanceof Text) {
				Text text = (Text)fLastFocusControl;
				text.setSelection(0, text.getText().length());
			}
		} else {
			// No focus control set
			// Fallback on managed form selection mechanism by setting the 
			// focus on this page itself.
			// The managed form will set focus on the first managed part.
			// Most likely this will turn out to be a section.
			// In order for this to work properly, we must override the 
			// sections setFocus() method and set focus on a child control
			// (preferrably first) that can practically take focus.
			setFocus();
		}
	}
	
	/**
	 * @return
	 */
	public Control getLastFocusControl() {
		return fLastFocusControl;
	}
	
	/**
	 * @param control
	 */
	public void setLastFocusControl(Control control) {
		fLastFocusControl = control;
	}
	
	/**
	 * @param managedForm
	 * @param errorTitle
	 * @param errorMessage
	 */
	protected void createFormErrorContent(IManagedForm managedForm,
			String errorTitle, String errorMessage) {
		createFormErrorContent(managedForm, errorTitle, errorMessage, null);
	}
	
	/**
	 * @param managedForm
	 * @param errorTitle
	 * @param errorMessage
	 * @param e
	 */
	protected void createFormErrorContent(IManagedForm managedForm,
			String errorTitle, String errorMessage, Exception e) {
		
		ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		//FormColors colors = toolkit.getColors();
		//form.getForm().setSeparatorColor(colors.getColor(FormColors.TB_BORDER));
		if (fNewStyleHeader) {
			//createNewStyleHeader(form, colors);
			toolkit.decorateFormHeading(form.getForm());
		}

		Composite parent = form.getBody();
		GridLayout layout = new GridLayout();
		GridData data2 = new GridData(GridData.FILL_BOTH);
		layout.marginWidth = 7;
		layout.marginHeight = 7;
		parent.setLayout(layout);
		parent.setLayoutData(data2);
		// Set the title and image of the form
		form.setText(errorTitle);
        form.setImage(JFaceResources.getImage(Dialog.DLG_IMG_MESSAGE_ERROR));
        
        int sectionStyle = Section.DESCRIPTION | ExpandableComposite.TITLE_BAR;
        // Create the message section
        Section messageSection = createUISection(parent, Messages.ConfigEditorFormPage_TitleMessage, 
        		errorMessage, sectionStyle);
        Composite messageClient = createUISectionContainer(messageSection, 1);
        // Bind the widgets
		toolkit.paintBordersFor(messageClient);
		messageSection.setClient(messageClient);			
		// Ensure the exception was defined
		if (e == null) {
			return;
		}
		// Create the details section
        Section detailsSection = createUISection(parent, Messages.ConfigEditorFormPage_TitleDetails, 
        		e.getMessage(), sectionStyle);
        Composite detailsClient = createUISectionContainer(detailsSection, 1);
		// Create text widget holding the exception trace
		int style = SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.READ_ONLY;		
		Text text = toolkit.createText(detailsClient, getStackTrace(e), style); 
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.heightHint = 160;
		data.widthHint  = 200;
		text.setLayoutData(data);
        // Bind the widgets
		toolkit.paintBordersFor(detailsClient);
		detailsSection.setClient(detailsClient);
		// Note: The veritical scrollbar fails to appear when text widget is
		// not entirely shown
	}

	/**
	 * @param parent
	 * @param text
	 * @param description
	 * @param style
	 * @return
	 */
	public Section createUISection(Composite parent, String text,
			String description, int style) {
		Section section = 
			getManagedForm().getToolkit().createSection(parent, style);
		section.clientVerticalSpacing = FormLayoutFactory.SECTION_HEADER_VERTICAL_SPACING;
		section.setLayout(FormLayoutFactory.createClearGridLayout(false, 1));
		section.setText(text);
		section.setDescription(description);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		section.setLayoutData(data);
		return section;
	}
	
	/**
	 * @param parent
	 * @param columns
	 * @return
	 */
	public Composite createUISectionContainer(Composite parent, int columns) {
		Composite container = getManagedForm().getToolkit().createComposite(parent);
		container.setLayout(FormLayoutFactory.createSectionClientGridLayout(false, columns));
		return container;		
	}
	
    /**
     * @param throwable
     * @return
     */
    public String getStackTrace(Throwable throwable) {
        StringWriter swriter = new StringWriter();
        PrintWriter pwriter = new PrintWriter(swriter);
        throwable.printStackTrace(pwriter);
        pwriter.flush();
        pwriter.close();
        return swriter.toString();
    }
	
	/**
	 * Used to align the section client / decriptions of two section headers 
	 * horizontally adjacent to each other.  The misalignment is caused by one
	 * section header containing toolbar icons and the other not.
	 * 
	 * @param masterSection
	 * @param detailsSection
	 */
	public void alignSectionHeaders(Section masterSection,
			Section detailsSection) {
		detailsSection.descriptionVerticalSpacing += 
			masterSection.getTextClientHeightDifference();
	}	    
    
	/**
	 * @param form
	 * @param colors
	 */
    /*
	private void createNewStyleHeader(final ScrolledForm form, FormColors colors) {
		colors.initializeSectionToolBarColors();
		Color gbg = colors.getColor(IFormColors.TB_BG);
		Color bg = colors.getBackground();
		form.getForm().setTextBackground(new Color[]{bg, gbg}, new int [] {100}, true);
		form.getForm().setSeparatorVisible(true);
	}
	*/

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	public ISelection getSelection() {
		if (currentSelection != null)
			return currentSelection;

		return StructuredSelection.EMPTY;
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	public void setSelection(ISelection selection) {
		currentSelection = selection;
		
		// May need to check if section is expanded...
		for (ISelectionChangedListener listener : selectionChangedListeners) {
			SelectionChangedEvent event = new SelectionChangedEvent(this, selection);
			listener.selectionChanged(event);
		}
	}
}
