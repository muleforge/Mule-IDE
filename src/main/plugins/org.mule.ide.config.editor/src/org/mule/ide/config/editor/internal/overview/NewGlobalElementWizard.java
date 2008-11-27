package org.mule.ide.config.editor.internal.overview;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.wizard.Wizard;
import org.mule.ide.config.core.IGlobalElementTypeProvider;

public class NewGlobalElementWizard extends Wizard {

	private IStructuredContentProvider contentProvider;
	private GlobalElementTypeSelectionPage typeSelectionPage;
	
	public NewGlobalElementWizard(String title, IStructuredContentProvider contentProvider) {
		super();
		this.contentProvider = contentProvider;
		setWindowTitle(title);
	}
	
    public void addPages() {
    	typeSelectionPage = new GlobalElementTypeSelectionPage("type selection", contentProvider);
    	addPage(typeSelectionPage);
    }

    @Override
	public boolean performFinish() {
		return true;
	}

	public IGlobalElementTypeProvider.IGlobalElementType getSelectedType() {
		return typeSelectionPage.getSelectedType();
	}

	public String getElementName() {
		return typeSelectionPage.getElementName();
	}
}
