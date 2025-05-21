package com.developermobile.sisvenda_api.dto;

import com.developermobile.sisvenda_api.entities.Client;

public class ClientMinDTO {
    private Long id;
    private String name;
    private String phone;
    private String email;

    public ClientMinDTO() { }

    public ClientMinDTO(Client client) {
        id = client.getId();
        name = client.getName();
        phone = client.getPhone();
        email = client.getEmail();
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
