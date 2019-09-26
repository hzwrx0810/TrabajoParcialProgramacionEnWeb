package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.ReservaPremium;

@Named
public class ReservaPremiumRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(ReservaPremium reservaPremium) throws Exception {
		em.persist(reservaPremium);
		return reservaPremium.getIdReservaPremium();
	}
	
	
	public int update(ReservaPremium reservaPremium) throws Exception {
		em.merge(reservaPremium);
		return reservaPremium.getIdReservaPremium();
	}
	
	
	public void delete(ReservaPremium reservaPremium) throws Exception {
		em.remove(reservaPremium);
	}
	
	
	public List<ReservaPremium> findAll() throws Exception{
		List<ReservaPremium> ReservaPremium=new ArrayList<>();
		
		TypedQuery<ReservaPremium> query=em.createQuery("FROM ReservaPremium rp",ReservaPremium.class);
		ReservaPremium=query.getResultList();
		
		return ReservaPremium;
	}
	
	
	public Optional<ReservaPremium> findById(int idReservaPremium) throws Exception{
		ReservaPremium reservaPremiumFound;
		
		TypedQuery<ReservaPremium> query=em.createQuery("FROM ReservaPremium trp WHERE rp.idReservaPremium=?1",ReservaPremium.class);
		query.setParameter(1, idReservaPremium);
		reservaPremiumFound=query.getSingleResult();
		
		return Optional.of(reservaPremiumFound);
	}
}

