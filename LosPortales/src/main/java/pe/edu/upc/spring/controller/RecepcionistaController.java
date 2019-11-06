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
@Table(name="Cliente")

public class Recepcionista implements Serializable {
	
private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCliente;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "nombreCliente", length=60, nullable=false)
	private String NombreCliente;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "apellidoCliente", length=60, nullable=false)
	private String ApellidoCliente;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "esPremium", length=60, nullable=false)
	private boolean EsPremium;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "dniCliente", length=60, nullable=false)
	private int DNI;

	public Cliente() 
	{
		super();
	}
	
	public Cliente(int idCliente, String nombreCliente, String apellidoCliente, boolean esPremium, int dNI) {
		super();
		this.idCliente = idCliente;
		NombreCliente = nombreCliente;
		ApellidoCliente = apellidoCliente;
		EsPremium = esPremium;
		DNI = dNI;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return ApellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		ApellidoCliente = apellidoCliente;
	}

	public boolean isEsPremium() {
		return EsPremium;
	}

	public void setEsPremium(boolean esPremium) {
		EsPremium = esPremium;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}
}