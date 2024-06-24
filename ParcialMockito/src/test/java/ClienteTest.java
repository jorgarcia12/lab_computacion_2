import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ClienteTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteService clienteService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGuardarCliente() {

        Cliente cliente = new Cliente("Jorge", "Garcia", "2615904243", "jorge@gmail.com", LocalDate.of(2003, 4, 2), Rol.CLIENTE);
        when(clienteRepository.save(cliente)).thenReturn(cliente);

        Cliente clienteGuardado = clienteService.guardarCliente(cliente);

        assertThat(clienteGuardado.getNombre()).isEqualTo("Jorge");
        assertThat(clienteGuardado.getApellido()).isEqualTo("Garcia");
        assertThat(clienteGuardado.getTelefono()).isEqualTo("2615904243");
        assertThat(clienteGuardado.getEmail()).isEqualTo("jorge@gmail.com");
        assertThat(clienteGuardado.getFechaNacimiento()).isEqualTo(LocalDate.of(2003, 4, 2));
        assertThat(clienteGuardado.getRol()).isEqualTo(Rol.CLIENTE);

        verify(clienteRepository).save(cliente);
    }

    @Test
    void testGetClienteById(){
        Cliente cliente = new Cliente("Jorge", "Garcia", "2615904243", "jorge@gmail.com", LocalDate.of(2003, 4, 2), Rol.CLIENTE);
        when(clienteRepository.findById(1L)).thenReturn(Optional.of(cliente));

        Cliente clienteRetorno = clienteService.GetClienteById(1L);

        assertThat(clienteRetorno).isNotNull();
        assertThat(clienteRetorno.getNombre()).isEqualTo("Jorge");
        assertThat(clienteRetorno.getApellido()).isEqualTo("Garcia");
        assertThat(clienteRetorno.getTelefono()).isEqualTo("2615904243");
        assertThat(clienteRetorno.getEmail()).isEqualTo("jorge@gmail.com");
        assertThat(clienteRetorno.getFechaNacimiento()).isEqualTo(LocalDate.of(2003, 4, 2));
        assertThat(clienteRetorno.getRol()).isEqualTo(Rol.CLIENTE);

        verify(clienteRepository).findById(1L);
    }

    @Test
    void testListarTodosClientes(){
        Cliente cliente = new Cliente("Jorge", "Garcia", "2615904243", "jorge@gmail.com", LocalDate.of(2003, 4, 2), Rol.CLIENTE);
        Cliente cliente1 = new Cliente("Matias", "Games","261876590","matias@gmail.com",LocalDate.of(2002,3,21),Rol.CLIENTE);
        Cliente cliente2 = new Cliente("Santiago", "Bazan","261765435","santiago@gmail.com",LocalDate.of(2002,7,21),Rol.CLIENTE);
        when(clienteRepository.findAll()).thenReturn(Arrays.asList(cliente,cliente1,cliente2));

        List<Cliente> clientes = clienteService.listarTodosClientes();

        assertThat(clientes).hasSize(3);
        assertThat(clientes).extracting(Cliente::getNombre).contains("Jorge","Matias","Santiago");

        verify(clienteRepository).findAll();
    }

    @Test
    void testEliminarCliente(){
        clienteService.eliminarCliente(1L);

        verify(clienteRepository).deleteById(1L);
    }

    @Test
    void testGuardarClienteLanzaExcepcion(){

        Cliente cliente = new Cliente("Jorge", "Garcia", "2615904243", "jorge@gmail.com", LocalDate.of(2003, 4, 2), Rol.CLIENTE);
        when(clienteRepository.save(cliente)).thenThrow(new RuntimeException("No se puede guardar el cliente"));

        try {
            clienteService.guardarCliente(cliente);
        }catch (RuntimeException e){
            assertThat(e.getMessage()).isEqualTo("No se puede guardar el cliente");
        }

        verify(clienteRepository).save(cliente);


    }
}