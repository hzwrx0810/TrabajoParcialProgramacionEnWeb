package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.TipoVehiculo;

@Named
public class TipoVehiculoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(TipoVehiculo tipoVehiculo) throws Exception {
		em.persist(tipoVehiculo);
		return tipoVehiculo.getIdTipoVehiculo();
	}
	
	
	public int update(TipoVehiculo tipoVehiculo) throws Exception {
		em.merge(tipoVehiculo);
		return tipoVehiculo.getIdTipoVehiculo();
	}
	
	
	public void delete(TipoVehiculo tipoVehiculo) throws Exception {
		em.remove(tipoVehiculo);
	}
	
	
	public List<TipoVehiculo> findAll() throws Exception{
		List<TipoVehiculo> TipoVehiculo=new ArrayList<>();
		
		TypedQuery<TipoVehiculo> query=em.createQuery("FROM TipoVehiculo tv",TipoVehiculo.class);
		TipoVehiculo=query.getResultList();
		
		return TipoVehiculo;
	}
}

