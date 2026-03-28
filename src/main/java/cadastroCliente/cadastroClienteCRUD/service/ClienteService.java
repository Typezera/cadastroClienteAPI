package cadastroCliente.cadastroClienteCRUD.service;

import cadastroCliente.cadastroClienteCRUD.dto.ClienteRequestDTO;
import cadastroCliente.cadastroClienteCRUD.dto.ClienteResponseDTO;
import cadastroCliente.cadastroClienteCRUD.model.ClienteModel;
import cadastroCliente.cadastroClienteCRUD.repository.ClienteRepository;
import org.springframework.stereotype.Service;

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

}
