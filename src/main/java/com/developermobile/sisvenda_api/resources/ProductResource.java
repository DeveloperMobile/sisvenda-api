package com.developermobile.sisvenda_api.resources;

import com.developermobile.sisvenda_api.dto.ProductDTO;
import com.developermobile.sisvenda_api.dto.ProductMinDTO;
import com.developermobile.sisvenda_api.entities.Client;
import com.developermobile.sisvenda_api.entities.Product;
import com.developermobile.sisvenda_api.services.ProductService;
import com.developermobile.sisvenda_api.utils.URIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductMinDTO>> findAll() {
        List<ProductMinDTO> productList = service.findAll();
        return ResponseEntity.ok().body(productList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Product> insert(@RequestBody Product product) {
        product = service.insert(product);
        return ResponseEntity.created(URIUtils.getUri(product.getId())).body(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product product) {
        product = service.update(id, product);
        return ResponseEntity.ok().body(product);
    }
}
