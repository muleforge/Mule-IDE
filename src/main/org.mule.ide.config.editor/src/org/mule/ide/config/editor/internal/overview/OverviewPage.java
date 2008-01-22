package org.mule.ide.config.editor.internal.overview;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.gmf.runtime.diagram.ui.properties.views.PropertiesBrowserPage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.form.ConfigEditorFormPage;
import org.mule.ide.config.editor.internal.form.FormLayoutFactory;
import org.mule.ide.config.editor.services.part.ServicesEditorPlugin;

/**
 * 
 * Derived from org.eclipse.pde.internal.ui.editor.plugin.DependenciesPage
 *
 */
public class OverviewPage extends ConfigEditorFormPage 
		implements ITabbedPropertySheetPageContributor {
	
	public static final String PAGE_ID = "overview"; //$NON-NLS-1$

	public OverviewPage(FormEditor editor) {
		super(editor, PAGE_ID, Messages.OverviewPage_TabName); 
	}
	
	public String getContributorId() {
		return ServicesEditorPlugin.ID;
	}
	
	public boolean isEditor() {
		return true;
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
		
		GlobalElementTableSection section;
		
		section = new ConnectorsSection(this, left);
		managedForm.addPart(section);		

		section = new EndpointsSection(this, right);
		managedForm.addPart(section);		

		section = new FiltersSection(this, left);
		managedForm.addPart(section);		

		section = new TransformersSection(this, right);
		managedForm.addPart(section);		

		// TODO
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(form.getBody(), IHelpContextIds.MANIFEST_PLUGIN_DEPENDENCIES);

		getSite().setSelectionProvider(this);
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class type) {
		if (type == IPropertySheetPage.class) {
			return new PropertiesBrowserPage(this);
		}
		//else if (key.equals(IContentOutlinePage.class)) {
		//	return showOutlineView() ? getContentOutlinePage() : null;
		//}
		//else 
		//else if (key.equals(IGotoMarker.class)) {
		//	return this;
		//}
		else {
			return super.getAdapter(type);
		}
	}

}
