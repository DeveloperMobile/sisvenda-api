package com.developermobile.sisvenda_api.services;

import com.developermobile.sisvenda_api.dto.SupplierDTO;
import com.developermobile.sisvenda_api.dto.SupplierMinDTO;
import com.developermobile.sisvenda_api.entities.Supplier;
import com.developermobile.sisvenda_api.repository.SupplierRepository;
import com.developermobile.sisvenda_api.resources.exceptions.ResourceExceptionHandler;
import com.developermobile.sisvenda_api.services.exceptions.ResourceNotFoundException;
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
        return repository.findById(id).map(SupplierDTO::new).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Supplier insert(Supplier supplier) {
        return repository.save(supplier);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Supplier update(Long id, Supplier supplier) {
        Supplier entity = repository.getReferenceById(id);
        updateData(entity, supplier);
        return repository.save(entity);
    }

    private void updateData(Supplier entity, Supplier obj) {
        entity.setName(obj.getName());
        entity.setAddress(obj.getAddress());
        entity.setNeighborhood(obj.getNeighborhood());
        entity.setCity(obj.getCity());
        entity.setFu(obj.getFu());
        entity.setZipcode(obj.getZipcode());
        entity.setPhone(obj.getPhone());
        entity.setEmail(obj.getEmail());
    }
}
