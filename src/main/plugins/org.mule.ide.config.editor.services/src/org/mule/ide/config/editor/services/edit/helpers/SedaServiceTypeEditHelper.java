package org.mule.ide.config.editor.services.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CorePackage;

/**
 * @generated
 */
public class SedaServiceTypeEditHelper extends CoreBaseEditHelper {

	/**
	 * customization
	 *   - automatically create the inbound, outbound, and async reply collections on
	 *     creation of a seda service element.
	 */
	protected ICommand getConfigureCommand(final ConfigureRequest req) {
		return new ConfigureServiceElementCommand(req);
	}

	class ConfigureServiceElementCommand extends ConfigureElementCommand {

		public ConfigureServiceElementCommand(ConfigureRequest request) {
			super(request);
		}

		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			EObject service = ((ConfigureRequest) getRequest())
					.getElementToConfigure();

			doConfiguration((BaseServiceType) service, monitor);

			return CommandResult.newOKCommandResult(service);
		}

		/**
		 * 
		 * @param element
		 * @param monitor
		 */
		protected void doConfiguration(BaseServiceType service,
				IProgressMonitor monitor) {
			EClass collectionClass = CorePackage.eINSTANCE
					.getInboundCollectionType();
			EReference collectionContainer = CorePackage.eINSTANCE
					.getBaseServiceType_Inbound();
			EObject result = EMFCoreUtil.create(service, collectionContainer,
					collectionClass);

			collectionClass = CorePackage.eINSTANCE.getOutboundCollectionType();
			collectionContainer = CorePackage.eINSTANCE
					.getBaseServiceType_Outbound();
			result = EMFCoreUtil.create(service, collectionContainer,
					collectionClass);

			collectionClass = CorePackage.eINSTANCE
					.getAsyncReplyCollectionType();
			collectionContainer = CorePackage.eINSTANCE
					.getBaseServiceType_AsyncReply();
			result = EMFCoreUtil.create(service, collectionContainer,
					collectionClass);
		}
	}
}
