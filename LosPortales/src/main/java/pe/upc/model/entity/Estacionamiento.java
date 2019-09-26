package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Estacionamiento")
public class Estacionamiento {

	@Id
	private String idEstacionamiento;
	private int NumeroEstacionamiento;
	private String EstadoEstacionamiento;
	
	@ManyToOne
	@JoinColumn(name = "idPlayaEstacionamiento", nullable = false)
	private PlayaEstacionamiento PlayaEstacionamiento;

	@ManyToOne
	@JoinColumn(name = "idTipoEstacionamiento", nullable = false)
	private TipoEstacionamiento TipoEstacionamiento;

	public String getIdEstacionamiento() {
		return idEstacionamiento;
	}

	public void setIdEstacionamiento(String idEstacionamiento) {
		this.idEstacionamiento = idEstacionamiento;
	}

	public int getNumeroEstacionamiento() {
		return NumeroEstacionamiento;
	}

	public void setNumeroEstacionamiento(int numeroEstacionamiento) {
		NumeroEstacionamiento = numeroEstacionamiento;
	}

	public String getEstadoEstacionamiento() {
		return EstadoEstacionamiento;
	}

	public void setEstadoEstacionamiento(String estadoEstacionamiento) {
		EstadoEstacionamiento = estadoEstacionamiento;
	}

	public PlayaEstacionamiento getPlayaEstacionamiento() {
		return PlayaEstacionamiento;
	}

	public void setPlayaEstacionamiento(PlayaEstacionamiento playaEstacionamiento) {
		PlayaEstacionamiento = playaEstacionamiento;
	}

	public TipoEstacionamiento getTipoEstacionamiento() {
		return TipoEstacionamiento;
	}

	public void setTipoEstacionamiento(TipoEstacionamiento tipoEstacionamiento) {
		TipoEstacionamiento = tipoEstacionamiento;
	}
}
