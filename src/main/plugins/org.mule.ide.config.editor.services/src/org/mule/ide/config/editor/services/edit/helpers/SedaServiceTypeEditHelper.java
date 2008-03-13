package org.mule.ide.config.editor.services.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.mule.ide.config.core.BaseServiceType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.impl.AsyncReplyCollectionTypeImpl;
import org.mule.ide.config.core.impl.InboundCollectionTypeImpl;
import org.mule.ide.config.core.impl.OutboundCollectionTypeImpl;

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

			//TODO figure out how to consolidate this with the corresponding
			// load/save handling in CoreResourceImpl

			InboundCollectionTypeImpl inbound = (InboundCollectionTypeImpl)CoreFactory.eINSTANCE.createInboundCollectionType();
			inbound.setIDEPlaceholder();
			service.setInbound(inbound);
			
//			EClass collectionClass = CorePackage.eINSTANCE
//					.getInboundCollectionType();
//			EReference collectionContainer = CorePackage.eINSTANCE
//					.getBaseServiceType_Inbound();
//			EObject result = EMFCoreUtil.create(service, collectionContainer,
//					collectionClass);
//			((InboundCollectionTypeImpl) result).setIDEPlaceholder();

			AsyncReplyCollectionTypeImpl asyncReply = (AsyncReplyCollectionTypeImpl)CoreFactory.eINSTANCE.createAsyncReplyCollectionType();
			asyncReply.setIDEPlaceholder();
			service.setAsyncReply(asyncReply);

			
//			collectionClass = CorePackage.eINSTANCE
//					.getAsyncReplyCollectionType();
//			collectionContainer = CorePackage.eINSTANCE
//					.getBaseServiceType_AsyncReply();
//			result = EMFCoreUtil.create(service, collectionContainer,
//					collectionClass);
//			((AsyncReplyCollectionTypeImpl) result).setIDEPlaceholder();

			OutboundCollectionTypeImpl outbound = (OutboundCollectionTypeImpl)CoreFactory.eINSTANCE.createOutboundCollectionType();
			outbound.setIDEPlaceholder();
			service.setOutbound(outbound);
									
//			collectionClass = CorePackage.eINSTANCE.getOutboundCollectionType();
//			collectionContainer = CorePackage.eINSTANCE
//					.getBaseServiceType_Outbound();
//			result = EMFCoreUtil.create(service, collectionContainer,
//					collectionClass);
//			((OutboundCollectionTypeImpl) result).setIDEPlaceholder();
		}
	}
}
