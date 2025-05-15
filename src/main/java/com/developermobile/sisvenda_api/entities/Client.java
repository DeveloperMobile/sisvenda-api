package com.developermobile.sisvenda_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "tb_client")
public class Client extends People implements Serializable {
    public Client() { }

    public Client(Long id, String name, String address, String neighborhood, String city, String fu, String zipcode, String phone, String email) {
        super(id, name, address, neighborhood, city, fu, zipcode, phone, email);
    }
}
