package org.mule.ide.config.axis.editor.services.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.mule.ide.config.axis.editor.services.part.AxisVisualIDRegistry;

/**
 * @generated
 */
public class AxisNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof AxisNavigatorItem) {
			AxisNavigatorItem item = (AxisNavigatorItem) element;
			return AxisVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
