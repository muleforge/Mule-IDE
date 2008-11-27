package org.mule.ide.config.editor.internal.overview;

import java.util.List;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.Messages;
import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.SpringFactory;

/**
 * Overview page section for editing global spring beans.
 */
public class SpringBeansSection extends GlobalElementTableSection {
	
	public SpringBeansSection(OverviewPage page, Composite parent, int style) {
		super(page, parent, Section.DESCRIPTION|ExpandableComposite.TITLE_BAR|style);
	}

	public void createClient(Section section, FormToolkit toolkit) {
		section.setText(Messages.SpringBeansSection_Title); 
		section.setDescription(Messages.SpringBeansSection_Desc); 
		super.createClient(section, toolkit);
	}

	@Override
	protected IContentProvider createContentProvider() {
		return new SpringBeanTableProvider();
	}

	@Override
	protected void handleAdd() {
		// TODO implement select type dialog
		BeanType bean = 
			SpringFactory.eINSTANCE.createBeanType();
		bean.setId("beanId");
		bean.setClass("BeanClass");
		
		//TODO calculate an index so new element isn't always added at the bottom.
		
		MuleType mule = getMuleElement();
		Command command = AddCommand.create(getEditingDomain(), mule, CorePackage.eINSTANCE.getMuleType_Bean(), bean);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}		
	}
	
	@Override
	protected String getNewElementWizardTitle() {
		// Currently overriding Add handling, so won't be called.
		return null;
	}
	
	@Override
	protected IStructuredContentProvider createNewElementContentProvider() {
		// Currently overriding Add handling, so won't be called.
		return null;
	}

	@Override
	protected FeatureMap getFeatureMap() {
		// Currently overriding Add handling, so won't be called.
		return null;
	}

	@Override
	protected void handleRemove(List beans) {
		MuleType mule = getMuleElement();
		Command command = 
			RemoveCommand.create(getEditingDomain(), mule, CorePackage.eINSTANCE.getMuleType_Bean(), beans);
		if (command.canExecute()) {
			getEditingDomain().getCommandStack().execute(command);
		}
	}
	
	class SpringBeanTableProvider extends GlobalElementTableProvider {
		@Override
		protected EList<? extends EObject> getElements(MuleType mule) {
			return mule.getBean();
		}
		
		@Override
		protected AdapterImpl createNotificationAdapter() {
			return new SpringBeanNotificationAdapter();
		}
	}

	class SpringBeanNotificationAdapter extends GlobalElementNotificationAdapter {
		@Override
		public boolean isAdapterForType(Object type) {
			return (type == SpringBeansSection.class);
		}
		@Override
		protected boolean checkElementType(Object object) {
			return (object instanceof BeanType);
		}
	}
}
