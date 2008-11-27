package org.mule.ide.config.editor.internal.overview;

import java.util.List;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.IGlobalElementTypeProvider;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.IGlobalElementTypeProvider.IGlobalElementType;
import org.mule.ide.config.editor.Messages;

/**
 * Overview page section for editing global filters.
 */
public class FiltersSection extends GlobalElementTableSection {
	
	public FiltersSection(OverviewPage page, Composite parent, int style) {
		super(page, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style);
	}

	public void createClient(Section section, FormToolkit toolkit) {
		section.setText(Messages.FiltersSection_Title); 
		section.setDescription(Messages.FiltersSection_Desc); 
		super.createClient(section, toolkit);
	}

	@Override
	protected IContentProvider createContentProvider() {
		return new FilterTableProvider();
	}
    
	@Override
	protected String getNewElementWizardTitle() {
		return Messages.NewGlobalElementWizard_Title_Filter;
	}
	
	@Override
	protected IStructuredContentProvider createNewElementContentProvider() {
		return new GlobalElementTypeContentProvider(getPage().getConfigEditor().getDocumentRoot()) {
			@Override
			protected List<IGlobalElementType> getTypes(IGlobalElementTypeProvider provider) {
				return provider.getFilterTypes();
			}			
		};
	}
	
	@Override
	protected FeatureMap getFeatureMap() {
		return getMuleElement().getAbstractFilterGroup();
	}
	
	@Override
	protected void handleRemove(List filters) {
		MuleType mule = getMuleElement();
		Command command = 
			RemoveCommand.create(getEditingDomain(), mule, CorePackage.eINSTANCE.getMuleType_AbstractFilter(), filters);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}
	}
	
	class FilterTableProvider extends GlobalElementTableProvider {
		@Override
		protected EList<? extends EObject> getElements(MuleType mule) {
			return mule.getAbstractFilter();
		}

		@Override
		protected GlobalElementNotificationAdapter createNotificationAdapter() {
			return new FilterNotificationAdapter();
		}
	}

	class FilterNotificationAdapter extends GlobalElementNotificationAdapter {
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == FiltersSection.class);
		}
		@Override
		protected boolean checkElementType(Object object) {
			return (object instanceof AbstractFilterType);
		}
	}
}
