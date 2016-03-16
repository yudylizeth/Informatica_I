/**
 * OperacionesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package proceso;

public class OperacionesServiceLocator extends org.apache.axis.client.Service implements proceso.OperacionesService {

    public OperacionesServiceLocator() {
    }


    public OperacionesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OperacionesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for operaciones
    private java.lang.String operaciones_address = "http://localhost:8080/Suma/services/operaciones";

    public java.lang.String getoperacionesAddress() {
        return operaciones_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String operacionesWSDDServiceName = "operaciones";

    public java.lang.String getoperacionesWSDDServiceName() {
        return operacionesWSDDServiceName;
    }

    public void setoperacionesWSDDServiceName(java.lang.String name) {
        operacionesWSDDServiceName = name;
    }

    public proceso.Operaciones getoperaciones() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(operaciones_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getoperaciones(endpoint);
    }

    public proceso.Operaciones getoperaciones(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            proceso.OperacionesSoapBindingStub _stub = new proceso.OperacionesSoapBindingStub(portAddress, this);
            _stub.setPortName(getoperacionesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setoperacionesEndpointAddress(java.lang.String address) {
        operaciones_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (proceso.Operaciones.class.isAssignableFrom(serviceEndpointInterface)) {
                proceso.OperacionesSoapBindingStub _stub = new proceso.OperacionesSoapBindingStub(new java.net.URL(operaciones_address), this);
                _stub.setPortName(getoperacionesWSDDServiceName());
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
        if ("operaciones".equals(inputPortName)) {
            return getoperaciones();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://proceso", "operacionesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://proceso", "operaciones"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("operaciones".equals(portName)) {
            setoperacionesEndpointAddress(address);
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
