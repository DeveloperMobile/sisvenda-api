package com.developermobile.sisvenda_api.repository;

import com.developermobile.sisvenda_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
