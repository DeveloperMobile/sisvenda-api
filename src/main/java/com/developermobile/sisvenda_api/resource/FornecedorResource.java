package com.developermobile.sisvenda_api.resource;

import com.developermobile.sisvenda_api.entities.Fornecedor;
import com.developermobile.sisvenda_api.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {
    @Autowired
    private FornecedorService service;

    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAll() {
        List<Fornecedor> fornecedorList = service.findAll();
        return ResponseEntity.ok().body(fornecedorList);
    }
}
