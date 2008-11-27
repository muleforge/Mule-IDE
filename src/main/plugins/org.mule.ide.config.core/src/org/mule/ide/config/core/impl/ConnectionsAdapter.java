package org.mule.ide.config.core.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.AbstractOutboundRouterType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.Connection;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundCollectionType;
import org.mule.ide.config.core.InboundEndpointType;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.core.OutboundEndpointType;
import org.mule.ide.config.core.OutboundRouterType;
import org.mule.ide.config.core.SedaModelType;
import org.mule.ide.config.core.SedaServiceType;

public class ConnectionsAdapter extends EContentAdapter {

	private static final boolean DEBUG = false;

	private SedaModelType model;
	private EditingDomain editingDomain;
	// Keep a map of global endpoint name to Connections in the Model list.
	private HashMap<String, List<Connection>> mapNameToConnection = new HashMap<String, List<Connection>>();
	// Map of endpoint name to reference count.
	private HashMap<String, List<SourceEndpointReference>> sourceRefs = new HashMap<String, List<SourceEndpointReference>>();
	private HashMap<String, List<TargetEndpointReference>> targetRefs = new HashMap<String, List<TargetEndpointReference>>();
	
    public ConnectionsAdapter(SedaModelType model) {
        model.eAdapters().add(this);
        this.model = model;
    }
    
    public void initialize(EditingDomain editingDomain) {
    	this.editingDomain = editingDomain;
    	
    	//model.getConnections().clear();
    	//mapNameToConnection.clear();
    	//sourceRefs.clear();
    	//targetRefs.clear();
    	
    	// Walk the model looking for inbound and outbound endpoints
    	EList<AbstractServiceType> services = model.getAbstractService();
    	List<Connection> results = new ArrayList<Connection>();
    	for (AbstractServiceType service : services) {
    		if (service instanceof SedaServiceType) {
    			SedaServiceType sedaService = (SedaServiceType) service;
    			AsyncReplyCollectionType asyncCollection = sedaService.getAsyncReply();
    			if (asyncCollection != null) {
    				initInboundEndpoints(sedaService, asyncCollection.getAbstractInboundEndpoint(), results);
    			}
    			InboundCollectionType inboundCollection = sedaService.getInbound();
    			if (inboundCollection != null) {
    				initInboundEndpoints(sedaService, inboundCollection.getAbstractInboundEndpoint(), results);
    			}
    			OutboundCollectionType outboundCollection = sedaService.getOutbound();
    			if (outboundCollection != null) {
    				initOutboundRouters(sedaService, outboundCollection.getAbstractOutboundRouter(), results);
    			}
    		}
    	}
    	addConnection(results);
    }
    

    @Override
    public void notifyChanged(Notification n){
        
        super.notifyChanged(n);
        
        if (n.getEventType() == Notification.SET
        		&& n.getNotifier() instanceof InboundEndpointType
        		&& (n.getFeatureID(InboundEndpointType.class) == CorePackage.INBOUND_ENDPOINT_TYPE__REF
        				|| n.getFeatureID(InboundEndpointType.class) == CorePackage.INBOUND_ENDPOINT_TYPE__ADDRESS)) {
        	
        	handleInboundEndpointRefSet(n);
        	
        } else if (n.getEventType() == Notification.SET
        		&& n.getNotifier() instanceof OutboundEndpointType
        		&& (n.getFeatureID(OutboundEndpointType.class) == CorePackage.OUTBOUND_ENDPOINT_TYPE__REF
        				|| n.getFeatureID(OutboundEndpointType.class) == CorePackage.OUTBOUND_ENDPOINT_TYPE__ADDRESS)) {
        	
        	handleOutboundEndpointRefSet(n);
            
        } else if (n.getEventType() == Notification.ADD
        		&& n.getNewValue() instanceof InboundEndpointType) {
        	
        	List<Connection> results = new ArrayList<Connection>();
        	handleInboundEndpointAdd((InboundEndpointType) n.getNewValue(), results);
        	addConnection(results);

        } else if (n.getEventType() == Notification.ADD
        		&& n.getNewValue() instanceof OutboundEndpointType) {
        	
        	List<Connection> results = new ArrayList<Connection>();
        	handleOutboundEndpointAdd((OutboundEndpointType) n.getNewValue(), results);
        	addConnection(results);

        }
        
        // TODO Endpoint Notification.DELETE

    }
    
