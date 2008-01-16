package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.elements.DefaultTableProvider;

/**
 * Derived from org.eclipse.pde.internal.ui.editor.plugin.RequiresSection
 */
public class FiltersSection extends GlobalElementTableSection 
	implements IPropertyChangeListener {
	//implements IModelChangedListener, IPluginModelListener, IPropertyChangeListener {
    
	private EList<AbstractFilterType> fFilters;

	public FiltersSection(OverviewPage page, Composite parent) {
		super(page, parent);
		getSection().setText(Messages.FiltersSection_Title); 
		getSection().setDescription(Messages.FiltersSection_Desc); 
	}
	
	@Override
	protected IContentProvider getContentProvider() {
		return new FilterContentProvider();
	}

	public void refresh() {
		fFilters = null;
		super.refresh();
	}

	private void getFilters() {
		MuleType mule = getPage().getModel();
		fFilters = mule.getAbstractFilter();
	}
    
	class FilterContentProvider extends DefaultTableProvider {
		public Object[] getElements(Object parent) {
			if (fFilters == null) {
				getFilters();
			}
			return fFilters.toArray();
		}
	}

}
