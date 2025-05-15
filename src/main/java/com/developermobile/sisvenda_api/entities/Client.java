package com.developermobile.sisvenda_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends People implements Serializable {
    public Cliente() { }

    public Cliente(Long id, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email) {
        super(id, nome, endereco, bairro, cidade, uf, cep, telefone, email);
    }
}
