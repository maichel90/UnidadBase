package co.themafia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sensor database table.
 * 
 */
@Entity
@NamedQuery(name="Sensor.findAll", query="SELECT s FROM Sensor s")
public class Sensor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSensor;

	private String enfermedad;

	private String nombreSensor;

	private int rangoMax;

	private int rangoMin;

	//bi-directional many-to-one association to Alertasensor
	@OneToMany(mappedBy="sensor")
	private List<Alertasensor> alertasensors;

	//bi-directional many-to-one association to Registrosensor
	@OneToMany(mappedBy="sensor")
	private List<Registrosensor> registrosensors;

	//bi-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="idPaciente")
	private Paciente paciente;

	public Sensor() {
	}

	public int getIdSensor() {
		return this.idSensor;
	}

	public void setIdSensor(int idSensor) {
		this.idSensor = idSensor;
	}

	public String getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getNombreSensor() {
		return this.nombreSensor;
	}

	public void setNombreSensor(String nombreSensor) {
		this.nombreSensor = nombreSensor;
	}

	public int getRangoMax() {
		return this.rangoMax;
	}

	public void setRangoMax(int rangoMax) {
		this.rangoMax = rangoMax;
	}

	public int getRangoMin() {
		return this.rangoMin;
	}

	public void setRangoMin(int rangoMin) {
		this.rangoMin = rangoMin;
	}

	public List<Alertasensor> getAlertasensors() {
		return this.alertasensors;
	}

	public void setAlertasensors(List<Alertasensor> alertasensors) {
		this.alertasensors = alertasensors;
	}

	public Alertasensor addAlertasensor(Alertasensor alertasensor) {
		getAlertasensors().add(alertasensor);
		alertasensor.setSensor(this);

		return alertasensor;
	}

	public Alertasensor removeAlertasensor(Alertasensor alertasensor) {
		getAlertasensors().remove(alertasensor);
		alertasensor.setSensor(null);

		return alertasensor;
	}

	public List<Registrosensor> getRegistrosensors() {
		return this.registrosensors;
	}

	public void setRegistrosensors(List<Registrosensor> registrosensors) {
		this.registrosensors = registrosensors;
	}

	public Registrosensor addRegistrosensor(Registrosensor registrosensor) {
		getRegistrosensors().add(registrosensor);
		registrosensor.setSensor(this);

		return registrosensor;
	}

	public Registrosensor removeRegistrosensor(Registrosensor registrosensor) {
		getRegistrosensors().remove(registrosensor);
		registrosensor.setSensor(null);

		return registrosensor;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}