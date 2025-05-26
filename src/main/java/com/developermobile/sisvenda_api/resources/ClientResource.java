package com.developermobile.sisvenda_api.resources;

import com.developermobile.sisvenda_api.dto.ClientDTO;
import com.developermobile.sisvenda_api.dto.ClientMinDTO;
import com.developermobile.sisvenda_api.entities.Client;
import com.developermobile.sisvenda_api.services.ClienteService;
import com.developermobile.sisvenda_api.utils.URIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<ClientMinDTO>> findAll() {
        List<ClientMinDTO> clienteList = service.findAll();
        return ResponseEntity.ok().body(clienteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Client> insert(@RequestBody Client client) {
        client = service.insert(client);
        return ResponseEntity.created(URIUtils.getUri(client.getId())).body(client);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client client) {
        client = service.update(id, client);
        return ResponseEntity.ok().body(client);
    }
}
