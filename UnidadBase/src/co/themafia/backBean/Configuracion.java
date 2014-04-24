package co.themafia.backBean;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Date;

import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import co.themafia.model.Paciente;
import co.themafia.model.Sensor;
import datos.Consulta;
import datos.DatosPaciente;
import datos.Medicamento;
import datos.Rango;
import datos.WsGrupo3Proxy;


public class Configuracion implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer identificacion;
	private Date horaSincronizacion;
	private Paciente paciente;
	private Boolean configurado = false;
	@Resource UserTransaction ut;
	@PersistenceContext EntityManager em;
	
	public Configuracion() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public Paciente getPaciente() {
		return paciente;
	}
	
	public Date getHoraSincronizacion() {
		return horaSincronizacion;
	}

	public void setHoraSincronizacion(Date horaSincronizacion) {
		this.horaSincronizacion = horaSincronizacion;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void ValidacionUsuario() {
		if(!configurado){
			String resp = ConsultarWSPaciente(identificacion);
			if(resp == "principal"){
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Sistema informa", "La configuracion ha sido realizada con exito"));  
			}else{
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sistema informa", "Por favor verifique el numero de identificacion"));		
			}
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sistema informa", "El sistema ya esta configurado, si desea cambiar de paciente por favor reinicie el sistema"));
		}
	}

	public String ConsultarWSPaciente(Integer identificacion) {
		try {
			WsGrupo3Proxy px = new WsGrupo3Proxy();
			Consulta c = px.getConsulta(identificacion.toString());
			if(c.getCodigoError()==0){
				paciente = GuardarDatosPaciente(c);
				GuardarDatosRangos(c);
				GuardarDatosMedicamentos(c);
				configurado = true;
				return "principal";
			}
			else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	private Paciente GuardarDatosPaciente(Consulta c) throws NotSupportedException, SystemException, SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException {
		Paciente paciente = new Paciente();
		DatosPaciente p = c.getPaciente();
		paciente.setIdentificacion(p.getIdentificacion());
		paciente.setNombre(p.getNombre());
		paciente.setApellido(p.getApellido());
		paciente.setHoraSincronizacion(this.horaSincronizacion.toString());
		ut.begin();
		em.persist(paciente);
		ut.commit();
		return paciente;
	}
	
	private void GuardarDatosRangos(Consulta c) throws NotSupportedException, SystemException, SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException {
		Rango[] rangos = c.getRango();
		for(int a = 0; a < rangos.length ; a ++){
			Rango r = rangos[a];
			Sensor sensor = new Sensor();
			sensor.setNombreSensor(r.getSignoVital());
			sensor.setEnfermedad(r.getEnfermedad());
			sensor.setRangoMin(Integer.parseInt(r.getRangoMin()));
			sensor.setRangoMax(Integer.parseInt(r.getRangoMax()));
			sensor.setPaciente(paciente);
			ut.begin();
			em.persist(sensor);
			ut.commit();
		}
	}
	
	private void GuardarDatosMedicamentos(Consulta c) throws NotSupportedException, SystemException, SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException {
		Medicamento[] medicamentos = c.getMedicamento();
		for(int a = 0; a < medicamentos.length ; a ++){
			Medicamento m = medicamentos[a];
			co.themafia.model.Medicamento medicina = new co.themafia.model.Medicamento();
			medicina.setNombreMedicamento(m.getNombreMedicamento());
			medicina.setViaAdministracion(m.getViaAdministracion());
			medicina.setDosis(m.getDosis());
			medicina.setFrecuencia(m.getFrecuencia());
			medicina.setPaciente(paciente);
			ut.begin();
			em.persist(medicina);
			ut.commit();				
		}
	}
}
