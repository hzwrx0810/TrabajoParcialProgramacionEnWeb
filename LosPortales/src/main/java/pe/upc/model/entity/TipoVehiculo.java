package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoVehiculo")
public class TipoVehiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoVehiculo;
	private String NombreVehiculo;
	private String CaracteristicasTipoVehiculo;

	public int getIdTipoVehiculo() {
		return idTipoVehiculo;
	}

	public void setIdTipoVehiculo(int idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}

	public String getNombreVehiculo() {
		return NombreVehiculo;
	}

	public void setNombreVehiculo(String NombreVehiculo) {
		this.NombreVehiculo = NombreVehiculo;
	}

	public String getCaracteristicasTipoVehiculo() {
		return CaracteristicasTipoVehiculo;
	}

	public void setCaracteristicasTipoVehiculo(String CaracteristicasTipoVehiculo) {
		this.CaracteristicasTipoVehiculo = CaracteristicasTipoVehiculo;
	}
}
