package com.joy_a_bloom.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Variant {
    private String sku;
    private String weight;
    private int tier;
    private double price;
    private Double oldPrice;
    private int stockQuantity;
    private boolean isAvailable;
}
