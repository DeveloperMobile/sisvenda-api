package com.developermobile.sisvenda_api.service;

import com.developermobile.sisvenda_api.entities.Product;
import com.developermobile.sisvenda_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }
}
