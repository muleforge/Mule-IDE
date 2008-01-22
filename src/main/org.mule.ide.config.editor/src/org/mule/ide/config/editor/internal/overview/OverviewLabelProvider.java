package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.ConnectorType;
import org.mule.ide.config.core.CustomConnectorType;

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
		// TODO switch to AbstractConnectorType if MULE-2901 is implemented
		else if (object instanceof ConnectorType) {
			return getObjectText((ConnectorType) object);
		}
		// TODO Can be removed on next integ of mule.xsd
		else if (object instanceof CustomConnectorType) {
			return getObjectText((CustomConnectorType) object);
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
	
	private String getObjectText(ConnectorType object) {
		String label = object.getName();
		return label == null || label.length() == 0 ?
			getDefault(object) :
			label;		
	}
	
	private String getObjectText(CustomConnectorType object) {
		String label = object.getName();
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
