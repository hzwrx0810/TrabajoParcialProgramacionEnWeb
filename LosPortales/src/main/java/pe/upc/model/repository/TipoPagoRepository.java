package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.TipoPago;

@Named
public class TipoPagoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(TipoPago tipoPago) throws Exception {
		em.persist(tipoPago);
		return tipoPago.getIdTipoPago();
	}
	
	
	public int update(TipoPago tipoPago) throws Exception {
		em.merge(tipoPago);
		return tipoPago.getIdTipoPago();
	}
	
	
	public void delete(TipoPago tipoPago) throws Exception {
		em.remove(tipoPago);
	}
	
	
	public List<TipoPago> findAll() throws Exception{
		List<TipoPago> TipoPago=new ArrayList<>();
		
		TypedQuery<TipoPago> query=em.createQuery("FROM TipoPago tp",TipoPago.class);
		TipoPago=query.getResultList();
		
		return TipoPago;
	}
}

