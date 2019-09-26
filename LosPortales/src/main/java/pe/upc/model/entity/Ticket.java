package pe.upc.model.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTicket;
	private Date HoraIngreso;
	private Date HoraSalida;
	
	@ManyToOne
	@JoinColumn(name = "idVehiculo", nullable = false)
	private Vehiculo Vehiculo;

	@ManyToOne
	@JoinColumn(name = "idEstacionamiento", nullable = false)
	private Estacionamiento Estacionamiento;
	
	@ManyToOne
	@JoinColumn(name = "idRecepcionista", nullable = false)
	private Recepcionista Recepcionista;

	@PrePersist
	public void init() 
	{
		HoraIngreso=new Date();
	}
	
	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public Date getHoraIngreso() {
		return HoraIngreso;
	}

	public void setHoraIngreso(Date horaIngreso) {
		HoraIngreso = horaIngreso;
	}

	public Date getHoraSalida() {
		return HoraSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		HoraSalida = horaSalida;
	}

	public Vehiculo getVehiculo() {
		return Vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		Vehiculo = vehiculo;
	}

	public Estacionamiento getEstacionamiento() {
		return Estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		Estacionamiento = estacionamiento;
	}

	public Recepcionista getRecepcionista() {
		return Recepcionista;
	}

	public void setRecepcionista(Recepcionista recepcionista) {
		Recepcionista = recepcionista;
	}
}
