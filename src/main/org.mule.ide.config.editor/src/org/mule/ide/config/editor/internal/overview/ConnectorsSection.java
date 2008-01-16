package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.elements.DefaultTableProvider;

/**
 * Derived from org.eclipse.pde.internal.ui.editor.plugin.RequiresSection
 */
public class ConnectorsSection extends GlobalElementTableSection 
	implements IPropertyChangeListener {
	//implements IModelChangedListener, IPluginModelListener, IPropertyChangeListener {
    
	private EList<AbstractConnectorType> fConnectors;

	public ConnectorsSection(OverviewPage page, Composite parent) {
		super(page, parent);
		getSection().setText(Messages.ConnectorsSection_Title); 
		getSection().setDescription(Messages.ConnectorsSection_Desc); 
	}
	
	@Override
	protected IContentProvider getContentProvider() {
		return new ConnectorContentProvider();
	}

	public void refresh() {
		fConnectors = null;
		super.refresh();
	}

	private void getConnectors() {
		MuleType mule = getPage().getModel();
		fConnectors = mule.getAbstractConnector();
	}
    
	class ConnectorContentProvider extends DefaultTableProvider {
		public Object[] getElements(Object parent) {
			if (fConnectors == null) {
				getConnectors();
			}
			return fConnectors.toArray();
		}
	}

}
