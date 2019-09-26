package pe.upc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVehiculo;
	private String PlacaVehiculo;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente Cliente;

	@ManyToOne
	@JoinColumn(name = "idTipoVehiculo", nullable = false)
	private TipoVehiculo TipoVehiculo;

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getPlacaVehiculo() {
		return PlacaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		PlacaVehiculo = placaVehiculo;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public TipoVehiculo getTipoVehiculo() {
		return TipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}
}
