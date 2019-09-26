package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Recepcionista")
public class Recepcionista {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRecepcionista;
	private String NombreRecepcionista;
	private String ApellidoRecepcionista;
	private int DNI;
	
	public int getIdRecepcionista() {
		return idRecepcionista;
	}
	public void setIdRecepcionista(int idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}
	public String getNombreRecepcionista() {
		return NombreRecepcionista;
	}
	public void setNombreRecepcionista(String nombreRecepcionista) {
		NombreRecepcionista = nombreRecepcionista;
	}
	public String getApellidoRecepcionista() {
		return ApellidoRecepcionista;
	}
	public void setApellidoRecepcionista(String apellidoRecepcionista) {
		ApellidoRecepcionista = apellidoRecepcionista;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	
	
}
