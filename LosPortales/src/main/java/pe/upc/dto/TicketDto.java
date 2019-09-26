package pe.upc.dto;

import java.util.List;

import pe.upc.model.entity.Ticket;
import pe.upc.model.entity.Cliente;
import pe.upc.model.entity.Estacionamiento;
import pe.upc.model.entity.Recepcionista;

public class TicketDto 
{
	private Ticket ticket;
	private List<Cliente> cliente;
	private List<Estacionamiento> estacionamiento;
	private List<Recepcionista> recepcionista;

	public Ticket getTicket() 
	{
		return ticket;
	}

	public void setTicket(Ticket ticket) 
	{
		this.ticket = ticket;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Estacionamiento> getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(List<Estacionamiento> estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public List<Recepcionista> getRecepcionista() {
		return recepcionista;
	}

	public void setRecepcionista(List<Recepcionista> recepcionista) {
		this.recepcionista = recepcionista;
	}
	
}