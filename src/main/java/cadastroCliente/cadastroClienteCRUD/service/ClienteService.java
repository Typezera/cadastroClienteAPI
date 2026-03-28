package cadastroCliente.cadastroClienteCRUD.service;

import cadastroCliente.cadastroClienteCRUD.dto.ClienteRequestDTO;
import cadastroCliente.cadastroClienteCRUD.dto.ClienteResponseDTO;
import cadastroCliente.cadastroClienteCRUD.model.ClienteModel;
import cadastroCliente.cadastroClienteCRUD.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;

    }

    public ClienteResponseDTO cadastrarCliente(ClienteRequestDTO clienteDto){

        ClienteModel cliente = new ClienteModel();
        cliente.setNome(clienteDto.nome());
        cliente.setEmail(clienteDto.email());
        cliente.setSenha(clienteDto.senha());

        ClienteModel salvo = clienteRepository.save(cliente);

        return new ClienteResponseDTO(
                salvo.getId(),
                salvo.getNome(),
                salvo.getEmail()
        );
    }

    public List<ClienteResponseDTO> mostrarCliente(){

        var clientes = clienteRepository.findAll();

        return clientes.stream().map(cliente -> new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail()
        ))
                .toList();
    };

    public ClienteResponseDTO atualizarCliente(long id, ClienteRequestDTO updateCliente){
        return clienteRepository.findById(id)
                .map(cliente -> {
                    cliente.setNome(updateCliente.nome());
                    cliente.setEmail(updateCliente.email());
                    cliente.setSenha(updateCliente.senha());

                    var atualizado = clienteRepository.save(cliente);

                    return new ClienteResponseDTO(
                            atualizado.getId(),
                            atualizado.getNome(),
                            atualizado.getEmail()
                    );
                })
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

    }

}
