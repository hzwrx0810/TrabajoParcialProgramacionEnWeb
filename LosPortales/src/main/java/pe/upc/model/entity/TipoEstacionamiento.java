package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoEstacionamiento")
public class TipoEstacionamiento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoEstacionamiento;
	private String NombreTipoEstacionamiento;
	private String DescripcionTipoEstacionamiento;

	public int getIdTipoEstacionamiento() {
		return idTipoEstacionamiento;
	}

	public void setIdTipoEstacionamiento(int idTipoEstacionamiento) {
		this.idTipoEstacionamiento = idTipoEstacionamiento;
	}

	public String getNombreTipoEstacionamiento() {
		return NombreTipoEstacionamiento;
	}

	public void setNombreTipoEstacionamiento(String NombreTipoEstacionamiento) {
		this.NombreTipoEstacionamiento = NombreTipoEstacionamiento;
	}

	public String getDescripcionTipoEstacionamiento() {
		return DescripcionTipoEstacionamiento;
	}

	public void setDescripcionTipoEstacionamiento(String DescripcionTipoEstacionamiento) {
		this.DescripcionTipoEstacionamiento = DescripcionTipoEstacionamiento;
	}
}
