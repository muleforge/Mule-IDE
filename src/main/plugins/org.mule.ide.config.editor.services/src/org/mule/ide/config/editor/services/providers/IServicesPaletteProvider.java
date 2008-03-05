package org.mule.ide.config.editor.services.providers;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.IPaletteProvider;

public interface IServicesPaletteProvider extends IPaletteProvider {

	/*
	 * Services
	 * Components
	 * Exception Strategies
	 * Inbound Endpoints
	 * Inbound Routers
	 * Async Reply Routers
	 * Outbound Endpoints
	 * Outbound Routers
	 */
	public static final int SERVICE_GROUP_INDEX = 0;
	public static final int COMPONENT_GROUP_INDEX = 1;
	public static final int EXCEPTION_GROUP_INDEX = 2;
	public static final int INBOUND_ENDPOINT_GROUP_INDEX = 3;
	public static final int INBOUND_ROUTER_GROUP_INDEX = 4;
	public static final int ASYNC_GROUP_INDEX = 5;
	public static final int OUTBOUND_ENDPOINT_GROUP_INDEX = 6;
	public static final int OUTBOUND_ROUTER_GROUP_INDEX = 7;
	
	public static final int NUM_GROUPS = 8;
	public static final PaletteContainer DUMMY_CONTAINER = new PaletteGroup("dummy");
	
	public String getNSURI();
	
	/**
	 * Fill the palettte root with a list of child groups
	 * of length NUM_GROUPS with contributions in a 
	 * PaletteContainer at the expected position.
	 * 
	 * @param paletteRoot
	 */
	public void getPaletteContributions(PaletteRoot paletteRoot);
	
}
