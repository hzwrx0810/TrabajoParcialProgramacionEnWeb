package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Ticket;

@Named
public class TicketRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(Ticket ticket) throws Exception {
		em.persist(ticket);
		return ticket.getIdTicket();
	}
	
	
	public int update(Ticket ticket) throws Exception {
		em.merge(ticket);
		return ticket.getIdTicket();
	}
	
	
	public void delete(Ticket ticket) throws Exception {
		em.remove(ticket);
	}
	
	
	public List<Ticket> findAll() throws Exception{
		List<Ticket> Ticket=new ArrayList<>();
		
		TypedQuery<Ticket> query=em.createQuery("FROM Ticket t",Ticket.class);
		Ticket=query.getResultList();
		
		return Ticket;
	}
	
	
	public Optional<Ticket> findById(int idTicket) throws Exception{
		Ticket ticketFound;
		
		TypedQuery<Ticket> query=em.createQuery("FROM Ticket t WHERE t.idTicket=?1",Ticket.class);
		query.setParameter(1, idTicket);
		ticketFound=query.getSingleResult();
		
		return Optional.of(ticketFound);
	}
}