    private void handleInboundEndpointRefSet(Notification n) {
    	String oldRef = n.getOldStringValue();
    	//AbstractGlobalEndpointType oldGlobalEndpoint = getGlobalEndpoint(oldRef);
    	String newRef = n.getNewStringValue();
    	//AbstractGlobalEndpointType newGlobalEndpoint = getGlobalEndpoint(newRef);
    	if (oldRef == null && newRef == null) return;
    	
    	InboundEndpointType inboundEndpoint = (InboundEndpointType) n.getNotifier();
    	SedaServiceType service = getContainingService(inboundEndpoint);
    	if (service == null) return;
    	
        if (oldRef != null) {
        	List<Connection> results = new ArrayList<Connection>();
        	removeTargetRef(service, oldRef, results);
        	removeConnection(results);
        }
 
        if (newRef != null) {
        	List<Connection> results = new ArrayList<Connection>();
        	addTargetRef(service, newRef, results);
        	addConnection(results);
        }
    }


    private void handleOutboundEndpointRefSet(Notification n) {
    	String oldRef = n.getOldStringValue();
    	//AbstractGlobalEndpointType oldGlobalEndpoint = getGlobalEndpoint(oldRef);
    	String newRef = n.getNewStringValue();
    	//AbstractGlobalEndpointType newGlobalEndpoint = getGlobalEndpoint(newRef);
    	if (oldRef == null && newRef == null) return;
   	
    	OutboundEndpointType outboundEndpoint = (OutboundEndpointType) n.getNotifier();
    	SedaServiceType service = getContainingService(outboundEndpoint);
    	if (service == null) return;
    	
        if (oldRef != null) {
        	List<Connection> results = new ArrayList<Connection>();
        	removeSourceRef(service, oldRef, results);
        	removeConnection(results);
        }
 
        if (newRef != null) {
        	List<Connection> results = new ArrayList<Connection>();
        	addSourceRef(service, newRef, results);
        	addConnection(results);
        }
    }

    private void initOutboundRouters(SedaServiceType service, EList<AbstractOutboundRouterType> outboundRouters, List<Connection> results) {
		for (AbstractOutboundRouterType outboundRouter : outboundRouters) {
			if (outboundRouter instanceof OutboundRouterType) {
				initOutboundEndpoints(service, ((OutboundRouterType) outboundRouter).getAbstractOutboundEndpoint(), results);
			}
		}    	
    }
    
    private void initInboundEndpoints(SedaServiceType service, EList<AbstractInboundEndpointType> inboundEndpoints, List<Connection> results) {
		for (AbstractInboundEndpointType inboundEndpoint : inboundEndpoints) {
			if (inboundEndpoint instanceof InboundEndpointType) {
				handleInboundEndpointAdd(service, (InboundEndpointType) inboundEndpoint, results);
			}
		}    	
    }

    private void initOutboundEndpoints(SedaServiceType service, EList<AbstractOutboundEndpointType> outboundEndpoints, List<Connection> results) {
		for (AbstractOutboundEndpointType outboundEndpoint : outboundEndpoints) {
			if (outboundEndpoint instanceof OutboundEndpointType) {
				handleOutboundEndpointAdd(service, (OutboundEndpointType) outboundEndpoint, results);
			}
		}    	
    }

    private void handleInboundEndpointAdd(InboundEndpointType inboundEndpoint, List<Connection> results) {
    	SedaServiceType service = getContainingService(inboundEndpoint);
    	if (service == null) return;
    	handleInboundEndpointAdd(service, inboundEndpoint, results);
    }

    private void handleInboundEndpointAdd(SedaServiceType service, InboundEndpointType inboundEndpoint, List<Connection> results) {
    	String ref = inboundEndpoint.getRef();
    	if (ref == null) {
	    	ref = inboundEndpoint.getAddress();
	    	if (ref == null) return;
    	}
    	
    	addTargetRef(service, ref, results);   	
    }
    
    private void handleOutboundEndpointAdd(OutboundEndpointType outboundEndpoint, List<Connection> results) {
    	SedaServiceType service = getContainingService(outboundEndpoint);
    	if (service == null) return;
    	handleOutboundEndpointAdd(service, outboundEndpoint, results);
    }

    private void handleOutboundEndpointAdd(SedaServiceType service, OutboundEndpointType outboundEndpoint, List<Connection> results) {
    	String ref = outboundEndpoint.getRef();
    	if (ref == null) {
	    	ref = outboundEndpoint.getAddress();
	    	if (ref == null) return;
    	}
    	
    	addSourceRef(service, ref, results);   	
    }
    
