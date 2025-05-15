package com.developermobile.sisvenda_api.resource;

import com.developermobile.sisvenda_api.entities.Client;
import com.developermobile.sisvenda_api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> clienteList = service.findAll();
        return ResponseEntity.ok().body(clienteList);
    }
}
