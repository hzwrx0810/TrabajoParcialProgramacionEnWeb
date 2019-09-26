package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Cliente;

@Named
public class ClienteRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	public int insert(Cliente cliente) throws Exception {
		em.persist(cliente);
		return cliente.getIdCliente();
	}
	
	
	public int update(Cliente cliente) throws Exception {
		em.merge(cliente);
		return cliente.getIdCliente();
	}
	
	
	public void delete(Cliente cliente) throws Exception {
		em.remove(cliente);
	}
	
	
	public List<Cliente> findAll() throws Exception{
		List<Cliente> Cliente=new ArrayList<>();
		
		TypedQuery<Cliente> query=em.createQuery("FROM Cliente c",Cliente.class);
		Cliente=query.getResultList();
		
		return Cliente;
	}
	
	
	public Optional<Cliente> findById(int idCliente) throws Exception{
		Cliente clienteFound;
		
		TypedQuery<Cliente> query=em.createQuery("FROM Cliente c WHERE c.idCliente=?1",Cliente.class);
		query.setParameter(1, idCliente);
		clienteFound=query.getSingleResult();
		
		return Optional.of(clienteFound);
	}
}