    /*
    private AbstractGlobalEndpointType getGlobalEndpoint(String name) {
    	if (name == null || name.length() == 0) return null;
    	
		MuleType mule = (MuleType) model.eContainer();
		EList<AbstractGlobalEndpointType> globalEndpoints = mule.getAbstractGlobalEndpoint();
    	for (AbstractGlobalEndpointType endpoint : globalEndpoints) {
    		if (name.equals(endpoint.getName())) {
    			return endpoint;
    		}
    	}
    	return null;
    }
    */
    
    private SedaServiceType getContainingService(EObject obj) {
    	if (obj == null) {
    		return null;
    	}
    	if (obj.eContainer() instanceof SedaServiceType) {
    		return (SedaServiceType) obj.eContainer();
    	}
    	return getContainingService(obj.eContainer());
    }
    
    private SourceEndpointReference getSourceRef(SedaServiceType service, String endpointName) {
    	List<SourceEndpointReference> refs = sourceRefs.get(endpointName);
    	if (refs == null) {
    		return null;
    	}
    	for (SourceEndpointReference ref : refs) {
    		if (ref.getService() == service) {
    			return ref;
    		}
    	}
    	return null;
	}
	
    private TargetEndpointReference getTargetRef(SedaServiceType service, String endpointName) {
    	List<TargetEndpointReference> refs = targetRefs.get(endpointName);
    	if (refs == null) {
    		return null;
    	}
    	for (TargetEndpointReference ref : refs) {
    		if (ref.getService() == service) {
    			return ref;
    		}
    	}
    	return null;
	}
	
	private void addSourceRef(SedaServiceType service, String endpointName, List<Connection> results) {
    	if (DEBUG) {
	    	System.out.println("SOURCE (OUTBOUND) REF SET");
	        System.out.println("  Global endpoint ["+endpointName+"] service ["+service.getName()+"]");
    	}
    	
		SourceEndpointReference ref = getSourceRef(service, endpointName);
		if (ref != null) {
			// If ref exists, then connections must already exist.
			ref.incrementRefCount();
			return;
		}
    	List<SourceEndpointReference> refs = sourceRefs.get(endpointName);
    	if (refs == null) {
    		refs = new ArrayList<SourceEndpointReference>();
    		sourceRefs.put(endpointName, refs);
    	}
    	ref = new SourceEndpointReference(service);
    	refs.add(ref);
    	// First time this service has been a source for this endpoint type
    	// Create connections with all targets using this endpoint.
    	createConnections(endpointName, service, targetRefs.get(endpointName), results);
	}
	
	private void addTargetRef(SedaServiceType service, String endpointName, List<Connection> results) {
    	if (DEBUG) {
	    	System.out.println("TARGET (INBOUND) REF SET");
	        System.out.println("  Global endpoint ["+endpointName+"] service ["+service.getName()+"]");
    	}
    	
		TargetEndpointReference ref = getTargetRef(service, endpointName);
		if (ref != null) {
			// If ref exists, then connections must already exist.
			ref.incrementRefCount();
			return;
		}
    	List<TargetEndpointReference> refs = targetRefs.get(endpointName);
    	if (refs == null) {
    		refs = new ArrayList<TargetEndpointReference>();
    		targetRefs.put(endpointName, refs);
    	}
    	ref = new TargetEndpointReference(service);
    	refs.add(ref);
    	// First time this service has been a target for this endpoint type
    	// Create connections with all sources using this endpoint.
    	createConnections(endpointName, sourceRefs.get(endpointName), service, results);
	}
	
	private void removeSourceRef(SedaServiceType service, String endpointName, List<Connection> results) {
		SourceEndpointReference ref = getSourceRef(service, endpointName);
		assert (ref != null);
		ref.decrementRefCount();
		if (ref.getRefCount() == 0) {
			// Remove ref from ref cache
        	List<SourceEndpointReference> refs = sourceRefs.get(endpointName);
			refs.remove(ref);
			if (refs.isEmpty()) {
				sourceRefs.remove(endpointName);
			}
			// Remove all connections which had this service as a source
	    	List<Connection> connections = mapNameToConnection.get(endpointName);
	    	if (connections != null) {
		    	for (Connection connection : connections) {
		    		if (connection.getSource() == service) {
		    	    	results.add(connection);
		    		}
		    	}
	    	}
		}	
	}

