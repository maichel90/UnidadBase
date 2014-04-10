package co.themafia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the registrosensor database table.
 * 
 */
@Entity
@NamedQuery(name="Registrosensor.findAll", query="SELECT r FROM Registrosensor r")
public class Registrosensor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRegistroSensor;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int valor;

	//bi-directional many-to-one association to Sensor
	@ManyToOne
	@JoinColumn(name="idSensor")
	private Sensor sensor;

	public Registrosensor() {
	}

	public int getIdRegistroSensor() {
		return this.idRegistroSensor;
	}

	public void setIdRegistroSensor(int idRegistroSensor) {
		this.idRegistroSensor = idRegistroSensor;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Sensor getSensor() {
		return this.sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

}