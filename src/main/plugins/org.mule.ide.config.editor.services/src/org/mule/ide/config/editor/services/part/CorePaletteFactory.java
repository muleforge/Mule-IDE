package org.mule.ide.config.editor.services.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.jface.resource.ImageDescriptor;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;
import org.mule.ide.config.editor.services.providers.ServicesPaletteProvider;

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
		paletteRoot.add(createInboundEndpoints4Group());
		paletteRoot.add(createInboundRouters5Group());
		paletteRoot.add(createAsyncReply6Group());
		paletteRoot.add(createOutboundEndpoints7Group());
		paletteRoot.add(createOutboundRouters8Group());
	}

	/**
	 * customization
	 *   - use drawers defined in extension xml
	 */
	/*
	public void fillPaletteOld(PaletteRoot paletteRoot) {
		PaletteContainer group = null;
		Iterator itr = paletteRoot.getChildren().iterator();
		while (itr.hasNext()) {
			PaletteContainer next = (PaletteContainer) itr.next();
			if ("org.mule.ide.config.editor.services.Services".equals(next
					.getId())) {
				group = next;
				break;
			}
		}
		if (group == null)
			return; // or assert?

		// TODO:  Probably be getting the images for the abstract types directly.
		// TODO:  May need different default icon for endpoint vs router

		PaletteContainer paletteContainer;
		paletteContainer = createServices1Group();
		addEntries(
				(List<PaletteEntry>) paletteContainer.getChildren(),
				group,
				CoreElementTypes
						.getImageDescriptor(CoreElementTypes.SedaServiceType_1001));

		paletteContainer = createComponents2Group();
		group = (PaletteContainer) itr.next();
		addEntries(
				(List<PaletteEntry>) paletteContainer.getChildren(),
				group,
				CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2002));

		paletteContainer = createExceptionStrategies3Group();
		group = (PaletteContainer) itr.next();
		addEntries(
				(List<PaletteEntry>) paletteContainer.getChildren(),
				group,
				CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ExceptionStrategyType_2010));

		paletteContainer = createInbound4Group();
		group = (PaletteContainer) itr.next();
		addEntries(
				(List<PaletteEntry>) paletteContainer.getChildren(),
				group,
				CoreElementTypes
						.getImageDescriptor(CoreElementTypes.InboundEndpointType_2013));

		paletteContainer = createAsyncReply5Group();
		group = (PaletteContainer) itr.next();
		addEntries(
				(List<PaletteEntry>) paletteContainer.getChildren(),
				group,
				CoreElementTypes
						.getImageDescriptor(CoreElementTypes.AsyncReplyRouterType_2026));

		paletteContainer = createOutbound6Group();
		group = (PaletteContainer) itr.next();
		addEntries(
				(List<PaletteEntry>) paletteContainer.getChildren(),
				group,
				CoreElementTypes
						.getImageDescriptor(CoreElementTypes.OutboundEndpointType_2030));
	}
	*/

	/*
	 * Prepends the entries defined in this factory ahead of any entries
	 * that were added through extension xml.
	 * Will apply a default image if entry doesn't have an icon.
	 */
	/*
	private void addEntries(List<PaletteEntry> entries, PaletteContainer group,
			ImageDescriptor defaultImage) {
		boolean skipSeparator = true;
		List existingChildren = group.getChildren();
		Iterator existingChildrenItr = existingChildren.iterator();
		List<PaletteEntry> newChildren = new ArrayList(entries.size()
				+ existingChildren.size() + 1);
		for (PaletteEntry entry : entries) {
			// When encountering a separator in the entries defined in this factory, 
			// add entries from extension xml up to and including the next separator.
			// Except skip the first separator which is just a placeholder.
			if (entry instanceof PaletteSeparator) {
				while (existingChildrenItr.hasNext()) {
					PaletteEntry existingEntry = (PaletteEntry) existingChildrenItr
							.next();
					if (existingEntry instanceof PaletteSeparator
							&& skipSeparator) {
						// Delete the first separator defined in extension xml.
						// It's only there just as a placeholder used to add entries to the first
						// section.
						skipSeparator = false;
						if (!existingChildrenItr.hasNext()) {
							break;
						}
						existingEntry = (PaletteEntry) existingChildrenItr
								.next();
					}
					addDefaultIcon(existingEntry, defaultImage);
					newChildren.add(existingEntry);
					if (existingEntry instanceof PaletteSeparator) {
						break;
					}
				}
			} else {
				newChildren.add(entry);
			}
		}
		while (existingChildrenItr.hasNext()) {
			PaletteEntry existingEntry = (PaletteEntry) existingChildrenItr
					.next();
			newChildren.add(existingEntry);
		}
		group.setChildren(newChildren);
	}
	*/

	/*
	private void addDefaultIcon(PaletteEntry entry, ImageDescriptor defaultImage) {
		if (defaultImage == null || entry instanceof PaletteSeparator) {
			return;
		}
		if (entry.getSmallIcon() == null) {
			entry.setSmallIcon(defaultImage);
		}
	}
	*/

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
		paletteContainer.add(createLogComponent3CreationTool());
		paletteContainer.add(createNullComponent4CreationTool());
		paletteContainer.add(createPassThroughComponent5CreationTool());
		paletteContainer.add(createPojoComponent6CreationTool());
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
	 * Creates "Inbound Endpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createInboundEndpoints4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.InboundEndpoints4Group_title);
		paletteContainer.add(createInboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Inbound Routers" palette tool group
	 * @generated
	 */
	private PaletteContainer createInboundRouters5Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.InboundRouters5Group_title);
		paletteContainer.add(createCorrelationAggregatorRouter1CreationTool());
		paletteContainer.add(createCorrelationResequencerRouter2CreationTool());
		paletteContainer.add(createChunkingInboundRouter3CreationTool());
		paletteContainer.add(createCustomInboundRouter4CreationTool());
		paletteContainer.add(createForwardingRouter5CreationTool());
		paletteContainer.add(createIdempotentReceiverRouter6CreationTool());
		paletteContainer
				.add(createIdempotentSecureReceiverRouter7CreationTool());
		paletteContainer.add(createPassThroughInboundRouter8CreationTool());
		paletteContainer.add(createSelectiveConsumerRouter9CreationTool());
		paletteContainer.add(createWireTapRouter10CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Async Reply" palette tool group
	 * @generated
	 */
	private PaletteContainer createAsyncReply6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.AsyncReply6Group_title);
		paletteContainer.add(createCustomAsyncReplyRouter1CreationTool());
		paletteContainer.add(createSingleAsyncReplyRouter2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound Endpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutboundEndpoints7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.OutboundEndpoints7Group_title);
		paletteContainer.add(createOutboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound Routers" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutboundRouters8Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.OutboundRouters8Group_title);
		paletteContainer.add(createChainingRouter1CreationTool());
		paletteContainer.add(createChunkingOutboundRouter2CreationTool());
		paletteContainer.add(createCustomOutboundRouter3CreationTool());
		paletteContainer.add(createEndpointSelectorRouter4CreationTool());
		paletteContainer.add(createExceptionRouter5CreationTool());
		paletteContainer.add(createFilteringRouter6CreationTool());
		paletteContainer.add(createListMessageSplitterRouter7CreationTool());
		paletteContainer.add(createMulticastingRouter8CreationTool());
		paletteContainer.add(createPassThroughOutboundRouter9CreationTool());
		paletteContainer.add(createStaticRecipientListRouter10CreationTool());
		paletteContainer.add(createTemplateEndpointRouter11CreationTool());
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
		types.add(CoreElementTypes.DefaultComponentType_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BridgeComponent1CreationTool_title,
				Messages.BridgeComponent1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEchoComponent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EchoComponent2CreationTool_title,
				Messages.EchoComponent2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogComponent3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogComponent3CreationTool_title,
				Messages.LogComponent3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNullComponent4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NullComponent4CreationTool_title,
				Messages.NullComponent4CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassThroughComponent5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.DefaultComponentType_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PassThroughComponent5CreationTool_title,
				Messages.PassThroughComponent5CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.DefaultComponentType_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPojoComponent6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.PojoComponentType_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PojoComponent6CreationTool_title,
				Messages.PojoComponent6CreationTool_desc, types);
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
		types.add(CoreElementTypes.ExceptionStrategyType_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectorExceptionStrategy1CreationTool_title,
				Messages.ConnectorExceptionStrategy1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ExceptionStrategyType_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomExceptionStrategy2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomExceptionStrategyType_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomExceptionStrategy2CreationTool_title,
				Messages.CustomExceptionStrategy2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomExceptionStrategyType_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceExceptionStrategy3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ExceptionStrategyType_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceExceptionStrategy3CreationTool_title,
				Messages.ServiceExceptionStrategy3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ExceptionStrategyType_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoreElementTypes.InboundEndpointType_2013);
		types.add(CoreElementTypes.InboundEndpointType_2025);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InboundEndpoint1CreationTool_title,
				Messages.InboundEndpoint1CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.InboundEndpointType_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCorrelationAggregatorRouter1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomCorrelationAggregatorRouterType_2022);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CorrelationAggregatorRouter1CreationTool_title,
				Messages.CorrelationAggregatorRouter1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomCorrelationAggregatorRouterType_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCorrelationResequencerRouter2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.SelectiveConsumerRouterType_2021);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CorrelationResequencerRouter2CreationTool_title,
				Messages.CorrelationResequencerRouter2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.SelectiveConsumerRouterType_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChunkingInboundRouter3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.MessageChunkingAggregatorRouterType_2020);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ChunkingInboundRouter3CreationTool_title,
				Messages.ChunkingInboundRouter3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.MessageChunkingAggregatorRouterType_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomInboundRouter4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomInboundRouterType_2023);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomInboundRouter4CreationTool_title,
				Messages.CustomInboundRouter4CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomInboundRouterType_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForwardingRouter5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ForwardingRouterType_2014);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ForwardingRouter5CreationTool_title,
				Messages.ForwardingRouter5CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.ForwardingRouterType_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdempotentReceiverRouter6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.IdempotentReceiverRouterType_2017);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IdempotentReceiverRouter6CreationTool_title,
				Messages.IdempotentReceiverRouter6CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.IdempotentReceiverRouterType_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIdempotentSecureReceiverRouter7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteredInboundRouterType_2015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IdempotentSecureReceiverRouter7CreationTool_title,
				Messages.IdempotentSecureReceiverRouter7CreationTool_desc,
				types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteredInboundRouterType_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassThroughInboundRouter8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteredInboundRouterType_2016);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PassThroughInboundRouter8CreationTool_title,
				Messages.PassThroughInboundRouter8CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteredInboundRouterType_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelectiveConsumerRouter9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.SelectiveConsumerRouterType_2019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SelectiveConsumerRouter9CreationTool_title,
				Messages.SelectiveConsumerRouter9CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.SelectiveConsumerRouterType_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWireTapRouter10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.WireTapRouterType_2018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WireTapRouter10CreationTool_title,
				Messages.WireTapRouter10CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.WireTapRouterType_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomAsyncReplyRouter1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomAsyncReplyRouterType_2027);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomAsyncReplyRouter1CreationTool_title,
				Messages.CustomAsyncReplyRouter1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomAsyncReplyRouterType_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleAsyncReplyRouter2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.AsyncReplyRouterType_2026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SingleAsyncReplyRouter2CreationTool_title,
				Messages.SingleAsyncReplyRouter2CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.AsyncReplyRouterType_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CoreElementTypes.OutboundEndpointType_2009);
		types.add(CoreElementTypes.OutboundEndpointType_2030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutboundEndpoint1CreationTool_title,
				Messages.OutboundEndpoint1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.OutboundEndpointType_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChainingRouter1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ChainingRouter1CreationTool_title,
				Messages.ChainingRouter1CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChunkingOutboundRouter2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.ChunkingRouterType_2038);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ChunkingOutboundRouter2CreationTool_title,
				Messages.ChunkingOutboundRouter2CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.ChunkingRouterType_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomOutboundRouter3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.CustomOutboundRouterType_2040);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomOutboundRouter3CreationTool_title,
				Messages.CustomOutboundRouter3CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.CustomOutboundRouterType_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndpointSelectorRouter4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.EndpointSelectorRouterType_2036);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EndpointSelectorRouter4CreationTool_title,
				Messages.EndpointSelectorRouter4CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.EndpointSelectorRouterType_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExceptionRouter5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2033);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExceptionRouter5CreationTool_title,
				Messages.ExceptionRouter5CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilteringRouter6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilteringRouter6CreationTool_title,
				Messages.FilteringRouter6CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createListMessageSplitterRouter7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.MessageSplitterOutboundRouterType_2037);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ListMessageSplitterRouter7CreationTool_title,
				Messages.ListMessageSplitterRouter7CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.MessageSplitterOutboundRouterType_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMulticastingRouter8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2034);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MulticastingRouter8CreationTool_title,
				Messages.MulticastingRouter8CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPassThroughOutboundRouter9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.OutboundRouterType_2029);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PassThroughOutboundRouter9CreationTool_title,
				Messages.PassThroughOutboundRouter9CreationTool_desc, types);
		entry.setSmallIcon(CoreElementTypes
				.getImageDescriptor(CoreElementTypes.OutboundRouterType_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticRecipientListRouter10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.StaticRecipientListRouterType_2039);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StaticRecipientListRouter10CreationTool_title,
				Messages.StaticRecipientListRouter10CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.StaticRecipientListRouterType_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateEndpointRouter11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CoreElementTypes.FilteringOutboundRouterType_2035);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateEndpointRouter11CreationTool_title,
				Messages.TemplateEndpointRouter11CreationTool_desc, types);
		entry
				.setSmallIcon(CoreElementTypes
						.getImageDescriptor(CoreElementTypes.FilteringOutboundRouterType_2035));
		entry.setLargeIcon(entry.getSmallIcon());
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

	static public class PaletteProvider extends ServicesPaletteProvider {

		public PaletteProvider() {
			super();
		}

		public String getNSURI() {
			return CorePackage.eNS_URI;
		}

		public void getPaletteContributions(PaletteRoot paletteRoot) {
			new CorePaletteFactory().fillPalette(paletteRoot);
		}

	}

}
