package org.mule.ide.config.core.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.Connection;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.GlobalEndpointType;
import org.mule.ide.config.core.InboundEndpointType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.OutboundEndpointType;
import org.mule.ide.config.core.SedaModelType;
import org.mule.ide.config.core.SedaServiceType;

public class ConnectionsAdapter extends EContentAdapter {
	
	private SedaModelType model;
	// Keep a map of global endpoint name to Connections in the Model list.
	private HashMap<String, List<Connection>> mapNameToConnection = new HashMap<String, List<Connection>>();
	// Map of endpoint name to reference count.
	private HashMap<String, List<SourceEndpointReference>> sourceRefs = new HashMap<String, List<SourceEndpointReference>>();
	private HashMap<String, List<TargetEndpointReference>> targetRefs = new HashMap<String, List<TargetEndpointReference>>();
	
    public void observeModel(SedaModelType model){
    	// TODO  may need to listen on root element to react to global endpoint
    	// deletions.  Or perhaps some other validation listener will automatically
    	// update stale refs?
        model.eAdapters().add(this);
        this.model = model;
        
    }

    //override the notifyChanged method
    public void notifyChanged(Notification n){
        
        super.notifyChanged(n);
        
        if (n.getEventType() == Notification.SET
        		&& n.getNotifier() instanceof InboundEndpointType
        		&& n.getFeatureID(InboundEndpointType.class) == CorePackage.INBOUND_ENDPOINT_TYPE__REF) {
        	
        	handleInboundEndpointRefSet(n);
        	
        } else if (n.getEventType() == Notification.SET
        		&& n.getNotifier() instanceof OutboundEndpointType
        		&& n.getFeatureID(OutboundEndpointType.class) == CorePackage.OUTBOUND_ENDPOINT_TYPE__REF) {
        	
        	handleOutboundEndpointRefSet(n);
            
        } else if (n.getEventType() == Notification.ADD
        		&& n.getNewValue() instanceof InboundEndpointType) {
        	

        } else if (n.getEventType() == Notification.REMOVE
        		&& n.getOldValue() instanceof InboundEndpointType) {

        }

    }

    private void handleInboundEndpointRefSet(Notification n) {
    	InboundEndpointType inboundEndpoint = (InboundEndpointType) n.getNotifier();
    	SedaServiceType service = getContainingService(inboundEndpoint);
    	if (service == null) return;
    	
    	String oldRef = n.getOldStringValue();
    	AbstractGlobalEndpointType oldGlobalEndpoint = getGlobalEndpoint(oldRef);
    	String newRef = n.getNewStringValue();
    	AbstractGlobalEndpointType newGlobalEndpoint = getGlobalEndpoint(newRef);
    	
    	System.out.println("INBOUND ENDPOINT REF SET");
        System.out.println("  Inbound endpoint ["+inboundEndpoint.getName()+"] ref ["+inboundEndpoint.getRef()+"] service ["+service.getName()+"]");;
        System.out.println("  Old value ["+oldRef+"] New value ["+newRef+"]");;
    	
        if (oldGlobalEndpoint != null) {
        	removeSourceRef(service, oldGlobalEndpoint);
        }
 
        if (newGlobalEndpoint != null) {
        	addSourceRef(service, newGlobalEndpoint);
        }
    }


    private void handleOutboundEndpointRefSet(Notification n) {
    	OutboundEndpointType outboundEndpoint = (OutboundEndpointType) n.getNotifier();
    	SedaServiceType service = getContainingService(outboundEndpoint);
    	if (service == null) return;
    	
    	String oldRef = n.getOldStringValue();
    	AbstractGlobalEndpointType oldGlobalEndpoint = getGlobalEndpoint(oldRef);
    	String newRef = n.getNewStringValue();
    	AbstractGlobalEndpointType newGlobalEndpoint = getGlobalEndpoint(newRef);
    	
    	System.out.println("OUTBOUND ENDPOINT REF SET");
        System.out.println("  Outbound endpoint ["+outboundEndpoint.getName()+"] ref ["+outboundEndpoint.getRef()+"] service ["+service.getName()+"]");;
        System.out.println("  Old value ["+oldRef+"] New value ["+newRef+"]");;
    	
        if (oldGlobalEndpoint != null) {
        	removeTargetRef(service, oldGlobalEndpoint);
        }
 
        if (newGlobalEndpoint != null) {
        	addTargetRef(service, newGlobalEndpoint);
        }
    }

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
    
    private SedaServiceType getContainingService(EObject obj) {
    	if (obj == null) {
    		return null;
    	}
    	if (obj.eContainer() instanceof SedaServiceType) {
    		return (SedaServiceType) obj.eContainer();
    	}
    	return getContainingService(obj.eContainer());
    }
    
