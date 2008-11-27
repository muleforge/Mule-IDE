package org.mule.ide.config.editor.internal.overview;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.editor.internal.elements.DefaultContentProvider;

/**
 * 
 */
public abstract class GlobalElementTableProvider extends DefaultContentProvider implements
		IStructuredContentProvider {

	private MuleType mule;
	private EList<? extends EObject> fElements;
	private AdapterImpl notificationAdapter;
	
	protected abstract EList<? extends EObject> getElements(MuleType mule);
	
	protected abstract AdapterImpl createNotificationAdapter();
	
	public AdapterImpl getNotificationAdapter() {
		if (notificationAdapter == null) {
			notificationAdapter = createNotificationAdapter();
		}
		return notificationAdapter;
	}
	
	public Object[] getElements(Object parent) {
		mule = (MuleType) parent;
		mule.eAdapters().add(getNotificationAdapter());
		if (fElements == null) {
			fElements = getElements(mule);
			for (EObject element : fElements) {
				element.eAdapters().add(getNotificationAdapter());
			}
		}
		return fElements.toArray();
	}

	public void dispose() {
		if (mule == null) {
			return;
		}
		mule.eAdapters().remove(getNotificationAdapter());
		if (fElements != null) {
			for (EObject element : fElements) {
				element.eAdapters().remove(getNotificationAdapter());
			}
		}
		fElements = null;
		mule = null;
	}
	
}
