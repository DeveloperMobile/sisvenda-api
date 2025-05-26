package com.developermobile.sisvenda_api.services;

import com.developermobile.sisvenda_api.dto.ProductDTO;
import com.developermobile.sisvenda_api.dto.ProductMinDTO;
import com.developermobile.sisvenda_api.entities.Product;
import com.developermobile.sisvenda_api.repository.ProductRepository;
import com.developermobile.sisvenda_api.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
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
}
