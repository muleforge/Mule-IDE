package org.mule.ide.config.vm.editor.services.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.mule.ide.config.editor.services.providers.IServicesPaletteProvider;
import org.mule.ide.config.editor.services.providers.ServicesPaletteProvider;
import org.mule.ide.config.vm.VMPackage;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;

/**
 * @generated
 */
public class VMPaletteFactory {

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
		paletteContainer.add(createvmInboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound Endpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutboundEndpoints2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.OutboundEndpoints2Group_title);
		paletteContainer.add(createvmOutboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createvmInboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(VMElementTypes.InboundEndpointType_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.vmInboundEndpoint1CreationTool_title,
				Messages.vmInboundEndpoint1CreationTool_desc, types);
		entry.setSmallIcon(VMElementTypes
				.getImageDescriptor(VMElementTypes.InboundEndpointType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createvmOutboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(VMElementTypes.OutboundEndpointType_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.vmOutboundEndpoint1CreationTool_title,
				Messages.vmOutboundEndpoint1CreationTool_desc, types);
		entry.setSmallIcon(VMElementTypes
				.getImageDescriptor(VMElementTypes.OutboundEndpointType_2004));
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
			return VMPackage.eNS_URI;
		}

		public void getPaletteContributions(PaletteRoot paletteRoot) {
			new VMPaletteFactory().fillPalette(paletteRoot);
			List<PaletteContainer> children = new ArrayList<PaletteContainer>(
					IServicesPaletteProvider.NUM_GROUPS);
			children.add(DUMMY_CONTAINER);
			children.add(DUMMY_CONTAINER);
			children.add(DUMMY_CONTAINER);
			children.add((PaletteContainer) paletteRoot.getChildren().get(0));
			children.add(DUMMY_CONTAINER);
			children.add(DUMMY_CONTAINER);
			children.add((PaletteContainer) paletteRoot.getChildren().get(1));
			children.add(DUMMY_CONTAINER);
			paletteRoot.setChildren(children);
		}

	}

}
