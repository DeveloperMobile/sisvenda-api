package com.developermobile.sisvenda_api.repository;

import com.developermobile.sisvenda_api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
