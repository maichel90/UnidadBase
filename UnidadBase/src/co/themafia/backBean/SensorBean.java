package co.themafia.backBean;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
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

import org.primefaces.event.SlideEndEvent;

import co.themafia.model.Registrosensor;
import co.themafia.model.Sensor;
import datos.Alerta;
import datos.RespuetaAlerta;
import datos.WsGrupo3Proxy;

public class SensorBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Sensor> sensores;
	private Integer	valorSensor  = 80;
	private String identificacion;
	@PersistenceContext EntityManager em;
	@Resource UserTransaction ut;
	
	public SensorBean() {
	}
	
	@PostConstruct
	public void BuscarSensores() {
		sensores = em.createNamedQuery("Sensor.findAll").getResultList();
		identificacion = sensores.get(1).getPaciente().getIdentificacion();
	}
	
	public List<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(List<Sensor> sensores) {
		this.sensores = sensores;
	}

	public Integer getValorSensor() {
		return valorSensor;
	}

	public void setValorSensor(Integer valorSensor) {
		this.valorSensor = valorSensor;
	}
	
	public void onSlideEnd(SlideEndEvent event) {
		Sensor sensor = (Sensor)event.getComponent().getAttributes().get("chango");
		Integer valor = event.getValue();
		GuardarRegistrosSensor(sensor, valor);
		if(valor > sensor.getRangoMax() || valor < sensor.getRangoMin()){
			try {
				Alerta alerta = new Alerta();
				alerta.setValorActual(valor.toString());
				alerta.setIdentificacion(sensor.getPaciente().getIdentificacion());
				alerta.setSignoVital(sensor.getNombreSensor());
				WsGrupo3Proxy px = new WsGrupo3Proxy();
				RespuetaAlerta resp = px.getAlerta(alerta);
				if(resp.getCodigoError()==0){
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Sistema informa", "SE HA REALIZADO EL ENVIO DE LA ALERTA "+resp.getRecomendacion()));
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sistema informa", "No se ha podido enviar la info"));
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void BotonPanico() {
		try {
			Alerta alerta = new Alerta();
			alerta.setValorActual("PANICO!!!");
			alerta.setIdentificacion(identificacion);
			alerta.setSignoVital("PANICO!!!");
			WsGrupo3Proxy px = new WsGrupo3Proxy();
			RespuetaAlerta resp = px.getAlerta(alerta);
			if(resp.getCodigoError()==0){
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Sistema informa", "SE HA REALIZADO EL ENVIO DE LA ALERTA "+resp.getRecomendacion()));
			}else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sistema informa", "No se ha podido enviar la info"));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public void GuardarRegistrosSensor(Sensor sensor, Integer valor) {
		try {
			Registrosensor registro = new Registrosensor();
			registro.setSensor(sensor);
			registro.setValor(valor);
			registro.setFecha(new Date());
			ut.begin();
			em.persist(registro);
			ut.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
