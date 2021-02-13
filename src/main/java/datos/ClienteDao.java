package datos;

import domain.Cliente;
import java.util.List;

/**
 *
 * @author JONATAN
 */
public interface ClienteDao {
    public List<Cliente> findAllCliente();
    public Cliente findClienteById(Cliente cliente);
    public Cliente findClienteByNombre(Cliente cliente);
    public Cliente findClienteByApellido(Cliente cliente);
    public Cliente findClienteByTelefono(Cliente cliente);
    public Cliente findClienteByEmail(Cliente cliente);
    public Cliente findClienteBySaldo(Cliente cliente);
    public void insertCliente(Cliente cliente);
    public void updateCliente(Cliente cliente);
    public void deleteCliente(Cliente cliente);
    
    
}
