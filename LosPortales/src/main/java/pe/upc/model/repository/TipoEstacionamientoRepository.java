package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.TipoEstacionamiento;

@Named
public class TipoEstacionamientoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(TipoEstacionamiento tipoEstacionamiento) throws Exception {
		em.persist(tipoEstacionamiento);
		return tipoEstacionamiento.getIdTipoEstacionamiento();
	}
	
	
	public int update(TipoEstacionamiento tipoEstacionamiento) throws Exception {
		em.merge(tipoEstacionamiento);
		return tipoEstacionamiento.getIdTipoEstacionamiento();
	}
	
	
	public void delete(TipoEstacionamiento tipoEstacionamiento) throws Exception {
		em.remove(tipoEstacionamiento);
	}
	
	
	public List<TipoEstacionamiento> findAll() throws Exception{
		List<TipoEstacionamiento> TipoEstacionamiento=new ArrayList<>();
		
		TypedQuery<TipoEstacionamiento> query=em.createQuery("FROM TipoEstacionamiento te",TipoEstacionamiento.class);
		TipoEstacionamiento=query.getResultList();
		
		return TipoEstacionamiento;
	}
}

