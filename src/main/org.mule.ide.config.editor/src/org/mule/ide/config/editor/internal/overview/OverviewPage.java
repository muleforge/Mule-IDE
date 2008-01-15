package org.mule.ide.config.editor.internal.overview;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.form.ConfigEditorFormPage;
import org.mule.ide.config.editor.internal.form.FormLayoutFactory;

/**
 * 
 * Derived from org.eclipse.pde.internal.ui.editor.plugin.DependenciesPage
 *
 */
public class OverviewPage extends ConfigEditorFormPage {
	
	public static final String PAGE_ID = "overview"; //$NON-NLS-1$
	
	public OverviewPage(FormEditor editor) {
		super(editor, PAGE_ID, Messages.OverviewPage_TabName);  
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.editor.PDEFormPage#getHelpResource()
	 */
	protected String getHelpResource() {
		// TODO
		return null;
		//return IPDEUIConstants.PLUGIN_DOC_ROOT + "guide/tools/editors/manifest_editor/dependencies.htm"; //$NON-NLS-1$
	}
	
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		ScrolledForm form = managedForm.getForm();
		//form.setImage(PDEPlugin.getDefault().getLabelProvider().get(PDEPluginImages.DESC_REQ_PLUGINS_OBJ));
		form.setText(Messages.OverviewPage_Title); 
		Composite body = form.getBody();
		body.setLayout(FormLayoutFactory.createFormGridLayout(true, 2));
		Composite left, right;
		FormToolkit toolkit = managedForm.getToolkit();
		left = toolkit.createComposite(body, SWT.NONE);
		left.setLayout(FormLayoutFactory.createFormPaneGridLayout(false, 1));
		left.setLayoutData(new GridData(GridData.FILL_BOTH));
		right = toolkit.createComposite(body, SWT.NONE);
		right.setLayout(FormLayoutFactory.createFormPaneGridLayout(false, 1));
		right.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		EndpointsSection endpointsSection = new EndpointsSection(this, left, getRequiredSectionLabels());
		managedForm.addPart(endpointsSection);		

		// TODO
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(form.getBody(), IHelpContextIds.MANIFEST_PLUGIN_DEPENDENCIES);
	}
	
    private String[] getRequiredSectionLabels() {
        ArrayList<String> labels = new ArrayList<String>();
        labels.add(Messages.TableSection_Add);
        labels.add(Messages.TableSection_Remove);
        labels.add(Messages.TableSection_Up);
        labels.add(Messages.TableSection_Down);
        return (String[])labels.toArray(new String[labels.size()]);
    }

}
