package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCliente;
	private String NombreCliente;
	private String ApellidoCliente;
	private Boolean EsPremium;
	private int DNI;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombreCliente(String NombreCliente) {
		this.NombreCliente = NombreCliente;
	}

	public String getApellidoCliente() {
		return ApellidoCliente;
	}

	public void setApellidoCliente(String ApellidoCliente) {
		this.ApellidoCliente = ApellidoCliente;
	}
	
	public String getEsPremium() {
		return EsPremium;
	}

	public void setEsPremium(String esPremium) {
		EsPremium = esPremium;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}
}
