package co.themafia.backBean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.themafia.model.Sensor;

public class ConsultaSensores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Sensor> sensores;
	@PersistenceContext EntityManager em;
	
	public ConsultaSensores() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void ConsultarSensores() {
		sensores = em.createNamedQuery("Sensor.findAll").getResultList();
	}
	
	public List<Sensor> getSensores() {
		return sensores;
	}
	public void setSensores(List<Sensor> sensores) {
		this.sensores = sensores;
	}
	
	

}
