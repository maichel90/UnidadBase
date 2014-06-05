package co.themafia.backBean;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sistema informa", "Por favor verifique el numero de identificacion o la fecha de envio"));		
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
		paciente.setFechaNacimiento(convertirFecha(p.getFechaNacimiento()));
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
			if(r.getCodigoError()==0){
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
	}
	
	private void GuardarDatosMedicamentos(Consulta c) throws NotSupportedException, SystemException, SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException {
		Medicamento[] medicamentos = c.getMedicamento();
		for(int a = 0; a < medicamentos.length ; a ++){
			Medicamento m = medicamentos[a];
			if(m.getCodigoError()==0){
				co.themafia.model.Medicamento medicina = new co.themafia.model.Medicamento();
				medicina.setNombreMedicamento(m.getNombreMedicamento());
				medicina.setViaAdministracion(m.getViaAdministracion());
				medicina.setDosis(m.getDosis());
				medicina.setFrecuencia(m.getFrecuencia());
				medicina.setPaciente(paciente);
				medicina.setFechaInicio(convertirFecha(m.getFechainicio()));
				medicina.setFechaFin(convertirFecha(m.getFechaFin()));
				ut.begin();
				em.persist(medicina);
				ut.commit();
				//lanzarTareaProgramada(medicina);
			}			
		}
	}
	
	private Date convertirFecha(String fecha) {
		String[] datos = fecha.split("-");
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(datos[0]), Integer.parseInt(datos[1])-1, Integer.parseInt(datos[2]));
		return cal.getTime();
	}
	
	public void lanzarTareaProgramada(co.themafia.model.Medicamento m) {
		Timer t = new Timer();
		t.schedule(new tarea(), (Integer.parseInt(m.getFrecuencia()) * 3600)*1000 );
	}
	class tarea extends TimerTask{
		@Override
		public void run() {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Sistema informa", "Es hora de tomarse el 'Paracetamol' "));
		}
		
	}
}
