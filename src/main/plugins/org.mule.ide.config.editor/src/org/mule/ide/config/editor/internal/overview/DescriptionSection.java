package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.DescriptionType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.editor.internal.form.ConfigEditorFormPage;
import org.mule.ide.config.editor.internal.form.ConfigEditorSection;
import org.mule.ide.config.editor.internal.form.FormLayoutFactory;

public class DescriptionSection extends ConfigEditorSection {

	private DescriptionNotificationAdapter fNotificationAdapter;
	//private IDocument fDocument;
	private Text text;
	private boolean fIgnoreChange;

	public DescriptionSection(ConfigEditorFormPage page, Composite parent, int style) {
		super(page, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style);
		//fDocument = new Document();
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
		gd.minimumHeight = 50;
		text.setLayoutData(gd);

		/*
		fTextViewer = new TextViewer(container, styles);
		fTextViewer.setDocument(fDocument);
		fTextViewer
			.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					DescriptionSection.this.selectionChanged(event.getSelection());
				}
			});
		StyledText styledText = fTextViewer.getTextWidget();
		styledText.setFont(JFaceResources.getTextFont());
		//styledText.setMenu(getPage().getConfigEditor().getContextMenu());
		styledText.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		*/
		
		initialize();
	}

	protected void selectionChanged(ISelection sel) {
		// Forward selection event to parent.
		((OverviewPage) getPage()).setSelection(sel);
	}

	public void initialize() {
		/*
		fDocument.addDocumentListener(new IDocumentListener() {
			public void documentChanged(DocumentEvent e) {
				documentModified();
			}

			public void documentAboutToBeChanged(DocumentEvent e) {
			}
		});	
		*/	
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
		// TODO the commit, see org.eclipse.pde.internal.ui.editor.feature.InfoSection
		
		fIgnoreChange = true;
		MuleType mule = getMuleElement();
		EList<DescriptionType> descriptions = mule.getDescription();
		// Shouldn't really allow multiple, just use the first one.
		if (descriptions.size() > 0) {
			FeatureMap map = descriptions.get(0).getMixed();
			if (map.size() == 1) {
				text.setText(map.get(0).getValue().toString());
			}
		}		
		fIgnoreChange = false;
	}

	@Override
	public void dispose() {
		MuleType mule = getMuleElement();		
		if (EcoreUtil.getExistingAdapter(mule, DescriptionSection.class) != null) {
			mule.eAdapters().remove(fNotificationAdapter);
		}
		super.dispose();
	}

	private void documentModified() {
		if (!fIgnoreChange) {
			markDirty();
		}
	}
	
	class DescriptionNotificationAdapter extends AdapterImpl {
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == DescriptionSection.class);
		}
		@Override
		public void notifyChanged(Notification msg) {
			int eventType = msg.getEventType();
		}
	}
}
