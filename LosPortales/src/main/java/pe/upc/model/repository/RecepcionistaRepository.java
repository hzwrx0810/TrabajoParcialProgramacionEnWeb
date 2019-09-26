package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Recepcionista;

@Named
public class RecepcionistaRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(Recepcionista recepcionista) throws Exception {
		em.persist(recepcionista);
		return recepcionista.getIdRecepcionista();
	}
	
	
	public int update(Recepcionista recepcionista) throws Exception {
		em.merge(recepcionista);
		return recepcionista.getIdRecepcionista();
	}
	
	
	public void delete(Recepcionista recepcionista) throws Exception {
		em.remove(recepcionista);
	}
	
	
	public List<Recepcionista> findAll() throws Exception{
		List<Recepcionista> Recepcionista=new ArrayList<>();
		
		TypedQuery<Recepcionista> query=em.createQuery("FROM Recepcionista r",Recepcionista.class);
		Recepcionista=query.getResultList();
		
		return Recepcionista;
	}
	
	
	public Optional<Recepcionista> findById(int idRecepcionista) throws Exception{
		Recepcionista recepcionistaFound;
		
		TypedQuery<Recepcionista> query=em.createQuery("FROM Recepcionista r WHERE r.idRecepcionista=?1",Recepcionista.class);
		query.setParameter(1, idRecepcionista);
		recepcionistaFound=query.getSingleResult();
		
		return Optional.of(recepcionistaFound);
	}
}

