package org.mule.ide.config.vm.editor.services.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;

/**
 * customization
 *   - implement createTool
 */
public class VMPaletteFactory extends PaletteFactory.Adapter {

	public Tool createTool(String toolId) {
		if (toolId
				.equals("org.mule.ide.config.vm.editor.services.InboundEndpoint")) {
			ToolEntry toolEntry = createVMInboundEndpoint1CreationTool();
			return toolEntry.createTool();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createInbound1Group());
		paletteRoot.add(createOutbound2Group());
	}

	/**
	 * Creates "Inbound" palette tool group
	 * @generated
	 */
	private PaletteContainer createInbound1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Inbound1Group_title);
		paletteContainer.add(createVMInboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Outbound" palette tool group
	 * @generated
	 */
	private PaletteContainer createOutbound2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Outbound2Group_title);
		paletteContainer.add(createVMOutboundEndpoint1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVMInboundEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(VMElementTypes.InboundEndpointType_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VMInboundEndpoint1CreationTool_title,
				Messages.VMInboundEndpoint1CreationTool_desc, types);
		entry.setSmallIcon(VMElementTypes
				.getImageDescriptor(VMElementTypes.InboundEndpointType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVMOutboundEndpoint1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.VMOutboundEndpoint1CreationTool_title,
				Messages.VMOutboundEndpoint1CreationTool_desc, null, null) {
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
