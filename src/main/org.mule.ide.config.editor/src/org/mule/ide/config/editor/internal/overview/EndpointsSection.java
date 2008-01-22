package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.elements.DefaultTableProvider;

/**
 * Derived from org.eclipse.pde.internal.ui.editor.plugin.RequiresSection
 */
public class EndpointsSection extends GlobalElementTableSection 
	implements IPropertyChangeListener {
	//implements IModelChangedListener, IPluginModelListener, IPropertyChangeListener {
    
	private EList<AbstractGlobalEndpointType> fEndpoints;

	public EndpointsSection(OverviewPage page, Composite parent) {
		super(page, parent);
		getSection().setText(Messages.EndpointsSection_Title); 
		getSection().setDescription(Messages.EndpointsSection_Desc); 
	}
	
	@Override
	protected IContentProvider getContentProvider() {
		return new EndpointContentProvider();
	}

	public void refresh() {
		fEndpoints = null;
		super.refresh();
	}

	private void getEndpoints() {
		MuleType mule = getPage().getModel();
		fEndpoints = mule.getAbstractGlobalEndpoint();
	}
    
	class EndpointContentProvider extends DefaultTableProvider {
		public Object[] getElements(Object parent) {
			if (fEndpoints == null) {
				getEndpoints();
			}
			return fEndpoints.toArray();
		}
	}

}