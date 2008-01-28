package org.mule.ide.config.editor.internal.form;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * 
 * Copied from org.eclipse.pde.internal.ui.parts.SharedPart
 *
 */
public abstract class SharedPart {
	private boolean enabled = true;

	public void setEnabled(boolean enabled) {
		if (enabled != this.enabled) {
			this.enabled = enabled;
			updateEnabledState();
		}
	}

	public abstract void createControl(
		Composite parent,
		int style,
		int span,
		FormToolkit toolkit);

	public boolean isEnabled() {
		return enabled;
	}

	protected void updateEnabledState() {
	}

	protected Composite createComposite(
		Composite parent,
		FormToolkit toolkit) {
		if (toolkit == null)
			return new Composite(parent, SWT.NULL);
		return toolkit.createComposite(parent);
	}
	protected Label createEmptySpace(
		Composite parent,
		int span,
		FormToolkit toolkit) {
		Label label;
		if (toolkit != null) {
			label = toolkit.createLabel(parent, null);
		} else {
			label = new Label(parent, SWT.NULL);
		}
		GridData gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		gd.horizontalSpan= span;
		gd.widthHint= 0;
		gd.heightHint= 0;
		label.setLayoutData(gd);
		return label;
	}
}
