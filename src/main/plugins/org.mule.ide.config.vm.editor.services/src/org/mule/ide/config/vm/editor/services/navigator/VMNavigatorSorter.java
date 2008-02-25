package org.mule.ide.config.vm.editor.services.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry;

/**
 * @generated
 */
public class VMNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof VMNavigatorItem) {
			VMNavigatorItem item = (VMNavigatorItem) element;
			return VMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
