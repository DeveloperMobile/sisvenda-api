package com.developermobile.sisvenda_api.services;

import com.developermobile.sisvenda_api.dto.ProductDTO;
import com.developermobile.sisvenda_api.dto.ProductMinDTO;
import com.developermobile.sisvenda_api.entities.Client;
import com.developermobile.sisvenda_api.entities.Product;
import com.developermobile.sisvenda_api.repository.ProductRepository;
import com.developermobile.sisvenda_api.resources.exceptions.DatabaseException;
import com.developermobile.sisvenda_api.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductMinDTO> findAll() {
        return repository.findAll().stream().map(ProductMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        return repository.findById(id).map(ProductDTO::new).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @Transactional
    public Product insert(Product product) {
        return repository.save(product);
    }

    public void delete(Long id) {
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            } else {
                throw new ResourceNotFoundException(id);
            }
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public Product update(Long id, Product product) {
        try {
            Product entity = repository.getReferenceById(id);
            updateData(entity, product);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(Product entity, Product obj) {
        entity.setName(obj.getName());
        entity.setStock(obj.getStock());
        entity.setPrice(obj.getPrice());
        entity.setSupplier(obj.getSupplier());
    }
}
