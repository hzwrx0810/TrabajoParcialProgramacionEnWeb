package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PlayaEstacionamiento")
public class PlayaEstacionamiento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPlayaEstacionamiento;
	private String NombrePlayaEstacionamiento;
	private String DireccionPlayaEstacionamiento;
	private String DistritoPlayaEstacionamiento;
	
	public int getIdPlayaEstacionamiento() {
		return idPlayaEstacionamiento;
	}
	public void setIdPlayaEstacionamiento(int idPlayaEstacionamiento) {
		this.idPlayaEstacionamiento = idPlayaEstacionamiento;
	}
	public String getNombrePlayaEstacionamiento() {
		return NombrePlayaEstacionamiento;
	}
	public void setNombrePlayaEstacionamiento(String nombrePlayaEstacionamiento) {
		NombrePlayaEstacionamiento = nombrePlayaEstacionamiento;
	}
	public String getDireccionPlayaEstacionamiento() {
		return DireccionPlayaEstacionamiento;
	}
	public void setDireccionPlayaEstacionamiento(String direccionPlayaEstacionamiento) {
		DireccionPlayaEstacionamiento = direccionPlayaEstacionamiento;
	}
	public String getDistritoPlayaEstacionamiento() {
		return DistritoPlayaEstacionamiento;
	}
	public void setDistritoPlayaEstacionamiento(String distritoPlayaEstacionamiento) {
		DistritoPlayaEstacionamiento = distritoPlayaEstacionamiento;
	}
}
