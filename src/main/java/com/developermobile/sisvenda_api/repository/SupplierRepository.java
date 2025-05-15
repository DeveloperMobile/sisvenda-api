package com.developermobile.sisvenda_api.repository;

import com.developermobile.sisvenda_api.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Supplier, Long> {
}
