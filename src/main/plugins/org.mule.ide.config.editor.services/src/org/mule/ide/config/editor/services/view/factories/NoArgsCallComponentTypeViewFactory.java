package org.mule.ide.config.editor.services.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallComponentTypeLabelEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class NoArgsCallComponentTypeViewFactory extends
		AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createShapeStyle());
		return styles;
	}

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = CoreVisualIDRegistry
					.getType(NoArgsCallComponentTypeEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		IAdaptable eObjectAdapter = null;
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			eObjectAdapter = new EObjectAdapter(eObject);
		}
		getViewService()
				.createNode(
						eObjectAdapter,
						view,
						CoreVisualIDRegistry
								.getType(NoArgsCallComponentTypeLabelEditPart.VISUAL_ID),
						ViewUtil.APPEND, true, getPreferencesHint());
		getViewService()
				.createNode(
						eObjectAdapter,
						view,
						CoreVisualIDRegistry
								.getType(NoArgsCallComponentTypeClassEditPart.VISUAL_ID),
						ViewUtil.APPEND, true, getPreferencesHint());
	}
}