package org.mule.ide.config.editor.services.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class CorePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createServices1Group());
		paletteRoot.add(createComponents2Group());
		paletteRoot.add(createExceptionStrategies3Group());
		paletteRoot.add(createInbound4Group());
		paletteRoot.add(createOutbound5Group());
		paletteRoot.add(createResponse6Group());
		paletteRoot.add(createCatchAllStrategies7Group());
	}

	/**
	 * Creates "Services" palette tool group
	 * @generated
	 */
	private PaletteContainer createServices1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Services1Group_title);
		paletteContainer.setDescription(Messages.Services1Group_desc);
		paletteContainer.add(createSedaService1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponents2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Components2Group_title);
		paletteContainer.add(createBridgeComponent1CreationTool());
		paletteContainer.add(createEchoComponent2CreationTool());
		paletteContainer.add(createNoArgsCallComponent3CreationTool());
		paletteContainer.add(createLogComponent4CreationTool());
		paletteContainer.add(createNullComponent5CreationTool());
		paletteContainer.add(createPassThroughComponent6CreationTool());
		paletteContainer.add(createPojoComponent7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Exception Strategies" palette tool group
	 * @generated
	 */
	private PaletteContainer createExceptionStrategies3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ExceptionStrategies3Group_title);
		paletteContainer.add(createCustomExceptionStrategy1CreationTool());
		paletteContainer.add(createExceptionStrategy2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Inbound" palette tool group
	 * @generated
	 */
	private PaletteContainer createInbound4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Inbound4Group_title);
		paletteContainer.add(createInboundEndpoint1CreationTool());
		paletteContainer.add(createWireTapRouter2CreationTool());
		paletteContainer.add(createStaticRecipientListRouter3CreationTool());
		paletteContainer.add(createSelectiveConsumerRouter4CreationTool());
		paletteContainer.add(createOutboundRouter5CreationTool());
		paletteContainer.add(createChunkingRouter6CreationTool());
		paletteContainer.add(createCorrelationRouter7CreationTool());
		paletteContainer.add(createIdempotentReceiver8CreationTool());
		paletteContainer.add(createForwardingRouter9CreationTool());
		paletteContainer.add(createFilteredInboundRouter10CreationTool());
		paletteContainer.add(createCustomInboundRouter11CreationTool());
		paletteContainer.add(createCorrelationAggregatorRouter12CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutbound5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Outbound5Group_title);
		paletteContainer.add(createOutboundEndpoint1CreationTool());
		paletteContainer
				.add(createMessageSplitterOutboundRouter2CreationTool());
		paletteContainer.add(createFilteringOutboundRouter3CreationTool());
		paletteContainer.add(createCustomOutboundRouter4CreationTool());
		paletteContainer.add(createEndpointSelectorRouter5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Response" palette tool group
	 * @generated
	 */
	private PaletteContainer createResponse6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Response6Group_title);
		paletteContainer.add(createResponseEndpoint1CreationTool());
		paletteContainer.add(createCustomResponseRouter2CreationTool());
		paletteContainer.add(createResponseRouter3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Catch All Strategies" palette tool group
	 * @generated
	 */
	private PaletteContainer createCatchAllStrategies7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.CatchAllStrategies7Group_title);
		paletteContainer.setDescription(Messages.CatchAllStrategies7Group_desc);
		paletteContainer.add(createLoggingCatchAllStrategy1CreationTool());
		paletteContainer.add(createForwardingCatchAllStrategy2CreationTool());
		paletteContainer.add(createCustomCatchAllStrategy3CreationTool());
		paletteContainer
				.add(createCustomForwardingCatchAllStrategyType4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSedaService1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.SedaServiceType_1001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SedaService1CreationTool_title,
				Messages.SedaService1CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.SedaServiceType_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBridgeComponent1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BridgeComponent1CreationTool_title,
				Messages.BridgeComponent1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEchoComponent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EchoComponent2CreationTool_title,
				Messages.EchoComponent2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNoArgsCallComponent3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.NoArgsCallWrapperType_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NoArgsCallComponent3CreationTool_title,
				Messages.NoArgsCallComponent3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.NoArgsCallWrapperType_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogComponent4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogComponent4CreationTool_title,
				Messages.LogComponent4CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNullComponent5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NullComponent5CreationTool_title,
				Messages.NullComponent5CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassThroughComponent6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PassThroughComponent6CreationTool_title,
				Messages.PassThroughComponent6CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPojoComponent7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.PojoComponentType_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PojoComponent7CreationTool_title,
				Messages.PojoComponent7CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.PojoComponentType_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomExceptionStrategy1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomExceptionStrategy1CreationTool_title,
				Messages.CustomExceptionStrategy1CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExceptionStrategy2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ExceptionStrategy2CreationTool_title,
				Messages.ExceptionStrategy2CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInboundEndpoint1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InboundEndpoint1CreationTool_title,
				Messages.InboundEndpoint1CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWireTapRouter2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.WireTapRouterType_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WireTapRouter2CreationTool_title,
				Messages.WireTapRouter2CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.WireTapRouterType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticRecipientListRouter3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.StaticRecipientListRouter3CreationTool_title,
				Messages.StaticRecipientListRouter3CreationTool_desc, null,
				null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelectiveConsumerRouter4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SelectiveConsumerRouter4CreationTool_title,
				Messages.SelectiveConsumerRouter4CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutboundRouter5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.OutboundRouter5CreationTool_title,
				Messages.OutboundRouter5CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChunkingRouter6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ChunkingRouter6CreationTool_title,
				Messages.ChunkingRouter6CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCorrelationRouter7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CorrelationRouter7CreationTool_title,
				Messages.CorrelationRouter7CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdempotentReceiver8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.IdempotentReceiver8CreationTool_title,
				Messages.IdempotentReceiver8CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForwardingRouter9CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ForwardingRouter9CreationTool_title,
				Messages.ForwardingRouter9CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilteredInboundRouter10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.FilteredInboundRouter10CreationTool_title,
				Messages.FilteredInboundRouter10CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomInboundRouter11CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomInboundRouter11CreationTool_title,
				Messages.CustomInboundRouter11CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCorrelationAggregatorRouter12CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CorrelationAggregatorRouter12CreationTool_title,
				Messages.CorrelationAggregatorRouter12CreationTool_desc, null,
				null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutboundEndpoint1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.OutboundEndpoint1CreationTool_title,
				Messages.OutboundEndpoint1CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageSplitterOutboundRouter2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.MessageSplitterOutboundRouter2CreationTool_title,
				Messages.MessageSplitterOutboundRouter2CreationTool_desc, null,
				null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilteringOutboundRouter3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.FilteringOutboundRouter3CreationTool_title,
				Messages.FilteringOutboundRouter3CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomOutboundRouter4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomOutboundRouter4CreationTool_title,
				Messages.CustomOutboundRouter4CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndpointSelectorRouter5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.EndpointSelectorRouter5CreationTool_title,
				Messages.EndpointSelectorRouter5CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResponseEndpoint1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ResponseEndpoint1CreationTool_title,
				Messages.ResponseEndpoint1CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomResponseRouter2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomResponseRouter2CreationTool_title,
				Messages.CustomResponseRouter2CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResponseRouter3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ResponseRouter3CreationTool_title,
				Messages.ResponseRouter3CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoggingCatchAllStrategy1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.LoggingCatchAllStrategy1CreationTool_title,
				Messages.LoggingCatchAllStrategy1CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForwardingCatchAllStrategy2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ForwardingCatchAllStrategy2CreationTool_title,
				Messages.ForwardingCatchAllStrategy2CreationTool_desc, null,
				null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomCatchAllStrategy3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomCatchAllStrategy3CreationTool_title,
				Messages.CustomCatchAllStrategy3CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomForwardingCatchAllStrategyType4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomForwardingCatchAllStrategyType4CreationTool_title,
				Messages.CustomForwardingCatchAllStrategyType4CreationTool_desc,
				null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
