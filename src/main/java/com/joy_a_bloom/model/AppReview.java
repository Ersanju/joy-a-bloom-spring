package com.joy_a_bloom.model;

import lombok.Data;
import java.util.Date;

@Data
public class AppReview {
    private String id;
    private String userName;
    private String city;
    private String message;
    private double rating;
    private Date createdAt;
}
