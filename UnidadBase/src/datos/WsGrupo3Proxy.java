package datos;

public class WsGrupo3Proxy implements datos.WsGrupo3_PortType {
  private String _endpoint = null;
  private datos.WsGrupo3_PortType wsGrupo3_PortType = null;
  
  public WsGrupo3Proxy() {
    _initWsGrupo3Proxy();
  }
  
  public WsGrupo3Proxy(String endpoint) {
    _endpoint = endpoint;
    _initWsGrupo3Proxy();
  }
  
  private void _initWsGrupo3Proxy() {
    try {
      wsGrupo3_PortType = (new datos.WsGrupo3_ServiceLocator()).getwsGrupo3Port();
      if (wsGrupo3_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsGrupo3_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsGrupo3_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsGrupo3_PortType != null)
      ((javax.xml.rpc.Stub)wsGrupo3_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public datos.WsGrupo3_PortType getWsGrupo3_PortType() {
    if (wsGrupo3_PortType == null)
      _initWsGrupo3Proxy();
    return wsGrupo3_PortType;
  }
  
  public datos.ConsultaEncuenta getEncuesta(java.lang.String identificacion) throws java.rmi.RemoteException{
    if (wsGrupo3_PortType == null)
      _initWsGrupo3Proxy();
    return wsGrupo3_PortType.getEncuesta(identificacion);
  }
  
  public datos.RespuetaAlerta getAlerta(datos.Alerta alerta) throws java.rmi.RemoteException{
    if (wsGrupo3_PortType == null)
      _initWsGrupo3Proxy();
    return wsGrupo3_PortType.getAlerta(alerta);
  }
  
  public java.lang.String setHistorico(datos.HistorialMedico[] historial) throws java.rmi.RemoteException{
    if (wsGrupo3_PortType == null)
      _initWsGrupo3Proxy();
    return wsGrupo3_PortType.setHistorico(historial);
  }
  
  public datos.Consulta getConsulta(java.lang.String identificacion) throws java.rmi.RemoteException{
    if (wsGrupo3_PortType == null)
      _initWsGrupo3Proxy();
    return wsGrupo3_PortType.getConsulta(identificacion);
  }
  
  
}