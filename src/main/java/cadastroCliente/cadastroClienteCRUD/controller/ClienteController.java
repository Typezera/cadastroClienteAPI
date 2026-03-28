package cadastroCliente.cadastroClienteCRUD.controller;

import cadastroCliente.cadastroClienteCRUD.dto.ClienteRequestDTO;
import cadastroCliente.cadastroClienteCRUD.dto.ClienteResponseDTO;
import cadastroCliente.cadastroClienteCRUD.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public ClienteResponseDTO encontrarUsuario(@PathVariable long id){
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable long id){
        clienteService.removerCliente(id);
        return ResponseEntity.noContent().build();
    }

}
