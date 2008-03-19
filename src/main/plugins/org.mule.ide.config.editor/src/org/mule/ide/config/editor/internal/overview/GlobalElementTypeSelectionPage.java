package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
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
		label.setText(Messages.NewGlobalElementWizard_TypePage_TypeLabel);
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		typeViewer = new TableViewer(plate, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		typeViewer.getTable().setLayoutData(layoutData);
		typeViewer.setContentProvider(contentProvider);
		typeViewer.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				return element == null ? "" : ((IGlobalElementTypeProvider.IGlobalElementType) element).getLabel();//$NON-NLS-1$
			}			
		});
		typeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				GlobalElementTypeSelectionPage.this
						.updateSelection((IStructuredSelection) event
								.getSelection());
			}
		});
		
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
		return Messages.NewGlobalElementWizard_TypePage_TypeLabel;
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
}
