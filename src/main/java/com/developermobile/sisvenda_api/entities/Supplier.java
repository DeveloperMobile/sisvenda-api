package com.developermobile.sisvenda_api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_supplier")
public class Supplier extends People implements Serializable {
    @JsonIgnore
    @OneToMany(mappedBy = "supplier")
    private List<Product> products = new ArrayList<>();

    public Supplier() { }

    public Supplier(Long id, String name, String address, String neighborhood, String city, String fu, String zipcode, String phone, String email) {
        super(id, name, address, neighborhood, city, fu, zipcode, phone, email);
    }

    @OneToMany(mappedBy = "supplier")
    public List<Product> getProducts() {
        return products;
    }
}
