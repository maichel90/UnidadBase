package co.themafia.backBean;

import java.io.Serializable;
import java.rmi.RemoteException;

import datos.Consulta;
import datos.WsGrupo3Proxy;

public class IndexBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer identificacion;
	
	public IndexBean() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}
	
	public String ValidacionUsuario() {
		if(identificacion == 321){
			return "sensores";
		}else {
			return "error";
		}
	}

	private void ConsultarWSPasiente(Integer identificacion) {
		
		try {
			WsGrupo3Proxy px = new WsGrupo3Proxy();
			Consulta c = px.getConsulta(identificacion.toString());
			px.get
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
