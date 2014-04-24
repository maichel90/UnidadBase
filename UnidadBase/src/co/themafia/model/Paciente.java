package co.themafia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the paciente database table.
 * 
 */
@Entity
@NamedQuery(name="Paciente.findAll", query="SELECT p FROM Paciente p")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPaciente;

	private String apellido;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	private String horaSincronizacion;

	private String identificacion;

	private String nombre;

	//bi-directional many-to-one association to Medicamento
	@OneToMany(mappedBy="paciente")
	private List<Medicamento> medicamentos;

	//bi-directional many-to-one association to Sensor
	@OneToMany(mappedBy="paciente")
	private List<Sensor> sensors;

	public Paciente() {
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Medicamento> getMedicamentos() {
		return this.medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Medicamento addMedicamento(Medicamento medicamento) {
		getMedicamentos().add(medicamento);
		medicamento.setPaciente(this);

		return medicamento;
	}

	public Medicamento removeMedicamento(Medicamento medicamento) {
		getMedicamentos().remove(medicamento);
		medicamento.setPaciente(null);

		return medicamento;
	}

	public List<Sensor> getSensors() {
		return this.sensors;
	}

	public void setSensors(List<Sensor> sensors) {
		this.sensors = sensors;
	}

	public Sensor addSensor(Sensor sensor) {
		getSensors().add(sensor);
		sensor.setPaciente(this);

		return sensor;
	}

	public Sensor removeSensor(Sensor sensor) {
		getSensors().remove(sensor);
		sensor.setPaciente(null);

		return sensor;
	}

	public String getHoraSincronizacion() {
		return horaSincronizacion;
	}

	public void setHoraSincronizacion(String horaSincronizacion) {
		this.horaSincronizacion = horaSincronizacion;
	}
	

}