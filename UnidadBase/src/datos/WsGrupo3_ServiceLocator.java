/**
 * WsGrupo3_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public class WsGrupo3_ServiceLocator extends org.apache.axis.client.Service implements datos.WsGrupo3_Service {

    public WsGrupo3_ServiceLocator() {
    }


    public WsGrupo3_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsGrupo3_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wsGrupo3Port
    private java.lang.String wsGrupo3Port_address = "http://190.144.140.19:8080/Grupo3/wsGrupo3";

    public java.lang.String getwsGrupo3PortAddress() {
        return wsGrupo3Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsGrupo3PortWSDDServiceName = "wsGrupo3Port";

    public java.lang.String getwsGrupo3PortWSDDServiceName() {
        return wsGrupo3PortWSDDServiceName;
    }

    public void setwsGrupo3PortWSDDServiceName(java.lang.String name) {
        wsGrupo3PortWSDDServiceName = name;
    }

    public datos.WsGrupo3_PortType getwsGrupo3Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsGrupo3Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsGrupo3Port(endpoint);
    }

    public datos.WsGrupo3_PortType getwsGrupo3Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            datos.WsGrupo3PortBindingStub _stub = new datos.WsGrupo3PortBindingStub(portAddress, this);
            _stub.setPortName(getwsGrupo3PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsGrupo3PortEndpointAddress(java.lang.String address) {
        wsGrupo3Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (datos.WsGrupo3_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                datos.WsGrupo3PortBindingStub _stub = new datos.WsGrupo3PortBindingStub(new java.net.URL(wsGrupo3Port_address), this);
                _stub.setPortName(getwsGrupo3PortWSDDServiceName());
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
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("wsGrupo3Port".equals(inputPortName)) {
            return getwsGrupo3Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://datos/", "wsGrupo3");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://datos/", "wsGrupo3Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsGrupo3Port".equals(portName)) {
            setwsGrupo3PortEndpointAddress(address);
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
