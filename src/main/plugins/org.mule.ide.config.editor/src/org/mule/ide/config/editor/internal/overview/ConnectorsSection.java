package org.mule.ide.config.editor.internal.overview;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
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
import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.IGlobalElementTypeProvider;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.IGlobalElementTypeProvider.IGlobalElementType;
import org.mule.ide.config.editor.Messages;

/**
 * Overview page section for editing global connectors.
 */
public class ConnectorsSection extends GlobalElementTableSection {
	
	public ConnectorsSection(OverviewPage page, Composite parent, int style) {
		super(page, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style);
	}

	public void createClient(Section section, FormToolkit toolkit) {
		section.setText(Messages.ConnectorsSection_Title); 
		section.setDescription(Messages.ConnectorsSection_Desc); 
		super.createClient(section, toolkit);
	}

	@Override
	protected IContentProvider createContentProvider() {
		return new ConnectorTableProvider();
	}

	@Override
	protected String getNewElementWizardTitle() {
		return Messages.NewGlobalElementWizard_Title_Connector;
	}
	
	@Override
	protected IStructuredContentProvider createNewElementContentProvider() {
		return new GlobalElementTypeContentProvider(getPage().getConfigEditor().getDocumentRoot()) {
			@Override
			protected List<IGlobalElementType> getTypes(IGlobalElementTypeProvider provider) {
				return provider.getConnectorTypes();
			}			
		};
	}
	
	@Override
	protected FeatureMap getFeatureMap() {
		return getMuleElement().getAbstractConnectorGroup();
	}
	
	@Override
	protected void handleRemove(List connectors) {
		MuleType mule = getMuleElement();
		Command command = 
			RemoveCommand.create(getEditingDomain(), mule, CorePackage.eINSTANCE.getMuleType_AbstractConnector(), connectors);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}
	}
	
	class ConnectorTableProvider extends GlobalElementTableProvider {
		@Override
		protected EList<? extends EObject> getElements(MuleType mule) {
			return mule.getAbstractConnector();
		}
		
		@Override
		protected AdapterImpl createNotificationAdapter() {
			return new ConnectorNotificationAdapter();
		}
	}

	class ConnectorNotificationAdapter extends GlobalElementNotificationAdapter {
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == ConnectorsSection.class);
		}
		@Override
		protected boolean checkElementType(Object object) {
			return (object instanceof AbstractConnectorType);
		}
	}
}
