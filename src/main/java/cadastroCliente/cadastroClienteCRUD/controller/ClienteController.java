package cadastroCliente.cadastroClienteCRUD.controller;

import cadastroCliente.cadastroClienteCRUD.dto.ClienteRequestDTO;
import cadastroCliente.cadastroClienteCRUD.dto.ClienteResponseDTO;
import cadastroCliente.cadastroClienteCRUD.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteResponseDTO> exibirClientes(){
        return clienteService.mostrarCliente();
    }

    @GetMapping("/{id}")
    public ClienteResponseDTO encontrarUsuario(@PathVariable Long id){
        return clienteService.buscarCliente(id);
    }

    @PostMapping
    public ClienteResponseDTO criar(@RequestBody ClienteRequestDTO resquisicaoCliente){
        return clienteService.cadastrarCliente(resquisicaoCliente);
    }

    @PutMapping("/{id}")
    public ClienteResponseDTO atualizarCliente(
            @PathVariable Long id,
            @RequestBody ClienteRequestDTO requisicaoCliente){
        return clienteService.atualizarCliente(id, requisicaoCliente);
    }
}
