package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;

/**
 * 
 */
public class CoreServiceItemSelectionEditPolicy extends SelectionEditPolicy {

	/**
	 * 
	 */
	protected IFigure selectionFeedbackFigure;

	/**
	 * 
	 */
	private IFigure focusFeedbackFigure;

	/**
	 * 
	 */
	protected void showPrimarySelection() {
		showSelection();
		showFocus();
	}

	/**
	 * 
	 */
	protected void showSelection() {
		hideSelection();
		addFeedback(selectionFeedbackFigure = createSelectionFeedbackFigure());
		refreshSelectionFeedback();
		hideFocus();
	}

	/**
	 * 
	 */
	protected void hideSelection() {
		if (selectionFeedbackFigure != null) {
			removeFeedback(selectionFeedbackFigure);
			selectionFeedbackFigure = null;
		}
		hideFocus();
	}

	/**
	 * 
	 */
	protected void showFocus() {
		hideFocus();
		addFeedback(focusFeedbackFigure = createFocusFeedbackFigure());
		refreshFocusFeedback();
	}

	/**
	 * 
	 */
	protected void hideFocus() {
		if (focusFeedbackFigure != null) {
			removeFeedback(focusFeedbackFigure);
			focusFeedbackFigure = null;
		}
	}

	/**
	 * 
	 */
	protected Rectangle getFeedbackBounds() {
		Rectangle bounds;
		bounds = getHostFigure().getBounds().getCopy();
		getHostFigure().getParent().translateToAbsolute(bounds);
		getFeedbackLayer().translateToRelative(bounds);
		return bounds;
	}

	/**
	 * 
	 */
	protected IFigure createSelectionFeedbackFigure() {
		RectangleFigure feedbackFigure = new RectangleFigure();
		feedbackFigure.setFill(false);
		feedbackFigure.setLineWidth(2);
		return feedbackFigure;
	}

	/**
	 * 
	 */
	protected IFigure createFocusFeedbackFigure() {
		return new Figure() {

			protected void paintFigure(Graphics graphics) {
				graphics.drawFocus(getBounds().getResized(-1, -1));
			}
		};
	}

	/**
	 * 
	 */
	protected void updateLabel(Label target) {
		Label source = (Label) getHostFigure();
		target.setText(source.getText());
		target.setTextAlignment(source.getTextAlignment());
		target.setFont(source.getFont());
	}

	/**
	 * 
	 */
	protected void refreshSelectionFeedback() {
		if (selectionFeedbackFigure != null) {
			selectionFeedbackFigure.setBounds(getFeedbackBounds());
		}
	}

	/**
	 * 
	 */
	protected void refreshFocusFeedback() {
		if (focusFeedbackFigure != null) {
			focusFeedbackFigure.setBounds(getFeedbackBounds());
		}
	}

	/**
	 * 
	 */
	public void refreshFeedback() {
		refreshSelectionFeedback();
		refreshFocusFeedback();
	}
}
