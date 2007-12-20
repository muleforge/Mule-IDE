package org.mule.ide.config.editor.services.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class CoreNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5010;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CoreNavigatorItem) {
			CoreNavigatorItem item = (CoreNavigatorItem) element;
			return CoreVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
