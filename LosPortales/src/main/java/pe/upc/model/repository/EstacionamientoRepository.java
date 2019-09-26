package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Estacionamiento;

@Named
public class EstacionamientoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public String insert(Estacionamiento estacionamiento) throws Exception {
		em.persist(estacionamiento);
		return estacionamiento.getIdEstacionamiento();
	}
	
	public String update(Estacionamiento estacionamiento) throws Exception {
		em.merge(estacionamiento);
		return estacionamiento.getIdEstacionamiento();
	}
	
	
	public void delete(Estacionamiento estacionamiento) throws Exception {
		em.remove(estacionamiento);
	}
	
	
	public List<Estacionamiento> findAll() throws Exception{
		List<Estacionamiento> Estacionamiento=new ArrayList<>();
		
		TypedQuery<Estacionamiento> query=em.createQuery("FROM Estacionamiento e",Estacionamiento.class);
		Estacionamiento=query.getResultList();
		
		return Estacionamiento;
	}
	
	
	public Optional<Estacionamiento> findById(String idEstacionamiento) throws Exception{
		Estacionamiento estacionamientoFound;
		
		TypedQuery<Estacionamiento> query=em.createQuery("FROM Estacionamiento e WHERE e.idEstacionamiento=?1",Estacionamiento.class);
		query.setParameter(1, idEstacionamiento);
		estacionamientoFound=query.getSingleResult();
		
		return Optional.of(estacionamientoFound);
	}
	
}

