package org.mule.ide.config.axis.editor.services.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.editor.services.providers.AxisElementTypes;
import org.mule.ide.config.editor.services.providers.IServicesPaletteProvider;
import org.mule.ide.config.editor.services.providers.ServicesPaletteProvider;

/**
 * @generated
 */
public class AxisPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createInboundEndpoints1Group());
		paletteRoot.add(createOutboundEndpoints2Group());
	}

	/**
	 * Creates "Inbound Endpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createInboundEndpoints1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.InboundEndpoints1Group_title);
		paletteContainer.add(createaxisInboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound Endpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutboundEndpoints2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.OutboundEndpoints2Group_title);
		paletteContainer.add(createaxisOutboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createaxisInboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(AxisElementTypes.InboundEndpointType_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.axisInboundEndpoint1CreationTool_title,
				Messages.axisInboundEndpoint1CreationTool_desc, types);
		entry.setSmallIcon(AxisElementTypes
				.getImageDescriptor(AxisElementTypes.InboundEndpointType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createaxisOutboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(AxisElementTypes.OutboundEndpointType_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.axisOutboundEndpoint1CreationTool_title,
				Messages.axisOutboundEndpoint1CreationTool_desc, types);
		entry
				.setSmallIcon(AxisElementTypes
						.getImageDescriptor(AxisElementTypes.OutboundEndpointType_2004));
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
			return AxisPackage.eNS_URI;
		}

		public void getPaletteContributions(PaletteRoot paletteRoot) {
			new AxisPaletteFactory().fillPalette(paletteRoot);
			List<PaletteContainer> children = new ArrayList<PaletteContainer>(
					IServicesPaletteProvider.NUM_GROUPS);
			// Services
			children.add(DUMMY_CONTAINER);
			// Components
			children.add(DUMMY_CONTAINER);
			// Exception Strategies
			children.add(DUMMY_CONTAINER);
			// Inbound Endpoints
			children.add((PaletteContainer) paletteRoot.getChildren().get(0));
			// Inbound Routers
			children.add(DUMMY_CONTAINER);
			// Async Reply Routers
			children.add(DUMMY_CONTAINER);
			// Outbound Endpoints
			children.add((PaletteContainer) paletteRoot.getChildren().get(1));
			// Outbound Routers
			children.add(DUMMY_CONTAINER);
			paletteRoot.setChildren(children);
		}

	}
}
