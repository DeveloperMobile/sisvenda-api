package com.developermobile.sisvenda_api.repository;

import com.developermobile.sisvenda_api.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
