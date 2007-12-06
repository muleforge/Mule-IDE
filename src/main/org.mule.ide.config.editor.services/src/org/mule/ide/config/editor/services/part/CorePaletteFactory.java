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
		paletteRoot.add(createInboundRouters2Group());
		paletteRoot.add(createComponents3Group());
		paletteRoot.add(createOutboundRouters4Group());
		paletteRoot.add(createResponseRouters5Group());
		paletteRoot.add(createExceptionStrategies6Group());
		paletteRoot.add(createEndpoints7Group());
		paletteRoot.add(createCatchAllStrategies8Group());
	}

	/**
	 * Creates "Services" palette tool group
	 * @generated
	 */
	private PaletteContainer createServices1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Services1Group_title);
		paletteContainer.add(createInboundRouterCollectionType1CreationTool());
		paletteContainer.add(createOutboundRouterCollectionType2CreationTool());
		paletteContainer.add(createResponseRouterCollectionType3CreationTool());
		paletteContainer.add(createSedaService4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Inbound Routers" palette tool group
	 * @generated
	 */
	private PaletteContainer createInboundRouters2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.InboundRouters2Group_title);
		paletteContainer.add(createWireTapRouter1CreationTool());
		paletteContainer.add(createStaticRecipientListRouter2CreationTool());
		paletteContainer.add(createSelectiveConsumerRouter3CreationTool());
		paletteContainer.add(createOutboundRouter4CreationTool());
		paletteContainer.add(createChunkingRouter5CreationTool());
		paletteContainer.add(createCorrelationRouter6CreationTool());
		paletteContainer.add(createIdempotentReceiver7CreationTool());
		paletteContainer.add(createForwardingRouter8CreationTool());
		paletteContainer.add(createFilteredInboundRouter9CreationTool());
		paletteContainer.add(createCustomInboundRouter10CreationTool());
		paletteContainer.add(createCorrelationAggregatorRouter11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponents3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Components3Group_title);
		paletteContainer.add(createPojoComponent1CreationTool());
		paletteContainer.add(createNoArgsComponent2CreationTool());
		paletteContainer.add(createDefaultComponent3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound Routers" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutboundRouters4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.OutboundRouters4Group_title);
		paletteContainer
				.add(createMessageSplitterOutboundRouter1CreationTool());
		paletteContainer.add(createFilteringOutboundRouter2CreationTool());
		paletteContainer.add(createCustomOutboundRouter3CreationTool());
		paletteContainer.add(createEndpointSelectorRouter4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Response Routers" palette tool group
	 * @generated
	 */
	private PaletteContainer createResponseRouters5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ResponseRouters5Group_title);
		paletteContainer.add(createCustomResponseRouter1CreationTool());
		paletteContainer.add(createResponseRouter2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Exception Strategies" palette tool group
	 * @generated
	 */
	private PaletteContainer createExceptionStrategies6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ExceptionStrategies6Group_title);
		paletteContainer.add(createCustomExceptionStrategy1CreationTool());
		paletteContainer.add(createExceptionStrategy2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Endpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createEndpoints7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Endpoints7Group_title);
		paletteContainer.add(createInboundEndpoint1CreationTool());
		paletteContainer.add(createOutboundEndpoint2CreationTool());
		paletteContainer.add(createResponseEndpoint3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Catch All Strategies" palette tool group
	 * @generated
	 */
	private PaletteContainer createCatchAllStrategies8Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.CatchAllStrategies8Group_title);
		paletteContainer.setDescription(Messages.CatchAllStrategies8Group_desc);
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
	private ToolEntry createInboundRouterCollectionType1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.InboundRouterCollectionType_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InboundRouterCollectionType1CreationTool_title,
				Messages.InboundRouterCollectionType1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.InboundRouterCollectionType_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutboundRouterCollectionType2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.OutboundRouterCollectionType_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutboundRouterCollectionType2CreationTool_title,
				Messages.OutboundRouterCollectionType2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.OutboundRouterCollectionType_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResponseRouterCollectionType3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ResponseRouterCollectionType_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ResponseRouterCollectionType3CreationTool_title,
				Messages.ResponseRouterCollectionType3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ResponseRouterCollectionType_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSedaService4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.SedaServiceType_1001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SedaService4CreationTool_title,
				Messages.SedaService4CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.SedaServiceType_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWireTapRouter1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.WireTapRouterType_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WireTapRouter1CreationTool_title,
				Messages.WireTapRouter1CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.WireTapRouterType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticRecipientListRouter2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.StaticRecipientListRouter2CreationTool_title,
				Messages.StaticRecipientListRouter2CreationTool_desc, null,
				null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelectiveConsumerRouter3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SelectiveConsumerRouter3CreationTool_title,
				Messages.SelectiveConsumerRouter3CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutboundRouter4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.OutboundRouter4CreationTool_title,
				Messages.OutboundRouter4CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChunkingRouter5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ChunkingRouter5CreationTool_title,
				Messages.ChunkingRouter5CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCorrelationRouter6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CorrelationRouter6CreationTool_title,
				Messages.CorrelationRouter6CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdempotentReceiver7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.IdempotentReceiver7CreationTool_title,
				Messages.IdempotentReceiver7CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForwardingRouter8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ForwardingRouter8CreationTool_title,
				Messages.ForwardingRouter8CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilteredInboundRouter9CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.FilteredInboundRouter9CreationTool_title,
				Messages.FilteredInboundRouter9CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomInboundRouter10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomInboundRouter10CreationTool_title,
				Messages.CustomInboundRouter10CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCorrelationAggregatorRouter11CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CorrelationAggregatorRouter11CreationTool_title,
				Messages.CorrelationAggregatorRouter11CreationTool_desc, null,
				null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPojoComponent1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.PojoComponentType_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PojoComponent1CreationTool_title,
				Messages.PojoComponent1CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.PojoComponentType_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNoArgsComponent2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.NoArgsComponent2CreationTool_title,
				Messages.NoArgsComponent2CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDefaultComponent3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DefaultComponent3CreationTool_title,
				Messages.DefaultComponent3CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageSplitterOutboundRouter1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.MessageSplitterOutboundRouter1CreationTool_title,
				Messages.MessageSplitterOutboundRouter1CreationTool_desc, null,
				null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilteringOutboundRouter2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.FilteringOutboundRouter2CreationTool_title,
				Messages.FilteringOutboundRouter2CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomOutboundRouter3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomOutboundRouter3CreationTool_title,
				Messages.CustomOutboundRouter3CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndpointSelectorRouter4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.EndpointSelectorRouter4CreationTool_title,
				Messages.EndpointSelectorRouter4CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomResponseRouter1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CustomResponseRouter1CreationTool_title,
				Messages.CustomResponseRouter1CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResponseRouter2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ResponseRouter2CreationTool_title,
				Messages.ResponseRouter2CreationTool_desc, null, null) {
		};
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
	private ToolEntry createOutboundEndpoint2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.OutboundEndpoint2CreationTool_title,
				Messages.OutboundEndpoint2CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResponseEndpoint3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ResponseEndpoint3CreationTool_title,
				Messages.ResponseEndpoint3CreationTool_desc, null, null) {
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
