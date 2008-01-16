package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.elements.DefaultTableProvider;

/**
 * Derived from org.eclipse.pde.internal.ui.editor.plugin.RequiresSection
 */
public class TransformersSection extends GlobalElementTableSection 
	implements IPropertyChangeListener {
	//implements IModelChangedListener, IPluginModelListener, IPropertyChangeListener {
    
	private EList<AbstractTransformerType> fTransformers;

	public TransformersSection(OverviewPage page, Composite parent) {
		super(page, parent);
		getSection().setText(Messages.TransformersSection_Title); 
		getSection().setDescription(Messages.TransformersSection_Desc); 
	}
	
	@Override
	protected IContentProvider getContentProvider() {
		return new TransformerContentProvider();
	}

	public void refresh() {
		fTransformers = null;
		super.refresh();
	}

	private void getTransformers() {
		MuleType mule = getPage().getModel();
		fTransformers = mule.getAbstractTransformer();
	}
    
	class TransformerContentProvider extends DefaultTableProvider {
		public Object[] getElements(Object parent) {
			if (fTransformers == null) {
				getTransformers();
			}
			return fTransformers.toArray();
		}
	}

}
