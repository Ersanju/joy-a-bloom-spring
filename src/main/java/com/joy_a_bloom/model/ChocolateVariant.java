package com.joy_a_bloom.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChocolateVariant {
    private String sku;
    private double weightInGrams;
    private int quantity;
    private boolean isSugarFree;
    private double price;
    private Double oldPrice;
    private int stockQuantity;
    private boolean isAvailable;
}
