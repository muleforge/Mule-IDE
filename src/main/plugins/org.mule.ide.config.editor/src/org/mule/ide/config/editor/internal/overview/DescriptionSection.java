package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DescriptionType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.form.ConfigEditorFormPage;
import org.mule.ide.config.editor.internal.form.ConfigEditorSection;
import org.mule.ide.config.editor.internal.form.FormLayoutFactory;

public class DescriptionSection extends ConfigEditorSection implements ModifyListener {

	private DescriptionNotificationAdapter fNotificationAdapter;
	private Text text;
	private boolean fIgnoreTextEditorEvent;
	private boolean fIgnoreEMFEvent;

	public DescriptionSection(ConfigEditorFormPage page, Composite parent, int style) {
		super(page, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style);
		FormToolkit toolkit = page.getManagedForm().getToolkit();
		createClient(getSection(), toolkit);
	}
	
	@Override
	protected void createClient(Section section, FormToolkit toolkit) {
		section.setText(Messages.DescriptionSection_Title); 
		section.setDescription(Messages.DescriptionSection_Desc); 
		
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.minimumWidth = 250;
		gd.grabExcessVerticalSpace = true;
		gd.horizontalSpan = 2;
		section.setLayout(FormLayoutFactory.createClearGridLayout(false, 1));
		section.setLayoutData(gd);

		Composite container = toolkit.createComposite(section);
		container.setLayout(FormLayoutFactory.createSectionClientGridLayout(false, 1));
		toolkit.paintBordersFor(container);
		section.setClient(container);

		int styles = SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL;
		text = toolkit.createText(container, "", styles); //$NON-NLS-1$
		gd = new GridData(GridData.FILL_BOTH);
		gd.grabExcessVerticalSpace = true;
		gd.minimumHeight = 60;
		gd.heightHint = 60;
		text.setLayoutData(gd);
		
		initialize();
	}

	protected void selectionChanged(ISelection sel) {
		// Forward selection event to parent.
		((OverviewPage) getPage()).setSelection(sel);
	}

	public void initialize() {
		text.addModifyListener(this);
		
		MuleType mule = getMuleElement();
		if (EcoreUtil.getExistingAdapter(mule, DescriptionSection.class) == null) {
			fNotificationAdapter = new DescriptionNotificationAdapter();
			mule.eAdapters().add(fNotificationAdapter);
		}
		updateDocumentInput(false);
	}

	protected void expansionStateChanging(boolean expanding) {
		if (!expanding) {
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = 2;
			getSection().setLayoutData(gd);
		} else {
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.horizontalSpan = 2;
			gd.grabExcessVerticalSpace = true;
			getSection().setLayoutData(gd);
		}

		super.expansionStateChanging(expanding);
	}

	public void refresh() {
		updateDocumentInput(false);
		super.refresh();
	}
	
	private void updateDocumentInput(boolean commitPrevious) {
		fIgnoreTextEditorEvent = true;
		MuleType mule = getMuleElement();
		DescriptionType description = mule.getDescription();
		if (description != null) {
			/* Workaround EMF/DOM sync code doesn't handle mixed yet
			FeatureMap map = description.getMixed();
			if (map.size() == 1) {
				text.setText(map.get(0).getValue().toString());
			}
			*/
			String value = description.getValue();
			if (value != null) {
				text.setText(value);
			} else {
				text.setText("");
			}
		} else {
			text.setText("");
		}		
		fIgnoreTextEditorEvent = false;
	}

	@Override
	public void dispose() {
		MuleType mule = getMuleElement();		
		if (EcoreUtil.getExistingAdapter(mule, DescriptionSection.class) != null) {
			mule.eAdapters().remove(fNotificationAdapter);
		}
		DescriptionType description = mule.getDescription();
		if (description != null) {
			if (EcoreUtil.getExistingAdapter(mule, DescriptionSection.class) != null) {
				description.eAdapters().remove(fNotificationAdapter);
			}			
		}
		super.dispose();
	}

	class DescriptionNotificationAdapter extends AdapterImpl {
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == DescriptionSection.class);
		}
		@Override
		public void notifyChanged(Notification msg) {
			if (! fIgnoreEMFEvent) {
				int eventType = msg.getEventType();
				if (eventType == Notification.REMOVE) {
					if (msg.getOldValue() instanceof DescriptionType) {
						// Remove of description element
						refresh();
					}
				}
				if (eventType == Notification.SET) {
					if (msg.getNewValue() instanceof DescriptionType) {
						// Add new description element
						refresh();
					} else if (msg.getNotifier() instanceof DescriptionType) {
						// Set description element value
						refresh();					
					}
				}
			}
		}
	}

	public void modifyText(ModifyEvent e) {
		if (!fIgnoreTextEditorEvent) {
			markDirty();

			Command command;
			MuleType mule = getMuleElement();
			DescriptionType description = mule.getDescription();
			
			if (description == null) {
				description = CoreFactory.eINSTANCE.createDescriptionType();
				description.setValue(text.getText());
				command = SetCommand.create(getEditingDomain(), mule, CorePackage.eINSTANCE.getMuleType_Description(), description);
			} else {
				command = SetCommand.create(getEditingDomain(), description, CorePackage.eINSTANCE.getDescriptionType_Value(), text.getText());
			}
			if (command.canExecute()) {
				fIgnoreEMFEvent = true;
				getEditingDomain().getCommandStack().execute(command);
				fIgnoreEMFEvent = false;
			}		
		}
	}
}
