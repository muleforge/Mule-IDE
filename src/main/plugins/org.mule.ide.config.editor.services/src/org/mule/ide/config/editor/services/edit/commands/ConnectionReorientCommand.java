package org.mule.ide.config.editor.services.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.mule.ide.config.core.Connection;
import org.mule.ide.config.core.SedaModelType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.editor.services.edit.policies.CoreBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (!(getElementToEdit() instanceof Connection)) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof SedaServiceType && newEnd instanceof SedaServiceType)) {
			return false;
		}
		SedaServiceType target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof SedaModelType)) {
			return false;
		}
		SedaModelType container = (SedaModelType) getLink().eContainer();
		return CoreBaseItemSemanticEditPolicy.LinkConstraints
				.canExistConnection_3001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SedaServiceType && newEnd instanceof SedaServiceType)) {
			return false;
		}
		SedaServiceType source = getLink().getSource();
		if (!(getLink().eContainer() instanceof SedaModelType)) {
			return false;
		}
		SedaModelType container = (SedaModelType) getLink().eContainer();
		return CoreBaseItemSemanticEditPolicy.LinkConstraints
				.canExistConnection_3001(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Connection getLink() {
		return (Connection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected SedaServiceType getOldSource() {
		return (SedaServiceType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SedaServiceType getNewSource() {
		return (SedaServiceType) newEnd;
	}

	/**
	 * @generated
	 */
	protected SedaServiceType getOldTarget() {
		return (SedaServiceType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SedaServiceType getNewTarget() {
		return (SedaServiceType) newEnd;
	}
}
