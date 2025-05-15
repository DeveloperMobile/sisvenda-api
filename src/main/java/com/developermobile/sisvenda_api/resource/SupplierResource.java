package com.developermobile.sisvenda_api.resource;

import com.developermobile.sisvenda_api.entities.Supplier;
import com.developermobile.sisvenda_api.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/suppliers")
public class SupplierResource {
    @Autowired
    private SupplierService service;

    @GetMapping
    public ResponseEntity<List<Supplier>> findAll() {
        List<Supplier> fornecedorList = service.findAll();
        return ResponseEntity.ok().body(fornecedorList);
    }
}
