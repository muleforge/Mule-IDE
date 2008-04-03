package org.mule.ide.config.jms.editor.services.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.editor.services.providers.IServicesPaletteProvider;
import org.mule.ide.config.editor.services.providers.ServicesPaletteProvider;
import org.mule.ide.config.jms.editor.services.providers.JMSElementTypes;

/**
 * @generated
 */
public class JMSPaletteFactory {

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
		paletteContainer.add(createjmsInboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound Endpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutboundEndpoints2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.OutboundEndpoints2Group_title);
		paletteContainer.add(createjmsOutboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createjmsInboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(JMSElementTypes.InboundEndpointType_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.jmsInboundEndpoint1CreationTool_title,
				Messages.jmsInboundEndpoint1CreationTool_desc, types);
		entry.setSmallIcon(JMSElementTypes
				.getImageDescriptor(JMSElementTypes.InboundEndpointType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createjmsOutboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(JMSElementTypes.OutboundEndpointType_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.jmsOutboundEndpoint1CreationTool_title,
				Messages.jmsOutboundEndpoint1CreationTool_desc, types);
		entry
				.setSmallIcon(JMSElementTypes
						.getImageDescriptor(JMSElementTypes.OutboundEndpointType_2004));
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
			return JMSPackage.eNS_URI;
		}

		public void getPaletteContributions(PaletteRoot paletteRoot) {
			new JMSPaletteFactory().fillPalette(paletteRoot);
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