	private void removeTargetRef(SedaServiceType service, String endpointName, List<Connection> results) {
		TargetEndpointReference ref = getTargetRef(service, endpointName);
		assert (ref != null);
		ref.decrementRefCount();
		if (ref.getRefCount() == 0) {
			// Remove ref from ref cache
        	List<TargetEndpointReference> refs = targetRefs.get(endpointName);
			refs.remove(ref);
			if (refs.isEmpty()) {
				targetRefs.remove(endpointName);
			}
			// Remove all connections which had this service as a source
	    	List<Connection> connections = mapNameToConnection.get(endpointName);
	    	if (connections != null) {
		    	for (Connection connection : connections) {
		    		if (connection.getTarget() == service) {
		    	    	results.add(connection);
		    		}
		    	}
	    	}
		}	
	}

	public void createConnections(String endpointName, 
			SedaServiceType source, List<TargetEndpointReference> targetReferences, List<Connection> results) {
		if (targetReferences == null) return;
		
		for (TargetEndpointReference targetReference : targetReferences) {
			Connection connection = CoreFactory.eINSTANCE.createConnection();
			connection.setEndpoint(endpointName);
			connection.setSource(source);
			connection.setTarget(targetReference.getService());
			results.add(connection);
		}  		
	}

	public void createConnections(String endpointName, 
			List<SourceEndpointReference> sourceReferences, SedaServiceType target, List<Connection> results) {
		if (sourceReferences == null) return;
		
		for (SourceEndpointReference sourceReference : sourceReferences) {
			Connection connection = CoreFactory.eINSTANCE.createConnection();
			connection.setEndpoint(endpointName);
			connection.setSource(sourceReference.getService());
			connection.setTarget(target);
			results.add(connection);
		}  		
	}

    private void addConnection(List<Connection> results) {
    	if (results.isEmpty()) return;
    	// Add it to the model list
		Command command = AddCommand.create(editingDomain, model, CorePackage.eINSTANCE.getSedaModelType_Connections(), results);
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
			for (Connection connection : results) {
				assert (connection.getEndpoint() != null && connection.getSource() != null && connection.getTarget() != null);
				// Index it in the local map
		    	String endpointName = connection.getEndpoint();
		    	List<Connection> connections = mapNameToConnection.get(endpointName);
		    	if (connections == null) {
		    		connections = new ArrayList<Connection>();
		    		mapNameToConnection.put(endpointName, connections);
		    	}
		    	connections.add(connection);
		    	
		    	if (DEBUG) {
			    	System.out.println("CONNECTION ADDED");
			        System.out.println("  Endpoint ["+connection.getEndpoint()+"]");
			        System.out.println("  Source   ["+connection.getSource().getName()+"]");
			        System.out.println("  Target   ["+connection.getTarget().getName()+"]");
		    	}
			}
		}
    }
    
    private void removeConnection(List<Connection> results) {
    	if (results.isEmpty()) return;
		Command command = RemoveCommand.create(editingDomain, model, CorePackage.eINSTANCE.getSedaModelType_Connections(), results);
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
			for (Connection connection : results) {			
		    	String endpointName = connection.getEndpoint();
		    	List<Connection> connections = mapNameToConnection.get(endpointName);
				if (connections.isEmpty()) {
					mapNameToConnection.remove(endpointName);
				} 	
		    	
		    	if (DEBUG) {
			    	System.out.println("CONNECTION REMOVED");
			        System.out.println("  Endpoint ["+connection.getEndpoint()+"]");
			        System.out.println("  Source   ["+connection.getSource().getName()+"]");
			        System.out.println("  Target   ["+connection.getTarget().getName()+"]");
		    	}
			}
		}
    }
    
    /**
     *  Used for reference counting.  
     *  There can be multiple refs to the same global endpoint from a service.
     */
    static abstract class AbstractEndpointReference {
    	private SedaServiceType service;
    	private int refCount;
    	AbstractEndpointReference(SedaServiceType service) {
    		this.service = service;
    		this.refCount = 1;
    	}
		public SedaServiceType getService() {
			return service;
		}
		public int getRefCount() {
			return refCount;
		}
		public void incrementRefCount() {
			refCount++;
		}
		public void decrementRefCount() {
			refCount--;
		}
    }
    static class SourceEndpointReference extends AbstractEndpointReference {
    	SourceEndpointReference(SedaServiceType service) { super(service); }
    }
    static class TargetEndpointReference extends AbstractEndpointReference {
    	TargetEndpointReference(SedaServiceType service) { super(service); }
    }

}
