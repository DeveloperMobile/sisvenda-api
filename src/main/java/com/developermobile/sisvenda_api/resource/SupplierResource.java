package com.developermobile.sisvenda_api.resource;

import com.developermobile.sisvenda_api.dto.SupplierDTO;
import com.developermobile.sisvenda_api.dto.SupplierMinDTO;
import com.developermobile.sisvenda_api.entities.Supplier;
import com.developermobile.sisvenda_api.service.SupplierService;
import com.developermobile.sisvenda_api.utils.URIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/suppliers")
public class SupplierResource {
    @Autowired
    private SupplierService service;

    @GetMapping
    public ResponseEntity<List<SupplierMinDTO>> findAll() {
        List<SupplierMinDTO> fornecedorList = service.findAll();
        return ResponseEntity.ok().body(fornecedorList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierDTO> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Supplier> insert(@RequestBody Supplier supplier) {
        supplier = service.insert(supplier);
        return ResponseEntity.created(URIUtils.getUri(supplier.getId())).body(supplier);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Supplier> update(@PathVariable("id") Long id, @RequestBody Supplier supplier) {
        supplier = service.update(id, supplier);
        return ResponseEntity.ok().body(supplier);
    }
}
