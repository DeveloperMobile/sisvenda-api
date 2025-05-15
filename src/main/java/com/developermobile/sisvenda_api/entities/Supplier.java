package com.developermobile.sisvenda_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "tb_supplier")
public class Supplier extends People implements Serializable {
    public Supplier() { }

    public Supplier(Long id, String name, String address, String neighborhood, String city, String fu, String zipcode, String phone, String email) {
        super(id, name, address, neighborhood, city, fu, zipcode, phone, email);
    }
}
