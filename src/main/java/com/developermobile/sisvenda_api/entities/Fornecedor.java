package com.developermobile.sisvenda_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor extends Pessoa implements Serializable {
    public Fornecedor() { }

    public Fornecedor(Long id, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email) {
        super(id, nome, endereco, bairro, cidade, uf, cep, telefone, email);
    }
}
