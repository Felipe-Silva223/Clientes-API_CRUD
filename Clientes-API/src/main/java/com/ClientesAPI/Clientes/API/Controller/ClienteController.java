package com.ClientesAPI.Clientes.API.Controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ClientesAPI.Clientes.API.Model.ClienteModel;
import com.ClientesAPI.Clientes.API.Repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<ClienteModel> createCliente(@RequestBody ClienteModel cliente) {
        ClienteModel savedCliente = clienteRepository.save(cliente);
        return ResponseEntity.ok(savedCliente);
    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>> getAllClientes() {
        List<ClienteModel> clientes = clienteRepository.findAll();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
public ResponseEntity<ClienteModel> getClienteById(@PathVariable UUID id) {
    Optional<ClienteModel> optionalCliente = clienteRepository.findById(id);
    if (!optionalCliente.isPresent()) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(optionalCliente.get());
}




    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> updateCliente(@PathVariable UUID id, @RequestBody ClienteModel clienteDetails) {
        Optional<ClienteModel> optionalCliente = clienteRepository.findById(id);
        if (!optionalCliente.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        
        ClienteModel cliente = optionalCliente.get();
        cliente.setName(clienteDetails.getName());
        cliente.setCpf(clienteDetails.getCpf());
        cliente.setCep(clienteDetails.getCep());
        cliente.setEndereco(clienteDetails.getEndereco());

        ClienteModel updatedCliente = clienteRepository.save(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable UUID id) {
        Optional<ClienteModel> optionalCliente = clienteRepository.findById(id);
        if (!optionalCliente.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        clienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
