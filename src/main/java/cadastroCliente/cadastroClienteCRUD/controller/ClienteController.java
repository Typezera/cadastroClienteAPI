package cadastroCliente.cadastroClienteCRUD.controller;

import cadastroCliente.cadastroClienteCRUD.dto.ClienteRequestDTO;
import cadastroCliente.cadastroClienteCRUD.dto.ClienteResponseDTO;
import cadastroCliente.cadastroClienteCRUD.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ClienteResponseDTO encontrarUsuario(@PathVariable long id){
        return clienteService.buscarCliente(id);
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> criar(@RequestBody ClienteRequestDTO resquisicaoCliente){
        var cliente = clienteService.cadastrarCliente(resquisicaoCliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> atualizarCliente(
            @PathVariable Long id,
            @RequestBody ClienteRequestDTO requisicaoCliente){
        var cliente = clienteService.atualizarCliente(id, requisicaoCliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable long id){
        clienteService.removerCliente(id);
        return ResponseEntity.noContent().build();
    }

}
