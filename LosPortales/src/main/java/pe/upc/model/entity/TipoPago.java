
package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoPago")
public class TipoPago {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoPago;
	private String NombreTipoPago;
	
	public int getIdTipoPago() {
		return idTipoPago;
	}
	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}
	public String getNombreTipoPago() {
		return NombreTipoPago;
	}
	public void setNombreTipoPago(String nombreTipoPago) {
		NombreTipoPago = nombreTipoPago;
	}
	
}
