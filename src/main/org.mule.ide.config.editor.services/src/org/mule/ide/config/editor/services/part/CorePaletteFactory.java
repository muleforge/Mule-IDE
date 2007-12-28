package org.mule.ide.config.editor.services.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
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
		paletteRoot.add(createResponse5Group());
		paletteRoot.add(createOutbound6Group());
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
		paletteContainer.add(createConnectorExceptionStrategy1CreationTool());
		paletteContainer.add(createCustomExceptionStrategy2CreationTool());
		paletteContainer.add(createServiceExceptionStrategy3CreationTool());
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
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAggregatorRouter3CreationTool());
		paletteContainer.add(createChunkingInboundRouter4CreationTool());
		paletteContainer.add(createCustomInboundRouter5CreationTool());
		paletteContainer.add(createForwardingRouter6CreationTool());
		paletteContainer.add(createIdempotentReceiverRouter7CreationTool());
		paletteContainer
				.add(createIdempotentSecureReceiverRouter8CreationTool());
		paletteContainer.add(createPassThroughInboundRouter9CreationTool());
		paletteContainer.add(createResequencerRouter10CreationTool());
		paletteContainer.add(createSelectiveConsumerRouter11CreationTool());
		paletteContainer.add(createWireTapRouter12CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Response" palette tool group
	 * @generated
	 */
	private PaletteContainer createResponse5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Response5Group_title);
		paletteContainer.add(createResponseEndpoint1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createCustomResponseRouter3CreationTool());
		paletteContainer.add(createSingleResponseRouter4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutbound6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Outbound6Group_title);
		paletteContainer.add(createOutboundEndpoint1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createChainingRouter3CreationTool());
		paletteContainer.add(createChunkingOutboundRouter4CreationTool());
		paletteContainer.add(createCustomOutboundRouter5CreationTool());
		paletteContainer.add(createEndpointSelectorRouter6CreationTool());
		paletteContainer.add(createExceptionRouter7CreationTool());
		paletteContainer.add(createFilteringRouter8CreationTool());
		paletteContainer.add(createListMessageSplitterRouter9CreationTool());
		paletteContainer.add(createMulticastingRouter10CreationTool());
		paletteContainer.add(createPassThroughOutboundRouter11CreationTool());
		paletteContainer.add(createStaticRecipientListRouter12CreationTool());
		paletteContainer.add(createTemplateEndpointRouter13CreationTool());
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
		types.add(CoreElementTypes.DefaultComponentType_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BridgeComponent1CreationTool_title,
				Messages.BridgeComponent1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEchoComponent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EchoComponent2CreationTool_title,
				Messages.EchoComponent2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNoArgsCallComponent3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.NoArgsCallWrapperType_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NoArgsCallComponent3CreationTool_title,
				Messages.NoArgsCallComponent3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.NoArgsCallWrapperType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogComponent4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogComponent4CreationTool_title,
				Messages.LogComponent4CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNullComponent5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NullComponent5CreationTool_title,
				Messages.NullComponent5CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassThroughComponent6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PassThroughComponent6CreationTool_title,
				Messages.PassThroughComponent6CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPojoComponent7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.PojoComponentType_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PojoComponent7CreationTool_title,
				Messages.PojoComponent7CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.PojoComponentType_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectorExceptionStrategy1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ExceptionStrategyType_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectorExceptionStrategy1CreationTool_title,
				Messages.ConnectorExceptionStrategy1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ExceptionStrategyType_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomExceptionStrategy2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomExceptionStrategyType_2012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomExceptionStrategy2CreationTool_title,
				Messages.CustomExceptionStrategy2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomExceptionStrategyType_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceExceptionStrategy3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ExceptionStrategyType_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceExceptionStrategy3CreationTool_title,
				Messages.ServiceExceptionStrategy3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ExceptionStrategyType_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.InboundEndpointType_2014);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InboundEndpoint1CreationTool_title,
				Messages.InboundEndpoint1CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.InboundEndpointType_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregatorRouter3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CorrelationAggregatorRouterType_2023);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AggregatorRouter3CreationTool_title,
				Messages.AggregatorRouter3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CorrelationAggregatorRouterType_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChunkingInboundRouter4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CorrelationRouterType_2021);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ChunkingInboundRouter4CreationTool_title,
				Messages.ChunkingInboundRouter4CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CorrelationRouterType_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomInboundRouter5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomInboundRouterType_2024);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomInboundRouter5CreationTool_title,
				Messages.CustomInboundRouter5CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomInboundRouterType_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForwardingRouter6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ForwardingRouterType_2015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ForwardingRouter6CreationTool_title,
				Messages.ForwardingRouter6CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ForwardingRouterType_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdempotentReceiverRouter7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.IdempotentReceiverType_2018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IdempotentReceiverRouter7CreationTool_title,
				Messages.IdempotentReceiverRouter7CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.IdempotentReceiverType_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdempotentSecureReceiverRouter8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteredInboundRouterType_2016);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IdempotentSecureReceiverRouter8CreationTool_title,
				Messages.IdempotentSecureReceiverRouter8CreationTool_desc,
				types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteredInboundRouterType_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassThroughInboundRouter9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteredInboundRouterType_2017);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PassThroughInboundRouter9CreationTool_title,
				Messages.PassThroughInboundRouter9CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteredInboundRouterType_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResequencerRouter10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CorrelationRouterType_2022);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ResequencerRouter10CreationTool_title,
				Messages.ResequencerRouter10CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CorrelationRouterType_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelectiveConsumerRouter11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.SelectiveConsumerRouterType_2020);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SelectiveConsumerRouter11CreationTool_title,
				Messages.SelectiveConsumerRouter11CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.SelectiveConsumerRouterType_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWireTapRouter12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.WireTapRouterType_2019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WireTapRouter12CreationTool_title,
				Messages.WireTapRouter12CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.WireTapRouterType_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.OutboundEndpointType_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutboundEndpoint1CreationTool_title,
				Messages.OutboundEndpoint1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.OutboundEndpointType_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChainingRouter3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ChainingRouter3CreationTool_title,
				Messages.ChainingRouter3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChunkingOutboundRouter4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ChunkingRouterType_2038);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ChunkingOutboundRouter4CreationTool_title,
				Messages.ChunkingOutboundRouter4CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.ChunkingRouterType_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomOutboundRouter5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomOutboundRouterType_2040);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomOutboundRouter5CreationTool_title,
				Messages.CustomOutboundRouter5CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomOutboundRouterType_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndpointSelectorRouter6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.EndpointSelectorRouterType_2036);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EndpointSelectorRouter6CreationTool_title,
				Messages.EndpointSelectorRouter6CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.EndpointSelectorRouterType_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExceptionRouter7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2033);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExceptionRouter7CreationTool_title,
				Messages.ExceptionRouter7CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilteringRouter8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilteringRouter8CreationTool_title,
				Messages.FilteringRouter8CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createListMessageSplitterRouter9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.MessageSplitterOutboundRouterType_2037);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ListMessageSplitterRouter9CreationTool_title,
				Messages.ListMessageSplitterRouter9CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.MessageSplitterOutboundRouterType_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMulticastingRouter10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2034);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MulticastingRouter10CreationTool_title,
				Messages.MulticastingRouter10CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassThroughOutboundRouter11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.OutboundRouterType_2030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PassThroughOutboundRouter11CreationTool_title,
				Messages.PassThroughOutboundRouter11CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.OutboundRouterType_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticRecipientListRouter12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.StaticRecipientListRouterType_2039);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StaticRecipientListRouter12CreationTool_title,
				Messages.StaticRecipientListRouter12CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.StaticRecipientListRouterType_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateEndpointRouter13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2035);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateEndpointRouter13CreationTool_title,
				Messages.TemplateEndpointRouter13CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResponseEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ResponseEndpointType_2026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ResponseEndpoint1CreationTool_title,
				Messages.ResponseEndpoint1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ResponseEndpointType_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomResponseRouter3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomResponseRouterType_2028);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomResponseRouter3CreationTool_title,
				Messages.CustomResponseRouter3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomResponseRouterType_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleResponseRouter4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ResponseRouterType_2027);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SingleResponseRouter4CreationTool_title,
				Messages.SingleResponseRouter4CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.ResponseRouterType_2027));
		entry.setLargeIcon(entry.getSmallIcon());
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
