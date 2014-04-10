package co.themafia.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the alertasensor database table.
 * 
 */
@Entity
@NamedQuery(name="Alertasensor.findAll", query="SELECT a FROM Alertasensor a")
public class Alertasensor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAlertaSensor;

	private String dosis;

	private String medicamento;

	private String recomendacion;

	//bi-directional many-to-one association to Sensor
	@ManyToOne
	@JoinColumn(name="idSensor")
	private Sensor sensor;

	public Alertasensor() {
	}

	public int getIdAlertaSensor() {
		return this.idAlertaSensor;
	}

	public void setIdAlertaSensor(int idAlertaSensor) {
		this.idAlertaSensor = idAlertaSensor;
	}

	public String getDosis() {
		return this.dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public String getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getRecomendacion() {
		return this.recomendacion;
	}

	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}

	public Sensor getSensor() {
		return this.sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

}