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
@Table(name="Recepcionista")

public class Recepcionista implements Serializable {
	
private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRecepcionista;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "nombreRecepcionista", length=60, nullable=false)
	private String NombreRecepcionista;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "apellidoRecepcionista", length=60, nullable=false)
	private String ApellidoRecepcionista;
	
	@NotEmpty(message="No puede estar vacio")
	@NotBlank(message="No puede estar en blanco")
	@Column(name = "dniRecepcionista", length=60, nullable=false)
	private int DNI;

	public Recepcionista() 
	{
		super();
	}
	
	public Recepcionista(int idRecepcionista, String nombreRecepcionista, String apellidoRecepcionista, int dNI) {
		super();
		this.idRecepcionista = idRecepcionista;
		NombreRecepcionista = nombreRecepcionista;
		ApellidoRecepcionista = apellidoRecepcionista;
		DNI = dNI;
	}

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