package com.joy_a_bloom.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Variant {
    private String weight;
    private int tier;
    private double price;
    private Double oldPrice;
    private Double discount;
    private String sku;
}
