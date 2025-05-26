package com.developermobile.sisvenda_api.dto;

import com.developermobile.sisvenda_api.entities.Product;
import com.developermobile.sisvenda_api.entities.Supplier;

public class ProductDTO {
    private Long id;
    private String name;
    private Integer stock;
    private Double price;
    private Supplier supplier;

    public ProductDTO() { }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        stock = product.getStock();
        price = product.getPrice();
        supplier = product.getSupplier();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
