package com.joy_a_bloom.dto;

import com.joy_a_bloom.model.Review;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductReviewRequest {
    private String productId;
    private List<Review> reviews;
}
