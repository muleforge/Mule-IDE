package org.mule.ide.config.jms.editor.services.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.mule.ide.config.jms.editor.services.part.JMSVisualIDRegistry;

/**
 * @generated
 */
public class JMSNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof JMSNavigatorItem) {
			JMSNavigatorItem item = (JMSNavigatorItem) element;
			return JMSVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
