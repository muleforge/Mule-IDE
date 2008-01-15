package org.mule.ide.config.editor.internal.form;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * 
 * Copied from org.eclipse.pde.internal.ui.parts.StructuredViewerPart
 *
 */
public abstract class StructuredViewerPart extends SharedPartWithButtons {

	private StructuredViewer fViewer;

	private Point fMinSize;

	public StructuredViewerPart(String[] buttonLabels) {
		super(buttonLabels);
	}

	public StructuredViewer getViewer() {
		return fViewer;
	}

	public Control getControl() {
		return fViewer.getControl();
	}

	protected void createMainControl(Composite parent, int style, int span, FormToolkit toolkit) {
		fViewer = createStructuredViewer(parent, style, toolkit);
		Control control = fViewer.getControl();
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = span;
		control.setLayoutData(gd);
		applyMinimumSize();
	}

	public void setMinimumSize(int width, int height) {
		fMinSize = new Point(width, height);
		if (fViewer != null)
			applyMinimumSize();
	}

	private void applyMinimumSize() {
		if (fMinSize != null) {
			GridData gd = (GridData) fViewer.getControl().getLayoutData();
			gd.widthHint = fMinSize.x;
			gd.heightHint = fMinSize.y;
		}
	}

	protected void updateEnabledState() {
		getControl().setEnabled(isEnabled());
		super.updateEnabledState();
	}

	protected abstract StructuredViewer createStructuredViewer(Composite parent,
			int style, FormToolkit toolkit);
}
