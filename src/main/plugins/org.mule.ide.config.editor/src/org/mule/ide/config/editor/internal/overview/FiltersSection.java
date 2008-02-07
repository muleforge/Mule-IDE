package org.mule.ide.config.editor.internal.overview;

import java.util.List;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomFilterType;
import org.mule.ide.config.core.MuleType;
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
	protected EList<? extends EObject> getGlobalElements() {
		MuleType mule = getMuleElement();
		return mule.getAbstractFilter();
	}
	
	@Override
	protected void addModelListener() {
		MuleType mule = getMuleElement();
		if (EcoreUtil.getExistingAdapter(mule, FiltersSection.class) == null) {
			mule.eAdapters().add(getNotificationAdapter());
		}
	}
    
	@Override
	protected void handleAdd() {
		// TODO implement select type dialog
		CustomFilterType filter = 
			CoreFactory.eINSTANCE.createCustomFilterType();
		filter.setName("custom_filter_name");
		filter.setClass("customFilterClass");
		Object entry = 
			FeatureMapUtil.createEntry
				(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(), filter);
		
		//TODO calculate an index so new element isn't always added at the bottom.
		
		MuleType mule = getMuleElement();
		FeatureMap map = mule.getAbstractFilterGroup();
		Command command = AddCommand.create(getEditingDomain(), mule, map, entry);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}		
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
	
	@Override
	public void dispose() {
		MuleType mule = getMuleElement();		
		if (EcoreUtil.getExistingAdapter(mule, FiltersSection.class) != null) {
			mule.eAdapters().remove(getNotificationAdapter());
		}
		super.dispose();
	}
	
	@Override
	protected GlobalElementNotificationAdapter createNotificationAdapter() {
		return new FilterNotificationAdapter();
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
