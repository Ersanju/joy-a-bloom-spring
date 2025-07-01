package com.joy_a_bloom.model;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChocolateAttribute {
    private String brand;
    private List<ChocolateVariant> variants;
}
