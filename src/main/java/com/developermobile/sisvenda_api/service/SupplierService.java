package com.developermobile.sisvenda_api.service;

import com.developermobile.sisvenda_api.entities.Supplier;
import com.developermobile.sisvenda_api.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {
    @Autowired
    private SupplierRepository repository;

    public List<Supplier> findAll() {
        return repository.findAll();
    }
}
