package com.developermobile.sisvenda_api.repository;

import com.developermobile.sisvenda_api.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
