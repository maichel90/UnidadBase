package co.themafia.backBean;

import java.io.Serializable;

public class IndexBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer identificacion;

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

}
