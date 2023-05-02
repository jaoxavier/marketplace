package io.github.jaoxavier.Marketplace.rest.controller;

import io.github.jaoxavier.Marketplace.domain.entity.Client;
import io.github.jaoxavier.Marketplace.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public Client create(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Integer id){
        return clientRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Client not found")
        );
    }

    @PatchMapping
    public Client editClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Integer id){
        clientRepository.deleteById(id);
    }
}
