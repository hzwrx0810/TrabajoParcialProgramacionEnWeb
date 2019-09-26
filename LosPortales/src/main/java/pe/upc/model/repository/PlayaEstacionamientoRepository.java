package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.PlayaEstacionamiento;

@Named
public class PlayaEstacionamientoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(PlayaEstacionamiento playaEstacionamiento) throws Exception {
		em.persist(playaEstacionamiento);
		return playaEstacionamiento.getIdPlayaEstacionamiento();
	}
	
	
	public int update(PlayaEstacionamiento playaEstacionamiento) throws Exception {
		em.merge(playaEstacionamiento);
		return playaEstacionamiento.getIdPlayaEstacionamiento();
	}
	
	
	public void delete(PlayaEstacionamiento playaEstacionamiento) throws Exception {
		em.remove(playaEstacionamiento);
	}
	
	
	public List<PlayaEstacionamiento> findAll() throws Exception{
		List<PlayaEstacionamiento> PlayaEstacionamiento=new ArrayList<>();
		
		TypedQuery<PlayaEstacionamiento> query=em.createQuery("FROM PlayaEstacionamiento pe",PlayaEstacionamiento.class);
		PlayaEstacionamiento=query.getResultList();
		
		return PlayaEstacionamiento;
	}
}

