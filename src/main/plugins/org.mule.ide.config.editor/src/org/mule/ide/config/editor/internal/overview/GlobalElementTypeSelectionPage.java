package org.mule.ide.config.editor.internal.overview;

import java.util.HashMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.mule.ide.config.core.IGlobalElementTypeProvider;
import org.mule.ide.config.editor.Messages;

/**
 * Wizard page for selecting among global element types.
 */
public class GlobalElementTypeSelectionPage extends WizardPage implements Listener {

    private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	protected IGlobalElementTypeProvider.IGlobalElementType selectedType;

	private TableViewer typeViewer;
	
	private IStructuredContentProvider contentProvider;
	
	private String nameValue;

    private Text nameField;

	/**
	 * 
	 */
	public GlobalElementTypeSelectionPage(String pageName, IStructuredContentProvider contentProvider) {
		super(pageName);
		this.contentProvider = contentProvider;
		setDescription(Messages.NewGlobalElementWizard_TypePage_Description);
	}

	/**
	 * 
	 */
	public IGlobalElementTypeProvider.IGlobalElementType getSelectedType() {
		return selectedType;
	}

	/**
	 * 
	 */
	public String getElementName() {
		return nameValue;
	}

	/**
	 * 
	 */
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		plate.setLayout(layout);
		setControl(plate);

		Label label = new Label(plate, SWT.NONE);
		label.setText(Messages.NewGlobalElementWizard_TypePage_TableLabel);
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		Composite tableContainer = new Composite(plate, SWT.NONE);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		tableContainer.setLayoutData(layoutData);
		
		TableColumnLayout tableColumnLayout = new TableColumnLayout();
		tableContainer.setLayout(tableColumnLayout);
		
		Table table = new Table(tableContainer, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		
		TableColumn tableColumn = new TableColumn(table, SWT.LEFT, 0);
		tableColumn.setText(Messages.NewGlobalElementWizard_TypePage_TableColumn0Label); 
		//tableColumn.setWidth(40); 
		tableColumn.setResizable(true); 
		ColumnLayoutData columnLayoutData = new ColumnWeightData(1);
		tableColumnLayout.setColumnData(tableColumn, columnLayoutData);
		tableColumn = new TableColumn(table, SWT.LEFT, 1);
		tableColumn.setText(Messages.NewGlobalElementWizard_TypePage_TableColumn1Label); 
		//tableColumn.setWidth(100); 
		tableColumn.setResizable(true); 
		columnLayoutData = new ColumnWeightData(1);
		tableColumnLayout.setColumnData(tableColumn, columnLayoutData);

		table.setHeaderVisible(true);
		
		typeViewer = new TableViewer(table);
		typeViewer.setContentProvider(contentProvider);
		typeViewer.setLabelProvider(new TableLabelProvider());
		/*
		typeViewer.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				if (! (element instanceof IGlobalElementTypeProvider.IGlobalElementType))
					return "";
				EClass eClass = ((IGlobalElementTypeProvider.IGlobalElementType) element).getEClass();
				EReference eRef = ((IGlobalElementTypeProvider.IGlobalElementType) element).getDocumentRootReference();
				EAnnotation annotation = eRef.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
				String elementName = annotation.getDetails().get("name"); //$NON-NLS-1$
				StringBuffer buf = new StringBuffer();
				buf.append(eRef.getEContainingClass().getEPackage().getNsPrefix());
				buf.append(" : ");
				buf.append(elementName);
				buf.append("   (");
				buf.append(eClass.getEPackage().getNsPrefix());
				buf.append(" : ");
				buf.append(eClass.getName());
				buf.append(")");
				return buf.toString();
			}			
		});
		*/
		typeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				GlobalElementTypeSelectionPage.this
						.updateSelection((IStructuredSelection) event
								.getSelection());
			}
		});
		
		// Enable alpha sort
		typeViewer.setComparator(new ViewerComparator());
		typeViewer.setInput(new Object());
		
        // name group
        Composite nameGroup = new Composite(plate, SWT.NONE);
        layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginWidth = 0;
        nameGroup.setLayout(layout);
        nameGroup.setLayoutData(new GridData(SWT.FILL,GridData.CENTER,true,false));
        //nameGroup.setFont(font);

        label = new Label(nameGroup, SWT.NONE);
        label.setText(Messages.NewGlobalElementWizard_TypePage_NameLabel);
        //label.setFont(font);

        // name entry field
        nameField = new Text(nameGroup, SWT.BORDER);
        nameField.addListener(SWT.Modify, this);
        GridData data = new GridData(SWT.FILL,GridData.CENTER,true,false);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        nameField.setLayoutData(data);
        //nameField.setFont(font);

		setPageComplete(validatePage());
	}

	/**
	 * 
	 */
	protected String getTypeLabel() {
		return Messages.NewGlobalElementWizard_TypePage_TableLabel;
	}

	/**
	 * 
	 */
	protected void updateSelection(IStructuredSelection selection) {
		selectedType = null;
		if (selection.size() == 1) {
			Object selectedElement = selection.getFirstElement();
			if (selectedElement instanceof IGlobalElementTypeProvider.IGlobalElementType) {
				selectedType = (IGlobalElementTypeProvider.IGlobalElementType) selectedElement;
			}
		}
		setPageComplete(validatePage());
	}

	/**
	 * 
	 */
	protected boolean validatePage() {
		return (selectedType != null) && (nameValue != null && nameValue.length() > 0);
	}

	public void handleEvent(Event event) {
		nameValue = nameField.getText();
		setPageComplete(validatePage());
	}

	class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		
		private HashMap<Object,String> mapElementName = new HashMap<Object,String>();

		// getText is called to perform sort.  
		// Since it's called a lot, cache the generated string.
		public String getText(Object element) {
			if (! (element instanceof IGlobalElementTypeProvider.IGlobalElementType))
				return "";
			String result = mapElementName.get(element);
			if (result != null)
				return result;
			
			StringBuffer buf = new StringBuffer();
			EReference eRef = ((IGlobalElementTypeProvider.IGlobalElementType) element).getDocumentRootReference();
			EAnnotation annotation = eRef.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
			String elementName = annotation.getDetails().get("name"); //$NON-NLS-1$
			buf.append(eRef.getEContainingClass().getEPackage().getNsPrefix());
			buf.append(" : ");
			buf.append(elementName);
			result = buf.toString();
			mapElementName.put(element, result);
			return result;
		}

		public String getColumnText(Object obj, int index) {
			if (! (obj instanceof IGlobalElementTypeProvider.IGlobalElementType))
				return "";
			if (index == 0) {
				return getText(obj);
			} else {
				StringBuffer buf = new StringBuffer();
				EClass eClass = ((IGlobalElementTypeProvider.IGlobalElementType) obj).getEClass();
				buf.append(eClass.getEPackage().getNsPrefix());
				buf.append(" : ");
				buf.append(eClass.getName());
				return buf.toString();
			}
		}
		public Image getColumnImage(Object obj, int index) {
			return null;
		}
	}
}
