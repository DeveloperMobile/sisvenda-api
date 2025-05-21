package com.developermobile.sisvenda_api.dto;

import com.developermobile.sisvenda_api.entities.Supplier;

public class SupplierMinDTO {
    private Long id;
    private String name;
    private String phone;
    private String email;

    public SupplierMinDTO() { }

    public SupplierMinDTO(Supplier supplier) {
        id = supplier.getId();
        name = supplier.getName();
        phone = supplier.getPhone();
        email = supplier.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
