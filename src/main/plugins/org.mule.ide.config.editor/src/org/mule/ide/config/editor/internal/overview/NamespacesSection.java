package org.mule.ide.config.editor.internal.overview;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
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
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.util.MuleNamespacesAdapter;
import org.mule.ide.config.editor.Activator;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.form.CheckboxTableSection;
import org.mule.ide.config.editor.internal.form.ConfigEditorFormPage;
import org.mule.ide.config.editor.internal.form.StructuredViewerPart;

public class NamespacesSection extends CheckboxTableSection {

	private Collection<EPackage> packages;
	private MuleNamespacesAdapter adapter;
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
	protected StructuredViewerPart createViewerPart(String[] buttonLabels) {
		return new NamespacesPartAdapter(buttonLabels);
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
		adapter = (MuleNamespacesAdapter) EcoreUtil.getExistingAdapter(documentRoot, MuleNamespacesAdapter.class);
		getTablePart().getViewer().setInput(documentRoot);
		
		// TODO set up change listeners
	}

	protected void initializeCheckState() {
		super.initializeCheckState();
		
		CheckboxTableViewer viewer = getTableViewer();
		SortedMap<String,String> prefixMap = adapter.getNamespaceMap();
		int i=0;
		for (EPackage p : packages) {
			String uri = prefixMap.get(p.getNsPrefix());
			if (uri != null && uri.equals(p.getNsURI())) {
				viewer.setChecked(p, true);
				/*
				if (uri.startsWith(MuleNamespacesAdapter.MULE_CORE_URI_PREFIX)
						|| uri.startsWith(MuleNamespacesAdapter.MULE_SPRING_BEANS_URI_PREFIX)) {
					viewer.setGrayed(p, true);
				}
				*/
			}
			i++;
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
	
	class NamespacesPartAdapter extends PartAdapter {
		
		public NamespacesPartAdapter(String[] buttonLabels) {
			super(buttonLabels);
		}
		
		@Override
		protected StructuredViewer createStructuredViewer(
			Composite parent,
			int style,
			FormToolkit toolkit) {
			
			style |= SWT.H_SCROLL | SWT.V_SCROLL;
			if (toolkit==null) {
				style |= SWT.BORDER;
			}
			else {
				style |= toolkit.getBorderStyle();
			}
			
			TableColumnLayout tableColumnLayout = new TableColumnLayout();
			parent.setLayout(tableColumnLayout);
			
	        table = new Table(parent, SWT.CHECK | style);
	        
			ColumnLayoutData columnLayoutData;
			
			TableColumn tableColumn = new TableColumn(table, SWT.NONE, 0);
			tableColumn.setText("Prefix"); 
			columnLayoutData = new ColumnWeightData(1, 40);
			tableColumnLayout.setColumnData(tableColumn, columnLayoutData);
			
			tableColumn = new TableColumn(table, SWT.NONE, 1);
			tableColumn.setText("URI"); 
			columnLayoutData = new ColumnWeightData(5);
			tableColumnLayout.setColumnData(tableColumn, columnLayoutData);
	        
			CheckboxTableViewer	tableViewer = new CheckboxTableViewer(table);
			tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent e) {
					NamespacesPartAdapter.this.selectionChanged((IStructuredSelection)e.getSelection());
				}
			});
			tableViewer.addCheckStateListener(new ICheckStateListener() {
				public void checkStateChanged(CheckStateChangedEvent event) {
					elementChecked(event.getElement(), event.getChecked());
				}
			});
			
			return tableViewer;
		}		
	}
	
	class NamespaceTableProvider extends GlobalElementTableProvider {
		@Override
		protected EList<? extends EObject> getElements(MuleType mule) {
			return null;
		}
		
		public Object[] getElements(Object parent) {
			if (adapter != null) {
				packages = Activator.getDefault().getMuleEcorePackages();
				return packages.toArray();
			} else {
				return new Object[] {};
			}
		}
		
		@Override
		protected AdapterImpl createNotificationAdapter() {
			return new NamespaceNotificationAdapter();
		}
	}

	class NamespaceNotificationAdapter extends AdapterImpl {
		@Override
		public void notifyChanged(Notification msg) {
			int eventType = msg.getEventType();
		}
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == NamespacesSection.class);
		}
	}
}
