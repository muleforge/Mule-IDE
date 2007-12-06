package org.mule.ide.config.editor.services.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class CoreEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CoreVisualIDRegistry.getVisualID(view)) {

			case DefaultModelTypeEditPart.VISUAL_ID:
				return new DefaultModelTypeEditPart(view);

			case SedaServiceTypeEditPart.VISUAL_ID:
				return new SedaServiceTypeEditPart(view);

			case SedaServiceTypeNameEditPart.VISUAL_ID:
				return new SedaServiceTypeNameEditPart(view);

			case InboundRouterCollectionTypeEditPart.VISUAL_ID:
				return new InboundRouterCollectionTypeEditPart(view);

			case WireTapRouterTypeEditPart.VISUAL_ID:
				return new WireTapRouterTypeEditPart(view);

			case WrapLabelEditPart.VISUAL_ID:
				return new WrapLabelEditPart(view);

			case OutboundRouterCollectionTypeEditPart.VISUAL_ID:
				return new OutboundRouterCollectionTypeEditPart(view);

			case WrapLabel2EditPart.VISUAL_ID:
				return new WrapLabel2EditPart(view);

			case ResponseRouterCollectionTypeEditPart.VISUAL_ID:
				return new ResponseRouterCollectionTypeEditPart(view);

			case WrapLabel3EditPart.VISUAL_ID:
				return new WrapLabel3EditPart(view);

			case PojoComponentTypeEditPart.VISUAL_ID:
				return new PojoComponentTypeEditPart(view);

			case WrapLabel4EditPart.VISUAL_ID:
				return new WrapLabel4EditPart(view);

			case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
				return new SedaServiceTypeCOMPONENTEditPart(view);

			case InboundRouterCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
				return new InboundRouterCollectionTypeINBOUNDROUTERSEditPart(
						view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapped()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}

	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
