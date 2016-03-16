package proceso;

public class OperacionesProxy implements proceso.Operaciones {
  private String _endpoint = null;
  private proceso.Operaciones operaciones = null;
  
  public OperacionesProxy() {
    _initOperacionesProxy();
  }
  
  public OperacionesProxy(String endpoint) {
    _endpoint = endpoint;
    _initOperacionesProxy();
  }
  
  private void _initOperacionesProxy() {
    try {
      operaciones = (new proceso.OperacionesServiceLocator()).getoperaciones();
      if (operaciones != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)operaciones)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)operaciones)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (operaciones != null)
      ((javax.xml.rpc.Stub)operaciones)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public proceso.Operaciones getOperaciones() {
    if (operaciones == null)
      _initOperacionesProxy();
    return operaciones;
  }
  
  public double suma(double numero1, double numero2) throws java.rmi.RemoteException{
    if (operaciones == null)
      _initOperacionesProxy();
    return operaciones.suma(numero1, numero2);
  }
  
  
}