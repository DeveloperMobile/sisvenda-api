package com.developermobile.sisvenda_api.service;

import com.developermobile.sisvenda_api.entities.Fornecedor;
import com.developermobile.sisvenda_api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository repository;

    public List<Fornecedor> findAll() {
        return repository.findAll();
    }
}
