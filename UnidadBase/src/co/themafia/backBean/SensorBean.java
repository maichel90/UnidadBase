package co.themafia.backBean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.themafia.model.Sensor;

public class SensorBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Sensor> sensores;
	private Integer	valorSensor;
	@PersistenceContext EntityManager em;
	
	public SensorBean() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void BuscarSensores() {
		sensores = em.createNamedQuery("Sensor.findAll").getResultList();
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
}
