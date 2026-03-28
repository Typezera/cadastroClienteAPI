package cadastroCliente.cadastroClienteCRUD.controller;

import cadastroCliente.cadastroClienteCRUD.dto.ClienteRequestDTO;
import cadastroCliente.cadastroClienteCRUD.dto.ClienteResponseDTO;
import cadastroCliente.cadastroClienteCRUD.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteResponseDTO criar(@RequestBody ClienteRequestDTO dto){
        return clienteService.cadastrarCliente(dto);
    }
}
