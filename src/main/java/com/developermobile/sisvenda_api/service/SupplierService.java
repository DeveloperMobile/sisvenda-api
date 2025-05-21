package com.developermobile.sisvenda_api.service;

import com.developermobile.sisvenda_api.dto.SupplierDTO;
import com.developermobile.sisvenda_api.dto.SupplierMinDTO;
import com.developermobile.sisvenda_api.entities.Supplier;
import com.developermobile.sisvenda_api.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository repository;

    @Transactional(readOnly = true)
    public List<SupplierMinDTO> findAll() {
        return repository.findAll().stream().map(SupplierMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public SupplierDTO findById(Long id) {
        return repository.findById(id).map(SupplierDTO::new).get();
    }

    @Transactional
    public Supplier insert(Supplier supplier) {
        return repository.save(supplier);
    }
}
