package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Vehiculo;

@Named
public class VehiculoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(Vehiculo vehiculo) throws Exception {
		em.persist(vehiculo);
		return vehiculo.getIdVehiculo();
	}
	
	
	public int update(Vehiculo vehiculo) throws Exception {
		em.merge(vehiculo);
		return vehiculo.getIdVehiculo();
	}
	
	
	public void delete(Vehiculo vehiculo) throws Exception {
		em.remove(vehiculo);
	}
	
	
	public List<Vehiculo> findAll() throws Exception{
		List<Vehiculo> Vehiculo=new ArrayList<>();
		
		TypedQuery<Vehiculo> query=em.createQuery("FROM Vehiculo v",Vehiculo.class);
		Vehiculo=query.getResultList();
		
		return Vehiculo;
	}
	
	
	public Optional<Vehiculo> findById(int idVehiculo) throws Exception{
		Vehiculo vehiculoFound;
		
		TypedQuery<Vehiculo> query=em.createQuery("FROM Vehiculo v WHERE v.idVehiculo=?1",Vehiculo.class);
		query.setParameter(1, idVehiculo);
		vehiculoFound=query.getSingleResult();
		
		return Optional.of(vehiculoFound);
	}
	
}

