package datos;

import domain.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JONATAN
 */
@Stateless
public class ClienteDaoImpl implements ClienteDao {
    @PersistenceContext(unitName="Cc")
    EntityManager em;

    @Override
    public List<Cliente> findAllCliente() {
        return em.createNamedQuery("Cliente.findAll").getResultList();
    }

    @Override
    public Cliente findClienteById(Cliente cliente) {
        return em.find(Cliente.class,cliente.getIdCliente());
    }

    @Override
    public Cliente findClienteByNombre(Cliente cliente) {
        return em.find(Cliente.class,cliente.getNombre());
    }

    @Override
    public Cliente findClienteByApellido(Cliente cliente) {
        return em.find(Cliente.class,cliente.getApellido());
    }

    @Override
    public Cliente findClienteByTelefono(Cliente cliente) {
        return em.find(Cliente.class,cliente.getTelefono());
    }

    @Override
    public Cliente findClienteByEmail(Cliente cliente) {
        return em.find(Cliente.class,cliente.getEmail());
    }

    @Override
    public Cliente findClienteBySaldo(Cliente cliente) {
        return em.find(Cliente.class,cliente.getSaldo());
    }

    @Override
    public void insertCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        em.remove(em.merge(cliente));
    }
    
    
}
