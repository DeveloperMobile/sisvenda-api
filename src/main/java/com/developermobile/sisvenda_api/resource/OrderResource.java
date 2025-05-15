package com.developermobile.sisvenda_api.resource;

import com.developermobile.sisvenda_api.entities.Order;
import com.developermobile.sisvenda_api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> orderList = service.findAll();
        return ResponseEntity.ok().body(orderList);
    }
}
