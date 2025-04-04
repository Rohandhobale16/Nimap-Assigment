package com.ecommerce.app.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private double price;
    private Long categoryId;

    
}
