package com.developermobile.sisvenda_api.service;

import com.developermobile.sisvenda_api.entities.Cliente;
import com.developermobile.sisvenda_api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }
}
