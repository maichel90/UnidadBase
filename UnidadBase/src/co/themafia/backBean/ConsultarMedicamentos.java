package co.themafia.backBean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import co.themafia.model.Medicamento;

public class ConsultarMedicamentos implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Medicamento> medicamentos;
	@PersistenceContext EntityManager em;
	
	@PostConstruct
	public void ConsultarMedicamentos() {
		medicamentos = em.createNamedQuery("Medicamento.findAll").getResultList();
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}
