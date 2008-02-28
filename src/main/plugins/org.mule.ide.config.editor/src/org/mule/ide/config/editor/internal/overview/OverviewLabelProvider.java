package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.spring.BeanType;

public class OverviewLabelProvider extends LabelProvider {
	
	// Note: may want to make this a DecoratingLabelProvider
	
	private AdapterFactory adapterFactory;
	private IItemLabelProvider labelProvider;

	public OverviewLabelProvider(AdapterFactory adapterFactory) {
		super();
		this.adapterFactory = adapterFactory;
	}
	
	public String getText(Object object) {
		if (object instanceof AbstractGlobalEndpointType) {
			return getObjectText((AbstractGlobalEndpointType) object);
		}
		else if (object instanceof AbstractTransformerType) {
			return getObjectText((AbstractTransformerType) object);
		}
		else if (object instanceof AbstractFilterType) {
			return getObjectText((AbstractFilterType) object);
		}
		else if (object instanceof AbstractConnectorType) {
			return getObjectText((AbstractConnectorType) object);
		}
		else if (object instanceof BeanType) {
			return getObjectText((BeanType) object);
		}
		
		return super.getText(object);
	}
	
	private String getObjectText(AbstractGlobalEndpointType object) {
		String label = object.getName();
		return label == null || label.length() == 0 ?
			getDefault(object) :
			label;		
	}
	
	private String getObjectText(AbstractTransformerType object) {
		String label = object.getName();
		return label == null || label.length() == 0 ?
			getDefault(object) :
			label;		
	}
	
	private String getObjectText(AbstractFilterType object) {
		String label = object.getName();
		return label == null || label.length() == 0 ?
			getDefault(object) :
			label;		
	}
	
	private String getObjectText(AbstractConnectorType object) {
		String label = object.getName();
		return label == null || label.length() == 0 ?
			getDefault(object) :
			label;		
	}
	
	private String getObjectText(BeanType object) {
		String label = object.getName();
		if (label == null || label.length() == 0) {
			label = object.getId();
		}
		if (label == null || label.length() == 0) {
			label = object.getClass_();
		}
		return label == null || label.length() == 0 ?
			getDefault(object) :
			label;		
	}
	
	private String getDefault(Object object) {
		if (labelProvider == null) {
			labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(object, IItemLabelProvider.class);
		}
		return labelProvider.getText(object);
	}
	
}
