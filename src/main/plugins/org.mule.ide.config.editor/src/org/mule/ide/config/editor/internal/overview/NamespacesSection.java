package org.mule.ide.config.editor.internal.overview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Activator;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.elements.DefaultContentProvider;
import org.mule.ide.config.editor.internal.form.CheckboxTableSection;
import org.mule.ide.config.editor.internal.form.ConfigEditorFormPage;
import org.mule.ide.config.editor.internal.form.StructuredViewerPart;
import org.mule.ide.config.spring.SpringPackage;

public class NamespacesSection extends CheckboxTableSection {

	private Collection<EPackage> packages;
	private DocumentNamespaceNotificationAdapter documentNamespaceAdapter;
	private Table table;
	
	public NamespacesSection(ConfigEditorFormPage formPage, Composite parent, int style) {
		super(formPage, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style, new String[] {});
	}
	
	public void createClient(Section section, FormToolkit toolkit) {
		section.setText(Messages.NamespacesSection_Title); 
		section.setDescription(Messages.NamespacesSection_Desc); 
		super.createClient(section, toolkit);
	}

	@Override
	protected IContentProvider createContentProvider() {
		return new NamespaceTableProvider();
	}

	@Override
	protected ITableLabelProvider getLabelProvider() {
		return new TableLabelProvider();
	}
	
	@Override
	protected void initialize() {
		DocumentRoot documentRoot = getPage().getConfigEditor().getDocumentRoot();
		getTablePart().getViewer().setInput(documentRoot);
		setCheckState();
		documentRoot.eAdapters().add(getNotificationAdapter());
	}
	
	public void dispose() {
		DocumentRoot documentRoot = getPage().getConfigEditor().getDocumentRoot();
		documentRoot.eAdapters().remove(getNotificationAdapter());
	}

	protected AdapterImpl getNotificationAdapter() {
		if (documentNamespaceAdapter == null) {
			documentNamespaceAdapter = new DocumentNamespaceNotificationAdapter();
		}
		return documentNamespaceAdapter;
	}
	
	protected void setCheckState() {
		CheckboxTableViewer viewer = getTableViewer();
		DocumentRoot documentRoot = getPage().getConfigEditor().getDocumentRoot();
		EMap<String,String> prefixMap = documentRoot.getXMLNSPrefixMap();
		for (EPackage p : packages) {
			// If we go back to displaying the core and spring packages in the list
			// will need to handle finding the default ns.
			String uri = prefixMap.get(p.getNsPrefix());
			boolean check = (uri != null && uri.equals(p.getNsURI()));
			viewer.setChecked(p, check);
		}		
	}
	
	protected void elementChecked(Object element, boolean checked) {
		EPackage pack = (EPackage) element;
		String prefix = pack.getNsPrefix();
		String uri = pack.getNsURI();
		DocumentRoot documentRoot = getPage().getConfigEditor().getDocumentRoot();
		if (checked) {
			BasicEMap.Entry<String, String> entry = (BasicEMap.Entry<String, String>)
				((EcoreFactoryImpl) EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
			entry.setKey(prefix);
			entry.setValue(uri);
			Command command = AddCommand.create(getEditingDomain(), documentRoot, CorePackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap(), entry);
			if (command.canExecute()) {
				getEditingDomain().getCommandStack().execute(command);
			}		
		} else {
			EMap<String,String> prefixMap = documentRoot.getXMLNSPrefixMap();
			int index = prefixMap.indexOfKey(prefix);
			Map.Entry<String, String> entry = prefixMap.get(index);
			Command command = 
				RemoveCommand.create(getEditingDomain(), documentRoot, CorePackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap(), entry);
			if (command.canExecute()) {
				getEditingDomain().getCommandStack().execute(command);
			}
		}
	}

	class TableLabelProvider extends LabelProvider implements ITableLabelProvider {

		public String getColumnText(Object obj, int index) {
			if (obj instanceof EPackage) {
				if (index == 0) {
					return ((EPackage) obj).getNsPrefix();
				} else if (index == 1) {
					return ((EPackage) obj).getNsURI();
				}
			}
			return obj.toString();
		}
		public Image getColumnImage(Object obj, int index) {
			return null;
		}
	}
	
	
	class NamespaceTableProvider extends DefaultContentProvider implements
			IStructuredContentProvider {
		public Object[] getElements(Object parent) {
			packages = Activator.getDefault().getMuleEcorePackages();
			ArrayList<EPackage> temp = new ArrayList<EPackage>(packages.size());
			// Filter out the core and spring namespaces, since they cannot be deselected.
			for (EPackage p : packages) {
				String uri = p.getNsURI();
				if (! (uri.equals(CorePackage.eNS_URI)
						|| uri.equals(SpringPackage.eNS_URI))) {
					temp.add(p);
				}
			}
			return temp.toArray();
		}
	}

	class DocumentNamespaceNotificationAdapter extends AdapterImpl {
	    @Override
	    public void notifyChanged(Notification msg) {
			Object feature = msg.getFeature();
			if (feature != null && feature == CorePackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap()) {
				setCheckState();
			}
	    }
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == NamespacesSection.class);
		}
	}
}
