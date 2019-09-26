package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ListaNegra")
public class ListaNegra {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idListaNegra;
	private String MotivoListaNegra;
	
	@ManyToOne
	@JoinColumn(name = "idVehiculo", nullable = false)
	private Vehiculo Vehiculo;
	
	@ManyToOne
	@JoinColumn(name = "idPlayaEstacionamiento", nullable = false)
	private PlayaEstacionamiento PlayaEstacionamiento;

	public int getIdListaNegra() {
		return idListaNegra;
	}

	public void setIdListaNegra(int idListaNegra) {
		this.idListaNegra = idListaNegra;
	}

	public String getMotivoListaNegra() {
		return MotivoListaNegra;
	}

	public void setMotivoListaNegra(String motivoListaNegra) {
		MotivoListaNegra = motivoListaNegra;
	}

	public Vehiculo getVehiculo() {
		return Vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		Vehiculo = vehiculo;
	}

	public PlayaEstacionamiento getPlayaEstacionamiento() {
		return PlayaEstacionamiento;
	}

	public void setPlayaEstacionamiento(PlayaEstacionamiento playaEstacionamiento) {
		PlayaEstacionamiento = playaEstacionamiento;
	}
	
	
}
