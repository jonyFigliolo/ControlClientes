package service;

import datos.ClienteDao;
import domain.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author JONATAN
 */
@Stateless
public class ClienteServiceImpl implements ClienteService,ClienteServiceRemote {
    @Inject
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> listarClientes() {
        return clienteDao.findAllCliente();
    }

    @Override
    public Cliente encontrarClientePorId(Cliente cliente) {
        return clienteDao.findClienteById(cliente);
    }

    @Override
    public Cliente encontrarClientePorNombre(Cliente cliente) {
        return clienteDao.findClienteByNombre(cliente);
    }

    @Override
    public Cliente encontrarClientePorApellido(Cliente cliente) {
        return clienteDao.findClienteByApellido(cliente);
    }

    @Override
    public Cliente encontrarClientePorTelefono(Cliente cliente) {
        return clienteDao.findClienteByTelefono(cliente);
    }

    @Override
    public Cliente encontrarClientePorEmail(Cliente cliente) {
        return clienteDao.findClienteByEmail(cliente);
    }

    @Override
    public Cliente encontrarClientePorSaldo(Cliente cliente) {
        return clienteDao.findClienteBySaldo(cliente);
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        clienteDao.insertCliente(cliente);
    }

    @Override
    public void modificarCliente(Cliente cliente) {
       clienteDao.updateCliente(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteDao.deleteCliente(cliente);
    }
    
}
