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
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.GlobalEndpointType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;

/**
 * Overview page section for editing global endpoints.
 */
public class EndpointsSection extends GlobalElementTableSection {
	
	public EndpointsSection(OverviewPage page, Composite parent, int style) {
		super(page, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style);
	}

	public void createClient(Section section, FormToolkit toolkit) {
		section.setText(Messages.EndpointsSection_Title); 
		section.setDescription(Messages.EndpointsSection_Desc); 
		super.createClient(section, toolkit);
	}

	@Override
	protected IContentProvider createContentProvider() {
		return new EndpointTableProvider();
	}
	
	@Override
	protected void handleAdd() {
		// TODO implement select type dialog
		GlobalEndpointType endpoint = 
			CoreFactory.eINSTANCE.createGlobalEndpointType();
		endpoint.setName("endpoint_name");
		Object entry = 
			FeatureMapUtil.createEntry
				(CorePackage.eINSTANCE.getDocumentRoot_Endpoint(), endpoint);
		
		//TODO calculate an index so new element isn't always added at the bottom.
		
		MuleType mule = getMuleElement();
		FeatureMap map = mule.getAbstractGlobalEndpointGroup();
		Command command = AddCommand.create(getEditingDomain(), mule, map, entry);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}		
	}
	
	@Override
	protected void handleRemove(List endpoints) {
		MuleType mule = getMuleElement();
		Command command = 
			RemoveCommand.create(getEditingDomain(), mule, CorePackage.eINSTANCE.getMuleType_AbstractGlobalEndpoint(), endpoints);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}
	}
	
	class EndpointTableProvider extends GlobalElementTableProvider {
		@Override
		protected EList<? extends EObject> getElements(MuleType mule) {
			return mule.getAbstractGlobalEndpoint();
		}
		@Override
		protected GlobalElementNotificationAdapter createNotificationAdapter() {
			return new EndpointNotificationAdapter();
		}
	}

	class EndpointNotificationAdapter extends GlobalElementNotificationAdapter {
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == EndpointsSection.class);
		}
		@Override
		protected boolean checkElementType(Object object) {
			return (object instanceof AbstractGlobalEndpointType);
		}
	}
}
