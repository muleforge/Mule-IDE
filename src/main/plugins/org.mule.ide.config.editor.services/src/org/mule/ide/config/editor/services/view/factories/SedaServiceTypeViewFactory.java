package org.mule.ide.config.editor.services.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeASYNCREPLYEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class SedaServiceTypeViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		styles.add(NotationFactory.eINSTANCE.createFillStyle());
		styles.add(NotationFactory.eINSTANCE.createLineStyle());
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
					.getType(SedaServiceTypeEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		if (!DefaultModelTypeEditPart.MODEL_ID.equals(CoreVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", DefaultModelTypeEditPart.MODEL_ID); //$NON-NLS-1$
			view.getEAnnotations().add(shortcutAnnotation);
		}
		IAdaptable eObjectAdapter = null;
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			eObjectAdapter = new EObjectAdapter(eObject);
		}
		getViewService().createNode(
				eObjectAdapter,
				view,
				CoreVisualIDRegistry
						.getType(SedaServiceTypeNameEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				CoreVisualIDRegistry
						.getType(SedaServiceTypeCOMPONENTEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				CoreVisualIDRegistry
						.getType(SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				CoreVisualIDRegistry
						.getType(SedaServiceTypeINBOUNDEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				CoreVisualIDRegistry
						.getType(SedaServiceTypeASYNCREPLYEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
	}
}
