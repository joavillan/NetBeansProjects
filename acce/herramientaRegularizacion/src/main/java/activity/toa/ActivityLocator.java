/**
 * ActivityLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package activity.toa;

public class ActivityLocator extends org.apache.axis.client.Service implements activity.toa.Activity {

    public ActivityLocator() {
    }


    public ActivityLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ActivityLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for activity
    private java.lang.String activity_address = "https://api.etadirect.com/soap/activity/v2/?wsdl";

    @Override
	public java.lang.String getactivityAddress() {
        return activity_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String activityWSDDServiceName = "activity";

    public java.lang.String getactivityWSDDServiceName() {
        return activityWSDDServiceName;
    }

    public void setactivityWSDDServiceName(java.lang.String name) {
        activityWSDDServiceName = name;
    }

    @Override
	public activity.toa.ApiPortType getactivity() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(activity_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getactivity(endpoint);
    }

    @Override
	public activity.toa.ApiPortType getactivity(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            activity.toa.ApiBindingStub _stub = new activity.toa.ApiBindingStub(portAddress, this);
            _stub.setPortName(getactivityWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setactivityEndpointAddress(java.lang.String address) {
        activity_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (activity.toa.ApiPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                activity.toa.ApiBindingStub _stub = new activity.toa.ApiBindingStub(new java.net.URL(activity_address), this);
                _stub.setPortName(getactivityWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("activity".equals(inputPortName)) {
            return getactivity();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    @Override
	public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:toa:activity", "activity");
    }

    private java.util.HashSet ports = null;

    @Override
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:toa:activity", "activity"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("activity".equals(portName)) {
            setactivityEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
