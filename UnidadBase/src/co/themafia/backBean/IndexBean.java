package co.themafia.backBean;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Date;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import co.themafia.model.Paciente;
import datos.Consulta;
import datos.DatosPaciente;
import datos.WsGrupo3Proxy;

public class IndexBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer identificacion;
	@Resource UserTransaction ut;
	@PersistenceContext EntityManager em;
	
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
		String a =  ConsultarWSPaciente(identificacion);
		System.out.println(a);
		return a;
	}

	public String ConsultarWSPaciente(Integer identificacion) {
		try {
			WsGrupo3Proxy px = new WsGrupo3Proxy();
			Consulta c = px.getConsulta(identificacion.toString());
			System.out.println(c.getCodigoError());
			System.out.println(c.getMesajeError());
			if(c.getCodigoError()==0){
				DatosPaciente p = c.getPaciente();
				Paciente paciente = new Paciente();
				paciente.setIdentificacion(p.getIdentificacion());
				paciente.setNombre(p.getNombre());
				paciente.setApellido(p.getApellido());
				//paciente.setFechaNacimiento(new Date(p.getFechaNacimiento()));
				ut.begin();
				em.persist(paciente);
				ut.commit();
				return "sensores";
			}
			else {
				return "error";
			}
			
		} catch (RemoteException | NotSupportedException | SystemException | SecurityException | IllegalStateException | RollbackException | HeuristicMixedException | HeuristicRollbackException e) {
			e.printStackTrace();
			return "error";
		}
	}
}
