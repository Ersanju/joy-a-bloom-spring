package com.joy_a_bloom.model;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CakeAttribute {
    private List<Variant> variants;
    private boolean isEgglessAvailable;
}
