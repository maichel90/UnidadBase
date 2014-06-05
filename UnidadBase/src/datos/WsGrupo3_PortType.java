/**
 * WsGrupo3_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package datos;

public interface WsGrupo3_PortType extends java.rmi.Remote {
    public datos.ConsultaEncuenta getEncuesta(java.lang.String identificacion) throws java.rmi.RemoteException;
    public datos.RespuetaAlerta getAlerta(datos.Alerta alerta) throws java.rmi.RemoteException;
    public datos.Consulta getConsulta(java.lang.String identificacion) throws java.rmi.RemoteException;
    public java.lang.String setHistorico(datos.HistorialMedico[] historial) throws java.rmi.RemoteException;
}