    private SourceEndpointReference getSourceRef(SedaServiceType service, AbstractGlobalEndpointType endpoint) {
    	List<SourceEndpointReference> refs = sourceRefs.get(endpoint.getName());
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
	
    private TargetEndpointReference getTargetRef(SedaServiceType service, AbstractGlobalEndpointType endpoint) {
    	List<TargetEndpointReference> refs = targetRefs.get(endpoint.getName());
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
	
	private void addSourceRef(SedaServiceType service, AbstractGlobalEndpointType endpoint) {
		SourceEndpointReference ref = getSourceRef(service, endpoint);
		if (ref != null) {
			// If ref exists, then connections must already exist.
			ref.incrementRefCount();
			return;
		}
    	List<SourceEndpointReference> refs = sourceRefs.get(endpoint.getName());
    	if (refs == null) {
    		refs = new ArrayList<SourceEndpointReference>();
    		sourceRefs.put(endpoint.getName(), refs);
    	}
    	ref = new SourceEndpointReference(service);
    	refs.add(ref);
    	// First time this service has been a source for this endpoint type
    	// Create connections with all targets using this endpoint.
    	createConnections(endpoint, service, targetRefs.get(endpoint.getName()));
	}
	
	private void addTargetRef(SedaServiceType service, AbstractGlobalEndpointType endpoint) {
		TargetEndpointReference ref = getTargetRef(service, endpoint);
		if (ref != null) {
			// If ref exists, then connections must already exist.
			ref.incrementRefCount();
			return;
		}
    	List<TargetEndpointReference> refs = targetRefs.get(endpoint.getName());
    	if (refs == null) {
    		refs = new ArrayList<TargetEndpointReference>();
    		targetRefs.put(endpoint.getName(), refs);
    	}
    	ref = new TargetEndpointReference(service);
    	refs.add(ref);
    	// First time this service has been a target for this endpoint type
    	// Create connections with all sources using this endpoint.
    	createConnections(endpoint, sourceRefs.get(endpoint.getName()), service);
	}
	
	private void removeSourceRef(SedaServiceType service, AbstractGlobalEndpointType endpoint) {
		SourceEndpointReference ref = getSourceRef(service, endpoint);
		assert (ref != null);
		ref.decrementRefCount();
		if (ref.getRefCount() == 0) {
	    	String endpointName = endpoint.getName();
			// Remove ref from ref cache
        	List<SourceEndpointReference> refs = sourceRefs.get(endpointName);
			refs.remove(ref);
			if (refs.isEmpty()) {
				sourceRefs.remove(endpointName);
			}
			// Remove all connections which had this service as a source
	    	List<Connection> connections = mapNameToConnection.get(endpointName);
	    	for (Connection connection : connections) {
	    		if (connection.getSource() == service) {
	    	    	removeConnection(connection);
	    		}
	    	}
		}	
	}

	private void removeTargetRef(SedaServiceType service, AbstractGlobalEndpointType endpoint) {
		TargetEndpointReference ref = getTargetRef(service, endpoint);
		assert (ref != null);
		ref.decrementRefCount();
		if (ref.getRefCount() == 0) {
	    	String endpointName = endpoint.getName();
			// Remove ref from ref cache
        	List<TargetEndpointReference> refs = targetRefs.get(endpointName);
			refs.remove(ref);
			if (refs.isEmpty()) {
				targetRefs.remove(endpointName);
			}
			// Remove all connections which had this service as a source
	    	List<Connection> connections = mapNameToConnection.get(endpointName);
	    	for (Connection connection : connections) {
	    		if (connection.getTarget() == service) {
	    	    	removeConnection(connection);
	    		}
	    	}
		}	
	}

	public void createConnections(AbstractGlobalEndpointType endpoint, 
			SedaServiceType source, List<TargetEndpointReference> targetReferences) {
		if (targetReferences == null) return;
		
		for (TargetEndpointReference targetReference : targetReferences) {
			Connection connection = CoreFactory.eINSTANCE.createConnection();
			connection.setEndpoint(endpoint);
			connection.setSource(source);
			connection.setTarget(targetReference.getService());
			addConnection(connection);
		}  		
	}

	public void createConnections(AbstractGlobalEndpointType endpoint, 
			List<SourceEndpointReference> sourceReferences, SedaServiceType target) {
		if (sourceReferences == null) return;
		
		for (SourceEndpointReference sourceReference : sourceReferences) {
			Connection connection = CoreFactory.eINSTANCE.createConnection();
			connection.setEndpoint(endpoint);
			connection.setSource(sourceReference.getService());
			connection.setTarget(target);
			addConnection(connection);
		}  		
	}

    private void addConnection(Connection connection) {
    	assert (connection.getEndpoint() != null && connection.getSource() != null && connection.getTarget() != null);
    	
    	// Add it to the model list
    	model.getConnections().add(connection);
		// Index it in the local map
    	String endpointName = connection.getEndpoint().getName();
    	List<Connection> connections = mapNameToConnection.get(endpointName);
    	if (connections == null) {
    		connections = new ArrayList<Connection>();
    		mapNameToConnection.put(endpointName, connections);
    	}
    	connections.add(connection);
    	
    	System.out.println("CONNECTION ADDED");
        System.out.println("  Endpoint ["+connection.getEndpoint().getName()+"]");
        System.out.println("  Source   ["+connection.getSource()+"]");
        System.out.println("  Target   ["+connection.getTarget()+"]");;
    }
    
    private void removeConnection(Connection connection) {
    	String endpointName = connection.getEndpoint().getName();
    	model.getConnections().remove(connection);
    	List<Connection> connections = mapNameToConnection.get(endpointName);
		if (connections.isEmpty()) {
			mapNameToConnection.remove(endpointName);
		} 	
    }
    
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
