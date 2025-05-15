package com.developermobile.sisvenda_api.service;

import com.developermobile.sisvenda_api.entities.Order;
import com.developermobile.sisvenda_api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
}
