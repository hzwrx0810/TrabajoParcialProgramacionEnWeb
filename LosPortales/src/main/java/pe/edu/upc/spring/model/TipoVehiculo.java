package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="TipoVehiculo")

public class TipoVehiculo implements Serializable {
	
private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoVehiculo;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "nombreTipoVehiculo", length=60, nullable=false)
	private String NombreTipoVehiculo;

	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "caracteristicasTipoVehiculo", length=60, nullable=false)
	private String CaracteristicasTipoVehiculo;

	public TipoVehiculo() 
	{
		super();
	}
	
	public TipoVehiculo(int idTipoVehiculo, String nombreTipoVehiculo, String caracteristicasTipoVehiculo) {
		super();
		this.idTipoVehiculo = idTipoVehiculo;
		NombreTipoVehiculo = nombreTipoVehiculo;
		CaracteristicasTipoVehiculo = caracteristicasTipoVehiculo;
	}

	public int getIdTipoVehiculo() {
		return idTipoVehiculo;
	}

	public void setIdTipoVehiculo(int idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}

	public String getNombreTipoVehiculo() {
		return NombreTipoVehiculo;
	}

	public void setNombreTipoVehiculo(String nombreTipoVehiculo) {
		NombreTipoVehiculo = nombreTipoVehiculo;
	}

	public String getCaracteristicasTipoVehiculo() {
		return CaracteristicasTipoVehiculo;
	}

	public void setCaracteristicasTipoVehiculo(String caracteristicasTipoVehiculo) {
		CaracteristicasTipoVehiculo = caracteristicasTipoVehiculo;
	}
	
	
}