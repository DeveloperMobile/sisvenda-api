package com.developermobile.sisvenda_api.service;

import com.developermobile.sisvenda_api.dto.ClientDTO;
import com.developermobile.sisvenda_api.dto.ClientMinDTO;
import com.developermobile.sisvenda_api.entities.Client;
import com.developermobile.sisvenda_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClientRepository repository;

    public List<ClientMinDTO> findAll() {
        return repository.findAll().stream().map(ClientMinDTO::new).toList();
    }

    public ClientDTO findById(Long id) {
        return repository.findById(id).map(ClientDTO::new).get();
    }

    public Client insert(Client client) {
        return repository.save(client);
    }
}
