package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.ListaNegra;

@Named
public class ListaNegraRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(ListaNegra listaNegra) throws Exception {
		em.persist(listaNegra);
		return listaNegra.getIdListaNegra();
	}
	
	
	public int update(ListaNegra listaNegra) throws Exception {
		em.merge(listaNegra);
		return listaNegra.getIdListaNegra();
	}
	
	
	public void delete(ListaNegra listaNegra) throws Exception {
		em.remove(listaNegra);
	}
	
	
	public List<ListaNegra> findAll() throws Exception{
		List<ListaNegra> ListaNegra=new ArrayList<>();
		
		TypedQuery<ListaNegra> query=em.createQuery("FROM ListaNegra ln",ListaNegra.class);
		ListaNegra=query.getResultList();
		
		return ListaNegra;
	}
	
	
	public Optional<ListaNegra> findById(int idListaNegra) throws Exception{
		ListaNegra listaNegraFound;
		
		TypedQuery<ListaNegra> query=em.createQuery("FROM ListaNegra ln WHERE ln.idListaNegra=?1",ListaNegra.class);
		query.setParameter(1, idListaNegra);
		listaNegraFound=query.getSingleResult();
		
		return Optional.of(listaNegraFound);
	}
}

