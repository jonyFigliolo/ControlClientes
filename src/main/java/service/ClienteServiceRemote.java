package service;

import domain.Cliente;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author JONATAN
 */
@Remote
public interface ClienteServiceRemote {
    public List<Cliente> listarClientes();
    public Cliente encontrarClientePorId(Cliente cliente);
    public Cliente encontrarClientePorNombre(Cliente cliente);
    public Cliente encontrarClientePorApellido(Cliente cliente);
    public Cliente encontrarClientePorTelefono(Cliente cliente);
    public Cliente encontrarClientePorEmail(Cliente cliente);
    public Cliente encontrarClientePorSaldo(Cliente cliente);
    public void agregarCliente(Cliente cliente);
    public void modificarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
    
    
}
