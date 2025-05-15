package com.developermobile.sisvenda_api.repository;

import com.developermobile.sisvenda_api.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
