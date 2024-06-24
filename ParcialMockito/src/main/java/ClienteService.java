import ch.qos.logback.core.net.server.Client;

import java.util.List;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente GetClienteById(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> listarTodosClientes(){
        return clienteRepository.findAll();
    }

    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
