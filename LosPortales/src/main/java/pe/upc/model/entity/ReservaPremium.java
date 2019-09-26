package pe.upc.model.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ReservaPremium")
public class ReservaPremium {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReservaPremium;
	private Date FechaIngreso;
	private Date FechaSalida;
	private double Monto;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente Cliente;

	@ManyToOne
	@JoinColumn(name = "idEstacionamiento", nullable = false)
	private Estacionamiento Estacionamiento;
	
	@ManyToOne
	@JoinColumn(name = "idTipoPago", nullable = false)
	private TipoPago TipoPago;

	public int getIdReservaPremium() {
		return idReservaPremium;
	}

	public void setIdReservaPremium(int idReservaPremium) {
		this.idReservaPremium = idReservaPremium;
	}

	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return FechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		FechaSalida = fechaSalida;
	}

	public double getMonto() {
		return Monto;
	}

	public void setMonto(double monto) {
		Monto = monto;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Estacionamiento getEstacionamiento() {
		return Estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		Estacionamiento = estacionamiento;
	}

	public TipoPago getTipoPago() {
		return TipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		TipoPago = tipoPago;
	}
	
	
}
