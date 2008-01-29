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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomTransformerType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;

/**
 * Overview page section for editing global transformers.
 */
public class TransformersSection extends GlobalElementTableSection {
	
	public TransformersSection(OverviewPage page, Composite parent, int style) {
		super(page, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style);
		getSection().setText(Messages.TransformersSection_Title); 
		getSection().setDescription(Messages.TransformersSection_Desc); 
	}
	
	@Override
	protected EList<? extends EObject> getGlobalElements() {
		MuleType mule = getMuleElement();
		return mule.getAbstractTransformer();
	}
	
	@Override
	protected void addModelListener() {
		MuleType mule = getMuleElement();
		if (EcoreUtil.getExistingAdapter(mule, TransformersSection.class) == null) {
			mule.eAdapters().add(getNotificationAdapter());
		}
	}
    
	@Override
	protected void handleAdd() {
		// TODO implement select type dialog
		CustomTransformerType transformer = 
			CoreFactory.eINSTANCE.createCustomTransformerType();
		transformer.setName("custom_transformer_name");
		transformer.setClass("customTransformerClass");
		Object entry = 
			FeatureMapUtil.createEntry
				(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(), transformer);
		
		//TODO calculate an index so new element isn't always added at the bottom.
		
		MuleType mule = getMuleElement();
		FeatureMap map = mule.getAbstractTransformerGroup();
		Command command = AddCommand.create(getEditingDomain(), mule, map, entry);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}		
	}
	
	@Override
	protected void handleRemove(List transformers) {
		MuleType mule = getMuleElement();
		Command command = 
			RemoveCommand.create(getEditingDomain(), mule, CorePackage.eINSTANCE.getMuleType_AbstractTransformer(), transformers);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}
	}
	
	@Override
	public void dispose() {
		MuleType mule = getMuleElement();		
		if (EcoreUtil.getExistingAdapter(mule, TransformersSection.class) != null) {
			mule.eAdapters().remove(getNotificationAdapter());
		}
		super.dispose();
	}
	
	@Override
	protected GlobalElementNotificationAdapter createNotificationAdapter() {
		return new TransformerNotificationAdapter();
	}

	class TransformerNotificationAdapter extends GlobalElementNotificationAdapter {
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == TransformersSection.class);
		}
		@Override
		protected boolean checkElementType(Object object) {
			return (object instanceof AbstractTransformerType);
		}
	}
}